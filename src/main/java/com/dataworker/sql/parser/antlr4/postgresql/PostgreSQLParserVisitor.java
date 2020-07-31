// Generated from com/dataworker/sql/parser/antlr4/postgresql/PostgreSQLParser.g4 by ANTLR 4.7.1
package com.dataworker.sql.parser.antlr4.postgresql;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link PostgreSQLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface PostgreSQLParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#sql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql(PostgreSQLParser.SqlContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#qname_parser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQname_parser(PostgreSQLParser.Qname_parserContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#function_args_parser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_args_parser(PostgreSQLParser.Function_args_parserContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#vex_eof}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVex_eof(PostgreSQLParser.Vex_eofContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#plpgsql_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlpgsql_function(PostgreSQLParser.Plpgsql_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#plpgsql_function_test_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlpgsql_function_test_list(PostgreSQLParser.Plpgsql_function_test_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatement(PostgreSQLParser.StatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#data_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_statement(PostgreSQLParser.Data_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#script_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript_statement(PostgreSQLParser.Script_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#script_transaction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript_transaction(PostgreSQLParser.Script_transactionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#transaction_mode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransaction_mode(PostgreSQLParser.Transaction_modeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#lock_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLock_table(PostgreSQLParser.Lock_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#lock_mode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLock_mode(PostgreSQLParser.Lock_modeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#script_additional}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript_additional(PostgreSQLParser.Script_additionalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#additional_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdditional_statement(PostgreSQLParser.Additional_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#explain_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplain_statement(PostgreSQLParser.Explain_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#explain_query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplain_query(PostgreSQLParser.Explain_queryContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#execute_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute_statement(PostgreSQLParser.Execute_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#declare_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_statement(PostgreSQLParser.Declare_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#show_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow_statement(PostgreSQLParser.Show_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#explain_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplain_option(PostgreSQLParser.Explain_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#user_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUser_name(PostgreSQLParser.User_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#table_cols_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_cols_list(PostgreSQLParser.Table_cols_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#table_cols}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_cols(PostgreSQLParser.Table_colsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#vacuum_mode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVacuum_mode(PostgreSQLParser.Vacuum_modeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#vacuum_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVacuum_option(PostgreSQLParser.Vacuum_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#analyze_mode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnalyze_mode(PostgreSQLParser.Analyze_modeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#boolean_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean_value(PostgreSQLParser.Boolean_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#fetch_move_direction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFetch_move_direction(PostgreSQLParser.Fetch_move_directionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#schema_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchema_statement(PostgreSQLParser.Schema_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#schema_create}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchema_create(PostgreSQLParser.Schema_createContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#schema_alter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchema_alter(PostgreSQLParser.Schema_alterContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#schema_drop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchema_drop(PostgreSQLParser.Schema_dropContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#schema_import}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchema_import(PostgreSQLParser.Schema_importContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_function_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_function_statement(PostgreSQLParser.Alter_function_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_aggregate_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_aggregate_statement(PostgreSQLParser.Alter_aggregate_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_extension_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_extension_statement(PostgreSQLParser.Alter_extension_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_extension_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_extension_action(PostgreSQLParser.Alter_extension_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#extension_member_object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtension_member_object(PostgreSQLParser.Extension_member_objectContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_schema_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_schema_statement(PostgreSQLParser.Alter_schema_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_language_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_language_statement(PostgreSQLParser.Alter_language_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_table_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table_statement(PostgreSQLParser.Alter_table_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#table_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_action(PostgreSQLParser.Table_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#column_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_action(PostgreSQLParser.Column_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#identity_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentity_body(PostgreSQLParser.Identity_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_identity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_identity(PostgreSQLParser.Alter_identityContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#storage_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorage_option(PostgreSQLParser.Storage_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#validate_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValidate_constraint(PostgreSQLParser.Validate_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#drop_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_constraint(PostgreSQLParser.Drop_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#table_deferrable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_deferrable(PostgreSQLParser.Table_deferrableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#table_initialy_immed}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_initialy_immed(PostgreSQLParser.Table_initialy_immedContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#function_actions_common}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_actions_common(PostgreSQLParser.Function_actions_commonContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#function_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_def(PostgreSQLParser.Function_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_index_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_index_statement(PostgreSQLParser.Alter_index_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#index_def_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_def_action(PostgreSQLParser.Index_def_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_default_privileges}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_default_privileges(PostgreSQLParser.Alter_default_privilegesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#abbreviated_grant_or_revoke}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbbreviated_grant_or_revoke(PostgreSQLParser.Abbreviated_grant_or_revokeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#grant_option_for}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrant_option_for(PostgreSQLParser.Grant_option_forContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_sequence_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_sequence_statement(PostgreSQLParser.Alter_sequence_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_view_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_view_statement(PostgreSQLParser.Alter_view_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_event_trigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_event_trigger(PostgreSQLParser.Alter_event_triggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_event_trigger_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_event_trigger_action(PostgreSQLParser.Alter_event_trigger_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_type_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_type_statement(PostgreSQLParser.Alter_type_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_domain_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_domain_statement(PostgreSQLParser.Alter_domain_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_server_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_server_statement(PostgreSQLParser.Alter_server_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_server_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_server_action(PostgreSQLParser.Alter_server_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_fts_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_fts_statement(PostgreSQLParser.Alter_fts_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_fts_configuration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_fts_configuration(PostgreSQLParser.Alter_fts_configurationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#type_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_action(PostgreSQLParser.Type_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#set_def_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_def_column(PostgreSQLParser.Set_def_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#drop_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_def(PostgreSQLParser.Drop_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_index_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_index_statement(PostgreSQLParser.Create_index_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#index_rest}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_rest(PostgreSQLParser.Index_restContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#index_sort}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_sort(PostgreSQLParser.Index_sortContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#including_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncluding_index(PostgreSQLParser.Including_indexContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#index_where}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_where(PostgreSQLParser.Index_whereContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_extension_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_extension_statement(PostgreSQLParser.Create_extension_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_language_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_language_statement(PostgreSQLParser.Create_language_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_event_trigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_event_trigger(PostgreSQLParser.Create_event_triggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_type_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_type_statement(PostgreSQLParser.Create_type_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_domain_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_domain_statement(PostgreSQLParser.Create_domain_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_server_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_server_statement(PostgreSQLParser.Create_server_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_fts_dictionary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_fts_dictionary(PostgreSQLParser.Create_fts_dictionaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#option_with_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOption_with_value(PostgreSQLParser.Option_with_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_fts_configuration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_fts_configuration(PostgreSQLParser.Create_fts_configurationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_fts_template}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_fts_template(PostgreSQLParser.Create_fts_templateContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_fts_parser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_fts_parser(PostgreSQLParser.Create_fts_parserContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_collation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_collation(PostgreSQLParser.Create_collationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_collation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_collation(PostgreSQLParser.Alter_collationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#collation_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollation_option(PostgreSQLParser.Collation_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_user_mapping}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_user_mapping(PostgreSQLParser.Create_user_mappingContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_user_mapping}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_user_mapping(PostgreSQLParser.Alter_user_mappingContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_user_or_role}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_user_or_role(PostgreSQLParser.Alter_user_or_roleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_user_or_role_set_reset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_user_or_role_set_reset(PostgreSQLParser.Alter_user_or_role_set_resetContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#user_or_role_set_reset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUser_or_role_set_reset(PostgreSQLParser.User_or_role_set_resetContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_group(PostgreSQLParser.Alter_groupContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_group_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_group_action(PostgreSQLParser.Alter_group_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_tablespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_tablespace(PostgreSQLParser.Alter_tablespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_owner}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_owner(PostgreSQLParser.Alter_ownerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_tablespace_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_tablespace_action(PostgreSQLParser.Alter_tablespace_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_statistics}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_statistics(PostgreSQLParser.Alter_statisticsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_foreign_data_wrapper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_foreign_data_wrapper(PostgreSQLParser.Alter_foreign_data_wrapperContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_foreign_data_wrapper_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_foreign_data_wrapper_action(PostgreSQLParser.Alter_foreign_data_wrapper_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_operator_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_operator_statement(PostgreSQLParser.Alter_operator_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_operator_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_operator_action(PostgreSQLParser.Alter_operator_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#operator_set_restrict_join}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator_set_restrict_join(PostgreSQLParser.Operator_set_restrict_joinContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#drop_user_mapping}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_user_mapping(PostgreSQLParser.Drop_user_mappingContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#drop_owned}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_owned(PostgreSQLParser.Drop_ownedContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#drop_operator_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_operator_statement(PostgreSQLParser.Drop_operator_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#target_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTarget_operator(PostgreSQLParser.Target_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#domain_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDomain_constraint(PostgreSQLParser.Domain_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_transform_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_transform_statement(PostgreSQLParser.Create_transform_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_access_method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_access_method(PostgreSQLParser.Create_access_methodContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_user_or_role}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_user_or_role(PostgreSQLParser.Create_user_or_roleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#user_or_role_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUser_or_role_option(PostgreSQLParser.User_or_role_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#user_or_role_option_for_alter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUser_or_role_option_for_alter(PostgreSQLParser.User_or_role_option_for_alterContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#user_or_role_or_group_common_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUser_or_role_or_group_common_option(PostgreSQLParser.User_or_role_or_group_common_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#user_or_role_common_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUser_or_role_common_option(PostgreSQLParser.User_or_role_common_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#user_or_role_or_group_option_for_create}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUser_or_role_or_group_option_for_create(PostgreSQLParser.User_or_role_or_group_option_for_createContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_group(PostgreSQLParser.Create_groupContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#group_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_option(PostgreSQLParser.Group_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_tablespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_tablespace(PostgreSQLParser.Create_tablespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_statistics}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_statistics(PostgreSQLParser.Create_statisticsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_foreign_data_wrapper}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_foreign_data_wrapper(PostgreSQLParser.Create_foreign_data_wrapperContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#option_without_equal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOption_without_equal(PostgreSQLParser.Option_without_equalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_operator_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_operator_statement(PostgreSQLParser.Create_operator_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#operator_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator_name(PostgreSQLParser.Operator_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#operator_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator_option(PostgreSQLParser.Operator_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_aggregate_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_aggregate_statement(PostgreSQLParser.Create_aggregate_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#aggregate_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregate_param(PostgreSQLParser.Aggregate_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#set_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_statement(PostgreSQLParser.Set_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#set_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_action(PostgreSQLParser.Set_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#session_local_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSession_local_option(PostgreSQLParser.Session_local_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#set_statement_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_statement_value(PostgreSQLParser.Set_statement_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_rewrite_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_rewrite_statement(PostgreSQLParser.Create_rewrite_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#rewrite_command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRewrite_command(PostgreSQLParser.Rewrite_commandContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_trigger_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_trigger_statement(PostgreSQLParser.Create_trigger_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#trigger_referencing}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigger_referencing(PostgreSQLParser.Trigger_referencingContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#when_trigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhen_trigger(PostgreSQLParser.When_triggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#rule_common}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRule_common(PostgreSQLParser.Rule_commonContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#rule_member_object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRule_member_object(PostgreSQLParser.Rule_member_objectContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#columns_permissions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumns_permissions(PostgreSQLParser.Columns_permissionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#table_column_privileges}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_column_privileges(PostgreSQLParser.Table_column_privilegesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#permissions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPermissions(PostgreSQLParser.PermissionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#permission}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPermission(PostgreSQLParser.PermissionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#other_rules}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOther_rules(PostgreSQLParser.Other_rulesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#grant_to_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrant_to_rule(PostgreSQLParser.Grant_to_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#revoke_from_cascade_restrict}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevoke_from_cascade_restrict(PostgreSQLParser.Revoke_from_cascade_restrictContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#roles_names}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoles_names(PostgreSQLParser.Roles_namesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#role_name_with_group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRole_name_with_group(PostgreSQLParser.Role_name_with_groupContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#comment_on_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment_on_statement(PostgreSQLParser.Comment_on_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#security_label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecurity_label(PostgreSQLParser.Security_labelContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#comment_member_object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComment_member_object(PostgreSQLParser.Comment_member_objectContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#label_member_object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabel_member_object(PostgreSQLParser.Label_member_objectContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_function_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_function_statement(PostgreSQLParser.Create_function_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_funct_params}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_funct_params(PostgreSQLParser.Create_funct_paramsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#transform_for_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransform_for_type(PostgreSQLParser.Transform_for_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#function_ret_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_ret_table(PostgreSQLParser.Function_ret_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#function_column_name_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_column_name_type(PostgreSQLParser.Function_column_name_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#function_parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_parameters(PostgreSQLParser.Function_parametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#function_args}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_args(PostgreSQLParser.Function_argsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#agg_order}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAgg_order(PostgreSQLParser.Agg_orderContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#character_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacter_string(PostgreSQLParser.Character_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#function_arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_arguments(PostgreSQLParser.Function_argumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#argmode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgmode(PostgreSQLParser.ArgmodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_sequence_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_sequence_statement(PostgreSQLParser.Create_sequence_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#sequence_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence_body(PostgreSQLParser.Sequence_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#signed_number_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigned_number_literal(PostgreSQLParser.Signed_number_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#signed_numerical_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigned_numerical_literal(PostgreSQLParser.Signed_numerical_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign(PostgreSQLParser.SignContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_schema_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_schema_statement(PostgreSQLParser.Create_schema_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_policy_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_policy_statement(PostgreSQLParser.Create_policy_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_policy_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_policy_statement(PostgreSQLParser.Alter_policy_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#drop_policy_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_policy_statement(PostgreSQLParser.Drop_policy_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_subscription_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_subscription_statement(PostgreSQLParser.Create_subscription_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_subscription_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_subscription_statement(PostgreSQLParser.Alter_subscription_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_subscription_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_subscription_action(PostgreSQLParser.Alter_subscription_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_cast_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_cast_statement(PostgreSQLParser.Create_cast_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#drop_cast_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_cast_statement(PostgreSQLParser.Drop_cast_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_operator_family_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_operator_family_statement(PostgreSQLParser.Create_operator_family_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_operator_family_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_operator_family_statement(PostgreSQLParser.Alter_operator_family_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#operator_family_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperator_family_action(PostgreSQLParser.Operator_family_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#add_operator_to_family}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdd_operator_to_family(PostgreSQLParser.Add_operator_to_familyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#drop_operator_from_family}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_operator_from_family(PostgreSQLParser.Drop_operator_from_familyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#drop_operator_family_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_operator_family_statement(PostgreSQLParser.Drop_operator_family_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_operator_class_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_operator_class_statement(PostgreSQLParser.Create_operator_class_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_operator_class_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_operator_class_option(PostgreSQLParser.Create_operator_class_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_operator_class_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_operator_class_statement(PostgreSQLParser.Alter_operator_class_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#drop_operator_class_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_operator_class_statement(PostgreSQLParser.Drop_operator_class_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_conversion_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_conversion_statement(PostgreSQLParser.Create_conversion_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_conversion_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_conversion_statement(PostgreSQLParser.Alter_conversion_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_publication_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_publication_statement(PostgreSQLParser.Create_publication_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_publication_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_publication_statement(PostgreSQLParser.Alter_publication_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_publication_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_publication_action(PostgreSQLParser.Alter_publication_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#only_table_multiply}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnly_table_multiply(PostgreSQLParser.Only_table_multiplyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_trigger_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_trigger_statement(PostgreSQLParser.Alter_trigger_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alter_rule_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_rule_statement(PostgreSQLParser.Alter_rule_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#copy_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_statement(PostgreSQLParser.Copy_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#copy_from_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_from_statement(PostgreSQLParser.Copy_from_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#copy_to_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_to_statement(PostgreSQLParser.Copy_to_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#copy_option_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_option_list(PostgreSQLParser.Copy_option_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#copy_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopy_option(PostgreSQLParser.Copy_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_view_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_view_statement(PostgreSQLParser.Create_view_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#if_exists}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_exists(PostgreSQLParser.If_existsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#if_not_exists}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_not_exists(PostgreSQLParser.If_not_existsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#view_columns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitView_columns(PostgreSQLParser.View_columnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#with_check_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_check_option(PostgreSQLParser.With_check_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_table_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_statement(PostgreSQLParser.Create_table_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_table_as_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table_as_statement(PostgreSQLParser.Create_table_as_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#create_foreign_table_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_foreign_table_statement(PostgreSQLParser.Create_foreign_table_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#define_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine_table(PostgreSQLParser.Define_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#define_partition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine_partition(PostgreSQLParser.Define_partitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#for_values_bound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_values_bound(PostgreSQLParser.For_values_boundContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#partition_bound_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartition_bound_spec(PostgreSQLParser.Partition_bound_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#partition_bound_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartition_bound_part(PostgreSQLParser.Partition_bound_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#define_columns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine_columns(PostgreSQLParser.Define_columnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#define_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine_type(PostgreSQLParser.Define_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#partition_by}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartition_by(PostgreSQLParser.Partition_byContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#partition_method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartition_method(PostgreSQLParser.Partition_methodContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#partition_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartition_column(PostgreSQLParser.Partition_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#define_server}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine_server(PostgreSQLParser.Define_serverContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#define_foreign_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefine_foreign_options(PostgreSQLParser.Define_foreign_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#foreign_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeign_option(PostgreSQLParser.Foreign_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#foreign_option_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeign_option_name(PostgreSQLParser.Foreign_option_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#list_of_type_column_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitList_of_type_column_def(PostgreSQLParser.List_of_type_column_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#table_column_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_column_def(PostgreSQLParser.Table_column_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#table_of_type_column_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_of_type_column_def(PostgreSQLParser.Table_of_type_column_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#table_column_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_column_definition(PostgreSQLParser.Table_column_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#like_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLike_option(PostgreSQLParser.Like_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#constraint_common}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraint_common(PostgreSQLParser.Constraint_commonContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#constr_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstr_body(PostgreSQLParser.Constr_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#all_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAll_op(PostgreSQLParser.All_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#all_simple_op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAll_simple_op(PostgreSQLParser.All_simple_opContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#op_chars}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp_chars(PostgreSQLParser.Op_charsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#index_parameters}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_parameters(PostgreSQLParser.Index_parametersContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#names_in_parens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNames_in_parens(PostgreSQLParser.Names_in_parensContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#names_references}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNames_references(PostgreSQLParser.Names_referencesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#storage_parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorage_parameter(PostgreSQLParser.Storage_parameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#storage_parameter_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorage_parameter_option(PostgreSQLParser.Storage_parameter_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#storage_parameter_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorage_parameter_name(PostgreSQLParser.Storage_parameter_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#with_storage_parameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_storage_parameter(PostgreSQLParser.With_storage_parameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#storage_parameter_oid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorage_parameter_oid(PostgreSQLParser.Storage_parameter_oidContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#on_commit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOn_commit(PostgreSQLParser.On_commitContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#table_space}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_space(PostgreSQLParser.Table_spaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAction(PostgreSQLParser.ActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#owner_to}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOwner_to(PostgreSQLParser.Owner_toContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#rename_to}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRename_to(PostgreSQLParser.Rename_toContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#set_schema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_schema(PostgreSQLParser.Set_schemaContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#table_column_privilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_column_privilege(PostgreSQLParser.Table_column_privilegeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#usage_select_update}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsage_select_update(PostgreSQLParser.Usage_select_updateContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#partition_by_columns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartition_by_columns(PostgreSQLParser.Partition_by_columnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#cascade_restrict}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCascade_restrict(PostgreSQLParser.Cascade_restrictContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#collate_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollate_identifier(PostgreSQLParser.Collate_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#indirection_var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndirection_var(PostgreSQLParser.Indirection_varContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#dollar_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDollar_number(PostgreSQLParser.Dollar_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#indirection_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndirection_list(PostgreSQLParser.Indirection_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#indirection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndirection(PostgreSQLParser.IndirectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#drop_function_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_function_statement(PostgreSQLParser.Drop_function_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#drop_trigger_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_trigger_statement(PostgreSQLParser.Drop_trigger_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#drop_rule_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_rule_statement(PostgreSQLParser.Drop_rule_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#drop_statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_statements(PostgreSQLParser.Drop_statementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#if_exist_names_restrict_cascade}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_exist_names_restrict_cascade(PostgreSQLParser.If_exist_names_restrict_cascadeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#id_token}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId_token(PostgreSQLParser.Id_tokenContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(PostgreSQLParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#identifier_nontype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier_nontype(PostgreSQLParser.Identifier_nontypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#col_label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCol_label(PostgreSQLParser.Col_labelContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#tokens_nonreserved}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTokens_nonreserved(PostgreSQLParser.Tokens_nonreservedContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#tokens_nonreserved_except_function_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTokens_nonreserved_except_function_type(PostgreSQLParser.Tokens_nonreserved_except_function_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#tokens_reserved_except_function_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTokens_reserved_except_function_type(PostgreSQLParser.Tokens_reserved_except_function_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#tokens_reserved}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTokens_reserved(PostgreSQLParser.Tokens_reservedContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#tokens_nonkeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTokens_nonkeyword(PostgreSQLParser.Tokens_nonkeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#schema_qualified_name_nontype}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchema_qualified_name_nontype(PostgreSQLParser.Schema_qualified_name_nontypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#type_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_list(PostgreSQLParser.Type_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_type(PostgreSQLParser.Data_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#array_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_type(PostgreSQLParser.Array_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#predefined_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredefined_type(PostgreSQLParser.Predefined_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#interval_field}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval_field(PostgreSQLParser.Interval_fieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#type_length}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_length(PostgreSQLParser.Type_lengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#precision_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrecision_param(PostgreSQLParser.Precision_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#vex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVex(PostgreSQLParser.VexContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#vex_b}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVex_b(PostgreSQLParser.Vex_bContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#op}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOp(PostgreSQLParser.OpContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#all_op_ref}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAll_op_ref(PostgreSQLParser.All_op_refContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#datetime_overlaps}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatetime_overlaps(PostgreSQLParser.Datetime_overlapsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#value_expression_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_expression_primary(PostgreSQLParser.Value_expression_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#unsigned_value_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsigned_value_specification(PostgreSQLParser.Unsigned_value_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#unsigned_numeric_literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsigned_numeric_literal(PostgreSQLParser.Unsigned_numeric_literalContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#truth_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruth_value(PostgreSQLParser.Truth_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#case_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_expression(PostgreSQLParser.Case_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#cast_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast_specification(PostgreSQLParser.Cast_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(PostgreSQLParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#vex_or_named_notation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVex_or_named_notation(PostgreSQLParser.Vex_or_named_notationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#pointer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPointer(PostgreSQLParser.PointerContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#function_construct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_construct(PostgreSQLParser.Function_constructContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#extract_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtract_function(PostgreSQLParser.Extract_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#system_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSystem_function(PostgreSQLParser.System_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#date_time_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate_time_function(PostgreSQLParser.Date_time_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#string_value_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_value_function(PostgreSQLParser.String_value_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#xml_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_function(PostgreSQLParser.Xml_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#xml_table_column}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_table_column(PostgreSQLParser.Xml_table_columnContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#comparison_mod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison_mod(PostgreSQLParser.Comparison_modContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#filter_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter_clause(PostgreSQLParser.Filter_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#window_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_definition(PostgreSQLParser.Window_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#frame_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrame_clause(PostgreSQLParser.Frame_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#frame_bound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrame_bound(PostgreSQLParser.Frame_boundContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#array_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_expression(PostgreSQLParser.Array_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#array_elements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_elements(PostgreSQLParser.Array_elementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#type_coercion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_coercion(PostgreSQLParser.Type_coercionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#schema_qualified_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchema_qualified_name(PostgreSQLParser.Schema_qualified_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#set_qualifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_qualifier(PostgreSQLParser.Set_qualifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#table_subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_subquery(PostgreSQLParser.Table_subqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#select_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_stmt(PostgreSQLParser.Select_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#after_ops}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAfter_ops(PostgreSQLParser.After_opsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#select_stmt_no_parens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_stmt_no_parens(PostgreSQLParser.Select_stmt_no_parensContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#with_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_clause(PostgreSQLParser.With_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#with_query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_query(PostgreSQLParser.With_queryContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#select_ops}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_ops(PostgreSQLParser.Select_opsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#select_ops_no_parens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_ops_no_parens(PostgreSQLParser.Select_ops_no_parensContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#select_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_primary(PostgreSQLParser.Select_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#select_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list(PostgreSQLParser.Select_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#select_sublist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_sublist(PostgreSQLParser.Select_sublistContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#into_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInto_table(PostgreSQLParser.Into_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#from_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_item(PostgreSQLParser.From_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#from_primary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_primary(PostgreSQLParser.From_primaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#alias_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias_clause(PostgreSQLParser.Alias_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#from_function_column_def}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrom_function_column_def(PostgreSQLParser.From_function_column_defContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#groupby_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupby_clause(PostgreSQLParser.Groupby_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#grouping_element_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrouping_element_list(PostgreSQLParser.Grouping_element_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#grouping_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrouping_element(PostgreSQLParser.Grouping_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#values_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValues_stmt(PostgreSQLParser.Values_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#values_values}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValues_values(PostgreSQLParser.Values_valuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#orderby_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderby_clause(PostgreSQLParser.Orderby_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#sort_specifier_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSort_specifier_list(PostgreSQLParser.Sort_specifier_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#sort_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSort_specifier(PostgreSQLParser.Sort_specifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#order_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_specification(PostgreSQLParser.Order_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#null_ordering}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull_ordering(PostgreSQLParser.Null_orderingContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#insert_stmt_for_psql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_stmt_for_psql(PostgreSQLParser.Insert_stmt_for_psqlContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#insert_columns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_columns(PostgreSQLParser.Insert_columnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#indirection_identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndirection_identifier(PostgreSQLParser.Indirection_identifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#conflict_object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConflict_object(PostgreSQLParser.Conflict_objectContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#conflict_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConflict_action(PostgreSQLParser.Conflict_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#delete_stmt_for_psql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_stmt_for_psql(PostgreSQLParser.Delete_stmt_for_psqlContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#update_stmt_for_psql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_stmt_for_psql(PostgreSQLParser.Update_stmt_for_psqlContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#update_set}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_set(PostgreSQLParser.Update_setContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#notify_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotify_stmt(PostgreSQLParser.Notify_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#truncate_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruncate_stmt(PostgreSQLParser.Truncate_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#identifier_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier_list(PostgreSQLParser.Identifier_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#anonymous_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonymous_block(PostgreSQLParser.Anonymous_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#comp_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp_options(PostgreSQLParser.Comp_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#function_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_block(PostgreSQLParser.Function_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#start_label}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart_label(PostgreSQLParser.Start_labelContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#declarations}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclarations(PostgreSQLParser.DeclarationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaration(PostgreSQLParser.DeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#type_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType_declaration(PostgreSQLParser.Type_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#arguments_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArguments_list(PostgreSQLParser.Arguments_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#data_type_dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_type_dec(PostgreSQLParser.Data_type_decContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#exception_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitException_statement(PostgreSQLParser.Exception_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#function_statements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_statements(PostgreSQLParser.Function_statementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#function_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_statement(PostgreSQLParser.Function_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#base_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBase_statement(PostgreSQLParser.Base_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#var}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar(PostgreSQLParser.VarContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#diagnostic_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiagnostic_option(PostgreSQLParser.Diagnostic_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#perform_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPerform_stmt(PostgreSQLParser.Perform_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#assign_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssign_stmt(PostgreSQLParser.Assign_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#execute_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute_stmt(PostgreSQLParser.Execute_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#control_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitControl_statement(PostgreSQLParser.Control_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#cursor_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_statement(PostgreSQLParser.Cursor_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOption(PostgreSQLParser.OptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#transaction_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransaction_statement(PostgreSQLParser.Transaction_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#message_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessage_statement(PostgreSQLParser.Message_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#log_level}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLog_level(PostgreSQLParser.Log_levelContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#raise_using}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaise_using(PostgreSQLParser.Raise_usingContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#raise_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaise_param(PostgreSQLParser.Raise_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#return_stmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_stmt(PostgreSQLParser.Return_stmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#loop_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_statement(PostgreSQLParser.Loop_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#loop_start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoop_start(PostgreSQLParser.Loop_startContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#using_vex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsing_vex(PostgreSQLParser.Using_vexContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(PostgreSQLParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#case_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_statement(PostgreSQLParser.Case_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link PostgreSQLParser#plpgsql_query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlpgsql_query(PostgreSQLParser.Plpgsql_queryContext ctx);
}