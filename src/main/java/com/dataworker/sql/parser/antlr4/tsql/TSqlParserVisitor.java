// Generated from com/dataworker/sql/parser/antlr4/tsql/TSqlParser.g4 by ANTLR 4.7.1
package com.dataworker.sql.parser.antlr4.tsql;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link TSqlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface TSqlParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link TSqlParser#tsql_file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTsql_file(TSqlParser.Tsql_fileContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#batch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBatch(TSqlParser.BatchContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#sql_clauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_clauses(TSqlParser.Sql_clausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#sql_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_clause(TSqlParser.Sql_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#dml_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDml_clause(TSqlParser.Dml_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#ddl_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdl_clause(TSqlParser.Ddl_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#backup_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackup_statement(TSqlParser.Backup_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#cfl_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCfl_statement(TSqlParser.Cfl_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#block_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlock_statement(TSqlParser.Block_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#break_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBreak_statement(TSqlParser.Break_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#continue_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContinue_statement(TSqlParser.Continue_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#goto_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGoto_statement(TSqlParser.Goto_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#return_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturn_statement(TSqlParser.Return_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(TSqlParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#throw_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrow_statement(TSqlParser.Throw_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#throw_error_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrow_error_number(TSqlParser.Throw_error_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#throw_message}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrow_message(TSqlParser.Throw_messageContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#throw_state}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThrow_state(TSqlParser.Throw_stateContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#try_catch_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTry_catch_statement(TSqlParser.Try_catch_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#waitfor_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWaitfor_statement(TSqlParser.Waitfor_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#while_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_statement(TSqlParser.While_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#print_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrint_statement(TSqlParser.Print_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#raiseerror_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaiseerror_statement(TSqlParser.Raiseerror_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#empty_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmpty_statement(TSqlParser.Empty_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#another_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnother_statement(TSqlParser.Another_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_application_role}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_application_role(TSqlParser.Alter_application_roleContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_application_role}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_application_role(TSqlParser.Create_application_roleContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_aggregate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_aggregate(TSqlParser.Drop_aggregateContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_application_role}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_application_role(TSqlParser.Drop_application_roleContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_assembly}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_assembly(TSqlParser.Alter_assemblyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_assembly_start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_assembly_start(TSqlParser.Alter_assembly_startContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_assembly_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_assembly_clause(TSqlParser.Alter_assembly_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_assembly_from_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_assembly_from_clause(TSqlParser.Alter_assembly_from_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_assembly_from_clause_start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_assembly_from_clause_start(TSqlParser.Alter_assembly_from_clause_startContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_assembly_drop_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_assembly_drop_clause(TSqlParser.Alter_assembly_drop_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_assembly_drop_multiple_files}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_assembly_drop_multiple_files(TSqlParser.Alter_assembly_drop_multiple_filesContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_assembly_drop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_assembly_drop(TSqlParser.Alter_assembly_dropContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_assembly_add_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_assembly_add_clause(TSqlParser.Alter_assembly_add_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_asssembly_add_clause_start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_asssembly_add_clause_start(TSqlParser.Alter_asssembly_add_clause_startContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_assembly_client_file_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_assembly_client_file_clause(TSqlParser.Alter_assembly_client_file_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_assembly_file_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_assembly_file_name(TSqlParser.Alter_assembly_file_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_assembly_file_bits}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_assembly_file_bits(TSqlParser.Alter_assembly_file_bitsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_assembly_as}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_assembly_as(TSqlParser.Alter_assembly_asContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_assembly_with_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_assembly_with_clause(TSqlParser.Alter_assembly_with_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_assembly_with}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_assembly_with(TSqlParser.Alter_assembly_withContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#client_assembly_specifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClient_assembly_specifier(TSqlParser.Client_assembly_specifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#assembly_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssembly_option(TSqlParser.Assembly_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#network_file_share}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNetwork_file_share(TSqlParser.Network_file_shareContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#network_computer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNetwork_computer(TSqlParser.Network_computerContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#network_file_start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNetwork_file_start(TSqlParser.Network_file_startContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#file_path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_path(TSqlParser.File_pathContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#file_directory_path_separator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_directory_path_separator(TSqlParser.File_directory_path_separatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#local_file}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocal_file(TSqlParser.Local_fileContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#local_drive}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocal_drive(TSqlParser.Local_driveContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#multiple_local_files}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiple_local_files(TSqlParser.Multiple_local_filesContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#multiple_local_file_start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiple_local_file_start(TSqlParser.Multiple_local_file_startContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_assembly}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_assembly(TSqlParser.Create_assemblyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_assembly}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_assembly(TSqlParser.Drop_assemblyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_asymmetric_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_asymmetric_key(TSqlParser.Alter_asymmetric_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_asymmetric_key_start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_asymmetric_key_start(TSqlParser.Alter_asymmetric_key_startContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#asymmetric_key_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsymmetric_key_option(TSqlParser.Asymmetric_key_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#asymmetric_key_option_start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsymmetric_key_option_start(TSqlParser.Asymmetric_key_option_startContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#asymmetric_key_password_change_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsymmetric_key_password_change_option(TSqlParser.Asymmetric_key_password_change_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_asymmetric_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_asymmetric_key(TSqlParser.Create_asymmetric_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_asymmetric_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_asymmetric_key(TSqlParser.Drop_asymmetric_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_authorization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_authorization(TSqlParser.Alter_authorizationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#authorization_grantee}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuthorization_grantee(TSqlParser.Authorization_granteeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#entity_to}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntity_to(TSqlParser.Entity_toContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#colon_colon}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColon_colon(TSqlParser.Colon_colonContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_authorization_start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_authorization_start(TSqlParser.Alter_authorization_startContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_authorization_for_sql_database}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_authorization_for_sql_database(TSqlParser.Alter_authorization_for_sql_databaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_authorization_for_azure_dw}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_authorization_for_azure_dw(TSqlParser.Alter_authorization_for_azure_dwContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_authorization_for_parallel_dw}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_authorization_for_parallel_dw(TSqlParser.Alter_authorization_for_parallel_dwContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#class_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_type(TSqlParser.Class_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#class_type_for_sql_database}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_type_for_sql_database(TSqlParser.Class_type_for_sql_databaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#class_type_for_azure_dw}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_type_for_azure_dw(TSqlParser.Class_type_for_azure_dwContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#class_type_for_parallel_dw}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClass_type_for_parallel_dw(TSqlParser.Class_type_for_parallel_dwContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_availability_group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_availability_group(TSqlParser.Drop_availability_groupContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_availability_group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_availability_group(TSqlParser.Alter_availability_groupContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_availability_group_start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_availability_group_start(TSqlParser.Alter_availability_group_startContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_availability_group_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_availability_group_options(TSqlParser.Alter_availability_group_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_or_alter_broker_priority}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_or_alter_broker_priority(TSqlParser.Create_or_alter_broker_priorityContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_broker_priority}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_broker_priority(TSqlParser.Drop_broker_priorityContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_certificate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_certificate(TSqlParser.Alter_certificateContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_column_encryption_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_column_encryption_key(TSqlParser.Alter_column_encryption_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_column_encryption_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_column_encryption_key(TSqlParser.Create_column_encryption_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_certificate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_certificate(TSqlParser.Drop_certificateContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_column_encryption_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_column_encryption_key(TSqlParser.Drop_column_encryption_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_column_master_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_column_master_key(TSqlParser.Drop_column_master_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_contract}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_contract(TSqlParser.Drop_contractContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_credential}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_credential(TSqlParser.Drop_credentialContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_cryptograhic_provider}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_cryptograhic_provider(TSqlParser.Drop_cryptograhic_providerContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_database}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_database(TSqlParser.Drop_databaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_database_audit_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_database_audit_specification(TSqlParser.Drop_database_audit_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_database_scoped_credential}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_database_scoped_credential(TSqlParser.Drop_database_scoped_credentialContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_default(TSqlParser.Drop_defaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_endpoint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_endpoint(TSqlParser.Drop_endpointContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_external_data_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_external_data_source(TSqlParser.Drop_external_data_sourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_external_file_format}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_external_file_format(TSqlParser.Drop_external_file_formatContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_external_library}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_external_library(TSqlParser.Drop_external_libraryContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_external_resource_pool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_external_resource_pool(TSqlParser.Drop_external_resource_poolContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_external_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_external_table(TSqlParser.Drop_external_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_event_notifications}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_event_notifications(TSqlParser.Drop_event_notificationsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_event_session}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_event_session(TSqlParser.Drop_event_sessionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_fulltext_catalog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_fulltext_catalog(TSqlParser.Drop_fulltext_catalogContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_fulltext_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_fulltext_index(TSqlParser.Drop_fulltext_indexContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_fulltext_stoplist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_fulltext_stoplist(TSqlParser.Drop_fulltext_stoplistContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_login}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_login(TSqlParser.Drop_loginContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_master_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_master_key(TSqlParser.Drop_master_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_message_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_message_type(TSqlParser.Drop_message_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_partition_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_partition_function(TSqlParser.Drop_partition_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_partition_scheme}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_partition_scheme(TSqlParser.Drop_partition_schemeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_queue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_queue(TSqlParser.Drop_queueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_remote_service_binding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_remote_service_binding(TSqlParser.Drop_remote_service_bindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_resource_pool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_resource_pool(TSqlParser.Drop_resource_poolContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_db_role}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_db_role(TSqlParser.Drop_db_roleContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_route}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_route(TSqlParser.Drop_routeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_rule(TSqlParser.Drop_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_schema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_schema(TSqlParser.Drop_schemaContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_search_property_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_search_property_list(TSqlParser.Drop_search_property_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_security_policy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_security_policy(TSqlParser.Drop_security_policyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_sequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_sequence(TSqlParser.Drop_sequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_server_audit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_server_audit(TSqlParser.Drop_server_auditContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_server_audit_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_server_audit_specification(TSqlParser.Drop_server_audit_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_server_role}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_server_role(TSqlParser.Drop_server_roleContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_service}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_service(TSqlParser.Drop_serviceContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_signature}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_signature(TSqlParser.Drop_signatureContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_statistics_name_azure_dw_and_pdw}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_statistics_name_azure_dw_and_pdw(TSqlParser.Drop_statistics_name_azure_dw_and_pdwContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_symmetric_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_symmetric_key(TSqlParser.Drop_symmetric_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_synonym}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_synonym(TSqlParser.Drop_synonymContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_user}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_user(TSqlParser.Drop_userContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_workload_group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_workload_group(TSqlParser.Drop_workload_groupContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_xml_schema_collection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_xml_schema_collection(TSqlParser.Drop_xml_schema_collectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#disable_trigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisable_trigger(TSqlParser.Disable_triggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#enable_trigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnable_trigger(TSqlParser.Enable_triggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#lock_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLock_table(TSqlParser.Lock_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#truncate_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruncate_table(TSqlParser.Truncate_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_column_master_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_column_master_key(TSqlParser.Create_column_master_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_credential}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_credential(TSqlParser.Alter_credentialContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_credential}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_credential(TSqlParser.Create_credentialContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_cryptographic_provider}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_cryptographic_provider(TSqlParser.Alter_cryptographic_providerContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_cryptographic_provider}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_cryptographic_provider(TSqlParser.Create_cryptographic_providerContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_event_notification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_event_notification(TSqlParser.Create_event_notificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_or_alter_event_session}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_or_alter_event_session(TSqlParser.Create_or_alter_event_sessionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#event_session_predicate_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent_session_predicate_expression(TSqlParser.Event_session_predicate_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#event_session_predicate_factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent_session_predicate_factor(TSqlParser.Event_session_predicate_factorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#event_session_predicate_leaf}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent_session_predicate_leaf(TSqlParser.Event_session_predicate_leafContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_external_data_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_external_data_source(TSqlParser.Alter_external_data_sourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_external_library}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_external_library(TSqlParser.Alter_external_libraryContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_external_library}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_external_library(TSqlParser.Create_external_libraryContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_external_resource_pool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_external_resource_pool(TSqlParser.Alter_external_resource_poolContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_external_resource_pool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_external_resource_pool(TSqlParser.Create_external_resource_poolContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_fulltext_catalog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_fulltext_catalog(TSqlParser.Alter_fulltext_catalogContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_fulltext_catalog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_fulltext_catalog(TSqlParser.Create_fulltext_catalogContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_fulltext_stoplist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_fulltext_stoplist(TSqlParser.Alter_fulltext_stoplistContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_fulltext_stoplist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_fulltext_stoplist(TSqlParser.Create_fulltext_stoplistContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_login_sql_server}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_login_sql_server(TSqlParser.Alter_login_sql_serverContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_login_sql_server}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_login_sql_server(TSqlParser.Create_login_sql_serverContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_login_azure_sql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_login_azure_sql(TSqlParser.Alter_login_azure_sqlContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_login_azure_sql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_login_azure_sql(TSqlParser.Create_login_azure_sqlContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_login_azure_sql_dw_and_pdw}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_login_azure_sql_dw_and_pdw(TSqlParser.Alter_login_azure_sql_dw_and_pdwContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_login_pdw}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_login_pdw(TSqlParser.Create_login_pdwContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_master_key_sql_server}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_master_key_sql_server(TSqlParser.Alter_master_key_sql_serverContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_master_key_sql_server}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_master_key_sql_server(TSqlParser.Create_master_key_sql_serverContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_master_key_azure_sql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_master_key_azure_sql(TSqlParser.Alter_master_key_azure_sqlContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_master_key_azure_sql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_master_key_azure_sql(TSqlParser.Create_master_key_azure_sqlContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_message_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_message_type(TSqlParser.Alter_message_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_partition_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_partition_function(TSqlParser.Alter_partition_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_partition_scheme}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_partition_scheme(TSqlParser.Alter_partition_schemeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_remote_service_binding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_remote_service_binding(TSqlParser.Alter_remote_service_bindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_remote_service_binding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_remote_service_binding(TSqlParser.Create_remote_service_bindingContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_resource_pool}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_resource_pool(TSqlParser.Create_resource_poolContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_resource_governor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_resource_governor(TSqlParser.Alter_resource_governorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_db_role}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_db_role(TSqlParser.Alter_db_roleContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_db_role}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_db_role(TSqlParser.Create_db_roleContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_route}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_route(TSqlParser.Create_routeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_rule}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_rule(TSqlParser.Create_ruleContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_schema_sql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_schema_sql(TSqlParser.Alter_schema_sqlContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_schema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_schema(TSqlParser.Create_schemaContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_schema_azure_sql_dw_and_pdw}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_schema_azure_sql_dw_and_pdw(TSqlParser.Create_schema_azure_sql_dw_and_pdwContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_schema_azure_sql_dw_and_pdw}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_schema_azure_sql_dw_and_pdw(TSqlParser.Alter_schema_azure_sql_dw_and_pdwContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_search_property_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_search_property_list(TSqlParser.Create_search_property_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_security_policy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_security_policy(TSqlParser.Create_security_policyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_sequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_sequence(TSqlParser.Alter_sequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_sequence}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_sequence(TSqlParser.Create_sequenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_server_audit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_server_audit(TSqlParser.Alter_server_auditContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_server_audit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_server_audit(TSqlParser.Create_server_auditContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_server_audit_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_server_audit_specification(TSqlParser.Alter_server_audit_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_server_audit_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_server_audit_specification(TSqlParser.Create_server_audit_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_server_configuration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_server_configuration(TSqlParser.Alter_server_configurationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_server_role}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_server_role(TSqlParser.Alter_server_roleContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_server_role}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_server_role(TSqlParser.Create_server_roleContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_server_role_pdw}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_server_role_pdw(TSqlParser.Alter_server_role_pdwContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_service}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_service(TSqlParser.Alter_serviceContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_service}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_service(TSqlParser.Create_serviceContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_service_master_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_service_master_key(TSqlParser.Alter_service_master_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_symmetric_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_symmetric_key(TSqlParser.Alter_symmetric_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_symmetric_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_symmetric_key(TSqlParser.Create_symmetric_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_synonym}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_synonym(TSqlParser.Create_synonymContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_user}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_user(TSqlParser.Alter_userContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_user}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_user(TSqlParser.Create_userContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_user_azure_sql_dw}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_user_azure_sql_dw(TSqlParser.Create_user_azure_sql_dwContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_user_azure_sql}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_user_azure_sql(TSqlParser.Alter_user_azure_sqlContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_workload_group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_workload_group(TSqlParser.Alter_workload_groupContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_workload_group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_workload_group(TSqlParser.Create_workload_groupContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_xml_schema_collection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_xml_schema_collection(TSqlParser.Create_xml_schema_collectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_queue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_queue(TSqlParser.Create_queueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#queue_settings}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueue_settings(TSqlParser.Queue_settingsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_queue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_queue(TSqlParser.Alter_queueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#queue_action}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueue_action(TSqlParser.Queue_actionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#queue_rebuild_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueue_rebuild_options(TSqlParser.Queue_rebuild_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_contract}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_contract(TSqlParser.Create_contractContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#conversation_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConversation_statement(TSqlParser.Conversation_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#message_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMessage_statement(TSqlParser.Message_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#merge_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge_statement(TSqlParser.Merge_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#merge_matched}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge_matched(TSqlParser.Merge_matchedContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#merge_not_matched}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMerge_not_matched(TSqlParser.Merge_not_matchedContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#delete_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_statement(TSqlParser.Delete_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#delete_statement_from}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete_statement_from(TSqlParser.Delete_statement_fromContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#insert_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_statement(TSqlParser.Insert_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#insert_statement_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_statement_value(TSqlParser.Insert_statement_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#receive_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReceive_statement(TSqlParser.Receive_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#select_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_statement(TSqlParser.Select_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime(TSqlParser.TimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#update_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_statement(TSqlParser.Update_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#output_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput_clause(TSqlParser.Output_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#output_dml_list_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput_dml_list_elem(TSqlParser.Output_dml_list_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#output_column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput_column_name(TSqlParser.Output_column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_database}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_database(TSqlParser.Create_databaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_index(TSqlParser.Create_indexContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_or_alter_procedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_or_alter_procedure(TSqlParser.Create_or_alter_procedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_or_alter_trigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_or_alter_trigger(TSqlParser.Create_or_alter_triggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_or_alter_dml_trigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_or_alter_dml_trigger(TSqlParser.Create_or_alter_dml_triggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#dml_trigger_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDml_trigger_option(TSqlParser.Dml_trigger_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#dml_trigger_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDml_trigger_operation(TSqlParser.Dml_trigger_operationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_or_alter_ddl_trigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_or_alter_ddl_trigger(TSqlParser.Create_or_alter_ddl_triggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#ddl_trigger_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdl_trigger_operation(TSqlParser.Ddl_trigger_operationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_or_alter_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_or_alter_function(TSqlParser.Create_or_alter_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#func_body_returns_select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_body_returns_select(TSqlParser.Func_body_returns_selectContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#func_body_returns_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_body_returns_table(TSqlParser.Func_body_returns_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#func_body_returns_scalar}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_body_returns_scalar(TSqlParser.Func_body_returns_scalarContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#procedure_param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure_param(TSqlParser.Procedure_paramContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#procedure_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedure_option(TSqlParser.Procedure_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#function_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_option(TSqlParser.Function_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_statistics}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_statistics(TSqlParser.Create_statisticsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#update_statistics}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_statistics(TSqlParser.Update_statisticsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_table(TSqlParser.Create_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#table_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_options(TSqlParser.Table_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_view}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_view(TSqlParser.Create_viewContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#view_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitView_attribute(TSqlParser.View_attributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_table(TSqlParser.Alter_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_database}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_database(TSqlParser.Alter_databaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#database_optionspec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabase_optionspec(TSqlParser.Database_optionspecContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#auto_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuto_option(TSqlParser.Auto_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#change_tracking_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChange_tracking_option(TSqlParser.Change_tracking_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#change_tracking_option_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChange_tracking_option_list(TSqlParser.Change_tracking_option_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#containment_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContainment_option(TSqlParser.Containment_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#cursor_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_option(TSqlParser.Cursor_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#alter_endpoint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlter_endpoint(TSqlParser.Alter_endpointContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#database_mirroring_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabase_mirroring_option(TSqlParser.Database_mirroring_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#mirroring_set_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMirroring_set_option(TSqlParser.Mirroring_set_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#mirroring_partner}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMirroring_partner(TSqlParser.Mirroring_partnerContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#mirroring_witness}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMirroring_witness(TSqlParser.Mirroring_witnessContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#witness_partner_equal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWitness_partner_equal(TSqlParser.Witness_partner_equalContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#partner_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartner_option(TSqlParser.Partner_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#witness_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWitness_option(TSqlParser.Witness_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#witness_server}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWitness_server(TSqlParser.Witness_serverContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#partner_server}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartner_server(TSqlParser.Partner_serverContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#mirroring_host_port_seperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMirroring_host_port_seperator(TSqlParser.Mirroring_host_port_seperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#partner_server_tcp_prefix}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartner_server_tcp_prefix(TSqlParser.Partner_server_tcp_prefixContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#port_number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPort_number(TSqlParser.Port_numberContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#host}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHost(TSqlParser.HostContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#date_correlation_optimization_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate_correlation_optimization_option(TSqlParser.Date_correlation_optimization_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#db_encryption_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDb_encryption_option(TSqlParser.Db_encryption_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#db_state_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDb_state_option(TSqlParser.Db_state_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#db_update_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDb_update_option(TSqlParser.Db_update_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#db_user_access_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDb_user_access_option(TSqlParser.Db_user_access_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#delayed_durability_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelayed_durability_option(TSqlParser.Delayed_durability_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#external_access_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExternal_access_option(TSqlParser.External_access_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#hadr_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHadr_options(TSqlParser.Hadr_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#mixed_page_allocation_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMixed_page_allocation_option(TSqlParser.Mixed_page_allocation_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#parameterization_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterization_option(TSqlParser.Parameterization_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#recovery_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecovery_option(TSqlParser.Recovery_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#service_broker_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitService_broker_option(TSqlParser.Service_broker_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#snapshot_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSnapshot_option(TSqlParser.Snapshot_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#sql_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_option(TSqlParser.Sql_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#target_recovery_time_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTarget_recovery_time_option(TSqlParser.Target_recovery_time_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#termination}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTermination(TSqlParser.TerminationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_index(TSqlParser.Drop_indexContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_relational_or_xml_or_spatial_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_relational_or_xml_or_spatial_index(TSqlParser.Drop_relational_or_xml_or_spatial_indexContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_backward_compatible_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_backward_compatible_index(TSqlParser.Drop_backward_compatible_indexContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_procedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_procedure(TSqlParser.Drop_procedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_trigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_trigger(TSqlParser.Drop_triggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_dml_trigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_dml_trigger(TSqlParser.Drop_dml_triggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_ddl_trigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_ddl_trigger(TSqlParser.Drop_ddl_triggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_function(TSqlParser.Drop_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_statistics}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_statistics(TSqlParser.Drop_statisticsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_table(TSqlParser.Drop_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_view}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_view(TSqlParser.Drop_viewContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_type(TSqlParser.Create_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#drop_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDrop_type(TSqlParser.Drop_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#rowset_function_limited}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowset_function_limited(TSqlParser.Rowset_function_limitedContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#openquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenquery(TSqlParser.OpenqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#opendatasource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpendatasource(TSqlParser.OpendatasourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#declare_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_statement(TSqlParser.Declare_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#cursor_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_statement(TSqlParser.Cursor_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#backup_database}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackup_database(TSqlParser.Backup_databaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#backup_log}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackup_log(TSqlParser.Backup_logContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#backup_certificate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackup_certificate(TSqlParser.Backup_certificateContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#backup_master_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackup_master_key(TSqlParser.Backup_master_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#backup_service_master_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBackup_service_master_key(TSqlParser.Backup_service_master_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#kill_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKill_statement(TSqlParser.Kill_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#kill_process}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKill_process(TSqlParser.Kill_processContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#kill_query_notification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKill_query_notification(TSqlParser.Kill_query_notificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#kill_stats_job}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKill_stats_job(TSqlParser.Kill_stats_jobContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#execute_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute_statement(TSqlParser.Execute_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#execute_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute_body(TSqlParser.Execute_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#execute_statement_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute_statement_arg(TSqlParser.Execute_statement_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#execute_var_string}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute_var_string(TSqlParser.Execute_var_stringContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#security_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecurity_statement(TSqlParser.Security_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_certificate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_certificate(TSqlParser.Create_certificateContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#existing_keys}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExisting_keys(TSqlParser.Existing_keysContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#private_key_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivate_key_options(TSqlParser.Private_key_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#generate_new_keys}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenerate_new_keys(TSqlParser.Generate_new_keysContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#date_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDate_options(TSqlParser.Date_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#open_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpen_key(TSqlParser.Open_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#close_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClose_key(TSqlParser.Close_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_key}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_key(TSqlParser.Create_keyContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#key_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKey_options(TSqlParser.Key_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#algorithm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlgorithm(TSqlParser.AlgorithmContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#encryption_mechanism}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEncryption_mechanism(TSqlParser.Encryption_mechanismContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#decryption_mechanism}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecryption_mechanism(TSqlParser.Decryption_mechanismContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#grant_permission}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrant_permission(TSqlParser.Grant_permissionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#set_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_statement(TSqlParser.Set_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#transaction_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransaction_statement(TSqlParser.Transaction_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#go_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGo_statement(TSqlParser.Go_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#use_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUse_statement(TSqlParser.Use_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#setuser_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetuser_statement(TSqlParser.Setuser_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#reconfigure_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReconfigure_statement(TSqlParser.Reconfigure_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#shutdown_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShutdown_statement(TSqlParser.Shutdown_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#dbcc_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDbcc_clause(TSqlParser.Dbcc_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#dbcc_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDbcc_options(TSqlParser.Dbcc_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#execute_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecute_clause(TSqlParser.Execute_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#declare_local}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_local(TSqlParser.Declare_localContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#table_type_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_type_definition(TSqlParser.Table_type_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#xml_type_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_type_definition(TSqlParser.Xml_type_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#xml_schema_collection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_schema_collection(TSqlParser.Xml_schema_collectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#column_def_table_constraints}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_def_table_constraints(TSqlParser.Column_def_table_constraintsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#column_def_table_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_def_table_constraint(TSqlParser.Column_def_table_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#column_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_definition(TSqlParser.Column_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#materialized_column_definition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMaterialized_column_definition(TSqlParser.Materialized_column_definitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#column_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_constraint(TSqlParser.Column_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#table_constraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_constraint(TSqlParser.Table_constraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#on_delete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOn_delete(TSqlParser.On_deleteContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#on_update}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOn_update(TSqlParser.On_updateContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#index_options}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_options(TSqlParser.Index_optionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#index_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_option(TSqlParser.Index_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#declare_cursor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_cursor(TSqlParser.Declare_cursorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#declare_set_cursor_common}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_set_cursor_common(TSqlParser.Declare_set_cursor_commonContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#declare_set_cursor_common_partial}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclare_set_cursor_common_partial(TSqlParser.Declare_set_cursor_common_partialContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#fetch_cursor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFetch_cursor(TSqlParser.Fetch_cursorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#set_special}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_special(TSqlParser.Set_specialContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#constant_LOCAL_ID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_LOCAL_ID(TSqlParser.Constant_LOCAL_IDContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(TSqlParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#primitive_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitive_expression(TSqlParser.Primitive_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#case_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCase_expression(TSqlParser.Case_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#unary_operator_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnary_operator_expression(TSqlParser.Unary_operator_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#bracket_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBracket_expression(TSqlParser.Bracket_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#constant_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_expression(TSqlParser.Constant_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery(TSqlParser.SubqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#with_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_expression(TSqlParser.With_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#common_table_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommon_table_expression(TSqlParser.Common_table_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#update_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate_elem(TSqlParser.Update_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#search_condition_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearch_condition_list(TSqlParser.Search_condition_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#search_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearch_condition(TSqlParser.Search_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#search_condition_and}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearch_condition_and(TSqlParser.Search_condition_andContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#search_condition_not}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearch_condition_not(TSqlParser.Search_condition_notContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate(TSqlParser.PredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#query_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_expression(TSqlParser.Query_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#sql_union}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSql_union(TSqlParser.Sql_unionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#query_specification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_specification(TSqlParser.Query_specificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#top_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTop_clause(TSqlParser.Top_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#top_percent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTop_percent(TSqlParser.Top_percentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#top_count}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTop_count(TSqlParser.Top_countContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#order_by_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_by_clause(TSqlParser.Order_by_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#for_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_clause(TSqlParser.For_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#xml_common_directives}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_common_directives(TSqlParser.Xml_common_directivesContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#order_by_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_by_expression(TSqlParser.Order_by_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#group_by_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_by_item(TSqlParser.Group_by_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#option_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOption_clause(TSqlParser.Option_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOption(TSqlParser.OptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#optimize_for_arg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptimize_for_arg(TSqlParser.Optimize_for_argContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#select_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list(TSqlParser.Select_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#udt_method_arguments}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUdt_method_arguments(TSqlParser.Udt_method_argumentsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#asterisk}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsterisk(TSqlParser.AsteriskContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#column_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_elem(TSqlParser.Column_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#udt_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUdt_elem(TSqlParser.Udt_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#expression_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_elem(TSqlParser.Expression_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#select_list_elem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect_list_elem(TSqlParser.Select_list_elemContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#table_sources}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_sources(TSqlParser.Table_sourcesContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#table_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_source(TSqlParser.Table_sourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#table_source_item_joined}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_source_item_joined(TSqlParser.Table_source_item_joinedContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#table_source_item}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_source_item(TSqlParser.Table_source_itemContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#open_xml}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpen_xml(TSqlParser.Open_xmlContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#schema_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchema_declaration(TSqlParser.Schema_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#column_declaration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_declaration(TSqlParser.Column_declarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#change_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChange_table(TSqlParser.Change_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#join_part}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_part(TSqlParser.Join_partContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#pivot_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPivot_clause(TSqlParser.Pivot_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#unpivot_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnpivot_clause(TSqlParser.Unpivot_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#full_column_name_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFull_column_name_list(TSqlParser.Full_column_name_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#table_name_with_hint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name_with_hint(TSqlParser.Table_name_with_hintContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#rowset_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowset_function(TSqlParser.Rowset_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#bulk_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBulk_option(TSqlParser.Bulk_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#derived_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDerived_table(TSqlParser.Derived_tableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BINARY_CHECKSUM}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBINARY_CHECKSUM(TSqlParser.BINARY_CHECKSUMContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CAST}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCAST(TSqlParser.CASTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CONVERT}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCONVERT(TSqlParser.CONVERTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CHECKSUM}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCHECKSUM(TSqlParser.CHECKSUMContext ctx);
	/**
	 * Visit a parse tree produced by the {@code COALESCE}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCOALESCE(TSqlParser.COALESCEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CURRENT_TIMESTAMP}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCURRENT_TIMESTAMP(TSqlParser.CURRENT_TIMESTAMPContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CURRENT_USER}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCURRENT_USER(TSqlParser.CURRENT_USERContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DATEADD}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDATEADD(TSqlParser.DATEADDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DATEDIFF}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDATEDIFF(TSqlParser.DATEDIFFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DATENAME}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDATENAME(TSqlParser.DATENAMEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DATEPART}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDATEPART(TSqlParser.DATEPARTContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GETDATE}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGETDATE(TSqlParser.GETDATEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code GETUTCDATE}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGETUTCDATE(TSqlParser.GETUTCDATEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IDENTITY}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIDENTITY(TSqlParser.IDENTITYContext ctx);
	/**
	 * Visit a parse tree produced by the {@code MIN_ACTIVE_ROWVERSION}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMIN_ACTIVE_ROWVERSION(TSqlParser.MIN_ACTIVE_ROWVERSIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code NULLIF}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNULLIF(TSqlParser.NULLIFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code STUFF}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSTUFF(TSqlParser.STUFFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SESSION_USER}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSESSION_USER(TSqlParser.SESSION_USERContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SYSTEM_USER}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSYSTEM_USER(TSqlParser.SYSTEM_USERContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ISNULL}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitISNULL(TSqlParser.ISNULLContext ctx);
	/**
	 * Visit a parse tree produced by the {@code XML_DATA_TYPE_FUNC}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXML_DATA_TYPE_FUNC(TSqlParser.XML_DATA_TYPE_FUNCContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IFF}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIFF(TSqlParser.IFFContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RANKING_WINDOWED_FUNC}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRANKING_WINDOWED_FUNC(TSqlParser.RANKING_WINDOWED_FUNCContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AGGREGATE_WINDOWED_FUNC}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAGGREGATE_WINDOWED_FUNC(TSqlParser.AGGREGATE_WINDOWED_FUNCContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ANALYTIC_WINDOWED_FUNC}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitANALYTIC_WINDOWED_FUNC(TSqlParser.ANALYTIC_WINDOWED_FUNCContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SCALAR_FUNCTION}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSCALAR_FUNCTION(TSqlParser.SCALAR_FUNCTIONContext ctx);
	/**
	 * Visit a parse tree produced by the {@code STRINGAGG}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSTRINGAGG(TSqlParser.STRINGAGGContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#xml_data_type_methods}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXml_data_type_methods(TSqlParser.Xml_data_type_methodsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#value_method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValue_method(TSqlParser.Value_methodContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#query_method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_method(TSqlParser.Query_methodContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#exist_method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExist_method(TSqlParser.Exist_methodContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#modify_method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitModify_method(TSqlParser.Modify_methodContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#nodes_method}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNodes_method(TSqlParser.Nodes_methodContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#switch_section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_section(TSqlParser.Switch_sectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#switch_search_condition_section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSwitch_search_condition_section(TSqlParser.Switch_search_condition_sectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#as_column_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAs_column_alias(TSqlParser.As_column_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#as_table_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAs_table_alias(TSqlParser.As_table_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#table_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_alias(TSqlParser.Table_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#with_table_hints}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWith_table_hints(TSqlParser.With_table_hintsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#insert_with_table_hints}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert_with_table_hints(TSqlParser.Insert_with_table_hintsContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#table_hint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_hint(TSqlParser.Table_hintContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#index_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndex_value(TSqlParser.Index_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#column_alias_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_alias_list(TSqlParser.Column_alias_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#column_alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_alias(TSqlParser.Column_aliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#table_value_constructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_value_constructor(TSqlParser.Table_value_constructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#expression_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression_list(TSqlParser.Expression_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#ranking_windowed_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRanking_windowed_function(TSqlParser.Ranking_windowed_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#aggregate_windowed_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregate_windowed_function(TSqlParser.Aggregate_windowed_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#analytic_windowed_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnalytic_windowed_function(TSqlParser.Analytic_windowed_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#all_distinct_expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAll_distinct_expression(TSqlParser.All_distinct_expressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#over_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOver_clause(TSqlParser.Over_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#row_or_range_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRow_or_range_clause(TSqlParser.Row_or_range_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#window_frame_extent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_frame_extent(TSqlParser.Window_frame_extentContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#window_frame_bound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_frame_bound(TSqlParser.Window_frame_boundContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#window_frame_preceding}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_frame_preceding(TSqlParser.Window_frame_precedingContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#window_frame_following}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow_frame_following(TSqlParser.Window_frame_followingContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#create_database_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreate_database_option(TSqlParser.Create_database_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#database_filestream_option}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabase_filestream_option(TSqlParser.Database_filestream_optionContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#database_file_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabase_file_spec(TSqlParser.Database_file_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#file_group}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_group(TSqlParser.File_groupContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#file_spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_spec(TSqlParser.File_specContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#entity_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntity_name(TSqlParser.Entity_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#entity_name_for_azure_dw}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntity_name_for_azure_dw(TSqlParser.Entity_name_for_azure_dwContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#entity_name_for_parallel_dw}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEntity_name_for_parallel_dw(TSqlParser.Entity_name_for_parallel_dwContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#full_table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFull_table_name(TSqlParser.Full_table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#table_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable_name(TSqlParser.Table_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#simple_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_name(TSqlParser.Simple_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#func_proc_name_schema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_proc_name_schema(TSqlParser.Func_proc_name_schemaContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#func_proc_name_database_schema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_proc_name_database_schema(TSqlParser.Func_proc_name_database_schemaContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#func_proc_name_server_database_schema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunc_proc_name_server_database_schema(TSqlParser.Func_proc_name_server_database_schemaContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#ddl_object}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdl_object(TSqlParser.Ddl_objectContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#full_column_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFull_column_name(TSqlParser.Full_column_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#column_name_list_with_order}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name_list_with_order(TSqlParser.Column_name_list_with_orderContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#column_name_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumn_name_list(TSqlParser.Column_name_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#cursor_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursor_name(TSqlParser.Cursor_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#on_off}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOn_off(TSqlParser.On_offContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#clustered}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClustered(TSqlParser.ClusteredContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#null_notnull}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull_notnull(TSqlParser.Null_notnullContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#null_or_default}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull_or_default(TSqlParser.Null_or_defaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#scalar_function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalar_function_name(TSqlParser.Scalar_function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#begin_conversation_timer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBegin_conversation_timer(TSqlParser.Begin_conversation_timerContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#begin_conversation_dialog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBegin_conversation_dialog(TSqlParser.Begin_conversation_dialogContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#contract_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitContract_name(TSqlParser.Contract_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#service_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitService_name(TSqlParser.Service_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#end_conversation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnd_conversation(TSqlParser.End_conversationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#waitfor_conversation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWaitfor_conversation(TSqlParser.Waitfor_conversationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#get_conversation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGet_conversation(TSqlParser.Get_conversationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#queue_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueue_id(TSqlParser.Queue_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#send_conversation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSend_conversation(TSqlParser.Send_conversationContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#data_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitData_type(TSqlParser.Data_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#default_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefault_value(TSqlParser.Default_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(TSqlParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#sign}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSign(TSqlParser.SignContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(TSqlParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#simple_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimple_id(TSqlParser.Simple_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#comparison_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison_operator(TSqlParser.Comparison_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#assignment_operator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment_operator(TSqlParser.Assignment_operatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link TSqlParser#file_size}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFile_size(TSqlParser.File_sizeContext ctx);
}