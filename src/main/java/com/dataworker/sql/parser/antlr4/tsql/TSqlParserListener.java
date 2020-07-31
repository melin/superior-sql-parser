// Generated from com/dataworker/sql/parser/antlr4/tsql/TSqlParser.g4 by ANTLR 4.7.1
package com.dataworker.sql.parser.antlr4.tsql;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link TSqlParser}.
 */
public interface TSqlParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link TSqlParser#tsql_file}.
	 * @param ctx the parse tree
	 */
	void enterTsql_file(TSqlParser.Tsql_fileContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#tsql_file}.
	 * @param ctx the parse tree
	 */
	void exitTsql_file(TSqlParser.Tsql_fileContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#batch}.
	 * @param ctx the parse tree
	 */
	void enterBatch(TSqlParser.BatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#batch}.
	 * @param ctx the parse tree
	 */
	void exitBatch(TSqlParser.BatchContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#sql_clauses}.
	 * @param ctx the parse tree
	 */
	void enterSql_clauses(TSqlParser.Sql_clausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#sql_clauses}.
	 * @param ctx the parse tree
	 */
	void exitSql_clauses(TSqlParser.Sql_clausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#sql_clause}.
	 * @param ctx the parse tree
	 */
	void enterSql_clause(TSqlParser.Sql_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#sql_clause}.
	 * @param ctx the parse tree
	 */
	void exitSql_clause(TSqlParser.Sql_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#dml_clause}.
	 * @param ctx the parse tree
	 */
	void enterDml_clause(TSqlParser.Dml_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#dml_clause}.
	 * @param ctx the parse tree
	 */
	void exitDml_clause(TSqlParser.Dml_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#ddl_clause}.
	 * @param ctx the parse tree
	 */
	void enterDdl_clause(TSqlParser.Ddl_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#ddl_clause}.
	 * @param ctx the parse tree
	 */
	void exitDdl_clause(TSqlParser.Ddl_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#backup_statement}.
	 * @param ctx the parse tree
	 */
	void enterBackup_statement(TSqlParser.Backup_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#backup_statement}.
	 * @param ctx the parse tree
	 */
	void exitBackup_statement(TSqlParser.Backup_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#cfl_statement}.
	 * @param ctx the parse tree
	 */
	void enterCfl_statement(TSqlParser.Cfl_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#cfl_statement}.
	 * @param ctx the parse tree
	 */
	void exitCfl_statement(TSqlParser.Cfl_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#block_statement}.
	 * @param ctx the parse tree
	 */
	void enterBlock_statement(TSqlParser.Block_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#block_statement}.
	 * @param ctx the parse tree
	 */
	void exitBlock_statement(TSqlParser.Block_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#break_statement}.
	 * @param ctx the parse tree
	 */
	void enterBreak_statement(TSqlParser.Break_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#break_statement}.
	 * @param ctx the parse tree
	 */
	void exitBreak_statement(TSqlParser.Break_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#continue_statement}.
	 * @param ctx the parse tree
	 */
	void enterContinue_statement(TSqlParser.Continue_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#continue_statement}.
	 * @param ctx the parse tree
	 */
	void exitContinue_statement(TSqlParser.Continue_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#goto_statement}.
	 * @param ctx the parse tree
	 */
	void enterGoto_statement(TSqlParser.Goto_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#goto_statement}.
	 * @param ctx the parse tree
	 */
	void exitGoto_statement(TSqlParser.Goto_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void enterReturn_statement(TSqlParser.Return_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#return_statement}.
	 * @param ctx the parse tree
	 */
	void exitReturn_statement(TSqlParser.Return_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(TSqlParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(TSqlParser.If_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#throw_statement}.
	 * @param ctx the parse tree
	 */
	void enterThrow_statement(TSqlParser.Throw_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#throw_statement}.
	 * @param ctx the parse tree
	 */
	void exitThrow_statement(TSqlParser.Throw_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#throw_error_number}.
	 * @param ctx the parse tree
	 */
	void enterThrow_error_number(TSqlParser.Throw_error_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#throw_error_number}.
	 * @param ctx the parse tree
	 */
	void exitThrow_error_number(TSqlParser.Throw_error_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#throw_message}.
	 * @param ctx the parse tree
	 */
	void enterThrow_message(TSqlParser.Throw_messageContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#throw_message}.
	 * @param ctx the parse tree
	 */
	void exitThrow_message(TSqlParser.Throw_messageContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#throw_state}.
	 * @param ctx the parse tree
	 */
	void enterThrow_state(TSqlParser.Throw_stateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#throw_state}.
	 * @param ctx the parse tree
	 */
	void exitThrow_state(TSqlParser.Throw_stateContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#try_catch_statement}.
	 * @param ctx the parse tree
	 */
	void enterTry_catch_statement(TSqlParser.Try_catch_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#try_catch_statement}.
	 * @param ctx the parse tree
	 */
	void exitTry_catch_statement(TSqlParser.Try_catch_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#waitfor_statement}.
	 * @param ctx the parse tree
	 */
	void enterWaitfor_statement(TSqlParser.Waitfor_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#waitfor_statement}.
	 * @param ctx the parse tree
	 */
	void exitWaitfor_statement(TSqlParser.Waitfor_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void enterWhile_statement(TSqlParser.While_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#while_statement}.
	 * @param ctx the parse tree
	 */
	void exitWhile_statement(TSqlParser.While_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#print_statement}.
	 * @param ctx the parse tree
	 */
	void enterPrint_statement(TSqlParser.Print_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#print_statement}.
	 * @param ctx the parse tree
	 */
	void exitPrint_statement(TSqlParser.Print_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#raiseerror_statement}.
	 * @param ctx the parse tree
	 */
	void enterRaiseerror_statement(TSqlParser.Raiseerror_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#raiseerror_statement}.
	 * @param ctx the parse tree
	 */
	void exitRaiseerror_statement(TSqlParser.Raiseerror_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#empty_statement}.
	 * @param ctx the parse tree
	 */
	void enterEmpty_statement(TSqlParser.Empty_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#empty_statement}.
	 * @param ctx the parse tree
	 */
	void exitEmpty_statement(TSqlParser.Empty_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#another_statement}.
	 * @param ctx the parse tree
	 */
	void enterAnother_statement(TSqlParser.Another_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#another_statement}.
	 * @param ctx the parse tree
	 */
	void exitAnother_statement(TSqlParser.Another_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_application_role}.
	 * @param ctx the parse tree
	 */
	void enterAlter_application_role(TSqlParser.Alter_application_roleContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_application_role}.
	 * @param ctx the parse tree
	 */
	void exitAlter_application_role(TSqlParser.Alter_application_roleContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_application_role}.
	 * @param ctx the parse tree
	 */
	void enterCreate_application_role(TSqlParser.Create_application_roleContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_application_role}.
	 * @param ctx the parse tree
	 */
	void exitCreate_application_role(TSqlParser.Create_application_roleContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_aggregate}.
	 * @param ctx the parse tree
	 */
	void enterDrop_aggregate(TSqlParser.Drop_aggregateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_aggregate}.
	 * @param ctx the parse tree
	 */
	void exitDrop_aggregate(TSqlParser.Drop_aggregateContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_application_role}.
	 * @param ctx the parse tree
	 */
	void enterDrop_application_role(TSqlParser.Drop_application_roleContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_application_role}.
	 * @param ctx the parse tree
	 */
	void exitDrop_application_role(TSqlParser.Drop_application_roleContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_assembly}.
	 * @param ctx the parse tree
	 */
	void enterAlter_assembly(TSqlParser.Alter_assemblyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_assembly}.
	 * @param ctx the parse tree
	 */
	void exitAlter_assembly(TSqlParser.Alter_assemblyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_assembly_start}.
	 * @param ctx the parse tree
	 */
	void enterAlter_assembly_start(TSqlParser.Alter_assembly_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_assembly_start}.
	 * @param ctx the parse tree
	 */
	void exitAlter_assembly_start(TSqlParser.Alter_assembly_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_assembly_clause}.
	 * @param ctx the parse tree
	 */
	void enterAlter_assembly_clause(TSqlParser.Alter_assembly_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_assembly_clause}.
	 * @param ctx the parse tree
	 */
	void exitAlter_assembly_clause(TSqlParser.Alter_assembly_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_assembly_from_clause}.
	 * @param ctx the parse tree
	 */
	void enterAlter_assembly_from_clause(TSqlParser.Alter_assembly_from_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_assembly_from_clause}.
	 * @param ctx the parse tree
	 */
	void exitAlter_assembly_from_clause(TSqlParser.Alter_assembly_from_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_assembly_from_clause_start}.
	 * @param ctx the parse tree
	 */
	void enterAlter_assembly_from_clause_start(TSqlParser.Alter_assembly_from_clause_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_assembly_from_clause_start}.
	 * @param ctx the parse tree
	 */
	void exitAlter_assembly_from_clause_start(TSqlParser.Alter_assembly_from_clause_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_assembly_drop_clause}.
	 * @param ctx the parse tree
	 */
	void enterAlter_assembly_drop_clause(TSqlParser.Alter_assembly_drop_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_assembly_drop_clause}.
	 * @param ctx the parse tree
	 */
	void exitAlter_assembly_drop_clause(TSqlParser.Alter_assembly_drop_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_assembly_drop_multiple_files}.
	 * @param ctx the parse tree
	 */
	void enterAlter_assembly_drop_multiple_files(TSqlParser.Alter_assembly_drop_multiple_filesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_assembly_drop_multiple_files}.
	 * @param ctx the parse tree
	 */
	void exitAlter_assembly_drop_multiple_files(TSqlParser.Alter_assembly_drop_multiple_filesContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_assembly_drop}.
	 * @param ctx the parse tree
	 */
	void enterAlter_assembly_drop(TSqlParser.Alter_assembly_dropContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_assembly_drop}.
	 * @param ctx the parse tree
	 */
	void exitAlter_assembly_drop(TSqlParser.Alter_assembly_dropContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_assembly_add_clause}.
	 * @param ctx the parse tree
	 */
	void enterAlter_assembly_add_clause(TSqlParser.Alter_assembly_add_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_assembly_add_clause}.
	 * @param ctx the parse tree
	 */
	void exitAlter_assembly_add_clause(TSqlParser.Alter_assembly_add_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_asssembly_add_clause_start}.
	 * @param ctx the parse tree
	 */
	void enterAlter_asssembly_add_clause_start(TSqlParser.Alter_asssembly_add_clause_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_asssembly_add_clause_start}.
	 * @param ctx the parse tree
	 */
	void exitAlter_asssembly_add_clause_start(TSqlParser.Alter_asssembly_add_clause_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_assembly_client_file_clause}.
	 * @param ctx the parse tree
	 */
	void enterAlter_assembly_client_file_clause(TSqlParser.Alter_assembly_client_file_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_assembly_client_file_clause}.
	 * @param ctx the parse tree
	 */
	void exitAlter_assembly_client_file_clause(TSqlParser.Alter_assembly_client_file_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_assembly_file_name}.
	 * @param ctx the parse tree
	 */
	void enterAlter_assembly_file_name(TSqlParser.Alter_assembly_file_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_assembly_file_name}.
	 * @param ctx the parse tree
	 */
	void exitAlter_assembly_file_name(TSqlParser.Alter_assembly_file_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_assembly_file_bits}.
	 * @param ctx the parse tree
	 */
	void enterAlter_assembly_file_bits(TSqlParser.Alter_assembly_file_bitsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_assembly_file_bits}.
	 * @param ctx the parse tree
	 */
	void exitAlter_assembly_file_bits(TSqlParser.Alter_assembly_file_bitsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_assembly_as}.
	 * @param ctx the parse tree
	 */
	void enterAlter_assembly_as(TSqlParser.Alter_assembly_asContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_assembly_as}.
	 * @param ctx the parse tree
	 */
	void exitAlter_assembly_as(TSqlParser.Alter_assembly_asContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_assembly_with_clause}.
	 * @param ctx the parse tree
	 */
	void enterAlter_assembly_with_clause(TSqlParser.Alter_assembly_with_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_assembly_with_clause}.
	 * @param ctx the parse tree
	 */
	void exitAlter_assembly_with_clause(TSqlParser.Alter_assembly_with_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_assembly_with}.
	 * @param ctx the parse tree
	 */
	void enterAlter_assembly_with(TSqlParser.Alter_assembly_withContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_assembly_with}.
	 * @param ctx the parse tree
	 */
	void exitAlter_assembly_with(TSqlParser.Alter_assembly_withContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#client_assembly_specifier}.
	 * @param ctx the parse tree
	 */
	void enterClient_assembly_specifier(TSqlParser.Client_assembly_specifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#client_assembly_specifier}.
	 * @param ctx the parse tree
	 */
	void exitClient_assembly_specifier(TSqlParser.Client_assembly_specifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#assembly_option}.
	 * @param ctx the parse tree
	 */
	void enterAssembly_option(TSqlParser.Assembly_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#assembly_option}.
	 * @param ctx the parse tree
	 */
	void exitAssembly_option(TSqlParser.Assembly_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#network_file_share}.
	 * @param ctx the parse tree
	 */
	void enterNetwork_file_share(TSqlParser.Network_file_shareContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#network_file_share}.
	 * @param ctx the parse tree
	 */
	void exitNetwork_file_share(TSqlParser.Network_file_shareContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#network_computer}.
	 * @param ctx the parse tree
	 */
	void enterNetwork_computer(TSqlParser.Network_computerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#network_computer}.
	 * @param ctx the parse tree
	 */
	void exitNetwork_computer(TSqlParser.Network_computerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#network_file_start}.
	 * @param ctx the parse tree
	 */
	void enterNetwork_file_start(TSqlParser.Network_file_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#network_file_start}.
	 * @param ctx the parse tree
	 */
	void exitNetwork_file_start(TSqlParser.Network_file_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#file_path}.
	 * @param ctx the parse tree
	 */
	void enterFile_path(TSqlParser.File_pathContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#file_path}.
	 * @param ctx the parse tree
	 */
	void exitFile_path(TSqlParser.File_pathContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#file_directory_path_separator}.
	 * @param ctx the parse tree
	 */
	void enterFile_directory_path_separator(TSqlParser.File_directory_path_separatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#file_directory_path_separator}.
	 * @param ctx the parse tree
	 */
	void exitFile_directory_path_separator(TSqlParser.File_directory_path_separatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#local_file}.
	 * @param ctx the parse tree
	 */
	void enterLocal_file(TSqlParser.Local_fileContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#local_file}.
	 * @param ctx the parse tree
	 */
	void exitLocal_file(TSqlParser.Local_fileContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#local_drive}.
	 * @param ctx the parse tree
	 */
	void enterLocal_drive(TSqlParser.Local_driveContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#local_drive}.
	 * @param ctx the parse tree
	 */
	void exitLocal_drive(TSqlParser.Local_driveContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#multiple_local_files}.
	 * @param ctx the parse tree
	 */
	void enterMultiple_local_files(TSqlParser.Multiple_local_filesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#multiple_local_files}.
	 * @param ctx the parse tree
	 */
	void exitMultiple_local_files(TSqlParser.Multiple_local_filesContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#multiple_local_file_start}.
	 * @param ctx the parse tree
	 */
	void enterMultiple_local_file_start(TSqlParser.Multiple_local_file_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#multiple_local_file_start}.
	 * @param ctx the parse tree
	 */
	void exitMultiple_local_file_start(TSqlParser.Multiple_local_file_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_assembly}.
	 * @param ctx the parse tree
	 */
	void enterCreate_assembly(TSqlParser.Create_assemblyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_assembly}.
	 * @param ctx the parse tree
	 */
	void exitCreate_assembly(TSqlParser.Create_assemblyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_assembly}.
	 * @param ctx the parse tree
	 */
	void enterDrop_assembly(TSqlParser.Drop_assemblyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_assembly}.
	 * @param ctx the parse tree
	 */
	void exitDrop_assembly(TSqlParser.Drop_assemblyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_asymmetric_key}.
	 * @param ctx the parse tree
	 */
	void enterAlter_asymmetric_key(TSqlParser.Alter_asymmetric_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_asymmetric_key}.
	 * @param ctx the parse tree
	 */
	void exitAlter_asymmetric_key(TSqlParser.Alter_asymmetric_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_asymmetric_key_start}.
	 * @param ctx the parse tree
	 */
	void enterAlter_asymmetric_key_start(TSqlParser.Alter_asymmetric_key_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_asymmetric_key_start}.
	 * @param ctx the parse tree
	 */
	void exitAlter_asymmetric_key_start(TSqlParser.Alter_asymmetric_key_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#asymmetric_key_option}.
	 * @param ctx the parse tree
	 */
	void enterAsymmetric_key_option(TSqlParser.Asymmetric_key_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#asymmetric_key_option}.
	 * @param ctx the parse tree
	 */
	void exitAsymmetric_key_option(TSqlParser.Asymmetric_key_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#asymmetric_key_option_start}.
	 * @param ctx the parse tree
	 */
	void enterAsymmetric_key_option_start(TSqlParser.Asymmetric_key_option_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#asymmetric_key_option_start}.
	 * @param ctx the parse tree
	 */
	void exitAsymmetric_key_option_start(TSqlParser.Asymmetric_key_option_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#asymmetric_key_password_change_option}.
	 * @param ctx the parse tree
	 */
	void enterAsymmetric_key_password_change_option(TSqlParser.Asymmetric_key_password_change_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#asymmetric_key_password_change_option}.
	 * @param ctx the parse tree
	 */
	void exitAsymmetric_key_password_change_option(TSqlParser.Asymmetric_key_password_change_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_asymmetric_key}.
	 * @param ctx the parse tree
	 */
	void enterCreate_asymmetric_key(TSqlParser.Create_asymmetric_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_asymmetric_key}.
	 * @param ctx the parse tree
	 */
	void exitCreate_asymmetric_key(TSqlParser.Create_asymmetric_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_asymmetric_key}.
	 * @param ctx the parse tree
	 */
	void enterDrop_asymmetric_key(TSqlParser.Drop_asymmetric_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_asymmetric_key}.
	 * @param ctx the parse tree
	 */
	void exitDrop_asymmetric_key(TSqlParser.Drop_asymmetric_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_authorization}.
	 * @param ctx the parse tree
	 */
	void enterAlter_authorization(TSqlParser.Alter_authorizationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_authorization}.
	 * @param ctx the parse tree
	 */
	void exitAlter_authorization(TSqlParser.Alter_authorizationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#authorization_grantee}.
	 * @param ctx the parse tree
	 */
	void enterAuthorization_grantee(TSqlParser.Authorization_granteeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#authorization_grantee}.
	 * @param ctx the parse tree
	 */
	void exitAuthorization_grantee(TSqlParser.Authorization_granteeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#entity_to}.
	 * @param ctx the parse tree
	 */
	void enterEntity_to(TSqlParser.Entity_toContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#entity_to}.
	 * @param ctx the parse tree
	 */
	void exitEntity_to(TSqlParser.Entity_toContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#colon_colon}.
	 * @param ctx the parse tree
	 */
	void enterColon_colon(TSqlParser.Colon_colonContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#colon_colon}.
	 * @param ctx the parse tree
	 */
	void exitColon_colon(TSqlParser.Colon_colonContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_authorization_start}.
	 * @param ctx the parse tree
	 */
	void enterAlter_authorization_start(TSqlParser.Alter_authorization_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_authorization_start}.
	 * @param ctx the parse tree
	 */
	void exitAlter_authorization_start(TSqlParser.Alter_authorization_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_authorization_for_sql_database}.
	 * @param ctx the parse tree
	 */
	void enterAlter_authorization_for_sql_database(TSqlParser.Alter_authorization_for_sql_databaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_authorization_for_sql_database}.
	 * @param ctx the parse tree
	 */
	void exitAlter_authorization_for_sql_database(TSqlParser.Alter_authorization_for_sql_databaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_authorization_for_azure_dw}.
	 * @param ctx the parse tree
	 */
	void enterAlter_authorization_for_azure_dw(TSqlParser.Alter_authorization_for_azure_dwContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_authorization_for_azure_dw}.
	 * @param ctx the parse tree
	 */
	void exitAlter_authorization_for_azure_dw(TSqlParser.Alter_authorization_for_azure_dwContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_authorization_for_parallel_dw}.
	 * @param ctx the parse tree
	 */
	void enterAlter_authorization_for_parallel_dw(TSqlParser.Alter_authorization_for_parallel_dwContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_authorization_for_parallel_dw}.
	 * @param ctx the parse tree
	 */
	void exitAlter_authorization_for_parallel_dw(TSqlParser.Alter_authorization_for_parallel_dwContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#class_type}.
	 * @param ctx the parse tree
	 */
	void enterClass_type(TSqlParser.Class_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#class_type}.
	 * @param ctx the parse tree
	 */
	void exitClass_type(TSqlParser.Class_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#class_type_for_sql_database}.
	 * @param ctx the parse tree
	 */
	void enterClass_type_for_sql_database(TSqlParser.Class_type_for_sql_databaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#class_type_for_sql_database}.
	 * @param ctx the parse tree
	 */
	void exitClass_type_for_sql_database(TSqlParser.Class_type_for_sql_databaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#class_type_for_azure_dw}.
	 * @param ctx the parse tree
	 */
	void enterClass_type_for_azure_dw(TSqlParser.Class_type_for_azure_dwContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#class_type_for_azure_dw}.
	 * @param ctx the parse tree
	 */
	void exitClass_type_for_azure_dw(TSqlParser.Class_type_for_azure_dwContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#class_type_for_parallel_dw}.
	 * @param ctx the parse tree
	 */
	void enterClass_type_for_parallel_dw(TSqlParser.Class_type_for_parallel_dwContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#class_type_for_parallel_dw}.
	 * @param ctx the parse tree
	 */
	void exitClass_type_for_parallel_dw(TSqlParser.Class_type_for_parallel_dwContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_availability_group}.
	 * @param ctx the parse tree
	 */
	void enterDrop_availability_group(TSqlParser.Drop_availability_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_availability_group}.
	 * @param ctx the parse tree
	 */
	void exitDrop_availability_group(TSqlParser.Drop_availability_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_availability_group}.
	 * @param ctx the parse tree
	 */
	void enterAlter_availability_group(TSqlParser.Alter_availability_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_availability_group}.
	 * @param ctx the parse tree
	 */
	void exitAlter_availability_group(TSqlParser.Alter_availability_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_availability_group_start}.
	 * @param ctx the parse tree
	 */
	void enterAlter_availability_group_start(TSqlParser.Alter_availability_group_startContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_availability_group_start}.
	 * @param ctx the parse tree
	 */
	void exitAlter_availability_group_start(TSqlParser.Alter_availability_group_startContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_availability_group_options}.
	 * @param ctx the parse tree
	 */
	void enterAlter_availability_group_options(TSqlParser.Alter_availability_group_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_availability_group_options}.
	 * @param ctx the parse tree
	 */
	void exitAlter_availability_group_options(TSqlParser.Alter_availability_group_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_or_alter_broker_priority}.
	 * @param ctx the parse tree
	 */
	void enterCreate_or_alter_broker_priority(TSqlParser.Create_or_alter_broker_priorityContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_or_alter_broker_priority}.
	 * @param ctx the parse tree
	 */
	void exitCreate_or_alter_broker_priority(TSqlParser.Create_or_alter_broker_priorityContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_broker_priority}.
	 * @param ctx the parse tree
	 */
	void enterDrop_broker_priority(TSqlParser.Drop_broker_priorityContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_broker_priority}.
	 * @param ctx the parse tree
	 */
	void exitDrop_broker_priority(TSqlParser.Drop_broker_priorityContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_certificate}.
	 * @param ctx the parse tree
	 */
	void enterAlter_certificate(TSqlParser.Alter_certificateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_certificate}.
	 * @param ctx the parse tree
	 */
	void exitAlter_certificate(TSqlParser.Alter_certificateContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_column_encryption_key}.
	 * @param ctx the parse tree
	 */
	void enterAlter_column_encryption_key(TSqlParser.Alter_column_encryption_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_column_encryption_key}.
	 * @param ctx the parse tree
	 */
	void exitAlter_column_encryption_key(TSqlParser.Alter_column_encryption_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_column_encryption_key}.
	 * @param ctx the parse tree
	 */
	void enterCreate_column_encryption_key(TSqlParser.Create_column_encryption_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_column_encryption_key}.
	 * @param ctx the parse tree
	 */
	void exitCreate_column_encryption_key(TSqlParser.Create_column_encryption_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_certificate}.
	 * @param ctx the parse tree
	 */
	void enterDrop_certificate(TSqlParser.Drop_certificateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_certificate}.
	 * @param ctx the parse tree
	 */
	void exitDrop_certificate(TSqlParser.Drop_certificateContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_column_encryption_key}.
	 * @param ctx the parse tree
	 */
	void enterDrop_column_encryption_key(TSqlParser.Drop_column_encryption_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_column_encryption_key}.
	 * @param ctx the parse tree
	 */
	void exitDrop_column_encryption_key(TSqlParser.Drop_column_encryption_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_column_master_key}.
	 * @param ctx the parse tree
	 */
	void enterDrop_column_master_key(TSqlParser.Drop_column_master_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_column_master_key}.
	 * @param ctx the parse tree
	 */
	void exitDrop_column_master_key(TSqlParser.Drop_column_master_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_contract}.
	 * @param ctx the parse tree
	 */
	void enterDrop_contract(TSqlParser.Drop_contractContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_contract}.
	 * @param ctx the parse tree
	 */
	void exitDrop_contract(TSqlParser.Drop_contractContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_credential}.
	 * @param ctx the parse tree
	 */
	void enterDrop_credential(TSqlParser.Drop_credentialContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_credential}.
	 * @param ctx the parse tree
	 */
	void exitDrop_credential(TSqlParser.Drop_credentialContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_cryptograhic_provider}.
	 * @param ctx the parse tree
	 */
	void enterDrop_cryptograhic_provider(TSqlParser.Drop_cryptograhic_providerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_cryptograhic_provider}.
	 * @param ctx the parse tree
	 */
	void exitDrop_cryptograhic_provider(TSqlParser.Drop_cryptograhic_providerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_database}.
	 * @param ctx the parse tree
	 */
	void enterDrop_database(TSqlParser.Drop_databaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_database}.
	 * @param ctx the parse tree
	 */
	void exitDrop_database(TSqlParser.Drop_databaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_database_audit_specification}.
	 * @param ctx the parse tree
	 */
	void enterDrop_database_audit_specification(TSqlParser.Drop_database_audit_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_database_audit_specification}.
	 * @param ctx the parse tree
	 */
	void exitDrop_database_audit_specification(TSqlParser.Drop_database_audit_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_database_scoped_credential}.
	 * @param ctx the parse tree
	 */
	void enterDrop_database_scoped_credential(TSqlParser.Drop_database_scoped_credentialContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_database_scoped_credential}.
	 * @param ctx the parse tree
	 */
	void exitDrop_database_scoped_credential(TSqlParser.Drop_database_scoped_credentialContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_default}.
	 * @param ctx the parse tree
	 */
	void enterDrop_default(TSqlParser.Drop_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_default}.
	 * @param ctx the parse tree
	 */
	void exitDrop_default(TSqlParser.Drop_defaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_endpoint}.
	 * @param ctx the parse tree
	 */
	void enterDrop_endpoint(TSqlParser.Drop_endpointContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_endpoint}.
	 * @param ctx the parse tree
	 */
	void exitDrop_endpoint(TSqlParser.Drop_endpointContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_external_data_source}.
	 * @param ctx the parse tree
	 */
	void enterDrop_external_data_source(TSqlParser.Drop_external_data_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_external_data_source}.
	 * @param ctx the parse tree
	 */
	void exitDrop_external_data_source(TSqlParser.Drop_external_data_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_external_file_format}.
	 * @param ctx the parse tree
	 */
	void enterDrop_external_file_format(TSqlParser.Drop_external_file_formatContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_external_file_format}.
	 * @param ctx the parse tree
	 */
	void exitDrop_external_file_format(TSqlParser.Drop_external_file_formatContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_external_library}.
	 * @param ctx the parse tree
	 */
	void enterDrop_external_library(TSqlParser.Drop_external_libraryContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_external_library}.
	 * @param ctx the parse tree
	 */
	void exitDrop_external_library(TSqlParser.Drop_external_libraryContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_external_resource_pool}.
	 * @param ctx the parse tree
	 */
	void enterDrop_external_resource_pool(TSqlParser.Drop_external_resource_poolContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_external_resource_pool}.
	 * @param ctx the parse tree
	 */
	void exitDrop_external_resource_pool(TSqlParser.Drop_external_resource_poolContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_external_table}.
	 * @param ctx the parse tree
	 */
	void enterDrop_external_table(TSqlParser.Drop_external_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_external_table}.
	 * @param ctx the parse tree
	 */
	void exitDrop_external_table(TSqlParser.Drop_external_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_event_notifications}.
	 * @param ctx the parse tree
	 */
	void enterDrop_event_notifications(TSqlParser.Drop_event_notificationsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_event_notifications}.
	 * @param ctx the parse tree
	 */
	void exitDrop_event_notifications(TSqlParser.Drop_event_notificationsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_event_session}.
	 * @param ctx the parse tree
	 */
	void enterDrop_event_session(TSqlParser.Drop_event_sessionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_event_session}.
	 * @param ctx the parse tree
	 */
	void exitDrop_event_session(TSqlParser.Drop_event_sessionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_fulltext_catalog}.
	 * @param ctx the parse tree
	 */
	void enterDrop_fulltext_catalog(TSqlParser.Drop_fulltext_catalogContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_fulltext_catalog}.
	 * @param ctx the parse tree
	 */
	void exitDrop_fulltext_catalog(TSqlParser.Drop_fulltext_catalogContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_fulltext_index}.
	 * @param ctx the parse tree
	 */
	void enterDrop_fulltext_index(TSqlParser.Drop_fulltext_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_fulltext_index}.
	 * @param ctx the parse tree
	 */
	void exitDrop_fulltext_index(TSqlParser.Drop_fulltext_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_fulltext_stoplist}.
	 * @param ctx the parse tree
	 */
	void enterDrop_fulltext_stoplist(TSqlParser.Drop_fulltext_stoplistContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_fulltext_stoplist}.
	 * @param ctx the parse tree
	 */
	void exitDrop_fulltext_stoplist(TSqlParser.Drop_fulltext_stoplistContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_login}.
	 * @param ctx the parse tree
	 */
	void enterDrop_login(TSqlParser.Drop_loginContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_login}.
	 * @param ctx the parse tree
	 */
	void exitDrop_login(TSqlParser.Drop_loginContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_master_key}.
	 * @param ctx the parse tree
	 */
	void enterDrop_master_key(TSqlParser.Drop_master_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_master_key}.
	 * @param ctx the parse tree
	 */
	void exitDrop_master_key(TSqlParser.Drop_master_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_message_type}.
	 * @param ctx the parse tree
	 */
	void enterDrop_message_type(TSqlParser.Drop_message_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_message_type}.
	 * @param ctx the parse tree
	 */
	void exitDrop_message_type(TSqlParser.Drop_message_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_partition_function}.
	 * @param ctx the parse tree
	 */
	void enterDrop_partition_function(TSqlParser.Drop_partition_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_partition_function}.
	 * @param ctx the parse tree
	 */
	void exitDrop_partition_function(TSqlParser.Drop_partition_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_partition_scheme}.
	 * @param ctx the parse tree
	 */
	void enterDrop_partition_scheme(TSqlParser.Drop_partition_schemeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_partition_scheme}.
	 * @param ctx the parse tree
	 */
	void exitDrop_partition_scheme(TSqlParser.Drop_partition_schemeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_queue}.
	 * @param ctx the parse tree
	 */
	void enterDrop_queue(TSqlParser.Drop_queueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_queue}.
	 * @param ctx the parse tree
	 */
	void exitDrop_queue(TSqlParser.Drop_queueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_remote_service_binding}.
	 * @param ctx the parse tree
	 */
	void enterDrop_remote_service_binding(TSqlParser.Drop_remote_service_bindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_remote_service_binding}.
	 * @param ctx the parse tree
	 */
	void exitDrop_remote_service_binding(TSqlParser.Drop_remote_service_bindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_resource_pool}.
	 * @param ctx the parse tree
	 */
	void enterDrop_resource_pool(TSqlParser.Drop_resource_poolContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_resource_pool}.
	 * @param ctx the parse tree
	 */
	void exitDrop_resource_pool(TSqlParser.Drop_resource_poolContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_db_role}.
	 * @param ctx the parse tree
	 */
	void enterDrop_db_role(TSqlParser.Drop_db_roleContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_db_role}.
	 * @param ctx the parse tree
	 */
	void exitDrop_db_role(TSqlParser.Drop_db_roleContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_route}.
	 * @param ctx the parse tree
	 */
	void enterDrop_route(TSqlParser.Drop_routeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_route}.
	 * @param ctx the parse tree
	 */
	void exitDrop_route(TSqlParser.Drop_routeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_rule}.
	 * @param ctx the parse tree
	 */
	void enterDrop_rule(TSqlParser.Drop_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_rule}.
	 * @param ctx the parse tree
	 */
	void exitDrop_rule(TSqlParser.Drop_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_schema}.
	 * @param ctx the parse tree
	 */
	void enterDrop_schema(TSqlParser.Drop_schemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_schema}.
	 * @param ctx the parse tree
	 */
	void exitDrop_schema(TSqlParser.Drop_schemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_search_property_list}.
	 * @param ctx the parse tree
	 */
	void enterDrop_search_property_list(TSqlParser.Drop_search_property_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_search_property_list}.
	 * @param ctx the parse tree
	 */
	void exitDrop_search_property_list(TSqlParser.Drop_search_property_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_security_policy}.
	 * @param ctx the parse tree
	 */
	void enterDrop_security_policy(TSqlParser.Drop_security_policyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_security_policy}.
	 * @param ctx the parse tree
	 */
	void exitDrop_security_policy(TSqlParser.Drop_security_policyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_sequence}.
	 * @param ctx the parse tree
	 */
	void enterDrop_sequence(TSqlParser.Drop_sequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_sequence}.
	 * @param ctx the parse tree
	 */
	void exitDrop_sequence(TSqlParser.Drop_sequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_server_audit}.
	 * @param ctx the parse tree
	 */
	void enterDrop_server_audit(TSqlParser.Drop_server_auditContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_server_audit}.
	 * @param ctx the parse tree
	 */
	void exitDrop_server_audit(TSqlParser.Drop_server_auditContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_server_audit_specification}.
	 * @param ctx the parse tree
	 */
	void enterDrop_server_audit_specification(TSqlParser.Drop_server_audit_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_server_audit_specification}.
	 * @param ctx the parse tree
	 */
	void exitDrop_server_audit_specification(TSqlParser.Drop_server_audit_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_server_role}.
	 * @param ctx the parse tree
	 */
	void enterDrop_server_role(TSqlParser.Drop_server_roleContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_server_role}.
	 * @param ctx the parse tree
	 */
	void exitDrop_server_role(TSqlParser.Drop_server_roleContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_service}.
	 * @param ctx the parse tree
	 */
	void enterDrop_service(TSqlParser.Drop_serviceContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_service}.
	 * @param ctx the parse tree
	 */
	void exitDrop_service(TSqlParser.Drop_serviceContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_signature}.
	 * @param ctx the parse tree
	 */
	void enterDrop_signature(TSqlParser.Drop_signatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_signature}.
	 * @param ctx the parse tree
	 */
	void exitDrop_signature(TSqlParser.Drop_signatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_statistics_name_azure_dw_and_pdw}.
	 * @param ctx the parse tree
	 */
	void enterDrop_statistics_name_azure_dw_and_pdw(TSqlParser.Drop_statistics_name_azure_dw_and_pdwContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_statistics_name_azure_dw_and_pdw}.
	 * @param ctx the parse tree
	 */
	void exitDrop_statistics_name_azure_dw_and_pdw(TSqlParser.Drop_statistics_name_azure_dw_and_pdwContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_symmetric_key}.
	 * @param ctx the parse tree
	 */
	void enterDrop_symmetric_key(TSqlParser.Drop_symmetric_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_symmetric_key}.
	 * @param ctx the parse tree
	 */
	void exitDrop_symmetric_key(TSqlParser.Drop_symmetric_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_synonym}.
	 * @param ctx the parse tree
	 */
	void enterDrop_synonym(TSqlParser.Drop_synonymContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_synonym}.
	 * @param ctx the parse tree
	 */
	void exitDrop_synonym(TSqlParser.Drop_synonymContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_user}.
	 * @param ctx the parse tree
	 */
	void enterDrop_user(TSqlParser.Drop_userContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_user}.
	 * @param ctx the parse tree
	 */
	void exitDrop_user(TSqlParser.Drop_userContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_workload_group}.
	 * @param ctx the parse tree
	 */
	void enterDrop_workload_group(TSqlParser.Drop_workload_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_workload_group}.
	 * @param ctx the parse tree
	 */
	void exitDrop_workload_group(TSqlParser.Drop_workload_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_xml_schema_collection}.
	 * @param ctx the parse tree
	 */
	void enterDrop_xml_schema_collection(TSqlParser.Drop_xml_schema_collectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_xml_schema_collection}.
	 * @param ctx the parse tree
	 */
	void exitDrop_xml_schema_collection(TSqlParser.Drop_xml_schema_collectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#disable_trigger}.
	 * @param ctx the parse tree
	 */
	void enterDisable_trigger(TSqlParser.Disable_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#disable_trigger}.
	 * @param ctx the parse tree
	 */
	void exitDisable_trigger(TSqlParser.Disable_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#enable_trigger}.
	 * @param ctx the parse tree
	 */
	void enterEnable_trigger(TSqlParser.Enable_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#enable_trigger}.
	 * @param ctx the parse tree
	 */
	void exitEnable_trigger(TSqlParser.Enable_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#lock_table}.
	 * @param ctx the parse tree
	 */
	void enterLock_table(TSqlParser.Lock_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#lock_table}.
	 * @param ctx the parse tree
	 */
	void exitLock_table(TSqlParser.Lock_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#truncate_table}.
	 * @param ctx the parse tree
	 */
	void enterTruncate_table(TSqlParser.Truncate_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#truncate_table}.
	 * @param ctx the parse tree
	 */
	void exitTruncate_table(TSqlParser.Truncate_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_column_master_key}.
	 * @param ctx the parse tree
	 */
	void enterCreate_column_master_key(TSqlParser.Create_column_master_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_column_master_key}.
	 * @param ctx the parse tree
	 */
	void exitCreate_column_master_key(TSqlParser.Create_column_master_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_credential}.
	 * @param ctx the parse tree
	 */
	void enterAlter_credential(TSqlParser.Alter_credentialContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_credential}.
	 * @param ctx the parse tree
	 */
	void exitAlter_credential(TSqlParser.Alter_credentialContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_credential}.
	 * @param ctx the parse tree
	 */
	void enterCreate_credential(TSqlParser.Create_credentialContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_credential}.
	 * @param ctx the parse tree
	 */
	void exitCreate_credential(TSqlParser.Create_credentialContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_cryptographic_provider}.
	 * @param ctx the parse tree
	 */
	void enterAlter_cryptographic_provider(TSqlParser.Alter_cryptographic_providerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_cryptographic_provider}.
	 * @param ctx the parse tree
	 */
	void exitAlter_cryptographic_provider(TSqlParser.Alter_cryptographic_providerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_cryptographic_provider}.
	 * @param ctx the parse tree
	 */
	void enterCreate_cryptographic_provider(TSqlParser.Create_cryptographic_providerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_cryptographic_provider}.
	 * @param ctx the parse tree
	 */
	void exitCreate_cryptographic_provider(TSqlParser.Create_cryptographic_providerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_event_notification}.
	 * @param ctx the parse tree
	 */
	void enterCreate_event_notification(TSqlParser.Create_event_notificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_event_notification}.
	 * @param ctx the parse tree
	 */
	void exitCreate_event_notification(TSqlParser.Create_event_notificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_or_alter_event_session}.
	 * @param ctx the parse tree
	 */
	void enterCreate_or_alter_event_session(TSqlParser.Create_or_alter_event_sessionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_or_alter_event_session}.
	 * @param ctx the parse tree
	 */
	void exitCreate_or_alter_event_session(TSqlParser.Create_or_alter_event_sessionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#event_session_predicate_expression}.
	 * @param ctx the parse tree
	 */
	void enterEvent_session_predicate_expression(TSqlParser.Event_session_predicate_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#event_session_predicate_expression}.
	 * @param ctx the parse tree
	 */
	void exitEvent_session_predicate_expression(TSqlParser.Event_session_predicate_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#event_session_predicate_factor}.
	 * @param ctx the parse tree
	 */
	void enterEvent_session_predicate_factor(TSqlParser.Event_session_predicate_factorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#event_session_predicate_factor}.
	 * @param ctx the parse tree
	 */
	void exitEvent_session_predicate_factor(TSqlParser.Event_session_predicate_factorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#event_session_predicate_leaf}.
	 * @param ctx the parse tree
	 */
	void enterEvent_session_predicate_leaf(TSqlParser.Event_session_predicate_leafContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#event_session_predicate_leaf}.
	 * @param ctx the parse tree
	 */
	void exitEvent_session_predicate_leaf(TSqlParser.Event_session_predicate_leafContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_external_data_source}.
	 * @param ctx the parse tree
	 */
	void enterAlter_external_data_source(TSqlParser.Alter_external_data_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_external_data_source}.
	 * @param ctx the parse tree
	 */
	void exitAlter_external_data_source(TSqlParser.Alter_external_data_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_external_library}.
	 * @param ctx the parse tree
	 */
	void enterAlter_external_library(TSqlParser.Alter_external_libraryContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_external_library}.
	 * @param ctx the parse tree
	 */
	void exitAlter_external_library(TSqlParser.Alter_external_libraryContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_external_library}.
	 * @param ctx the parse tree
	 */
	void enterCreate_external_library(TSqlParser.Create_external_libraryContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_external_library}.
	 * @param ctx the parse tree
	 */
	void exitCreate_external_library(TSqlParser.Create_external_libraryContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_external_resource_pool}.
	 * @param ctx the parse tree
	 */
	void enterAlter_external_resource_pool(TSqlParser.Alter_external_resource_poolContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_external_resource_pool}.
	 * @param ctx the parse tree
	 */
	void exitAlter_external_resource_pool(TSqlParser.Alter_external_resource_poolContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_external_resource_pool}.
	 * @param ctx the parse tree
	 */
	void enterCreate_external_resource_pool(TSqlParser.Create_external_resource_poolContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_external_resource_pool}.
	 * @param ctx the parse tree
	 */
	void exitCreate_external_resource_pool(TSqlParser.Create_external_resource_poolContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_fulltext_catalog}.
	 * @param ctx the parse tree
	 */
	void enterAlter_fulltext_catalog(TSqlParser.Alter_fulltext_catalogContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_fulltext_catalog}.
	 * @param ctx the parse tree
	 */
	void exitAlter_fulltext_catalog(TSqlParser.Alter_fulltext_catalogContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_fulltext_catalog}.
	 * @param ctx the parse tree
	 */
	void enterCreate_fulltext_catalog(TSqlParser.Create_fulltext_catalogContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_fulltext_catalog}.
	 * @param ctx the parse tree
	 */
	void exitCreate_fulltext_catalog(TSqlParser.Create_fulltext_catalogContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_fulltext_stoplist}.
	 * @param ctx the parse tree
	 */
	void enterAlter_fulltext_stoplist(TSqlParser.Alter_fulltext_stoplistContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_fulltext_stoplist}.
	 * @param ctx the parse tree
	 */
	void exitAlter_fulltext_stoplist(TSqlParser.Alter_fulltext_stoplistContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_fulltext_stoplist}.
	 * @param ctx the parse tree
	 */
	void enterCreate_fulltext_stoplist(TSqlParser.Create_fulltext_stoplistContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_fulltext_stoplist}.
	 * @param ctx the parse tree
	 */
	void exitCreate_fulltext_stoplist(TSqlParser.Create_fulltext_stoplistContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_login_sql_server}.
	 * @param ctx the parse tree
	 */
	void enterAlter_login_sql_server(TSqlParser.Alter_login_sql_serverContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_login_sql_server}.
	 * @param ctx the parse tree
	 */
	void exitAlter_login_sql_server(TSqlParser.Alter_login_sql_serverContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_login_sql_server}.
	 * @param ctx the parse tree
	 */
	void enterCreate_login_sql_server(TSqlParser.Create_login_sql_serverContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_login_sql_server}.
	 * @param ctx the parse tree
	 */
	void exitCreate_login_sql_server(TSqlParser.Create_login_sql_serverContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_login_azure_sql}.
	 * @param ctx the parse tree
	 */
	void enterAlter_login_azure_sql(TSqlParser.Alter_login_azure_sqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_login_azure_sql}.
	 * @param ctx the parse tree
	 */
	void exitAlter_login_azure_sql(TSqlParser.Alter_login_azure_sqlContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_login_azure_sql}.
	 * @param ctx the parse tree
	 */
	void enterCreate_login_azure_sql(TSqlParser.Create_login_azure_sqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_login_azure_sql}.
	 * @param ctx the parse tree
	 */
	void exitCreate_login_azure_sql(TSqlParser.Create_login_azure_sqlContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_login_azure_sql_dw_and_pdw}.
	 * @param ctx the parse tree
	 */
	void enterAlter_login_azure_sql_dw_and_pdw(TSqlParser.Alter_login_azure_sql_dw_and_pdwContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_login_azure_sql_dw_and_pdw}.
	 * @param ctx the parse tree
	 */
	void exitAlter_login_azure_sql_dw_and_pdw(TSqlParser.Alter_login_azure_sql_dw_and_pdwContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_login_pdw}.
	 * @param ctx the parse tree
	 */
	void enterCreate_login_pdw(TSqlParser.Create_login_pdwContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_login_pdw}.
	 * @param ctx the parse tree
	 */
	void exitCreate_login_pdw(TSqlParser.Create_login_pdwContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_master_key_sql_server}.
	 * @param ctx the parse tree
	 */
	void enterAlter_master_key_sql_server(TSqlParser.Alter_master_key_sql_serverContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_master_key_sql_server}.
	 * @param ctx the parse tree
	 */
	void exitAlter_master_key_sql_server(TSqlParser.Alter_master_key_sql_serverContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_master_key_sql_server}.
	 * @param ctx the parse tree
	 */
	void enterCreate_master_key_sql_server(TSqlParser.Create_master_key_sql_serverContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_master_key_sql_server}.
	 * @param ctx the parse tree
	 */
	void exitCreate_master_key_sql_server(TSqlParser.Create_master_key_sql_serverContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_master_key_azure_sql}.
	 * @param ctx the parse tree
	 */
	void enterAlter_master_key_azure_sql(TSqlParser.Alter_master_key_azure_sqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_master_key_azure_sql}.
	 * @param ctx the parse tree
	 */
	void exitAlter_master_key_azure_sql(TSqlParser.Alter_master_key_azure_sqlContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_master_key_azure_sql}.
	 * @param ctx the parse tree
	 */
	void enterCreate_master_key_azure_sql(TSqlParser.Create_master_key_azure_sqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_master_key_azure_sql}.
	 * @param ctx the parse tree
	 */
	void exitCreate_master_key_azure_sql(TSqlParser.Create_master_key_azure_sqlContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_message_type}.
	 * @param ctx the parse tree
	 */
	void enterAlter_message_type(TSqlParser.Alter_message_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_message_type}.
	 * @param ctx the parse tree
	 */
	void exitAlter_message_type(TSqlParser.Alter_message_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_partition_function}.
	 * @param ctx the parse tree
	 */
	void enterAlter_partition_function(TSqlParser.Alter_partition_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_partition_function}.
	 * @param ctx the parse tree
	 */
	void exitAlter_partition_function(TSqlParser.Alter_partition_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_partition_scheme}.
	 * @param ctx the parse tree
	 */
	void enterAlter_partition_scheme(TSqlParser.Alter_partition_schemeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_partition_scheme}.
	 * @param ctx the parse tree
	 */
	void exitAlter_partition_scheme(TSqlParser.Alter_partition_schemeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_remote_service_binding}.
	 * @param ctx the parse tree
	 */
	void enterAlter_remote_service_binding(TSqlParser.Alter_remote_service_bindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_remote_service_binding}.
	 * @param ctx the parse tree
	 */
	void exitAlter_remote_service_binding(TSqlParser.Alter_remote_service_bindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_remote_service_binding}.
	 * @param ctx the parse tree
	 */
	void enterCreate_remote_service_binding(TSqlParser.Create_remote_service_bindingContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_remote_service_binding}.
	 * @param ctx the parse tree
	 */
	void exitCreate_remote_service_binding(TSqlParser.Create_remote_service_bindingContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_resource_pool}.
	 * @param ctx the parse tree
	 */
	void enterCreate_resource_pool(TSqlParser.Create_resource_poolContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_resource_pool}.
	 * @param ctx the parse tree
	 */
	void exitCreate_resource_pool(TSqlParser.Create_resource_poolContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_resource_governor}.
	 * @param ctx the parse tree
	 */
	void enterAlter_resource_governor(TSqlParser.Alter_resource_governorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_resource_governor}.
	 * @param ctx the parse tree
	 */
	void exitAlter_resource_governor(TSqlParser.Alter_resource_governorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_db_role}.
	 * @param ctx the parse tree
	 */
	void enterAlter_db_role(TSqlParser.Alter_db_roleContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_db_role}.
	 * @param ctx the parse tree
	 */
	void exitAlter_db_role(TSqlParser.Alter_db_roleContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_db_role}.
	 * @param ctx the parse tree
	 */
	void enterCreate_db_role(TSqlParser.Create_db_roleContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_db_role}.
	 * @param ctx the parse tree
	 */
	void exitCreate_db_role(TSqlParser.Create_db_roleContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_route}.
	 * @param ctx the parse tree
	 */
	void enterCreate_route(TSqlParser.Create_routeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_route}.
	 * @param ctx the parse tree
	 */
	void exitCreate_route(TSqlParser.Create_routeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_rule}.
	 * @param ctx the parse tree
	 */
	void enterCreate_rule(TSqlParser.Create_ruleContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_rule}.
	 * @param ctx the parse tree
	 */
	void exitCreate_rule(TSqlParser.Create_ruleContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_schema_sql}.
	 * @param ctx the parse tree
	 */
	void enterAlter_schema_sql(TSqlParser.Alter_schema_sqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_schema_sql}.
	 * @param ctx the parse tree
	 */
	void exitAlter_schema_sql(TSqlParser.Alter_schema_sqlContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_schema}.
	 * @param ctx the parse tree
	 */
	void enterCreate_schema(TSqlParser.Create_schemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_schema}.
	 * @param ctx the parse tree
	 */
	void exitCreate_schema(TSqlParser.Create_schemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_schema_azure_sql_dw_and_pdw}.
	 * @param ctx the parse tree
	 */
	void enterCreate_schema_azure_sql_dw_and_pdw(TSqlParser.Create_schema_azure_sql_dw_and_pdwContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_schema_azure_sql_dw_and_pdw}.
	 * @param ctx the parse tree
	 */
	void exitCreate_schema_azure_sql_dw_and_pdw(TSqlParser.Create_schema_azure_sql_dw_and_pdwContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_schema_azure_sql_dw_and_pdw}.
	 * @param ctx the parse tree
	 */
	void enterAlter_schema_azure_sql_dw_and_pdw(TSqlParser.Alter_schema_azure_sql_dw_and_pdwContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_schema_azure_sql_dw_and_pdw}.
	 * @param ctx the parse tree
	 */
	void exitAlter_schema_azure_sql_dw_and_pdw(TSqlParser.Alter_schema_azure_sql_dw_and_pdwContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_search_property_list}.
	 * @param ctx the parse tree
	 */
	void enterCreate_search_property_list(TSqlParser.Create_search_property_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_search_property_list}.
	 * @param ctx the parse tree
	 */
	void exitCreate_search_property_list(TSqlParser.Create_search_property_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_security_policy}.
	 * @param ctx the parse tree
	 */
	void enterCreate_security_policy(TSqlParser.Create_security_policyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_security_policy}.
	 * @param ctx the parse tree
	 */
	void exitCreate_security_policy(TSqlParser.Create_security_policyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_sequence}.
	 * @param ctx the parse tree
	 */
	void enterAlter_sequence(TSqlParser.Alter_sequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_sequence}.
	 * @param ctx the parse tree
	 */
	void exitAlter_sequence(TSqlParser.Alter_sequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_sequence}.
	 * @param ctx the parse tree
	 */
	void enterCreate_sequence(TSqlParser.Create_sequenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_sequence}.
	 * @param ctx the parse tree
	 */
	void exitCreate_sequence(TSqlParser.Create_sequenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_server_audit}.
	 * @param ctx the parse tree
	 */
	void enterAlter_server_audit(TSqlParser.Alter_server_auditContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_server_audit}.
	 * @param ctx the parse tree
	 */
	void exitAlter_server_audit(TSqlParser.Alter_server_auditContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_server_audit}.
	 * @param ctx the parse tree
	 */
	void enterCreate_server_audit(TSqlParser.Create_server_auditContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_server_audit}.
	 * @param ctx the parse tree
	 */
	void exitCreate_server_audit(TSqlParser.Create_server_auditContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_server_audit_specification}.
	 * @param ctx the parse tree
	 */
	void enterAlter_server_audit_specification(TSqlParser.Alter_server_audit_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_server_audit_specification}.
	 * @param ctx the parse tree
	 */
	void exitAlter_server_audit_specification(TSqlParser.Alter_server_audit_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_server_audit_specification}.
	 * @param ctx the parse tree
	 */
	void enterCreate_server_audit_specification(TSqlParser.Create_server_audit_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_server_audit_specification}.
	 * @param ctx the parse tree
	 */
	void exitCreate_server_audit_specification(TSqlParser.Create_server_audit_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_server_configuration}.
	 * @param ctx the parse tree
	 */
	void enterAlter_server_configuration(TSqlParser.Alter_server_configurationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_server_configuration}.
	 * @param ctx the parse tree
	 */
	void exitAlter_server_configuration(TSqlParser.Alter_server_configurationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_server_role}.
	 * @param ctx the parse tree
	 */
	void enterAlter_server_role(TSqlParser.Alter_server_roleContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_server_role}.
	 * @param ctx the parse tree
	 */
	void exitAlter_server_role(TSqlParser.Alter_server_roleContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_server_role}.
	 * @param ctx the parse tree
	 */
	void enterCreate_server_role(TSqlParser.Create_server_roleContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_server_role}.
	 * @param ctx the parse tree
	 */
	void exitCreate_server_role(TSqlParser.Create_server_roleContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_server_role_pdw}.
	 * @param ctx the parse tree
	 */
	void enterAlter_server_role_pdw(TSqlParser.Alter_server_role_pdwContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_server_role_pdw}.
	 * @param ctx the parse tree
	 */
	void exitAlter_server_role_pdw(TSqlParser.Alter_server_role_pdwContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_service}.
	 * @param ctx the parse tree
	 */
	void enterAlter_service(TSqlParser.Alter_serviceContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_service}.
	 * @param ctx the parse tree
	 */
	void exitAlter_service(TSqlParser.Alter_serviceContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_service}.
	 * @param ctx the parse tree
	 */
	void enterCreate_service(TSqlParser.Create_serviceContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_service}.
	 * @param ctx the parse tree
	 */
	void exitCreate_service(TSqlParser.Create_serviceContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_service_master_key}.
	 * @param ctx the parse tree
	 */
	void enterAlter_service_master_key(TSqlParser.Alter_service_master_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_service_master_key}.
	 * @param ctx the parse tree
	 */
	void exitAlter_service_master_key(TSqlParser.Alter_service_master_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_symmetric_key}.
	 * @param ctx the parse tree
	 */
	void enterAlter_symmetric_key(TSqlParser.Alter_symmetric_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_symmetric_key}.
	 * @param ctx the parse tree
	 */
	void exitAlter_symmetric_key(TSqlParser.Alter_symmetric_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_symmetric_key}.
	 * @param ctx the parse tree
	 */
	void enterCreate_symmetric_key(TSqlParser.Create_symmetric_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_symmetric_key}.
	 * @param ctx the parse tree
	 */
	void exitCreate_symmetric_key(TSqlParser.Create_symmetric_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_synonym}.
	 * @param ctx the parse tree
	 */
	void enterCreate_synonym(TSqlParser.Create_synonymContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_synonym}.
	 * @param ctx the parse tree
	 */
	void exitCreate_synonym(TSqlParser.Create_synonymContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_user}.
	 * @param ctx the parse tree
	 */
	void enterAlter_user(TSqlParser.Alter_userContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_user}.
	 * @param ctx the parse tree
	 */
	void exitAlter_user(TSqlParser.Alter_userContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_user}.
	 * @param ctx the parse tree
	 */
	void enterCreate_user(TSqlParser.Create_userContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_user}.
	 * @param ctx the parse tree
	 */
	void exitCreate_user(TSqlParser.Create_userContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_user_azure_sql_dw}.
	 * @param ctx the parse tree
	 */
	void enterCreate_user_azure_sql_dw(TSqlParser.Create_user_azure_sql_dwContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_user_azure_sql_dw}.
	 * @param ctx the parse tree
	 */
	void exitCreate_user_azure_sql_dw(TSqlParser.Create_user_azure_sql_dwContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_user_azure_sql}.
	 * @param ctx the parse tree
	 */
	void enterAlter_user_azure_sql(TSqlParser.Alter_user_azure_sqlContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_user_azure_sql}.
	 * @param ctx the parse tree
	 */
	void exitAlter_user_azure_sql(TSqlParser.Alter_user_azure_sqlContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_workload_group}.
	 * @param ctx the parse tree
	 */
	void enterAlter_workload_group(TSqlParser.Alter_workload_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_workload_group}.
	 * @param ctx the parse tree
	 */
	void exitAlter_workload_group(TSqlParser.Alter_workload_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_workload_group}.
	 * @param ctx the parse tree
	 */
	void enterCreate_workload_group(TSqlParser.Create_workload_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_workload_group}.
	 * @param ctx the parse tree
	 */
	void exitCreate_workload_group(TSqlParser.Create_workload_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_xml_schema_collection}.
	 * @param ctx the parse tree
	 */
	void enterCreate_xml_schema_collection(TSqlParser.Create_xml_schema_collectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_xml_schema_collection}.
	 * @param ctx the parse tree
	 */
	void exitCreate_xml_schema_collection(TSqlParser.Create_xml_schema_collectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_queue}.
	 * @param ctx the parse tree
	 */
	void enterCreate_queue(TSqlParser.Create_queueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_queue}.
	 * @param ctx the parse tree
	 */
	void exitCreate_queue(TSqlParser.Create_queueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#queue_settings}.
	 * @param ctx the parse tree
	 */
	void enterQueue_settings(TSqlParser.Queue_settingsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#queue_settings}.
	 * @param ctx the parse tree
	 */
	void exitQueue_settings(TSqlParser.Queue_settingsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_queue}.
	 * @param ctx the parse tree
	 */
	void enterAlter_queue(TSqlParser.Alter_queueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_queue}.
	 * @param ctx the parse tree
	 */
	void exitAlter_queue(TSqlParser.Alter_queueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#queue_action}.
	 * @param ctx the parse tree
	 */
	void enterQueue_action(TSqlParser.Queue_actionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#queue_action}.
	 * @param ctx the parse tree
	 */
	void exitQueue_action(TSqlParser.Queue_actionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#queue_rebuild_options}.
	 * @param ctx the parse tree
	 */
	void enterQueue_rebuild_options(TSqlParser.Queue_rebuild_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#queue_rebuild_options}.
	 * @param ctx the parse tree
	 */
	void exitQueue_rebuild_options(TSqlParser.Queue_rebuild_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_contract}.
	 * @param ctx the parse tree
	 */
	void enterCreate_contract(TSqlParser.Create_contractContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_contract}.
	 * @param ctx the parse tree
	 */
	void exitCreate_contract(TSqlParser.Create_contractContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#conversation_statement}.
	 * @param ctx the parse tree
	 */
	void enterConversation_statement(TSqlParser.Conversation_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#conversation_statement}.
	 * @param ctx the parse tree
	 */
	void exitConversation_statement(TSqlParser.Conversation_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#message_statement}.
	 * @param ctx the parse tree
	 */
	void enterMessage_statement(TSqlParser.Message_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#message_statement}.
	 * @param ctx the parse tree
	 */
	void exitMessage_statement(TSqlParser.Message_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#merge_statement}.
	 * @param ctx the parse tree
	 */
	void enterMerge_statement(TSqlParser.Merge_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#merge_statement}.
	 * @param ctx the parse tree
	 */
	void exitMerge_statement(TSqlParser.Merge_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#merge_matched}.
	 * @param ctx the parse tree
	 */
	void enterMerge_matched(TSqlParser.Merge_matchedContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#merge_matched}.
	 * @param ctx the parse tree
	 */
	void exitMerge_matched(TSqlParser.Merge_matchedContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#merge_not_matched}.
	 * @param ctx the parse tree
	 */
	void enterMerge_not_matched(TSqlParser.Merge_not_matchedContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#merge_not_matched}.
	 * @param ctx the parse tree
	 */
	void exitMerge_not_matched(TSqlParser.Merge_not_matchedContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#delete_statement}.
	 * @param ctx the parse tree
	 */
	void enterDelete_statement(TSqlParser.Delete_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#delete_statement}.
	 * @param ctx the parse tree
	 */
	void exitDelete_statement(TSqlParser.Delete_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#delete_statement_from}.
	 * @param ctx the parse tree
	 */
	void enterDelete_statement_from(TSqlParser.Delete_statement_fromContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#delete_statement_from}.
	 * @param ctx the parse tree
	 */
	void exitDelete_statement_from(TSqlParser.Delete_statement_fromContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#insert_statement}.
	 * @param ctx the parse tree
	 */
	void enterInsert_statement(TSqlParser.Insert_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#insert_statement}.
	 * @param ctx the parse tree
	 */
	void exitInsert_statement(TSqlParser.Insert_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#insert_statement_value}.
	 * @param ctx the parse tree
	 */
	void enterInsert_statement_value(TSqlParser.Insert_statement_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#insert_statement_value}.
	 * @param ctx the parse tree
	 */
	void exitInsert_statement_value(TSqlParser.Insert_statement_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#receive_statement}.
	 * @param ctx the parse tree
	 */
	void enterReceive_statement(TSqlParser.Receive_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#receive_statement}.
	 * @param ctx the parse tree
	 */
	void exitReceive_statement(TSqlParser.Receive_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#select_statement}.
	 * @param ctx the parse tree
	 */
	void enterSelect_statement(TSqlParser.Select_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#select_statement}.
	 * @param ctx the parse tree
	 */
	void exitSelect_statement(TSqlParser.Select_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#time}.
	 * @param ctx the parse tree
	 */
	void enterTime(TSqlParser.TimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#time}.
	 * @param ctx the parse tree
	 */
	void exitTime(TSqlParser.TimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#update_statement}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_statement(TSqlParser.Update_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#update_statement}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_statement(TSqlParser.Update_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#output_clause}.
	 * @param ctx the parse tree
	 */
	void enterOutput_clause(TSqlParser.Output_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#output_clause}.
	 * @param ctx the parse tree
	 */
	void exitOutput_clause(TSqlParser.Output_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#output_dml_list_elem}.
	 * @param ctx the parse tree
	 */
	void enterOutput_dml_list_elem(TSqlParser.Output_dml_list_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#output_dml_list_elem}.
	 * @param ctx the parse tree
	 */
	void exitOutput_dml_list_elem(TSqlParser.Output_dml_list_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#output_column_name}.
	 * @param ctx the parse tree
	 */
	void enterOutput_column_name(TSqlParser.Output_column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#output_column_name}.
	 * @param ctx the parse tree
	 */
	void exitOutput_column_name(TSqlParser.Output_column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_database}.
	 * @param ctx the parse tree
	 */
	void enterCreate_database(TSqlParser.Create_databaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_database}.
	 * @param ctx the parse tree
	 */
	void exitCreate_database(TSqlParser.Create_databaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_index}.
	 * @param ctx the parse tree
	 */
	void enterCreate_index(TSqlParser.Create_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_index}.
	 * @param ctx the parse tree
	 */
	void exitCreate_index(TSqlParser.Create_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_or_alter_procedure}.
	 * @param ctx the parse tree
	 */
	void enterCreate_or_alter_procedure(TSqlParser.Create_or_alter_procedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_or_alter_procedure}.
	 * @param ctx the parse tree
	 */
	void exitCreate_or_alter_procedure(TSqlParser.Create_or_alter_procedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_or_alter_trigger}.
	 * @param ctx the parse tree
	 */
	void enterCreate_or_alter_trigger(TSqlParser.Create_or_alter_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_or_alter_trigger}.
	 * @param ctx the parse tree
	 */
	void exitCreate_or_alter_trigger(TSqlParser.Create_or_alter_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_or_alter_dml_trigger}.
	 * @param ctx the parse tree
	 */
	void enterCreate_or_alter_dml_trigger(TSqlParser.Create_or_alter_dml_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_or_alter_dml_trigger}.
	 * @param ctx the parse tree
	 */
	void exitCreate_or_alter_dml_trigger(TSqlParser.Create_or_alter_dml_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#dml_trigger_option}.
	 * @param ctx the parse tree
	 */
	void enterDml_trigger_option(TSqlParser.Dml_trigger_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#dml_trigger_option}.
	 * @param ctx the parse tree
	 */
	void exitDml_trigger_option(TSqlParser.Dml_trigger_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#dml_trigger_operation}.
	 * @param ctx the parse tree
	 */
	void enterDml_trigger_operation(TSqlParser.Dml_trigger_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#dml_trigger_operation}.
	 * @param ctx the parse tree
	 */
	void exitDml_trigger_operation(TSqlParser.Dml_trigger_operationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_or_alter_ddl_trigger}.
	 * @param ctx the parse tree
	 */
	void enterCreate_or_alter_ddl_trigger(TSqlParser.Create_or_alter_ddl_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_or_alter_ddl_trigger}.
	 * @param ctx the parse tree
	 */
	void exitCreate_or_alter_ddl_trigger(TSqlParser.Create_or_alter_ddl_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#ddl_trigger_operation}.
	 * @param ctx the parse tree
	 */
	void enterDdl_trigger_operation(TSqlParser.Ddl_trigger_operationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#ddl_trigger_operation}.
	 * @param ctx the parse tree
	 */
	void exitDdl_trigger_operation(TSqlParser.Ddl_trigger_operationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_or_alter_function}.
	 * @param ctx the parse tree
	 */
	void enterCreate_or_alter_function(TSqlParser.Create_or_alter_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_or_alter_function}.
	 * @param ctx the parse tree
	 */
	void exitCreate_or_alter_function(TSqlParser.Create_or_alter_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#func_body_returns_select}.
	 * @param ctx the parse tree
	 */
	void enterFunc_body_returns_select(TSqlParser.Func_body_returns_selectContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#func_body_returns_select}.
	 * @param ctx the parse tree
	 */
	void exitFunc_body_returns_select(TSqlParser.Func_body_returns_selectContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#func_body_returns_table}.
	 * @param ctx the parse tree
	 */
	void enterFunc_body_returns_table(TSqlParser.Func_body_returns_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#func_body_returns_table}.
	 * @param ctx the parse tree
	 */
	void exitFunc_body_returns_table(TSqlParser.Func_body_returns_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#func_body_returns_scalar}.
	 * @param ctx the parse tree
	 */
	void enterFunc_body_returns_scalar(TSqlParser.Func_body_returns_scalarContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#func_body_returns_scalar}.
	 * @param ctx the parse tree
	 */
	void exitFunc_body_returns_scalar(TSqlParser.Func_body_returns_scalarContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#procedure_param}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_param(TSqlParser.Procedure_paramContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#procedure_param}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_param(TSqlParser.Procedure_paramContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#procedure_option}.
	 * @param ctx the parse tree
	 */
	void enterProcedure_option(TSqlParser.Procedure_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#procedure_option}.
	 * @param ctx the parse tree
	 */
	void exitProcedure_option(TSqlParser.Procedure_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#function_option}.
	 * @param ctx the parse tree
	 */
	void enterFunction_option(TSqlParser.Function_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#function_option}.
	 * @param ctx the parse tree
	 */
	void exitFunction_option(TSqlParser.Function_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_statistics}.
	 * @param ctx the parse tree
	 */
	void enterCreate_statistics(TSqlParser.Create_statisticsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_statistics}.
	 * @param ctx the parse tree
	 */
	void exitCreate_statistics(TSqlParser.Create_statisticsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#update_statistics}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_statistics(TSqlParser.Update_statisticsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#update_statistics}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_statistics(TSqlParser.Update_statisticsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_table}.
	 * @param ctx the parse tree
	 */
	void enterCreate_table(TSqlParser.Create_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_table}.
	 * @param ctx the parse tree
	 */
	void exitCreate_table(TSqlParser.Create_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#table_options}.
	 * @param ctx the parse tree
	 */
	void enterTable_options(TSqlParser.Table_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#table_options}.
	 * @param ctx the parse tree
	 */
	void exitTable_options(TSqlParser.Table_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_view}.
	 * @param ctx the parse tree
	 */
	void enterCreate_view(TSqlParser.Create_viewContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_view}.
	 * @param ctx the parse tree
	 */
	void exitCreate_view(TSqlParser.Create_viewContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#view_attribute}.
	 * @param ctx the parse tree
	 */
	void enterView_attribute(TSqlParser.View_attributeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#view_attribute}.
	 * @param ctx the parse tree
	 */
	void exitView_attribute(TSqlParser.View_attributeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_table}.
	 * @param ctx the parse tree
	 */
	void enterAlter_table(TSqlParser.Alter_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_table}.
	 * @param ctx the parse tree
	 */
	void exitAlter_table(TSqlParser.Alter_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_database}.
	 * @param ctx the parse tree
	 */
	void enterAlter_database(TSqlParser.Alter_databaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_database}.
	 * @param ctx the parse tree
	 */
	void exitAlter_database(TSqlParser.Alter_databaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#database_optionspec}.
	 * @param ctx the parse tree
	 */
	void enterDatabase_optionspec(TSqlParser.Database_optionspecContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#database_optionspec}.
	 * @param ctx the parse tree
	 */
	void exitDatabase_optionspec(TSqlParser.Database_optionspecContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#auto_option}.
	 * @param ctx the parse tree
	 */
	void enterAuto_option(TSqlParser.Auto_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#auto_option}.
	 * @param ctx the parse tree
	 */
	void exitAuto_option(TSqlParser.Auto_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#change_tracking_option}.
	 * @param ctx the parse tree
	 */
	void enterChange_tracking_option(TSqlParser.Change_tracking_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#change_tracking_option}.
	 * @param ctx the parse tree
	 */
	void exitChange_tracking_option(TSqlParser.Change_tracking_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#change_tracking_option_list}.
	 * @param ctx the parse tree
	 */
	void enterChange_tracking_option_list(TSqlParser.Change_tracking_option_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#change_tracking_option_list}.
	 * @param ctx the parse tree
	 */
	void exitChange_tracking_option_list(TSqlParser.Change_tracking_option_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#containment_option}.
	 * @param ctx the parse tree
	 */
	void enterContainment_option(TSqlParser.Containment_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#containment_option}.
	 * @param ctx the parse tree
	 */
	void exitContainment_option(TSqlParser.Containment_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#cursor_option}.
	 * @param ctx the parse tree
	 */
	void enterCursor_option(TSqlParser.Cursor_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#cursor_option}.
	 * @param ctx the parse tree
	 */
	void exitCursor_option(TSqlParser.Cursor_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#alter_endpoint}.
	 * @param ctx the parse tree
	 */
	void enterAlter_endpoint(TSqlParser.Alter_endpointContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#alter_endpoint}.
	 * @param ctx the parse tree
	 */
	void exitAlter_endpoint(TSqlParser.Alter_endpointContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#database_mirroring_option}.
	 * @param ctx the parse tree
	 */
	void enterDatabase_mirroring_option(TSqlParser.Database_mirroring_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#database_mirroring_option}.
	 * @param ctx the parse tree
	 */
	void exitDatabase_mirroring_option(TSqlParser.Database_mirroring_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#mirroring_set_option}.
	 * @param ctx the parse tree
	 */
	void enterMirroring_set_option(TSqlParser.Mirroring_set_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#mirroring_set_option}.
	 * @param ctx the parse tree
	 */
	void exitMirroring_set_option(TSqlParser.Mirroring_set_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#mirroring_partner}.
	 * @param ctx the parse tree
	 */
	void enterMirroring_partner(TSqlParser.Mirroring_partnerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#mirroring_partner}.
	 * @param ctx the parse tree
	 */
	void exitMirroring_partner(TSqlParser.Mirroring_partnerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#mirroring_witness}.
	 * @param ctx the parse tree
	 */
	void enterMirroring_witness(TSqlParser.Mirroring_witnessContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#mirroring_witness}.
	 * @param ctx the parse tree
	 */
	void exitMirroring_witness(TSqlParser.Mirroring_witnessContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#witness_partner_equal}.
	 * @param ctx the parse tree
	 */
	void enterWitness_partner_equal(TSqlParser.Witness_partner_equalContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#witness_partner_equal}.
	 * @param ctx the parse tree
	 */
	void exitWitness_partner_equal(TSqlParser.Witness_partner_equalContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#partner_option}.
	 * @param ctx the parse tree
	 */
	void enterPartner_option(TSqlParser.Partner_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#partner_option}.
	 * @param ctx the parse tree
	 */
	void exitPartner_option(TSqlParser.Partner_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#witness_option}.
	 * @param ctx the parse tree
	 */
	void enterWitness_option(TSqlParser.Witness_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#witness_option}.
	 * @param ctx the parse tree
	 */
	void exitWitness_option(TSqlParser.Witness_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#witness_server}.
	 * @param ctx the parse tree
	 */
	void enterWitness_server(TSqlParser.Witness_serverContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#witness_server}.
	 * @param ctx the parse tree
	 */
	void exitWitness_server(TSqlParser.Witness_serverContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#partner_server}.
	 * @param ctx the parse tree
	 */
	void enterPartner_server(TSqlParser.Partner_serverContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#partner_server}.
	 * @param ctx the parse tree
	 */
	void exitPartner_server(TSqlParser.Partner_serverContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#mirroring_host_port_seperator}.
	 * @param ctx the parse tree
	 */
	void enterMirroring_host_port_seperator(TSqlParser.Mirroring_host_port_seperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#mirroring_host_port_seperator}.
	 * @param ctx the parse tree
	 */
	void exitMirroring_host_port_seperator(TSqlParser.Mirroring_host_port_seperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#partner_server_tcp_prefix}.
	 * @param ctx the parse tree
	 */
	void enterPartner_server_tcp_prefix(TSqlParser.Partner_server_tcp_prefixContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#partner_server_tcp_prefix}.
	 * @param ctx the parse tree
	 */
	void exitPartner_server_tcp_prefix(TSqlParser.Partner_server_tcp_prefixContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#port_number}.
	 * @param ctx the parse tree
	 */
	void enterPort_number(TSqlParser.Port_numberContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#port_number}.
	 * @param ctx the parse tree
	 */
	void exitPort_number(TSqlParser.Port_numberContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#host}.
	 * @param ctx the parse tree
	 */
	void enterHost(TSqlParser.HostContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#host}.
	 * @param ctx the parse tree
	 */
	void exitHost(TSqlParser.HostContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#date_correlation_optimization_option}.
	 * @param ctx the parse tree
	 */
	void enterDate_correlation_optimization_option(TSqlParser.Date_correlation_optimization_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#date_correlation_optimization_option}.
	 * @param ctx the parse tree
	 */
	void exitDate_correlation_optimization_option(TSqlParser.Date_correlation_optimization_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#db_encryption_option}.
	 * @param ctx the parse tree
	 */
	void enterDb_encryption_option(TSqlParser.Db_encryption_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#db_encryption_option}.
	 * @param ctx the parse tree
	 */
	void exitDb_encryption_option(TSqlParser.Db_encryption_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#db_state_option}.
	 * @param ctx the parse tree
	 */
	void enterDb_state_option(TSqlParser.Db_state_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#db_state_option}.
	 * @param ctx the parse tree
	 */
	void exitDb_state_option(TSqlParser.Db_state_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#db_update_option}.
	 * @param ctx the parse tree
	 */
	void enterDb_update_option(TSqlParser.Db_update_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#db_update_option}.
	 * @param ctx the parse tree
	 */
	void exitDb_update_option(TSqlParser.Db_update_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#db_user_access_option}.
	 * @param ctx the parse tree
	 */
	void enterDb_user_access_option(TSqlParser.Db_user_access_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#db_user_access_option}.
	 * @param ctx the parse tree
	 */
	void exitDb_user_access_option(TSqlParser.Db_user_access_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#delayed_durability_option}.
	 * @param ctx the parse tree
	 */
	void enterDelayed_durability_option(TSqlParser.Delayed_durability_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#delayed_durability_option}.
	 * @param ctx the parse tree
	 */
	void exitDelayed_durability_option(TSqlParser.Delayed_durability_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#external_access_option}.
	 * @param ctx the parse tree
	 */
	void enterExternal_access_option(TSqlParser.External_access_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#external_access_option}.
	 * @param ctx the parse tree
	 */
	void exitExternal_access_option(TSqlParser.External_access_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#hadr_options}.
	 * @param ctx the parse tree
	 */
	void enterHadr_options(TSqlParser.Hadr_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#hadr_options}.
	 * @param ctx the parse tree
	 */
	void exitHadr_options(TSqlParser.Hadr_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#mixed_page_allocation_option}.
	 * @param ctx the parse tree
	 */
	void enterMixed_page_allocation_option(TSqlParser.Mixed_page_allocation_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#mixed_page_allocation_option}.
	 * @param ctx the parse tree
	 */
	void exitMixed_page_allocation_option(TSqlParser.Mixed_page_allocation_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#parameterization_option}.
	 * @param ctx the parse tree
	 */
	void enterParameterization_option(TSqlParser.Parameterization_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#parameterization_option}.
	 * @param ctx the parse tree
	 */
	void exitParameterization_option(TSqlParser.Parameterization_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#recovery_option}.
	 * @param ctx the parse tree
	 */
	void enterRecovery_option(TSqlParser.Recovery_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#recovery_option}.
	 * @param ctx the parse tree
	 */
	void exitRecovery_option(TSqlParser.Recovery_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#service_broker_option}.
	 * @param ctx the parse tree
	 */
	void enterService_broker_option(TSqlParser.Service_broker_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#service_broker_option}.
	 * @param ctx the parse tree
	 */
	void exitService_broker_option(TSqlParser.Service_broker_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#snapshot_option}.
	 * @param ctx the parse tree
	 */
	void enterSnapshot_option(TSqlParser.Snapshot_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#snapshot_option}.
	 * @param ctx the parse tree
	 */
	void exitSnapshot_option(TSqlParser.Snapshot_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#sql_option}.
	 * @param ctx the parse tree
	 */
	void enterSql_option(TSqlParser.Sql_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#sql_option}.
	 * @param ctx the parse tree
	 */
	void exitSql_option(TSqlParser.Sql_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#target_recovery_time_option}.
	 * @param ctx the parse tree
	 */
	void enterTarget_recovery_time_option(TSqlParser.Target_recovery_time_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#target_recovery_time_option}.
	 * @param ctx the parse tree
	 */
	void exitTarget_recovery_time_option(TSqlParser.Target_recovery_time_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#termination}.
	 * @param ctx the parse tree
	 */
	void enterTermination(TSqlParser.TerminationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#termination}.
	 * @param ctx the parse tree
	 */
	void exitTermination(TSqlParser.TerminationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_index}.
	 * @param ctx the parse tree
	 */
	void enterDrop_index(TSqlParser.Drop_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_index}.
	 * @param ctx the parse tree
	 */
	void exitDrop_index(TSqlParser.Drop_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_relational_or_xml_or_spatial_index}.
	 * @param ctx the parse tree
	 */
	void enterDrop_relational_or_xml_or_spatial_index(TSqlParser.Drop_relational_or_xml_or_spatial_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_relational_or_xml_or_spatial_index}.
	 * @param ctx the parse tree
	 */
	void exitDrop_relational_or_xml_or_spatial_index(TSqlParser.Drop_relational_or_xml_or_spatial_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_backward_compatible_index}.
	 * @param ctx the parse tree
	 */
	void enterDrop_backward_compatible_index(TSqlParser.Drop_backward_compatible_indexContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_backward_compatible_index}.
	 * @param ctx the parse tree
	 */
	void exitDrop_backward_compatible_index(TSqlParser.Drop_backward_compatible_indexContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_procedure}.
	 * @param ctx the parse tree
	 */
	void enterDrop_procedure(TSqlParser.Drop_procedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_procedure}.
	 * @param ctx the parse tree
	 */
	void exitDrop_procedure(TSqlParser.Drop_procedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_trigger}.
	 * @param ctx the parse tree
	 */
	void enterDrop_trigger(TSqlParser.Drop_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_trigger}.
	 * @param ctx the parse tree
	 */
	void exitDrop_trigger(TSqlParser.Drop_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_dml_trigger}.
	 * @param ctx the parse tree
	 */
	void enterDrop_dml_trigger(TSqlParser.Drop_dml_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_dml_trigger}.
	 * @param ctx the parse tree
	 */
	void exitDrop_dml_trigger(TSqlParser.Drop_dml_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_ddl_trigger}.
	 * @param ctx the parse tree
	 */
	void enterDrop_ddl_trigger(TSqlParser.Drop_ddl_triggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_ddl_trigger}.
	 * @param ctx the parse tree
	 */
	void exitDrop_ddl_trigger(TSqlParser.Drop_ddl_triggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_function}.
	 * @param ctx the parse tree
	 */
	void enterDrop_function(TSqlParser.Drop_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_function}.
	 * @param ctx the parse tree
	 */
	void exitDrop_function(TSqlParser.Drop_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_statistics}.
	 * @param ctx the parse tree
	 */
	void enterDrop_statistics(TSqlParser.Drop_statisticsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_statistics}.
	 * @param ctx the parse tree
	 */
	void exitDrop_statistics(TSqlParser.Drop_statisticsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_table}.
	 * @param ctx the parse tree
	 */
	void enterDrop_table(TSqlParser.Drop_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_table}.
	 * @param ctx the parse tree
	 */
	void exitDrop_table(TSqlParser.Drop_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_view}.
	 * @param ctx the parse tree
	 */
	void enterDrop_view(TSqlParser.Drop_viewContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_view}.
	 * @param ctx the parse tree
	 */
	void exitDrop_view(TSqlParser.Drop_viewContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_type}.
	 * @param ctx the parse tree
	 */
	void enterCreate_type(TSqlParser.Create_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_type}.
	 * @param ctx the parse tree
	 */
	void exitCreate_type(TSqlParser.Create_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#drop_type}.
	 * @param ctx the parse tree
	 */
	void enterDrop_type(TSqlParser.Drop_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#drop_type}.
	 * @param ctx the parse tree
	 */
	void exitDrop_type(TSqlParser.Drop_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#rowset_function_limited}.
	 * @param ctx the parse tree
	 */
	void enterRowset_function_limited(TSqlParser.Rowset_function_limitedContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#rowset_function_limited}.
	 * @param ctx the parse tree
	 */
	void exitRowset_function_limited(TSqlParser.Rowset_function_limitedContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#openquery}.
	 * @param ctx the parse tree
	 */
	void enterOpenquery(TSqlParser.OpenqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#openquery}.
	 * @param ctx the parse tree
	 */
	void exitOpenquery(TSqlParser.OpenqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#opendatasource}.
	 * @param ctx the parse tree
	 */
	void enterOpendatasource(TSqlParser.OpendatasourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#opendatasource}.
	 * @param ctx the parse tree
	 */
	void exitOpendatasource(TSqlParser.OpendatasourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#declare_statement}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_statement(TSqlParser.Declare_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#declare_statement}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_statement(TSqlParser.Declare_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#cursor_statement}.
	 * @param ctx the parse tree
	 */
	void enterCursor_statement(TSqlParser.Cursor_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#cursor_statement}.
	 * @param ctx the parse tree
	 */
	void exitCursor_statement(TSqlParser.Cursor_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#backup_database}.
	 * @param ctx the parse tree
	 */
	void enterBackup_database(TSqlParser.Backup_databaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#backup_database}.
	 * @param ctx the parse tree
	 */
	void exitBackup_database(TSqlParser.Backup_databaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#backup_log}.
	 * @param ctx the parse tree
	 */
	void enterBackup_log(TSqlParser.Backup_logContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#backup_log}.
	 * @param ctx the parse tree
	 */
	void exitBackup_log(TSqlParser.Backup_logContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#backup_certificate}.
	 * @param ctx the parse tree
	 */
	void enterBackup_certificate(TSqlParser.Backup_certificateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#backup_certificate}.
	 * @param ctx the parse tree
	 */
	void exitBackup_certificate(TSqlParser.Backup_certificateContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#backup_master_key}.
	 * @param ctx the parse tree
	 */
	void enterBackup_master_key(TSqlParser.Backup_master_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#backup_master_key}.
	 * @param ctx the parse tree
	 */
	void exitBackup_master_key(TSqlParser.Backup_master_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#backup_service_master_key}.
	 * @param ctx the parse tree
	 */
	void enterBackup_service_master_key(TSqlParser.Backup_service_master_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#backup_service_master_key}.
	 * @param ctx the parse tree
	 */
	void exitBackup_service_master_key(TSqlParser.Backup_service_master_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#kill_statement}.
	 * @param ctx the parse tree
	 */
	void enterKill_statement(TSqlParser.Kill_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#kill_statement}.
	 * @param ctx the parse tree
	 */
	void exitKill_statement(TSqlParser.Kill_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#kill_process}.
	 * @param ctx the parse tree
	 */
	void enterKill_process(TSqlParser.Kill_processContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#kill_process}.
	 * @param ctx the parse tree
	 */
	void exitKill_process(TSqlParser.Kill_processContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#kill_query_notification}.
	 * @param ctx the parse tree
	 */
	void enterKill_query_notification(TSqlParser.Kill_query_notificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#kill_query_notification}.
	 * @param ctx the parse tree
	 */
	void exitKill_query_notification(TSqlParser.Kill_query_notificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#kill_stats_job}.
	 * @param ctx the parse tree
	 */
	void enterKill_stats_job(TSqlParser.Kill_stats_jobContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#kill_stats_job}.
	 * @param ctx the parse tree
	 */
	void exitKill_stats_job(TSqlParser.Kill_stats_jobContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#execute_statement}.
	 * @param ctx the parse tree
	 */
	void enterExecute_statement(TSqlParser.Execute_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#execute_statement}.
	 * @param ctx the parse tree
	 */
	void exitExecute_statement(TSqlParser.Execute_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#execute_body}.
	 * @param ctx the parse tree
	 */
	void enterExecute_body(TSqlParser.Execute_bodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#execute_body}.
	 * @param ctx the parse tree
	 */
	void exitExecute_body(TSqlParser.Execute_bodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#execute_statement_arg}.
	 * @param ctx the parse tree
	 */
	void enterExecute_statement_arg(TSqlParser.Execute_statement_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#execute_statement_arg}.
	 * @param ctx the parse tree
	 */
	void exitExecute_statement_arg(TSqlParser.Execute_statement_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#execute_var_string}.
	 * @param ctx the parse tree
	 */
	void enterExecute_var_string(TSqlParser.Execute_var_stringContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#execute_var_string}.
	 * @param ctx the parse tree
	 */
	void exitExecute_var_string(TSqlParser.Execute_var_stringContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#security_statement}.
	 * @param ctx the parse tree
	 */
	void enterSecurity_statement(TSqlParser.Security_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#security_statement}.
	 * @param ctx the parse tree
	 */
	void exitSecurity_statement(TSqlParser.Security_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_certificate}.
	 * @param ctx the parse tree
	 */
	void enterCreate_certificate(TSqlParser.Create_certificateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_certificate}.
	 * @param ctx the parse tree
	 */
	void exitCreate_certificate(TSqlParser.Create_certificateContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#existing_keys}.
	 * @param ctx the parse tree
	 */
	void enterExisting_keys(TSqlParser.Existing_keysContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#existing_keys}.
	 * @param ctx the parse tree
	 */
	void exitExisting_keys(TSqlParser.Existing_keysContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#private_key_options}.
	 * @param ctx the parse tree
	 */
	void enterPrivate_key_options(TSqlParser.Private_key_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#private_key_options}.
	 * @param ctx the parse tree
	 */
	void exitPrivate_key_options(TSqlParser.Private_key_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#generate_new_keys}.
	 * @param ctx the parse tree
	 */
	void enterGenerate_new_keys(TSqlParser.Generate_new_keysContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#generate_new_keys}.
	 * @param ctx the parse tree
	 */
	void exitGenerate_new_keys(TSqlParser.Generate_new_keysContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#date_options}.
	 * @param ctx the parse tree
	 */
	void enterDate_options(TSqlParser.Date_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#date_options}.
	 * @param ctx the parse tree
	 */
	void exitDate_options(TSqlParser.Date_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#open_key}.
	 * @param ctx the parse tree
	 */
	void enterOpen_key(TSqlParser.Open_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#open_key}.
	 * @param ctx the parse tree
	 */
	void exitOpen_key(TSqlParser.Open_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#close_key}.
	 * @param ctx the parse tree
	 */
	void enterClose_key(TSqlParser.Close_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#close_key}.
	 * @param ctx the parse tree
	 */
	void exitClose_key(TSqlParser.Close_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_key}.
	 * @param ctx the parse tree
	 */
	void enterCreate_key(TSqlParser.Create_keyContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_key}.
	 * @param ctx the parse tree
	 */
	void exitCreate_key(TSqlParser.Create_keyContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#key_options}.
	 * @param ctx the parse tree
	 */
	void enterKey_options(TSqlParser.Key_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#key_options}.
	 * @param ctx the parse tree
	 */
	void exitKey_options(TSqlParser.Key_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#algorithm}.
	 * @param ctx the parse tree
	 */
	void enterAlgorithm(TSqlParser.AlgorithmContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#algorithm}.
	 * @param ctx the parse tree
	 */
	void exitAlgorithm(TSqlParser.AlgorithmContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#encryption_mechanism}.
	 * @param ctx the parse tree
	 */
	void enterEncryption_mechanism(TSqlParser.Encryption_mechanismContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#encryption_mechanism}.
	 * @param ctx the parse tree
	 */
	void exitEncryption_mechanism(TSqlParser.Encryption_mechanismContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#decryption_mechanism}.
	 * @param ctx the parse tree
	 */
	void enterDecryption_mechanism(TSqlParser.Decryption_mechanismContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#decryption_mechanism}.
	 * @param ctx the parse tree
	 */
	void exitDecryption_mechanism(TSqlParser.Decryption_mechanismContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#grant_permission}.
	 * @param ctx the parse tree
	 */
	void enterGrant_permission(TSqlParser.Grant_permissionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#grant_permission}.
	 * @param ctx the parse tree
	 */
	void exitGrant_permission(TSqlParser.Grant_permissionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#set_statement}.
	 * @param ctx the parse tree
	 */
	void enterSet_statement(TSqlParser.Set_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#set_statement}.
	 * @param ctx the parse tree
	 */
	void exitSet_statement(TSqlParser.Set_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#transaction_statement}.
	 * @param ctx the parse tree
	 */
	void enterTransaction_statement(TSqlParser.Transaction_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#transaction_statement}.
	 * @param ctx the parse tree
	 */
	void exitTransaction_statement(TSqlParser.Transaction_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#go_statement}.
	 * @param ctx the parse tree
	 */
	void enterGo_statement(TSqlParser.Go_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#go_statement}.
	 * @param ctx the parse tree
	 */
	void exitGo_statement(TSqlParser.Go_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#use_statement}.
	 * @param ctx the parse tree
	 */
	void enterUse_statement(TSqlParser.Use_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#use_statement}.
	 * @param ctx the parse tree
	 */
	void exitUse_statement(TSqlParser.Use_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#setuser_statement}.
	 * @param ctx the parse tree
	 */
	void enterSetuser_statement(TSqlParser.Setuser_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#setuser_statement}.
	 * @param ctx the parse tree
	 */
	void exitSetuser_statement(TSqlParser.Setuser_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#reconfigure_statement}.
	 * @param ctx the parse tree
	 */
	void enterReconfigure_statement(TSqlParser.Reconfigure_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#reconfigure_statement}.
	 * @param ctx the parse tree
	 */
	void exitReconfigure_statement(TSqlParser.Reconfigure_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#shutdown_statement}.
	 * @param ctx the parse tree
	 */
	void enterShutdown_statement(TSqlParser.Shutdown_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#shutdown_statement}.
	 * @param ctx the parse tree
	 */
	void exitShutdown_statement(TSqlParser.Shutdown_statementContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#dbcc_clause}.
	 * @param ctx the parse tree
	 */
	void enterDbcc_clause(TSqlParser.Dbcc_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#dbcc_clause}.
	 * @param ctx the parse tree
	 */
	void exitDbcc_clause(TSqlParser.Dbcc_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#dbcc_options}.
	 * @param ctx the parse tree
	 */
	void enterDbcc_options(TSqlParser.Dbcc_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#dbcc_options}.
	 * @param ctx the parse tree
	 */
	void exitDbcc_options(TSqlParser.Dbcc_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#execute_clause}.
	 * @param ctx the parse tree
	 */
	void enterExecute_clause(TSqlParser.Execute_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#execute_clause}.
	 * @param ctx the parse tree
	 */
	void exitExecute_clause(TSqlParser.Execute_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#declare_local}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_local(TSqlParser.Declare_localContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#declare_local}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_local(TSqlParser.Declare_localContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#table_type_definition}.
	 * @param ctx the parse tree
	 */
	void enterTable_type_definition(TSqlParser.Table_type_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#table_type_definition}.
	 * @param ctx the parse tree
	 */
	void exitTable_type_definition(TSqlParser.Table_type_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#xml_type_definition}.
	 * @param ctx the parse tree
	 */
	void enterXml_type_definition(TSqlParser.Xml_type_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#xml_type_definition}.
	 * @param ctx the parse tree
	 */
	void exitXml_type_definition(TSqlParser.Xml_type_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#xml_schema_collection}.
	 * @param ctx the parse tree
	 */
	void enterXml_schema_collection(TSqlParser.Xml_schema_collectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#xml_schema_collection}.
	 * @param ctx the parse tree
	 */
	void exitXml_schema_collection(TSqlParser.Xml_schema_collectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#column_def_table_constraints}.
	 * @param ctx the parse tree
	 */
	void enterColumn_def_table_constraints(TSqlParser.Column_def_table_constraintsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#column_def_table_constraints}.
	 * @param ctx the parse tree
	 */
	void exitColumn_def_table_constraints(TSqlParser.Column_def_table_constraintsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#column_def_table_constraint}.
	 * @param ctx the parse tree
	 */
	void enterColumn_def_table_constraint(TSqlParser.Column_def_table_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#column_def_table_constraint}.
	 * @param ctx the parse tree
	 */
	void exitColumn_def_table_constraint(TSqlParser.Column_def_table_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#column_definition}.
	 * @param ctx the parse tree
	 */
	void enterColumn_definition(TSqlParser.Column_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#column_definition}.
	 * @param ctx the parse tree
	 */
	void exitColumn_definition(TSqlParser.Column_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#materialized_column_definition}.
	 * @param ctx the parse tree
	 */
	void enterMaterialized_column_definition(TSqlParser.Materialized_column_definitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#materialized_column_definition}.
	 * @param ctx the parse tree
	 */
	void exitMaterialized_column_definition(TSqlParser.Materialized_column_definitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void enterColumn_constraint(TSqlParser.Column_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#column_constraint}.
	 * @param ctx the parse tree
	 */
	void exitColumn_constraint(TSqlParser.Column_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void enterTable_constraint(TSqlParser.Table_constraintContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#table_constraint}.
	 * @param ctx the parse tree
	 */
	void exitTable_constraint(TSqlParser.Table_constraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#on_delete}.
	 * @param ctx the parse tree
	 */
	void enterOn_delete(TSqlParser.On_deleteContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#on_delete}.
	 * @param ctx the parse tree
	 */
	void exitOn_delete(TSqlParser.On_deleteContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#on_update}.
	 * @param ctx the parse tree
	 */
	void enterOn_update(TSqlParser.On_updateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#on_update}.
	 * @param ctx the parse tree
	 */
	void exitOn_update(TSqlParser.On_updateContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#index_options}.
	 * @param ctx the parse tree
	 */
	void enterIndex_options(TSqlParser.Index_optionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#index_options}.
	 * @param ctx the parse tree
	 */
	void exitIndex_options(TSqlParser.Index_optionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#index_option}.
	 * @param ctx the parse tree
	 */
	void enterIndex_option(TSqlParser.Index_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#index_option}.
	 * @param ctx the parse tree
	 */
	void exitIndex_option(TSqlParser.Index_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#declare_cursor}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_cursor(TSqlParser.Declare_cursorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#declare_cursor}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_cursor(TSqlParser.Declare_cursorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#declare_set_cursor_common}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_set_cursor_common(TSqlParser.Declare_set_cursor_commonContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#declare_set_cursor_common}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_set_cursor_common(TSqlParser.Declare_set_cursor_commonContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#declare_set_cursor_common_partial}.
	 * @param ctx the parse tree
	 */
	void enterDeclare_set_cursor_common_partial(TSqlParser.Declare_set_cursor_common_partialContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#declare_set_cursor_common_partial}.
	 * @param ctx the parse tree
	 */
	void exitDeclare_set_cursor_common_partial(TSqlParser.Declare_set_cursor_common_partialContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#fetch_cursor}.
	 * @param ctx the parse tree
	 */
	void enterFetch_cursor(TSqlParser.Fetch_cursorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#fetch_cursor}.
	 * @param ctx the parse tree
	 */
	void exitFetch_cursor(TSqlParser.Fetch_cursorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#set_special}.
	 * @param ctx the parse tree
	 */
	void enterSet_special(TSqlParser.Set_specialContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#set_special}.
	 * @param ctx the parse tree
	 */
	void exitSet_special(TSqlParser.Set_specialContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#constant_LOCAL_ID}.
	 * @param ctx the parse tree
	 */
	void enterConstant_LOCAL_ID(TSqlParser.Constant_LOCAL_IDContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#constant_LOCAL_ID}.
	 * @param ctx the parse tree
	 */
	void exitConstant_LOCAL_ID(TSqlParser.Constant_LOCAL_IDContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(TSqlParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(TSqlParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#primitive_expression}.
	 * @param ctx the parse tree
	 */
	void enterPrimitive_expression(TSqlParser.Primitive_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#primitive_expression}.
	 * @param ctx the parse tree
	 */
	void exitPrimitive_expression(TSqlParser.Primitive_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#case_expression}.
	 * @param ctx the parse tree
	 */
	void enterCase_expression(TSqlParser.Case_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#case_expression}.
	 * @param ctx the parse tree
	 */
	void exitCase_expression(TSqlParser.Case_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#unary_operator_expression}.
	 * @param ctx the parse tree
	 */
	void enterUnary_operator_expression(TSqlParser.Unary_operator_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#unary_operator_expression}.
	 * @param ctx the parse tree
	 */
	void exitUnary_operator_expression(TSqlParser.Unary_operator_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#bracket_expression}.
	 * @param ctx the parse tree
	 */
	void enterBracket_expression(TSqlParser.Bracket_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#bracket_expression}.
	 * @param ctx the parse tree
	 */
	void exitBracket_expression(TSqlParser.Bracket_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void enterConstant_expression(TSqlParser.Constant_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#constant_expression}.
	 * @param ctx the parse tree
	 */
	void exitConstant_expression(TSqlParser.Constant_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#subquery}.
	 * @param ctx the parse tree
	 */
	void enterSubquery(TSqlParser.SubqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#subquery}.
	 * @param ctx the parse tree
	 */
	void exitSubquery(TSqlParser.SubqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#with_expression}.
	 * @param ctx the parse tree
	 */
	void enterWith_expression(TSqlParser.With_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#with_expression}.
	 * @param ctx the parse tree
	 */
	void exitWith_expression(TSqlParser.With_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#common_table_expression}.
	 * @param ctx the parse tree
	 */
	void enterCommon_table_expression(TSqlParser.Common_table_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#common_table_expression}.
	 * @param ctx the parse tree
	 */
	void exitCommon_table_expression(TSqlParser.Common_table_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#update_elem}.
	 * @param ctx the parse tree
	 */
	void enterUpdate_elem(TSqlParser.Update_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#update_elem}.
	 * @param ctx the parse tree
	 */
	void exitUpdate_elem(TSqlParser.Update_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#search_condition_list}.
	 * @param ctx the parse tree
	 */
	void enterSearch_condition_list(TSqlParser.Search_condition_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#search_condition_list}.
	 * @param ctx the parse tree
	 */
	void exitSearch_condition_list(TSqlParser.Search_condition_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#search_condition}.
	 * @param ctx the parse tree
	 */
	void enterSearch_condition(TSqlParser.Search_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#search_condition}.
	 * @param ctx the parse tree
	 */
	void exitSearch_condition(TSqlParser.Search_conditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#search_condition_and}.
	 * @param ctx the parse tree
	 */
	void enterSearch_condition_and(TSqlParser.Search_condition_andContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#search_condition_and}.
	 * @param ctx the parse tree
	 */
	void exitSearch_condition_and(TSqlParser.Search_condition_andContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#search_condition_not}.
	 * @param ctx the parse tree
	 */
	void enterSearch_condition_not(TSqlParser.Search_condition_notContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#search_condition_not}.
	 * @param ctx the parse tree
	 */
	void exitSearch_condition_not(TSqlParser.Search_condition_notContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(TSqlParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(TSqlParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#query_expression}.
	 * @param ctx the parse tree
	 */
	void enterQuery_expression(TSqlParser.Query_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#query_expression}.
	 * @param ctx the parse tree
	 */
	void exitQuery_expression(TSqlParser.Query_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#sql_union}.
	 * @param ctx the parse tree
	 */
	void enterSql_union(TSqlParser.Sql_unionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#sql_union}.
	 * @param ctx the parse tree
	 */
	void exitSql_union(TSqlParser.Sql_unionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#query_specification}.
	 * @param ctx the parse tree
	 */
	void enterQuery_specification(TSqlParser.Query_specificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#query_specification}.
	 * @param ctx the parse tree
	 */
	void exitQuery_specification(TSqlParser.Query_specificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#top_clause}.
	 * @param ctx the parse tree
	 */
	void enterTop_clause(TSqlParser.Top_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#top_clause}.
	 * @param ctx the parse tree
	 */
	void exitTop_clause(TSqlParser.Top_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#top_percent}.
	 * @param ctx the parse tree
	 */
	void enterTop_percent(TSqlParser.Top_percentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#top_percent}.
	 * @param ctx the parse tree
	 */
	void exitTop_percent(TSqlParser.Top_percentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#top_count}.
	 * @param ctx the parse tree
	 */
	void enterTop_count(TSqlParser.Top_countContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#top_count}.
	 * @param ctx the parse tree
	 */
	void exitTop_count(TSqlParser.Top_countContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#order_by_clause}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by_clause(TSqlParser.Order_by_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#order_by_clause}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by_clause(TSqlParser.Order_by_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#for_clause}.
	 * @param ctx the parse tree
	 */
	void enterFor_clause(TSqlParser.For_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#for_clause}.
	 * @param ctx the parse tree
	 */
	void exitFor_clause(TSqlParser.For_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#xml_common_directives}.
	 * @param ctx the parse tree
	 */
	void enterXml_common_directives(TSqlParser.Xml_common_directivesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#xml_common_directives}.
	 * @param ctx the parse tree
	 */
	void exitXml_common_directives(TSqlParser.Xml_common_directivesContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#order_by_expression}.
	 * @param ctx the parse tree
	 */
	void enterOrder_by_expression(TSqlParser.Order_by_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#order_by_expression}.
	 * @param ctx the parse tree
	 */
	void exitOrder_by_expression(TSqlParser.Order_by_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#group_by_item}.
	 * @param ctx the parse tree
	 */
	void enterGroup_by_item(TSqlParser.Group_by_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#group_by_item}.
	 * @param ctx the parse tree
	 */
	void exitGroup_by_item(TSqlParser.Group_by_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#option_clause}.
	 * @param ctx the parse tree
	 */
	void enterOption_clause(TSqlParser.Option_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#option_clause}.
	 * @param ctx the parse tree
	 */
	void exitOption_clause(TSqlParser.Option_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#option}.
	 * @param ctx the parse tree
	 */
	void enterOption(TSqlParser.OptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#option}.
	 * @param ctx the parse tree
	 */
	void exitOption(TSqlParser.OptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#optimize_for_arg}.
	 * @param ctx the parse tree
	 */
	void enterOptimize_for_arg(TSqlParser.Optimize_for_argContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#optimize_for_arg}.
	 * @param ctx the parse tree
	 */
	void exitOptimize_for_arg(TSqlParser.Optimize_for_argContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#select_list}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list(TSqlParser.Select_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#select_list}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list(TSqlParser.Select_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#udt_method_arguments}.
	 * @param ctx the parse tree
	 */
	void enterUdt_method_arguments(TSqlParser.Udt_method_argumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#udt_method_arguments}.
	 * @param ctx the parse tree
	 */
	void exitUdt_method_arguments(TSqlParser.Udt_method_argumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#asterisk}.
	 * @param ctx the parse tree
	 */
	void enterAsterisk(TSqlParser.AsteriskContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#asterisk}.
	 * @param ctx the parse tree
	 */
	void exitAsterisk(TSqlParser.AsteriskContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#column_elem}.
	 * @param ctx the parse tree
	 */
	void enterColumn_elem(TSqlParser.Column_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#column_elem}.
	 * @param ctx the parse tree
	 */
	void exitColumn_elem(TSqlParser.Column_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#udt_elem}.
	 * @param ctx the parse tree
	 */
	void enterUdt_elem(TSqlParser.Udt_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#udt_elem}.
	 * @param ctx the parse tree
	 */
	void exitUdt_elem(TSqlParser.Udt_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#expression_elem}.
	 * @param ctx the parse tree
	 */
	void enterExpression_elem(TSqlParser.Expression_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#expression_elem}.
	 * @param ctx the parse tree
	 */
	void exitExpression_elem(TSqlParser.Expression_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#select_list_elem}.
	 * @param ctx the parse tree
	 */
	void enterSelect_list_elem(TSqlParser.Select_list_elemContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#select_list_elem}.
	 * @param ctx the parse tree
	 */
	void exitSelect_list_elem(TSqlParser.Select_list_elemContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#table_sources}.
	 * @param ctx the parse tree
	 */
	void enterTable_sources(TSqlParser.Table_sourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#table_sources}.
	 * @param ctx the parse tree
	 */
	void exitTable_sources(TSqlParser.Table_sourcesContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#table_source}.
	 * @param ctx the parse tree
	 */
	void enterTable_source(TSqlParser.Table_sourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#table_source}.
	 * @param ctx the parse tree
	 */
	void exitTable_source(TSqlParser.Table_sourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#table_source_item_joined}.
	 * @param ctx the parse tree
	 */
	void enterTable_source_item_joined(TSqlParser.Table_source_item_joinedContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#table_source_item_joined}.
	 * @param ctx the parse tree
	 */
	void exitTable_source_item_joined(TSqlParser.Table_source_item_joinedContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#table_source_item}.
	 * @param ctx the parse tree
	 */
	void enterTable_source_item(TSqlParser.Table_source_itemContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#table_source_item}.
	 * @param ctx the parse tree
	 */
	void exitTable_source_item(TSqlParser.Table_source_itemContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#open_xml}.
	 * @param ctx the parse tree
	 */
	void enterOpen_xml(TSqlParser.Open_xmlContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#open_xml}.
	 * @param ctx the parse tree
	 */
	void exitOpen_xml(TSqlParser.Open_xmlContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#schema_declaration}.
	 * @param ctx the parse tree
	 */
	void enterSchema_declaration(TSqlParser.Schema_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#schema_declaration}.
	 * @param ctx the parse tree
	 */
	void exitSchema_declaration(TSqlParser.Schema_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#column_declaration}.
	 * @param ctx the parse tree
	 */
	void enterColumn_declaration(TSqlParser.Column_declarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#column_declaration}.
	 * @param ctx the parse tree
	 */
	void exitColumn_declaration(TSqlParser.Column_declarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#change_table}.
	 * @param ctx the parse tree
	 */
	void enterChange_table(TSqlParser.Change_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#change_table}.
	 * @param ctx the parse tree
	 */
	void exitChange_table(TSqlParser.Change_tableContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#join_part}.
	 * @param ctx the parse tree
	 */
	void enterJoin_part(TSqlParser.Join_partContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#join_part}.
	 * @param ctx the parse tree
	 */
	void exitJoin_part(TSqlParser.Join_partContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#pivot_clause}.
	 * @param ctx the parse tree
	 */
	void enterPivot_clause(TSqlParser.Pivot_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#pivot_clause}.
	 * @param ctx the parse tree
	 */
	void exitPivot_clause(TSqlParser.Pivot_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#unpivot_clause}.
	 * @param ctx the parse tree
	 */
	void enterUnpivot_clause(TSqlParser.Unpivot_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#unpivot_clause}.
	 * @param ctx the parse tree
	 */
	void exitUnpivot_clause(TSqlParser.Unpivot_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#full_column_name_list}.
	 * @param ctx the parse tree
	 */
	void enterFull_column_name_list(TSqlParser.Full_column_name_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#full_column_name_list}.
	 * @param ctx the parse tree
	 */
	void exitFull_column_name_list(TSqlParser.Full_column_name_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#table_name_with_hint}.
	 * @param ctx the parse tree
	 */
	void enterTable_name_with_hint(TSqlParser.Table_name_with_hintContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#table_name_with_hint}.
	 * @param ctx the parse tree
	 */
	void exitTable_name_with_hint(TSqlParser.Table_name_with_hintContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#rowset_function}.
	 * @param ctx the parse tree
	 */
	void enterRowset_function(TSqlParser.Rowset_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#rowset_function}.
	 * @param ctx the parse tree
	 */
	void exitRowset_function(TSqlParser.Rowset_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#bulk_option}.
	 * @param ctx the parse tree
	 */
	void enterBulk_option(TSqlParser.Bulk_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#bulk_option}.
	 * @param ctx the parse tree
	 */
	void exitBulk_option(TSqlParser.Bulk_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#derived_table}.
	 * @param ctx the parse tree
	 */
	void enterDerived_table(TSqlParser.Derived_tableContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#derived_table}.
	 * @param ctx the parse tree
	 */
	void exitDerived_table(TSqlParser.Derived_tableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code BINARY_CHECKSUM}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterBINARY_CHECKSUM(TSqlParser.BINARY_CHECKSUMContext ctx);
	/**
	 * Exit a parse tree produced by the {@code BINARY_CHECKSUM}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitBINARY_CHECKSUM(TSqlParser.BINARY_CHECKSUMContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CAST}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterCAST(TSqlParser.CASTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CAST}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitCAST(TSqlParser.CASTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CONVERT}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterCONVERT(TSqlParser.CONVERTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CONVERT}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitCONVERT(TSqlParser.CONVERTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CHECKSUM}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterCHECKSUM(TSqlParser.CHECKSUMContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CHECKSUM}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitCHECKSUM(TSqlParser.CHECKSUMContext ctx);
	/**
	 * Enter a parse tree produced by the {@code COALESCE}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterCOALESCE(TSqlParser.COALESCEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code COALESCE}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitCOALESCE(TSqlParser.COALESCEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CURRENT_TIMESTAMP}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterCURRENT_TIMESTAMP(TSqlParser.CURRENT_TIMESTAMPContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CURRENT_TIMESTAMP}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitCURRENT_TIMESTAMP(TSqlParser.CURRENT_TIMESTAMPContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CURRENT_USER}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterCURRENT_USER(TSqlParser.CURRENT_USERContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CURRENT_USER}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitCURRENT_USER(TSqlParser.CURRENT_USERContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DATEADD}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterDATEADD(TSqlParser.DATEADDContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DATEADD}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitDATEADD(TSqlParser.DATEADDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DATEDIFF}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterDATEDIFF(TSqlParser.DATEDIFFContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DATEDIFF}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitDATEDIFF(TSqlParser.DATEDIFFContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DATENAME}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterDATENAME(TSqlParser.DATENAMEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DATENAME}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitDATENAME(TSqlParser.DATENAMEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DATEPART}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterDATEPART(TSqlParser.DATEPARTContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DATEPART}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitDATEPART(TSqlParser.DATEPARTContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GETDATE}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterGETDATE(TSqlParser.GETDATEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GETDATE}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitGETDATE(TSqlParser.GETDATEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code GETUTCDATE}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterGETUTCDATE(TSqlParser.GETUTCDATEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code GETUTCDATE}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitGETUTCDATE(TSqlParser.GETUTCDATEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IDENTITY}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterIDENTITY(TSqlParser.IDENTITYContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IDENTITY}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitIDENTITY(TSqlParser.IDENTITYContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MIN_ACTIVE_ROWVERSION}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterMIN_ACTIVE_ROWVERSION(TSqlParser.MIN_ACTIVE_ROWVERSIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MIN_ACTIVE_ROWVERSION}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitMIN_ACTIVE_ROWVERSION(TSqlParser.MIN_ACTIVE_ROWVERSIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code NULLIF}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterNULLIF(TSqlParser.NULLIFContext ctx);
	/**
	 * Exit a parse tree produced by the {@code NULLIF}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitNULLIF(TSqlParser.NULLIFContext ctx);
	/**
	 * Enter a parse tree produced by the {@code STUFF}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterSTUFF(TSqlParser.STUFFContext ctx);
	/**
	 * Exit a parse tree produced by the {@code STUFF}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitSTUFF(TSqlParser.STUFFContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SESSION_USER}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterSESSION_USER(TSqlParser.SESSION_USERContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SESSION_USER}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitSESSION_USER(TSqlParser.SESSION_USERContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SYSTEM_USER}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterSYSTEM_USER(TSqlParser.SYSTEM_USERContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SYSTEM_USER}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitSYSTEM_USER(TSqlParser.SYSTEM_USERContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ISNULL}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterISNULL(TSqlParser.ISNULLContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ISNULL}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitISNULL(TSqlParser.ISNULLContext ctx);
	/**
	 * Enter a parse tree produced by the {@code XML_DATA_TYPE_FUNC}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterXML_DATA_TYPE_FUNC(TSqlParser.XML_DATA_TYPE_FUNCContext ctx);
	/**
	 * Exit a parse tree produced by the {@code XML_DATA_TYPE_FUNC}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitXML_DATA_TYPE_FUNC(TSqlParser.XML_DATA_TYPE_FUNCContext ctx);
	/**
	 * Enter a parse tree produced by the {@code IFF}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterIFF(TSqlParser.IFFContext ctx);
	/**
	 * Exit a parse tree produced by the {@code IFF}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitIFF(TSqlParser.IFFContext ctx);
	/**
	 * Enter a parse tree produced by the {@code RANKING_WINDOWED_FUNC}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterRANKING_WINDOWED_FUNC(TSqlParser.RANKING_WINDOWED_FUNCContext ctx);
	/**
	 * Exit a parse tree produced by the {@code RANKING_WINDOWED_FUNC}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitRANKING_WINDOWED_FUNC(TSqlParser.RANKING_WINDOWED_FUNCContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AGGREGATE_WINDOWED_FUNC}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterAGGREGATE_WINDOWED_FUNC(TSqlParser.AGGREGATE_WINDOWED_FUNCContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AGGREGATE_WINDOWED_FUNC}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitAGGREGATE_WINDOWED_FUNC(TSqlParser.AGGREGATE_WINDOWED_FUNCContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ANALYTIC_WINDOWED_FUNC}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterANALYTIC_WINDOWED_FUNC(TSqlParser.ANALYTIC_WINDOWED_FUNCContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ANALYTIC_WINDOWED_FUNC}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitANALYTIC_WINDOWED_FUNC(TSqlParser.ANALYTIC_WINDOWED_FUNCContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SCALAR_FUNCTION}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterSCALAR_FUNCTION(TSqlParser.SCALAR_FUNCTIONContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SCALAR_FUNCTION}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitSCALAR_FUNCTION(TSqlParser.SCALAR_FUNCTIONContext ctx);
	/**
	 * Enter a parse tree produced by the {@code STRINGAGG}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterSTRINGAGG(TSqlParser.STRINGAGGContext ctx);
	/**
	 * Exit a parse tree produced by the {@code STRINGAGG}
	 * labeled alternative in {@link TSqlParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitSTRINGAGG(TSqlParser.STRINGAGGContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#xml_data_type_methods}.
	 * @param ctx the parse tree
	 */
	void enterXml_data_type_methods(TSqlParser.Xml_data_type_methodsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#xml_data_type_methods}.
	 * @param ctx the parse tree
	 */
	void exitXml_data_type_methods(TSqlParser.Xml_data_type_methodsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#value_method}.
	 * @param ctx the parse tree
	 */
	void enterValue_method(TSqlParser.Value_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#value_method}.
	 * @param ctx the parse tree
	 */
	void exitValue_method(TSqlParser.Value_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#query_method}.
	 * @param ctx the parse tree
	 */
	void enterQuery_method(TSqlParser.Query_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#query_method}.
	 * @param ctx the parse tree
	 */
	void exitQuery_method(TSqlParser.Query_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#exist_method}.
	 * @param ctx the parse tree
	 */
	void enterExist_method(TSqlParser.Exist_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#exist_method}.
	 * @param ctx the parse tree
	 */
	void exitExist_method(TSqlParser.Exist_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#modify_method}.
	 * @param ctx the parse tree
	 */
	void enterModify_method(TSqlParser.Modify_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#modify_method}.
	 * @param ctx the parse tree
	 */
	void exitModify_method(TSqlParser.Modify_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#nodes_method}.
	 * @param ctx the parse tree
	 */
	void enterNodes_method(TSqlParser.Nodes_methodContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#nodes_method}.
	 * @param ctx the parse tree
	 */
	void exitNodes_method(TSqlParser.Nodes_methodContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#switch_section}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_section(TSqlParser.Switch_sectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#switch_section}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_section(TSqlParser.Switch_sectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#switch_search_condition_section}.
	 * @param ctx the parse tree
	 */
	void enterSwitch_search_condition_section(TSqlParser.Switch_search_condition_sectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#switch_search_condition_section}.
	 * @param ctx the parse tree
	 */
	void exitSwitch_search_condition_section(TSqlParser.Switch_search_condition_sectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#as_column_alias}.
	 * @param ctx the parse tree
	 */
	void enterAs_column_alias(TSqlParser.As_column_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#as_column_alias}.
	 * @param ctx the parse tree
	 */
	void exitAs_column_alias(TSqlParser.As_column_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#as_table_alias}.
	 * @param ctx the parse tree
	 */
	void enterAs_table_alias(TSqlParser.As_table_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#as_table_alias}.
	 * @param ctx the parse tree
	 */
	void exitAs_table_alias(TSqlParser.As_table_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void enterTable_alias(TSqlParser.Table_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#table_alias}.
	 * @param ctx the parse tree
	 */
	void exitTable_alias(TSqlParser.Table_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#with_table_hints}.
	 * @param ctx the parse tree
	 */
	void enterWith_table_hints(TSqlParser.With_table_hintsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#with_table_hints}.
	 * @param ctx the parse tree
	 */
	void exitWith_table_hints(TSqlParser.With_table_hintsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#insert_with_table_hints}.
	 * @param ctx the parse tree
	 */
	void enterInsert_with_table_hints(TSqlParser.Insert_with_table_hintsContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#insert_with_table_hints}.
	 * @param ctx the parse tree
	 */
	void exitInsert_with_table_hints(TSqlParser.Insert_with_table_hintsContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#table_hint}.
	 * @param ctx the parse tree
	 */
	void enterTable_hint(TSqlParser.Table_hintContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#table_hint}.
	 * @param ctx the parse tree
	 */
	void exitTable_hint(TSqlParser.Table_hintContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#index_value}.
	 * @param ctx the parse tree
	 */
	void enterIndex_value(TSqlParser.Index_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#index_value}.
	 * @param ctx the parse tree
	 */
	void exitIndex_value(TSqlParser.Index_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#column_alias_list}.
	 * @param ctx the parse tree
	 */
	void enterColumn_alias_list(TSqlParser.Column_alias_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#column_alias_list}.
	 * @param ctx the parse tree
	 */
	void exitColumn_alias_list(TSqlParser.Column_alias_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void enterColumn_alias(TSqlParser.Column_aliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#column_alias}.
	 * @param ctx the parse tree
	 */
	void exitColumn_alias(TSqlParser.Column_aliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#table_value_constructor}.
	 * @param ctx the parse tree
	 */
	void enterTable_value_constructor(TSqlParser.Table_value_constructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#table_value_constructor}.
	 * @param ctx the parse tree
	 */
	void exitTable_value_constructor(TSqlParser.Table_value_constructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void enterExpression_list(TSqlParser.Expression_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#expression_list}.
	 * @param ctx the parse tree
	 */
	void exitExpression_list(TSqlParser.Expression_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#ranking_windowed_function}.
	 * @param ctx the parse tree
	 */
	void enterRanking_windowed_function(TSqlParser.Ranking_windowed_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#ranking_windowed_function}.
	 * @param ctx the parse tree
	 */
	void exitRanking_windowed_function(TSqlParser.Ranking_windowed_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#aggregate_windowed_function}.
	 * @param ctx the parse tree
	 */
	void enterAggregate_windowed_function(TSqlParser.Aggregate_windowed_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#aggregate_windowed_function}.
	 * @param ctx the parse tree
	 */
	void exitAggregate_windowed_function(TSqlParser.Aggregate_windowed_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#analytic_windowed_function}.
	 * @param ctx the parse tree
	 */
	void enterAnalytic_windowed_function(TSqlParser.Analytic_windowed_functionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#analytic_windowed_function}.
	 * @param ctx the parse tree
	 */
	void exitAnalytic_windowed_function(TSqlParser.Analytic_windowed_functionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#all_distinct_expression}.
	 * @param ctx the parse tree
	 */
	void enterAll_distinct_expression(TSqlParser.All_distinct_expressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#all_distinct_expression}.
	 * @param ctx the parse tree
	 */
	void exitAll_distinct_expression(TSqlParser.All_distinct_expressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#over_clause}.
	 * @param ctx the parse tree
	 */
	void enterOver_clause(TSqlParser.Over_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#over_clause}.
	 * @param ctx the parse tree
	 */
	void exitOver_clause(TSqlParser.Over_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#row_or_range_clause}.
	 * @param ctx the parse tree
	 */
	void enterRow_or_range_clause(TSqlParser.Row_or_range_clauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#row_or_range_clause}.
	 * @param ctx the parse tree
	 */
	void exitRow_or_range_clause(TSqlParser.Row_or_range_clauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#window_frame_extent}.
	 * @param ctx the parse tree
	 */
	void enterWindow_frame_extent(TSqlParser.Window_frame_extentContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#window_frame_extent}.
	 * @param ctx the parse tree
	 */
	void exitWindow_frame_extent(TSqlParser.Window_frame_extentContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#window_frame_bound}.
	 * @param ctx the parse tree
	 */
	void enterWindow_frame_bound(TSqlParser.Window_frame_boundContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#window_frame_bound}.
	 * @param ctx the parse tree
	 */
	void exitWindow_frame_bound(TSqlParser.Window_frame_boundContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#window_frame_preceding}.
	 * @param ctx the parse tree
	 */
	void enterWindow_frame_preceding(TSqlParser.Window_frame_precedingContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#window_frame_preceding}.
	 * @param ctx the parse tree
	 */
	void exitWindow_frame_preceding(TSqlParser.Window_frame_precedingContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#window_frame_following}.
	 * @param ctx the parse tree
	 */
	void enterWindow_frame_following(TSqlParser.Window_frame_followingContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#window_frame_following}.
	 * @param ctx the parse tree
	 */
	void exitWindow_frame_following(TSqlParser.Window_frame_followingContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#create_database_option}.
	 * @param ctx the parse tree
	 */
	void enterCreate_database_option(TSqlParser.Create_database_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#create_database_option}.
	 * @param ctx the parse tree
	 */
	void exitCreate_database_option(TSqlParser.Create_database_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#database_filestream_option}.
	 * @param ctx the parse tree
	 */
	void enterDatabase_filestream_option(TSqlParser.Database_filestream_optionContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#database_filestream_option}.
	 * @param ctx the parse tree
	 */
	void exitDatabase_filestream_option(TSqlParser.Database_filestream_optionContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#database_file_spec}.
	 * @param ctx the parse tree
	 */
	void enterDatabase_file_spec(TSqlParser.Database_file_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#database_file_spec}.
	 * @param ctx the parse tree
	 */
	void exitDatabase_file_spec(TSqlParser.Database_file_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#file_group}.
	 * @param ctx the parse tree
	 */
	void enterFile_group(TSqlParser.File_groupContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#file_group}.
	 * @param ctx the parse tree
	 */
	void exitFile_group(TSqlParser.File_groupContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#file_spec}.
	 * @param ctx the parse tree
	 */
	void enterFile_spec(TSqlParser.File_specContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#file_spec}.
	 * @param ctx the parse tree
	 */
	void exitFile_spec(TSqlParser.File_specContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#entity_name}.
	 * @param ctx the parse tree
	 */
	void enterEntity_name(TSqlParser.Entity_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#entity_name}.
	 * @param ctx the parse tree
	 */
	void exitEntity_name(TSqlParser.Entity_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#entity_name_for_azure_dw}.
	 * @param ctx the parse tree
	 */
	void enterEntity_name_for_azure_dw(TSqlParser.Entity_name_for_azure_dwContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#entity_name_for_azure_dw}.
	 * @param ctx the parse tree
	 */
	void exitEntity_name_for_azure_dw(TSqlParser.Entity_name_for_azure_dwContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#entity_name_for_parallel_dw}.
	 * @param ctx the parse tree
	 */
	void enterEntity_name_for_parallel_dw(TSqlParser.Entity_name_for_parallel_dwContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#entity_name_for_parallel_dw}.
	 * @param ctx the parse tree
	 */
	void exitEntity_name_for_parallel_dw(TSqlParser.Entity_name_for_parallel_dwContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#full_table_name}.
	 * @param ctx the parse tree
	 */
	void enterFull_table_name(TSqlParser.Full_table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#full_table_name}.
	 * @param ctx the parse tree
	 */
	void exitFull_table_name(TSqlParser.Full_table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#table_name}.
	 * @param ctx the parse tree
	 */
	void enterTable_name(TSqlParser.Table_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#table_name}.
	 * @param ctx the parse tree
	 */
	void exitTable_name(TSqlParser.Table_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#simple_name}.
	 * @param ctx the parse tree
	 */
	void enterSimple_name(TSqlParser.Simple_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#simple_name}.
	 * @param ctx the parse tree
	 */
	void exitSimple_name(TSqlParser.Simple_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#func_proc_name_schema}.
	 * @param ctx the parse tree
	 */
	void enterFunc_proc_name_schema(TSqlParser.Func_proc_name_schemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#func_proc_name_schema}.
	 * @param ctx the parse tree
	 */
	void exitFunc_proc_name_schema(TSqlParser.Func_proc_name_schemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#func_proc_name_database_schema}.
	 * @param ctx the parse tree
	 */
	void enterFunc_proc_name_database_schema(TSqlParser.Func_proc_name_database_schemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#func_proc_name_database_schema}.
	 * @param ctx the parse tree
	 */
	void exitFunc_proc_name_database_schema(TSqlParser.Func_proc_name_database_schemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#func_proc_name_server_database_schema}.
	 * @param ctx the parse tree
	 */
	void enterFunc_proc_name_server_database_schema(TSqlParser.Func_proc_name_server_database_schemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#func_proc_name_server_database_schema}.
	 * @param ctx the parse tree
	 */
	void exitFunc_proc_name_server_database_schema(TSqlParser.Func_proc_name_server_database_schemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#ddl_object}.
	 * @param ctx the parse tree
	 */
	void enterDdl_object(TSqlParser.Ddl_objectContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#ddl_object}.
	 * @param ctx the parse tree
	 */
	void exitDdl_object(TSqlParser.Ddl_objectContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#full_column_name}.
	 * @param ctx the parse tree
	 */
	void enterFull_column_name(TSqlParser.Full_column_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#full_column_name}.
	 * @param ctx the parse tree
	 */
	void exitFull_column_name(TSqlParser.Full_column_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#column_name_list_with_order}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name_list_with_order(TSqlParser.Column_name_list_with_orderContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#column_name_list_with_order}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name_list_with_order(TSqlParser.Column_name_list_with_orderContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#column_name_list}.
	 * @param ctx the parse tree
	 */
	void enterColumn_name_list(TSqlParser.Column_name_listContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#column_name_list}.
	 * @param ctx the parse tree
	 */
	void exitColumn_name_list(TSqlParser.Column_name_listContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#cursor_name}.
	 * @param ctx the parse tree
	 */
	void enterCursor_name(TSqlParser.Cursor_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#cursor_name}.
	 * @param ctx the parse tree
	 */
	void exitCursor_name(TSqlParser.Cursor_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#on_off}.
	 * @param ctx the parse tree
	 */
	void enterOn_off(TSqlParser.On_offContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#on_off}.
	 * @param ctx the parse tree
	 */
	void exitOn_off(TSqlParser.On_offContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#clustered}.
	 * @param ctx the parse tree
	 */
	void enterClustered(TSqlParser.ClusteredContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#clustered}.
	 * @param ctx the parse tree
	 */
	void exitClustered(TSqlParser.ClusteredContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#null_notnull}.
	 * @param ctx the parse tree
	 */
	void enterNull_notnull(TSqlParser.Null_notnullContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#null_notnull}.
	 * @param ctx the parse tree
	 */
	void exitNull_notnull(TSqlParser.Null_notnullContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#null_or_default}.
	 * @param ctx the parse tree
	 */
	void enterNull_or_default(TSqlParser.Null_or_defaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#null_or_default}.
	 * @param ctx the parse tree
	 */
	void exitNull_or_default(TSqlParser.Null_or_defaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#scalar_function_name}.
	 * @param ctx the parse tree
	 */
	void enterScalar_function_name(TSqlParser.Scalar_function_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#scalar_function_name}.
	 * @param ctx the parse tree
	 */
	void exitScalar_function_name(TSqlParser.Scalar_function_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#begin_conversation_timer}.
	 * @param ctx the parse tree
	 */
	void enterBegin_conversation_timer(TSqlParser.Begin_conversation_timerContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#begin_conversation_timer}.
	 * @param ctx the parse tree
	 */
	void exitBegin_conversation_timer(TSqlParser.Begin_conversation_timerContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#begin_conversation_dialog}.
	 * @param ctx the parse tree
	 */
	void enterBegin_conversation_dialog(TSqlParser.Begin_conversation_dialogContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#begin_conversation_dialog}.
	 * @param ctx the parse tree
	 */
	void exitBegin_conversation_dialog(TSqlParser.Begin_conversation_dialogContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#contract_name}.
	 * @param ctx the parse tree
	 */
	void enterContract_name(TSqlParser.Contract_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#contract_name}.
	 * @param ctx the parse tree
	 */
	void exitContract_name(TSqlParser.Contract_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#service_name}.
	 * @param ctx the parse tree
	 */
	void enterService_name(TSqlParser.Service_nameContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#service_name}.
	 * @param ctx the parse tree
	 */
	void exitService_name(TSqlParser.Service_nameContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#end_conversation}.
	 * @param ctx the parse tree
	 */
	void enterEnd_conversation(TSqlParser.End_conversationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#end_conversation}.
	 * @param ctx the parse tree
	 */
	void exitEnd_conversation(TSqlParser.End_conversationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#waitfor_conversation}.
	 * @param ctx the parse tree
	 */
	void enterWaitfor_conversation(TSqlParser.Waitfor_conversationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#waitfor_conversation}.
	 * @param ctx the parse tree
	 */
	void exitWaitfor_conversation(TSqlParser.Waitfor_conversationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#get_conversation}.
	 * @param ctx the parse tree
	 */
	void enterGet_conversation(TSqlParser.Get_conversationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#get_conversation}.
	 * @param ctx the parse tree
	 */
	void exitGet_conversation(TSqlParser.Get_conversationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#queue_id}.
	 * @param ctx the parse tree
	 */
	void enterQueue_id(TSqlParser.Queue_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#queue_id}.
	 * @param ctx the parse tree
	 */
	void exitQueue_id(TSqlParser.Queue_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#send_conversation}.
	 * @param ctx the parse tree
	 */
	void enterSend_conversation(TSqlParser.Send_conversationContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#send_conversation}.
	 * @param ctx the parse tree
	 */
	void exitSend_conversation(TSqlParser.Send_conversationContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#data_type}.
	 * @param ctx the parse tree
	 */
	void enterData_type(TSqlParser.Data_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#data_type}.
	 * @param ctx the parse tree
	 */
	void exitData_type(TSqlParser.Data_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#default_value}.
	 * @param ctx the parse tree
	 */
	void enterDefault_value(TSqlParser.Default_valueContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#default_value}.
	 * @param ctx the parse tree
	 */
	void exitDefault_value(TSqlParser.Default_valueContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(TSqlParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(TSqlParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(TSqlParser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(TSqlParser.SignContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#id}.
	 * @param ctx the parse tree
	 */
	void enterId(TSqlParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#id}.
	 * @param ctx the parse tree
	 */
	void exitId(TSqlParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#simple_id}.
	 * @param ctx the parse tree
	 */
	void enterSimple_id(TSqlParser.Simple_idContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#simple_id}.
	 * @param ctx the parse tree
	 */
	void exitSimple_id(TSqlParser.Simple_idContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#comparison_operator}.
	 * @param ctx the parse tree
	 */
	void enterComparison_operator(TSqlParser.Comparison_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#comparison_operator}.
	 * @param ctx the parse tree
	 */
	void exitComparison_operator(TSqlParser.Comparison_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void enterAssignment_operator(TSqlParser.Assignment_operatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#assignment_operator}.
	 * @param ctx the parse tree
	 */
	void exitAssignment_operator(TSqlParser.Assignment_operatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link TSqlParser#file_size}.
	 * @param ctx the parse tree
	 */
	void enterFile_size(TSqlParser.File_sizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link TSqlParser#file_size}.
	 * @param ctx the parse tree
	 */
	void exitFile_size(TSqlParser.File_sizeContext ctx);
}