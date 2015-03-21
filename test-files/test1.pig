/**
 * Sample Pig Script
 */
set mapred.reduce.slowstart.completed.maps 0.999;
set job.name 'queue messages for sending';

%declare today `date "+%Y/%m/%d"`
%declare kernel `uname -s`
%declare todayseconds `bash -c 'if [[ "$kernel" == "Linux" ]]; then date -d $today "+%s"; else date -jf "%Y/%m/%d" $today "+%s"; fi'`
%default todayUTCDate `date \-\-utc "+%Y-%m-%d"`

/*
A job that computes things
*/

REGISTER @fatjar@;

inputData = LOAD '$input_data' USING BinaryJSON();

emailSchedule = load '$email_schedule/#LATEST' using LiAvroStorage();
todaysSchedule = filter emailSchedule by receiveUTCDate == '$todayUTCDate';

scheduledRecipients = filter todaysSchedule by campaign == '$email_key';

outputData = join scheduledRecipients by memberId, inputData by recipientID PARALLEL 50;


-- reorder input to match output schema then send to production with Kafka writer
-- also rename template_id to emailKey
reordered = FOREACH outputData GENERATE
	(long) $todayseconds * 1000 as expectedDeliveryDate:long,
	(int) recipientID as recipientID:int,
	-8 as gmtOffset:int,
	(int) 2 as categoryID:int,
	(int) 0 as priority:int,
	'$email_key' as emailKey:chararray,
	CONCAT('$email_key','$todayseconds') as contentID:chararray,
	body as body:chararray
;



STORE reordered INTO '$kafkahost' USING kafka.KafkaStorage('$kafkaschema');