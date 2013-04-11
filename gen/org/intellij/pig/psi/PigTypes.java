// This is a generated file. Not intended for manual editing.
package org.intellij.pig.psi;

import com.intellij.psi.tree.IElementType;
import com.intellij.psi.PsiElement;
import com.intellij.lang.ASTNode;
import org.intellij.pig.psi.impl.*;

public interface PigTypes {

  IElementType PIG_AFTER_LEFT_PAREN = new PigElementType("PIG_AFTER_LEFT_PAREN");
  IElementType PIG_AS_CLAUSE = new PigElementType("PIG_AS_CLAUSE");
  IElementType PIG_BRACKET_EXPR = new PigElementType("PIG_BRACKET_EXPR");
  IElementType PIG_CACHE_CLAUSE = new PigElementType("PIG_CACHE_CLAUSE");
  IElementType PIG_CAST_EXPR = new PigElementType("PIG_CAST_EXPR");
  IElementType PIG_CMD = new PigElementType("PIG_CMD");
  IElementType PIG_COL_RANGE = new PigElementType("PIG_COL_RANGE");
  IElementType PIG_COL_REF = new PigElementType("PIG_COL_REF");
  IElementType PIG_COL_REF_LIST = new PigElementType("PIG_COL_REF_LIST");
  IElementType PIG_COL_REF_WITHOUT_IDENTIFIER = new PigElementType("PIG_COL_REF_WITHOUT_IDENTIFIER");
  IElementType PIG_COND = new PigElementType("PIG_COND");
  IElementType PIG_CROSS_CLAUSE = new PigElementType("PIG_CROSS_CLAUSE");
  IElementType PIG_CUBE_CLAUSE = new PigElementType("PIG_CUBE_CLAUSE");
  IElementType PIG_CUBE_ROLLUP_LIST = new PigElementType("PIG_CUBE_ROLLUP_LIST");
  IElementType PIG_CURLY_EXPR = new PigElementType("PIG_CURLY_EXPR");
  IElementType PIG_DECLARE_STATEMENT = new PigElementType("PIG_DECLARE_STATEMENT");
  IElementType PIG_DEFAULT_STATEMENT = new PigElementType("PIG_DEFAULT_STATEMENT");
  IElementType PIG_DEFINE_CLAUSE = new PigElementType("PIG_DEFINE_CLAUSE");
  IElementType PIG_DISTINCT_CLAUSE = new PigElementType("PIG_DISTINCT_CLAUSE");
  IElementType PIG_EID = new PigElementType("PIG_EID");
  IElementType PIG_EID_WITHOUT_COLUMNS = new PigElementType("PIG_EID_WITHOUT_COLUMNS");
  IElementType PIG_ERROR_CLAUSE = new PigElementType("PIG_ERROR_CLAUSE");
  IElementType PIG_EXPLICIT_BAG_TYPE = new PigElementType("PIG_EXPLICIT_BAG_TYPE");
  IElementType PIG_EXPLICIT_BAG_TYPE_CAST = new PigElementType("PIG_EXPLICIT_BAG_TYPE_CAST");
  IElementType PIG_EXPLICIT_FIELD_DEF = new PigElementType("PIG_EXPLICIT_FIELD_DEF");
  IElementType PIG_EXPLICIT_MAP_TYPE = new PigElementType("PIG_EXPLICIT_MAP_TYPE");
  IElementType PIG_EXPLICIT_TYPE = new PigElementType("PIG_EXPLICIT_TYPE");
  IElementType PIG_EXPLICIT_TYPE_CAST = new PigElementType("PIG_EXPLICIT_TYPE_CAST");
  IElementType PIG_EXPR = new PigElementType("PIG_EXPR");
  IElementType PIG_FIELD_DEF = new PigElementType("PIG_FIELD_DEF");
  IElementType PIG_FIELD_DEF_LIST = new PigElementType("PIG_FIELD_DEF_LIST");
  IElementType PIG_FILTER_CLAUSE = new PigElementType("PIG_FILTER_CLAUSE");
  IElementType PIG_FLATTEN_CLAUSE = new PigElementType("PIG_FLATTEN_CLAUSE");
  IElementType PIG_FLATTEN_GENERATED_ITEM = new PigElementType("PIG_FLATTEN_GENERATED_ITEM");
  IElementType PIG_FOREACH_PLAN_COMPLEX = new PigElementType("PIG_FOREACH_PLAN_COMPLEX");
  IElementType PIG_FOREACH_PLAN_SIMPLE = new PigElementType("PIG_FOREACH_PLAN_SIMPLE");
  IElementType PIG_FOREACH_STATEMENT = new PigElementType("PIG_FOREACH_STATEMENT");
  IElementType PIG_FUNC_ARGS = new PigElementType("PIG_FUNC_ARGS");
  IElementType PIG_FUNC_ARGS_STRING = new PigElementType("PIG_FUNC_ARGS_STRING");
  IElementType PIG_FUNC_CLAUSE = new PigElementType("PIG_FUNC_CLAUSE");
  IElementType PIG_FUNC_NAME = new PigElementType("PIG_FUNC_NAME");
  IElementType PIG_FUNC_NAME_SUFFIX = new PigElementType("PIG_FUNC_NAME_SUFFIX");
  IElementType PIG_FUNC_NAME_WITHOUT_COLUMNS = new PigElementType("PIG_FUNC_NAME_WITHOUT_COLUMNS");
  IElementType PIG_GENERATE_AS_CLAUSE = new PigElementType("PIG_GENERATE_AS_CLAUSE");
  IElementType PIG_GROUP_CLAUSE = new PigElementType("PIG_GROUP_CLAUSE");
  IElementType PIG_GROUP_ITEM = new PigElementType("PIG_GROUP_ITEM");
  IElementType PIG_IDENTIFIER = new PigElementType("PIG_IDENTIFIER");
  IElementType PIG_ILLUSTRATE_CLAUSE = new PigElementType("PIG_ILLUSTRATE_CLAUSE");
  IElementType PIG_IMPLICIT_BAG_TYPE = new PigElementType("PIG_IMPLICIT_BAG_TYPE");
  IElementType PIG_IMPLICIT_MAP_TYPE = new PigElementType("PIG_IMPLICIT_MAP_TYPE");
  IElementType PIG_IMPLICIT_TYPE = new PigElementType("PIG_IMPLICIT_TYPE");
  IElementType PIG_IMPORT_CLAUSE = new PigElementType("PIG_IMPORT_CLAUSE");
  IElementType PIG_INPUT_CLAUSE = new PigElementType("PIG_INPUT_CLAUSE");
  IElementType PIG_JOIN_CLAUSE = new PigElementType("PIG_JOIN_CLAUSE");
  IElementType PIG_JOIN_GROUP_BY_CLAUSE = new PigElementType("PIG_JOIN_GROUP_BY_CLAUSE");
  IElementType PIG_JOIN_ITEM = new PigElementType("PIG_JOIN_ITEM");
  IElementType PIG_JOIN_SUB_CLAUSE = new PigElementType("PIG_JOIN_SUB_CLAUSE");
  IElementType PIG_JOIN_TYPE = new PigElementType("PIG_JOIN_TYPE");
  IElementType PIG_KEYVALUE = new PigElementType("PIG_KEYVALUE");
  IElementType PIG_LIMIT_CLAUSE = new PigElementType("PIG_LIMIT_CLAUSE");
  IElementType PIG_LITERAL = new PigElementType("PIG_LITERAL");
  IElementType PIG_LITERAL_BAG = new PigElementType("PIG_LITERAL_BAG");
  IElementType PIG_LITERAL_MAP = new PigElementType("PIG_LITERAL_MAP");
  IElementType PIG_LITERAL_TUPLE = new PigElementType("PIG_LITERAL_TUPLE");
  IElementType PIG_LOAD_CLAUSE = new PigElementType("PIG_LOAD_CLAUSE");
  IElementType PIG_MAP_TYPE = new PigElementType("PIG_MAP_TYPE");
  IElementType PIG_MR_CLAUSE = new PigElementType("PIG_MR_CLAUSE");
  IElementType PIG_MULTI_EXPR = new PigElementType("PIG_MULTI_EXPR");
  IElementType PIG_NESTED_BLK = new PigElementType("PIG_NESTED_BLK");
  IElementType PIG_NESTED_COMMAND = new PigElementType("PIG_NESTED_COMMAND");
  IElementType PIG_NESTED_CROSS = new PigElementType("PIG_NESTED_CROSS");
  IElementType PIG_NESTED_DISTINCT = new PigElementType("PIG_NESTED_DISTINCT");
  IElementType PIG_NESTED_FILTER = new PigElementType("PIG_NESTED_FILTER");
  IElementType PIG_NESTED_FOREACH = new PigElementType("PIG_NESTED_FOREACH");
  IElementType PIG_NESTED_LIMIT = new PigElementType("PIG_NESTED_LIMIT");
  IElementType PIG_NESTED_OP = new PigElementType("PIG_NESTED_OP");
  IElementType PIG_NESTED_OP_INPUT = new PigElementType("PIG_NESTED_OP_INPUT");
  IElementType PIG_NESTED_OP_INPUT_LIST = new PigElementType("PIG_NESTED_OP_INPUT_LIST");
  IElementType PIG_NESTED_PROJ = new PigElementType("PIG_NESTED_PROJ");
  IElementType PIG_NESTED_SORT = new PigElementType("PIG_NESTED_SORT");
  IElementType PIG_NOT_COND = new PigElementType("PIG_NOT_COND");
  IElementType PIG_OP_CLAUSE = new PigElementType("PIG_OP_CLAUSE");
  IElementType PIG_ORDER_BY_CLAUSE = new PigElementType("PIG_ORDER_BY_CLAUSE");
  IElementType PIG_ORDER_CLAUSE = new PigElementType("PIG_ORDER_CLAUSE");
  IElementType PIG_ORDER_COL = new PigElementType("PIG_ORDER_COL");
  IElementType PIG_ORDER_COL_LIST = new PigElementType("PIG_ORDER_COL_LIST");
  IElementType PIG_OUTPUT_CLAUSE = new PigElementType("PIG_OUTPUT_CLAUSE");
  IElementType PIG_PARALLEL_CLAUSE = new PigElementType("PIG_PARALLEL_CLAUSE");
  IElementType PIG_PAREN_EXPR = new PigElementType("PIG_PAREN_EXPR");
  IElementType PIG_PARTITION_CLAUSE = new PigElementType("PIG_PARTITION_CLAUSE");
  IElementType PIG_PATH_LIST = new PigElementType("PIG_PATH_LIST");
  IElementType PIG_PREVIOUS_REL = new PigElementType("PIG_PREVIOUS_REL");
  IElementType PIG_PROJECTION = new PigElementType("PIG_PROJECTION");
  IElementType PIG_RANK_BY_CLAUSE = new PigElementType("PIG_RANK_BY_CLAUSE");
  IElementType PIG_RANK_BY_STATEMENT = new PigElementType("PIG_RANK_BY_STATEMENT");
  IElementType PIG_RANK_CLAUSE = new PigElementType("PIG_RANK_CLAUSE");
  IElementType PIG_RANK_COL = new PigElementType("PIG_RANK_COL");
  IElementType PIG_RANK_LIST = new PigElementType("PIG_RANK_LIST");
  IElementType PIG_REALIAS_CLAUSE = new PigElementType("PIG_REALIAS_CLAUSE");
  IElementType PIG_REAL_ARG = new PigElementType("PIG_REAL_ARG");
  IElementType PIG_REGISTER_CLAUSE = new PigElementType("PIG_REGISTER_CLAUSE");
  IElementType PIG_REL = new PigElementType("PIG_REL");
  IElementType PIG_REL_LIST = new PigElementType("PIG_REL_LIST");
  IElementType PIG_REL_OP = new PigElementType("PIG_REL_OP");
  IElementType PIG_REL_STR_OP = new PigElementType("PIG_REL_STR_OP");
  IElementType PIG_SAMPLE_CLAUSE = new PigElementType("PIG_SAMPLE_CLAUSE");
  IElementType PIG_SCALAR = new PigElementType("PIG_SCALAR");
  IElementType PIG_SET_CLAUSE = new PigElementType("PIG_SET_CLAUSE");
  IElementType PIG_SHIP_CLAUSE = new PigElementType("PIG_SHIP_CLAUSE");
  IElementType PIG_SPLIT_BRANCH = new PigElementType("PIG_SPLIT_BRANCH");
  IElementType PIG_SPLIT_CLAUSE = new PigElementType("PIG_SPLIT_CLAUSE");
  IElementType PIG_SPLIT_OTHERWISE = new PigElementType("PIG_SPLIT_OTHERWISE");
  IElementType PIG_STATEMENT = new PigElementType("PIG_STATEMENT");
  IElementType PIG_STORE_CLAUSE = new PigElementType("PIG_STORE_CLAUSE");
  IElementType PIG_STREAM_CLAUSE = new PigElementType("PIG_STREAM_CLAUSE");
  IElementType PIG_STREAM_CMD = new PigElementType("PIG_STREAM_CMD");
  IElementType PIG_STREAM_CMD_LIST = new PigElementType("PIG_STREAM_CMD_LIST");
  IElementType PIG_TYPE = new PigElementType("PIG_TYPE");
  IElementType PIG_UNARY_COND = new PigElementType("PIG_UNARY_COND");
  IElementType PIG_UNION_CLAUSE = new PigElementType("PIG_UNION_CLAUSE");

  IElementType PIG_ALL = new PigTokenType("ALL");
  IElementType PIG_AND = new PigTokenType("AND");
  IElementType PIG_ANY = new PigTokenType("ANY");
  IElementType PIG_ARROBA = new PigTokenType("@");
  IElementType PIG_AS = new PigTokenType("AS");
  IElementType PIG_ASC = new PigTokenType("ASC");
  IElementType PIG_BAG = new PigTokenType("bag");
  IElementType PIG_BIGDECIMAL = new PigTokenType("BIGDECIMAL");
  IElementType PIG_BIGDECIMALNUMBER = new PigTokenType("BIGDECIMALNUMBER");
  IElementType PIG_BIGINTEGER = new PigTokenType("BIGINTEGER");
  IElementType PIG_BIGINTEGERNUMBER = new PigTokenType("BIGINTEGERNUMBER");
  IElementType PIG_BOOL = new PigTokenType("BOOL");
  IElementType PIG_BOOLEAN = new PigTokenType("BOOLEAN");
  IElementType PIG_BOOL_COND = new PigTokenType("BOOL_COND");
  IElementType PIG_BY = new PigTokenType("BY");
  IElementType PIG_BYTEARRAY = new PigTokenType("BYTEARRAY");
  IElementType PIG_CACHE = new PigTokenType("CACHE");
  IElementType PIG_CHARARRAY = new PigTokenType("CHARARRAY");
  IElementType PIG_COGROUP = new PigTokenType("COGROUP");
  IElementType PIG_COLON = new PigTokenType(":");
  IElementType PIG_COMMA = new PigTokenType(",");
  IElementType PIG_CROSS = new PigTokenType("CROSS");
  IElementType PIG_CUBE = new PigTokenType("CUBE");
  IElementType PIG_C_STYLE_COMMENT = new PigTokenType("C_STYLE_COMMENT");
  IElementType PIG_DATETIME = new PigTokenType("DATETIME");
  IElementType PIG_DCOLON = new PigTokenType("::");
  IElementType PIG_DECLARE = new PigTokenType("declare");
  IElementType PIG_DEFAULT = new PigTokenType("default");
  IElementType PIG_DEFINE = new PigTokenType("DEFINE");
  IElementType PIG_DENSE = new PigTokenType("DENSE");
  IElementType PIG_DESC = new PigTokenType("DESC");
  IElementType PIG_DISTINCT = new PigTokenType("DISTINCT");
  IElementType PIG_DIV = new PigTokenType("/");
  IElementType PIG_DOLLARVAR = new PigTokenType("$");
  IElementType PIG_DOT = new PigTokenType(".");
  IElementType PIG_DOUBLE = new PigTokenType("DOUBLE");
  IElementType PIG_DOUBLENUMBER = new PigTokenType("DOUBLENUMBER");
  IElementType PIG_DOUBLE_DOT = new PigTokenType("..");
  IElementType PIG_DOUBLE_LITERAL = new PigTokenType("DOUBLE_LITERAL");
  IElementType PIG_DUMP = new PigTokenType("DUMP");
  IElementType PIG_END_OF_LINE_COMMENT = new PigTokenType("END_OF_LINE_COMMENT");
  IElementType PIG_EQEQ = new PigTokenType("==");
  IElementType PIG_EQUAL = new PigTokenType("=");
  IElementType PIG_EXECCOMMAND = new PigTokenType("EXECCOMMAND");
  IElementType PIG_FALSE = new PigTokenType("FALSE");
  IElementType PIG_FILTER = new PigTokenType("FILTER");
  IElementType PIG_FLATTEN = new PigTokenType("FLATTEN");
  IElementType PIG_FLOAT = new PigTokenType("FLOAT");
  IElementType PIG_FLOAT_LITERAL = new PigTokenType("FLOAT_LITERAL");
  IElementType PIG_FOREACH = new PigTokenType("FOREACH");
  IElementType PIG_FULL = new PigTokenType("FULL");
  IElementType PIG_GENERATE = new PigTokenType("GENERATE");
  IElementType PIG_GROUP = new PigTokenType("GROUP");
  IElementType PIG_GT = new PigTokenType(">");
  IElementType PIG_GTEQ = new PigTokenType(">=");
  IElementType PIG_ID = new PigTokenType("ID");
  IElementType PIG_IF = new PigTokenType("IF");
  IElementType PIG_ILLUSTRATE = new PigTokenType("ILLUSTRATE");
  IElementType PIG_IMPORT = new PigTokenType("IMPORT");
  IElementType PIG_INNER = new PigTokenType("INNER");
  IElementType PIG_INPUT = new PigTokenType("input");
  IElementType PIG_INT = new PigTokenType("INT");
  IElementType PIG_INTEGER = new PigTokenType("INTEGER");
  IElementType PIG_INTEGER_LITERAL = new PigTokenType("INTEGER_LITERAL");
  IElementType PIG_INTO = new PigTokenType("INTO");
  IElementType PIG_IS = new PigTokenType("IS");
  IElementType PIG_JOIN = new PigTokenType("JOIN");
  IElementType PIG_LA = new PigTokenType("LA");
  IElementType PIG_LBRACE = new PigTokenType("{");
  IElementType PIG_LBRACKET = new PigTokenType("[");
  IElementType PIG_LEFT = new PigTokenType("LEFT");
  IElementType PIG_LIMIT = new PigTokenType("LIMIT");
  IElementType PIG_LOAD = new PigTokenType("LOAD");
  IElementType PIG_LONG = new PigTokenType("LONG");
  IElementType PIG_LONG_LITERAL = new PigTokenType("LONG_LITERAL");
  IElementType PIG_LP = new PigTokenType("(");
  IElementType PIG_LT = new PigTokenType("<");
  IElementType PIG_LTEQ = new PigTokenType("<=");
  IElementType PIG_MAP = new PigTokenType("map");
  IElementType PIG_MAPREDUCE = new PigTokenType("MAPREDUCE");
  IElementType PIG_MINUS = new PigTokenType("-");
  IElementType PIG_MULTILINE_QUOTEDSTRING = new PigTokenType("MULTILINE_QUOTEDSTRING");
  IElementType PIG_NOT = new PigTokenType("NOT");
  IElementType PIG_NOTEQ = new PigTokenType("!=");
  IElementType PIG_NULL = new PigTokenType("NULL");
  IElementType PIG_ONSCHEMA = new PigTokenType("ONSCHEMA");
  IElementType PIG_OR = new PigTokenType("OR");
  IElementType PIG_ORDER = new PigTokenType("ORDER");
  IElementType PIG_OTHERWISE = new PigTokenType("OTHERWISE");
  IElementType PIG_OUTER = new PigTokenType("OUTER");
  IElementType PIG_OUTPUT = new PigTokenType("OUTPUT");
  IElementType PIG_PARALLEL = new PigTokenType("PARALLEL");
  IElementType PIG_PARTITION = new PigTokenType("PARTITION");
  IElementType PIG_PERCENT = new PigTokenType("%");
  IElementType PIG_PLUS = new PigTokenType("+");
  IElementType PIG_POUND = new PigTokenType("#");
  IElementType PIG_QMARK = new PigTokenType("?");
  IElementType PIG_QUOTEDSTRING = new PigTokenType("QUOTEDSTRING");
  IElementType PIG_RANK = new PigTokenType("RANK");
  IElementType PIG_RBRACE = new PigTokenType("}");
  IElementType PIG_RBRACKET = new PigTokenType("]");
  IElementType PIG_REALIAS = new PigTokenType("REALIAS");
  IElementType PIG_REGISTER = new PigTokenType("REGISTER");
  IElementType PIG_RETURNS = new PigTokenType("RETURNS");
  IElementType PIG_RIGHT = new PigTokenType("RIGHT");
  IElementType PIG_ROLLUP = new PigTokenType("ROLLUP");
  IElementType PIG_RP = new PigTokenType(")");
  IElementType PIG_SAMPLE = new PigTokenType("SAMPLE");
  IElementType PIG_SCRIPT_PARAM_NAME = new PigTokenType("SCRIPT_PARAM_NAME");
  IElementType PIG_SET = new PigTokenType("SET");
  IElementType PIG_SHIP = new PigTokenType("SHIP");
  IElementType PIG_SIMI = new PigTokenType(";");
  IElementType PIG_SPLIT = new PigTokenType("SPLIT");
  IElementType PIG_STAR = new PigTokenType("*");
  IElementType PIG_STDERROR = new PigTokenType("STDERROR");
  IElementType PIG_STDIN = new PigTokenType("STDIN");
  IElementType PIG_STDOUT = new PigTokenType("STDOUT");
  IElementType PIG_STORE = new PigTokenType("STORE");
  IElementType PIG_STREAM = new PigTokenType("STREAM");
  IElementType PIG_STR_OP_EQ = new PigTokenType("eq");
  IElementType PIG_STR_OP_GT = new PigTokenType("gt");
  IElementType PIG_STR_OP_GTE = new PigTokenType("gte");
  IElementType PIG_STR_OP_LT = new PigTokenType("lt");
  IElementType PIG_STR_OP_LTE = new PigTokenType("lte");
  IElementType PIG_STR_OP_MATCHES = new PigTokenType("STR_OP_MATCHES");
  IElementType PIG_STR_OP_NE = new PigTokenType("ne");
  IElementType PIG_THROUGH = new PigTokenType("THROUGH");
  IElementType PIG_TRUE = new PigTokenType("TRUE");
  IElementType PIG_TUPLE = new PigTokenType("tuple");
  IElementType PIG_UNION = new PigTokenType("UNION");
  IElementType PIG_USING = new PigTokenType("USING");
  IElementType PIG_VOID = new PigTokenType("VOID");

  class Factory {
    public static PsiElement createElement(ASTNode node) {
      IElementType type = node.getElementType();
       if (type == PIG_AFTER_LEFT_PAREN) {
        return new PigAfterLeftParenImpl(node);
      }
      else if (type == PIG_AS_CLAUSE) {
        return new PigAsClauseImpl(node);
      }
      else if (type == PIG_BRACKET_EXPR) {
        return new PigBracketExprImpl(node);
      }
      else if (type == PIG_CACHE_CLAUSE) {
        return new PigCacheClauseImpl(node);
      }
      else if (type == PIG_CAST_EXPR) {
        return new PigCastExprImpl(node);
      }
      else if (type == PIG_CMD) {
        return new PigCmdImpl(node);
      }
      else if (type == PIG_COL_RANGE) {
        return new PigColRangeImpl(node);
      }
      else if (type == PIG_COL_REF) {
        return new PigColRefImpl(node);
      }
      else if (type == PIG_COL_REF_LIST) {
        return new PigColRefListImpl(node);
      }
      else if (type == PIG_COL_REF_WITHOUT_IDENTIFIER) {
        return new PigColRefWithoutIdentifierImpl(node);
      }
      else if (type == PIG_COND) {
        return new PigCondImpl(node);
      }
      else if (type == PIG_CROSS_CLAUSE) {
        return new PigCrossClauseImpl(node);
      }
      else if (type == PIG_CUBE_CLAUSE) {
        return new PigCubeClauseImpl(node);
      }
      else if (type == PIG_CUBE_ROLLUP_LIST) {
        return new PigCubeRollupListImpl(node);
      }
      else if (type == PIG_CURLY_EXPR) {
        return new PigCurlyExprImpl(node);
      }
      else if (type == PIG_DECLARE_STATEMENT) {
        return new PigDeclareStatementImpl(node);
      }
      else if (type == PIG_DEFAULT_STATEMENT) {
        return new PigDefaultStatementImpl(node);
      }
      else if (type == PIG_DEFINE_CLAUSE) {
        return new PigDefineClauseImpl(node);
      }
      else if (type == PIG_DISTINCT_CLAUSE) {
        return new PigDistinctClauseImpl(node);
      }
      else if (type == PIG_EID) {
        return new PigEidImpl(node);
      }
      else if (type == PIG_EID_WITHOUT_COLUMNS) {
        return new PigEidWithoutColumnsImpl(node);
      }
      else if (type == PIG_ERROR_CLAUSE) {
        return new PigErrorClauseImpl(node);
      }
      else if (type == PIG_EXPLICIT_BAG_TYPE) {
        return new PigExplicitBagTypeImpl(node);
      }
      else if (type == PIG_EXPLICIT_BAG_TYPE_CAST) {
        return new PigExplicitBagTypeCastImpl(node);
      }
      else if (type == PIG_EXPLICIT_FIELD_DEF) {
        return new PigExplicitFieldDefImpl(node);
      }
      else if (type == PIG_EXPLICIT_MAP_TYPE) {
        return new PigExplicitMapTypeImpl(node);
      }
      else if (type == PIG_EXPLICIT_TYPE) {
        return new PigExplicitTypeImpl(node);
      }
      else if (type == PIG_EXPLICIT_TYPE_CAST) {
        return new PigExplicitTypeCastImpl(node);
      }
      else if (type == PIG_EXPR) {
        return new PigExprImpl(node);
      }
      else if (type == PIG_FIELD_DEF) {
        return new PigFieldDefImpl(node);
      }
      else if (type == PIG_FIELD_DEF_LIST) {
        return new PigFieldDefListImpl(node);
      }
      else if (type == PIG_FILTER_CLAUSE) {
        return new PigFilterClauseImpl(node);
      }
      else if (type == PIG_FLATTEN_CLAUSE) {
        return new PigFlattenClauseImpl(node);
      }
      else if (type == PIG_FLATTEN_GENERATED_ITEM) {
        return new PigFlattenGeneratedItemImpl(node);
      }
      else if (type == PIG_FOREACH_PLAN_COMPLEX) {
        return new PigForeachPlanComplexImpl(node);
      }
      else if (type == PIG_FOREACH_PLAN_SIMPLE) {
        return new PigForeachPlanSimpleImpl(node);
      }
      else if (type == PIG_FOREACH_STATEMENT) {
        return new PigForeachStatementImpl(node);
      }
      else if (type == PIG_FUNC_ARGS) {
        return new PigFuncArgsImpl(node);
      }
      else if (type == PIG_FUNC_ARGS_STRING) {
        return new PigFuncArgsStringImpl(node);
      }
      else if (type == PIG_FUNC_CLAUSE) {
        return new PigFuncClauseImpl(node);
      }
      else if (type == PIG_FUNC_NAME) {
        return new PigFuncNameImpl(node);
      }
      else if (type == PIG_FUNC_NAME_SUFFIX) {
        return new PigFuncNameSuffixImpl(node);
      }
      else if (type == PIG_FUNC_NAME_WITHOUT_COLUMNS) {
        return new PigFuncNameWithoutColumnsImpl(node);
      }
      else if (type == PIG_GENERATE_AS_CLAUSE) {
        return new PigGenerateAsClauseImpl(node);
      }
      else if (type == PIG_GROUP_CLAUSE) {
        return new PigGroupClauseImpl(node);
      }
      else if (type == PIG_GROUP_ITEM) {
        return new PigGroupItemImpl(node);
      }
      else if (type == PIG_IDENTIFIER) {
        return new PigIDENTIFIERImpl(node);
      }
      else if (type == PIG_ILLUSTRATE_CLAUSE) {
        return new PigIllustrateClauseImpl(node);
      }
      else if (type == PIG_IMPLICIT_BAG_TYPE) {
        return new PigImplicitBagTypeImpl(node);
      }
      else if (type == PIG_IMPLICIT_MAP_TYPE) {
        return new PigImplicitMapTypeImpl(node);
      }
      else if (type == PIG_IMPLICIT_TYPE) {
        return new PigImplicitTypeImpl(node);
      }
      else if (type == PIG_IMPORT_CLAUSE) {
        return new PigImportClauseImpl(node);
      }
      else if (type == PIG_INPUT_CLAUSE) {
        return new PigInputClauseImpl(node);
      }
      else if (type == PIG_JOIN_CLAUSE) {
        return new PigJoinClauseImpl(node);
      }
      else if (type == PIG_JOIN_GROUP_BY_CLAUSE) {
        return new PigJoinGroupByClauseImpl(node);
      }
      else if (type == PIG_JOIN_ITEM) {
        return new PigJoinItemImpl(node);
      }
      else if (type == PIG_JOIN_SUB_CLAUSE) {
        return new PigJoinSubClauseImpl(node);
      }
      else if (type == PIG_JOIN_TYPE) {
        return new PigJoinTypeImpl(node);
      }
      else if (type == PIG_KEYVALUE) {
        return new PigKeyvalueImpl(node);
      }
      else if (type == PIG_LIMIT_CLAUSE) {
        return new PigLimitClauseImpl(node);
      }
      else if (type == PIG_LITERAL) {
        return new PigLiteralImpl(node);
      }
      else if (type == PIG_LITERAL_BAG) {
        return new PigLiteralBagImpl(node);
      }
      else if (type == PIG_LITERAL_MAP) {
        return new PigLiteralMapImpl(node);
      }
      else if (type == PIG_LITERAL_TUPLE) {
        return new PigLiteralTupleImpl(node);
      }
      else if (type == PIG_LOAD_CLAUSE) {
        return new PigLoadClauseImpl(node);
      }
      else if (type == PIG_MAP_TYPE) {
        return new PigMapTypeImpl(node);
      }
      else if (type == PIG_MR_CLAUSE) {
        return new PigMrClauseImpl(node);
      }
      else if (type == PIG_MULTI_EXPR) {
        return new PigMultiExprImpl(node);
      }
      else if (type == PIG_NESTED_BLK) {
        return new PigNestedBlkImpl(node);
      }
      else if (type == PIG_NESTED_COMMAND) {
        return new PigNestedCommandImpl(node);
      }
      else if (type == PIG_NESTED_CROSS) {
        return new PigNestedCrossImpl(node);
      }
      else if (type == PIG_NESTED_DISTINCT) {
        return new PigNestedDistinctImpl(node);
      }
      else if (type == PIG_NESTED_FILTER) {
        return new PigNestedFilterImpl(node);
      }
      else if (type == PIG_NESTED_FOREACH) {
        return new PigNestedForeachImpl(node);
      }
      else if (type == PIG_NESTED_LIMIT) {
        return new PigNestedLimitImpl(node);
      }
      else if (type == PIG_NESTED_OP) {
        return new PigNestedOpImpl(node);
      }
      else if (type == PIG_NESTED_OP_INPUT) {
        return new PigNestedOpInputImpl(node);
      }
      else if (type == PIG_NESTED_OP_INPUT_LIST) {
        return new PigNestedOpInputListImpl(node);
      }
      else if (type == PIG_NESTED_PROJ) {
        return new PigNestedProjImpl(node);
      }
      else if (type == PIG_NESTED_SORT) {
        return new PigNestedSortImpl(node);
      }
      else if (type == PIG_NOT_COND) {
        return new PigNotCondImpl(node);
      }
      else if (type == PIG_OP_CLAUSE) {
        return new PigOpClauseImpl(node);
      }
      else if (type == PIG_ORDER_BY_CLAUSE) {
        return new PigOrderByClauseImpl(node);
      }
      else if (type == PIG_ORDER_CLAUSE) {
        return new PigOrderClauseImpl(node);
      }
      else if (type == PIG_ORDER_COL) {
        return new PigOrderColImpl(node);
      }
      else if (type == PIG_ORDER_COL_LIST) {
        return new PigOrderColListImpl(node);
      }
      else if (type == PIG_OUTPUT_CLAUSE) {
        return new PigOutputClauseImpl(node);
      }
      else if (type == PIG_PARALLEL_CLAUSE) {
        return new PigParallelClauseImpl(node);
      }
      else if (type == PIG_PAREN_EXPR) {
        return new PigParenExprImpl(node);
      }
      else if (type == PIG_PARTITION_CLAUSE) {
        return new PigPartitionClauseImpl(node);
      }
      else if (type == PIG_PATH_LIST) {
        return new PigPathListImpl(node);
      }
      else if (type == PIG_PREVIOUS_REL) {
        return new PigPreviousRelImpl(node);
      }
      else if (type == PIG_PROJECTION) {
        return new PigProjectionImpl(node);
      }
      else if (type == PIG_RANK_BY_CLAUSE) {
        return new PigRankByClauseImpl(node);
      }
      else if (type == PIG_RANK_BY_STATEMENT) {
        return new PigRankByStatementImpl(node);
      }
      else if (type == PIG_RANK_CLAUSE) {
        return new PigRankClauseImpl(node);
      }
      else if (type == PIG_RANK_COL) {
        return new PigRankColImpl(node);
      }
      else if (type == PIG_RANK_LIST) {
        return new PigRankListImpl(node);
      }
      else if (type == PIG_REALIAS_CLAUSE) {
        return new PigRealiasClauseImpl(node);
      }
      else if (type == PIG_REAL_ARG) {
        return new PigRealArgImpl(node);
      }
      else if (type == PIG_REGISTER_CLAUSE) {
        return new PigRegisterClauseImpl(node);
      }
      else if (type == PIG_REL) {
        return new PigRelImpl(node);
      }
      else if (type == PIG_REL_LIST) {
        return new PigRelListImpl(node);
      }
      else if (type == PIG_REL_OP) {
        return new PigRelOpImpl(node);
      }
      else if (type == PIG_REL_STR_OP) {
        return new PigRelStrOpImpl(node);
      }
      else if (type == PIG_SAMPLE_CLAUSE) {
        return new PigSampleClauseImpl(node);
      }
      else if (type == PIG_SCALAR) {
        return new PigScalarImpl(node);
      }
      else if (type == PIG_SET_CLAUSE) {
        return new PigSetClauseImpl(node);
      }
      else if (type == PIG_SHIP_CLAUSE) {
        return new PigShipClauseImpl(node);
      }
      else if (type == PIG_SPLIT_BRANCH) {
        return new PigSplitBranchImpl(node);
      }
      else if (type == PIG_SPLIT_CLAUSE) {
        return new PigSplitClauseImpl(node);
      }
      else if (type == PIG_SPLIT_OTHERWISE) {
        return new PigSplitOtherwiseImpl(node);
      }
      else if (type == PIG_STATEMENT) {
        return new PigStatementImpl(node);
      }
      else if (type == PIG_STORE_CLAUSE) {
        return new PigStoreClauseImpl(node);
      }
      else if (type == PIG_STREAM_CLAUSE) {
        return new PigStreamClauseImpl(node);
      }
      else if (type == PIG_STREAM_CMD) {
        return new PigStreamCmdImpl(node);
      }
      else if (type == PIG_STREAM_CMD_LIST) {
        return new PigStreamCmdListImpl(node);
      }
      else if (type == PIG_TYPE) {
        return new PigTypeImpl(node);
      }
      else if (type == PIG_UNARY_COND) {
        return new PigUnaryCondImpl(node);
      }
      else if (type == PIG_UNION_CLAUSE) {
        return new PigUnionClauseImpl(node);
      }
      throw new AssertionError("Unknown element type: " + type);
    }
  }
}
