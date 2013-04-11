// This is a generated file. Not intended for manual editing.
package org.intellij.pig.parser;

import org.jetbrains.annotations.*;
import com.intellij.lang.LighterASTNode;
import com.intellij.lang.PsiBuilder;
import com.intellij.lang.PsiBuilder.Marker;
import com.intellij.openapi.diagnostic.Logger;
import static org.intellij.pig.psi.PigTypes.*;
import static org.intellij.pig.parser.GeneratedParserUtilBase.*;
import com.intellij.psi.tree.IElementType;
import com.intellij.lang.ASTNode;
import com.intellij.psi.tree.TokenSet;
import com.intellij.lang.PsiParser;

@SuppressWarnings({"SimplifiableIfStatement", "UnusedAssignment"})
public class PigParser implements PsiParser {

  public static Logger LOG_ = Logger.getInstance("org.intellij.pig.parser.PigParser");

  @NotNull
  public ASTNode parse(IElementType root_, PsiBuilder builder_) {
    int level_ = 0;
    boolean result_;
    builder_ = adapt_builder_(root_, builder_, this);
    if (root_ == PIG_IDENTIFIER) {
      result_ = IDENTIFIER(builder_, level_ + 1);
    }
    else if (root_ == PIG_AFTER_LEFT_PAREN) {
      result_ = after_left_paren(builder_, level_ + 1);
    }
    else if (root_ == PIG_AS_CLAUSE) {
      result_ = as_clause(builder_, level_ + 1);
    }
    else if (root_ == PIG_BRACKET_EXPR) {
      result_ = bracket_expr(builder_, level_ + 1);
    }
    else if (root_ == PIG_CACHE_CLAUSE) {
      result_ = cache_clause(builder_, level_ + 1);
    }
    else if (root_ == PIG_CAST_EXPR) {
      result_ = cast_expr(builder_, level_ + 1);
    }
    else if (root_ == PIG_CMD) {
      result_ = cmd(builder_, level_ + 1);
    }
    else if (root_ == PIG_COL_RANGE) {
      result_ = col_range(builder_, level_ + 1);
    }
    else if (root_ == PIG_COL_REF) {
      result_ = col_ref(builder_, level_ + 1);
    }
    else if (root_ == PIG_COL_REF_LIST) {
      result_ = col_ref_list(builder_, level_ + 1);
    }
    else if (root_ == PIG_COL_REF_WITHOUT_IDENTIFIER) {
      result_ = col_ref_without_identifier(builder_, level_ + 1);
    }
    else if (root_ == PIG_COND) {
      result_ = cond(builder_, level_ + 1);
    }
    else if (root_ == PIG_CROSS_CLAUSE) {
      result_ = cross_clause(builder_, level_ + 1);
    }
    else if (root_ == PIG_CUBE_CLAUSE) {
      result_ = cube_clause(builder_, level_ + 1);
    }
    else if (root_ == PIG_CUBE_ROLLUP_LIST) {
      result_ = cube_rollup_list(builder_, level_ + 1);
    }
    else if (root_ == PIG_CURLY_EXPR) {
      result_ = curly_expr(builder_, level_ + 1);
    }
    else if (root_ == PIG_DECLARE_STATEMENT) {
      result_ = declare_statement(builder_, level_ + 1);
    }
    else if (root_ == PIG_DEFAULT_STATEMENT) {
      result_ = default_statement(builder_, level_ + 1);
    }
    else if (root_ == PIG_DEFINE_CLAUSE) {
      result_ = define_clause(builder_, level_ + 1);
    }
    else if (root_ == PIG_DISTINCT_CLAUSE) {
      result_ = distinct_clause(builder_, level_ + 1);
    }
    else if (root_ == PIG_EID) {
      result_ = eid(builder_, level_ + 1);
    }
    else if (root_ == PIG_EID_WITHOUT_COLUMNS) {
      result_ = eid_without_columns(builder_, level_ + 1);
    }
    else if (root_ == PIG_ERROR_CLAUSE) {
      result_ = error_clause(builder_, level_ + 1);
    }
    else if (root_ == PIG_EXPLICIT_BAG_TYPE) {
      result_ = explicit_bag_type(builder_, level_ + 1);
    }
    else if (root_ == PIG_EXPLICIT_BAG_TYPE_CAST) {
      result_ = explicit_bag_type_cast(builder_, level_ + 1);
    }
    else if (root_ == PIG_EXPLICIT_FIELD_DEF) {
      result_ = explicit_field_def(builder_, level_ + 1);
    }
    else if (root_ == PIG_EXPLICIT_MAP_TYPE) {
      result_ = explicit_map_type(builder_, level_ + 1);
    }
    else if (root_ == PIG_EXPLICIT_TYPE) {
      result_ = explicit_type(builder_, level_ + 1);
    }
    else if (root_ == PIG_EXPLICIT_TYPE_CAST) {
      result_ = explicit_type_cast(builder_, level_ + 1);
    }
    else if (root_ == PIG_EXPR) {
      result_ = expr(builder_, level_ + 1);
    }
    else if (root_ == PIG_FIELD_DEF) {
      result_ = field_def(builder_, level_ + 1);
    }
    else if (root_ == PIG_FIELD_DEF_LIST) {
      result_ = field_def_list(builder_, level_ + 1);
    }
    else if (root_ == PIG_FILTER_CLAUSE) {
      result_ = filter_clause(builder_, level_ + 1);
    }
    else if (root_ == PIG_FLATTEN_CLAUSE) {
      result_ = flatten_clause(builder_, level_ + 1);
    }
    else if (root_ == PIG_FLATTEN_GENERATED_ITEM) {
      result_ = flatten_generated_item(builder_, level_ + 1);
    }
    else if (root_ == PIG_FOREACH_PLAN_COMPLEX) {
      result_ = foreach_plan_complex(builder_, level_ + 1);
    }
    else if (root_ == PIG_FOREACH_PLAN_SIMPLE) {
      result_ = foreach_plan_simple(builder_, level_ + 1);
    }
    else if (root_ == PIG_FOREACH_STATEMENT) {
      result_ = foreach_statement(builder_, level_ + 1);
    }
    else if (root_ == PIG_FUNC_ARGS) {
      result_ = func_args(builder_, level_ + 1);
    }
    else if (root_ == PIG_FUNC_ARGS_STRING) {
      result_ = func_args_string(builder_, level_ + 1);
    }
    else if (root_ == PIG_FUNC_CLAUSE) {
      result_ = func_clause(builder_, level_ + 1);
    }
    else if (root_ == PIG_FUNC_NAME) {
      result_ = func_name(builder_, level_ + 1);
    }
    else if (root_ == PIG_FUNC_NAME_SUFFIX) {
      result_ = func_name_suffix(builder_, level_ + 1);
    }
    else if (root_ == PIG_FUNC_NAME_WITHOUT_COLUMNS) {
      result_ = func_name_without_columns(builder_, level_ + 1);
    }
    else if (root_ == PIG_GENERATE_AS_CLAUSE) {
      result_ = generate_as_clause(builder_, level_ + 1);
    }
    else if (root_ == PIG_GROUP_CLAUSE) {
      result_ = group_clause(builder_, level_ + 1);
    }
    else if (root_ == PIG_GROUP_ITEM) {
      result_ = group_item(builder_, level_ + 1);
    }
    else if (root_ == PIG_ILLUSTRATE_CLAUSE) {
      result_ = illustrate_clause(builder_, level_ + 1);
    }
    else if (root_ == PIG_IMPLICIT_BAG_TYPE) {
      result_ = implicit_bag_type(builder_, level_ + 1);
    }
    else if (root_ == PIG_IMPLICIT_MAP_TYPE) {
      result_ = implicit_map_type(builder_, level_ + 1);
    }
    else if (root_ == PIG_IMPLICIT_TYPE) {
      result_ = implicit_type(builder_, level_ + 1);
    }
    else if (root_ == PIG_IMPORT_CLAUSE) {
      result_ = import_clause(builder_, level_ + 1);
    }
    else if (root_ == PIG_INPUT_CLAUSE) {
      result_ = input_clause(builder_, level_ + 1);
    }
    else if (root_ == PIG_JOIN_CLAUSE) {
      result_ = join_clause(builder_, level_ + 1);
    }
    else if (root_ == PIG_JOIN_GROUP_BY_CLAUSE) {
      result_ = join_group_by_clause(builder_, level_ + 1);
    }
    else if (root_ == PIG_JOIN_ITEM) {
      result_ = join_item(builder_, level_ + 1);
    }
    else if (root_ == PIG_JOIN_SUB_CLAUSE) {
      result_ = join_sub_clause(builder_, level_ + 1);
    }
    else if (root_ == PIG_JOIN_TYPE) {
      result_ = join_type(builder_, level_ + 1);
    }
    else if (root_ == PIG_KEYVALUE) {
      result_ = keyvalue(builder_, level_ + 1);
    }
    else if (root_ == PIG_LIMIT_CLAUSE) {
      result_ = limit_clause(builder_, level_ + 1);
    }
    else if (root_ == PIG_LITERAL) {
      result_ = literal(builder_, level_ + 1);
    }
    else if (root_ == PIG_LITERAL_BAG) {
      result_ = literal_bag(builder_, level_ + 1);
    }
    else if (root_ == PIG_LITERAL_MAP) {
      result_ = literal_map(builder_, level_ + 1);
    }
    else if (root_ == PIG_LITERAL_TUPLE) {
      result_ = literal_tuple(builder_, level_ + 1);
    }
    else if (root_ == PIG_LOAD_CLAUSE) {
      result_ = load_clause(builder_, level_ + 1);
    }
    else if (root_ == PIG_MAP_TYPE) {
      result_ = map_type(builder_, level_ + 1);
    }
    else if (root_ == PIG_MR_CLAUSE) {
      result_ = mr_clause(builder_, level_ + 1);
    }
    else if (root_ == PIG_MULTI_EXPR) {
      result_ = multi_expr(builder_, level_ + 1);
    }
    else if (root_ == PIG_NESTED_BLK) {
      result_ = nested_blk(builder_, level_ + 1);
    }
    else if (root_ == PIG_NESTED_COMMAND) {
      result_ = nested_command(builder_, level_ + 1);
    }
    else if (root_ == PIG_NESTED_CROSS) {
      result_ = nested_cross(builder_, level_ + 1);
    }
    else if (root_ == PIG_NESTED_DISTINCT) {
      result_ = nested_distinct(builder_, level_ + 1);
    }
    else if (root_ == PIG_NESTED_FILTER) {
      result_ = nested_filter(builder_, level_ + 1);
    }
    else if (root_ == PIG_NESTED_FOREACH) {
      result_ = nested_foreach(builder_, level_ + 1);
    }
    else if (root_ == PIG_NESTED_LIMIT) {
      result_ = nested_limit(builder_, level_ + 1);
    }
    else if (root_ == PIG_NESTED_OP) {
      result_ = nested_op(builder_, level_ + 1);
    }
    else if (root_ == PIG_NESTED_OP_INPUT) {
      result_ = nested_op_input(builder_, level_ + 1);
    }
    else if (root_ == PIG_NESTED_OP_INPUT_LIST) {
      result_ = nested_op_input_list(builder_, level_ + 1);
    }
    else if (root_ == PIG_NESTED_PROJ) {
      result_ = nested_proj(builder_, level_ + 1);
    }
    else if (root_ == PIG_NESTED_SORT) {
      result_ = nested_sort(builder_, level_ + 1);
    }
    else if (root_ == PIG_NOT_COND) {
      result_ = not_cond(builder_, level_ + 1);
    }
    else if (root_ == PIG_OP_CLAUSE) {
      result_ = op_clause(builder_, level_ + 1);
    }
    else if (root_ == PIG_ORDER_BY_CLAUSE) {
      result_ = order_by_clause(builder_, level_ + 1);
    }
    else if (root_ == PIG_ORDER_CLAUSE) {
      result_ = order_clause(builder_, level_ + 1);
    }
    else if (root_ == PIG_ORDER_COL) {
      result_ = order_col(builder_, level_ + 1);
    }
    else if (root_ == PIG_ORDER_COL_LIST) {
      result_ = order_col_list(builder_, level_ + 1);
    }
    else if (root_ == PIG_OUTPUT_CLAUSE) {
      result_ = output_clause(builder_, level_ + 1);
    }
    else if (root_ == PIG_PARALLEL_CLAUSE) {
      result_ = parallel_clause(builder_, level_ + 1);
    }
    else if (root_ == PIG_PAREN_EXPR) {
      result_ = paren_expr(builder_, level_ + 1);
    }
    else if (root_ == PIG_PARTITION_CLAUSE) {
      result_ = partition_clause(builder_, level_ + 1);
    }
    else if (root_ == PIG_PATH_LIST) {
      result_ = path_list(builder_, level_ + 1);
    }
    else if (root_ == PIG_PREVIOUS_REL) {
      result_ = previous_rel(builder_, level_ + 1);
    }
    else if (root_ == PIG_PROJECTION) {
      result_ = projection(builder_, level_ + 1);
    }
    else if (root_ == PIG_RANK_BY_CLAUSE) {
      result_ = rank_by_clause(builder_, level_ + 1);
    }
    else if (root_ == PIG_RANK_BY_STATEMENT) {
      result_ = rank_by_statement(builder_, level_ + 1);
    }
    else if (root_ == PIG_RANK_CLAUSE) {
      result_ = rank_clause(builder_, level_ + 1);
    }
    else if (root_ == PIG_RANK_COL) {
      result_ = rank_col(builder_, level_ + 1);
    }
    else if (root_ == PIG_RANK_LIST) {
      result_ = rank_list(builder_, level_ + 1);
    }
    else if (root_ == PIG_REAL_ARG) {
      result_ = real_arg(builder_, level_ + 1);
    }
    else if (root_ == PIG_REALIAS_CLAUSE) {
      result_ = realias_clause(builder_, level_ + 1);
    }
    else if (root_ == PIG_REGISTER_CLAUSE) {
      result_ = register_clause(builder_, level_ + 1);
    }
    else if (root_ == PIG_REL) {
      result_ = rel(builder_, level_ + 1);
    }
    else if (root_ == PIG_REL_LIST) {
      result_ = rel_list(builder_, level_ + 1);
    }
    else if (root_ == PIG_REL_OP) {
      result_ = rel_op(builder_, level_ + 1);
    }
    else if (root_ == PIG_REL_STR_OP) {
      result_ = rel_str_op(builder_, level_ + 1);
    }
    else if (root_ == PIG_SAMPLE_CLAUSE) {
      result_ = sample_clause(builder_, level_ + 1);
    }
    else if (root_ == PIG_SCALAR) {
      result_ = scalar(builder_, level_ + 1);
    }
    else if (root_ == PIG_SET_CLAUSE) {
      result_ = set_clause(builder_, level_ + 1);
    }
    else if (root_ == PIG_SHIP_CLAUSE) {
      result_ = ship_clause(builder_, level_ + 1);
    }
    else if (root_ == PIG_SPLIT_BRANCH) {
      result_ = split_branch(builder_, level_ + 1);
    }
    else if (root_ == PIG_SPLIT_CLAUSE) {
      result_ = split_clause(builder_, level_ + 1);
    }
    else if (root_ == PIG_SPLIT_OTHERWISE) {
      result_ = split_otherwise(builder_, level_ + 1);
    }
    else if (root_ == PIG_STATEMENT) {
      result_ = statement(builder_, level_ + 1);
    }
    else if (root_ == PIG_STORE_CLAUSE) {
      result_ = store_clause(builder_, level_ + 1);
    }
    else if (root_ == PIG_STREAM_CLAUSE) {
      result_ = stream_clause(builder_, level_ + 1);
    }
    else if (root_ == PIG_STREAM_CMD) {
      result_ = stream_cmd(builder_, level_ + 1);
    }
    else if (root_ == PIG_STREAM_CMD_LIST) {
      result_ = stream_cmd_list(builder_, level_ + 1);
    }
    else if (root_ == PIG_TYPE) {
      result_ = type(builder_, level_ + 1);
    }
    else if (root_ == PIG_UNARY_COND) {
      result_ = unary_cond(builder_, level_ + 1);
    }
    else if (root_ == PIG_UNION_CLAUSE) {
      result_ = union_clause(builder_, level_ + 1);
    }
    else {
      Marker marker_ = builder_.mark();
      enterErrorRecordingSection(builder_, level_, _SECTION_RECOVER_, null);
      result_ = parse_root_(root_, builder_, level_);
      exitErrorRecordingSection(builder_, level_, result_, true, _SECTION_RECOVER_, TOKEN_ADVANCER);
      marker_.done(root_);
    }
    return builder_.getTreeBuilt();
  }

  protected boolean parse_root_(final IElementType root_, final PsiBuilder builder_, final int level_) {
    return pigFile(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // ID ('::' ID)*
  public static boolean IDENTIFIER(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "IDENTIFIER")) return false;
    if (!nextTokenIs(builder_, PIG_ID)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_ID);
    result_ = result_ && IDENTIFIER_1(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_IDENTIFIER);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  // ('::' ID)*
  private static boolean IDENTIFIER_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "IDENTIFIER_1")) return false;
    int offset_ = builder_.getCurrentOffset();
    while (true) {
      if (!IDENTIFIER_1_0(builder_, level_ + 1)) break;
      int next_offset_ = builder_.getCurrentOffset();
      if (offset_ == next_offset_) {
        empty_element_parsed_guard_(builder_, offset_, "IDENTIFIER_1");
        break;
      }
      offset_ = next_offset_;
    }
    return true;
  }

  // '::' ID
  private static boolean IDENTIFIER_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "IDENTIFIER_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_DCOLON);
    result_ = result_ && consumeToken(builder_, PIG_ID);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // explicit_type_cast ')' cast_expr /*-> ^( CAST_EXPR explicit_type_cast cast_expr )*/
  //                  // tuples
  //                  | ')' projection* /*-> ^( TUPLE_VAL ) projection**/
  //                  | '*' ( ',' real_arg )* ')' projection* /*-> ^( FUNC_EVAL TOTUPLE STAR real_arg* ) projection**/
  //                  | col_range ( ',' real_arg )* ')' projection* /*-> ^( FUNC_EVAL TOTUPLE col_range real_arg* ) projection**/
  //                  // Tuples begin with '(' expr, but shorthand-booleans begin with '(' cond. As cond
  //                  // and expr are indistinguishable, we'll parse as a cond (i.e. the most lenient) and
  //                  // for exprs, strip off the BOOL_COND trees. You can have both nested conds and nested
  //                  // exprs, so we'll just assume cond.
  //                  | (unary_cond|expr)
  //                    ( ( ( ',' real_arg )+ ')' projection* /*-> ^( FUNC_EVAL TOTUPLE cond real_arg+ ) projection* */)
  //                    | ( ')' /*-> ^( EXPR_IN_PAREN cond )*/ )
  //                    | ( '?' expr ':' expr ')' /*-> ^( BIN_EXPR cond $exp1 $exp2 )*/ ) )
  public static boolean after_left_paren(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "after_left_paren")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<after left paren>");
    result_ = after_left_paren_0(builder_, level_ + 1);
    if (!result_) result_ = after_left_paren_1(builder_, level_ + 1);
    if (!result_) result_ = after_left_paren_2(builder_, level_ + 1);
    if (!result_) result_ = after_left_paren_3(builder_, level_ + 1);
    if (!result_) result_ = after_left_paren_4(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_AFTER_LEFT_PAREN);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // explicit_type_cast ')' cast_expr
  private static boolean after_left_paren_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "after_left_paren_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = explicit_type_cast(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_RP);
    result_ = result_ && cast_expr(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // ')' projection*
  private static boolean after_left_paren_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "after_left_paren_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_RP);
    result_ = result_ && after_left_paren_1_1(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // projection*
  private static boolean after_left_paren_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "after_left_paren_1_1")) return false;
    int offset_ = builder_.getCurrentOffset();
    while (true) {
      if (!projection(builder_, level_ + 1)) break;
      int next_offset_ = builder_.getCurrentOffset();
      if (offset_ == next_offset_) {
        empty_element_parsed_guard_(builder_, offset_, "after_left_paren_1_1");
        break;
      }
      offset_ = next_offset_;
    }
    return true;
  }

  // '*' ( ',' real_arg )* ')' projection*
  private static boolean after_left_paren_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "after_left_paren_2")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_STAR);
    result_ = result_ && after_left_paren_2_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_RP);
    result_ = result_ && after_left_paren_2_3(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // ( ',' real_arg )*
  private static boolean after_left_paren_2_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "after_left_paren_2_1")) return false;
    int offset_ = builder_.getCurrentOffset();
    while (true) {
      if (!after_left_paren_2_1_0(builder_, level_ + 1)) break;
      int next_offset_ = builder_.getCurrentOffset();
      if (offset_ == next_offset_) {
        empty_element_parsed_guard_(builder_, offset_, "after_left_paren_2_1");
        break;
      }
      offset_ = next_offset_;
    }
    return true;
  }

  // ',' real_arg
  private static boolean after_left_paren_2_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "after_left_paren_2_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_COMMA);
    result_ = result_ && real_arg(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // projection*
  private static boolean after_left_paren_2_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "after_left_paren_2_3")) return false;
    int offset_ = builder_.getCurrentOffset();
    while (true) {
      if (!projection(builder_, level_ + 1)) break;
      int next_offset_ = builder_.getCurrentOffset();
      if (offset_ == next_offset_) {
        empty_element_parsed_guard_(builder_, offset_, "after_left_paren_2_3");
        break;
      }
      offset_ = next_offset_;
    }
    return true;
  }

  // col_range ( ',' real_arg )* ')' projection*
  private static boolean after_left_paren_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "after_left_paren_3")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = col_range(builder_, level_ + 1);
    result_ = result_ && after_left_paren_3_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_RP);
    result_ = result_ && after_left_paren_3_3(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // ( ',' real_arg )*
  private static boolean after_left_paren_3_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "after_left_paren_3_1")) return false;
    int offset_ = builder_.getCurrentOffset();
    while (true) {
      if (!after_left_paren_3_1_0(builder_, level_ + 1)) break;
      int next_offset_ = builder_.getCurrentOffset();
      if (offset_ == next_offset_) {
        empty_element_parsed_guard_(builder_, offset_, "after_left_paren_3_1");
        break;
      }
      offset_ = next_offset_;
    }
    return true;
  }

  // ',' real_arg
  private static boolean after_left_paren_3_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "after_left_paren_3_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_COMMA);
    result_ = result_ && real_arg(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // projection*
  private static boolean after_left_paren_3_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "after_left_paren_3_3")) return false;
    int offset_ = builder_.getCurrentOffset();
    while (true) {
      if (!projection(builder_, level_ + 1)) break;
      int next_offset_ = builder_.getCurrentOffset();
      if (offset_ == next_offset_) {
        empty_element_parsed_guard_(builder_, offset_, "after_left_paren_3_3");
        break;
      }
      offset_ = next_offset_;
    }
    return true;
  }

  // (unary_cond|expr)
  //                    ( ( ( ',' real_arg )+ ')' projection* /*-> ^( FUNC_EVAL TOTUPLE cond real_arg+ ) projection* */)
  //                    | ( ')' /*-> ^( EXPR_IN_PAREN cond )*/ )
  //                    | ( '?' expr ':' expr ')' /*-> ^( BIN_EXPR cond $exp1 $exp2 )*/ ) )
  private static boolean after_left_paren_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "after_left_paren_4")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = after_left_paren_4_0(builder_, level_ + 1);
    result_ = result_ && after_left_paren_4_1(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // unary_cond|expr
  private static boolean after_left_paren_4_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "after_left_paren_4_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = unary_cond(builder_, level_ + 1);
    if (!result_) result_ = expr(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // ( ( ',' real_arg )+ ')' projection* /*-> ^( FUNC_EVAL TOTUPLE cond real_arg+ ) projection* */)
  //                    | ( ')' /*-> ^( EXPR_IN_PAREN cond )*/ )
  //                    | ( '?' expr ':' expr ')' /*-> ^( BIN_EXPR cond $exp1 $exp2 )*/ )
  private static boolean after_left_paren_4_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "after_left_paren_4_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = after_left_paren_4_1_0(builder_, level_ + 1);
    if (!result_) result_ = after_left_paren_4_1_1(builder_, level_ + 1);
    if (!result_) result_ = after_left_paren_4_1_2(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // ( ',' real_arg )+ ')' projection*
  private static boolean after_left_paren_4_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "after_left_paren_4_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = after_left_paren_4_1_0_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_RP);
    result_ = result_ && after_left_paren_4_1_0_2(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // ( ',' real_arg )+
  private static boolean after_left_paren_4_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "after_left_paren_4_1_0_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = after_left_paren_4_1_0_0_0(builder_, level_ + 1);
    int offset_ = builder_.getCurrentOffset();
    while (result_) {
      if (!after_left_paren_4_1_0_0_0(builder_, level_ + 1)) break;
      int next_offset_ = builder_.getCurrentOffset();
      if (offset_ == next_offset_) {
        empty_element_parsed_guard_(builder_, offset_, "after_left_paren_4_1_0_0");
        break;
      }
      offset_ = next_offset_;
    }
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // ',' real_arg
  private static boolean after_left_paren_4_1_0_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "after_left_paren_4_1_0_0_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_COMMA);
    result_ = result_ && real_arg(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // projection*
  private static boolean after_left_paren_4_1_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "after_left_paren_4_1_0_2")) return false;
    int offset_ = builder_.getCurrentOffset();
    while (true) {
      if (!projection(builder_, level_ + 1)) break;
      int next_offset_ = builder_.getCurrentOffset();
      if (offset_ == next_offset_) {
        empty_element_parsed_guard_(builder_, offset_, "after_left_paren_4_1_0_2");
        break;
      }
      offset_ = next_offset_;
    }
    return true;
  }

  // ( ')' /*-> ^( EXPR_IN_PAREN cond )*/ )
  private static boolean after_left_paren_4_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "after_left_paren_4_1_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_RP);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // '?' expr ':' expr ')'
  private static boolean after_left_paren_4_1_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "after_left_paren_4_1_2")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_QMARK);
    result_ = result_ && expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_COLON);
    result_ = result_ && expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_RP);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // real_arg ( ',' real_arg )*
  static boolean arg_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arg_list")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = real_arg(builder_, level_ + 1);
    result_ = result_ && arg_list_1(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // ( ',' real_arg )*
  private static boolean arg_list_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arg_list_1")) return false;
    int offset_ = builder_.getCurrentOffset();
    while (true) {
      if (!arg_list_1_0(builder_, level_ + 1)) break;
      int next_offset_ = builder_.getCurrentOffset();
      if (offset_ == next_offset_) {
        empty_element_parsed_guard_(builder_, offset_, "arg_list_1");
        break;
      }
      offset_ = next_offset_;
    }
    return true;
  }

  // ',' real_arg
  private static boolean arg_list_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "arg_list_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_COMMA);
    result_ = result_ && real_arg(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // AS ( explicit_field_def | ( '(' field_def_list? ')' ) )
  public static boolean as_clause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "as_clause")) return false;
    if (!nextTokenIs(builder_, PIG_AS)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_AS);
    result_ = result_ && as_clause_1(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_AS_CLAUSE);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  // explicit_field_def | ( '(' field_def_list? ')' )
  private static boolean as_clause_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "as_clause_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = explicit_field_def(builder_, level_ + 1);
    if (!result_) result_ = as_clause_1_1(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // '(' field_def_list? ')'
  private static boolean as_clause_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "as_clause_1_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_LP);
    result_ = result_ && as_clause_1_1_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_RP);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // field_def_list?
  private static boolean as_clause_1_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "as_clause_1_1_1")) return false;
    field_def_list(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // '[' real_arg ( ',' real_arg )* ']' projection*
  //              | '[' keyvalue ( ',' keyvalue )* ']' projection*
  //              | '[' ']' projection*
  public static boolean bracket_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bracket_expr")) return false;
    if (!nextTokenIs(builder_, PIG_LBRACKET)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = bracket_expr_0(builder_, level_ + 1);
    if (!result_) result_ = bracket_expr_1(builder_, level_ + 1);
    if (!result_) result_ = bracket_expr_2(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_BRACKET_EXPR);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  // '[' real_arg ( ',' real_arg )* ']' projection*
  private static boolean bracket_expr_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bracket_expr_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_LBRACKET);
    result_ = result_ && real_arg(builder_, level_ + 1);
    result_ = result_ && bracket_expr_0_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_RBRACKET);
    result_ = result_ && bracket_expr_0_4(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // ( ',' real_arg )*
  private static boolean bracket_expr_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bracket_expr_0_2")) return false;
    int offset_ = builder_.getCurrentOffset();
    while (true) {
      if (!bracket_expr_0_2_0(builder_, level_ + 1)) break;
      int next_offset_ = builder_.getCurrentOffset();
      if (offset_ == next_offset_) {
        empty_element_parsed_guard_(builder_, offset_, "bracket_expr_0_2");
        break;
      }
      offset_ = next_offset_;
    }
    return true;
  }

  // ',' real_arg
  private static boolean bracket_expr_0_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bracket_expr_0_2_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_COMMA);
    result_ = result_ && real_arg(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // projection*
  private static boolean bracket_expr_0_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bracket_expr_0_4")) return false;
    int offset_ = builder_.getCurrentOffset();
    while (true) {
      if (!projection(builder_, level_ + 1)) break;
      int next_offset_ = builder_.getCurrentOffset();
      if (offset_ == next_offset_) {
        empty_element_parsed_guard_(builder_, offset_, "bracket_expr_0_4");
        break;
      }
      offset_ = next_offset_;
    }
    return true;
  }

  // '[' keyvalue ( ',' keyvalue )* ']' projection*
  private static boolean bracket_expr_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bracket_expr_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_LBRACKET);
    result_ = result_ && keyvalue(builder_, level_ + 1);
    result_ = result_ && bracket_expr_1_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_RBRACKET);
    result_ = result_ && bracket_expr_1_4(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // ( ',' keyvalue )*
  private static boolean bracket_expr_1_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bracket_expr_1_2")) return false;
    int offset_ = builder_.getCurrentOffset();
    while (true) {
      if (!bracket_expr_1_2_0(builder_, level_ + 1)) break;
      int next_offset_ = builder_.getCurrentOffset();
      if (offset_ == next_offset_) {
        empty_element_parsed_guard_(builder_, offset_, "bracket_expr_1_2");
        break;
      }
      offset_ = next_offset_;
    }
    return true;
  }

  // ',' keyvalue
  private static boolean bracket_expr_1_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bracket_expr_1_2_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_COMMA);
    result_ = result_ && keyvalue(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // projection*
  private static boolean bracket_expr_1_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bracket_expr_1_4")) return false;
    int offset_ = builder_.getCurrentOffset();
    while (true) {
      if (!projection(builder_, level_ + 1)) break;
      int next_offset_ = builder_.getCurrentOffset();
      if (offset_ == next_offset_) {
        empty_element_parsed_guard_(builder_, offset_, "bracket_expr_1_4");
        break;
      }
      offset_ = next_offset_;
    }
    return true;
  }

  // '[' ']' projection*
  private static boolean bracket_expr_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bracket_expr_2")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_LBRACKET);
    result_ = result_ && consumeToken(builder_, PIG_RBRACKET);
    result_ = result_ && bracket_expr_2_2(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // projection*
  private static boolean bracket_expr_2_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "bracket_expr_2_2")) return false;
    int offset_ = builder_.getCurrentOffset();
    while (true) {
      if (!projection(builder_, level_ + 1)) break;
      int next_offset_ = builder_.getCurrentOffset();
      if (offset_ == next_offset_) {
        empty_element_parsed_guard_(builder_, offset_, "bracket_expr_2_2");
        break;
      }
      offset_ = next_offset_;
    }
    return true;
  }

  /* ********************************************************** */
  // CACHE '(' path_list ')'
  public static boolean cache_clause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "cache_clause")) return false;
    if (!nextTokenIs(builder_, PIG_CACHE)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_CACHE);
    result_ = result_ && consumeToken(builder_, PIG_LP);
    result_ = result_ && path_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_RP);
    if (result_) {
      marker_.done(PIG_CACHE_CLAUSE);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  /* ********************************************************** */
  // identifier_with_function
  //           | function_name_with_columns
  //           | '-' cast_expr
  //           // single columns and functions (both of which can start with an identifier). Note that we have to be
  //           // careful with periods straight after the identifier, as we want those to be projections, not function
  //           // calls
  //           | col_ref_without_identifier projection*
  //           | identifier_with_projection
  //           | curly_expr
  //           | bracket_expr
  //           | paren_expr
  //           | scalar
  public static boolean cast_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "cast_expr")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<cast expr>");
    result_ = identifier_with_function(builder_, level_ + 1);
    if (!result_) result_ = function_name_with_columns(builder_, level_ + 1);
    if (!result_) result_ = cast_expr_2(builder_, level_ + 1);
    if (!result_) result_ = cast_expr_3(builder_, level_ + 1);
    if (!result_) result_ = identifier_with_projection(builder_, level_ + 1);
    if (!result_) result_ = curly_expr(builder_, level_ + 1);
    if (!result_) result_ = bracket_expr(builder_, level_ + 1);
    if (!result_) result_ = paren_expr(builder_, level_ + 1);
    if (!result_) result_ = scalar(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_CAST_EXPR);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // '-' cast_expr
  private static boolean cast_expr_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "cast_expr_2")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_MINUS);
    result_ = result_ && cast_expr(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // col_ref_without_identifier projection*
  private static boolean cast_expr_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "cast_expr_3")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = col_ref_without_identifier(builder_, level_ + 1);
    result_ = result_ && cast_expr_3_1(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // projection*
  private static boolean cast_expr_3_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "cast_expr_3_1")) return false;
    int offset_ = builder_.getCurrentOffset();
    while (true) {
      if (!projection(builder_, level_ + 1)) break;
      int next_offset_ = builder_.getCurrentOffset();
      if (offset_ == next_offset_) {
        empty_element_parsed_guard_(builder_, offset_, "cast_expr_3_1");
        break;
      }
      offset_ = next_offset_;
    }
    return true;
  }

  /* ********************************************************** */
  // EXECCOMMAND ( ship_clause | cache_clause | input_clause | output_clause | error_clause )*
  public static boolean cmd(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "cmd")) return false;
    if (!nextTokenIs(builder_, PIG_EXECCOMMAND)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_EXECCOMMAND);
    result_ = result_ && cmd_1(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_CMD);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  // ( ship_clause | cache_clause | input_clause | output_clause | error_clause )*
  private static boolean cmd_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "cmd_1")) return false;
    int offset_ = builder_.getCurrentOffset();
    while (true) {
      if (!cmd_1_0(builder_, level_ + 1)) break;
      int next_offset_ = builder_.getCurrentOffset();
      if (offset_ == next_offset_) {
        empty_element_parsed_guard_(builder_, offset_, "cmd_1");
        break;
      }
      offset_ = next_offset_;
    }
    return true;
  }

  // ship_clause | cache_clause | input_clause | output_clause | error_clause
  private static boolean cmd_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "cmd_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = ship_clause(builder_, level_ + 1);
    if (!result_) result_ = cache_clause(builder_, level_ + 1);
    if (!result_) result_ = input_clause(builder_, level_ + 1);
    if (!result_) result_ = output_clause(builder_, level_ + 1);
    if (!result_) result_ = error_clause(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // col_ref '..' col_ref?
  //           |  '..' col_ref
  public static boolean col_range(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "col_range")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<col range>");
    result_ = col_range_0(builder_, level_ + 1);
    if (!result_) result_ = col_range_1(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_COL_RANGE);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // col_ref '..' col_ref?
  private static boolean col_range_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "col_range_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = col_ref(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_DOUBLE_DOT);
    result_ = result_ && col_range_0_2(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // col_ref?
  private static boolean col_range_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "col_range_0_2")) return false;
    col_ref(builder_, level_ + 1);
    return true;
  }

  // '..' col_ref
  private static boolean col_range_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "col_range_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_DOUBLE_DOT);
    result_ = result_ && col_ref(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // col_ref_without_identifier | IDENTIFIER
  public static boolean col_ref(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "col_ref")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<col ref>");
    result_ = col_ref_without_identifier(builder_, level_ + 1);
    if (!result_) result_ = IDENTIFIER(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_COL_REF);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // col_ref | ( '(' col_ref ( ',' col_ref )* ')' )
  public static boolean col_ref_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "col_ref_list")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<col ref list>");
    result_ = col_ref(builder_, level_ + 1);
    if (!result_) result_ = col_ref_list_1(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_COL_REF_LIST);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // '(' col_ref ( ',' col_ref )* ')'
  private static boolean col_ref_list_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "col_ref_list_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_LP);
    result_ = result_ && col_ref(builder_, level_ + 1);
    result_ = result_ && col_ref_list_1_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_RP);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // ( ',' col_ref )*
  private static boolean col_ref_list_1_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "col_ref_list_1_2")) return false;
    int offset_ = builder_.getCurrentOffset();
    while (true) {
      if (!col_ref_list_1_2_0(builder_, level_ + 1)) break;
      int next_offset_ = builder_.getCurrentOffset();
      if (offset_ == next_offset_) {
        empty_element_parsed_guard_(builder_, offset_, "col_ref_list_1_2");
        break;
      }
      offset_ = next_offset_;
    }
    return true;
  }

  // ',' col_ref
  private static boolean col_ref_list_1_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "col_ref_list_1_2_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_COMMA);
    result_ = result_ && col_ref(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // GROUP | CUBE | DOLLARVAR
  public static boolean col_ref_without_identifier(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "col_ref_without_identifier")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<col ref without identifier>");
    result_ = consumeToken(builder_, PIG_GROUP);
    if (!result_) result_ = consumeToken(builder_, PIG_CUBE);
    if (!result_) result_ = consumeToken(builder_, PIG_DOLLARVAR);
    if (result_) {
      marker_.done(PIG_COL_REF_WITHOUT_IDENTIFIER);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // not_cond ( (AND|OR) cond )*
  public static boolean cond(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "cond")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<cond>");
    result_ = not_cond(builder_, level_ + 1);
    result_ = result_ && cond_1(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_COND);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // ( (AND|OR) cond )*
  private static boolean cond_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "cond_1")) return false;
    int offset_ = builder_.getCurrentOffset();
    while (true) {
      if (!cond_1_0(builder_, level_ + 1)) break;
      int next_offset_ = builder_.getCurrentOffset();
      if (offset_ == next_offset_) {
        empty_element_parsed_guard_(builder_, offset_, "cond_1");
        break;
      }
      offset_ = next_offset_;
    }
    return true;
  }

  // (AND|OR) cond
  private static boolean cond_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "cond_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = cond_1_0_0(builder_, level_ + 1);
    result_ = result_ && cond(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // AND|OR
  private static boolean cond_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "cond_1_0_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_AND);
    if (!result_) result_ = consumeToken(builder_, PIG_OR);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // CROSS rel_list partition_clause?
  public static boolean cross_clause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "cross_clause")) return false;
    if (!nextTokenIs(builder_, PIG_CROSS)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_CROSS);
    result_ = result_ && rel_list(builder_, level_ + 1);
    result_ = result_ && cross_clause_2(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_CROSS_CLAUSE);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  // partition_clause?
  private static boolean cross_clause_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "cross_clause_2")) return false;
    partition_clause(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // CUBE rel BY cube_rollup_list ( ',' cube_rollup_list )*
  public static boolean cube_clause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "cube_clause")) return false;
    if (!nextTokenIs(builder_, PIG_CUBE)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_CUBE);
    result_ = result_ && rel(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_BY);
    result_ = result_ && cube_rollup_list(builder_, level_ + 1);
    result_ = result_ && cube_clause_4(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_CUBE_CLAUSE);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  // ( ',' cube_rollup_list )*
  private static boolean cube_clause_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "cube_clause_4")) return false;
    int offset_ = builder_.getCurrentOffset();
    while (true) {
      if (!cube_clause_4_0(builder_, level_ + 1)) break;
      int next_offset_ = builder_.getCurrentOffset();
      if (offset_ == next_offset_) {
        empty_element_parsed_guard_(builder_, offset_, "cube_clause_4");
        break;
      }
      offset_ = next_offset_;
    }
    return true;
  }

  // ',' cube_rollup_list
  private static boolean cube_clause_4_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "cube_clause_4_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_COMMA);
    result_ = result_ && cube_rollup_list(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // ( CUBE | ROLLUP ) '(' real_arg ( ',' real_arg )* ')'
  public static boolean cube_rollup_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "cube_rollup_list")) return false;
    if (!nextTokenIs(builder_, PIG_CUBE) && !nextTokenIs(builder_, PIG_ROLLUP)
        && replaceVariants(builder_, 2, "<cube rollup list>")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<cube rollup list>");
    result_ = cube_rollup_list_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_LP);
    result_ = result_ && real_arg(builder_, level_ + 1);
    result_ = result_ && cube_rollup_list_3(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_RP);
    if (result_) {
      marker_.done(PIG_CUBE_ROLLUP_LIST);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // CUBE | ROLLUP
  private static boolean cube_rollup_list_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "cube_rollup_list_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_CUBE);
    if (!result_) result_ = consumeToken(builder_, PIG_ROLLUP);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // ( ',' real_arg )*
  private static boolean cube_rollup_list_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "cube_rollup_list_3")) return false;
    int offset_ = builder_.getCurrentOffset();
    while (true) {
      if (!cube_rollup_list_3_0(builder_, level_ + 1)) break;
      int next_offset_ = builder_.getCurrentOffset();
      if (offset_ == next_offset_) {
        empty_element_parsed_guard_(builder_, offset_, "cube_rollup_list_3");
        break;
      }
      offset_ = next_offset_;
    }
    return true;
  }

  // ',' real_arg
  private static boolean cube_rollup_list_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "cube_rollup_list_3_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_COMMA);
    result_ = result_ && real_arg(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // '{' real_arg ( ',' real_arg )* '}' projection*
  //            | '{' '}' projection*
  public static boolean curly_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "curly_expr")) return false;
    if (!nextTokenIs(builder_, PIG_LBRACE)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = curly_expr_0(builder_, level_ + 1);
    if (!result_) result_ = curly_expr_1(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_CURLY_EXPR);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  // '{' real_arg ( ',' real_arg )* '}' projection*
  private static boolean curly_expr_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "curly_expr_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_LBRACE);
    result_ = result_ && real_arg(builder_, level_ + 1);
    result_ = result_ && curly_expr_0_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_RBRACE);
    result_ = result_ && curly_expr_0_4(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // ( ',' real_arg )*
  private static boolean curly_expr_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "curly_expr_0_2")) return false;
    int offset_ = builder_.getCurrentOffset();
    while (true) {
      if (!curly_expr_0_2_0(builder_, level_ + 1)) break;
      int next_offset_ = builder_.getCurrentOffset();
      if (offset_ == next_offset_) {
        empty_element_parsed_guard_(builder_, offset_, "curly_expr_0_2");
        break;
      }
      offset_ = next_offset_;
    }
    return true;
  }

  // ',' real_arg
  private static boolean curly_expr_0_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "curly_expr_0_2_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_COMMA);
    result_ = result_ && real_arg(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // projection*
  private static boolean curly_expr_0_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "curly_expr_0_4")) return false;
    int offset_ = builder_.getCurrentOffset();
    while (true) {
      if (!projection(builder_, level_ + 1)) break;
      int next_offset_ = builder_.getCurrentOffset();
      if (offset_ == next_offset_) {
        empty_element_parsed_guard_(builder_, offset_, "curly_expr_0_4");
        break;
      }
      offset_ = next_offset_;
    }
    return true;
  }

  // '{' '}' projection*
  private static boolean curly_expr_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "curly_expr_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_LBRACE);
    result_ = result_ && consumeToken(builder_, PIG_RBRACE);
    result_ = result_ && curly_expr_1_2(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // projection*
  private static boolean curly_expr_1_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "curly_expr_1_2")) return false;
    int offset_ = builder_.getCurrentOffset();
    while (true) {
      if (!projection(builder_, level_ + 1)) break;
      int next_offset_ = builder_.getCurrentOffset();
      if (offset_ == next_offset_) {
        empty_element_parsed_guard_(builder_, offset_, "curly_expr_1_2");
        break;
      }
      offset_ = next_offset_;
    }
    return true;
  }

  /* ********************************************************** */
  // '%'DECLARE property_name (scalar | func_name | EXECCOMMAND)
  public static boolean declare_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "declare_statement")) return false;
    if (!nextTokenIs(builder_, PIG_PERCENT)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_PERCENT);
    result_ = result_ && consumeToken(builder_, PIG_DECLARE);
    result_ = result_ && property_name(builder_, level_ + 1);
    result_ = result_ && declare_statement_3(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_DECLARE_STATEMENT);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  // scalar | func_name | EXECCOMMAND
  private static boolean declare_statement_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "declare_statement_3")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = scalar(builder_, level_ + 1);
    if (!result_) result_ = func_name(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, PIG_EXECCOMMAND);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // '%'default property_name (scalar | func_name | EXECCOMMAND)
  public static boolean default_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "default_statement")) return false;
    if (!nextTokenIs(builder_, PIG_PERCENT)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_PERCENT);
    result_ = result_ && consumeToken(builder_, PIG_DEFAULT);
    result_ = result_ && property_name(builder_, level_ + 1);
    result_ = result_ && default_statement_3(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_DEFAULT_STATEMENT);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  // scalar | func_name | EXECCOMMAND
  private static boolean default_statement_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "default_statement_3")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = scalar(builder_, level_ + 1);
    if (!result_) result_ = func_name(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, PIG_EXECCOMMAND);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // DEFINE IDENTIFIER ( cmd | func_clause | macro_clause)
  public static boolean define_clause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "define_clause")) return false;
    if (!nextTokenIs(builder_, PIG_DEFINE)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_DEFINE);
    result_ = result_ && IDENTIFIER(builder_, level_ + 1);
    result_ = result_ && define_clause_2(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_DEFINE_CLAUSE);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  // cmd | func_clause | macro_clause
  private static boolean define_clause_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "define_clause_2")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = cmd(builder_, level_ + 1);
    if (!result_) result_ = func_clause(builder_, level_ + 1);
    if (!result_) result_ = macro_clause(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // DISTINCT rel partition_clause?
  public static boolean distinct_clause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "distinct_clause")) return false;
    if (!nextTokenIs(builder_, PIG_DISTINCT)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_DISTINCT);
    result_ = result_ && rel(builder_, level_ + 1);
    result_ = result_ && distinct_clause_2(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_DISTINCT_CLAUSE);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  // partition_clause?
  private static boolean distinct_clause_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "distinct_clause_2")) return false;
    partition_clause(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // eid_without_columns
  //     | IDENTIFIER
  //     | GROUP
  //     | CUBE
  //     | TRUE
  //     | FALSE
  //     | INT
  //     | LONG
  //     | FLOAT
  //     | DOUBLE
  //     | NULL
  //     | NOT
  //     | FLATTEN
  //     | BAG
  //     | TUPLE
  //     | MAP
  public static boolean eid(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "eid")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<eid>");
    result_ = eid_without_columns(builder_, level_ + 1);
    if (!result_) result_ = IDENTIFIER(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, PIG_GROUP);
    if (!result_) result_ = consumeToken(builder_, PIG_CUBE);
    if (!result_) result_ = consumeToken(builder_, PIG_TRUE);
    if (!result_) result_ = consumeToken(builder_, PIG_FALSE);
    if (!result_) result_ = consumeToken(builder_, PIG_INT);
    if (!result_) result_ = consumeToken(builder_, PIG_LONG);
    if (!result_) result_ = consumeToken(builder_, PIG_FLOAT);
    if (!result_) result_ = consumeToken(builder_, PIG_DOUBLE);
    if (!result_) result_ = consumeToken(builder_, PIG_NULL);
    if (!result_) result_ = consumeToken(builder_, PIG_NOT);
    if (!result_) result_ = consumeToken(builder_, PIG_FLATTEN);
    if (!result_) result_ = consumeToken(builder_, PIG_BAG);
    if (!result_) result_ = consumeToken(builder_, PIG_TUPLE);
    if (!result_) result_ = consumeToken(builder_, PIG_MAP);
    if (result_) {
      marker_.done(PIG_EID);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // rel_str_op
  //     | IMPORT
  //     | RETURNS
  //     | DEFINE
  //     | LOAD
  //     | FILTER
  //     | FOREACH
  //     | ROLLUP
  //     | ORDER
  //     | DISTINCT
  //     | COGROUP
  //     | JOIN
  //     | CROSS
  //     | UNION
  //     | SPLIT
  //     | INTO
  //     | INPUT
  //     | IF
  //     | ALL
  //     | AS
  //     | BY
  //     | USING
  //     | INNER
  //     | OUTER
  //     | PARALLEL
  //     | PARTITION
  //     | AND
  //     | OR
  //     | GENERATE
  //     | ASC
  //     | DESC
  //     | BOOL
  //     | BIGINTEGER
  //     | BIGDECIMAL
  //     | DATETIME
  //     | CHARARRAY
  //     | BYTEARRAY
  //     | IS
  //     | STREAM
  //     | THROUGH
  //     | STORE
  //     | MAPREDUCE
  //     | SHIP
  //     | CACHE
  //     | INPUT
  //     | OUTPUT
  //     | STDERROR
  //     | STDIN
  //     | STDOUT
  //     | LIMIT
  //     | SAMPLE
  //     | LEFT
  //     | RIGHT
  //     | FULL
  //     | REALIAS
  //     | BOOL_COND
  public static boolean eid_without_columns(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "eid_without_columns")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<eid without columns>");
    result_ = rel_str_op(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, PIG_IMPORT);
    if (!result_) result_ = consumeToken(builder_, PIG_RETURNS);
    if (!result_) result_ = consumeToken(builder_, PIG_DEFINE);
    if (!result_) result_ = consumeToken(builder_, PIG_LOAD);
    if (!result_) result_ = consumeToken(builder_, PIG_FILTER);
    if (!result_) result_ = consumeToken(builder_, PIG_FOREACH);
    if (!result_) result_ = consumeToken(builder_, PIG_ROLLUP);
    if (!result_) result_ = consumeToken(builder_, PIG_ORDER);
    if (!result_) result_ = consumeToken(builder_, PIG_DISTINCT);
    if (!result_) result_ = consumeToken(builder_, PIG_COGROUP);
    if (!result_) result_ = consumeToken(builder_, PIG_JOIN);
    if (!result_) result_ = consumeToken(builder_, PIG_CROSS);
    if (!result_) result_ = consumeToken(builder_, PIG_UNION);
    if (!result_) result_ = consumeToken(builder_, PIG_SPLIT);
    if (!result_) result_ = consumeToken(builder_, PIG_INTO);
    if (!result_) result_ = consumeToken(builder_, PIG_INPUT);
    if (!result_) result_ = consumeToken(builder_, PIG_IF);
    if (!result_) result_ = consumeToken(builder_, PIG_ALL);
    if (!result_) result_ = consumeToken(builder_, PIG_AS);
    if (!result_) result_ = consumeToken(builder_, PIG_BY);
    if (!result_) result_ = consumeToken(builder_, PIG_USING);
    if (!result_) result_ = consumeToken(builder_, PIG_INNER);
    if (!result_) result_ = consumeToken(builder_, PIG_OUTER);
    if (!result_) result_ = consumeToken(builder_, PIG_PARALLEL);
    if (!result_) result_ = consumeToken(builder_, PIG_PARTITION);
    if (!result_) result_ = consumeToken(builder_, PIG_AND);
    if (!result_) result_ = consumeToken(builder_, PIG_OR);
    if (!result_) result_ = consumeToken(builder_, PIG_GENERATE);
    if (!result_) result_ = consumeToken(builder_, PIG_ASC);
    if (!result_) result_ = consumeToken(builder_, PIG_DESC);
    if (!result_) result_ = consumeToken(builder_, PIG_BOOL);
    if (!result_) result_ = consumeToken(builder_, PIG_BIGINTEGER);
    if (!result_) result_ = consumeToken(builder_, PIG_BIGDECIMAL);
    if (!result_) result_ = consumeToken(builder_, PIG_DATETIME);
    if (!result_) result_ = consumeToken(builder_, PIG_CHARARRAY);
    if (!result_) result_ = consumeToken(builder_, PIG_BYTEARRAY);
    if (!result_) result_ = consumeToken(builder_, PIG_IS);
    if (!result_) result_ = consumeToken(builder_, PIG_STREAM);
    if (!result_) result_ = consumeToken(builder_, PIG_THROUGH);
    if (!result_) result_ = consumeToken(builder_, PIG_STORE);
    if (!result_) result_ = consumeToken(builder_, PIG_MAPREDUCE);
    if (!result_) result_ = consumeToken(builder_, PIG_SHIP);
    if (!result_) result_ = consumeToken(builder_, PIG_CACHE);
    if (!result_) result_ = consumeToken(builder_, PIG_INPUT);
    if (!result_) result_ = consumeToken(builder_, PIG_OUTPUT);
    if (!result_) result_ = consumeToken(builder_, PIG_STDERROR);
    if (!result_) result_ = consumeToken(builder_, PIG_STDIN);
    if (!result_) result_ = consumeToken(builder_, PIG_STDOUT);
    if (!result_) result_ = consumeToken(builder_, PIG_LIMIT);
    if (!result_) result_ = consumeToken(builder_, PIG_SAMPLE);
    if (!result_) result_ = consumeToken(builder_, PIG_LEFT);
    if (!result_) result_ = consumeToken(builder_, PIG_RIGHT);
    if (!result_) result_ = consumeToken(builder_, PIG_FULL);
    if (!result_) result_ = consumeToken(builder_, PIG_REALIAS);
    if (!result_) result_ = consumeToken(builder_, PIG_BOOL_COND);
    if (result_) {
      marker_.done(PIG_EID_WITHOUT_COLUMNS);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // ';'
  static boolean empty_statement(PsiBuilder builder_, int level_) {
    return consumeToken(builder_, PIG_SIMI);
  }

  /* ********************************************************** */
  // STDERROR '(' ( QUOTEDSTRING ( LIMIT INTEGER )? )? ')'
  public static boolean error_clause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "error_clause")) return false;
    if (!nextTokenIs(builder_, PIG_STDERROR)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_STDERROR);
    result_ = result_ && consumeToken(builder_, PIG_LP);
    result_ = result_ && error_clause_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_RP);
    if (result_) {
      marker_.done(PIG_ERROR_CLAUSE);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  // ( QUOTEDSTRING ( LIMIT INTEGER )? )?
  private static boolean error_clause_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "error_clause_2")) return false;
    error_clause_2_0(builder_, level_ + 1);
    return true;
  }

  // QUOTEDSTRING ( LIMIT INTEGER )?
  private static boolean error_clause_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "error_clause_2_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_QUOTEDSTRING);
    result_ = result_ && error_clause_2_0_1(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // ( LIMIT INTEGER )?
  private static boolean error_clause_2_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "error_clause_2_0_1")) return false;
    error_clause_2_0_1_0(builder_, level_ + 1);
    return true;
  }

  // LIMIT INTEGER
  private static boolean error_clause_2_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "error_clause_2_0_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeTokens(builder_, 0, PIG_LIMIT, PIG_INTEGER);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // bag implicit_bag_type
  public static boolean explicit_bag_type(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "explicit_bag_type")) return false;
    if (!nextTokenIs(builder_, PIG_BAG)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_BAG);
    result_ = result_ && implicit_bag_type(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_EXPLICIT_BAG_TYPE);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  /* ********************************************************** */
  // bag '{' explicit_tuple_type_cast? '}'
  public static boolean explicit_bag_type_cast(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "explicit_bag_type_cast")) return false;
    if (!nextTokenIs(builder_, PIG_BAG)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_BAG);
    result_ = result_ && consumeToken(builder_, PIG_LBRACE);
    result_ = result_ && explicit_bag_type_cast_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_RBRACE);
    if (result_) {
      marker_.done(PIG_EXPLICIT_BAG_TYPE_CAST);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  // explicit_tuple_type_cast?
  private static boolean explicit_bag_type_cast_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "explicit_bag_type_cast_2")) return false;
    explicit_tuple_type_cast(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER ( ':' type )?
  //                    | explicit_type
  public static boolean explicit_field_def(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "explicit_field_def")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<explicit field def>");
    result_ = explicit_field_def_0(builder_, level_ + 1);
    if (!result_) result_ = explicit_type(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_EXPLICIT_FIELD_DEF);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // IDENTIFIER ( ':' type )?
  private static boolean explicit_field_def_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "explicit_field_def_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = IDENTIFIER(builder_, level_ + 1);
    result_ = result_ && explicit_field_def_0_1(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // ( ':' type )?
  private static boolean explicit_field_def_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "explicit_field_def_0_1")) return false;
    explicit_field_def_0_1_0(builder_, level_ + 1);
    return true;
  }

  // ':' type
  private static boolean explicit_field_def_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "explicit_field_def_0_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_COLON);
    result_ = result_ && type(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // map implicit_map_type
  public static boolean explicit_map_type(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "explicit_map_type")) return false;
    if (!nextTokenIs(builder_, PIG_MAP)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_MAP);
    result_ = result_ && implicit_map_type(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_EXPLICIT_MAP_TYPE);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  /* ********************************************************** */
  // tuple implicit_tuple_type
  static boolean explicit_tuple_type(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "explicit_tuple_type")) return false;
    if (!nextTokenIs(builder_, PIG_TUPLE)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_TUPLE);
    result_ = result_ && implicit_tuple_type(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // TUPLE '(' ( explicit_type_cast ( ',' explicit_type_cast )* )? ')'
  static boolean explicit_tuple_type_cast(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "explicit_tuple_type_cast")) return false;
    if (!nextTokenIs(builder_, PIG_TUPLE)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_TUPLE);
    result_ = result_ && consumeToken(builder_, PIG_LP);
    result_ = result_ && explicit_tuple_type_cast_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_RP);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // ( explicit_type_cast ( ',' explicit_type_cast )* )?
  private static boolean explicit_tuple_type_cast_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "explicit_tuple_type_cast_2")) return false;
    explicit_tuple_type_cast_2_0(builder_, level_ + 1);
    return true;
  }

  // explicit_type_cast ( ',' explicit_type_cast )*
  private static boolean explicit_tuple_type_cast_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "explicit_tuple_type_cast_2_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = explicit_type_cast(builder_, level_ + 1);
    result_ = result_ && explicit_tuple_type_cast_2_0_1(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // ( ',' explicit_type_cast )*
  private static boolean explicit_tuple_type_cast_2_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "explicit_tuple_type_cast_2_0_1")) return false;
    int offset_ = builder_.getCurrentOffset();
    while (true) {
      if (!explicit_tuple_type_cast_2_0_1_0(builder_, level_ + 1)) break;
      int next_offset_ = builder_.getCurrentOffset();
      if (offset_ == next_offset_) {
        empty_element_parsed_guard_(builder_, offset_, "explicit_tuple_type_cast_2_0_1");
        break;
      }
      offset_ = next_offset_;
    }
    return true;
  }

  // ',' explicit_type_cast
  private static boolean explicit_tuple_type_cast_2_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "explicit_tuple_type_cast_2_0_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_COMMA);
    result_ = result_ && explicit_type_cast(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // simple_type | explicit_tuple_type | explicit_bag_type | explicit_map_type
  public static boolean explicit_type(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "explicit_type")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<explicit type>");
    result_ = simple_type(builder_, level_ + 1);
    if (!result_) result_ = explicit_tuple_type(builder_, level_ + 1);
    if (!result_) result_ = explicit_bag_type(builder_, level_ + 1);
    if (!result_) result_ = explicit_map_type(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_EXPLICIT_TYPE);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // simple_type | explicit_map_type | explicit_tuple_type_cast | explicit_bag_type_cast
  public static boolean explicit_type_cast(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "explicit_type_cast")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<explicit type cast>");
    result_ = simple_type(builder_, level_ + 1);
    if (!result_) result_ = explicit_map_type(builder_, level_ + 1);
    if (!result_) result_ = explicit_tuple_type_cast(builder_, level_ + 1);
    if (!result_) result_ = explicit_bag_type_cast(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_EXPLICIT_TYPE_CAST);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // multi_expr ( ( '+' | '-' ) multi_expr )*
  public static boolean expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<expr>");
    result_ = multi_expr(builder_, level_ + 1);
    result_ = result_ && expr_1(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_EXPR);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // ( ( '+' | '-' ) multi_expr )*
  private static boolean expr_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_1")) return false;
    int offset_ = builder_.getCurrentOffset();
    while (true) {
      if (!expr_1_0(builder_, level_ + 1)) break;
      int next_offset_ = builder_.getCurrentOffset();
      if (offset_ == next_offset_) {
        empty_element_parsed_guard_(builder_, offset_, "expr_1");
        break;
      }
      offset_ = next_offset_;
    }
    return true;
  }

  // ( '+' | '-' ) multi_expr
  private static boolean expr_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = expr_1_0_0(builder_, level_ + 1);
    result_ = result_ && multi_expr(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // '+' | '-'
  private static boolean expr_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "expr_1_0_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_PLUS);
    if (!result_) result_ = consumeToken(builder_, PIG_MINUS);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // explicit_field_def
  //           | implicit_type
  public static boolean field_def(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "field_def")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<field def>");
    result_ = explicit_field_def(builder_, level_ + 1);
    if (!result_) result_ = implicit_type(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_FIELD_DEF);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // field_def ( ',' field_def )*
  public static boolean field_def_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "field_def_list")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<field def list>");
    result_ = field_def(builder_, level_ + 1);
    result_ = result_ && field_def_list_1(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_FIELD_DEF_LIST);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // ( ',' field_def )*
  private static boolean field_def_list_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "field_def_list_1")) return false;
    int offset_ = builder_.getCurrentOffset();
    while (true) {
      if (!field_def_list_1_0(builder_, level_ + 1)) break;
      int next_offset_ = builder_.getCurrentOffset();
      if (offset_ == next_offset_) {
        empty_element_parsed_guard_(builder_, offset_, "field_def_list_1");
        break;
      }
      offset_ = next_offset_;
    }
    return true;
  }

  // ',' field_def
  private static boolean field_def_list_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "field_def_list_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_COMMA);
    result_ = result_ && field_def(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // FILTER rel BY (('(' cond ')') | cond)
  public static boolean filter_clause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "filter_clause")) return false;
    if (!nextTokenIs(builder_, PIG_FILTER)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_FILTER);
    result_ = result_ && rel(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_BY);
    result_ = result_ && filter_clause_3(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_FILTER_CLAUSE);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  // ('(' cond ')') | cond
  private static boolean filter_clause_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "filter_clause_3")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = filter_clause_3_0(builder_, level_ + 1);
    if (!result_) result_ = cond(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // '(' cond ')'
  private static boolean filter_clause_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "filter_clause_3_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_LP);
    result_ = result_ && cond(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_RP);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // FLATTEN '(' expr ')'
  public static boolean flatten_clause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "flatten_clause")) return false;
    if (!nextTokenIs(builder_, PIG_FLATTEN)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_FLATTEN);
    result_ = result_ && consumeToken(builder_, PIG_LP);
    result_ = result_ && expr(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_RP);
    if (result_) {
      marker_.done(PIG_FLATTEN_CLAUSE);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  /* ********************************************************** */
  // flatten_clause generate_as_clause? | real_arg generate_as_clause?
  public static boolean flatten_generated_item(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "flatten_generated_item")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<flatten generated item>");
    result_ = flatten_generated_item_0(builder_, level_ + 1);
    if (!result_) result_ = flatten_generated_item_1(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_FLATTEN_GENERATED_ITEM);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // flatten_clause generate_as_clause?
  private static boolean flatten_generated_item_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "flatten_generated_item_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = flatten_clause(builder_, level_ + 1);
    result_ = result_ && flatten_generated_item_0_1(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // generate_as_clause?
  private static boolean flatten_generated_item_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "flatten_generated_item_0_1")) return false;
    generate_as_clause(builder_, level_ + 1);
    return true;
  }

  // real_arg generate_as_clause?
  private static boolean flatten_generated_item_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "flatten_generated_item_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = real_arg(builder_, level_ + 1);
    result_ = result_ && flatten_generated_item_1_1(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // generate_as_clause?
  private static boolean flatten_generated_item_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "flatten_generated_item_1_1")) return false;
    generate_as_clause(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // '{' nested_blk '}'
  public static boolean foreach_plan_complex(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "foreach_plan_complex")) return false;
    if (!nextTokenIs(builder_, PIG_LBRACE)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_LBRACE);
    result_ = result_ && nested_blk(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_RBRACE);
    if (result_) {
      marker_.done(PIG_FOREACH_PLAN_COMPLEX);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  /* ********************************************************** */
  // GENERATE flatten_generated_item ( ',' flatten_generated_item )*
  public static boolean foreach_plan_simple(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "foreach_plan_simple")) return false;
    if (!nextTokenIs(builder_, PIG_GENERATE)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_GENERATE);
    result_ = result_ && flatten_generated_item(builder_, level_ + 1);
    result_ = result_ && foreach_plan_simple_2(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_FOREACH_PLAN_SIMPLE);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  // ( ',' flatten_generated_item )*
  private static boolean foreach_plan_simple_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "foreach_plan_simple_2")) return false;
    int offset_ = builder_.getCurrentOffset();
    while (true) {
      if (!foreach_plan_simple_2_0(builder_, level_ + 1)) break;
      int next_offset_ = builder_.getCurrentOffset();
      if (offset_ == next_offset_) {
        empty_element_parsed_guard_(builder_, offset_, "foreach_plan_simple_2");
        break;
      }
      offset_ = next_offset_;
    }
    return true;
  }

  // ',' flatten_generated_item
  private static boolean foreach_plan_simple_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "foreach_plan_simple_2_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_COMMA);
    result_ = result_ && flatten_generated_item(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // '=>' FOREACH rel ( foreach_plan_complex | ( foreach_plan_simple parallel_clause? ';' ) )
  //                   | ( IDENTIFIER '=' )? FOREACH rel ( foreach_plan_complex | ( foreach_plan_simple parallel_clause? ';' ) )
  public static boolean foreach_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "foreach_statement")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<foreach statement>");
    result_ = foreach_statement_0(builder_, level_ + 1);
    if (!result_) result_ = foreach_statement_1(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_FOREACH_STATEMENT);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // '=>' FOREACH rel ( foreach_plan_complex | ( foreach_plan_simple parallel_clause? ';' ) )
  private static boolean foreach_statement_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "foreach_statement_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, "=>");
    result_ = result_ && consumeToken(builder_, PIG_FOREACH);
    result_ = result_ && rel(builder_, level_ + 1);
    result_ = result_ && foreach_statement_0_3(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // foreach_plan_complex | ( foreach_plan_simple parallel_clause? ';' )
  private static boolean foreach_statement_0_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "foreach_statement_0_3")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = foreach_plan_complex(builder_, level_ + 1);
    if (!result_) result_ = foreach_statement_0_3_1(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // foreach_plan_simple parallel_clause? ';'
  private static boolean foreach_statement_0_3_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "foreach_statement_0_3_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = foreach_plan_simple(builder_, level_ + 1);
    result_ = result_ && foreach_statement_0_3_1_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_SIMI);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // parallel_clause?
  private static boolean foreach_statement_0_3_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "foreach_statement_0_3_1_1")) return false;
    parallel_clause(builder_, level_ + 1);
    return true;
  }

  // ( IDENTIFIER '=' )? FOREACH rel ( foreach_plan_complex | ( foreach_plan_simple parallel_clause? ';' ) )
  private static boolean foreach_statement_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "foreach_statement_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = foreach_statement_1_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_FOREACH);
    result_ = result_ && rel(builder_, level_ + 1);
    result_ = result_ && foreach_statement_1_3(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // ( IDENTIFIER '=' )?
  private static boolean foreach_statement_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "foreach_statement_1_0")) return false;
    foreach_statement_1_0_0(builder_, level_ + 1);
    return true;
  }

  // IDENTIFIER '='
  private static boolean foreach_statement_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "foreach_statement_1_0_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = IDENTIFIER(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_EQUAL);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // foreach_plan_complex | ( foreach_plan_simple parallel_clause? ';' )
  private static boolean foreach_statement_1_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "foreach_statement_1_3")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = foreach_plan_complex(builder_, level_ + 1);
    if (!result_) result_ = foreach_statement_1_3_1(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // foreach_plan_simple parallel_clause? ';'
  private static boolean foreach_statement_1_3_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "foreach_statement_1_3_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = foreach_plan_simple(builder_, level_ + 1);
    result_ = result_ && foreach_statement_1_3_1_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_SIMI);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // parallel_clause?
  private static boolean foreach_statement_1_3_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "foreach_statement_1_3_1_1")) return false;
    parallel_clause(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // func_args_string ( ',' func_args_string )*
  public static boolean func_args(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "func_args")) return false;
    if (!nextTokenIs(builder_, PIG_MULTILINE_QUOTEDSTRING) && !nextTokenIs(builder_, PIG_QUOTEDSTRING)
        && replaceVariants(builder_, 2, "<func args>")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<func args>");
    result_ = func_args_string(builder_, level_ + 1);
    result_ = result_ && func_args_1(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_FUNC_ARGS);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // ( ',' func_args_string )*
  private static boolean func_args_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "func_args_1")) return false;
    int offset_ = builder_.getCurrentOffset();
    while (true) {
      if (!func_args_1_0(builder_, level_ + 1)) break;
      int next_offset_ = builder_.getCurrentOffset();
      if (offset_ == next_offset_) {
        empty_element_parsed_guard_(builder_, offset_, "func_args_1");
        break;
      }
      offset_ = next_offset_;
    }
    return true;
  }

  // ',' func_args_string
  private static boolean func_args_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "func_args_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_COMMA);
    result_ = result_ && func_args_string(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // QUOTEDSTRING | MULTILINE_QUOTEDSTRING
  public static boolean func_args_string(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "func_args_string")) return false;
    if (!nextTokenIs(builder_, PIG_MULTILINE_QUOTEDSTRING) && !nextTokenIs(builder_, PIG_QUOTEDSTRING)
        && replaceVariants(builder_, 2, "<func args string>")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<func args string>");
    result_ = consumeToken(builder_, PIG_QUOTEDSTRING);
    if (!result_) result_ = consumeToken(builder_, PIG_MULTILINE_QUOTEDSTRING);
    if (result_) {
      marker_.done(PIG_FUNC_ARGS_STRING);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // func_name_with_args |  func_name_zero_args | func_name
  public static boolean func_clause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "func_clause")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<func clause>");
    result_ = func_name_with_args(builder_, level_ + 1);
    if (!result_) result_ = func_name_zero_args(builder_, level_ + 1);
    if (!result_) result_ = func_name(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_FUNC_CLAUSE);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // eid ( ( '.' | '$' ) eid )*
  public static boolean func_name(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "func_name")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<func name>");
    result_ = eid(builder_, level_ + 1);
    result_ = result_ && func_name_1(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_FUNC_NAME);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // ( ( '.' | '$' ) eid )*
  private static boolean func_name_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "func_name_1")) return false;
    int offset_ = builder_.getCurrentOffset();
    while (true) {
      if (!func_name_1_0(builder_, level_ + 1)) break;
      int next_offset_ = builder_.getCurrentOffset();
      if (offset_ == next_offset_) {
        empty_element_parsed_guard_(builder_, offset_, "func_name_1");
        break;
      }
      offset_ = next_offset_;
    }
    return true;
  }

  // ( '.' | '$' ) eid
  private static boolean func_name_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "func_name_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = func_name_1_0_0(builder_, level_ + 1);
    result_ = result_ && eid(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // '.' | '$'
  private static boolean func_name_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "func_name_1_0_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_DOT);
    if (!result_) result_ = consumeToken(builder_, PIG_DOLLARVAR);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // ( ( '$' | '.' ) eid )+
  public static boolean func_name_suffix(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "func_name_suffix")) return false;
    if (!nextTokenIs(builder_, PIG_DOLLARVAR) && !nextTokenIs(builder_, PIG_DOT)
        && replaceVariants(builder_, 2, "<func name suffix>")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<func name suffix>");
    result_ = func_name_suffix_0(builder_, level_ + 1);
    int offset_ = builder_.getCurrentOffset();
    while (result_) {
      if (!func_name_suffix_0(builder_, level_ + 1)) break;
      int next_offset_ = builder_.getCurrentOffset();
      if (offset_ == next_offset_) {
        empty_element_parsed_guard_(builder_, offset_, "func_name_suffix");
        break;
      }
      offset_ = next_offset_;
    }
    if (result_) {
      marker_.done(PIG_FUNC_NAME_SUFFIX);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // ( '$' | '.' ) eid
  private static boolean func_name_suffix_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "func_name_suffix_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = func_name_suffix_0_0(builder_, level_ + 1);
    result_ = result_ && eid(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // '$' | '.'
  private static boolean func_name_suffix_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "func_name_suffix_0_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_DOLLARVAR);
    if (!result_) result_ = consumeToken(builder_, PIG_DOT);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // func_name '(' func_args ')'
  static boolean func_name_with_args(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "func_name_with_args")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = func_name(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_LP);
    result_ = result_ && func_args(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_RP);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // eid_without_columns ( ( '.' | '$' ) eid )*
  public static boolean func_name_without_columns(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "func_name_without_columns")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<func name without columns>");
    result_ = eid_without_columns(builder_, level_ + 1);
    result_ = result_ && func_name_without_columns_1(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_FUNC_NAME_WITHOUT_COLUMNS);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // ( ( '.' | '$' ) eid )*
  private static boolean func_name_without_columns_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "func_name_without_columns_1")) return false;
    int offset_ = builder_.getCurrentOffset();
    while (true) {
      if (!func_name_without_columns_1_0(builder_, level_ + 1)) break;
      int next_offset_ = builder_.getCurrentOffset();
      if (offset_ == next_offset_) {
        empty_element_parsed_guard_(builder_, offset_, "func_name_without_columns_1");
        break;
      }
      offset_ = next_offset_;
    }
    return true;
  }

  // ( '.' | '$' ) eid
  private static boolean func_name_without_columns_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "func_name_without_columns_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = func_name_without_columns_1_0_0(builder_, level_ + 1);
    result_ = result_ && eid(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // '.' | '$'
  private static boolean func_name_without_columns_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "func_name_without_columns_1_0_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_DOT);
    if (!result_) result_ = consumeToken(builder_, PIG_DOLLARVAR);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // func_name '(' ')'
  static boolean func_name_zero_args(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "func_name_zero_args")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = func_name(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_LP);
    result_ = result_ && consumeToken(builder_, PIG_RP);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // func_name_without_columns '(' arg_list? ')' projection*
  static boolean function_name_with_columns(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_name_with_columns")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = func_name_without_columns(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_LP);
    result_ = result_ && function_name_with_columns_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_RP);
    result_ = result_ && function_name_with_columns_4(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // arg_list?
  private static boolean function_name_with_columns_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_name_with_columns_2")) return false;
    arg_list(builder_, level_ + 1);
    return true;
  }

  // projection*
  private static boolean function_name_with_columns_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "function_name_with_columns_4")) return false;
    int offset_ = builder_.getCurrentOffset();
    while (true) {
      if (!projection(builder_, level_ + 1)) break;
      int next_offset_ = builder_.getCurrentOffset();
      if (offset_ == next_offset_) {
        empty_element_parsed_guard_(builder_, offset_, "function_name_with_columns_4");
        break;
      }
      offset_ = next_offset_;
    }
    return true;
  }

  /* ********************************************************** */
  // identifier_assignment? (( op_clause parallel_clause? ) | nested_op_clause )
  static boolean general_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "general_statement")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = general_statement_0(builder_, level_ + 1);
    result_ = result_ && general_statement_1(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // identifier_assignment?
  private static boolean general_statement_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "general_statement_0")) return false;
    identifier_assignment(builder_, level_ + 1);
    return true;
  }

  // ( op_clause parallel_clause? ) | nested_op_clause
  private static boolean general_statement_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "general_statement_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = general_statement_1_0(builder_, level_ + 1);
    if (!result_) result_ = nested_op_clause(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // op_clause parallel_clause?
  private static boolean general_statement_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "general_statement_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = op_clause(builder_, level_ + 1);
    result_ = result_ && general_statement_1_0_1(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // parallel_clause?
  private static boolean general_statement_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "general_statement_1_0_1")) return false;
    parallel_clause(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // AS ( ( '(' field_def_list ')' ) | explicit_field_def )
  public static boolean generate_as_clause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "generate_as_clause")) return false;
    if (!nextTokenIs(builder_, PIG_AS)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_AS);
    result_ = result_ && generate_as_clause_1(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_GENERATE_AS_CLAUSE);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  // ( '(' field_def_list ')' ) | explicit_field_def
  private static boolean generate_as_clause_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "generate_as_clause_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = generate_as_clause_1_0(builder_, level_ + 1);
    if (!result_) result_ = explicit_field_def(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // '(' field_def_list ')'
  private static boolean generate_as_clause_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "generate_as_clause_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_LP);
    result_ = result_ && field_def_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_RP);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // ( GROUP | COGROUP ) group_item_list ( USING QUOTEDSTRING )? partition_clause?
  public static boolean group_clause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "group_clause")) return false;
    if (!nextTokenIs(builder_, PIG_COGROUP) && !nextTokenIs(builder_, PIG_GROUP)
        && replaceVariants(builder_, 2, "<group clause>")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<group clause>");
    result_ = group_clause_0(builder_, level_ + 1);
    result_ = result_ && group_item_list(builder_, level_ + 1);
    result_ = result_ && group_clause_2(builder_, level_ + 1);
    result_ = result_ && group_clause_3(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_GROUP_CLAUSE);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // GROUP | COGROUP
  private static boolean group_clause_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "group_clause_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_GROUP);
    if (!result_) result_ = consumeToken(builder_, PIG_COGROUP);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // ( USING QUOTEDSTRING )?
  private static boolean group_clause_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "group_clause_2")) return false;
    group_clause_2_0(builder_, level_ + 1);
    return true;
  }

  // USING QUOTEDSTRING
  private static boolean group_clause_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "group_clause_2_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeTokens(builder_, 0, PIG_USING, PIG_QUOTEDSTRING);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // partition_clause?
  private static boolean group_clause_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "group_clause_3")) return false;
    partition_clause(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // rel ( join_group_by_clause | ALL | ANY ) ( INNER | OUTER )?
  public static boolean group_item(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "group_item")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<group item>");
    result_ = rel(builder_, level_ + 1);
    result_ = result_ && group_item_1(builder_, level_ + 1);
    result_ = result_ && group_item_2(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_GROUP_ITEM);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // join_group_by_clause | ALL | ANY
  private static boolean group_item_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "group_item_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = join_group_by_clause(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, PIG_ALL);
    if (!result_) result_ = consumeToken(builder_, PIG_ANY);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // ( INNER | OUTER )?
  private static boolean group_item_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "group_item_2")) return false;
    group_item_2_0(builder_, level_ + 1);
    return true;
  }

  // INNER | OUTER
  private static boolean group_item_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "group_item_2_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_INNER);
    if (!result_) result_ = consumeToken(builder_, PIG_OUTER);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // group_item ( ',' group_item )*
  static boolean group_item_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "group_item_list")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = group_item(builder_, level_ + 1);
    result_ = result_ && group_item_list_1(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // ( ',' group_item )*
  private static boolean group_item_list_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "group_item_list_1")) return false;
    int offset_ = builder_.getCurrentOffset();
    while (true) {
      if (!group_item_list_1_0(builder_, level_ + 1)) break;
      int next_offset_ = builder_.getCurrentOffset();
      if (offset_ == next_offset_) {
        empty_element_parsed_guard_(builder_, offset_, "group_item_list_1");
        break;
      }
      offset_ = next_offset_;
    }
    return true;
  }

  // ',' group_item
  private static boolean group_item_list_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "group_item_list_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_COMMA);
    result_ = result_ && group_item(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // (IDENTIFIER '=') | ('=>')
  static boolean identifier_assignment(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "identifier_assignment")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = identifier_assignment_0(builder_, level_ + 1);
    if (!result_) result_ = identifier_assignment_1(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // IDENTIFIER '='
  private static boolean identifier_assignment_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "identifier_assignment_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = IDENTIFIER(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_EQUAL);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // ('=>')
  private static boolean identifier_assignment_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "identifier_assignment_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, "=>");
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // IDENTIFIER func_name_suffix? '(' arg_list? ')' projection*
  static boolean identifier_with_function(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "identifier_with_function")) return false;
    if (!nextTokenIs(builder_, PIG_ID)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = IDENTIFIER(builder_, level_ + 1);
    result_ = result_ && identifier_with_function_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_LP);
    result_ = result_ && identifier_with_function_3(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_RP);
    result_ = result_ && identifier_with_function_5(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // func_name_suffix?
  private static boolean identifier_with_function_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "identifier_with_function_1")) return false;
    func_name_suffix(builder_, level_ + 1);
    return true;
  }

  // arg_list?
  private static boolean identifier_with_function_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "identifier_with_function_3")) return false;
    arg_list(builder_, level_ + 1);
    return true;
  }

  // projection*
  private static boolean identifier_with_function_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "identifier_with_function_5")) return false;
    int offset_ = builder_.getCurrentOffset();
    while (true) {
      if (!projection(builder_, level_ + 1)) break;
      int next_offset_ = builder_.getCurrentOffset();
      if (offset_ == next_offset_) {
        empty_element_parsed_guard_(builder_, offset_, "identifier_with_function_5");
        break;
      }
      offset_ = next_offset_;
    }
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER projection*
  static boolean identifier_with_projection(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "identifier_with_projection")) return false;
    if (!nextTokenIs(builder_, PIG_ID)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = IDENTIFIER(builder_, level_ + 1);
    result_ = result_ && identifier_with_projection_1(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // projection*
  private static boolean identifier_with_projection_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "identifier_with_projection_1")) return false;
    int offset_ = builder_.getCurrentOffset();
    while (true) {
      if (!projection(builder_, level_ + 1)) break;
      int next_offset_ = builder_.getCurrentOffset();
      if (offset_ == next_offset_) {
        empty_element_parsed_guard_(builder_, offset_, "identifier_with_projection_1");
        break;
      }
      offset_ = next_offset_;
    }
    return true;
  }

  /* ********************************************************** */
  // ILLUSTRATE IDENTIFIER
  public static boolean illustrate_clause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "illustrate_clause")) return false;
    if (!nextTokenIs(builder_, PIG_ILLUSTRATE)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_ILLUSTRATE);
    result_ = result_ && IDENTIFIER(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_ILLUSTRATE_CLAUSE);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  /* ********************************************************** */
  // '{' NULL ':' tuple_type? '}'
  //                   | '{' ( ( IDENTIFIER COLON )? tuple_type )? '}'
  public static boolean implicit_bag_type(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "implicit_bag_type")) return false;
    if (!nextTokenIs(builder_, PIG_LBRACE)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = implicit_bag_type_0(builder_, level_ + 1);
    if (!result_) result_ = implicit_bag_type_1(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_IMPLICIT_BAG_TYPE);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  // '{' NULL ':' tuple_type? '}'
  private static boolean implicit_bag_type_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "implicit_bag_type_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_LBRACE);
    result_ = result_ && consumeToken(builder_, PIG_NULL);
    result_ = result_ && consumeToken(builder_, PIG_COLON);
    result_ = result_ && implicit_bag_type_0_3(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_RBRACE);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // tuple_type?
  private static boolean implicit_bag_type_0_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "implicit_bag_type_0_3")) return false;
    tuple_type(builder_, level_ + 1);
    return true;
  }

  // '{' ( ( IDENTIFIER COLON )? tuple_type )? '}'
  private static boolean implicit_bag_type_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "implicit_bag_type_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_LBRACE);
    result_ = result_ && implicit_bag_type_1_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_RBRACE);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // ( ( IDENTIFIER COLON )? tuple_type )?
  private static boolean implicit_bag_type_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "implicit_bag_type_1_1")) return false;
    implicit_bag_type_1_1_0(builder_, level_ + 1);
    return true;
  }

  // ( IDENTIFIER COLON )? tuple_type
  private static boolean implicit_bag_type_1_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "implicit_bag_type_1_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = implicit_bag_type_1_1_0_0(builder_, level_ + 1);
    result_ = result_ && tuple_type(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // ( IDENTIFIER COLON )?
  private static boolean implicit_bag_type_1_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "implicit_bag_type_1_1_0_0")) return false;
    implicit_bag_type_1_1_0_0_0(builder_, level_ + 1);
    return true;
  }

  // IDENTIFIER COLON
  private static boolean implicit_bag_type_1_1_0_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "implicit_bag_type_1_1_0_0_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = IDENTIFIER(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_COLON);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // '[' type? ']'
  public static boolean implicit_map_type(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "implicit_map_type")) return false;
    if (!nextTokenIs(builder_, PIG_LBRACKET)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_LBRACKET);
    result_ = result_ && implicit_map_type_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_RBRACKET);
    if (result_) {
      marker_.done(PIG_IMPLICIT_MAP_TYPE);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  // type?
  private static boolean implicit_map_type_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "implicit_map_type_1")) return false;
    type(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // '(' field_def_list? ')'
  static boolean implicit_tuple_type(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "implicit_tuple_type")) return false;
    if (!nextTokenIs(builder_, PIG_LP)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_LP);
    result_ = result_ && implicit_tuple_type_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_RP);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // field_def_list?
  private static boolean implicit_tuple_type_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "implicit_tuple_type_1")) return false;
    field_def_list(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // implicit_tuple_type | implicit_bag_type | implicit_map_type
  public static boolean implicit_type(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "implicit_type")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<implicit type>");
    result_ = implicit_tuple_type(builder_, level_ + 1);
    if (!result_) result_ = implicit_bag_type(builder_, level_ + 1);
    if (!result_) result_ = implicit_map_type(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_IMPLICIT_TYPE);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // IMPORT QUOTEDSTRING
  public static boolean import_clause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "import_clause")) return false;
    if (!nextTokenIs(builder_, PIG_IMPORT)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, null);
    result_ = consumeTokens(builder_, 1, PIG_IMPORT, PIG_QUOTEDSTRING);
    pinned_ = result_; // pin = 1
    if (result_ || pinned_) {
      marker_.done(PIG_IMPORT_CLAUSE);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, pinned_, _SECTION_GENERAL_, null);
    return result_ || pinned_;
  }

  /* ********************************************************** */
  // inline_return_clause IDENTIFIER inline_param_clause
  static boolean inline_clause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "inline_clause")) return false;
    if (!nextTokenIs(builder_, PIG_ID)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = inline_return_clause(builder_, level_ + 1);
    result_ = result_ && IDENTIFIER(builder_, level_ + 1);
    result_ = result_ && inline_param_clause(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // '(' ( parameter (',' parameter)* )? ')'
  static boolean inline_param_clause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "inline_param_clause")) return false;
    if (!nextTokenIs(builder_, PIG_LP)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_LP);
    result_ = result_ && inline_param_clause_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_RP);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // ( parameter (',' parameter)* )?
  private static boolean inline_param_clause_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "inline_param_clause_1")) return false;
    inline_param_clause_1_0(builder_, level_ + 1);
    return true;
  }

  // parameter (',' parameter)*
  private static boolean inline_param_clause_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "inline_param_clause_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = parameter(builder_, level_ + 1);
    result_ = result_ && inline_param_clause_1_0_1(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // (',' parameter)*
  private static boolean inline_param_clause_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "inline_param_clause_1_0_1")) return false;
    int offset_ = builder_.getCurrentOffset();
    while (true) {
      if (!inline_param_clause_1_0_1_0(builder_, level_ + 1)) break;
      int next_offset_ = builder_.getCurrentOffset();
      if (offset_ == next_offset_) {
        empty_element_parsed_guard_(builder_, offset_, "inline_param_clause_1_0_1");
        break;
      }
      offset_ = next_offset_;
    }
    return true;
  }

  // ',' parameter
  private static boolean inline_param_clause_1_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "inline_param_clause_1_0_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_COMMA);
    result_ = result_ && parameter(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // IDENTIFIER '='
  // 	| IDENTIFIER (',' IDENTIFIER)+ '='
  static boolean inline_return_clause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "inline_return_clause")) return false;
    if (!nextTokenIs(builder_, PIG_ID)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = inline_return_clause_0(builder_, level_ + 1);
    if (!result_) result_ = inline_return_clause_1(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // IDENTIFIER '='
  private static boolean inline_return_clause_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "inline_return_clause_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = IDENTIFIER(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_EQUAL);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // IDENTIFIER (',' IDENTIFIER)+ '='
  private static boolean inline_return_clause_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "inline_return_clause_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = IDENTIFIER(builder_, level_ + 1);
    result_ = result_ && inline_return_clause_1_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_EQUAL);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // (',' IDENTIFIER)+
  private static boolean inline_return_clause_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "inline_return_clause_1_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = inline_return_clause_1_1_0(builder_, level_ + 1);
    int offset_ = builder_.getCurrentOffset();
    while (result_) {
      if (!inline_return_clause_1_1_0(builder_, level_ + 1)) break;
      int next_offset_ = builder_.getCurrentOffset();
      if (offset_ == next_offset_) {
        empty_element_parsed_guard_(builder_, offset_, "inline_return_clause_1_1");
        break;
      }
      offset_ = next_offset_;
    }
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // ',' IDENTIFIER
  private static boolean inline_return_clause_1_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "inline_return_clause_1_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_COMMA);
    result_ = result_ && IDENTIFIER(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // INPUT '(' stream_cmd_list ')'
  public static boolean input_clause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "input_clause")) return false;
    if (!nextTokenIs(builder_, PIG_INPUT)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_INPUT);
    result_ = result_ && consumeToken(builder_, PIG_LP);
    result_ = result_ && stream_cmd_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_RP);
    if (result_) {
      marker_.done(PIG_INPUT_CLAUSE);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  /* ********************************************************** */
  // JOIN join_sub_clause ( USING join_type )? partition_clause?
  public static boolean join_clause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "join_clause")) return false;
    if (!nextTokenIs(builder_, PIG_JOIN)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_JOIN);
    result_ = result_ && join_sub_clause(builder_, level_ + 1);
    result_ = result_ && join_clause_2(builder_, level_ + 1);
    result_ = result_ && join_clause_3(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_JOIN_CLAUSE);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  // ( USING join_type )?
  private static boolean join_clause_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "join_clause_2")) return false;
    join_clause_2_0(builder_, level_ + 1);
    return true;
  }

  // USING join_type
  private static boolean join_clause_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "join_clause_2_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_USING);
    result_ = result_ && join_type(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // partition_clause?
  private static boolean join_clause_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "join_clause_3")) return false;
    partition_clause(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // BY (('(' arg_list ')') |  real_arg )
  public static boolean join_group_by_clause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "join_group_by_clause")) return false;
    if (!nextTokenIs(builder_, PIG_BY)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_BY);
    result_ = result_ && join_group_by_clause_1(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_JOIN_GROUP_BY_CLAUSE);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  // ('(' arg_list ')') |  real_arg
  private static boolean join_group_by_clause_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "join_group_by_clause_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = join_group_by_clause_1_0(builder_, level_ + 1);
    if (!result_) result_ = real_arg(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // '(' arg_list ')'
  private static boolean join_group_by_clause_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "join_group_by_clause_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_LP);
    result_ = result_ && arg_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_RP);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // rel join_group_by_clause
  public static boolean join_item(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "join_item")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<join item>");
    result_ = rel(builder_, level_ + 1);
    result_ = result_ && join_group_by_clause(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_JOIN_ITEM);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // join_item ( ( ( LEFT | RIGHT | FULL ) OUTER? ',' join_item ) | ( ( ',' join_item )+ ) )
  public static boolean join_sub_clause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "join_sub_clause")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<join sub clause>");
    result_ = join_item(builder_, level_ + 1);
    result_ = result_ && join_sub_clause_1(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_JOIN_SUB_CLAUSE);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // ( ( LEFT | RIGHT | FULL ) OUTER? ',' join_item ) | ( ( ',' join_item )+ )
  private static boolean join_sub_clause_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "join_sub_clause_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = join_sub_clause_1_0(builder_, level_ + 1);
    if (!result_) result_ = join_sub_clause_1_1(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // ( LEFT | RIGHT | FULL ) OUTER? ',' join_item
  private static boolean join_sub_clause_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "join_sub_clause_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = join_sub_clause_1_0_0(builder_, level_ + 1);
    result_ = result_ && join_sub_clause_1_0_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_COMMA);
    result_ = result_ && join_item(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // LEFT | RIGHT | FULL
  private static boolean join_sub_clause_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "join_sub_clause_1_0_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_LEFT);
    if (!result_) result_ = consumeToken(builder_, PIG_RIGHT);
    if (!result_) result_ = consumeToken(builder_, PIG_FULL);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // OUTER?
  private static boolean join_sub_clause_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "join_sub_clause_1_0_1")) return false;
    consumeToken(builder_, PIG_OUTER);
    return true;
  }

  // ( ',' join_item )+
  private static boolean join_sub_clause_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "join_sub_clause_1_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = join_sub_clause_1_1_0(builder_, level_ + 1);
    int offset_ = builder_.getCurrentOffset();
    while (result_) {
      if (!join_sub_clause_1_1_0(builder_, level_ + 1)) break;
      int next_offset_ = builder_.getCurrentOffset();
      if (offset_ == next_offset_) {
        empty_element_parsed_guard_(builder_, offset_, "join_sub_clause_1_1");
        break;
      }
      offset_ = next_offset_;
    }
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // ',' join_item
  private static boolean join_sub_clause_1_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "join_sub_clause_1_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_COMMA);
    result_ = result_ && join_item(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // QUOTEDSTRING
  public static boolean join_type(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "join_type")) return false;
    if (!nextTokenIs(builder_, PIG_QUOTEDSTRING)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_QUOTEDSTRING);
    if (result_) {
      marker_.done(PIG_JOIN_TYPE);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  /* ********************************************************** */
  // QUOTEDSTRING '#' literal
  public static boolean keyvalue(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "keyvalue")) return false;
    if (!nextTokenIs(builder_, PIG_QUOTEDSTRING)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_QUOTEDSTRING);
    result_ = result_ && consumeToken(builder_, PIG_POUND);
    result_ = result_ && literal(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_KEYVALUE);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  /* ********************************************************** */
  // LIMIT rel expr
  public static boolean limit_clause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "limit_clause")) return false;
    if (!nextTokenIs(builder_, PIG_LIMIT)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_LIMIT);
    result_ = result_ && rel(builder_, level_ + 1);
    result_ = result_ && expr(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_LIMIT_CLAUSE);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  /* ********************************************************** */
  // scalar | literal_map | literal_bag | literal_tuple
  public static boolean literal(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "literal")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<literal>");
    result_ = scalar(builder_, level_ + 1);
    if (!result_) result_ = literal_map(builder_, level_ + 1);
    if (!result_) result_ = literal_bag(builder_, level_ + 1);
    if (!result_) result_ = literal_tuple(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_LITERAL);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // '{' literal_tuple ( ',' literal_tuple )* '}'
  //             | '{' '}'
  public static boolean literal_bag(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "literal_bag")) return false;
    if (!nextTokenIs(builder_, PIG_LBRACE)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = literal_bag_0(builder_, level_ + 1);
    if (!result_) result_ = literal_bag_1(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_LITERAL_BAG);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  // '{' literal_tuple ( ',' literal_tuple )* '}'
  private static boolean literal_bag_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "literal_bag_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_LBRACE);
    result_ = result_ && literal_tuple(builder_, level_ + 1);
    result_ = result_ && literal_bag_0_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_RBRACE);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // ( ',' literal_tuple )*
  private static boolean literal_bag_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "literal_bag_0_2")) return false;
    int offset_ = builder_.getCurrentOffset();
    while (true) {
      if (!literal_bag_0_2_0(builder_, level_ + 1)) break;
      int next_offset_ = builder_.getCurrentOffset();
      if (offset_ == next_offset_) {
        empty_element_parsed_guard_(builder_, offset_, "literal_bag_0_2");
        break;
      }
      offset_ = next_offset_;
    }
    return true;
  }

  // ',' literal_tuple
  private static boolean literal_bag_0_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "literal_bag_0_2_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_COMMA);
    result_ = result_ && literal_tuple(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // '{' '}'
  private static boolean literal_bag_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "literal_bag_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_LBRACE);
    result_ = result_ && consumeToken(builder_, PIG_RBRACE);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // '[' keyvalue ( ',' keyvalue )* ']'
  //             | '[' ']'
  public static boolean literal_map(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "literal_map")) return false;
    if (!nextTokenIs(builder_, PIG_LBRACKET)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = literal_map_0(builder_, level_ + 1);
    if (!result_) result_ = literal_map_1(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_LITERAL_MAP);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  // '[' keyvalue ( ',' keyvalue )* ']'
  private static boolean literal_map_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "literal_map_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_LBRACKET);
    result_ = result_ && keyvalue(builder_, level_ + 1);
    result_ = result_ && literal_map_0_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_RBRACKET);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // ( ',' keyvalue )*
  private static boolean literal_map_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "literal_map_0_2")) return false;
    int offset_ = builder_.getCurrentOffset();
    while (true) {
      if (!literal_map_0_2_0(builder_, level_ + 1)) break;
      int next_offset_ = builder_.getCurrentOffset();
      if (offset_ == next_offset_) {
        empty_element_parsed_guard_(builder_, offset_, "literal_map_0_2");
        break;
      }
      offset_ = next_offset_;
    }
    return true;
  }

  // ',' keyvalue
  private static boolean literal_map_0_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "literal_map_0_2_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_COMMA);
    result_ = result_ && keyvalue(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // '[' ']'
  private static boolean literal_map_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "literal_map_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_LBRACKET);
    result_ = result_ && consumeToken(builder_, PIG_RBRACKET);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // '(' literal ( ',' literal )* ')'
  //               | '(' ')'
  public static boolean literal_tuple(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "literal_tuple")) return false;
    if (!nextTokenIs(builder_, PIG_LP)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = literal_tuple_0(builder_, level_ + 1);
    if (!result_) result_ = literal_tuple_1(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_LITERAL_TUPLE);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  // '(' literal ( ',' literal )* ')'
  private static boolean literal_tuple_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "literal_tuple_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_LP);
    result_ = result_ && literal(builder_, level_ + 1);
    result_ = result_ && literal_tuple_0_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_RP);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // ( ',' literal )*
  private static boolean literal_tuple_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "literal_tuple_0_2")) return false;
    int offset_ = builder_.getCurrentOffset();
    while (true) {
      if (!literal_tuple_0_2_0(builder_, level_ + 1)) break;
      int next_offset_ = builder_.getCurrentOffset();
      if (offset_ == next_offset_) {
        empty_element_parsed_guard_(builder_, offset_, "literal_tuple_0_2");
        break;
      }
      offset_ = next_offset_;
    }
    return true;
  }

  // ',' literal
  private static boolean literal_tuple_0_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "literal_tuple_0_2_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_COMMA);
    result_ = result_ && literal(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // '(' ')'
  private static boolean literal_tuple_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "literal_tuple_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_LP);
    result_ = result_ && consumeToken(builder_, PIG_RP);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // LOAD QUOTEDSTRING ( USING func_clause )? as_clause?
  public static boolean load_clause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "load_clause")) return false;
    if (!nextTokenIs(builder_, PIG_LOAD)) return false;
    boolean result_ = false;
    boolean pinned_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, null);
    result_ = consumeTokens(builder_, 1, PIG_LOAD, PIG_QUOTEDSTRING);
    pinned_ = result_; // pin = 1
    result_ = result_ && report_error_(builder_, load_clause_2(builder_, level_ + 1));
    result_ = pinned_ && load_clause_3(builder_, level_ + 1) && result_;
    if (result_ || pinned_) {
      marker_.done(PIG_LOAD_CLAUSE);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, pinned_, _SECTION_GENERAL_, null);
    return result_ || pinned_;
  }

  // ( USING func_clause )?
  private static boolean load_clause_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "load_clause_2")) return false;
    load_clause_2_0(builder_, level_ + 1);
    return true;
  }

  // USING func_clause
  private static boolean load_clause_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "load_clause_2_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_USING);
    result_ = result_ && func_clause(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // as_clause?
  private static boolean load_clause_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "load_clause_3")) return false;
    as_clause(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // macro_content
  static boolean macro_body_clause(PsiBuilder builder_, int level_) {
    return macro_content(builder_, level_ + 1);
  }

  /* ********************************************************** */
  // macro_param_clause macro_return_clause macro_body_clause
  static boolean macro_clause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "macro_clause")) return false;
    if (!nextTokenIs(builder_, PIG_LP)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = macro_param_clause(builder_, level_ + 1);
    result_ = result_ && macro_return_clause(builder_, level_ + 1);
    result_ = result_ && macro_body_clause(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // '{' ( macro_content | !('{' | '}') )* '}'
  static boolean macro_content(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "macro_content")) return false;
    if (!nextTokenIs(builder_, PIG_LBRACE)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_LBRACE);
    result_ = result_ && macro_content_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_RBRACE);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // ( macro_content | !('{' | '}') )*
  private static boolean macro_content_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "macro_content_1")) return false;
    int offset_ = builder_.getCurrentOffset();
    while (true) {
      if (!macro_content_1_0(builder_, level_ + 1)) break;
      int next_offset_ = builder_.getCurrentOffset();
      if (offset_ == next_offset_) {
        empty_element_parsed_guard_(builder_, offset_, "macro_content_1");
        break;
      }
      offset_ = next_offset_;
    }
    return true;
  }

  // macro_content | !('{' | '}')
  private static boolean macro_content_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "macro_content_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = macro_content(builder_, level_ + 1);
    if (!result_) result_ = macro_content_1_0_1(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // !('{' | '}')
  private static boolean macro_content_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "macro_content_1_0_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_NOT_, null);
    result_ = !macro_content_1_0_1_0(builder_, level_ + 1);
    marker_.rollbackTo();
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_NOT_, null);
    return result_;
  }

  // '{' | '}'
  private static boolean macro_content_1_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "macro_content_1_0_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_LBRACE);
    if (!result_) result_ = consumeToken(builder_, PIG_RBRACE);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // '(' ( IDENTIFIER (',' IDENTIFIER)* )? ')'
  static boolean macro_param_clause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "macro_param_clause")) return false;
    if (!nextTokenIs(builder_, PIG_LP)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_LP);
    result_ = result_ && macro_param_clause_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_RP);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // ( IDENTIFIER (',' IDENTIFIER)* )?
  private static boolean macro_param_clause_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "macro_param_clause_1")) return false;
    macro_param_clause_1_0(builder_, level_ + 1);
    return true;
  }

  // IDENTIFIER (',' IDENTIFIER)*
  private static boolean macro_param_clause_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "macro_param_clause_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = IDENTIFIER(builder_, level_ + 1);
    result_ = result_ && macro_param_clause_1_0_1(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // (',' IDENTIFIER)*
  private static boolean macro_param_clause_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "macro_param_clause_1_0_1")) return false;
    int offset_ = builder_.getCurrentOffset();
    while (true) {
      if (!macro_param_clause_1_0_1_0(builder_, level_ + 1)) break;
      int next_offset_ = builder_.getCurrentOffset();
      if (offset_ == next_offset_) {
        empty_element_parsed_guard_(builder_, offset_, "macro_param_clause_1_0_1");
        break;
      }
      offset_ = next_offset_;
    }
    return true;
  }

  // ',' IDENTIFIER
  private static boolean macro_param_clause_1_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "macro_param_clause_1_0_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_COMMA);
    result_ = result_ && IDENTIFIER(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // RETURNS ((IDENTIFIER (',' IDENTIFIER)*) | VOID)
  static boolean macro_return_clause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "macro_return_clause")) return false;
    if (!nextTokenIs(builder_, PIG_RETURNS)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_RETURNS);
    result_ = result_ && macro_return_clause_1(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // (IDENTIFIER (',' IDENTIFIER)*) | VOID
  private static boolean macro_return_clause_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "macro_return_clause_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = macro_return_clause_1_0(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, PIG_VOID);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // IDENTIFIER (',' IDENTIFIER)*
  private static boolean macro_return_clause_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "macro_return_clause_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = IDENTIFIER(builder_, level_ + 1);
    result_ = result_ && macro_return_clause_1_0_1(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // (',' IDENTIFIER)*
  private static boolean macro_return_clause_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "macro_return_clause_1_0_1")) return false;
    int offset_ = builder_.getCurrentOffset();
    while (true) {
      if (!macro_return_clause_1_0_1_0(builder_, level_ + 1)) break;
      int next_offset_ = builder_.getCurrentOffset();
      if (offset_ == next_offset_) {
        empty_element_parsed_guard_(builder_, offset_, "macro_return_clause_1_0_1");
        break;
      }
      offset_ = next_offset_;
    }
    return true;
  }

  // ',' IDENTIFIER
  private static boolean macro_return_clause_1_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "macro_return_clause_1_0_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_COMMA);
    result_ = result_ && IDENTIFIER(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // implicit_map_type | explicit_map_type
  public static boolean map_type(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "map_type")) return false;
    if (!nextTokenIs(builder_, PIG_LBRACKET) && !nextTokenIs(builder_, PIG_MAP)
        && replaceVariants(builder_, 2, "<map type>")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<map type>");
    result_ = implicit_map_type(builder_, level_ + 1);
    if (!result_) result_ = explicit_map_type(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_MAP_TYPE);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // MAPREDUCE QUOTEDSTRING ( '(' path_list ')' )? store_clause load_clause EXECCOMMAND?
  public static boolean mr_clause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "mr_clause")) return false;
    if (!nextTokenIs(builder_, PIG_MAPREDUCE)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeTokens(builder_, 0, PIG_MAPREDUCE, PIG_QUOTEDSTRING);
    result_ = result_ && mr_clause_2(builder_, level_ + 1);
    result_ = result_ && store_clause(builder_, level_ + 1);
    result_ = result_ && load_clause(builder_, level_ + 1);
    result_ = result_ && mr_clause_5(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_MR_CLAUSE);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  // ( '(' path_list ')' )?
  private static boolean mr_clause_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "mr_clause_2")) return false;
    mr_clause_2_0(builder_, level_ + 1);
    return true;
  }

  // '(' path_list ')'
  private static boolean mr_clause_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "mr_clause_2_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_LP);
    result_ = result_ && path_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_RP);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // EXECCOMMAND?
  private static boolean mr_clause_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "mr_clause_5")) return false;
    consumeToken(builder_, PIG_EXECCOMMAND);
    return true;
  }

  /* ********************************************************** */
  // cast_expr ( ( '*' | '/' | '%' ) cast_expr )*
  public static boolean multi_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "multi_expr")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<multi expr>");
    result_ = cast_expr(builder_, level_ + 1);
    result_ = result_ && multi_expr_1(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_MULTI_EXPR);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // ( ( '*' | '/' | '%' ) cast_expr )*
  private static boolean multi_expr_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "multi_expr_1")) return false;
    int offset_ = builder_.getCurrentOffset();
    while (true) {
      if (!multi_expr_1_0(builder_, level_ + 1)) break;
      int next_offset_ = builder_.getCurrentOffset();
      if (offset_ == next_offset_) {
        empty_element_parsed_guard_(builder_, offset_, "multi_expr_1");
        break;
      }
      offset_ = next_offset_;
    }
    return true;
  }

  // ( '*' | '/' | '%' ) cast_expr
  private static boolean multi_expr_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "multi_expr_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = multi_expr_1_0_0(builder_, level_ + 1);
    result_ = result_ && cast_expr(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // '*' | '/' | '%'
  private static boolean multi_expr_1_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "multi_expr_1_0_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_STAR);
    if (!result_) result_ = consumeToken(builder_, PIG_DIV);
    if (!result_) result_ = consumeToken(builder_, PIG_PERCENT);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // ( nested_command ';' )* GENERATE flatten_generated_item ( ',' flatten_generated_item )* ';'
  public static boolean nested_blk(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "nested_blk")) return false;
    if (!nextTokenIs(builder_, PIG_GENERATE) && !nextTokenIs(builder_, PIG_ID)
        && replaceVariants(builder_, 2, "<nested blk>")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<nested blk>");
    result_ = nested_blk_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_GENERATE);
    result_ = result_ && flatten_generated_item(builder_, level_ + 1);
    result_ = result_ && nested_blk_3(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_SIMI);
    if (result_) {
      marker_.done(PIG_NESTED_BLK);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // ( nested_command ';' )*
  private static boolean nested_blk_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "nested_blk_0")) return false;
    int offset_ = builder_.getCurrentOffset();
    while (true) {
      if (!nested_blk_0_0(builder_, level_ + 1)) break;
      int next_offset_ = builder_.getCurrentOffset();
      if (offset_ == next_offset_) {
        empty_element_parsed_guard_(builder_, offset_, "nested_blk_0");
        break;
      }
      offset_ = next_offset_;
    }
    return true;
  }

  // nested_command ';'
  private static boolean nested_blk_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "nested_blk_0_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = nested_command(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_SIMI);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // ( ',' flatten_generated_item )*
  private static boolean nested_blk_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "nested_blk_3")) return false;
    int offset_ = builder_.getCurrentOffset();
    while (true) {
      if (!nested_blk_3_0(builder_, level_ + 1)) break;
      int next_offset_ = builder_.getCurrentOffset();
      if (offset_ == next_offset_) {
        empty_element_parsed_guard_(builder_, offset_, "nested_blk_3");
        break;
      }
      offset_ = next_offset_;
    }
    return true;
  }

  // ',' flatten_generated_item
  private static boolean nested_blk_3_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "nested_blk_3_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_COMMA);
    result_ = result_ && flatten_generated_item(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // ( IDENTIFIER '=' col_ref '.' col_ref_list { input'.'LA( 1 ) '==' ';' }? ) '=>' ( IDENTIFIER '=' nested_proj )
  //                | IDENTIFIER '=' expr
  //                | IDENTIFIER '=' nested_op
  public static boolean nested_command(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "nested_command")) return false;
    if (!nextTokenIs(builder_, PIG_ID)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = nested_command_0(builder_, level_ + 1);
    if (!result_) result_ = nested_command_1(builder_, level_ + 1);
    if (!result_) result_ = nested_command_2(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_NESTED_COMMAND);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  // ( IDENTIFIER '=' col_ref '.' col_ref_list { input'.'LA( 1 ) '==' ';' }? ) '=>' ( IDENTIFIER '=' nested_proj )
  private static boolean nested_command_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "nested_command_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = nested_command_0_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, "=>");
    result_ = result_ && nested_command_0_2(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // IDENTIFIER '=' col_ref '.' col_ref_list { input'.'LA( 1 ) '==' ';' }?
  private static boolean nested_command_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "nested_command_0_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = IDENTIFIER(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_EQUAL);
    result_ = result_ && col_ref(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_DOT);
    result_ = result_ && col_ref_list(builder_, level_ + 1);
    result_ = result_ && nested_command_0_0_5(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // { input'.'LA( 1 ) '==' ';' }?
  private static boolean nested_command_0_0_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "nested_command_0_0_5")) return false;
    nested_command_0_0_5_0(builder_, level_ + 1);
    return true;
  }

  // input'.'LA( 1 ) '==' ';'
  private static boolean nested_command_0_0_5_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "nested_command_0_0_5_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_INPUT);
    result_ = result_ && consumeToken(builder_, PIG_DOT);
    result_ = result_ && consumeToken(builder_, PIG_LA);
    result_ = result_ && nested_command_0_0_5_0_3(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_EQEQ);
    result_ = result_ && consumeToken(builder_, PIG_SIMI);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // ( 1 )
  private static boolean nested_command_0_0_5_0_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "nested_command_0_0_5_0_3")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, "1");
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // IDENTIFIER '=' nested_proj
  private static boolean nested_command_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "nested_command_0_2")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = IDENTIFIER(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_EQUAL);
    result_ = result_ && nested_proj(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // IDENTIFIER '=' expr
  private static boolean nested_command_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "nested_command_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = IDENTIFIER(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_EQUAL);
    result_ = result_ && expr(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // IDENTIFIER '=' nested_op
  private static boolean nested_command_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "nested_command_2")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = IDENTIFIER(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_EQUAL);
    result_ = result_ && nested_op(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // CROSS nested_op_input_list
  public static boolean nested_cross(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "nested_cross")) return false;
    if (!nextTokenIs(builder_, PIG_CROSS)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_CROSS);
    result_ = result_ && nested_op_input_list(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_NESTED_CROSS);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  /* ********************************************************** */
  // DISTINCT nested_op_input
  public static boolean nested_distinct(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "nested_distinct")) return false;
    if (!nextTokenIs(builder_, PIG_DISTINCT)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_DISTINCT);
    result_ = result_ && nested_op_input(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_NESTED_DISTINCT);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  /* ********************************************************** */
  // FILTER nested_op_input BY cond
  public static boolean nested_filter(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "nested_filter")) return false;
    if (!nextTokenIs(builder_, PIG_FILTER)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_FILTER);
    result_ = result_ && nested_op_input(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_BY);
    result_ = result_ && cond(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_NESTED_FILTER);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  /* ********************************************************** */
  // FOREACH nested_op_input GENERATE flatten_generated_item ( ',' flatten_generated_item )*
  public static boolean nested_foreach(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "nested_foreach")) return false;
    if (!nextTokenIs(builder_, PIG_FOREACH)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_FOREACH);
    result_ = result_ && nested_op_input(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_GENERATE);
    result_ = result_ && flatten_generated_item(builder_, level_ + 1);
    result_ = result_ && nested_foreach_4(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_NESTED_FOREACH);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  // ( ',' flatten_generated_item )*
  private static boolean nested_foreach_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "nested_foreach_4")) return false;
    int offset_ = builder_.getCurrentOffset();
    while (true) {
      if (!nested_foreach_4_0(builder_, level_ + 1)) break;
      int next_offset_ = builder_.getCurrentOffset();
      if (offset_ == next_offset_) {
        empty_element_parsed_guard_(builder_, offset_, "nested_foreach_4");
        break;
      }
      offset_ = next_offset_;
    }
    return true;
  }

  // ',' flatten_generated_item
  private static boolean nested_foreach_4_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "nested_foreach_4_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_COMMA);
    result_ = result_ && flatten_generated_item(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // LIMIT nested_op_input ( (INTEGER ';') '=>' INTEGER | expr )
  public static boolean nested_limit(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "nested_limit")) return false;
    if (!nextTokenIs(builder_, PIG_LIMIT)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_LIMIT);
    result_ = result_ && nested_op_input(builder_, level_ + 1);
    result_ = result_ && nested_limit_2(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_NESTED_LIMIT);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  // (INTEGER ';') '=>' INTEGER | expr
  private static boolean nested_limit_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "nested_limit_2")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = nested_limit_2_0(builder_, level_ + 1);
    if (!result_) result_ = expr(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // (INTEGER ';') '=>' INTEGER
  private static boolean nested_limit_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "nested_limit_2_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = nested_limit_2_0_0(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, "=>");
    result_ = result_ && consumeToken(builder_, PIG_INTEGER);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // INTEGER ';'
  private static boolean nested_limit_2_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "nested_limit_2_0_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_INTEGER);
    result_ = result_ && consumeToken(builder_, PIG_SIMI);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // nested_filter
  //           | nested_sort
  //           | nested_distinct
  //           | nested_limit
  //           | nested_cross
  //           | nested_foreach
  public static boolean nested_op(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "nested_op")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<nested op>");
    result_ = nested_filter(builder_, level_ + 1);
    if (!result_) result_ = nested_sort(builder_, level_ + 1);
    if (!result_) result_ = nested_distinct(builder_, level_ + 1);
    if (!result_) result_ = nested_limit(builder_, level_ + 1);
    if (!result_) result_ = nested_cross(builder_, level_ + 1);
    if (!result_) result_ = nested_foreach(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_NESTED_OP);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // '(' op_clause parallel_clause? ')'
  //                  | '(' FOREACH rel ( foreach_plan_complex | ( foreach_plan_simple parallel_clause? ) ) ')'
  static boolean nested_op_clause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "nested_op_clause")) return false;
    if (!nextTokenIs(builder_, PIG_LP)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = nested_op_clause_0(builder_, level_ + 1);
    if (!result_) result_ = nested_op_clause_1(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // '(' op_clause parallel_clause? ')'
  private static boolean nested_op_clause_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "nested_op_clause_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_LP);
    result_ = result_ && op_clause(builder_, level_ + 1);
    result_ = result_ && nested_op_clause_0_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_RP);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // parallel_clause?
  private static boolean nested_op_clause_0_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "nested_op_clause_0_2")) return false;
    parallel_clause(builder_, level_ + 1);
    return true;
  }

  // '(' FOREACH rel ( foreach_plan_complex | ( foreach_plan_simple parallel_clause? ) ) ')'
  private static boolean nested_op_clause_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "nested_op_clause_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_LP);
    result_ = result_ && consumeToken(builder_, PIG_FOREACH);
    result_ = result_ && rel(builder_, level_ + 1);
    result_ = result_ && nested_op_clause_1_3(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_RP);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // foreach_plan_complex | ( foreach_plan_simple parallel_clause? )
  private static boolean nested_op_clause_1_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "nested_op_clause_1_3")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = foreach_plan_complex(builder_, level_ + 1);
    if (!result_) result_ = nested_op_clause_1_3_1(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // foreach_plan_simple parallel_clause?
  private static boolean nested_op_clause_1_3_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "nested_op_clause_1_3_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = foreach_plan_simple(builder_, level_ + 1);
    result_ = result_ && nested_op_clause_1_3_1_1(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // parallel_clause?
  private static boolean nested_op_clause_1_3_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "nested_op_clause_1_3_1_1")) return false;
    parallel_clause(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // col_ref | nested_proj
  public static boolean nested_op_input(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "nested_op_input")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<nested op input>");
    result_ = col_ref(builder_, level_ + 1);
    if (!result_) result_ = nested_proj(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_NESTED_OP_INPUT);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // nested_op_input ( ',' nested_op_input )*
  public static boolean nested_op_input_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "nested_op_input_list")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<nested op input list>");
    result_ = nested_op_input(builder_, level_ + 1);
    result_ = result_ && nested_op_input_list_1(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_NESTED_OP_INPUT_LIST);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // ( ',' nested_op_input )*
  private static boolean nested_op_input_list_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "nested_op_input_list_1")) return false;
    int offset_ = builder_.getCurrentOffset();
    while (true) {
      if (!nested_op_input_list_1_0(builder_, level_ + 1)) break;
      int next_offset_ = builder_.getCurrentOffset();
      if (offset_ == next_offset_) {
        empty_element_parsed_guard_(builder_, offset_, "nested_op_input_list_1");
        break;
      }
      offset_ = next_offset_;
    }
    return true;
  }

  // ',' nested_op_input
  private static boolean nested_op_input_list_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "nested_op_input_list_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_COMMA);
    result_ = result_ && nested_op_input(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // col_ref '.' col_ref_list
  public static boolean nested_proj(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "nested_proj")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<nested proj>");
    result_ = col_ref(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_DOT);
    result_ = result_ && col_ref_list(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_NESTED_PROJ);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // ORDER nested_op_input BY  order_by_clause ( USING func_clause )?
  public static boolean nested_sort(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "nested_sort")) return false;
    if (!nextTokenIs(builder_, PIG_ORDER)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_ORDER);
    result_ = result_ && nested_op_input(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_BY);
    result_ = result_ && order_by_clause(builder_, level_ + 1);
    result_ = result_ && nested_sort_4(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_NESTED_SORT);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  // ( USING func_clause )?
  private static boolean nested_sort_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "nested_sort_4")) return false;
    nested_sort_4_0(builder_, level_ + 1);
    return true;
  }

  // USING func_clause
  private static boolean nested_sort_4_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "nested_sort_4_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_USING);
    result_ = result_ && func_clause(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // (NOT)? unary_cond
  public static boolean not_cond(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "not_cond")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<not cond>");
    result_ = not_cond_0(builder_, level_ + 1);
    result_ = result_ && unary_cond(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_NOT_COND);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // (NOT)?
  private static boolean not_cond_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "not_cond_0")) return false;
    not_cond_0_0(builder_, level_ + 1);
    return true;
  }

  // (NOT)
  private static boolean not_cond_0_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "not_cond_0_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_NOT);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // define_clause
  //           | load_clause
  //           | group_clause
  //           | cube_clause
  //           | store_clause
  //           | filter_clause
  //           | distinct_clause
  //           | illustrate_clause
  //           | limit_clause
  //           | sample_clause
  //           | order_clause
  //           | rank_clause
  //           | cross_clause
  //           | join_clause
  //           | union_clause
  //           | stream_clause
  //           | mr_clause
  //           | set_clause
  //           | register_clause
  //           | DUMP
  public static boolean op_clause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "op_clause")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<op clause>");
    result_ = define_clause(builder_, level_ + 1);
    if (!result_) result_ = load_clause(builder_, level_ + 1);
    if (!result_) result_ = group_clause(builder_, level_ + 1);
    if (!result_) result_ = cube_clause(builder_, level_ + 1);
    if (!result_) result_ = store_clause(builder_, level_ + 1);
    if (!result_) result_ = filter_clause(builder_, level_ + 1);
    if (!result_) result_ = distinct_clause(builder_, level_ + 1);
    if (!result_) result_ = illustrate_clause(builder_, level_ + 1);
    if (!result_) result_ = limit_clause(builder_, level_ + 1);
    if (!result_) result_ = sample_clause(builder_, level_ + 1);
    if (!result_) result_ = order_clause(builder_, level_ + 1);
    if (!result_) result_ = rank_clause(builder_, level_ + 1);
    if (!result_) result_ = cross_clause(builder_, level_ + 1);
    if (!result_) result_ = join_clause(builder_, level_ + 1);
    if (!result_) result_ = union_clause(builder_, level_ + 1);
    if (!result_) result_ = stream_clause(builder_, level_ + 1);
    if (!result_) result_ = mr_clause(builder_, level_ + 1);
    if (!result_) result_ = set_clause(builder_, level_ + 1);
    if (!result_) result_ = register_clause(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, PIG_DUMP);
    if (result_) {
      marker_.done(PIG_OP_CLAUSE);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // '*' ( ASC | DESC )?
  //                 | order_col_list
  public static boolean order_by_clause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "order_by_clause")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<order by clause>");
    result_ = order_by_clause_0(builder_, level_ + 1);
    if (!result_) result_ = order_col_list(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_ORDER_BY_CLAUSE);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // '*' ( ASC | DESC )?
  private static boolean order_by_clause_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "order_by_clause_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_STAR);
    result_ = result_ && order_by_clause_0_1(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // ( ASC | DESC )?
  private static boolean order_by_clause_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "order_by_clause_0_1")) return false;
    order_by_clause_0_1_0(builder_, level_ + 1);
    return true;
  }

  // ASC | DESC
  private static boolean order_by_clause_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "order_by_clause_0_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_ASC);
    if (!result_) result_ = consumeToken(builder_, PIG_DESC);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // ORDER rel BY order_by_clause ( USING func_clause )?
  public static boolean order_clause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "order_clause")) return false;
    if (!nextTokenIs(builder_, PIG_ORDER)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_ORDER);
    result_ = result_ && rel(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_BY);
    result_ = result_ && order_by_clause(builder_, level_ + 1);
    result_ = result_ && order_clause_4(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_ORDER_CLAUSE);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  // ( USING func_clause )?
  private static boolean order_clause_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "order_clause_4")) return false;
    order_clause_4_0(builder_, level_ + 1);
    return true;
  }

  // USING func_clause
  private static boolean order_clause_4_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "order_clause_4_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_USING);
    result_ = result_ && func_clause(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // col_range (ASC | DESC)?
  //           | col_ref ( ASC | DESC )?
  //           | '(' col_ref ( ASC | DESC )? ')'
  public static boolean order_col(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "order_col")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<order col>");
    result_ = order_col_0(builder_, level_ + 1);
    if (!result_) result_ = order_col_1(builder_, level_ + 1);
    if (!result_) result_ = order_col_2(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_ORDER_COL);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // col_range (ASC | DESC)?
  private static boolean order_col_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "order_col_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = col_range(builder_, level_ + 1);
    result_ = result_ && order_col_0_1(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // (ASC | DESC)?
  private static boolean order_col_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "order_col_0_1")) return false;
    order_col_0_1_0(builder_, level_ + 1);
    return true;
  }

  // ASC | DESC
  private static boolean order_col_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "order_col_0_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_ASC);
    if (!result_) result_ = consumeToken(builder_, PIG_DESC);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // col_ref ( ASC | DESC )?
  private static boolean order_col_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "order_col_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = col_ref(builder_, level_ + 1);
    result_ = result_ && order_col_1_1(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // ( ASC | DESC )?
  private static boolean order_col_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "order_col_1_1")) return false;
    order_col_1_1_0(builder_, level_ + 1);
    return true;
  }

  // ASC | DESC
  private static boolean order_col_1_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "order_col_1_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_ASC);
    if (!result_) result_ = consumeToken(builder_, PIG_DESC);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // '(' col_ref ( ASC | DESC )? ')'
  private static boolean order_col_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "order_col_2")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_LP);
    result_ = result_ && col_ref(builder_, level_ + 1);
    result_ = result_ && order_col_2_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_RP);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // ( ASC | DESC )?
  private static boolean order_col_2_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "order_col_2_2")) return false;
    order_col_2_2_0(builder_, level_ + 1);
    return true;
  }

  // ASC | DESC
  private static boolean order_col_2_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "order_col_2_2_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_ASC);
    if (!result_) result_ = consumeToken(builder_, PIG_DESC);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // order_col ( ',' order_col )*
  public static boolean order_col_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "order_col_list")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<order col list>");
    result_ = order_col(builder_, level_ + 1);
    result_ = result_ && order_col_list_1(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_ORDER_COL_LIST);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // ( ',' order_col )*
  private static boolean order_col_list_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "order_col_list_1")) return false;
    int offset_ = builder_.getCurrentOffset();
    while (true) {
      if (!order_col_list_1_0(builder_, level_ + 1)) break;
      int next_offset_ = builder_.getCurrentOffset();
      if (offset_ == next_offset_) {
        empty_element_parsed_guard_(builder_, offset_, "order_col_list_1");
        break;
      }
      offset_ = next_offset_;
    }
    return true;
  }

  // ',' order_col
  private static boolean order_col_list_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "order_col_list_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_COMMA);
    result_ = result_ && order_col(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // OUTPUT '(' stream_cmd_list ')'
  public static boolean output_clause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "output_clause")) return false;
    if (!nextTokenIs(builder_, PIG_OUTPUT)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_OUTPUT);
    result_ = result_ && consumeToken(builder_, PIG_LP);
    result_ = result_ && stream_cmd_list(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_RP);
    if (result_) {
      marker_.done(PIG_OUTPUT_CLAUSE);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  /* ********************************************************** */
  // PARALLEL (INTEGER_LITERAL|SCRIPT_PARAM_NAME)
  public static boolean parallel_clause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parallel_clause")) return false;
    if (!nextTokenIs(builder_, PIG_PARALLEL)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_PARALLEL);
    result_ = result_ && parallel_clause_1(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_PARALLEL_CLAUSE);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  // INTEGER_LITERAL|SCRIPT_PARAM_NAME
  private static boolean parallel_clause_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parallel_clause_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_INTEGER_LITERAL);
    if (!result_) result_ = consumeToken(builder_, PIG_SCRIPT_PARAM_NAME);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // IDENTIFIER
  //     | INTEGER
  //     | DOUBLENUMBER
  //     | BIGDECIMALNUMBER
  //     | BIGINTEGERNUMBER
  //     | QUOTEDSTRING
  //     | DOLLARVAR
  //     | SCRIPT_PARAM_NAME
  static boolean parameter(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "parameter")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = IDENTIFIER(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, PIG_INTEGER);
    if (!result_) result_ = consumeToken(builder_, PIG_DOUBLENUMBER);
    if (!result_) result_ = consumeToken(builder_, PIG_BIGDECIMALNUMBER);
    if (!result_) result_ = consumeToken(builder_, PIG_BIGINTEGERNUMBER);
    if (!result_) result_ = consumeToken(builder_, PIG_QUOTEDSTRING);
    if (!result_) result_ = consumeToken(builder_, PIG_DOLLARVAR);
    if (!result_) result_ = consumeToken(builder_, PIG_SCRIPT_PARAM_NAME);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // '('  after_left_paren
  public static boolean paren_expr(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "paren_expr")) return false;
    if (!nextTokenIs(builder_, PIG_LP)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_LP);
    result_ = result_ && after_left_paren(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_PAREN_EXPR);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  /* ********************************************************** */
  // PARTITION BY func_name
  public static boolean partition_clause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "partition_clause")) return false;
    if (!nextTokenIs(builder_, PIG_PARTITION)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeTokens(builder_, 0, PIG_PARTITION, PIG_BY);
    result_ = result_ && func_name(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_PARTITION_CLAUSE);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  /* ********************************************************** */
  // QUOTEDSTRING ( ',' QUOTEDSTRING )*
  public static boolean path_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "path_list")) return false;
    if (!nextTokenIs(builder_, PIG_QUOTEDSTRING)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_QUOTEDSTRING);
    result_ = result_ && path_list_1(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_PATH_LIST);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  // ( ',' QUOTEDSTRING )*
  private static boolean path_list_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "path_list_1")) return false;
    int offset_ = builder_.getCurrentOffset();
    while (true) {
      if (!path_list_1_0(builder_, level_ + 1)) break;
      int next_offset_ = builder_.getCurrentOffset();
      if (offset_ == next_offset_) {
        empty_element_parsed_guard_(builder_, offset_, "path_list_1");
        break;
      }
      offset_ = next_offset_;
    }
    return true;
  }

  // ',' QUOTEDSTRING
  private static boolean path_list_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "path_list_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_COMMA);
    result_ = result_ && consumeToken(builder_, PIG_QUOTEDSTRING);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // statement*
  static boolean pigFile(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "pigFile")) return false;
    int offset_ = builder_.getCurrentOffset();
    while (true) {
      if (!statement(builder_, level_ + 1)) break;
      int next_offset_ = builder_.getCurrentOffset();
      if (offset_ == next_offset_) {
        empty_element_parsed_guard_(builder_, offset_, "pigFile");
        break;
      }
      offset_ = next_offset_;
    }
    return true;
  }

  /* ********************************************************** */
  // '@'
  public static boolean previous_rel(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "previous_rel")) return false;
    if (!nextTokenIs(builder_, PIG_ARROBA)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_ARROBA);
    if (result_) {
      marker_.done(PIG_PREVIOUS_REL);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  /* ********************************************************** */
  // '.' ( col_ref | '(' col_ref ( ',' col_ref )* ')' )
  //            | '#' ( QUOTEDSTRING | NULL )
  public static boolean projection(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "projection")) return false;
    if (!nextTokenIs(builder_, PIG_POUND) && !nextTokenIs(builder_, PIG_DOT)
        && replaceVariants(builder_, 2, "<projection>")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<projection>");
    result_ = projection_0(builder_, level_ + 1);
    if (!result_) result_ = projection_1(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_PROJECTION);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // '.' ( col_ref | '(' col_ref ( ',' col_ref )* ')' )
  private static boolean projection_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "projection_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_DOT);
    result_ = result_ && projection_0_1(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // col_ref | '(' col_ref ( ',' col_ref )* ')'
  private static boolean projection_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "projection_0_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = col_ref(builder_, level_ + 1);
    if (!result_) result_ = projection_0_1_1(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // '(' col_ref ( ',' col_ref )* ')'
  private static boolean projection_0_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "projection_0_1_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_LP);
    result_ = result_ && col_ref(builder_, level_ + 1);
    result_ = result_ && projection_0_1_1_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_RP);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // ( ',' col_ref )*
  private static boolean projection_0_1_1_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "projection_0_1_1_2")) return false;
    int offset_ = builder_.getCurrentOffset();
    while (true) {
      if (!projection_0_1_1_2_0(builder_, level_ + 1)) break;
      int next_offset_ = builder_.getCurrentOffset();
      if (offset_ == next_offset_) {
        empty_element_parsed_guard_(builder_, offset_, "projection_0_1_1_2");
        break;
      }
      offset_ = next_offset_;
    }
    return true;
  }

  // ',' col_ref
  private static boolean projection_0_1_1_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "projection_0_1_1_2_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_COMMA);
    result_ = result_ && col_ref(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // '#' ( QUOTEDSTRING | NULL )
  private static boolean projection_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "projection_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_POUND);
    result_ = result_ && projection_1_1(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // QUOTEDSTRING | NULL
  private static boolean projection_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "projection_1_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_QUOTEDSTRING);
    if (!result_) result_ = consumeToken(builder_, PIG_NULL);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // eid ('.' eid)*
  static boolean property_name(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "property_name")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = eid(builder_, level_ + 1);
    result_ = result_ && property_name_1(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // ('.' eid)*
  private static boolean property_name_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "property_name_1")) return false;
    int offset_ = builder_.getCurrentOffset();
    while (true) {
      if (!property_name_1_0(builder_, level_ + 1)) break;
      int next_offset_ = builder_.getCurrentOffset();
      if (offset_ == next_offset_) {
        empty_element_parsed_guard_(builder_, offset_, "property_name_1");
        break;
      }
      offset_ = next_offset_;
    }
    return true;
  }

  // '.' eid
  private static boolean property_name_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "property_name_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_DOT);
    result_ = result_ && eid(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // STAR ( ASC | DESC )?
  //                | rank_list
  public static boolean rank_by_clause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rank_by_clause")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<rank by clause>");
    result_ = rank_by_clause_0(builder_, level_ + 1);
    if (!result_) result_ = rank_list(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_RANK_BY_CLAUSE);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // STAR ( ASC | DESC )?
  private static boolean rank_by_clause_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rank_by_clause_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_STAR);
    result_ = result_ && rank_by_clause_0_1(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // ( ASC | DESC )?
  private static boolean rank_by_clause_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rank_by_clause_0_1")) return false;
    rank_by_clause_0_1_0(builder_, level_ + 1);
    return true;
  }

  // ASC | DESC
  private static boolean rank_by_clause_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rank_by_clause_0_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_ASC);
    if (!result_) result_ = consumeToken(builder_, PIG_DESC);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // BY rank_by_clause DENSE
  public static boolean rank_by_statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rank_by_statement")) return false;
    if (!nextTokenIs(builder_, PIG_BY)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_BY);
    result_ = result_ && rank_by_clause(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_DENSE);
    if (result_) {
      marker_.done(PIG_RANK_BY_STATEMENT);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  /* ********************************************************** */
  // RANK rel ( rank_by_statement )?
  public static boolean rank_clause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rank_clause")) return false;
    if (!nextTokenIs(builder_, PIG_RANK)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_RANK);
    result_ = result_ && rel(builder_, level_ + 1);
    result_ = result_ && rank_clause_2(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_RANK_CLAUSE);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  // ( rank_by_statement )?
  private static boolean rank_clause_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rank_clause_2")) return false;
    rank_clause_2_0(builder_, level_ + 1);
    return true;
  }

  // ( rank_by_statement )
  private static boolean rank_clause_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rank_clause_2_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = rank_by_statement(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // col_range ( ASC | DESC )?
  //          | col_ref ( ASC | DESC )?
  public static boolean rank_col(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rank_col")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<rank col>");
    result_ = rank_col_0(builder_, level_ + 1);
    if (!result_) result_ = rank_col_1(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_RANK_COL);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // col_range ( ASC | DESC )?
  private static boolean rank_col_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rank_col_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = col_range(builder_, level_ + 1);
    result_ = result_ && rank_col_0_1(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // ( ASC | DESC )?
  private static boolean rank_col_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rank_col_0_1")) return false;
    rank_col_0_1_0(builder_, level_ + 1);
    return true;
  }

  // ASC | DESC
  private static boolean rank_col_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rank_col_0_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_ASC);
    if (!result_) result_ = consumeToken(builder_, PIG_DESC);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // col_ref ( ASC | DESC )?
  private static boolean rank_col_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rank_col_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = col_ref(builder_, level_ + 1);
    result_ = result_ && rank_col_1_1(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // ( ASC | DESC )?
  private static boolean rank_col_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rank_col_1_1")) return false;
    rank_col_1_1_0(builder_, level_ + 1);
    return true;
  }

  // ASC | DESC
  private static boolean rank_col_1_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rank_col_1_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_ASC);
    if (!result_) result_ = consumeToken(builder_, PIG_DESC);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // rank_col ( ',' rank_col )*
  public static boolean rank_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rank_list")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<rank list>");
    result_ = rank_col(builder_, level_ + 1);
    result_ = result_ && rank_list_1(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_RANK_LIST);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // ( ',' rank_col )*
  private static boolean rank_list_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rank_list_1")) return false;
    int offset_ = builder_.getCurrentOffset();
    while (true) {
      if (!rank_list_1_0(builder_, level_ + 1)) break;
      int next_offset_ = builder_.getCurrentOffset();
      if (offset_ == next_offset_) {
        empty_element_parsed_guard_(builder_, offset_, "rank_list_1");
        break;
      }
      offset_ = next_offset_;
    }
    return true;
  }

  // ',' rank_col
  private static boolean rank_list_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rank_list_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_COMMA);
    result_ = result_ && rank_col(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // expr
  //          | '*'
  //          | col_range
  public static boolean real_arg(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "real_arg")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<real arg>");
    result_ = expr(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, PIG_STAR);
    if (!result_) result_ = col_range(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_REAL_ARG);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // IDENTIFIER '=' IDENTIFIER
  public static boolean realias_clause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "realias_clause")) return false;
    if (!nextTokenIs(builder_, PIG_ID)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = IDENTIFIER(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_EQUAL);
    result_ = result_ && IDENTIFIER(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_REALIAS_CLAUSE);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  /* ********************************************************** */
  // REGISTER QUOTEDSTRING
  public static boolean register_clause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "register_clause")) return false;
    if (!nextTokenIs(builder_, PIG_REGISTER)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeTokens(builder_, 0, PIG_REGISTER, PIG_QUOTEDSTRING);
    if (result_) {
      marker_.done(PIG_REGISTER_CLAUSE);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  /* ********************************************************** */
  // IDENTIFIER | previous_rel | nested_op_clause
  public static boolean rel(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rel")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<rel>");
    result_ = IDENTIFIER(builder_, level_ + 1);
    if (!result_) result_ = previous_rel(builder_, level_ + 1);
    if (!result_) result_ = nested_op_clause(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_REL);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // rel ( ',' rel )*
  public static boolean rel_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rel_list")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<rel list>");
    result_ = rel(builder_, level_ + 1);
    result_ = result_ && rel_list_1(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_REL_LIST);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // ( ',' rel )*
  private static boolean rel_list_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rel_list_1")) return false;
    int offset_ = builder_.getCurrentOffset();
    while (true) {
      if (!rel_list_1_0(builder_, level_ + 1)) break;
      int next_offset_ = builder_.getCurrentOffset();
      if (offset_ == next_offset_) {
        empty_element_parsed_guard_(builder_, offset_, "rel_list_1");
        break;
      }
      offset_ = next_offset_;
    }
    return true;
  }

  // ',' rel
  private static boolean rel_list_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rel_list_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_COMMA);
    result_ = result_ && rel(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // rel_str_op
  //        | '=='
  //        | '!='
  //        | '>'
  //        | '>='
  //        | '<'
  //        | '<='
  public static boolean rel_op(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rel_op")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<rel op>");
    result_ = rel_str_op(builder_, level_ + 1);
    if (!result_) result_ = consumeToken(builder_, PIG_EQEQ);
    if (!result_) result_ = consumeToken(builder_, PIG_NOTEQ);
    if (!result_) result_ = consumeToken(builder_, PIG_GT);
    if (!result_) result_ = consumeToken(builder_, PIG_GTEQ);
    if (!result_) result_ = consumeToken(builder_, PIG_LT);
    if (!result_) result_ = consumeToken(builder_, PIG_LTEQ);
    if (result_) {
      marker_.done(PIG_REL_OP);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // STR_OP_EQ
  //            | STR_OP_NE
  //            | STR_OP_GT
  //            | STR_OP_LT
  //            | STR_OP_GTE
  //            | STR_OP_LTE
  //            | STR_OP_MATCHES
  public static boolean rel_str_op(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "rel_str_op")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<rel str op>");
    result_ = consumeToken(builder_, PIG_STR_OP_EQ);
    if (!result_) result_ = consumeToken(builder_, PIG_STR_OP_NE);
    if (!result_) result_ = consumeToken(builder_, PIG_STR_OP_GT);
    if (!result_) result_ = consumeToken(builder_, PIG_STR_OP_LT);
    if (!result_) result_ = consumeToken(builder_, PIG_STR_OP_GTE);
    if (!result_) result_ = consumeToken(builder_, PIG_STR_OP_LTE);
    if (!result_) result_ = consumeToken(builder_, PIG_STR_OP_MATCHES);
    if (result_) {
      marker_.done(PIG_REL_STR_OP);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // SAMPLE rel expr
  public static boolean sample_clause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "sample_clause")) return false;
    if (!nextTokenIs(builder_, PIG_SAMPLE)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_SAMPLE);
    result_ = result_ && rel(builder_, level_ + 1);
    result_ = result_ && expr(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_SAMPLE_CLAUSE);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  /* ********************************************************** */
  // INTEGER_LITERAL
  //        | LONG_LITERAL
  //        | FLOAT_LITERAL
  //        | DOUBLE_LITERAL
  //        | QUOTEDSTRING
  //        | NULL
  //        | TRUE
  //        | FALSE
  //        | SCRIPT_PARAM_NAME
  public static boolean scalar(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "scalar")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<scalar>");
    result_ = consumeToken(builder_, PIG_INTEGER_LITERAL);
    if (!result_) result_ = consumeToken(builder_, PIG_LONG_LITERAL);
    if (!result_) result_ = consumeToken(builder_, PIG_FLOAT_LITERAL);
    if (!result_) result_ = consumeToken(builder_, PIG_DOUBLE_LITERAL);
    if (!result_) result_ = consumeToken(builder_, PIG_QUOTEDSTRING);
    if (!result_) result_ = consumeToken(builder_, PIG_NULL);
    if (!result_) result_ = consumeToken(builder_, PIG_TRUE);
    if (!result_) result_ = consumeToken(builder_, PIG_FALSE);
    if (!result_) result_ = consumeToken(builder_, PIG_SCRIPT_PARAM_NAME);
    if (result_) {
      marker_.done(PIG_SCALAR);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // SET property_name (scalar | func_name)
  public static boolean set_clause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "set_clause")) return false;
    if (!nextTokenIs(builder_, PIG_SET)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_SET);
    result_ = result_ && property_name(builder_, level_ + 1);
    result_ = result_ && set_clause_2(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_SET_CLAUSE);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  // scalar | func_name
  private static boolean set_clause_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "set_clause_2")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = scalar(builder_, level_ + 1);
    if (!result_) result_ = func_name(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // SHIP '(' path_list? ')'
  public static boolean ship_clause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ship_clause")) return false;
    if (!nextTokenIs(builder_, PIG_SHIP)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_SHIP);
    result_ = result_ && consumeToken(builder_, PIG_LP);
    result_ = result_ && ship_clause_2(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_RP);
    if (result_) {
      marker_.done(PIG_SHIP_CLAUSE);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  // path_list?
  private static boolean ship_clause_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "ship_clause_2")) return false;
    path_list(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // BOOLEAN | INT | LONG | FLOAT | DOUBLE | DATETIME | BIGINTEGER | BIGDECIMAL | CHARARRAY | BYTEARRAY
  static boolean simple_type(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "simple_type")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_BOOLEAN);
    if (!result_) result_ = consumeToken(builder_, PIG_INT);
    if (!result_) result_ = consumeToken(builder_, PIG_LONG);
    if (!result_) result_ = consumeToken(builder_, PIG_FLOAT);
    if (!result_) result_ = consumeToken(builder_, PIG_DOUBLE);
    if (!result_) result_ = consumeToken(builder_, PIG_DATETIME);
    if (!result_) result_ = consumeToken(builder_, PIG_BIGINTEGER);
    if (!result_) result_ = consumeToken(builder_, PIG_BIGDECIMAL);
    if (!result_) result_ = consumeToken(builder_, PIG_CHARARRAY);
    if (!result_) result_ = consumeToken(builder_, PIG_BYTEARRAY);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // IDENTIFIER IF (('(' cond ')') | cond)
  public static boolean split_branch(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "split_branch")) return false;
    if (!nextTokenIs(builder_, PIG_ID)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = IDENTIFIER(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_IF);
    result_ = result_ && split_branch_2(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_SPLIT_BRANCH);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  // ('(' cond ')') | cond
  private static boolean split_branch_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "split_branch_2")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = split_branch_2_0(builder_, level_ + 1);
    if (!result_) result_ = cond(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // '(' cond ')'
  private static boolean split_branch_2_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "split_branch_2_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_LP);
    result_ = result_ && cond(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_RP);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // SPLIT rel INTO split_branch (',' split_branch)* split_otherwise?
  public static boolean split_clause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "split_clause")) return false;
    if (!nextTokenIs(builder_, PIG_SPLIT)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_SPLIT);
    result_ = result_ && rel(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_INTO);
    result_ = result_ && split_branch(builder_, level_ + 1);
    result_ = result_ && split_clause_4(builder_, level_ + 1);
    result_ = result_ && split_clause_5(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_SPLIT_CLAUSE);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  // (',' split_branch)*
  private static boolean split_clause_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "split_clause_4")) return false;
    int offset_ = builder_.getCurrentOffset();
    while (true) {
      if (!split_clause_4_0(builder_, level_ + 1)) break;
      int next_offset_ = builder_.getCurrentOffset();
      if (offset_ == next_offset_) {
        empty_element_parsed_guard_(builder_, offset_, "split_clause_4");
        break;
      }
      offset_ = next_offset_;
    }
    return true;
  }

  // ',' split_branch
  private static boolean split_clause_4_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "split_clause_4_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_COMMA);
    result_ = result_ && split_branch(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // split_otherwise?
  private static boolean split_clause_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "split_clause_5")) return false;
    split_otherwise(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // IDENTIFIER OTHERWISE
  public static boolean split_otherwise(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "split_otherwise")) return false;
    if (!nextTokenIs(builder_, PIG_ID)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = IDENTIFIER(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_OTHERWISE);
    if (result_) {
      marker_.done(PIG_SPLIT_OTHERWISE);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  /* ********************************************************** */
  // empty_statement
  //             | foreach_statement
  //             | general_statement ';'
  //             | split_clause ';'
  //             | inline_clause ';'
  //             | import_clause ';'
  //             | realias_clause ';'
  //               // semicolons after foreach_complex_statement are optional for backwards compatibility, but to keep
  //               // the grammar unambiguous if there is one then we'll parse it as a single, standalone semicolon
  //               // (which matches the first statement rule)
  //             | declare_statement
  //             | default_statement
  public static boolean statement(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statement")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<statement>");
    result_ = empty_statement(builder_, level_ + 1);
    if (!result_) result_ = foreach_statement(builder_, level_ + 1);
    if (!result_) result_ = statement_2(builder_, level_ + 1);
    if (!result_) result_ = statement_3(builder_, level_ + 1);
    if (!result_) result_ = statement_4(builder_, level_ + 1);
    if (!result_) result_ = statement_5(builder_, level_ + 1);
    if (!result_) result_ = statement_6(builder_, level_ + 1);
    if (!result_) result_ = declare_statement(builder_, level_ + 1);
    if (!result_) result_ = default_statement(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_STATEMENT);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // general_statement ';'
  private static boolean statement_2(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statement_2")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = general_statement(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_SIMI);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // split_clause ';'
  private static boolean statement_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statement_3")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = split_clause(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_SIMI);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // inline_clause ';'
  private static boolean statement_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statement_4")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = inline_clause(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_SIMI);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // import_clause ';'
  private static boolean statement_5(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statement_5")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = import_clause(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_SIMI);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // realias_clause ';'
  private static boolean statement_6(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "statement_6")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = realias_clause(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_SIMI);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // STORE rel INTO QUOTEDSTRING ( USING func_clause )?
  public static boolean store_clause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "store_clause")) return false;
    if (!nextTokenIs(builder_, PIG_STORE)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_STORE);
    result_ = result_ && rel(builder_, level_ + 1);
    result_ = result_ && consumeTokens(builder_, 0, PIG_INTO, PIG_QUOTEDSTRING);
    result_ = result_ && store_clause_4(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_STORE_CLAUSE);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  // ( USING func_clause )?
  private static boolean store_clause_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "store_clause_4")) return false;
    store_clause_4_0(builder_, level_ + 1);
    return true;
  }

  // USING func_clause
  private static boolean store_clause_4_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "store_clause_4_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_USING);
    result_ = result_ && func_clause(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // STREAM rel THROUGH ( EXECCOMMAND | IDENTIFIER ) as_clause?
  public static boolean stream_clause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "stream_clause")) return false;
    if (!nextTokenIs(builder_, PIG_STREAM)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_STREAM);
    result_ = result_ && rel(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_THROUGH);
    result_ = result_ && stream_clause_3(builder_, level_ + 1);
    result_ = result_ && stream_clause_4(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_STREAM_CLAUSE);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  // EXECCOMMAND | IDENTIFIER
  private static boolean stream_clause_3(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "stream_clause_3")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_EXECCOMMAND);
    if (!result_) result_ = IDENTIFIER(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // as_clause?
  private static boolean stream_clause_4(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "stream_clause_4")) return false;
    as_clause(builder_, level_ + 1);
    return true;
  }

  /* ********************************************************** */
  // ( STDIN | STDOUT | QUOTEDSTRING ) ( USING func_clause )?
  public static boolean stream_cmd(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "stream_cmd")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<stream cmd>");
    result_ = stream_cmd_0(builder_, level_ + 1);
    result_ = result_ && stream_cmd_1(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_STREAM_CMD);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // STDIN | STDOUT | QUOTEDSTRING
  private static boolean stream_cmd_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "stream_cmd_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_STDIN);
    if (!result_) result_ = consumeToken(builder_, PIG_STDOUT);
    if (!result_) result_ = consumeToken(builder_, PIG_QUOTEDSTRING);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // ( USING func_clause )?
  private static boolean stream_cmd_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "stream_cmd_1")) return false;
    stream_cmd_1_0(builder_, level_ + 1);
    return true;
  }

  // USING func_clause
  private static boolean stream_cmd_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "stream_cmd_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_USING);
    result_ = result_ && func_clause(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // stream_cmd ( COMMA stream_cmd )*
  public static boolean stream_cmd_list(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "stream_cmd_list")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<stream cmd list>");
    result_ = stream_cmd(builder_, level_ + 1);
    result_ = result_ && stream_cmd_list_1(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_STREAM_CMD_LIST);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // ( COMMA stream_cmd )*
  private static boolean stream_cmd_list_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "stream_cmd_list_1")) return false;
    int offset_ = builder_.getCurrentOffset();
    while (true) {
      if (!stream_cmd_list_1_0(builder_, level_ + 1)) break;
      int next_offset_ = builder_.getCurrentOffset();
      if (offset_ == next_offset_) {
        empty_element_parsed_guard_(builder_, offset_, "stream_cmd_list_1");
        break;
      }
      offset_ = next_offset_;
    }
    return true;
  }

  // COMMA stream_cmd
  private static boolean stream_cmd_list_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "stream_cmd_list_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_COMMA);
    result_ = result_ && stream_cmd(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // implicit_tuple_type | explicit_tuple_type
  static boolean tuple_type(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "tuple_type")) return false;
    if (!nextTokenIs(builder_, PIG_LP) && !nextTokenIs(builder_, PIG_TUPLE)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = implicit_tuple_type(builder_, level_ + 1);
    if (!result_) result_ = explicit_tuple_type(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // explicit_type | implicit_type
  public static boolean type(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "type")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<type>");
    result_ = explicit_type(builder_, level_ + 1);
    if (!result_) result_ = implicit_type(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_TYPE);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  /* ********************************************************** */
  // expr ( ( IS (NOT)? NULL ) | ( rel_op expr ) )
  public static boolean unary_cond(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "unary_cond")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    enterErrorRecordingSection(builder_, level_, _SECTION_GENERAL_, "<unary cond>");
    result_ = expr(builder_, level_ + 1);
    result_ = result_ && unary_cond_1(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_UNARY_COND);
    }
    else {
      marker_.rollbackTo();
    }
    result_ = exitErrorRecordingSection(builder_, level_, result_, false, _SECTION_GENERAL_, null);
    return result_;
  }

  // ( IS (NOT)? NULL ) | ( rel_op expr )
  private static boolean unary_cond_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "unary_cond_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = unary_cond_1_0(builder_, level_ + 1);
    if (!result_) result_ = unary_cond_1_1(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // IS (NOT)? NULL
  private static boolean unary_cond_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "unary_cond_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_IS);
    result_ = result_ && unary_cond_1_0_1(builder_, level_ + 1);
    result_ = result_ && consumeToken(builder_, PIG_NULL);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // (NOT)?
  private static boolean unary_cond_1_0_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "unary_cond_1_0_1")) return false;
    unary_cond_1_0_1_0(builder_, level_ + 1);
    return true;
  }

  // (NOT)
  private static boolean unary_cond_1_0_1_0(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "unary_cond_1_0_1_0")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_NOT);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  // rel_op expr
  private static boolean unary_cond_1_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "unary_cond_1_1")) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = rel_op(builder_, level_ + 1);
    result_ = result_ && expr(builder_, level_ + 1);
    if (!result_) {
      marker_.rollbackTo();
    }
    else {
      marker_.drop();
    }
    return result_;
  }

  /* ********************************************************** */
  // UNION ONSCHEMA? rel_list
  public static boolean union_clause(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "union_clause")) return false;
    if (!nextTokenIs(builder_, PIG_UNION)) return false;
    boolean result_ = false;
    Marker marker_ = builder_.mark();
    result_ = consumeToken(builder_, PIG_UNION);
    result_ = result_ && union_clause_1(builder_, level_ + 1);
    result_ = result_ && rel_list(builder_, level_ + 1);
    if (result_) {
      marker_.done(PIG_UNION_CLAUSE);
    }
    else {
      marker_.rollbackTo();
    }
    return result_;
  }

  // ONSCHEMA?
  private static boolean union_clause_1(PsiBuilder builder_, int level_) {
    if (!recursion_guard_(builder_, level_, "union_clause_1")) return false;
    consumeToken(builder_, PIG_ONSCHEMA);
    return true;
  }

}
