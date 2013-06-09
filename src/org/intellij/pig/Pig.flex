package org.intellij.pig;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import org.intellij.pig.psi.PigTypes;
import com.intellij.psi.TokenType;
import org.intellij.pig.psi.PigTypes;
import org.intellij.pig.psi.PigTokenType;

%%
%{
  public _PigLexer() {
    this((java.io.Reader)null);
  }
%}

%public
%class _PigLexer
%implements FlexLexer

%unicode
%caseless

%function advance
%type IElementType

%xstate FILENAME

/* main character classes */
DIGIT=[0-9]
OCTAL_DIGIT=[0-7]
HEX_DIGIT=[0-9A-Fa-f]
WHITE_SPACE_CHAR=[\ \n\r\t\f]

/* literals */
DECIMAL_INTEGER_LITERAL=(0|([1-9]({DIGIT})*))
HEX_INTEGER_LITERAL=0[Xx]({HEX_DIGIT})*
OCTAL_INTEGER_LITERAL=0({OCTAL_DIGIT})+
LONG_LITERAL=({INTEGER_LITERAL})[Ll]
INTEGER_LITERAL={DECIMAL_INTEGER_LITERAL}|{HEX_INTEGER_LITERAL}|{OCTAL_INTEGER_LITERAL}


FLOATING_POINT_LITERAL1=({DIGIT})+"."({DIGIT})*({EXPONENT_PART})?
FLOATING_POINT_LITERAL2="."({DIGIT})+({EXPONENT_PART})?
FLOATING_POINT_LITERAL3=({DIGIT})+({EXPONENT_PART})
FLOATING_POINT_LITERAL4=({DIGIT})+
EXPONENT_PART=[Ee]["+""-"]?({DIGIT})*

FLOAT_LITERAL=(({FLOATING_POINT_LITERAL1})[Ff])|(({FLOATING_POINT_LITERAL2})[Ff])|(({FLOATING_POINT_LITERAL3})[Ff])|(({FLOATING_POINT_LITERAL4})[Ff])
DOUBLE_LITERAL=(({FLOATING_POINT_LITERAL1})[Dd]?)|(({FLOATING_POINT_LITERAL2})[Dd]?)|(({FLOATING_POINT_LITERAL3})[Dd]?)|(({FLOATING_POINT_LITERAL4})[Dd])

EXEC_LITERAL="`"([^\\`\r\n]|{ESCAPE_SEQUENCE})*("`"|\\)?

DCOLON=::

/* identifiers */
ID = [:jletter:][:jletterdigit:]*
SCRIPT_PARAM_NAME = \$[:jletter:][:jletterdigit:]*

/* comments */
TRADITIONAL_COMMENT=("/*"[^"*"]{COMMENT_TAIL})|"/*"
DOC_COMMENT="/*""*"+("/"|([^"/""*"]{COMMENT_TAIL}))?
COMMENT_TAIL=([^"*"]*("*"+[^"*""/"])?)*("*"+"/")?
END_OF_LINE_COMMENT="-""-"[^\r\n]*

COMMENT = {TRADITIONAL_COMMENT} | {END_OF_LINE_COMMENT} |{DOC_COMMENT}

FILENAME=([:jletterdigit:]|["*"]|["/"]|[":"]|["."]|["$"])*

STRING_LITERAL=\'([^\\\'\r\n]|{ESCAPE_SEQUENCE})*(\'|\\)?
ESCAPE_SEQUENCE=\\[^\r\n]


%%


<YYINITIAL> {

  /* keywords */
  "asc"                    { yybegin(YYINITIAL);  return PigTypes.PIG_ASC; }
  "as"                     { yybegin(YYINITIAL);  return PigTypes.PIG_AS; }
  "bag"                    { yybegin(YYINITIAL);  return PigTypes.PIG_BAG; }
  "bytearray"              { yybegin(YYINITIAL);  return PigTypes.PIG_BYTEARRAY; }
  "by"                     { yybegin(YYINITIAL);  return PigTypes.PIG_BY; }
  "chararray"              { yybegin(YYINITIAL);  return PigTypes.PIG_CHARARRAY; }
  "cogroup"                { yybegin(YYINITIAL);  return PigTypes.PIG_COGROUP; }
  "cube"                   { yybegin(YYINITIAL);  return PigTypes.PIG_CUBE; }
  "double"                 { yybegin(YYINITIAL);  return PigTypes.PIG_DOUBLE; }
  "declare"                { yybegin(YYINITIAL);  return PigTypes.PIG_DECLARE; }
  "default"                { yybegin(YYINITIAL);  return PigTypes.PIG_DEFAULT; }
  "desc"                   { yybegin(YYINITIAL);  return PigTypes.PIG_DESC; }
  "dump"                   { yybegin(YYINITIAL);  return PigTypes.PIG_DUMP; }
  "datetime"               { yybegin(YYINITIAL);  return PigTypes.PIG_DATETIME; }
  "distinct"               { yybegin(YYINITIAL);  return PigTypes.PIG_DISTINCT; }
  "float"                  { yybegin(YYINITIAL);  return PigTypes.PIG_FLOAT; }
  "full"                   { yybegin(YYINITIAL);  return PigTypes.PIG_FULL; }
  "flatten"                { yybegin(YYINITIAL);  return PigTypes.PIG_FLATTEN; }
  "group"                  { yybegin(YYINITIAL);  return PigTypes.PIG_GROUP; }
  "int"                    { yybegin(YYINITIAL);  return PigTypes.PIG_INT; }
  "into"                   { yybegin(YYINITIAL);  return PigTypes.PIG_INTO; }
  "illustrate"             { yybegin(YYINITIAL);  return PigTypes.PIG_ILLUSTRATE; }
  "if"                     { yybegin(YYINITIAL);  return PigTypes.PIG_IF; }
  "is"                     { yybegin(YYINITIAL);  return PigTypes.PIG_IS; }
  "import"                 { yybegin(YYINITIAL);  return PigTypes.PIG_IMPORT; }
  "load"                   { yybegin(YYINITIAL);  return PigTypes.PIG_LOAD; }
  "limit"                  { yybegin(YYINITIAL);  return PigTypes.PIG_LIMIT; }
  "mapreduce"              { yybegin(YYINITIAL);  return PigTypes.PIG_MAPREDUCE; }
  "otherwise"              { yybegin(YYINITIAL);  return PigTypes.PIG_OTHERWISE; }
  "parallel"               { yybegin(YYINITIAL);  return PigTypes.PIG_PARALLEL; }
  "partition"              { yybegin(YYINITIAL);  return PigTypes.PIG_PARTITION; }
  "order"                  { yybegin(YYINITIAL);  return PigTypes.PIG_ORDER; }
  "onschema"               { yybegin(YYINITIAL);  return PigTypes.PIG_ONSCHEMA; }
  "register"               { yybegin(FILENAME);  return PigTypes.PIG_REGISTER; }
  "rank"                   { yybegin(YYINITIAL);  return PigTypes.PIG_RANK; }
  "returns"                { yybegin(YYINITIAL);  return PigTypes.PIG_RETURNS; }
  "rmf"                    { yybegin(FILENAME);  return PigTypes.PIG_RMF; }
  "rollup"                 { yybegin(YYINITIAL);  return PigTypes.PIG_ROLLUP; }
  "store"                  { yybegin(YYINITIAL);  return PigTypes.PIG_STORE; }
  "split"                  { yybegin(YYINITIAL);  return PigTypes.PIG_SPLIT; }
  "stream"                 { yybegin(YYINITIAL);  return PigTypes.PIG_STREAM; }
  "set"                    { yybegin(YYINITIAL);  return PigTypes.PIG_SET; }
  "long"                   { yybegin(YYINITIAL);  return PigTypes.PIG_LONG; }
  "map"                    { yybegin(YYINITIAL);  return PigTypes.PIG_MAP; }
  "tuple"                  { yybegin(YYINITIAL);  return PigTypes.PIG_TUPLE; }
  "union"                  { yybegin(YYINITIAL);  return PigTypes.PIG_UNION; }
  "using"                  { yybegin(YYINITIAL);  return PigTypes.PIG_USING; }
  "foreach"                { yybegin(YYINITIAL);  return PigTypes.PIG_FOREACH; }
  "generate"               { yybegin(YYINITIAL);  return PigTypes.PIG_GENERATE; }
  "define"                 { yybegin(YYINITIAL);  return PigTypes.PIG_DEFINE; }
  "filter"                 { yybegin(YYINITIAL);  return PigTypes.PIG_FILTER; }
  "through"                { yybegin(YYINITIAL);  return PigTypes.PIG_THROUGH; }
  "sample"                 { yybegin(YYINITIAL);  return PigTypes.PIG_SAMPLE; }

  /* operators */
  "=" { yybegin(YYINITIAL);  return PigTypes.PIG_EQUAL; }
  ":" { yybegin(YYINITIAL);  return PigTypes.PIG_COLON; }
  "," { yybegin(YYINITIAL);  return PigTypes.PIG_COMMA; }
  ";" { yybegin(YYINITIAL);  return PigTypes.PIG_SIMI; }
  "(" { yybegin(YYINITIAL);  return PigTypes.PIG_LP; }
  ")" { yybegin(YYINITIAL);  return PigTypes.PIG_RP; }
  "." { yybegin(YYINITIAL);  return PigTypes.PIG_DOT; }
  ".." { yybegin(YYINITIAL); return PigTypes.PIG_DOUBLE_DOT; }
  "[" { yybegin(YYINITIAL);  return PigTypes.PIG_LBRACKET; }
  "]" { yybegin(YYINITIAL);  return PigTypes.PIG_RBRACKET; }
  "{" { yybegin(YYINITIAL);  return PigTypes.PIG_LBRACE; }
  "}" { yybegin(YYINITIAL);  return PigTypes.PIG_RBRACE; }
  "?" { yybegin(YYINITIAL);  return PigTypes.PIG_QMARK; }
  "@" { yybegin(YYINITIAL);  return PigTypes.PIG_ARROBA; }
  "#" { yybegin(YYINITIAL);  return PigTypes.PIG_POUND; }
  "::" { yybegin(YYINITIAL);  return PigTypes.PIG_DCOLON; }


  "%" { yybegin(YYINITIAL);  return PigTypes.PIG_PERCENT; }
  "-" { yybegin(YYINITIAL);  return PigTypes.PIG_MINUS; }
  "+" { yybegin(YYINITIAL);  return PigTypes.PIG_PLUS; }
  "/" { yybegin(YYINITIAL);  return PigTypes.PIG_DIV; }
  "*" { yybegin(YYINITIAL);  return PigTypes.PIG_STAR; }

  "==" { yybegin(YYINITIAL); return PigTypes.PIG_EQEQ; }
  ">" { yybegin(YYINITIAL);  return PigTypes.PIG_GT; }
  ">=" { yybegin(YYINITIAL); return PigTypes.PIG_GTEQ; }
  "<" { yybegin(YYINITIAL);  return PigTypes.PIG_LT; }
  "<=" { yybegin(YYINITIAL); return PigTypes.PIG_LTEQ; }
  "!=" { yybegin(YYINITIAL); return PigTypes.PIG_NOTEQ; }

  // String operations
  "eq" { yybegin(YYINITIAL);       return PigTypes.PIG_STR_OP_EQ; }
  "ne" { yybegin(YYINITIAL);       return PigTypes.PIG_STR_OP_NE; }
  "gt" { yybegin(YYINITIAL);       return PigTypes.PIG_STR_OP_GT; }
  "gte" { yybegin(YYINITIAL);      return PigTypes.PIG_STR_OP_GTE; }
  "lt" { yybegin(YYINITIAL);       return PigTypes.PIG_STR_OP_LT; }
  "lte" { yybegin(YYINITIAL);      return PigTypes.PIG_STR_OP_LTE; }
  "matches" { yybegin(YYINITIAL);  return PigTypes.PIG_STR_OP_MATCHES; }

   // Join operators
  "and"   { yybegin(YYINITIAL);  return PigTypes.PIG_AND; }
  "not"   { yybegin(YYINITIAL);  return PigTypes.PIG_NOT; }
  "or"    { yybegin(YYINITIAL);  return PigTypes.PIG_OR; }
  "join"  { yybegin(YYINITIAL);  return PigTypes.PIG_JOIN; }
  "cross" { yybegin(YYINITIAL);  return PigTypes.PIG_CROSS; }
  "left"  { yybegin(YYINITIAL);  return PigTypes.PIG_LEFT; }
  "right" { yybegin(YYINITIAL);  return PigTypes.PIG_RIGHT; }
  "inner" { yybegin(YYINITIAL);  return PigTypes.PIG_INNER; }
  "outer" { yybegin(YYINITIAL);  return PigTypes.PIG_OUTER; }

// Scalars
  {INTEGER_LITERAL}      { yybegin(YYINITIAL);  return PigTypes.PIG_INTEGER_LITERAL; }
  {LONG_LITERAL}         { yybegin(YYINITIAL);  return PigTypes.PIG_LONG_LITERAL; }
  {FLOAT_LITERAL}        { yybegin(YYINITIAL);  return PigTypes.PIG_FLOAT_LITERAL; }
  {DOUBLE_LITERAL}       { yybegin(YYINITIAL);  return PigTypes.PIG_DOUBLE_LITERAL; }
  "null"                 { yybegin(YYINITIAL);  return PigTypes.PIG_NULL; }
  "true"                 { yybegin(YYINITIAL);  return PigTypes.PIG_TRUE; }
  "false"                { yybegin(YYINITIAL);  return PigTypes.PIG_FALSE; }
  {STRING_LITERAL}       { yybegin(YYINITIAL);  return PigTypes.PIG_QUOTEDSTRING; }
  {EXEC_LITERAL}         { yybegin(YYINITIAL);  return PigTypes.PIG_EXECCOMMAND; }

  /* comments */
//  // Comments
  {TRADITIONAL_COMMENT}  { return PigTypes.PIG_TRADITIONAL_COMMENT; }
  {DOC_COMMENT}          { return PigTypes.PIG_DOC_COMMENT; }
  {END_OF_LINE_COMMENT}  { return PigTypes.PIG_END_OF_LINE_COMMENT; }

  {WHITE_SPACE_CHAR}+    { return TokenType.WHITE_SPACE; }

  {ID}           { yybegin(YYINITIAL); return PigTypes.PIG_ID; }
  {SCRIPT_PARAM_NAME}           { yybegin(YYINITIAL); return PigTypes.PIG_SCRIPT_PARAM_NAME; }

  . { return TokenType.BAD_CHARACTER; }
}

// separate out filenames so they don't override comments and identifiers
<FILENAME> {
  {FILENAME} { yybegin(YYINITIAL);  return PigTypes.PIG_FILENAME; }
  {WHITE_SPACE_CHAR}+    { return TokenType.WHITE_SPACE; }
  . { return TokenType.BAD_CHARACTER; }
}
