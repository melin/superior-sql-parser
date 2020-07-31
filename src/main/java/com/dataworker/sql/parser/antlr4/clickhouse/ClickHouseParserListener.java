// Generated from com/dataworker/sql/parser/antlr4/clickhouse/ClickHouseParser.g4 by ANTLR 4.7.1
package com.dataworker.sql.parser.antlr4.clickhouse;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ClickHouseParser}.
 */
public interface ClickHouseParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#parse}.
	 * @param ctx the parse tree
	 */
	void enterParse(ClickHouseParser.ParseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#parse}.
	 * @param ctx the parse tree
	 */
	void exitParse(ClickHouseParser.ParseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(ClickHouseParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(ClickHouseParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#select_query}.
	 * @param ctx the parse tree
	 */
	void enterSelect_query(ClickHouseParser.Select_queryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#select_query}.
	 * @param ctx the parse tree
	 */
	void exitSelect_query(ClickHouseParser.Select_queryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#select_query_main}.
	 * @param ctx the parse tree
	 */
	void enterSelect_query_main(ClickHouseParser.Select_query_mainContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#select_query_main}.
	 * @param ctx the parse tree
	 */
	void exitSelect_query_main(ClickHouseParser.Select_query_mainContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#select_with_step}.
	 * @param ctx the parse tree
	 */
	void enterSelect_with_step(ClickHouseParser.Select_with_stepContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#select_with_step}.
	 * @param ctx the parse tree
	 */
	void exitSelect_with_step(ClickHouseParser.Select_with_stepContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#select_select_step}.
	 * @param ctx the parse tree
	 */
	void enterSelect_select_step(ClickHouseParser.Select_select_stepContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#select_select_step}.
	 * @param ctx the parse tree
	 */
	void exitSelect_select_step(ClickHouseParser.Select_select_stepContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#select_from_step}.
	 * @param ctx the parse tree
	 */
	void enterSelect_from_step(ClickHouseParser.Select_from_stepContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#select_from_step}.
	 * @param ctx the parse tree
	 */
	void exitSelect_from_step(ClickHouseParser.Select_from_stepContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#select_array_join_step}.
	 * @param ctx the parse tree
	 */
	void enterSelect_array_join_step(ClickHouseParser.Select_array_join_stepContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#select_array_join_step}.
	 * @param ctx the parse tree
	 */
	void exitSelect_array_join_step(ClickHouseParser.Select_array_join_stepContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#select_sample_step}.
	 * @param ctx the parse tree
	 */
	void enterSelect_sample_step(ClickHouseParser.Select_sample_stepContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#select_sample_step}.
	 * @param ctx the parse tree
	 */
	void exitSelect_sample_step(ClickHouseParser.Select_sample_stepContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#sample_ratio}.
	 * @param ctx the parse tree
	 */
	void enterSample_ratio(ClickHouseParser.Sample_ratioContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#sample_ratio}.
	 * @param ctx the parse tree
	 */
	void exitSample_ratio(ClickHouseParser.Sample_ratioContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#select_join_step}.
	 * @param ctx the parse tree
	 */
	void enterSelect_join_step(ClickHouseParser.Select_join_stepContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#select_join_step}.
	 * @param ctx the parse tree
	 */
	void exitSelect_join_step(ClickHouseParser.Select_join_stepContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#select_join_right_part}.
	 * @param ctx the parse tree
	 */
	void enterSelect_join_right_part(ClickHouseParser.Select_join_right_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#select_join_right_part}.
	 * @param ctx the parse tree
	 */
	void exitSelect_join_right_part(ClickHouseParser.Select_join_right_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#select_prewhere_step}.
	 * @param ctx the parse tree
	 */
	void enterSelect_prewhere_step(ClickHouseParser.Select_prewhere_stepContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#select_prewhere_step}.
	 * @param ctx the parse tree
	 */
	void exitSelect_prewhere_step(ClickHouseParser.Select_prewhere_stepContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#select_where_step}.
	 * @param ctx the parse tree
	 */
	void enterSelect_where_step(ClickHouseParser.Select_where_stepContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#select_where_step}.
	 * @param ctx the parse tree
	 */
	void exitSelect_where_step(ClickHouseParser.Select_where_stepContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#select_groupby_step}.
	 * @param ctx the parse tree
	 */
	void enterSelect_groupby_step(ClickHouseParser.Select_groupby_stepContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#select_groupby_step}.
	 * @param ctx the parse tree
	 */
	void exitSelect_groupby_step(ClickHouseParser.Select_groupby_stepContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#select_having_step}.
	 * @param ctx the parse tree
	 */
	void enterSelect_having_step(ClickHouseParser.Select_having_stepContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#select_having_step}.
	 * @param ctx the parse tree
	 */
	void exitSelect_having_step(ClickHouseParser.Select_having_stepContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#select_orderby_step}.
	 * @param ctx the parse tree
	 */
	void enterSelect_orderby_step(ClickHouseParser.Select_orderby_stepContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#select_orderby_step}.
	 * @param ctx the parse tree
	 */
	void exitSelect_orderby_step(ClickHouseParser.Select_orderby_stepContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#select_limit_step}.
	 * @param ctx the parse tree
	 */
	void enterSelect_limit_step(ClickHouseParser.Select_limit_stepContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#select_limit_step}.
	 * @param ctx the parse tree
	 */
	void exitSelect_limit_step(ClickHouseParser.Select_limit_stepContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#select_limitby_step}.
	 * @param ctx the parse tree
	 */
	void enterSelect_limitby_step(ClickHouseParser.Select_limitby_stepContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#select_limitby_step}.
	 * @param ctx the parse tree
	 */
	void exitSelect_limitby_step(ClickHouseParser.Select_limitby_stepContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#select_settings_step}.
	 * @param ctx the parse tree
	 */
	void enterSelect_settings_step(ClickHouseParser.Select_settings_stepContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#select_settings_step}.
	 * @param ctx the parse tree
	 */
	void exitSelect_settings_step(ClickHouseParser.Select_settings_stepContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#select_format_step}.
	 * @param ctx the parse tree
	 */
	void enterSelect_format_step(ClickHouseParser.Select_format_stepContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#select_format_step}.
	 * @param ctx the parse tree
	 */
	void exitSelect_format_step(ClickHouseParser.Select_format_stepContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#insert_query}.
	 * @param ctx the parse tree
	 */
	void enterInsert_query(ClickHouseParser.Insert_queryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#insert_query}.
	 * @param ctx the parse tree
	 */
	void exitInsert_query(ClickHouseParser.Insert_queryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#create_query}.
	 * @param ctx the parse tree
	 */
	void enterCreate_query(ClickHouseParser.Create_queryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#create_query}.
	 * @param ctx the parse tree
	 */
	void exitCreate_query(ClickHouseParser.Create_queryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#rename_query}.
	 * @param ctx the parse tree
	 */
	void enterRename_query(ClickHouseParser.Rename_queryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#rename_query}.
	 * @param ctx the parse tree
	 */
	void exitRename_query(ClickHouseParser.Rename_queryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#drop_query}.
	 * @param ctx the parse tree
	 */
	void enterDrop_query(ClickHouseParser.Drop_queryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#drop_query}.
	 * @param ctx the parse tree
	 */
	void exitDrop_query(ClickHouseParser.Drop_queryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#alter_query}.
	 * @param ctx the parse tree
	 */
	void enterAlter_query(ClickHouseParser.Alter_queryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#alter_query}.
	 * @param ctx the parse tree
	 */
	void exitAlter_query(ClickHouseParser.Alter_queryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#alter_query_element}.
	 * @param ctx the parse tree
	 */
	void enterAlter_query_element(ClickHouseParser.Alter_query_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#alter_query_element}.
	 * @param ctx the parse tree
	 */
	void exitAlter_query_element(ClickHouseParser.Alter_query_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#clickhouse_type}.
	 * @param ctx the parse tree
	 */
	void enterClickhouse_type(ClickHouseParser.Clickhouse_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#clickhouse_type}.
	 * @param ctx the parse tree
	 */
	void exitClickhouse_type(ClickHouseParser.Clickhouse_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#simple_type}.
	 * @param ctx the parse tree
	 */
	void enterSimple_type(ClickHouseParser.Simple_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#simple_type}.
	 * @param ctx the parse tree
	 */
	void exitSimple_type(ClickHouseParser.Simple_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#enum_entry}.
	 * @param ctx the parse tree
	 */
	void enterEnum_entry(ClickHouseParser.Enum_entryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#enum_entry}.
	 * @param ctx the parse tree
	 */
	void exitEnum_entry(ClickHouseParser.Enum_entryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#use_query}.
	 * @param ctx the parse tree
	 */
	void enterUse_query(ClickHouseParser.Use_queryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#use_query}.
	 * @param ctx the parse tree
	 */
	void exitUse_query(ClickHouseParser.Use_queryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#set_query}.
	 * @param ctx the parse tree
	 */
	void enterSet_query(ClickHouseParser.Set_queryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#set_query}.
	 * @param ctx the parse tree
	 */
	void exitSet_query(ClickHouseParser.Set_queryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#assignment_list}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_list(ClickHouseParser.Assignment_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#assignment_list}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_list(ClickHouseParser.Assignment_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(ClickHouseParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(ClickHouseParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#kill_query_query}.
	 * @param ctx the parse tree
	 */
	void enterKill_query_query(ClickHouseParser.Kill_query_queryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#kill_query_query}.
	 * @param ctx the parse tree
	 */
	void exitKill_query_query(ClickHouseParser.Kill_query_queryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#optimize_query}.
	 * @param ctx the parse tree
	 */
	void enterOptimize_query(ClickHouseParser.Optimize_queryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#optimize_query}.
	 * @param ctx the parse tree
	 */
	void exitOptimize_query(ClickHouseParser.Optimize_queryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#table_properties_query}.
	 * @param ctx the parse tree
	 */
	void enterTable_properties_query(ClickHouseParser.Table_properties_queryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#table_properties_query}.
	 * @param ctx the parse tree
	 */
	void exitTable_properties_query(ClickHouseParser.Table_properties_queryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#show_tables_query}.
	 * @param ctx the parse tree
	 */
	void enterShow_tables_query(ClickHouseParser.Show_tables_queryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#show_tables_query}.
	 * @param ctx the parse tree
	 */
	void exitShow_tables_query(ClickHouseParser.Show_tables_queryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#show_processlist_query}.
	 * @param ctx the parse tree
	 */
	void enterShow_processlist_query(ClickHouseParser.Show_processlist_queryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#show_processlist_query}.
	 * @param ctx the parse tree
	 */
	void exitShow_processlist_query(ClickHouseParser.Show_processlist_queryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#check_query}.
	 * @param ctx the parse tree
	 */
	void enterCheck_query(ClickHouseParser.Check_queryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#check_query}.
	 * @param ctx the parse tree
	 */
	void exitCheck_query(ClickHouseParser.Check_queryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#full_table_name}.
	 * @param ctx the parse tree
	 */
	void enterFull_table_name(ClickHouseParser.Full_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#full_table_name}.
	 * @param ctx the parse tree
	 */
	void exitFull_table_name(ClickHouseParser.Full_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#partition_name}.
	 * @param ctx the parse tree
	 */
	void enterPartition_name(ClickHouseParser.Partition_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#partition_name}.
	 * @param ctx the parse tree
	 */
	void exitPartition_name(ClickHouseParser.Partition_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#cluster_name}.
	 * @param ctx the parse tree
	 */
	void enterCluster_name(ClickHouseParser.Cluster_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#cluster_name}.
	 * @param ctx the parse tree
	 */
	void exitCluster_name(ClickHouseParser.Cluster_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#database_name}.
	 * @param ctx the parse tree
	 */
	void enterDatabase_name(ClickHouseParser.Database_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#database_name}.
	 * @param ctx the parse tree
	 */
	void exitDatabase_name(ClickHouseParser.Database_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(ClickHouseParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(ClickHouseParser.Table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#format_name}.
	 * @param ctx the parse tree
	 */
	void enterFormat_name(ClickHouseParser.Format_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#format_name}.
	 * @param ctx the parse tree
	 */
	void exitFormat_name(ClickHouseParser.Format_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#query_outfile_step}.
	 * @param ctx the parse tree
	 */
	void enterQuery_outfile_step(ClickHouseParser.Query_outfile_stepContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#query_outfile_step}.
	 * @param ctx the parse tree
	 */
	void exitQuery_outfile_step(ClickHouseParser.Query_outfile_stepContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#engine}.
	 * @param ctx the parse tree
	 */
	void enterEngine(ClickHouseParser.EngineContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#engine}.
	 * @param ctx the parse tree
	 */
	void exitEngine(ClickHouseParser.EngineContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#identifier_with_optional_parameters}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier_with_optional_parameters(ClickHouseParser.Identifier_with_optional_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#identifier_with_optional_parameters}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier_with_optional_parameters(ClickHouseParser.Identifier_with_optional_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#identifier_with_parameters}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier_with_parameters(ClickHouseParser.Identifier_with_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#identifier_with_parameters}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier_with_parameters(ClickHouseParser.Identifier_with_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#order_by_expression_list}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by_expression_list(ClickHouseParser.Order_by_expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#order_by_expression_list}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by_expression_list(ClickHouseParser.Order_by_expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#order_by_element}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by_element(ClickHouseParser.Order_by_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#order_by_element}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by_element(ClickHouseParser.Order_by_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#nested_table}.
	 * @param ctx the parse tree
	 */
	void enterNested_table(ClickHouseParser.Nested_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#nested_table}.
	 * @param ctx the parse tree
	 */
	void exitNested_table(ClickHouseParser.Nested_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#name_type_pair_list}.
	 * @param ctx the parse tree
	 */
	void enterName_type_pair_list(ClickHouseParser.Name_type_pair_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#name_type_pair_list}.
	 * @param ctx the parse tree
	 */
	void exitName_type_pair_list(ClickHouseParser.Name_type_pair_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#name_type_pair}.
	 * @param ctx the parse tree
	 */
	void enterName_type_pair(ClickHouseParser.Name_type_pairContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#name_type_pair}.
	 * @param ctx the parse tree
	 */
	void exitName_type_pair(ClickHouseParser.Name_type_pairContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#compound_name_type_pair}.
	 * @param ctx the parse tree
	 */
	void enterCompound_name_type_pair(ClickHouseParser.Compound_name_type_pairContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#compound_name_type_pair}.
	 * @param ctx the parse tree
	 */
	void exitCompound_name_type_pair(ClickHouseParser.Compound_name_type_pairContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#column_declaration_list}.
	 * @param ctx the parse tree
	 */
	void enterColumn_declaration_list(ClickHouseParser.Column_declaration_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#column_declaration_list}.
	 * @param ctx the parse tree
	 */
	void exitColumn_declaration_list(ClickHouseParser.Column_declaration_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#column_declaration}.
	 * @param ctx the parse tree
	 */
	void enterColumn_declaration(ClickHouseParser.Column_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#column_declaration}.
	 * @param ctx the parse tree
	 */
	void exitColumn_declaration(ClickHouseParser.Column_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#column_name}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name(ClickHouseParser.Column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#column_name}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name(ClickHouseParser.Column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#column_type}.
	 * @param ctx the parse tree
	 */
	void enterColumn_type(ClickHouseParser.Column_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#column_type}.
	 * @param ctx the parse tree
	 */
	void exitColumn_type(ClickHouseParser.Column_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#column_name_list}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name_list(ClickHouseParser.Column_name_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#column_name_list}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name_list(ClickHouseParser.Column_name_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#select_expr_list}.
	 * @param ctx the parse tree
	 */
	void enterSelect_expr_list(ClickHouseParser.Select_expr_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#select_expr_list}.
	 * @param ctx the parse tree
	 */
	void exitSelect_expr_list(ClickHouseParser.Select_expr_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#select_expr}.
	 * @param ctx the parse tree
	 */
	void enterSelect_expr(ClickHouseParser.Select_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#select_expr}.
	 * @param ctx the parse tree
	 */
	void exitSelect_expr(ClickHouseParser.Select_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#select_alias}.
	 * @param ctx the parse tree
	 */
	void enterSelect_alias(ClickHouseParser.Select_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#select_alias}.
	 * @param ctx the parse tree
	 */
	void exitSelect_alias(ClickHouseParser.Select_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#alias}.
	 * @param ctx the parse tree
	 */
	void enterAlias(ClickHouseParser.AliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#alias}.
	 * @param ctx the parse tree
	 */
	void exitAlias(ClickHouseParser.AliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#alias_name}.
	 * @param ctx the parse tree
	 */
	void enterAlias_name(ClickHouseParser.Alias_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#alias_name}.
	 * @param ctx the parse tree
	 */
	void exitAlias_name(ClickHouseParser.Alias_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#table_function}.
	 * @param ctx the parse tree
	 */
	void enterTable_function(ClickHouseParser.Table_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#table_function}.
	 * @param ctx the parse tree
	 */
	void exitTable_function(ClickHouseParser.Table_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#subquery}.
	 * @param ctx the parse tree
	 */
	void enterSubquery(ClickHouseParser.SubqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#subquery}.
	 * @param ctx the parse tree
	 */
	void exitSubquery(ClickHouseParser.SubqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#expression_with_optional_alias}.
	 * @param ctx the parse tree
	 */
	void enterExpression_with_optional_alias(ClickHouseParser.Expression_with_optional_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#expression_with_optional_alias}.
	 * @param ctx the parse tree
	 */
	void exitExpression_with_optional_alias(ClickHouseParser.Expression_with_optional_aliasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprConcat}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprConcat(ClickHouseParser.ExprConcatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprConcat}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprConcat(ClickHouseParser.ExprConcatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprCase}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprCase(ClickHouseParser.ExprCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprCase}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprCase(ClickHouseParser.ExprCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprTupleElement}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprTupleElement(ClickHouseParser.ExprTupleElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprTupleElement}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprTupleElement(ClickHouseParser.ExprTupleElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprNot}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprNot(ClickHouseParser.ExprNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprNot}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprNot(ClickHouseParser.ExprNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprArray}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprArray(ClickHouseParser.ExprArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprArray}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprArray(ClickHouseParser.ExprArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprWithAlias}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprWithAlias(ClickHouseParser.ExprWithAliasContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprWithAlias}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprWithAlias(ClickHouseParser.ExprWithAliasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprLogical}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprLogical(ClickHouseParser.ExprLogicalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprLogical}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprLogical(ClickHouseParser.ExprLogicalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprIn}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprIn(ClickHouseParser.ExprInContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprIn}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprIn(ClickHouseParser.ExprInContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprCast}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprCast(ClickHouseParser.ExprCastContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprCast}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprCast(ClickHouseParser.ExprCastContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprOr}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprOr(ClickHouseParser.ExprOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprOr}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprOr(ClickHouseParser.ExprOrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprFunction}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprFunction(ClickHouseParser.ExprFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprFunction}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprFunction(ClickHouseParser.ExprFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprMul}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprMul(ClickHouseParser.ExprMulContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprMul}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprMul(ClickHouseParser.ExprMulContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprId}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprId(ClickHouseParser.ExprIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprId}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprId(ClickHouseParser.ExprIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprLambda}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprLambda(ClickHouseParser.ExprLambdaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprLambda}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprLambda(ClickHouseParser.ExprLambdaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprTernary}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprTernary(ClickHouseParser.ExprTernaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprTernary}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprTernary(ClickHouseParser.ExprTernaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprParen}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprParen(ClickHouseParser.ExprParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprParen}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprParen(ClickHouseParser.ExprParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprBetween}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprBetween(ClickHouseParser.ExprBetweenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprBetween}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprBetween(ClickHouseParser.ExprBetweenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprSubquery}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprSubquery(ClickHouseParser.ExprSubqueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprSubquery}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprSubquery(ClickHouseParser.ExprSubqueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprStar}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprStar(ClickHouseParser.ExprStarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprStar}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprStar(ClickHouseParser.ExprStarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprInterval}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprInterval(ClickHouseParser.ExprIntervalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprInterval}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprInterval(ClickHouseParser.ExprIntervalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAnd}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAnd(ClickHouseParser.ExprAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAnd}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAnd(ClickHouseParser.ExprAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprArrayElement}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprArrayElement(ClickHouseParser.ExprArrayElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprArrayElement}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprArrayElement(ClickHouseParser.ExprArrayElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprIsNull}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprIsNull(ClickHouseParser.ExprIsNullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprIsNull}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprIsNull(ClickHouseParser.ExprIsNullContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprList}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprList(ClickHouseParser.ExprListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprList}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprList(ClickHouseParser.ExprListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprLiteral}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprLiteral(ClickHouseParser.ExprLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprLiteral}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprLiteral(ClickHouseParser.ExprLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprUnaryMinus}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprUnaryMinus(ClickHouseParser.ExprUnaryMinusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprUnaryMinus}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprUnaryMinus(ClickHouseParser.ExprUnaryMinusContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ExprAdd}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprAdd(ClickHouseParser.ExprAddContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ExprAdd}
	 * labeled alternative in {@link ClickHouseParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprAdd(ClickHouseParser.ExprAddContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#interval_unit}.
	 * @param ctx the parse tree
	 */
	void enterInterval_unit(ClickHouseParser.Interval_unitContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#interval_unit}.
	 * @param ctx the parse tree
	 */
	void exitInterval_unit(ClickHouseParser.Interval_unitContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void enterExpression_list(ClickHouseParser.Expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void exitExpression_list(ClickHouseParser.Expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#not_empty_expression_list}.
	 * @param ctx the parse tree
	 */
	void enterNot_empty_expression_list(ClickHouseParser.Not_empty_expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#not_empty_expression_list}.
	 * @param ctx the parse tree
	 */
	void exitNot_empty_expression_list(ClickHouseParser.Not_empty_expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#array}.
	 * @param ctx the parse tree
	 */
	void enterArray(ClickHouseParser.ArrayContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#array}.
	 * @param ctx the parse tree
	 */
	void exitArray(ClickHouseParser.ArrayContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#function}.
	 * @param ctx the parse tree
	 */
	void enterFunction(ClickHouseParser.FunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#function}.
	 * @param ctx the parse tree
	 */
	void exitFunction(ClickHouseParser.FunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#function_parameters}.
	 * @param ctx the parse tree
	 */
	void enterFunction_parameters(ClickHouseParser.Function_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#function_parameters}.
	 * @param ctx the parse tree
	 */
	void exitFunction_parameters(ClickHouseParser.Function_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#function_arguments}.
	 * @param ctx the parse tree
	 */
	void enterFunction_arguments(ClickHouseParser.Function_argumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#function_arguments}.
	 * @param ctx the parse tree
	 */
	void exitFunction_arguments(ClickHouseParser.Function_argumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#function_name}.
	 * @param ctx the parse tree
	 */
	void enterFunction_name(ClickHouseParser.Function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#function_name}.
	 * @param ctx the parse tree
	 */
	void exitFunction_name(ClickHouseParser.Function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(ClickHouseParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(ClickHouseParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#keyword}.
	 * @param ctx the parse tree
	 */
	void enterKeyword(ClickHouseParser.KeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#keyword}.
	 * @param ctx the parse tree
	 */
	void exitKeyword(ClickHouseParser.KeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#compound_identifier}.
	 * @param ctx the parse tree
	 */
	void enterCompound_identifier(ClickHouseParser.Compound_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#compound_identifier}.
	 * @param ctx the parse tree
	 */
	void exitCompound_identifier(ClickHouseParser.Compound_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#literal}.
	 * @param ctx the parse tree
	 */
	void enterLiteral(ClickHouseParser.LiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#literal}.
	 * @param ctx the parse tree
	 */
	void exitLiteral(ClickHouseParser.LiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#err}.
	 * @param ctx the parse tree
	 */
	void enterErr(ClickHouseParser.ErrContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#err}.
	 * @param ctx the parse tree
	 */
	void exitErr(ClickHouseParser.ErrContext ctx);
}