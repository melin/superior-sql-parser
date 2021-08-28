// Generated from com/dataworker/sql/parser/antlr4/postgresql/PostgreSQLParser.g4 by ANTLR 4.8
package com.dataworker.sql.parser.antlr4.postgresql;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PostgreSQLParser}.
 */
public interface PostgreSQLParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#sql}.
	 * @param ctx the parse tree
	 */
	void enterSql(PostgreSQLParser.SqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#sql}.
	 * @param ctx the parse tree
	 */
	void exitSql(PostgreSQLParser.SqlContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#qname_parser}.
	 * @param ctx the parse tree
	 */
	void enterQname_parser(PostgreSQLParser.Qname_parserContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#qname_parser}.
	 * @param ctx the parse tree
	 */
	void exitQname_parser(PostgreSQLParser.Qname_parserContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#function_args_parser}.
	 * @param ctx the parse tree
	 */
	void enterFunction_args_parser(PostgreSQLParser.Function_args_parserContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#function_args_parser}.
	 * @param ctx the parse tree
	 */
	void exitFunction_args_parser(PostgreSQLParser.Function_args_parserContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#vex_eof}.
	 * @param ctx the parse tree
	 */
	void enterVex_eof(PostgreSQLParser.Vex_eofContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#vex_eof}.
	 * @param ctx the parse tree
	 */
	void exitVex_eof(PostgreSQLParser.Vex_eofContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#plpgsql_function}.
	 * @param ctx the parse tree
	 */
	void enterPlpgsql_function(PostgreSQLParser.Plpgsql_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#plpgsql_function}.
	 * @param ctx the parse tree
	 */
	void exitPlpgsql_function(PostgreSQLParser.Plpgsql_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#plpgsql_function_test_list}.
	 * @param ctx the parse tree
	 */
	void enterPlpgsql_function_test_list(PostgreSQLParser.Plpgsql_function_test_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#plpgsql_function_test_list}.
	 * @param ctx the parse tree
	 */
	void exitPlpgsql_function_test_list(PostgreSQLParser.Plpgsql_function_test_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(PostgreSQLParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(PostgreSQLParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#data_statement}.
	 * @param ctx the parse tree
	 */
	void enterData_statement(PostgreSQLParser.Data_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#data_statement}.
	 * @param ctx the parse tree
	 */
	void exitData_statement(PostgreSQLParser.Data_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#script_statement}.
	 * @param ctx the parse tree
	 */
	void enterScript_statement(PostgreSQLParser.Script_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#script_statement}.
	 * @param ctx the parse tree
	 */
	void exitScript_statement(PostgreSQLParser.Script_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#script_transaction}.
	 * @param ctx the parse tree
	 */
	void enterScript_transaction(PostgreSQLParser.Script_transactionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#script_transaction}.
	 * @param ctx the parse tree
	 */
	void exitScript_transaction(PostgreSQLParser.Script_transactionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#transaction_mode}.
	 * @param ctx the parse tree
	 */
	void enterTransaction_mode(PostgreSQLParser.Transaction_modeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#transaction_mode}.
	 * @param ctx the parse tree
	 */
	void exitTransaction_mode(PostgreSQLParser.Transaction_modeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#lock_table}.
	 * @param ctx the parse tree
	 */
	void enterLock_table(PostgreSQLParser.Lock_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#lock_table}.
	 * @param ctx the parse tree
	 */
	void exitLock_table(PostgreSQLParser.Lock_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#lock_mode}.
	 * @param ctx the parse tree
	 */
	void enterLock_mode(PostgreSQLParser.Lock_modeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#lock_mode}.
	 * @param ctx the parse tree
	 */
	void exitLock_mode(PostgreSQLParser.Lock_modeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#script_additional}.
	 * @param ctx the parse tree
	 */
	void enterScript_additional(PostgreSQLParser.Script_additionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#script_additional}.
	 * @param ctx the parse tree
	 */
	void exitScript_additional(PostgreSQLParser.Script_additionalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#additional_statement}.
	 * @param ctx the parse tree
	 */
	void enterAdditional_statement(PostgreSQLParser.Additional_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#additional_statement}.
	 * @param ctx the parse tree
	 */
	void exitAdditional_statement(PostgreSQLParser.Additional_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#explain_statement}.
	 * @param ctx the parse tree
	 */
	void enterExplain_statement(PostgreSQLParser.Explain_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#explain_statement}.
	 * @param ctx the parse tree
	 */
	void exitExplain_statement(PostgreSQLParser.Explain_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#explain_query}.
	 * @param ctx the parse tree
	 */
	void enterExplain_query(PostgreSQLParser.Explain_queryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#explain_query}.
	 * @param ctx the parse tree
	 */
	void exitExplain_query(PostgreSQLParser.Explain_queryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#execute_statement}.
	 * @param ctx the parse tree
	 */
	void enterExecute_statement(PostgreSQLParser.Execute_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#execute_statement}.
	 * @param ctx the parse tree
	 */
	void exitExecute_statement(PostgreSQLParser.Execute_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#declare_statement}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_statement(PostgreSQLParser.Declare_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#declare_statement}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_statement(PostgreSQLParser.Declare_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#show_statement}.
	 * @param ctx the parse tree
	 */
	void enterShow_statement(PostgreSQLParser.Show_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#show_statement}.
	 * @param ctx the parse tree
	 */
	void exitShow_statement(PostgreSQLParser.Show_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#explain_option}.
	 * @param ctx the parse tree
	 */
	void enterExplain_option(PostgreSQLParser.Explain_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#explain_option}.
	 * @param ctx the parse tree
	 */
	void exitExplain_option(PostgreSQLParser.Explain_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#user_name}.
	 * @param ctx the parse tree
	 */
	void enterUser_name(PostgreSQLParser.User_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#user_name}.
	 * @param ctx the parse tree
	 */
	void exitUser_name(PostgreSQLParser.User_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#table_cols_list}.
	 * @param ctx the parse tree
	 */
	void enterTable_cols_list(PostgreSQLParser.Table_cols_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#table_cols_list}.
	 * @param ctx the parse tree
	 */
	void exitTable_cols_list(PostgreSQLParser.Table_cols_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#table_cols}.
	 * @param ctx the parse tree
	 */
	void enterTable_cols(PostgreSQLParser.Table_colsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#table_cols}.
	 * @param ctx the parse tree
	 */
	void exitTable_cols(PostgreSQLParser.Table_colsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#vacuum_mode}.
	 * @param ctx the parse tree
	 */
	void enterVacuum_mode(PostgreSQLParser.Vacuum_modeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#vacuum_mode}.
	 * @param ctx the parse tree
	 */
	void exitVacuum_mode(PostgreSQLParser.Vacuum_modeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#vacuum_option}.
	 * @param ctx the parse tree
	 */
	void enterVacuum_option(PostgreSQLParser.Vacuum_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#vacuum_option}.
	 * @param ctx the parse tree
	 */
	void exitVacuum_option(PostgreSQLParser.Vacuum_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#analyze_mode}.
	 * @param ctx the parse tree
	 */
	void enterAnalyze_mode(PostgreSQLParser.Analyze_modeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#analyze_mode}.
	 * @param ctx the parse tree
	 */
	void exitAnalyze_mode(PostgreSQLParser.Analyze_modeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#boolean_value}.
	 * @param ctx the parse tree
	 */
	void enterBoolean_value(PostgreSQLParser.Boolean_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#boolean_value}.
	 * @param ctx the parse tree
	 */
	void exitBoolean_value(PostgreSQLParser.Boolean_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#fetch_move_direction}.
	 * @param ctx the parse tree
	 */
	void enterFetch_move_direction(PostgreSQLParser.Fetch_move_directionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#fetch_move_direction}.
	 * @param ctx the parse tree
	 */
	void exitFetch_move_direction(PostgreSQLParser.Fetch_move_directionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#schema_statement}.
	 * @param ctx the parse tree
	 */
	void enterSchema_statement(PostgreSQLParser.Schema_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#schema_statement}.
	 * @param ctx the parse tree
	 */
	void exitSchema_statement(PostgreSQLParser.Schema_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#schema_create}.
	 * @param ctx the parse tree
	 */
	void enterSchema_create(PostgreSQLParser.Schema_createContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#schema_create}.
	 * @param ctx the parse tree
	 */
	void exitSchema_create(PostgreSQLParser.Schema_createContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#schema_alter}.
	 * @param ctx the parse tree
	 */
	void enterSchema_alter(PostgreSQLParser.Schema_alterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#schema_alter}.
	 * @param ctx the parse tree
	 */
	void exitSchema_alter(PostgreSQLParser.Schema_alterContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#schema_drop}.
	 * @param ctx the parse tree
	 */
	void enterSchema_drop(PostgreSQLParser.Schema_dropContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#schema_drop}.
	 * @param ctx the parse tree
	 */
	void exitSchema_drop(PostgreSQLParser.Schema_dropContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#schema_import}.
	 * @param ctx the parse tree
	 */
	void enterSchema_import(PostgreSQLParser.Schema_importContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#schema_import}.
	 * @param ctx the parse tree
	 */
	void exitSchema_import(PostgreSQLParser.Schema_importContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_function_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_function_statement(PostgreSQLParser.Alter_function_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_function_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_function_statement(PostgreSQLParser.Alter_function_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_aggregate_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_aggregate_statement(PostgreSQLParser.Alter_aggregate_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_aggregate_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_aggregate_statement(PostgreSQLParser.Alter_aggregate_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_extension_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_extension_statement(PostgreSQLParser.Alter_extension_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_extension_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_extension_statement(PostgreSQLParser.Alter_extension_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_extension_action}.
	 * @param ctx the parse tree
	 */
	void enterAlter_extension_action(PostgreSQLParser.Alter_extension_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_extension_action}.
	 * @param ctx the parse tree
	 */
	void exitAlter_extension_action(PostgreSQLParser.Alter_extension_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#extension_member_object}.
	 * @param ctx the parse tree
	 */
	void enterExtension_member_object(PostgreSQLParser.Extension_member_objectContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#extension_member_object}.
	 * @param ctx the parse tree
	 */
	void exitExtension_member_object(PostgreSQLParser.Extension_member_objectContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_schema_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_schema_statement(PostgreSQLParser.Alter_schema_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_schema_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_schema_statement(PostgreSQLParser.Alter_schema_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_language_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_language_statement(PostgreSQLParser.Alter_language_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_language_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_language_statement(PostgreSQLParser.Alter_language_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_table_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table_statement(PostgreSQLParser.Alter_table_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_table_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table_statement(PostgreSQLParser.Alter_table_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#table_action}.
	 * @param ctx the parse tree
	 */
	void enterTable_action(PostgreSQLParser.Table_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#table_action}.
	 * @param ctx the parse tree
	 */
	void exitTable_action(PostgreSQLParser.Table_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#column_action}.
	 * @param ctx the parse tree
	 */
	void enterColumn_action(PostgreSQLParser.Column_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#column_action}.
	 * @param ctx the parse tree
	 */
	void exitColumn_action(PostgreSQLParser.Column_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#identity_body}.
	 * @param ctx the parse tree
	 */
	void enterIdentity_body(PostgreSQLParser.Identity_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#identity_body}.
	 * @param ctx the parse tree
	 */
	void exitIdentity_body(PostgreSQLParser.Identity_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_identity}.
	 * @param ctx the parse tree
	 */
	void enterAlter_identity(PostgreSQLParser.Alter_identityContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_identity}.
	 * @param ctx the parse tree
	 */
	void exitAlter_identity(PostgreSQLParser.Alter_identityContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#storage_option}.
	 * @param ctx the parse tree
	 */
	void enterStorage_option(PostgreSQLParser.Storage_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#storage_option}.
	 * @param ctx the parse tree
	 */
	void exitStorage_option(PostgreSQLParser.Storage_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#validate_constraint}.
	 * @param ctx the parse tree
	 */
	void enterValidate_constraint(PostgreSQLParser.Validate_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#validate_constraint}.
	 * @param ctx the parse tree
	 */
	void exitValidate_constraint(PostgreSQLParser.Validate_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#drop_constraint}.
	 * @param ctx the parse tree
	 */
	void enterDrop_constraint(PostgreSQLParser.Drop_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#drop_constraint}.
	 * @param ctx the parse tree
	 */
	void exitDrop_constraint(PostgreSQLParser.Drop_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#table_deferrable}.
	 * @param ctx the parse tree
	 */
	void enterTable_deferrable(PostgreSQLParser.Table_deferrableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#table_deferrable}.
	 * @param ctx the parse tree
	 */
	void exitTable_deferrable(PostgreSQLParser.Table_deferrableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#table_initialy_immed}.
	 * @param ctx the parse tree
	 */
	void enterTable_initialy_immed(PostgreSQLParser.Table_initialy_immedContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#table_initialy_immed}.
	 * @param ctx the parse tree
	 */
	void exitTable_initialy_immed(PostgreSQLParser.Table_initialy_immedContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#function_actions_common}.
	 * @param ctx the parse tree
	 */
	void enterFunction_actions_common(PostgreSQLParser.Function_actions_commonContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#function_actions_common}.
	 * @param ctx the parse tree
	 */
	void exitFunction_actions_common(PostgreSQLParser.Function_actions_commonContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#function_def}.
	 * @param ctx the parse tree
	 */
	void enterFunction_def(PostgreSQLParser.Function_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#function_def}.
	 * @param ctx the parse tree
	 */
	void exitFunction_def(PostgreSQLParser.Function_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_index_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_index_statement(PostgreSQLParser.Alter_index_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_index_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_index_statement(PostgreSQLParser.Alter_index_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#index_def_action}.
	 * @param ctx the parse tree
	 */
	void enterIndex_def_action(PostgreSQLParser.Index_def_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#index_def_action}.
	 * @param ctx the parse tree
	 */
	void exitIndex_def_action(PostgreSQLParser.Index_def_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_default_privileges}.
	 * @param ctx the parse tree
	 */
	void enterAlter_default_privileges(PostgreSQLParser.Alter_default_privilegesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_default_privileges}.
	 * @param ctx the parse tree
	 */
	void exitAlter_default_privileges(PostgreSQLParser.Alter_default_privilegesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#abbreviated_grant_or_revoke}.
	 * @param ctx the parse tree
	 */
	void enterAbbreviated_grant_or_revoke(PostgreSQLParser.Abbreviated_grant_or_revokeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#abbreviated_grant_or_revoke}.
	 * @param ctx the parse tree
	 */
	void exitAbbreviated_grant_or_revoke(PostgreSQLParser.Abbreviated_grant_or_revokeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#grant_option_for}.
	 * @param ctx the parse tree
	 */
	void enterGrant_option_for(PostgreSQLParser.Grant_option_forContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#grant_option_for}.
	 * @param ctx the parse tree
	 */
	void exitGrant_option_for(PostgreSQLParser.Grant_option_forContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_sequence_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_sequence_statement(PostgreSQLParser.Alter_sequence_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_sequence_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_sequence_statement(PostgreSQLParser.Alter_sequence_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_view_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_view_statement(PostgreSQLParser.Alter_view_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_view_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_view_statement(PostgreSQLParser.Alter_view_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_event_trigger}.
	 * @param ctx the parse tree
	 */
	void enterAlter_event_trigger(PostgreSQLParser.Alter_event_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_event_trigger}.
	 * @param ctx the parse tree
	 */
	void exitAlter_event_trigger(PostgreSQLParser.Alter_event_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_event_trigger_action}.
	 * @param ctx the parse tree
	 */
	void enterAlter_event_trigger_action(PostgreSQLParser.Alter_event_trigger_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_event_trigger_action}.
	 * @param ctx the parse tree
	 */
	void exitAlter_event_trigger_action(PostgreSQLParser.Alter_event_trigger_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_type_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_type_statement(PostgreSQLParser.Alter_type_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_type_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_type_statement(PostgreSQLParser.Alter_type_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_domain_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_domain_statement(PostgreSQLParser.Alter_domain_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_domain_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_domain_statement(PostgreSQLParser.Alter_domain_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_server_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_server_statement(PostgreSQLParser.Alter_server_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_server_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_server_statement(PostgreSQLParser.Alter_server_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_server_action}.
	 * @param ctx the parse tree
	 */
	void enterAlter_server_action(PostgreSQLParser.Alter_server_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_server_action}.
	 * @param ctx the parse tree
	 */
	void exitAlter_server_action(PostgreSQLParser.Alter_server_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_fts_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_fts_statement(PostgreSQLParser.Alter_fts_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_fts_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_fts_statement(PostgreSQLParser.Alter_fts_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_fts_configuration}.
	 * @param ctx the parse tree
	 */
	void enterAlter_fts_configuration(PostgreSQLParser.Alter_fts_configurationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_fts_configuration}.
	 * @param ctx the parse tree
	 */
	void exitAlter_fts_configuration(PostgreSQLParser.Alter_fts_configurationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#type_action}.
	 * @param ctx the parse tree
	 */
	void enterType_action(PostgreSQLParser.Type_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#type_action}.
	 * @param ctx the parse tree
	 */
	void exitType_action(PostgreSQLParser.Type_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#set_def_column}.
	 * @param ctx the parse tree
	 */
	void enterSet_def_column(PostgreSQLParser.Set_def_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#set_def_column}.
	 * @param ctx the parse tree
	 */
	void exitSet_def_column(PostgreSQLParser.Set_def_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#drop_def}.
	 * @param ctx the parse tree
	 */
	void enterDrop_def(PostgreSQLParser.Drop_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#drop_def}.
	 * @param ctx the parse tree
	 */
	void exitDrop_def(PostgreSQLParser.Drop_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_index_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_index_statement(PostgreSQLParser.Create_index_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_index_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_index_statement(PostgreSQLParser.Create_index_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#index_rest}.
	 * @param ctx the parse tree
	 */
	void enterIndex_rest(PostgreSQLParser.Index_restContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#index_rest}.
	 * @param ctx the parse tree
	 */
	void exitIndex_rest(PostgreSQLParser.Index_restContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#index_sort}.
	 * @param ctx the parse tree
	 */
	void enterIndex_sort(PostgreSQLParser.Index_sortContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#index_sort}.
	 * @param ctx the parse tree
	 */
	void exitIndex_sort(PostgreSQLParser.Index_sortContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#including_index}.
	 * @param ctx the parse tree
	 */
	void enterIncluding_index(PostgreSQLParser.Including_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#including_index}.
	 * @param ctx the parse tree
	 */
	void exitIncluding_index(PostgreSQLParser.Including_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#index_where}.
	 * @param ctx the parse tree
	 */
	void enterIndex_where(PostgreSQLParser.Index_whereContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#index_where}.
	 * @param ctx the parse tree
	 */
	void exitIndex_where(PostgreSQLParser.Index_whereContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_extension_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_extension_statement(PostgreSQLParser.Create_extension_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_extension_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_extension_statement(PostgreSQLParser.Create_extension_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_language_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_language_statement(PostgreSQLParser.Create_language_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_language_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_language_statement(PostgreSQLParser.Create_language_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_event_trigger}.
	 * @param ctx the parse tree
	 */
	void enterCreate_event_trigger(PostgreSQLParser.Create_event_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_event_trigger}.
	 * @param ctx the parse tree
	 */
	void exitCreate_event_trigger(PostgreSQLParser.Create_event_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_type_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_type_statement(PostgreSQLParser.Create_type_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_type_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_type_statement(PostgreSQLParser.Create_type_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_domain_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_domain_statement(PostgreSQLParser.Create_domain_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_domain_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_domain_statement(PostgreSQLParser.Create_domain_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_server_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_server_statement(PostgreSQLParser.Create_server_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_server_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_server_statement(PostgreSQLParser.Create_server_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_fts_dictionary}.
	 * @param ctx the parse tree
	 */
	void enterCreate_fts_dictionary(PostgreSQLParser.Create_fts_dictionaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_fts_dictionary}.
	 * @param ctx the parse tree
	 */
	void exitCreate_fts_dictionary(PostgreSQLParser.Create_fts_dictionaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#option_with_value}.
	 * @param ctx the parse tree
	 */
	void enterOption_with_value(PostgreSQLParser.Option_with_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#option_with_value}.
	 * @param ctx the parse tree
	 */
	void exitOption_with_value(PostgreSQLParser.Option_with_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_fts_configuration}.
	 * @param ctx the parse tree
	 */
	void enterCreate_fts_configuration(PostgreSQLParser.Create_fts_configurationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_fts_configuration}.
	 * @param ctx the parse tree
	 */
	void exitCreate_fts_configuration(PostgreSQLParser.Create_fts_configurationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_fts_template}.
	 * @param ctx the parse tree
	 */
	void enterCreate_fts_template(PostgreSQLParser.Create_fts_templateContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_fts_template}.
	 * @param ctx the parse tree
	 */
	void exitCreate_fts_template(PostgreSQLParser.Create_fts_templateContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_fts_parser}.
	 * @param ctx the parse tree
	 */
	void enterCreate_fts_parser(PostgreSQLParser.Create_fts_parserContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_fts_parser}.
	 * @param ctx the parse tree
	 */
	void exitCreate_fts_parser(PostgreSQLParser.Create_fts_parserContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_collation}.
	 * @param ctx the parse tree
	 */
	void enterCreate_collation(PostgreSQLParser.Create_collationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_collation}.
	 * @param ctx the parse tree
	 */
	void exitCreate_collation(PostgreSQLParser.Create_collationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_collation}.
	 * @param ctx the parse tree
	 */
	void enterAlter_collation(PostgreSQLParser.Alter_collationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_collation}.
	 * @param ctx the parse tree
	 */
	void exitAlter_collation(PostgreSQLParser.Alter_collationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#collation_option}.
	 * @param ctx the parse tree
	 */
	void enterCollation_option(PostgreSQLParser.Collation_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#collation_option}.
	 * @param ctx the parse tree
	 */
	void exitCollation_option(PostgreSQLParser.Collation_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_user_mapping}.
	 * @param ctx the parse tree
	 */
	void enterCreate_user_mapping(PostgreSQLParser.Create_user_mappingContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_user_mapping}.
	 * @param ctx the parse tree
	 */
	void exitCreate_user_mapping(PostgreSQLParser.Create_user_mappingContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_user_mapping}.
	 * @param ctx the parse tree
	 */
	void enterAlter_user_mapping(PostgreSQLParser.Alter_user_mappingContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_user_mapping}.
	 * @param ctx the parse tree
	 */
	void exitAlter_user_mapping(PostgreSQLParser.Alter_user_mappingContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_user_or_role}.
	 * @param ctx the parse tree
	 */
	void enterAlter_user_or_role(PostgreSQLParser.Alter_user_or_roleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_user_or_role}.
	 * @param ctx the parse tree
	 */
	void exitAlter_user_or_role(PostgreSQLParser.Alter_user_or_roleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_user_or_role_set_reset}.
	 * @param ctx the parse tree
	 */
	void enterAlter_user_or_role_set_reset(PostgreSQLParser.Alter_user_or_role_set_resetContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_user_or_role_set_reset}.
	 * @param ctx the parse tree
	 */
	void exitAlter_user_or_role_set_reset(PostgreSQLParser.Alter_user_or_role_set_resetContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#user_or_role_set_reset}.
	 * @param ctx the parse tree
	 */
	void enterUser_or_role_set_reset(PostgreSQLParser.User_or_role_set_resetContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#user_or_role_set_reset}.
	 * @param ctx the parse tree
	 */
	void exitUser_or_role_set_reset(PostgreSQLParser.User_or_role_set_resetContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_group}.
	 * @param ctx the parse tree
	 */
	void enterAlter_group(PostgreSQLParser.Alter_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_group}.
	 * @param ctx the parse tree
	 */
	void exitAlter_group(PostgreSQLParser.Alter_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_group_action}.
	 * @param ctx the parse tree
	 */
	void enterAlter_group_action(PostgreSQLParser.Alter_group_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_group_action}.
	 * @param ctx the parse tree
	 */
	void exitAlter_group_action(PostgreSQLParser.Alter_group_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_tablespace}.
	 * @param ctx the parse tree
	 */
	void enterAlter_tablespace(PostgreSQLParser.Alter_tablespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_tablespace}.
	 * @param ctx the parse tree
	 */
	void exitAlter_tablespace(PostgreSQLParser.Alter_tablespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_owner}.
	 * @param ctx the parse tree
	 */
	void enterAlter_owner(PostgreSQLParser.Alter_ownerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_owner}.
	 * @param ctx the parse tree
	 */
	void exitAlter_owner(PostgreSQLParser.Alter_ownerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_tablespace_action}.
	 * @param ctx the parse tree
	 */
	void enterAlter_tablespace_action(PostgreSQLParser.Alter_tablespace_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_tablespace_action}.
	 * @param ctx the parse tree
	 */
	void exitAlter_tablespace_action(PostgreSQLParser.Alter_tablespace_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_statistics}.
	 * @param ctx the parse tree
	 */
	void enterAlter_statistics(PostgreSQLParser.Alter_statisticsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_statistics}.
	 * @param ctx the parse tree
	 */
	void exitAlter_statistics(PostgreSQLParser.Alter_statisticsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_foreign_data_wrapper}.
	 * @param ctx the parse tree
	 */
	void enterAlter_foreign_data_wrapper(PostgreSQLParser.Alter_foreign_data_wrapperContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_foreign_data_wrapper}.
	 * @param ctx the parse tree
	 */
	void exitAlter_foreign_data_wrapper(PostgreSQLParser.Alter_foreign_data_wrapperContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_foreign_data_wrapper_action}.
	 * @param ctx the parse tree
	 */
	void enterAlter_foreign_data_wrapper_action(PostgreSQLParser.Alter_foreign_data_wrapper_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_foreign_data_wrapper_action}.
	 * @param ctx the parse tree
	 */
	void exitAlter_foreign_data_wrapper_action(PostgreSQLParser.Alter_foreign_data_wrapper_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_operator_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_operator_statement(PostgreSQLParser.Alter_operator_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_operator_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_operator_statement(PostgreSQLParser.Alter_operator_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_operator_action}.
	 * @param ctx the parse tree
	 */
	void enterAlter_operator_action(PostgreSQLParser.Alter_operator_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_operator_action}.
	 * @param ctx the parse tree
	 */
	void exitAlter_operator_action(PostgreSQLParser.Alter_operator_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#operator_set_restrict_join}.
	 * @param ctx the parse tree
	 */
	void enterOperator_set_restrict_join(PostgreSQLParser.Operator_set_restrict_joinContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#operator_set_restrict_join}.
	 * @param ctx the parse tree
	 */
	void exitOperator_set_restrict_join(PostgreSQLParser.Operator_set_restrict_joinContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#drop_user_mapping}.
	 * @param ctx the parse tree
	 */
	void enterDrop_user_mapping(PostgreSQLParser.Drop_user_mappingContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#drop_user_mapping}.
	 * @param ctx the parse tree
	 */
	void exitDrop_user_mapping(PostgreSQLParser.Drop_user_mappingContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#drop_owned}.
	 * @param ctx the parse tree
	 */
	void enterDrop_owned(PostgreSQLParser.Drop_ownedContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#drop_owned}.
	 * @param ctx the parse tree
	 */
	void exitDrop_owned(PostgreSQLParser.Drop_ownedContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#drop_operator_statement}.
	 * @param ctx the parse tree
	 */
	void enterDrop_operator_statement(PostgreSQLParser.Drop_operator_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#drop_operator_statement}.
	 * @param ctx the parse tree
	 */
	void exitDrop_operator_statement(PostgreSQLParser.Drop_operator_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#target_operator}.
	 * @param ctx the parse tree
	 */
	void enterTarget_operator(PostgreSQLParser.Target_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#target_operator}.
	 * @param ctx the parse tree
	 */
	void exitTarget_operator(PostgreSQLParser.Target_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#domain_constraint}.
	 * @param ctx the parse tree
	 */
	void enterDomain_constraint(PostgreSQLParser.Domain_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#domain_constraint}.
	 * @param ctx the parse tree
	 */
	void exitDomain_constraint(PostgreSQLParser.Domain_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_transform_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_transform_statement(PostgreSQLParser.Create_transform_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_transform_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_transform_statement(PostgreSQLParser.Create_transform_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_access_method}.
	 * @param ctx the parse tree
	 */
	void enterCreate_access_method(PostgreSQLParser.Create_access_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_access_method}.
	 * @param ctx the parse tree
	 */
	void exitCreate_access_method(PostgreSQLParser.Create_access_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_user_or_role}.
	 * @param ctx the parse tree
	 */
	void enterCreate_user_or_role(PostgreSQLParser.Create_user_or_roleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_user_or_role}.
	 * @param ctx the parse tree
	 */
	void exitCreate_user_or_role(PostgreSQLParser.Create_user_or_roleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#user_or_role_option}.
	 * @param ctx the parse tree
	 */
	void enterUser_or_role_option(PostgreSQLParser.User_or_role_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#user_or_role_option}.
	 * @param ctx the parse tree
	 */
	void exitUser_or_role_option(PostgreSQLParser.User_or_role_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#user_or_role_option_for_alter}.
	 * @param ctx the parse tree
	 */
	void enterUser_or_role_option_for_alter(PostgreSQLParser.User_or_role_option_for_alterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#user_or_role_option_for_alter}.
	 * @param ctx the parse tree
	 */
	void exitUser_or_role_option_for_alter(PostgreSQLParser.User_or_role_option_for_alterContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#user_or_role_or_group_common_option}.
	 * @param ctx the parse tree
	 */
	void enterUser_or_role_or_group_common_option(PostgreSQLParser.User_or_role_or_group_common_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#user_or_role_or_group_common_option}.
	 * @param ctx the parse tree
	 */
	void exitUser_or_role_or_group_common_option(PostgreSQLParser.User_or_role_or_group_common_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#user_or_role_common_option}.
	 * @param ctx the parse tree
	 */
	void enterUser_or_role_common_option(PostgreSQLParser.User_or_role_common_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#user_or_role_common_option}.
	 * @param ctx the parse tree
	 */
	void exitUser_or_role_common_option(PostgreSQLParser.User_or_role_common_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#user_or_role_or_group_option_for_create}.
	 * @param ctx the parse tree
	 */
	void enterUser_or_role_or_group_option_for_create(PostgreSQLParser.User_or_role_or_group_option_for_createContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#user_or_role_or_group_option_for_create}.
	 * @param ctx the parse tree
	 */
	void exitUser_or_role_or_group_option_for_create(PostgreSQLParser.User_or_role_or_group_option_for_createContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_group}.
	 * @param ctx the parse tree
	 */
	void enterCreate_group(PostgreSQLParser.Create_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_group}.
	 * @param ctx the parse tree
	 */
	void exitCreate_group(PostgreSQLParser.Create_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#group_option}.
	 * @param ctx the parse tree
	 */
	void enterGroup_option(PostgreSQLParser.Group_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#group_option}.
	 * @param ctx the parse tree
	 */
	void exitGroup_option(PostgreSQLParser.Group_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_tablespace}.
	 * @param ctx the parse tree
	 */
	void enterCreate_tablespace(PostgreSQLParser.Create_tablespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_tablespace}.
	 * @param ctx the parse tree
	 */
	void exitCreate_tablespace(PostgreSQLParser.Create_tablespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_statistics}.
	 * @param ctx the parse tree
	 */
	void enterCreate_statistics(PostgreSQLParser.Create_statisticsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_statistics}.
	 * @param ctx the parse tree
	 */
	void exitCreate_statistics(PostgreSQLParser.Create_statisticsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_foreign_data_wrapper}.
	 * @param ctx the parse tree
	 */
	void enterCreate_foreign_data_wrapper(PostgreSQLParser.Create_foreign_data_wrapperContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_foreign_data_wrapper}.
	 * @param ctx the parse tree
	 */
	void exitCreate_foreign_data_wrapper(PostgreSQLParser.Create_foreign_data_wrapperContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#option_without_equal}.
	 * @param ctx the parse tree
	 */
	void enterOption_without_equal(PostgreSQLParser.Option_without_equalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#option_without_equal}.
	 * @param ctx the parse tree
	 */
	void exitOption_without_equal(PostgreSQLParser.Option_without_equalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_operator_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_operator_statement(PostgreSQLParser.Create_operator_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_operator_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_operator_statement(PostgreSQLParser.Create_operator_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#operator_name}.
	 * @param ctx the parse tree
	 */
	void enterOperator_name(PostgreSQLParser.Operator_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#operator_name}.
	 * @param ctx the parse tree
	 */
	void exitOperator_name(PostgreSQLParser.Operator_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#operator_option}.
	 * @param ctx the parse tree
	 */
	void enterOperator_option(PostgreSQLParser.Operator_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#operator_option}.
	 * @param ctx the parse tree
	 */
	void exitOperator_option(PostgreSQLParser.Operator_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_aggregate_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_aggregate_statement(PostgreSQLParser.Create_aggregate_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_aggregate_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_aggregate_statement(PostgreSQLParser.Create_aggregate_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#aggregate_param}.
	 * @param ctx the parse tree
	 */
	void enterAggregate_param(PostgreSQLParser.Aggregate_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#aggregate_param}.
	 * @param ctx the parse tree
	 */
	void exitAggregate_param(PostgreSQLParser.Aggregate_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#set_statement}.
	 * @param ctx the parse tree
	 */
	void enterSet_statement(PostgreSQLParser.Set_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#set_statement}.
	 * @param ctx the parse tree
	 */
	void exitSet_statement(PostgreSQLParser.Set_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#set_action}.
	 * @param ctx the parse tree
	 */
	void enterSet_action(PostgreSQLParser.Set_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#set_action}.
	 * @param ctx the parse tree
	 */
	void exitSet_action(PostgreSQLParser.Set_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#session_local_option}.
	 * @param ctx the parse tree
	 */
	void enterSession_local_option(PostgreSQLParser.Session_local_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#session_local_option}.
	 * @param ctx the parse tree
	 */
	void exitSession_local_option(PostgreSQLParser.Session_local_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#set_statement_value}.
	 * @param ctx the parse tree
	 */
	void enterSet_statement_value(PostgreSQLParser.Set_statement_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#set_statement_value}.
	 * @param ctx the parse tree
	 */
	void exitSet_statement_value(PostgreSQLParser.Set_statement_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_rewrite_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_rewrite_statement(PostgreSQLParser.Create_rewrite_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_rewrite_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_rewrite_statement(PostgreSQLParser.Create_rewrite_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#rewrite_command}.
	 * @param ctx the parse tree
	 */
	void enterRewrite_command(PostgreSQLParser.Rewrite_commandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#rewrite_command}.
	 * @param ctx the parse tree
	 */
	void exitRewrite_command(PostgreSQLParser.Rewrite_commandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_trigger_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_trigger_statement(PostgreSQLParser.Create_trigger_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_trigger_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_trigger_statement(PostgreSQLParser.Create_trigger_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#trigger_referencing}.
	 * @param ctx the parse tree
	 */
	void enterTrigger_referencing(PostgreSQLParser.Trigger_referencingContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#trigger_referencing}.
	 * @param ctx the parse tree
	 */
	void exitTrigger_referencing(PostgreSQLParser.Trigger_referencingContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#when_trigger}.
	 * @param ctx the parse tree
	 */
	void enterWhen_trigger(PostgreSQLParser.When_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#when_trigger}.
	 * @param ctx the parse tree
	 */
	void exitWhen_trigger(PostgreSQLParser.When_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#rule_common}.
	 * @param ctx the parse tree
	 */
	void enterRule_common(PostgreSQLParser.Rule_commonContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#rule_common}.
	 * @param ctx the parse tree
	 */
	void exitRule_common(PostgreSQLParser.Rule_commonContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#rule_member_object}.
	 * @param ctx the parse tree
	 */
	void enterRule_member_object(PostgreSQLParser.Rule_member_objectContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#rule_member_object}.
	 * @param ctx the parse tree
	 */
	void exitRule_member_object(PostgreSQLParser.Rule_member_objectContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#columns_permissions}.
	 * @param ctx the parse tree
	 */
	void enterColumns_permissions(PostgreSQLParser.Columns_permissionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#columns_permissions}.
	 * @param ctx the parse tree
	 */
	void exitColumns_permissions(PostgreSQLParser.Columns_permissionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#table_column_privileges}.
	 * @param ctx the parse tree
	 */
	void enterTable_column_privileges(PostgreSQLParser.Table_column_privilegesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#table_column_privileges}.
	 * @param ctx the parse tree
	 */
	void exitTable_column_privileges(PostgreSQLParser.Table_column_privilegesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#permissions}.
	 * @param ctx the parse tree
	 */
	void enterPermissions(PostgreSQLParser.PermissionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#permissions}.
	 * @param ctx the parse tree
	 */
	void exitPermissions(PostgreSQLParser.PermissionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#permission}.
	 * @param ctx the parse tree
	 */
	void enterPermission(PostgreSQLParser.PermissionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#permission}.
	 * @param ctx the parse tree
	 */
	void exitPermission(PostgreSQLParser.PermissionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#other_rules}.
	 * @param ctx the parse tree
	 */
	void enterOther_rules(PostgreSQLParser.Other_rulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#other_rules}.
	 * @param ctx the parse tree
	 */
	void exitOther_rules(PostgreSQLParser.Other_rulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#grant_to_rule}.
	 * @param ctx the parse tree
	 */
	void enterGrant_to_rule(PostgreSQLParser.Grant_to_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#grant_to_rule}.
	 * @param ctx the parse tree
	 */
	void exitGrant_to_rule(PostgreSQLParser.Grant_to_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#revoke_from_cascade_restrict}.
	 * @param ctx the parse tree
	 */
	void enterRevoke_from_cascade_restrict(PostgreSQLParser.Revoke_from_cascade_restrictContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#revoke_from_cascade_restrict}.
	 * @param ctx the parse tree
	 */
	void exitRevoke_from_cascade_restrict(PostgreSQLParser.Revoke_from_cascade_restrictContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#roles_names}.
	 * @param ctx the parse tree
	 */
	void enterRoles_names(PostgreSQLParser.Roles_namesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#roles_names}.
	 * @param ctx the parse tree
	 */
	void exitRoles_names(PostgreSQLParser.Roles_namesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#role_name_with_group}.
	 * @param ctx the parse tree
	 */
	void enterRole_name_with_group(PostgreSQLParser.Role_name_with_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#role_name_with_group}.
	 * @param ctx the parse tree
	 */
	void exitRole_name_with_group(PostgreSQLParser.Role_name_with_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#comment_on_statement}.
	 * @param ctx the parse tree
	 */
	void enterComment_on_statement(PostgreSQLParser.Comment_on_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#comment_on_statement}.
	 * @param ctx the parse tree
	 */
	void exitComment_on_statement(PostgreSQLParser.Comment_on_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#security_label}.
	 * @param ctx the parse tree
	 */
	void enterSecurity_label(PostgreSQLParser.Security_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#security_label}.
	 * @param ctx the parse tree
	 */
	void exitSecurity_label(PostgreSQLParser.Security_labelContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#comment_member_object}.
	 * @param ctx the parse tree
	 */
	void enterComment_member_object(PostgreSQLParser.Comment_member_objectContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#comment_member_object}.
	 * @param ctx the parse tree
	 */
	void exitComment_member_object(PostgreSQLParser.Comment_member_objectContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#label_member_object}.
	 * @param ctx the parse tree
	 */
	void enterLabel_member_object(PostgreSQLParser.Label_member_objectContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#label_member_object}.
	 * @param ctx the parse tree
	 */
	void exitLabel_member_object(PostgreSQLParser.Label_member_objectContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_function_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_function_statement(PostgreSQLParser.Create_function_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_function_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_function_statement(PostgreSQLParser.Create_function_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_funct_params}.
	 * @param ctx the parse tree
	 */
	void enterCreate_funct_params(PostgreSQLParser.Create_funct_paramsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_funct_params}.
	 * @param ctx the parse tree
	 */
	void exitCreate_funct_params(PostgreSQLParser.Create_funct_paramsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#transform_for_type}.
	 * @param ctx the parse tree
	 */
	void enterTransform_for_type(PostgreSQLParser.Transform_for_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#transform_for_type}.
	 * @param ctx the parse tree
	 */
	void exitTransform_for_type(PostgreSQLParser.Transform_for_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#function_ret_table}.
	 * @param ctx the parse tree
	 */
	void enterFunction_ret_table(PostgreSQLParser.Function_ret_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#function_ret_table}.
	 * @param ctx the parse tree
	 */
	void exitFunction_ret_table(PostgreSQLParser.Function_ret_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#function_column_name_type}.
	 * @param ctx the parse tree
	 */
	void enterFunction_column_name_type(PostgreSQLParser.Function_column_name_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#function_column_name_type}.
	 * @param ctx the parse tree
	 */
	void exitFunction_column_name_type(PostgreSQLParser.Function_column_name_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#function_parameters}.
	 * @param ctx the parse tree
	 */
	void enterFunction_parameters(PostgreSQLParser.Function_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#function_parameters}.
	 * @param ctx the parse tree
	 */
	void exitFunction_parameters(PostgreSQLParser.Function_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#function_args}.
	 * @param ctx the parse tree
	 */
	void enterFunction_args(PostgreSQLParser.Function_argsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#function_args}.
	 * @param ctx the parse tree
	 */
	void exitFunction_args(PostgreSQLParser.Function_argsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#agg_order}.
	 * @param ctx the parse tree
	 */
	void enterAgg_order(PostgreSQLParser.Agg_orderContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#agg_order}.
	 * @param ctx the parse tree
	 */
	void exitAgg_order(PostgreSQLParser.Agg_orderContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#character_string}.
	 * @param ctx the parse tree
	 */
	void enterCharacter_string(PostgreSQLParser.Character_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#character_string}.
	 * @param ctx the parse tree
	 */
	void exitCharacter_string(PostgreSQLParser.Character_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#function_arguments}.
	 * @param ctx the parse tree
	 */
	void enterFunction_arguments(PostgreSQLParser.Function_argumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#function_arguments}.
	 * @param ctx the parse tree
	 */
	void exitFunction_arguments(PostgreSQLParser.Function_argumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#argmode}.
	 * @param ctx the parse tree
	 */
	void enterArgmode(PostgreSQLParser.ArgmodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#argmode}.
	 * @param ctx the parse tree
	 */
	void exitArgmode(PostgreSQLParser.ArgmodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_sequence_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_sequence_statement(PostgreSQLParser.Create_sequence_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_sequence_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_sequence_statement(PostgreSQLParser.Create_sequence_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#sequence_body}.
	 * @param ctx the parse tree
	 */
	void enterSequence_body(PostgreSQLParser.Sequence_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#sequence_body}.
	 * @param ctx the parse tree
	 */
	void exitSequence_body(PostgreSQLParser.Sequence_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#signed_number_literal}.
	 * @param ctx the parse tree
	 */
	void enterSigned_number_literal(PostgreSQLParser.Signed_number_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#signed_number_literal}.
	 * @param ctx the parse tree
	 */
	void exitSigned_number_literal(PostgreSQLParser.Signed_number_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#signed_numerical_literal}.
	 * @param ctx the parse tree
	 */
	void enterSigned_numerical_literal(PostgreSQLParser.Signed_numerical_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#signed_numerical_literal}.
	 * @param ctx the parse tree
	 */
	void exitSigned_numerical_literal(PostgreSQLParser.Signed_numerical_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(PostgreSQLParser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(PostgreSQLParser.SignContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_schema_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_schema_statement(PostgreSQLParser.Create_schema_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_schema_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_schema_statement(PostgreSQLParser.Create_schema_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_policy_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_policy_statement(PostgreSQLParser.Create_policy_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_policy_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_policy_statement(PostgreSQLParser.Create_policy_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_policy_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_policy_statement(PostgreSQLParser.Alter_policy_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_policy_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_policy_statement(PostgreSQLParser.Alter_policy_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#drop_policy_statement}.
	 * @param ctx the parse tree
	 */
	void enterDrop_policy_statement(PostgreSQLParser.Drop_policy_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#drop_policy_statement}.
	 * @param ctx the parse tree
	 */
	void exitDrop_policy_statement(PostgreSQLParser.Drop_policy_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_subscription_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_subscription_statement(PostgreSQLParser.Create_subscription_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_subscription_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_subscription_statement(PostgreSQLParser.Create_subscription_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_subscription_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_subscription_statement(PostgreSQLParser.Alter_subscription_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_subscription_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_subscription_statement(PostgreSQLParser.Alter_subscription_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_subscription_action}.
	 * @param ctx the parse tree
	 */
	void enterAlter_subscription_action(PostgreSQLParser.Alter_subscription_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_subscription_action}.
	 * @param ctx the parse tree
	 */
	void exitAlter_subscription_action(PostgreSQLParser.Alter_subscription_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_cast_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_cast_statement(PostgreSQLParser.Create_cast_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_cast_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_cast_statement(PostgreSQLParser.Create_cast_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#drop_cast_statement}.
	 * @param ctx the parse tree
	 */
	void enterDrop_cast_statement(PostgreSQLParser.Drop_cast_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#drop_cast_statement}.
	 * @param ctx the parse tree
	 */
	void exitDrop_cast_statement(PostgreSQLParser.Drop_cast_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_operator_family_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_operator_family_statement(PostgreSQLParser.Create_operator_family_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_operator_family_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_operator_family_statement(PostgreSQLParser.Create_operator_family_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_operator_family_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_operator_family_statement(PostgreSQLParser.Alter_operator_family_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_operator_family_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_operator_family_statement(PostgreSQLParser.Alter_operator_family_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#operator_family_action}.
	 * @param ctx the parse tree
	 */
	void enterOperator_family_action(PostgreSQLParser.Operator_family_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#operator_family_action}.
	 * @param ctx the parse tree
	 */
	void exitOperator_family_action(PostgreSQLParser.Operator_family_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#add_operator_to_family}.
	 * @param ctx the parse tree
	 */
	void enterAdd_operator_to_family(PostgreSQLParser.Add_operator_to_familyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#add_operator_to_family}.
	 * @param ctx the parse tree
	 */
	void exitAdd_operator_to_family(PostgreSQLParser.Add_operator_to_familyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#drop_operator_from_family}.
	 * @param ctx the parse tree
	 */
	void enterDrop_operator_from_family(PostgreSQLParser.Drop_operator_from_familyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#drop_operator_from_family}.
	 * @param ctx the parse tree
	 */
	void exitDrop_operator_from_family(PostgreSQLParser.Drop_operator_from_familyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#drop_operator_family_statement}.
	 * @param ctx the parse tree
	 */
	void enterDrop_operator_family_statement(PostgreSQLParser.Drop_operator_family_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#drop_operator_family_statement}.
	 * @param ctx the parse tree
	 */
	void exitDrop_operator_family_statement(PostgreSQLParser.Drop_operator_family_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_operator_class_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_operator_class_statement(PostgreSQLParser.Create_operator_class_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_operator_class_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_operator_class_statement(PostgreSQLParser.Create_operator_class_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_operator_class_option}.
	 * @param ctx the parse tree
	 */
	void enterCreate_operator_class_option(PostgreSQLParser.Create_operator_class_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_operator_class_option}.
	 * @param ctx the parse tree
	 */
	void exitCreate_operator_class_option(PostgreSQLParser.Create_operator_class_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_operator_class_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_operator_class_statement(PostgreSQLParser.Alter_operator_class_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_operator_class_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_operator_class_statement(PostgreSQLParser.Alter_operator_class_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#drop_operator_class_statement}.
	 * @param ctx the parse tree
	 */
	void enterDrop_operator_class_statement(PostgreSQLParser.Drop_operator_class_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#drop_operator_class_statement}.
	 * @param ctx the parse tree
	 */
	void exitDrop_operator_class_statement(PostgreSQLParser.Drop_operator_class_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_conversion_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_conversion_statement(PostgreSQLParser.Create_conversion_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_conversion_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_conversion_statement(PostgreSQLParser.Create_conversion_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_conversion_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_conversion_statement(PostgreSQLParser.Alter_conversion_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_conversion_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_conversion_statement(PostgreSQLParser.Alter_conversion_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_publication_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_publication_statement(PostgreSQLParser.Create_publication_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_publication_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_publication_statement(PostgreSQLParser.Create_publication_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_publication_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_publication_statement(PostgreSQLParser.Alter_publication_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_publication_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_publication_statement(PostgreSQLParser.Alter_publication_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_publication_action}.
	 * @param ctx the parse tree
	 */
	void enterAlter_publication_action(PostgreSQLParser.Alter_publication_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_publication_action}.
	 * @param ctx the parse tree
	 */
	void exitAlter_publication_action(PostgreSQLParser.Alter_publication_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#only_table_multiply}.
	 * @param ctx the parse tree
	 */
	void enterOnly_table_multiply(PostgreSQLParser.Only_table_multiplyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#only_table_multiply}.
	 * @param ctx the parse tree
	 */
	void exitOnly_table_multiply(PostgreSQLParser.Only_table_multiplyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_trigger_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_trigger_statement(PostgreSQLParser.Alter_trigger_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_trigger_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_trigger_statement(PostgreSQLParser.Alter_trigger_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alter_rule_statement}.
	 * @param ctx the parse tree
	 */
	void enterAlter_rule_statement(PostgreSQLParser.Alter_rule_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alter_rule_statement}.
	 * @param ctx the parse tree
	 */
	void exitAlter_rule_statement(PostgreSQLParser.Alter_rule_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#copy_statement}.
	 * @param ctx the parse tree
	 */
	void enterCopy_statement(PostgreSQLParser.Copy_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#copy_statement}.
	 * @param ctx the parse tree
	 */
	void exitCopy_statement(PostgreSQLParser.Copy_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#copy_from_statement}.
	 * @param ctx the parse tree
	 */
	void enterCopy_from_statement(PostgreSQLParser.Copy_from_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#copy_from_statement}.
	 * @param ctx the parse tree
	 */
	void exitCopy_from_statement(PostgreSQLParser.Copy_from_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#copy_to_statement}.
	 * @param ctx the parse tree
	 */
	void enterCopy_to_statement(PostgreSQLParser.Copy_to_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#copy_to_statement}.
	 * @param ctx the parse tree
	 */
	void exitCopy_to_statement(PostgreSQLParser.Copy_to_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#copy_option_list}.
	 * @param ctx the parse tree
	 */
	void enterCopy_option_list(PostgreSQLParser.Copy_option_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#copy_option_list}.
	 * @param ctx the parse tree
	 */
	void exitCopy_option_list(PostgreSQLParser.Copy_option_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#copy_option}.
	 * @param ctx the parse tree
	 */
	void enterCopy_option(PostgreSQLParser.Copy_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#copy_option}.
	 * @param ctx the parse tree
	 */
	void exitCopy_option(PostgreSQLParser.Copy_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_view_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_view_statement(PostgreSQLParser.Create_view_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_view_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_view_statement(PostgreSQLParser.Create_view_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#if_exists}.
	 * @param ctx the parse tree
	 */
	void enterIf_exists(PostgreSQLParser.If_existsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#if_exists}.
	 * @param ctx the parse tree
	 */
	void exitIf_exists(PostgreSQLParser.If_existsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#if_not_exists}.
	 * @param ctx the parse tree
	 */
	void enterIf_not_exists(PostgreSQLParser.If_not_existsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#if_not_exists}.
	 * @param ctx the parse tree
	 */
	void exitIf_not_exists(PostgreSQLParser.If_not_existsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#view_columns}.
	 * @param ctx the parse tree
	 */
	void enterView_columns(PostgreSQLParser.View_columnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#view_columns}.
	 * @param ctx the parse tree
	 */
	void exitView_columns(PostgreSQLParser.View_columnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#with_check_option}.
	 * @param ctx the parse tree
	 */
	void enterWith_check_option(PostgreSQLParser.With_check_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#with_check_option}.
	 * @param ctx the parse tree
	 */
	void exitWith_check_option(PostgreSQLParser.With_check_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_table_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_statement(PostgreSQLParser.Create_table_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_table_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_statement(PostgreSQLParser.Create_table_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_table_as_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table_as_statement(PostgreSQLParser.Create_table_as_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_table_as_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table_as_statement(PostgreSQLParser.Create_table_as_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#create_foreign_table_statement}.
	 * @param ctx the parse tree
	 */
	void enterCreate_foreign_table_statement(PostgreSQLParser.Create_foreign_table_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#create_foreign_table_statement}.
	 * @param ctx the parse tree
	 */
	void exitCreate_foreign_table_statement(PostgreSQLParser.Create_foreign_table_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#define_table}.
	 * @param ctx the parse tree
	 */
	void enterDefine_table(PostgreSQLParser.Define_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#define_table}.
	 * @param ctx the parse tree
	 */
	void exitDefine_table(PostgreSQLParser.Define_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#define_partition}.
	 * @param ctx the parse tree
	 */
	void enterDefine_partition(PostgreSQLParser.Define_partitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#define_partition}.
	 * @param ctx the parse tree
	 */
	void exitDefine_partition(PostgreSQLParser.Define_partitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#for_values_bound}.
	 * @param ctx the parse tree
	 */
	void enterFor_values_bound(PostgreSQLParser.For_values_boundContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#for_values_bound}.
	 * @param ctx the parse tree
	 */
	void exitFor_values_bound(PostgreSQLParser.For_values_boundContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#partition_bound_spec}.
	 * @param ctx the parse tree
	 */
	void enterPartition_bound_spec(PostgreSQLParser.Partition_bound_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#partition_bound_spec}.
	 * @param ctx the parse tree
	 */
	void exitPartition_bound_spec(PostgreSQLParser.Partition_bound_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#partition_bound_part}.
	 * @param ctx the parse tree
	 */
	void enterPartition_bound_part(PostgreSQLParser.Partition_bound_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#partition_bound_part}.
	 * @param ctx the parse tree
	 */
	void exitPartition_bound_part(PostgreSQLParser.Partition_bound_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#define_columns}.
	 * @param ctx the parse tree
	 */
	void enterDefine_columns(PostgreSQLParser.Define_columnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#define_columns}.
	 * @param ctx the parse tree
	 */
	void exitDefine_columns(PostgreSQLParser.Define_columnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#define_type}.
	 * @param ctx the parse tree
	 */
	void enterDefine_type(PostgreSQLParser.Define_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#define_type}.
	 * @param ctx the parse tree
	 */
	void exitDefine_type(PostgreSQLParser.Define_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#partition_by}.
	 * @param ctx the parse tree
	 */
	void enterPartition_by(PostgreSQLParser.Partition_byContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#partition_by}.
	 * @param ctx the parse tree
	 */
	void exitPartition_by(PostgreSQLParser.Partition_byContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#partition_method}.
	 * @param ctx the parse tree
	 */
	void enterPartition_method(PostgreSQLParser.Partition_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#partition_method}.
	 * @param ctx the parse tree
	 */
	void exitPartition_method(PostgreSQLParser.Partition_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#partition_column}.
	 * @param ctx the parse tree
	 */
	void enterPartition_column(PostgreSQLParser.Partition_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#partition_column}.
	 * @param ctx the parse tree
	 */
	void exitPartition_column(PostgreSQLParser.Partition_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#define_server}.
	 * @param ctx the parse tree
	 */
	void enterDefine_server(PostgreSQLParser.Define_serverContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#define_server}.
	 * @param ctx the parse tree
	 */
	void exitDefine_server(PostgreSQLParser.Define_serverContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#define_foreign_options}.
	 * @param ctx the parse tree
	 */
	void enterDefine_foreign_options(PostgreSQLParser.Define_foreign_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#define_foreign_options}.
	 * @param ctx the parse tree
	 */
	void exitDefine_foreign_options(PostgreSQLParser.Define_foreign_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#foreign_option}.
	 * @param ctx the parse tree
	 */
	void enterForeign_option(PostgreSQLParser.Foreign_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#foreign_option}.
	 * @param ctx the parse tree
	 */
	void exitForeign_option(PostgreSQLParser.Foreign_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#foreign_option_name}.
	 * @param ctx the parse tree
	 */
	void enterForeign_option_name(PostgreSQLParser.Foreign_option_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#foreign_option_name}.
	 * @param ctx the parse tree
	 */
	void exitForeign_option_name(PostgreSQLParser.Foreign_option_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#list_of_type_column_def}.
	 * @param ctx the parse tree
	 */
	void enterList_of_type_column_def(PostgreSQLParser.List_of_type_column_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#list_of_type_column_def}.
	 * @param ctx the parse tree
	 */
	void exitList_of_type_column_def(PostgreSQLParser.List_of_type_column_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#table_column_def}.
	 * @param ctx the parse tree
	 */
	void enterTable_column_def(PostgreSQLParser.Table_column_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#table_column_def}.
	 * @param ctx the parse tree
	 */
	void exitTable_column_def(PostgreSQLParser.Table_column_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#table_of_type_column_def}.
	 * @param ctx the parse tree
	 */
	void enterTable_of_type_column_def(PostgreSQLParser.Table_of_type_column_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#table_of_type_column_def}.
	 * @param ctx the parse tree
	 */
	void exitTable_of_type_column_def(PostgreSQLParser.Table_of_type_column_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#table_column_definition}.
	 * @param ctx the parse tree
	 */
	void enterTable_column_definition(PostgreSQLParser.Table_column_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#table_column_definition}.
	 * @param ctx the parse tree
	 */
	void exitTable_column_definition(PostgreSQLParser.Table_column_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#like_option}.
	 * @param ctx the parse tree
	 */
	void enterLike_option(PostgreSQLParser.Like_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#like_option}.
	 * @param ctx the parse tree
	 */
	void exitLike_option(PostgreSQLParser.Like_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#constraint_common}.
	 * @param ctx the parse tree
	 */
	void enterConstraint_common(PostgreSQLParser.Constraint_commonContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#constraint_common}.
	 * @param ctx the parse tree
	 */
	void exitConstraint_common(PostgreSQLParser.Constraint_commonContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#constr_body}.
	 * @param ctx the parse tree
	 */
	void enterConstr_body(PostgreSQLParser.Constr_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#constr_body}.
	 * @param ctx the parse tree
	 */
	void exitConstr_body(PostgreSQLParser.Constr_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#all_op}.
	 * @param ctx the parse tree
	 */
	void enterAll_op(PostgreSQLParser.All_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#all_op}.
	 * @param ctx the parse tree
	 */
	void exitAll_op(PostgreSQLParser.All_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#all_simple_op}.
	 * @param ctx the parse tree
	 */
	void enterAll_simple_op(PostgreSQLParser.All_simple_opContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#all_simple_op}.
	 * @param ctx the parse tree
	 */
	void exitAll_simple_op(PostgreSQLParser.All_simple_opContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#op_chars}.
	 * @param ctx the parse tree
	 */
	void enterOp_chars(PostgreSQLParser.Op_charsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#op_chars}.
	 * @param ctx the parse tree
	 */
	void exitOp_chars(PostgreSQLParser.Op_charsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#index_parameters}.
	 * @param ctx the parse tree
	 */
	void enterIndex_parameters(PostgreSQLParser.Index_parametersContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#index_parameters}.
	 * @param ctx the parse tree
	 */
	void exitIndex_parameters(PostgreSQLParser.Index_parametersContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#names_in_parens}.
	 * @param ctx the parse tree
	 */
	void enterNames_in_parens(PostgreSQLParser.Names_in_parensContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#names_in_parens}.
	 * @param ctx the parse tree
	 */
	void exitNames_in_parens(PostgreSQLParser.Names_in_parensContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#names_references}.
	 * @param ctx the parse tree
	 */
	void enterNames_references(PostgreSQLParser.Names_referencesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#names_references}.
	 * @param ctx the parse tree
	 */
	void exitNames_references(PostgreSQLParser.Names_referencesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#storage_parameter}.
	 * @param ctx the parse tree
	 */
	void enterStorage_parameter(PostgreSQLParser.Storage_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#storage_parameter}.
	 * @param ctx the parse tree
	 */
	void exitStorage_parameter(PostgreSQLParser.Storage_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#storage_parameter_option}.
	 * @param ctx the parse tree
	 */
	void enterStorage_parameter_option(PostgreSQLParser.Storage_parameter_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#storage_parameter_option}.
	 * @param ctx the parse tree
	 */
	void exitStorage_parameter_option(PostgreSQLParser.Storage_parameter_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#storage_parameter_name}.
	 * @param ctx the parse tree
	 */
	void enterStorage_parameter_name(PostgreSQLParser.Storage_parameter_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#storage_parameter_name}.
	 * @param ctx the parse tree
	 */
	void exitStorage_parameter_name(PostgreSQLParser.Storage_parameter_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#with_storage_parameter}.
	 * @param ctx the parse tree
	 */
	void enterWith_storage_parameter(PostgreSQLParser.With_storage_parameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#with_storage_parameter}.
	 * @param ctx the parse tree
	 */
	void exitWith_storage_parameter(PostgreSQLParser.With_storage_parameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#storage_parameter_oid}.
	 * @param ctx the parse tree
	 */
	void enterStorage_parameter_oid(PostgreSQLParser.Storage_parameter_oidContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#storage_parameter_oid}.
	 * @param ctx the parse tree
	 */
	void exitStorage_parameter_oid(PostgreSQLParser.Storage_parameter_oidContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#on_commit}.
	 * @param ctx the parse tree
	 */
	void enterOn_commit(PostgreSQLParser.On_commitContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#on_commit}.
	 * @param ctx the parse tree
	 */
	void exitOn_commit(PostgreSQLParser.On_commitContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#table_space}.
	 * @param ctx the parse tree
	 */
	void enterTable_space(PostgreSQLParser.Table_spaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#table_space}.
	 * @param ctx the parse tree
	 */
	void exitTable_space(PostgreSQLParser.Table_spaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#action}.
	 * @param ctx the parse tree
	 */
	void enterAction(PostgreSQLParser.ActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#action}.
	 * @param ctx the parse tree
	 */
	void exitAction(PostgreSQLParser.ActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#owner_to}.
	 * @param ctx the parse tree
	 */
	void enterOwner_to(PostgreSQLParser.Owner_toContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#owner_to}.
	 * @param ctx the parse tree
	 */
	void exitOwner_to(PostgreSQLParser.Owner_toContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#rename_to}.
	 * @param ctx the parse tree
	 */
	void enterRename_to(PostgreSQLParser.Rename_toContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#rename_to}.
	 * @param ctx the parse tree
	 */
	void exitRename_to(PostgreSQLParser.Rename_toContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#set_schema}.
	 * @param ctx the parse tree
	 */
	void enterSet_schema(PostgreSQLParser.Set_schemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#set_schema}.
	 * @param ctx the parse tree
	 */
	void exitSet_schema(PostgreSQLParser.Set_schemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#table_column_privilege}.
	 * @param ctx the parse tree
	 */
	void enterTable_column_privilege(PostgreSQLParser.Table_column_privilegeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#table_column_privilege}.
	 * @param ctx the parse tree
	 */
	void exitTable_column_privilege(PostgreSQLParser.Table_column_privilegeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#usage_select_update}.
	 * @param ctx the parse tree
	 */
	void enterUsage_select_update(PostgreSQLParser.Usage_select_updateContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#usage_select_update}.
	 * @param ctx the parse tree
	 */
	void exitUsage_select_update(PostgreSQLParser.Usage_select_updateContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#partition_by_columns}.
	 * @param ctx the parse tree
	 */
	void enterPartition_by_columns(PostgreSQLParser.Partition_by_columnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#partition_by_columns}.
	 * @param ctx the parse tree
	 */
	void exitPartition_by_columns(PostgreSQLParser.Partition_by_columnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#cascade_restrict}.
	 * @param ctx the parse tree
	 */
	void enterCascade_restrict(PostgreSQLParser.Cascade_restrictContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#cascade_restrict}.
	 * @param ctx the parse tree
	 */
	void exitCascade_restrict(PostgreSQLParser.Cascade_restrictContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#collate_identifier}.
	 * @param ctx the parse tree
	 */
	void enterCollate_identifier(PostgreSQLParser.Collate_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#collate_identifier}.
	 * @param ctx the parse tree
	 */
	void exitCollate_identifier(PostgreSQLParser.Collate_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#indirection_var}.
	 * @param ctx the parse tree
	 */
	void enterIndirection_var(PostgreSQLParser.Indirection_varContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#indirection_var}.
	 * @param ctx the parse tree
	 */
	void exitIndirection_var(PostgreSQLParser.Indirection_varContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#dollar_number}.
	 * @param ctx the parse tree
	 */
	void enterDollar_number(PostgreSQLParser.Dollar_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#dollar_number}.
	 * @param ctx the parse tree
	 */
	void exitDollar_number(PostgreSQLParser.Dollar_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#indirection_list}.
	 * @param ctx the parse tree
	 */
	void enterIndirection_list(PostgreSQLParser.Indirection_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#indirection_list}.
	 * @param ctx the parse tree
	 */
	void exitIndirection_list(PostgreSQLParser.Indirection_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#indirection}.
	 * @param ctx the parse tree
	 */
	void enterIndirection(PostgreSQLParser.IndirectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#indirection}.
	 * @param ctx the parse tree
	 */
	void exitIndirection(PostgreSQLParser.IndirectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#drop_function_statement}.
	 * @param ctx the parse tree
	 */
	void enterDrop_function_statement(PostgreSQLParser.Drop_function_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#drop_function_statement}.
	 * @param ctx the parse tree
	 */
	void exitDrop_function_statement(PostgreSQLParser.Drop_function_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#drop_trigger_statement}.
	 * @param ctx the parse tree
	 */
	void enterDrop_trigger_statement(PostgreSQLParser.Drop_trigger_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#drop_trigger_statement}.
	 * @param ctx the parse tree
	 */
	void exitDrop_trigger_statement(PostgreSQLParser.Drop_trigger_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#drop_rule_statement}.
	 * @param ctx the parse tree
	 */
	void enterDrop_rule_statement(PostgreSQLParser.Drop_rule_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#drop_rule_statement}.
	 * @param ctx the parse tree
	 */
	void exitDrop_rule_statement(PostgreSQLParser.Drop_rule_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#drop_statements}.
	 * @param ctx the parse tree
	 */
	void enterDrop_statements(PostgreSQLParser.Drop_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#drop_statements}.
	 * @param ctx the parse tree
	 */
	void exitDrop_statements(PostgreSQLParser.Drop_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#if_exist_names_restrict_cascade}.
	 * @param ctx the parse tree
	 */
	void enterIf_exist_names_restrict_cascade(PostgreSQLParser.If_exist_names_restrict_cascadeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#if_exist_names_restrict_cascade}.
	 * @param ctx the parse tree
	 */
	void exitIf_exist_names_restrict_cascade(PostgreSQLParser.If_exist_names_restrict_cascadeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#id_token}.
	 * @param ctx the parse tree
	 */
	void enterId_token(PostgreSQLParser.Id_tokenContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#id_token}.
	 * @param ctx the parse tree
	 */
	void exitId_token(PostgreSQLParser.Id_tokenContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(PostgreSQLParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(PostgreSQLParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#identifier_nontype}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier_nontype(PostgreSQLParser.Identifier_nontypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#identifier_nontype}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier_nontype(PostgreSQLParser.Identifier_nontypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#col_label}.
	 * @param ctx the parse tree
	 */
	void enterCol_label(PostgreSQLParser.Col_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#col_label}.
	 * @param ctx the parse tree
	 */
	void exitCol_label(PostgreSQLParser.Col_labelContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#tokens_nonreserved}.
	 * @param ctx the parse tree
	 */
	void enterTokens_nonreserved(PostgreSQLParser.Tokens_nonreservedContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#tokens_nonreserved}.
	 * @param ctx the parse tree
	 */
	void exitTokens_nonreserved(PostgreSQLParser.Tokens_nonreservedContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#tokens_nonreserved_except_function_type}.
	 * @param ctx the parse tree
	 */
	void enterTokens_nonreserved_except_function_type(PostgreSQLParser.Tokens_nonreserved_except_function_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#tokens_nonreserved_except_function_type}.
	 * @param ctx the parse tree
	 */
	void exitTokens_nonreserved_except_function_type(PostgreSQLParser.Tokens_nonreserved_except_function_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#tokens_reserved_except_function_type}.
	 * @param ctx the parse tree
	 */
	void enterTokens_reserved_except_function_type(PostgreSQLParser.Tokens_reserved_except_function_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#tokens_reserved_except_function_type}.
	 * @param ctx the parse tree
	 */
	void exitTokens_reserved_except_function_type(PostgreSQLParser.Tokens_reserved_except_function_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#tokens_reserved}.
	 * @param ctx the parse tree
	 */
	void enterTokens_reserved(PostgreSQLParser.Tokens_reservedContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#tokens_reserved}.
	 * @param ctx the parse tree
	 */
	void exitTokens_reserved(PostgreSQLParser.Tokens_reservedContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#tokens_nonkeyword}.
	 * @param ctx the parse tree
	 */
	void enterTokens_nonkeyword(PostgreSQLParser.Tokens_nonkeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#tokens_nonkeyword}.
	 * @param ctx the parse tree
	 */
	void exitTokens_nonkeyword(PostgreSQLParser.Tokens_nonkeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#schema_qualified_name_nontype}.
	 * @param ctx the parse tree
	 */
	void enterSchema_qualified_name_nontype(PostgreSQLParser.Schema_qualified_name_nontypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#schema_qualified_name_nontype}.
	 * @param ctx the parse tree
	 */
	void exitSchema_qualified_name_nontype(PostgreSQLParser.Schema_qualified_name_nontypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#type_list}.
	 * @param ctx the parse tree
	 */
	void enterType_list(PostgreSQLParser.Type_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#type_list}.
	 * @param ctx the parse tree
	 */
	void exitType_list(PostgreSQLParser.Type_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterData_type(PostgreSQLParser.Data_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitData_type(PostgreSQLParser.Data_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#array_type}.
	 * @param ctx the parse tree
	 */
	void enterArray_type(PostgreSQLParser.Array_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#array_type}.
	 * @param ctx the parse tree
	 */
	void exitArray_type(PostgreSQLParser.Array_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#predefined_type}.
	 * @param ctx the parse tree
	 */
	void enterPredefined_type(PostgreSQLParser.Predefined_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#predefined_type}.
	 * @param ctx the parse tree
	 */
	void exitPredefined_type(PostgreSQLParser.Predefined_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#interval_field}.
	 * @param ctx the parse tree
	 */
	void enterInterval_field(PostgreSQLParser.Interval_fieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#interval_field}.
	 * @param ctx the parse tree
	 */
	void exitInterval_field(PostgreSQLParser.Interval_fieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#type_length}.
	 * @param ctx the parse tree
	 */
	void enterType_length(PostgreSQLParser.Type_lengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#type_length}.
	 * @param ctx the parse tree
	 */
	void exitType_length(PostgreSQLParser.Type_lengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#precision_param}.
	 * @param ctx the parse tree
	 */
	void enterPrecision_param(PostgreSQLParser.Precision_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#precision_param}.
	 * @param ctx the parse tree
	 */
	void exitPrecision_param(PostgreSQLParser.Precision_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#vex}.
	 * @param ctx the parse tree
	 */
	void enterVex(PostgreSQLParser.VexContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#vex}.
	 * @param ctx the parse tree
	 */
	void exitVex(PostgreSQLParser.VexContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#vex_b}.
	 * @param ctx the parse tree
	 */
	void enterVex_b(PostgreSQLParser.Vex_bContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#vex_b}.
	 * @param ctx the parse tree
	 */
	void exitVex_b(PostgreSQLParser.Vex_bContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#op}.
	 * @param ctx the parse tree
	 */
	void enterOp(PostgreSQLParser.OpContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#op}.
	 * @param ctx the parse tree
	 */
	void exitOp(PostgreSQLParser.OpContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#all_op_ref}.
	 * @param ctx the parse tree
	 */
	void enterAll_op_ref(PostgreSQLParser.All_op_refContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#all_op_ref}.
	 * @param ctx the parse tree
	 */
	void exitAll_op_ref(PostgreSQLParser.All_op_refContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#datetime_overlaps}.
	 * @param ctx the parse tree
	 */
	void enterDatetime_overlaps(PostgreSQLParser.Datetime_overlapsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#datetime_overlaps}.
	 * @param ctx the parse tree
	 */
	void exitDatetime_overlaps(PostgreSQLParser.Datetime_overlapsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#value_expression_primary}.
	 * @param ctx the parse tree
	 */
	void enterValue_expression_primary(PostgreSQLParser.Value_expression_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#value_expression_primary}.
	 * @param ctx the parse tree
	 */
	void exitValue_expression_primary(PostgreSQLParser.Value_expression_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#unsigned_value_specification}.
	 * @param ctx the parse tree
	 */
	void enterUnsigned_value_specification(PostgreSQLParser.Unsigned_value_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#unsigned_value_specification}.
	 * @param ctx the parse tree
	 */
	void exitUnsigned_value_specification(PostgreSQLParser.Unsigned_value_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#unsigned_numeric_literal}.
	 * @param ctx the parse tree
	 */
	void enterUnsigned_numeric_literal(PostgreSQLParser.Unsigned_numeric_literalContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#unsigned_numeric_literal}.
	 * @param ctx the parse tree
	 */
	void exitUnsigned_numeric_literal(PostgreSQLParser.Unsigned_numeric_literalContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#truth_value}.
	 * @param ctx the parse tree
	 */
	void enterTruth_value(PostgreSQLParser.Truth_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#truth_value}.
	 * @param ctx the parse tree
	 */
	void exitTruth_value(PostgreSQLParser.Truth_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#case_expression}.
	 * @param ctx the parse tree
	 */
	void enterCase_expression(PostgreSQLParser.Case_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#case_expression}.
	 * @param ctx the parse tree
	 */
	void exitCase_expression(PostgreSQLParser.Case_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#cast_specification}.
	 * @param ctx the parse tree
	 */
	void enterCast_specification(PostgreSQLParser.Cast_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#cast_specification}.
	 * @param ctx the parse tree
	 */
	void exitCast_specification(PostgreSQLParser.Cast_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(PostgreSQLParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(PostgreSQLParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#vex_or_named_notation}.
	 * @param ctx the parse tree
	 */
	void enterVex_or_named_notation(PostgreSQLParser.Vex_or_named_notationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#vex_or_named_notation}.
	 * @param ctx the parse tree
	 */
	void exitVex_or_named_notation(PostgreSQLParser.Vex_or_named_notationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#pointer}.
	 * @param ctx the parse tree
	 */
	void enterPointer(PostgreSQLParser.PointerContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#pointer}.
	 * @param ctx the parse tree
	 */
	void exitPointer(PostgreSQLParser.PointerContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#function_construct}.
	 * @param ctx the parse tree
	 */
	void enterFunction_construct(PostgreSQLParser.Function_constructContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#function_construct}.
	 * @param ctx the parse tree
	 */
	void exitFunction_construct(PostgreSQLParser.Function_constructContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#extract_function}.
	 * @param ctx the parse tree
	 */
	void enterExtract_function(PostgreSQLParser.Extract_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#extract_function}.
	 * @param ctx the parse tree
	 */
	void exitExtract_function(PostgreSQLParser.Extract_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#system_function}.
	 * @param ctx the parse tree
	 */
	void enterSystem_function(PostgreSQLParser.System_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#system_function}.
	 * @param ctx the parse tree
	 */
	void exitSystem_function(PostgreSQLParser.System_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#date_time_function}.
	 * @param ctx the parse tree
	 */
	void enterDate_time_function(PostgreSQLParser.Date_time_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#date_time_function}.
	 * @param ctx the parse tree
	 */
	void exitDate_time_function(PostgreSQLParser.Date_time_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#string_value_function}.
	 * @param ctx the parse tree
	 */
	void enterString_value_function(PostgreSQLParser.String_value_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#string_value_function}.
	 * @param ctx the parse tree
	 */
	void exitString_value_function(PostgreSQLParser.String_value_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#xml_function}.
	 * @param ctx the parse tree
	 */
	void enterXml_function(PostgreSQLParser.Xml_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#xml_function}.
	 * @param ctx the parse tree
	 */
	void exitXml_function(PostgreSQLParser.Xml_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#xml_table_column}.
	 * @param ctx the parse tree
	 */
	void enterXml_table_column(PostgreSQLParser.Xml_table_columnContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#xml_table_column}.
	 * @param ctx the parse tree
	 */
	void exitXml_table_column(PostgreSQLParser.Xml_table_columnContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#comparison_mod}.
	 * @param ctx the parse tree
	 */
	void enterComparison_mod(PostgreSQLParser.Comparison_modContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#comparison_mod}.
	 * @param ctx the parse tree
	 */
	void exitComparison_mod(PostgreSQLParser.Comparison_modContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#filter_clause}.
	 * @param ctx the parse tree
	 */
	void enterFilter_clause(PostgreSQLParser.Filter_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#filter_clause}.
	 * @param ctx the parse tree
	 */
	void exitFilter_clause(PostgreSQLParser.Filter_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#window_definition}.
	 * @param ctx the parse tree
	 */
	void enterWindow_definition(PostgreSQLParser.Window_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#window_definition}.
	 * @param ctx the parse tree
	 */
	void exitWindow_definition(PostgreSQLParser.Window_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#frame_clause}.
	 * @param ctx the parse tree
	 */
	void enterFrame_clause(PostgreSQLParser.Frame_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#frame_clause}.
	 * @param ctx the parse tree
	 */
	void exitFrame_clause(PostgreSQLParser.Frame_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#frame_bound}.
	 * @param ctx the parse tree
	 */
	void enterFrame_bound(PostgreSQLParser.Frame_boundContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#frame_bound}.
	 * @param ctx the parse tree
	 */
	void exitFrame_bound(PostgreSQLParser.Frame_boundContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#array_expression}.
	 * @param ctx the parse tree
	 */
	void enterArray_expression(PostgreSQLParser.Array_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#array_expression}.
	 * @param ctx the parse tree
	 */
	void exitArray_expression(PostgreSQLParser.Array_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#array_elements}.
	 * @param ctx the parse tree
	 */
	void enterArray_elements(PostgreSQLParser.Array_elementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#array_elements}.
	 * @param ctx the parse tree
	 */
	void exitArray_elements(PostgreSQLParser.Array_elementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#type_coercion}.
	 * @param ctx the parse tree
	 */
	void enterType_coercion(PostgreSQLParser.Type_coercionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#type_coercion}.
	 * @param ctx the parse tree
	 */
	void exitType_coercion(PostgreSQLParser.Type_coercionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#schema_qualified_name}.
	 * @param ctx the parse tree
	 */
	void enterSchema_qualified_name(PostgreSQLParser.Schema_qualified_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#schema_qualified_name}.
	 * @param ctx the parse tree
	 */
	void exitSchema_qualified_name(PostgreSQLParser.Schema_qualified_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#set_qualifier}.
	 * @param ctx the parse tree
	 */
	void enterSet_qualifier(PostgreSQLParser.Set_qualifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#set_qualifier}.
	 * @param ctx the parse tree
	 */
	void exitSet_qualifier(PostgreSQLParser.Set_qualifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#table_subquery}.
	 * @param ctx the parse tree
	 */
	void enterTable_subquery(PostgreSQLParser.Table_subqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#table_subquery}.
	 * @param ctx the parse tree
	 */
	void exitTable_subquery(PostgreSQLParser.Table_subqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void enterSelect_stmt(PostgreSQLParser.Select_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#select_stmt}.
	 * @param ctx the parse tree
	 */
	void exitSelect_stmt(PostgreSQLParser.Select_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#after_ops}.
	 * @param ctx the parse tree
	 */
	void enterAfter_ops(PostgreSQLParser.After_opsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#after_ops}.
	 * @param ctx the parse tree
	 */
	void exitAfter_ops(PostgreSQLParser.After_opsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#select_stmt_no_parens}.
	 * @param ctx the parse tree
	 */
	void enterSelect_stmt_no_parens(PostgreSQLParser.Select_stmt_no_parensContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#select_stmt_no_parens}.
	 * @param ctx the parse tree
	 */
	void exitSelect_stmt_no_parens(PostgreSQLParser.Select_stmt_no_parensContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#with_clause}.
	 * @param ctx the parse tree
	 */
	void enterWith_clause(PostgreSQLParser.With_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#with_clause}.
	 * @param ctx the parse tree
	 */
	void exitWith_clause(PostgreSQLParser.With_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#with_query}.
	 * @param ctx the parse tree
	 */
	void enterWith_query(PostgreSQLParser.With_queryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#with_query}.
	 * @param ctx the parse tree
	 */
	void exitWith_query(PostgreSQLParser.With_queryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#select_ops}.
	 * @param ctx the parse tree
	 */
	void enterSelect_ops(PostgreSQLParser.Select_opsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#select_ops}.
	 * @param ctx the parse tree
	 */
	void exitSelect_ops(PostgreSQLParser.Select_opsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#select_ops_no_parens}.
	 * @param ctx the parse tree
	 */
	void enterSelect_ops_no_parens(PostgreSQLParser.Select_ops_no_parensContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#select_ops_no_parens}.
	 * @param ctx the parse tree
	 */
	void exitSelect_ops_no_parens(PostgreSQLParser.Select_ops_no_parensContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#select_primary}.
	 * @param ctx the parse tree
	 */
	void enterSelect_primary(PostgreSQLParser.Select_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#select_primary}.
	 * @param ctx the parse tree
	 */
	void exitSelect_primary(PostgreSQLParser.Select_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#select_list}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list(PostgreSQLParser.Select_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#select_list}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list(PostgreSQLParser.Select_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#select_sublist}.
	 * @param ctx the parse tree
	 */
	void enterSelect_sublist(PostgreSQLParser.Select_sublistContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#select_sublist}.
	 * @param ctx the parse tree
	 */
	void exitSelect_sublist(PostgreSQLParser.Select_sublistContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#into_table}.
	 * @param ctx the parse tree
	 */
	void enterInto_table(PostgreSQLParser.Into_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#into_table}.
	 * @param ctx the parse tree
	 */
	void exitInto_table(PostgreSQLParser.Into_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#from_item}.
	 * @param ctx the parse tree
	 */
	void enterFrom_item(PostgreSQLParser.From_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#from_item}.
	 * @param ctx the parse tree
	 */
	void exitFrom_item(PostgreSQLParser.From_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#from_primary}.
	 * @param ctx the parse tree
	 */
	void enterFrom_primary(PostgreSQLParser.From_primaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#from_primary}.
	 * @param ctx the parse tree
	 */
	void exitFrom_primary(PostgreSQLParser.From_primaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#alias_clause}.
	 * @param ctx the parse tree
	 */
	void enterAlias_clause(PostgreSQLParser.Alias_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#alias_clause}.
	 * @param ctx the parse tree
	 */
	void exitAlias_clause(PostgreSQLParser.Alias_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#from_function_column_def}.
	 * @param ctx the parse tree
	 */
	void enterFrom_function_column_def(PostgreSQLParser.From_function_column_defContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#from_function_column_def}.
	 * @param ctx the parse tree
	 */
	void exitFrom_function_column_def(PostgreSQLParser.From_function_column_defContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#groupby_clause}.
	 * @param ctx the parse tree
	 */
	void enterGroupby_clause(PostgreSQLParser.Groupby_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#groupby_clause}.
	 * @param ctx the parse tree
	 */
	void exitGroupby_clause(PostgreSQLParser.Groupby_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#grouping_element_list}.
	 * @param ctx the parse tree
	 */
	void enterGrouping_element_list(PostgreSQLParser.Grouping_element_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#grouping_element_list}.
	 * @param ctx the parse tree
	 */
	void exitGrouping_element_list(PostgreSQLParser.Grouping_element_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#grouping_element}.
	 * @param ctx the parse tree
	 */
	void enterGrouping_element(PostgreSQLParser.Grouping_elementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#grouping_element}.
	 * @param ctx the parse tree
	 */
	void exitGrouping_element(PostgreSQLParser.Grouping_elementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#values_stmt}.
	 * @param ctx the parse tree
	 */
	void enterValues_stmt(PostgreSQLParser.Values_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#values_stmt}.
	 * @param ctx the parse tree
	 */
	void exitValues_stmt(PostgreSQLParser.Values_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#values_values}.
	 * @param ctx the parse tree
	 */
	void enterValues_values(PostgreSQLParser.Values_valuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#values_values}.
	 * @param ctx the parse tree
	 */
	void exitValues_values(PostgreSQLParser.Values_valuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#orderby_clause}.
	 * @param ctx the parse tree
	 */
	void enterOrderby_clause(PostgreSQLParser.Orderby_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#orderby_clause}.
	 * @param ctx the parse tree
	 */
	void exitOrderby_clause(PostgreSQLParser.Orderby_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#sort_specifier_list}.
	 * @param ctx the parse tree
	 */
	void enterSort_specifier_list(PostgreSQLParser.Sort_specifier_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#sort_specifier_list}.
	 * @param ctx the parse tree
	 */
	void exitSort_specifier_list(PostgreSQLParser.Sort_specifier_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#sort_specifier}.
	 * @param ctx the parse tree
	 */
	void enterSort_specifier(PostgreSQLParser.Sort_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#sort_specifier}.
	 * @param ctx the parse tree
	 */
	void exitSort_specifier(PostgreSQLParser.Sort_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#order_specification}.
	 * @param ctx the parse tree
	 */
	void enterOrder_specification(PostgreSQLParser.Order_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#order_specification}.
	 * @param ctx the parse tree
	 */
	void exitOrder_specification(PostgreSQLParser.Order_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#null_ordering}.
	 * @param ctx the parse tree
	 */
	void enterNull_ordering(PostgreSQLParser.Null_orderingContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#null_ordering}.
	 * @param ctx the parse tree
	 */
	void exitNull_ordering(PostgreSQLParser.Null_orderingContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#insert_stmt_for_psql}.
	 * @param ctx the parse tree
	 */
	void enterInsert_stmt_for_psql(PostgreSQLParser.Insert_stmt_for_psqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#insert_stmt_for_psql}.
	 * @param ctx the parse tree
	 */
	void exitInsert_stmt_for_psql(PostgreSQLParser.Insert_stmt_for_psqlContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#insert_columns}.
	 * @param ctx the parse tree
	 */
	void enterInsert_columns(PostgreSQLParser.Insert_columnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#insert_columns}.
	 * @param ctx the parse tree
	 */
	void exitInsert_columns(PostgreSQLParser.Insert_columnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#indirection_identifier}.
	 * @param ctx the parse tree
	 */
	void enterIndirection_identifier(PostgreSQLParser.Indirection_identifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#indirection_identifier}.
	 * @param ctx the parse tree
	 */
	void exitIndirection_identifier(PostgreSQLParser.Indirection_identifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#conflict_object}.
	 * @param ctx the parse tree
	 */
	void enterConflict_object(PostgreSQLParser.Conflict_objectContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#conflict_object}.
	 * @param ctx the parse tree
	 */
	void exitConflict_object(PostgreSQLParser.Conflict_objectContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#conflict_action}.
	 * @param ctx the parse tree
	 */
	void enterConflict_action(PostgreSQLParser.Conflict_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#conflict_action}.
	 * @param ctx the parse tree
	 */
	void exitConflict_action(PostgreSQLParser.Conflict_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#delete_stmt_for_psql}.
	 * @param ctx the parse tree
	 */
	void enterDelete_stmt_for_psql(PostgreSQLParser.Delete_stmt_for_psqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#delete_stmt_for_psql}.
	 * @param ctx the parse tree
	 */
	void exitDelete_stmt_for_psql(PostgreSQLParser.Delete_stmt_for_psqlContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#update_stmt_for_psql}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_stmt_for_psql(PostgreSQLParser.Update_stmt_for_psqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#update_stmt_for_psql}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_stmt_for_psql(PostgreSQLParser.Update_stmt_for_psqlContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#update_set}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_set(PostgreSQLParser.Update_setContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#update_set}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_set(PostgreSQLParser.Update_setContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#notify_stmt}.
	 * @param ctx the parse tree
	 */
	void enterNotify_stmt(PostgreSQLParser.Notify_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#notify_stmt}.
	 * @param ctx the parse tree
	 */
	void exitNotify_stmt(PostgreSQLParser.Notify_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#truncate_stmt}.
	 * @param ctx the parse tree
	 */
	void enterTruncate_stmt(PostgreSQLParser.Truncate_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#truncate_stmt}.
	 * @param ctx the parse tree
	 */
	void exitTruncate_stmt(PostgreSQLParser.Truncate_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#identifier_list}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier_list(PostgreSQLParser.Identifier_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#identifier_list}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier_list(PostgreSQLParser.Identifier_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#anonymous_block}.
	 * @param ctx the parse tree
	 */
	void enterAnonymous_block(PostgreSQLParser.Anonymous_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#anonymous_block}.
	 * @param ctx the parse tree
	 */
	void exitAnonymous_block(PostgreSQLParser.Anonymous_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#comp_options}.
	 * @param ctx the parse tree
	 */
	void enterComp_options(PostgreSQLParser.Comp_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#comp_options}.
	 * @param ctx the parse tree
	 */
	void exitComp_options(PostgreSQLParser.Comp_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#function_block}.
	 * @param ctx the parse tree
	 */
	void enterFunction_block(PostgreSQLParser.Function_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#function_block}.
	 * @param ctx the parse tree
	 */
	void exitFunction_block(PostgreSQLParser.Function_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#start_label}.
	 * @param ctx the parse tree
	 */
	void enterStart_label(PostgreSQLParser.Start_labelContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#start_label}.
	 * @param ctx the parse tree
	 */
	void exitStart_label(PostgreSQLParser.Start_labelContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#declarations}.
	 * @param ctx the parse tree
	 */
	void enterDeclarations(PostgreSQLParser.DeclarationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#declarations}.
	 * @param ctx the parse tree
	 */
	void exitDeclarations(PostgreSQLParser.DeclarationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(PostgreSQLParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(PostgreSQLParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#type_declaration}.
	 * @param ctx the parse tree
	 */
	void enterType_declaration(PostgreSQLParser.Type_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#type_declaration}.
	 * @param ctx the parse tree
	 */
	void exitType_declaration(PostgreSQLParser.Type_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#arguments_list}.
	 * @param ctx the parse tree
	 */
	void enterArguments_list(PostgreSQLParser.Arguments_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#arguments_list}.
	 * @param ctx the parse tree
	 */
	void exitArguments_list(PostgreSQLParser.Arguments_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#data_type_dec}.
	 * @param ctx the parse tree
	 */
	void enterData_type_dec(PostgreSQLParser.Data_type_decContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#data_type_dec}.
	 * @param ctx the parse tree
	 */
	void exitData_type_dec(PostgreSQLParser.Data_type_decContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#exception_statement}.
	 * @param ctx the parse tree
	 */
	void enterException_statement(PostgreSQLParser.Exception_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#exception_statement}.
	 * @param ctx the parse tree
	 */
	void exitException_statement(PostgreSQLParser.Exception_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#function_statements}.
	 * @param ctx the parse tree
	 */
	void enterFunction_statements(PostgreSQLParser.Function_statementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#function_statements}.
	 * @param ctx the parse tree
	 */
	void exitFunction_statements(PostgreSQLParser.Function_statementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#function_statement}.
	 * @param ctx the parse tree
	 */
	void enterFunction_statement(PostgreSQLParser.Function_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#function_statement}.
	 * @param ctx the parse tree
	 */
	void exitFunction_statement(PostgreSQLParser.Function_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#base_statement}.
	 * @param ctx the parse tree
	 */
	void enterBase_statement(PostgreSQLParser.Base_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#base_statement}.
	 * @param ctx the parse tree
	 */
	void exitBase_statement(PostgreSQLParser.Base_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#var}.
	 * @param ctx the parse tree
	 */
	void enterVar(PostgreSQLParser.VarContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#var}.
	 * @param ctx the parse tree
	 */
	void exitVar(PostgreSQLParser.VarContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#diagnostic_option}.
	 * @param ctx the parse tree
	 */
	void enterDiagnostic_option(PostgreSQLParser.Diagnostic_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#diagnostic_option}.
	 * @param ctx the parse tree
	 */
	void exitDiagnostic_option(PostgreSQLParser.Diagnostic_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#perform_stmt}.
	 * @param ctx the parse tree
	 */
	void enterPerform_stmt(PostgreSQLParser.Perform_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#perform_stmt}.
	 * @param ctx the parse tree
	 */
	void exitPerform_stmt(PostgreSQLParser.Perform_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void enterAssign_stmt(PostgreSQLParser.Assign_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#assign_stmt}.
	 * @param ctx the parse tree
	 */
	void exitAssign_stmt(PostgreSQLParser.Assign_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#execute_stmt}.
	 * @param ctx the parse tree
	 */
	void enterExecute_stmt(PostgreSQLParser.Execute_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#execute_stmt}.
	 * @param ctx the parse tree
	 */
	void exitExecute_stmt(PostgreSQLParser.Execute_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#control_statement}.
	 * @param ctx the parse tree
	 */
	void enterControl_statement(PostgreSQLParser.Control_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#control_statement}.
	 * @param ctx the parse tree
	 */
	void exitControl_statement(PostgreSQLParser.Control_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#cursor_statement}.
	 * @param ctx the parse tree
	 */
	void enterCursor_statement(PostgreSQLParser.Cursor_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#cursor_statement}.
	 * @param ctx the parse tree
	 */
	void exitCursor_statement(PostgreSQLParser.Cursor_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#option}.
	 * @param ctx the parse tree
	 */
	void enterOption(PostgreSQLParser.OptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#option}.
	 * @param ctx the parse tree
	 */
	void exitOption(PostgreSQLParser.OptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#transaction_statement}.
	 * @param ctx the parse tree
	 */
	void enterTransaction_statement(PostgreSQLParser.Transaction_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#transaction_statement}.
	 * @param ctx the parse tree
	 */
	void exitTransaction_statement(PostgreSQLParser.Transaction_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#message_statement}.
	 * @param ctx the parse tree
	 */
	void enterMessage_statement(PostgreSQLParser.Message_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#message_statement}.
	 * @param ctx the parse tree
	 */
	void exitMessage_statement(PostgreSQLParser.Message_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#log_level}.
	 * @param ctx the parse tree
	 */
	void enterLog_level(PostgreSQLParser.Log_levelContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#log_level}.
	 * @param ctx the parse tree
	 */
	void exitLog_level(PostgreSQLParser.Log_levelContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#raise_using}.
	 * @param ctx the parse tree
	 */
	void enterRaise_using(PostgreSQLParser.Raise_usingContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#raise_using}.
	 * @param ctx the parse tree
	 */
	void exitRaise_using(PostgreSQLParser.Raise_usingContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#raise_param}.
	 * @param ctx the parse tree
	 */
	void enterRaise_param(PostgreSQLParser.Raise_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#raise_param}.
	 * @param ctx the parse tree
	 */
	void exitRaise_param(PostgreSQLParser.Raise_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void enterReturn_stmt(PostgreSQLParser.Return_stmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#return_stmt}.
	 * @param ctx the parse tree
	 */
	void exitReturn_stmt(PostgreSQLParser.Return_stmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#loop_statement}.
	 * @param ctx the parse tree
	 */
	void enterLoop_statement(PostgreSQLParser.Loop_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#loop_statement}.
	 * @param ctx the parse tree
	 */
	void exitLoop_statement(PostgreSQLParser.Loop_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#loop_start}.
	 * @param ctx the parse tree
	 */
	void enterLoop_start(PostgreSQLParser.Loop_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#loop_start}.
	 * @param ctx the parse tree
	 */
	void exitLoop_start(PostgreSQLParser.Loop_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#using_vex}.
	 * @param ctx the parse tree
	 */
	void enterUsing_vex(PostgreSQLParser.Using_vexContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#using_vex}.
	 * @param ctx the parse tree
	 */
	void exitUsing_vex(PostgreSQLParser.Using_vexContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(PostgreSQLParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(PostgreSQLParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#case_statement}.
	 * @param ctx the parse tree
	 */
	void enterCase_statement(PostgreSQLParser.Case_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#case_statement}.
	 * @param ctx the parse tree
	 */
	void exitCase_statement(PostgreSQLParser.Case_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link PostgreSQLParser#plpgsql_query}.
	 * @param ctx the parse tree
	 */
	void enterPlpgsql_query(PostgreSQLParser.Plpgsql_queryContext ctx);
	/**
	 * Exit a parse tree produced by {@link PostgreSQLParser#plpgsql_query}.
	 * @param ctx the parse tree
	 */
	void exitPlpgsql_query(PostgreSQLParser.Plpgsql_queryContext ctx);
}