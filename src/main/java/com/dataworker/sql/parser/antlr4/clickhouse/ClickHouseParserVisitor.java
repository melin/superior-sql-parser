// Generated from com/dataworker/sql/parser/antlr4/clickhouse/ClickHouseParser.g4 by ANTLR 4.7.1
package com.dataworker.sql.parser.antlr4.clickhouse;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ClickHouseParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ClickHouseParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(ClickHouseParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(ClickHouseParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#select_query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_query(ClickHouseParser.Select_queryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#select_query_main}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_query_main(ClickHouseParser.Select_query_mainContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#select_with_step}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_with_step(ClickHouseParser.Select_with_stepContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#select_select_step}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_select_step(ClickHouseParser.Select_select_stepContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#select_from_step}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_from_step(ClickHouseParser.Select_from_stepContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#select_array_join_step}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_array_join_step(ClickHouseParser.Select_array_join_stepContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#select_sample_step}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_sample_step(ClickHouseParser.Select_sample_stepContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#sample_ratio}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSample_ratio(ClickHouseParser.Sample_ratioContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#select_join_step}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_join_step(ClickHouseParser.Select_join_stepContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#select_join_right_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_join_right_part(ClickHouseParser.Select_join_right_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#select_prewhere_step}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_prewhere_step(ClickHouseParser.Select_prewhere_stepContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#select_where_step}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_where_step(ClickHouseParser.Select_where_stepContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#select_groupby_step}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_groupby_step(ClickHouseParser.Select_groupby_stepContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#select_having_step}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_having_step(ClickHouseParser.Select_having_stepContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#select_orderby_step}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_orderby_step(ClickHouseParser.Select_orderby_stepContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#select_limit_step}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_limit_step(ClickHouseParser.Select_limit_stepContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#select_limitby_step}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_limitby_step(ClickHouseParser.Select_limitby_stepContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#select_settings_step}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_settings_step(ClickHouseParser.Select_settings_stepContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#select_format_step}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_format_step(ClickHouseParser.Select_format_stepContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#insert_query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_query(ClickHouseParser.Insert_queryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#create_query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_query(ClickHouseParser.Create_queryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#rename_query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRename_query(ClickHouseParser.Rename_queryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#drop_query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_query(ClickHouseParser.Drop_queryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#alter_query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_query(ClickHouseParser.Alter_queryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#alter_query_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_query_element(ClickHouseParser.Alter_query_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#clickhouse_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClickhouse_type(ClickHouseParser.Clickhouse_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#simple_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_type(ClickHouseParser.Simple_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#enum_entry}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnum_entry(ClickHouseParser.Enum_entryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#use_query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUse_query(ClickHouseParser.Use_queryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#set_query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_query(ClickHouseParser.Set_queryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#assignment_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_list(ClickHouseParser.Assignment_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(ClickHouseParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#kill_query_query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKill_query_query(ClickHouseParser.Kill_query_queryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#optimize_query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptimize_query(ClickHouseParser.Optimize_queryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#table_properties_query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_properties_query(ClickHouseParser.Table_properties_queryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#show_tables_query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_tables_query(ClickHouseParser.Show_tables_queryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#show_processlist_query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_processlist_query(ClickHouseParser.Show_processlist_queryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#check_query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheck_query(ClickHouseParser.Check_queryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#full_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFull_table_name(ClickHouseParser.Full_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#partition_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartition_name(ClickHouseParser.Partition_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#cluster_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCluster_name(ClickHouseParser.Cluster_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#database_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabase_name(ClickHouseParser.Database_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(ClickHouseParser.Table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#format_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormat_name(ClickHouseParser.Format_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#query_outfile_step}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_outfile_step(ClickHouseParser.Query_outfile_stepContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#engine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEngine(ClickHouseParser.EngineContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#identifier_with_optional_parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier_with_optional_parameters(ClickHouseParser.Identifier_with_optional_parametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#identifier_with_parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier_with_parameters(ClickHouseParser.Identifier_with_parametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#order_by_expression_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_by_expression_list(ClickHouseParser.Order_by_expression_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#order_by_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_by_element(ClickHouseParser.Order_by_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#nested_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNested_table(ClickHouseParser.Nested_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#name_type_pair_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName_type_pair_list(ClickHouseParser.Name_type_pair_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#name_type_pair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName_type_pair(ClickHouseParser.Name_type_pairContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#compound_name_type_pair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_name_type_pair(ClickHouseParser.Compound_name_type_pairContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#column_declaration_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_declaration_list(ClickHouseParser.Column_declaration_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#column_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_declaration(ClickHouseParser.Column_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name(ClickHouseParser.Column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#column_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_type(ClickHouseParser.Column_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#column_name_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name_list(ClickHouseParser.Column_name_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#select_expr_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_expr_list(ClickHouseParser.Select_expr_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#select_expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_expr(ClickHouseParser.Select_exprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#select_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_alias(ClickHouseParser.Select_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias(ClickHouseParser.AliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#alias_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias_name(ClickHouseParser.Alias_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#table_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_function(ClickHouseParser.Table_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery(ClickHouseParser.SubqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#expression_with_optional_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_with_optional_alias(ClickHouseParser.Expression_with_optional_aliasContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprConcat}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprConcat(ClickHouseParser.ExprConcatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprCase}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCase(ClickHouseParser.ExprCaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprTupleElement}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprTupleElement(ClickHouseParser.ExprTupleElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprNot}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNot(ClickHouseParser.ExprNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprArray}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprArray(ClickHouseParser.ExprArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprWithAlias}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprWithAlias(ClickHouseParser.ExprWithAliasContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprLogical}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprLogical(ClickHouseParser.ExprLogicalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprIn}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprIn(ClickHouseParser.ExprInContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprCast}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprCast(ClickHouseParser.ExprCastContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprOr}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprOr(ClickHouseParser.ExprOrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprFunction}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprFunction(ClickHouseParser.ExprFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprMul}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprMul(ClickHouseParser.ExprMulContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprId}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprId(ClickHouseParser.ExprIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprLambda}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprLambda(ClickHouseParser.ExprLambdaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprTernary}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprTernary(ClickHouseParser.ExprTernaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprParen}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprParen(ClickHouseParser.ExprParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprBetween}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprBetween(ClickHouseParser.ExprBetweenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprSubquery}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprSubquery(ClickHouseParser.ExprSubqueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprStar}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStar(ClickHouseParser.ExprStarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprInterval}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprInterval(ClickHouseParser.ExprIntervalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprAnd}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAnd(ClickHouseParser.ExprAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprArrayElement}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprArrayElement(ClickHouseParser.ExprArrayElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprIsNull}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprIsNull(ClickHouseParser.ExprIsNullContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprList}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprList(ClickHouseParser.ExprListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprLiteral}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprLiteral(ClickHouseParser.ExprLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprUnaryMinus}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprUnaryMinus(ClickHouseParser.ExprUnaryMinusContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ExprAdd}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprAdd(ClickHouseParser.ExprAddContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#interval_unit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval_unit(ClickHouseParser.Interval_unitContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#expression_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_list(ClickHouseParser.Expression_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#not_empty_expression_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot_empty_expression_list(ClickHouseParser.Not_empty_expression_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#array}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray(ClickHouseParser.ArrayContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction(ClickHouseParser.FunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#function_parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_parameters(ClickHouseParser.Function_parametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#function_arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_arguments(ClickHouseParser.Function_argumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(ClickHouseParser.Function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(ClickHouseParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(ClickHouseParser.KeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#compound_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompound_identifier(ClickHouseParser.Compound_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(ClickHouseParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#err}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErr(ClickHouseParser.ErrContext ctx);
}