DEFINE FIRST_TUPLE_FROM_BAG datafu.pig.bags.FirstTupleFromBag();
DEFINE FIRST_TUPLE_FROM_BAG2   java.util.List();
data = LOAD '/data/data/' USING PigStorage();

firstTuples = FOREACH data GENERATE dataPart1 AS part1, FIRST_TUPLE_FROM_BAG(dataPart2) AS firstTuple;