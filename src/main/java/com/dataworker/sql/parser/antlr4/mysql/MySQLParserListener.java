// Generated from com/dataworker/sql/parser/antlr4/mysql/MySQLParser.g4 by ANTLR 4.7.1
package com.dataworker.sql.parser.antlr4.mysql;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MySQLParser}.
 */
public interface MySQLParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MySQLParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(MySQLParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(MySQLParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#sqlStatements}.
	 * @param ctx the parse tree
	 */
	void enterSqlStatements(MySQLParser.SqlStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#sqlStatements}.
	 * @param ctx the parse tree
	 */
	void exitSqlStatements(MySQLParser.SqlStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#sqlStatement}.
	 * @param ctx the parse tree
	 */
	void enterSqlStatement(MySQLParser.SqlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#sqlStatement}.
	 * @param ctx the parse tree
	 */
	void exitSqlStatement(MySQLParser.SqlStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(MySQLParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(MySQLParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#ddlStatement}.
	 * @param ctx the parse tree
	 */
	void enterDdlStatement(MySQLParser.DdlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#ddlStatement}.
	 * @param ctx the parse tree
	 */
	void exitDdlStatement(MySQLParser.DdlStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#dmlStatement}.
	 * @param ctx the parse tree
	 */
	void enterDmlStatement(MySQLParser.DmlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#dmlStatement}.
	 * @param ctx the parse tree
	 */
	void exitDmlStatement(MySQLParser.DmlStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#transactionStatement}.
	 * @param ctx the parse tree
	 */
	void enterTransactionStatement(MySQLParser.TransactionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#transactionStatement}.
	 * @param ctx the parse tree
	 */
	void exitTransactionStatement(MySQLParser.TransactionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#replicationStatement}.
	 * @param ctx the parse tree
	 */
	void enterReplicationStatement(MySQLParser.ReplicationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#replicationStatement}.
	 * @param ctx the parse tree
	 */
	void exitReplicationStatement(MySQLParser.ReplicationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#preparedStatement}.
	 * @param ctx the parse tree
	 */
	void enterPreparedStatement(MySQLParser.PreparedStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#preparedStatement}.
	 * @param ctx the parse tree
	 */
	void exitPreparedStatement(MySQLParser.PreparedStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(MySQLParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(MySQLParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#administrationStatement}.
	 * @param ctx the parse tree
	 */
	void enterAdministrationStatement(MySQLParser.AdministrationStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#administrationStatement}.
	 * @param ctx the parse tree
	 */
	void exitAdministrationStatement(MySQLParser.AdministrationStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#utilityStatement}.
	 * @param ctx the parse tree
	 */
	void enterUtilityStatement(MySQLParser.UtilityStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#utilityStatement}.
	 * @param ctx the parse tree
	 */
	void exitUtilityStatement(MySQLParser.UtilityStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#createDatabase}.
	 * @param ctx the parse tree
	 */
	void enterCreateDatabase(MySQLParser.CreateDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#createDatabase}.
	 * @param ctx the parse tree
	 */
	void exitCreateDatabase(MySQLParser.CreateDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#createEvent}.
	 * @param ctx the parse tree
	 */
	void enterCreateEvent(MySQLParser.CreateEventContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#createEvent}.
	 * @param ctx the parse tree
	 */
	void exitCreateEvent(MySQLParser.CreateEventContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#createIndex}.
	 * @param ctx the parse tree
	 */
	void enterCreateIndex(MySQLParser.CreateIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#createIndex}.
	 * @param ctx the parse tree
	 */
	void exitCreateIndex(MySQLParser.CreateIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#createLogfileGroup}.
	 * @param ctx the parse tree
	 */
	void enterCreateLogfileGroup(MySQLParser.CreateLogfileGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#createLogfileGroup}.
	 * @param ctx the parse tree
	 */
	void exitCreateLogfileGroup(MySQLParser.CreateLogfileGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#createProcedure}.
	 * @param ctx the parse tree
	 */
	void enterCreateProcedure(MySQLParser.CreateProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#createProcedure}.
	 * @param ctx the parse tree
	 */
	void exitCreateProcedure(MySQLParser.CreateProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#createFunction}.
	 * @param ctx the parse tree
	 */
	void enterCreateFunction(MySQLParser.CreateFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#createFunction}.
	 * @param ctx the parse tree
	 */
	void exitCreateFunction(MySQLParser.CreateFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#createServer}.
	 * @param ctx the parse tree
	 */
	void enterCreateServer(MySQLParser.CreateServerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#createServer}.
	 * @param ctx the parse tree
	 */
	void exitCreateServer(MySQLParser.CreateServerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code copyCreateTable}
	 * labeled alternative in {@link MySQLParser#createTable}.
	 * @param ctx the parse tree
	 */
	void enterCopyCreateTable(MySQLParser.CopyCreateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code copyCreateTable}
	 * labeled alternative in {@link MySQLParser#createTable}.
	 * @param ctx the parse tree
	 */
	void exitCopyCreateTable(MySQLParser.CopyCreateTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code queryCreateTable}
	 * labeled alternative in {@link MySQLParser#createTable}.
	 * @param ctx the parse tree
	 */
	void enterQueryCreateTable(MySQLParser.QueryCreateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code queryCreateTable}
	 * labeled alternative in {@link MySQLParser#createTable}.
	 * @param ctx the parse tree
	 */
	void exitQueryCreateTable(MySQLParser.QueryCreateTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code columnCreateTable}
	 * labeled alternative in {@link MySQLParser#createTable}.
	 * @param ctx the parse tree
	 */
	void enterColumnCreateTable(MySQLParser.ColumnCreateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code columnCreateTable}
	 * labeled alternative in {@link MySQLParser#createTable}.
	 * @param ctx the parse tree
	 */
	void exitColumnCreateTable(MySQLParser.ColumnCreateTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#createTablespaceInnodb}.
	 * @param ctx the parse tree
	 */
	void enterCreateTablespaceInnodb(MySQLParser.CreateTablespaceInnodbContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#createTablespaceInnodb}.
	 * @param ctx the parse tree
	 */
	void exitCreateTablespaceInnodb(MySQLParser.CreateTablespaceInnodbContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#createTablespaceNdb}.
	 * @param ctx the parse tree
	 */
	void enterCreateTablespaceNdb(MySQLParser.CreateTablespaceNdbContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#createTablespaceNdb}.
	 * @param ctx the parse tree
	 */
	void exitCreateTablespaceNdb(MySQLParser.CreateTablespaceNdbContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#createTrigger}.
	 * @param ctx the parse tree
	 */
	void enterCreateTrigger(MySQLParser.CreateTriggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#createTrigger}.
	 * @param ctx the parse tree
	 */
	void exitCreateTrigger(MySQLParser.CreateTriggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#createView}.
	 * @param ctx the parse tree
	 */
	void enterCreateView(MySQLParser.CreateViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#createView}.
	 * @param ctx the parse tree
	 */
	void exitCreateView(MySQLParser.CreateViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#createDatabaseOption}.
	 * @param ctx the parse tree
	 */
	void enterCreateDatabaseOption(MySQLParser.CreateDatabaseOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#createDatabaseOption}.
	 * @param ctx the parse tree
	 */
	void exitCreateDatabaseOption(MySQLParser.CreateDatabaseOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#ownerStatement}.
	 * @param ctx the parse tree
	 */
	void enterOwnerStatement(MySQLParser.OwnerStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#ownerStatement}.
	 * @param ctx the parse tree
	 */
	void exitOwnerStatement(MySQLParser.OwnerStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code preciseSchedule}
	 * labeled alternative in {@link MySQLParser#scheduleExpression}.
	 * @param ctx the parse tree
	 */
	void enterPreciseSchedule(MySQLParser.PreciseScheduleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code preciseSchedule}
	 * labeled alternative in {@link MySQLParser#scheduleExpression}.
	 * @param ctx the parse tree
	 */
	void exitPreciseSchedule(MySQLParser.PreciseScheduleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intervalSchedule}
	 * labeled alternative in {@link MySQLParser#scheduleExpression}.
	 * @param ctx the parse tree
	 */
	void enterIntervalSchedule(MySQLParser.IntervalScheduleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intervalSchedule}
	 * labeled alternative in {@link MySQLParser#scheduleExpression}.
	 * @param ctx the parse tree
	 */
	void exitIntervalSchedule(MySQLParser.IntervalScheduleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#timestampValue}.
	 * @param ctx the parse tree
	 */
	void enterTimestampValue(MySQLParser.TimestampValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#timestampValue}.
	 * @param ctx the parse tree
	 */
	void exitTimestampValue(MySQLParser.TimestampValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#intervalExpr}.
	 * @param ctx the parse tree
	 */
	void enterIntervalExpr(MySQLParser.IntervalExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#intervalExpr}.
	 * @param ctx the parse tree
	 */
	void exitIntervalExpr(MySQLParser.IntervalExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#intervalType}.
	 * @param ctx the parse tree
	 */
	void enterIntervalType(MySQLParser.IntervalTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#intervalType}.
	 * @param ctx the parse tree
	 */
	void exitIntervalType(MySQLParser.IntervalTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#enableType}.
	 * @param ctx the parse tree
	 */
	void enterEnableType(MySQLParser.EnableTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#enableType}.
	 * @param ctx the parse tree
	 */
	void exitEnableType(MySQLParser.EnableTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#indexType}.
	 * @param ctx the parse tree
	 */
	void enterIndexType(MySQLParser.IndexTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#indexType}.
	 * @param ctx the parse tree
	 */
	void exitIndexType(MySQLParser.IndexTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#indexOption}.
	 * @param ctx the parse tree
	 */
	void enterIndexOption(MySQLParser.IndexOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#indexOption}.
	 * @param ctx the parse tree
	 */
	void exitIndexOption(MySQLParser.IndexOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#procedureParameter}.
	 * @param ctx the parse tree
	 */
	void enterProcedureParameter(MySQLParser.ProcedureParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#procedureParameter}.
	 * @param ctx the parse tree
	 */
	void exitProcedureParameter(MySQLParser.ProcedureParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#functionParameter}.
	 * @param ctx the parse tree
	 */
	void enterFunctionParameter(MySQLParser.FunctionParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#functionParameter}.
	 * @param ctx the parse tree
	 */
	void exitFunctionParameter(MySQLParser.FunctionParameterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code routineComment}
	 * labeled alternative in {@link MySQLParser#routineOption}.
	 * @param ctx the parse tree
	 */
	void enterRoutineComment(MySQLParser.RoutineCommentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code routineComment}
	 * labeled alternative in {@link MySQLParser#routineOption}.
	 * @param ctx the parse tree
	 */
	void exitRoutineComment(MySQLParser.RoutineCommentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code routineLanguage}
	 * labeled alternative in {@link MySQLParser#routineOption}.
	 * @param ctx the parse tree
	 */
	void enterRoutineLanguage(MySQLParser.RoutineLanguageContext ctx);
	/**
	 * Exit a parse tree produced by the {@code routineLanguage}
	 * labeled alternative in {@link MySQLParser#routineOption}.
	 * @param ctx the parse tree
	 */
	void exitRoutineLanguage(MySQLParser.RoutineLanguageContext ctx);
	/**
	 * Enter a parse tree produced by the {@code routineBehavior}
	 * labeled alternative in {@link MySQLParser#routineOption}.
	 * @param ctx the parse tree
	 */
	void enterRoutineBehavior(MySQLParser.RoutineBehaviorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code routineBehavior}
	 * labeled alternative in {@link MySQLParser#routineOption}.
	 * @param ctx the parse tree
	 */
	void exitRoutineBehavior(MySQLParser.RoutineBehaviorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code routineData}
	 * labeled alternative in {@link MySQLParser#routineOption}.
	 * @param ctx the parse tree
	 */
	void enterRoutineData(MySQLParser.RoutineDataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code routineData}
	 * labeled alternative in {@link MySQLParser#routineOption}.
	 * @param ctx the parse tree
	 */
	void exitRoutineData(MySQLParser.RoutineDataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code routineSecurity}
	 * labeled alternative in {@link MySQLParser#routineOption}.
	 * @param ctx the parse tree
	 */
	void enterRoutineSecurity(MySQLParser.RoutineSecurityContext ctx);
	/**
	 * Exit a parse tree produced by the {@code routineSecurity}
	 * labeled alternative in {@link MySQLParser#routineOption}.
	 * @param ctx the parse tree
	 */
	void exitRoutineSecurity(MySQLParser.RoutineSecurityContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#serverOption}.
	 * @param ctx the parse tree
	 */
	void enterServerOption(MySQLParser.ServerOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#serverOption}.
	 * @param ctx the parse tree
	 */
	void exitServerOption(MySQLParser.ServerOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#createDefinitions}.
	 * @param ctx the parse tree
	 */
	void enterCreateDefinitions(MySQLParser.CreateDefinitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#createDefinitions}.
	 * @param ctx the parse tree
	 */
	void exitCreateDefinitions(MySQLParser.CreateDefinitionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code columnDeclaration}
	 * labeled alternative in {@link MySQLParser#createDefinition}.
	 * @param ctx the parse tree
	 */
	void enterColumnDeclaration(MySQLParser.ColumnDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code columnDeclaration}
	 * labeled alternative in {@link MySQLParser#createDefinition}.
	 * @param ctx the parse tree
	 */
	void exitColumnDeclaration(MySQLParser.ColumnDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constraintDeclaration}
	 * labeled alternative in {@link MySQLParser#createDefinition}.
	 * @param ctx the parse tree
	 */
	void enterConstraintDeclaration(MySQLParser.ConstraintDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constraintDeclaration}
	 * labeled alternative in {@link MySQLParser#createDefinition}.
	 * @param ctx the parse tree
	 */
	void exitConstraintDeclaration(MySQLParser.ConstraintDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code indexDeclaration}
	 * labeled alternative in {@link MySQLParser#createDefinition}.
	 * @param ctx the parse tree
	 */
	void enterIndexDeclaration(MySQLParser.IndexDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code indexDeclaration}
	 * labeled alternative in {@link MySQLParser#createDefinition}.
	 * @param ctx the parse tree
	 */
	void exitIndexDeclaration(MySQLParser.IndexDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#columnDefinition}.
	 * @param ctx the parse tree
	 */
	void enterColumnDefinition(MySQLParser.ColumnDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#columnDefinition}.
	 * @param ctx the parse tree
	 */
	void exitColumnDefinition(MySQLParser.ColumnDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullColumnConstraint}
	 * labeled alternative in {@link MySQLParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterNullColumnConstraint(MySQLParser.NullColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullColumnConstraint}
	 * labeled alternative in {@link MySQLParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitNullColumnConstraint(MySQLParser.NullColumnConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code defaultColumnConstraint}
	 * labeled alternative in {@link MySQLParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterDefaultColumnConstraint(MySQLParser.DefaultColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code defaultColumnConstraint}
	 * labeled alternative in {@link MySQLParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitDefaultColumnConstraint(MySQLParser.DefaultColumnConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code autoIncrementColumnConstraint}
	 * labeled alternative in {@link MySQLParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterAutoIncrementColumnConstraint(MySQLParser.AutoIncrementColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code autoIncrementColumnConstraint}
	 * labeled alternative in {@link MySQLParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitAutoIncrementColumnConstraint(MySQLParser.AutoIncrementColumnConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primaryKeyColumnConstraint}
	 * labeled alternative in {@link MySQLParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryKeyColumnConstraint(MySQLParser.PrimaryKeyColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryKeyColumnConstraint}
	 * labeled alternative in {@link MySQLParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryKeyColumnConstraint(MySQLParser.PrimaryKeyColumnConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code uniqueKeyColumnConstraint}
	 * labeled alternative in {@link MySQLParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterUniqueKeyColumnConstraint(MySQLParser.UniqueKeyColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code uniqueKeyColumnConstraint}
	 * labeled alternative in {@link MySQLParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitUniqueKeyColumnConstraint(MySQLParser.UniqueKeyColumnConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code commentColumnConstraint}
	 * labeled alternative in {@link MySQLParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterCommentColumnConstraint(MySQLParser.CommentColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code commentColumnConstraint}
	 * labeled alternative in {@link MySQLParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitCommentColumnConstraint(MySQLParser.CommentColumnConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code formatColumnConstraint}
	 * labeled alternative in {@link MySQLParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterFormatColumnConstraint(MySQLParser.FormatColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code formatColumnConstraint}
	 * labeled alternative in {@link MySQLParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitFormatColumnConstraint(MySQLParser.FormatColumnConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code storageColumnConstraint}
	 * labeled alternative in {@link MySQLParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterStorageColumnConstraint(MySQLParser.StorageColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code storageColumnConstraint}
	 * labeled alternative in {@link MySQLParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitStorageColumnConstraint(MySQLParser.StorageColumnConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code referenceColumnConstraint}
	 * labeled alternative in {@link MySQLParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterReferenceColumnConstraint(MySQLParser.ReferenceColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code referenceColumnConstraint}
	 * labeled alternative in {@link MySQLParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitReferenceColumnConstraint(MySQLParser.ReferenceColumnConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code collateColumnConstraint}
	 * labeled alternative in {@link MySQLParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterCollateColumnConstraint(MySQLParser.CollateColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code collateColumnConstraint}
	 * labeled alternative in {@link MySQLParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitCollateColumnConstraint(MySQLParser.CollateColumnConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code generatedColumnConstraint}
	 * labeled alternative in {@link MySQLParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterGeneratedColumnConstraint(MySQLParser.GeneratedColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code generatedColumnConstraint}
	 * labeled alternative in {@link MySQLParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitGeneratedColumnConstraint(MySQLParser.GeneratedColumnConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code serialDefaultColumnConstraint}
	 * labeled alternative in {@link MySQLParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void enterSerialDefaultColumnConstraint(MySQLParser.SerialDefaultColumnConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code serialDefaultColumnConstraint}
	 * labeled alternative in {@link MySQLParser#columnConstraint}.
	 * @param ctx the parse tree
	 */
	void exitSerialDefaultColumnConstraint(MySQLParser.SerialDefaultColumnConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primaryKeyTableConstraint}
	 * labeled alternative in {@link MySQLParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryKeyTableConstraint(MySQLParser.PrimaryKeyTableConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primaryKeyTableConstraint}
	 * labeled alternative in {@link MySQLParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryKeyTableConstraint(MySQLParser.PrimaryKeyTableConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code uniqueKeyTableConstraint}
	 * labeled alternative in {@link MySQLParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void enterUniqueKeyTableConstraint(MySQLParser.UniqueKeyTableConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code uniqueKeyTableConstraint}
	 * labeled alternative in {@link MySQLParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void exitUniqueKeyTableConstraint(MySQLParser.UniqueKeyTableConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code foreignKeyTableConstraint}
	 * labeled alternative in {@link MySQLParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void enterForeignKeyTableConstraint(MySQLParser.ForeignKeyTableConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code foreignKeyTableConstraint}
	 * labeled alternative in {@link MySQLParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void exitForeignKeyTableConstraint(MySQLParser.ForeignKeyTableConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code checkTableConstraint}
	 * labeled alternative in {@link MySQLParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void enterCheckTableConstraint(MySQLParser.CheckTableConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code checkTableConstraint}
	 * labeled alternative in {@link MySQLParser#tableConstraint}.
	 * @param ctx the parse tree
	 */
	void exitCheckTableConstraint(MySQLParser.CheckTableConstraintContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#referenceDefinition}.
	 * @param ctx the parse tree
	 */
	void enterReferenceDefinition(MySQLParser.ReferenceDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#referenceDefinition}.
	 * @param ctx the parse tree
	 */
	void exitReferenceDefinition(MySQLParser.ReferenceDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#referenceAction}.
	 * @param ctx the parse tree
	 */
	void enterReferenceAction(MySQLParser.ReferenceActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#referenceAction}.
	 * @param ctx the parse tree
	 */
	void exitReferenceAction(MySQLParser.ReferenceActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#referenceControlType}.
	 * @param ctx the parse tree
	 */
	void enterReferenceControlType(MySQLParser.ReferenceControlTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#referenceControlType}.
	 * @param ctx the parse tree
	 */
	void exitReferenceControlType(MySQLParser.ReferenceControlTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleIndexDeclaration}
	 * labeled alternative in {@link MySQLParser#indexColumnDefinition}.
	 * @param ctx the parse tree
	 */
	void enterSimpleIndexDeclaration(MySQLParser.SimpleIndexDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleIndexDeclaration}
	 * labeled alternative in {@link MySQLParser#indexColumnDefinition}.
	 * @param ctx the parse tree
	 */
	void exitSimpleIndexDeclaration(MySQLParser.SimpleIndexDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code specialIndexDeclaration}
	 * labeled alternative in {@link MySQLParser#indexColumnDefinition}.
	 * @param ctx the parse tree
	 */
	void enterSpecialIndexDeclaration(MySQLParser.SpecialIndexDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code specialIndexDeclaration}
	 * labeled alternative in {@link MySQLParser#indexColumnDefinition}.
	 * @param ctx the parse tree
	 */
	void exitSpecialIndexDeclaration(MySQLParser.SpecialIndexDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionEngine}
	 * labeled alternative in {@link MySQLParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionEngine(MySQLParser.TableOptionEngineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionEngine}
	 * labeled alternative in {@link MySQLParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionEngine(MySQLParser.TableOptionEngineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionAutoIncrement}
	 * labeled alternative in {@link MySQLParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionAutoIncrement(MySQLParser.TableOptionAutoIncrementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionAutoIncrement}
	 * labeled alternative in {@link MySQLParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionAutoIncrement(MySQLParser.TableOptionAutoIncrementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionAverage}
	 * labeled alternative in {@link MySQLParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionAverage(MySQLParser.TableOptionAverageContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionAverage}
	 * labeled alternative in {@link MySQLParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionAverage(MySQLParser.TableOptionAverageContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionCharset}
	 * labeled alternative in {@link MySQLParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionCharset(MySQLParser.TableOptionCharsetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionCharset}
	 * labeled alternative in {@link MySQLParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionCharset(MySQLParser.TableOptionCharsetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionChecksum}
	 * labeled alternative in {@link MySQLParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionChecksum(MySQLParser.TableOptionChecksumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionChecksum}
	 * labeled alternative in {@link MySQLParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionChecksum(MySQLParser.TableOptionChecksumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionCollate}
	 * labeled alternative in {@link MySQLParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionCollate(MySQLParser.TableOptionCollateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionCollate}
	 * labeled alternative in {@link MySQLParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionCollate(MySQLParser.TableOptionCollateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionComment}
	 * labeled alternative in {@link MySQLParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionComment(MySQLParser.TableOptionCommentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionComment}
	 * labeled alternative in {@link MySQLParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionComment(MySQLParser.TableOptionCommentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionCompression}
	 * labeled alternative in {@link MySQLParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionCompression(MySQLParser.TableOptionCompressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionCompression}
	 * labeled alternative in {@link MySQLParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionCompression(MySQLParser.TableOptionCompressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionConnection}
	 * labeled alternative in {@link MySQLParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionConnection(MySQLParser.TableOptionConnectionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionConnection}
	 * labeled alternative in {@link MySQLParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionConnection(MySQLParser.TableOptionConnectionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionDataDirectory}
	 * labeled alternative in {@link MySQLParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionDataDirectory(MySQLParser.TableOptionDataDirectoryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionDataDirectory}
	 * labeled alternative in {@link MySQLParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionDataDirectory(MySQLParser.TableOptionDataDirectoryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionDelay}
	 * labeled alternative in {@link MySQLParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionDelay(MySQLParser.TableOptionDelayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionDelay}
	 * labeled alternative in {@link MySQLParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionDelay(MySQLParser.TableOptionDelayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionEncryption}
	 * labeled alternative in {@link MySQLParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionEncryption(MySQLParser.TableOptionEncryptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionEncryption}
	 * labeled alternative in {@link MySQLParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionEncryption(MySQLParser.TableOptionEncryptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionIndexDirectory}
	 * labeled alternative in {@link MySQLParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionIndexDirectory(MySQLParser.TableOptionIndexDirectoryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionIndexDirectory}
	 * labeled alternative in {@link MySQLParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionIndexDirectory(MySQLParser.TableOptionIndexDirectoryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionInsertMethod}
	 * labeled alternative in {@link MySQLParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionInsertMethod(MySQLParser.TableOptionInsertMethodContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionInsertMethod}
	 * labeled alternative in {@link MySQLParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionInsertMethod(MySQLParser.TableOptionInsertMethodContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionKeyBlockSize}
	 * labeled alternative in {@link MySQLParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionKeyBlockSize(MySQLParser.TableOptionKeyBlockSizeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionKeyBlockSize}
	 * labeled alternative in {@link MySQLParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionKeyBlockSize(MySQLParser.TableOptionKeyBlockSizeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionMaxRows}
	 * labeled alternative in {@link MySQLParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionMaxRows(MySQLParser.TableOptionMaxRowsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionMaxRows}
	 * labeled alternative in {@link MySQLParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionMaxRows(MySQLParser.TableOptionMaxRowsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionMinRows}
	 * labeled alternative in {@link MySQLParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionMinRows(MySQLParser.TableOptionMinRowsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionMinRows}
	 * labeled alternative in {@link MySQLParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionMinRows(MySQLParser.TableOptionMinRowsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionPackKeys}
	 * labeled alternative in {@link MySQLParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionPackKeys(MySQLParser.TableOptionPackKeysContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionPackKeys}
	 * labeled alternative in {@link MySQLParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionPackKeys(MySQLParser.TableOptionPackKeysContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionPassword}
	 * labeled alternative in {@link MySQLParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionPassword(MySQLParser.TableOptionPasswordContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionPassword}
	 * labeled alternative in {@link MySQLParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionPassword(MySQLParser.TableOptionPasswordContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionRowFormat}
	 * labeled alternative in {@link MySQLParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionRowFormat(MySQLParser.TableOptionRowFormatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionRowFormat}
	 * labeled alternative in {@link MySQLParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionRowFormat(MySQLParser.TableOptionRowFormatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionRecalculation}
	 * labeled alternative in {@link MySQLParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionRecalculation(MySQLParser.TableOptionRecalculationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionRecalculation}
	 * labeled alternative in {@link MySQLParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionRecalculation(MySQLParser.TableOptionRecalculationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionPersistent}
	 * labeled alternative in {@link MySQLParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionPersistent(MySQLParser.TableOptionPersistentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionPersistent}
	 * labeled alternative in {@link MySQLParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionPersistent(MySQLParser.TableOptionPersistentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionSamplePage}
	 * labeled alternative in {@link MySQLParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionSamplePage(MySQLParser.TableOptionSamplePageContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionSamplePage}
	 * labeled alternative in {@link MySQLParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionSamplePage(MySQLParser.TableOptionSamplePageContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionTablespace}
	 * labeled alternative in {@link MySQLParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionTablespace(MySQLParser.TableOptionTablespaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionTablespace}
	 * labeled alternative in {@link MySQLParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionTablespace(MySQLParser.TableOptionTablespaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableOptionUnion}
	 * labeled alternative in {@link MySQLParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void enterTableOptionUnion(MySQLParser.TableOptionUnionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableOptionUnion}
	 * labeled alternative in {@link MySQLParser#tableOption}.
	 * @param ctx the parse tree
	 */
	void exitTableOptionUnion(MySQLParser.TableOptionUnionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#tablespaceStorage}.
	 * @param ctx the parse tree
	 */
	void enterTablespaceStorage(MySQLParser.TablespaceStorageContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#tablespaceStorage}.
	 * @param ctx the parse tree
	 */
	void exitTablespaceStorage(MySQLParser.TablespaceStorageContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#partitionDefinitions}.
	 * @param ctx the parse tree
	 */
	void enterPartitionDefinitions(MySQLParser.PartitionDefinitionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#partitionDefinitions}.
	 * @param ctx the parse tree
	 */
	void exitPartitionDefinitions(MySQLParser.PartitionDefinitionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionFunctionHash}
	 * labeled alternative in {@link MySQLParser#partitionFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPartitionFunctionHash(MySQLParser.PartitionFunctionHashContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionFunctionHash}
	 * labeled alternative in {@link MySQLParser#partitionFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPartitionFunctionHash(MySQLParser.PartitionFunctionHashContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionFunctionKey}
	 * labeled alternative in {@link MySQLParser#partitionFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPartitionFunctionKey(MySQLParser.PartitionFunctionKeyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionFunctionKey}
	 * labeled alternative in {@link MySQLParser#partitionFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPartitionFunctionKey(MySQLParser.PartitionFunctionKeyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionFunctionRange}
	 * labeled alternative in {@link MySQLParser#partitionFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPartitionFunctionRange(MySQLParser.PartitionFunctionRangeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionFunctionRange}
	 * labeled alternative in {@link MySQLParser#partitionFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPartitionFunctionRange(MySQLParser.PartitionFunctionRangeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionFunctionList}
	 * labeled alternative in {@link MySQLParser#partitionFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPartitionFunctionList(MySQLParser.PartitionFunctionListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionFunctionList}
	 * labeled alternative in {@link MySQLParser#partitionFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPartitionFunctionList(MySQLParser.PartitionFunctionListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subPartitionFunctionHash}
	 * labeled alternative in {@link MySQLParser#subpartitionFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterSubPartitionFunctionHash(MySQLParser.SubPartitionFunctionHashContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subPartitionFunctionHash}
	 * labeled alternative in {@link MySQLParser#subpartitionFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitSubPartitionFunctionHash(MySQLParser.SubPartitionFunctionHashContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subPartitionFunctionKey}
	 * labeled alternative in {@link MySQLParser#subpartitionFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterSubPartitionFunctionKey(MySQLParser.SubPartitionFunctionKeyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subPartitionFunctionKey}
	 * labeled alternative in {@link MySQLParser#subpartitionFunctionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitSubPartitionFunctionKey(MySQLParser.SubPartitionFunctionKeyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionComparision}
	 * labeled alternative in {@link MySQLParser#partitionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPartitionComparision(MySQLParser.PartitionComparisionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionComparision}
	 * labeled alternative in {@link MySQLParser#partitionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPartitionComparision(MySQLParser.PartitionComparisionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionListAtom}
	 * labeled alternative in {@link MySQLParser#partitionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPartitionListAtom(MySQLParser.PartitionListAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionListAtom}
	 * labeled alternative in {@link MySQLParser#partitionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPartitionListAtom(MySQLParser.PartitionListAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionListVector}
	 * labeled alternative in {@link MySQLParser#partitionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPartitionListVector(MySQLParser.PartitionListVectorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionListVector}
	 * labeled alternative in {@link MySQLParser#partitionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPartitionListVector(MySQLParser.PartitionListVectorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionSimple}
	 * labeled alternative in {@link MySQLParser#partitionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterPartitionSimple(MySQLParser.PartitionSimpleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionSimple}
	 * labeled alternative in {@link MySQLParser#partitionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitPartitionSimple(MySQLParser.PartitionSimpleContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#partitionDefinerAtom}.
	 * @param ctx the parse tree
	 */
	void enterPartitionDefinerAtom(MySQLParser.PartitionDefinerAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#partitionDefinerAtom}.
	 * @param ctx the parse tree
	 */
	void exitPartitionDefinerAtom(MySQLParser.PartitionDefinerAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#partitionDefinerVector}.
	 * @param ctx the parse tree
	 */
	void enterPartitionDefinerVector(MySQLParser.PartitionDefinerVectorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#partitionDefinerVector}.
	 * @param ctx the parse tree
	 */
	void exitPartitionDefinerVector(MySQLParser.PartitionDefinerVectorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#subpartitionDefinition}.
	 * @param ctx the parse tree
	 */
	void enterSubpartitionDefinition(MySQLParser.SubpartitionDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#subpartitionDefinition}.
	 * @param ctx the parse tree
	 */
	void exitSubpartitionDefinition(MySQLParser.SubpartitionDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionOptionEngine}
	 * labeled alternative in {@link MySQLParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void enterPartitionOptionEngine(MySQLParser.PartitionOptionEngineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionOptionEngine}
	 * labeled alternative in {@link MySQLParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void exitPartitionOptionEngine(MySQLParser.PartitionOptionEngineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionOptionComment}
	 * labeled alternative in {@link MySQLParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void enterPartitionOptionComment(MySQLParser.PartitionOptionCommentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionOptionComment}
	 * labeled alternative in {@link MySQLParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void exitPartitionOptionComment(MySQLParser.PartitionOptionCommentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionOptionDataDirectory}
	 * labeled alternative in {@link MySQLParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void enterPartitionOptionDataDirectory(MySQLParser.PartitionOptionDataDirectoryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionOptionDataDirectory}
	 * labeled alternative in {@link MySQLParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void exitPartitionOptionDataDirectory(MySQLParser.PartitionOptionDataDirectoryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionOptionIndexDirectory}
	 * labeled alternative in {@link MySQLParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void enterPartitionOptionIndexDirectory(MySQLParser.PartitionOptionIndexDirectoryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionOptionIndexDirectory}
	 * labeled alternative in {@link MySQLParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void exitPartitionOptionIndexDirectory(MySQLParser.PartitionOptionIndexDirectoryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionOptionMaxRows}
	 * labeled alternative in {@link MySQLParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void enterPartitionOptionMaxRows(MySQLParser.PartitionOptionMaxRowsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionOptionMaxRows}
	 * labeled alternative in {@link MySQLParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void exitPartitionOptionMaxRows(MySQLParser.PartitionOptionMaxRowsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionOptionMinRows}
	 * labeled alternative in {@link MySQLParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void enterPartitionOptionMinRows(MySQLParser.PartitionOptionMinRowsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionOptionMinRows}
	 * labeled alternative in {@link MySQLParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void exitPartitionOptionMinRows(MySQLParser.PartitionOptionMinRowsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionOptionTablespace}
	 * labeled alternative in {@link MySQLParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void enterPartitionOptionTablespace(MySQLParser.PartitionOptionTablespaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionOptionTablespace}
	 * labeled alternative in {@link MySQLParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void exitPartitionOptionTablespace(MySQLParser.PartitionOptionTablespaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code partitionOptionNodeGroup}
	 * labeled alternative in {@link MySQLParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void enterPartitionOptionNodeGroup(MySQLParser.PartitionOptionNodeGroupContext ctx);
	/**
	 * Exit a parse tree produced by the {@code partitionOptionNodeGroup}
	 * labeled alternative in {@link MySQLParser#partitionOption}.
	 * @param ctx the parse tree
	 */
	void exitPartitionOptionNodeGroup(MySQLParser.PartitionOptionNodeGroupContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterSimpleDatabase}
	 * labeled alternative in {@link MySQLParser#alterDatabase}.
	 * @param ctx the parse tree
	 */
	void enterAlterSimpleDatabase(MySQLParser.AlterSimpleDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterSimpleDatabase}
	 * labeled alternative in {@link MySQLParser#alterDatabase}.
	 * @param ctx the parse tree
	 */
	void exitAlterSimpleDatabase(MySQLParser.AlterSimpleDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterUpgradeName}
	 * labeled alternative in {@link MySQLParser#alterDatabase}.
	 * @param ctx the parse tree
	 */
	void enterAlterUpgradeName(MySQLParser.AlterUpgradeNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterUpgradeName}
	 * labeled alternative in {@link MySQLParser#alterDatabase}.
	 * @param ctx the parse tree
	 */
	void exitAlterUpgradeName(MySQLParser.AlterUpgradeNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#alterEvent}.
	 * @param ctx the parse tree
	 */
	void enterAlterEvent(MySQLParser.AlterEventContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#alterEvent}.
	 * @param ctx the parse tree
	 */
	void exitAlterEvent(MySQLParser.AlterEventContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#alterFunction}.
	 * @param ctx the parse tree
	 */
	void enterAlterFunction(MySQLParser.AlterFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#alterFunction}.
	 * @param ctx the parse tree
	 */
	void exitAlterFunction(MySQLParser.AlterFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#alterInstance}.
	 * @param ctx the parse tree
	 */
	void enterAlterInstance(MySQLParser.AlterInstanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#alterInstance}.
	 * @param ctx the parse tree
	 */
	void exitAlterInstance(MySQLParser.AlterInstanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#alterLogfileGroup}.
	 * @param ctx the parse tree
	 */
	void enterAlterLogfileGroup(MySQLParser.AlterLogfileGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#alterLogfileGroup}.
	 * @param ctx the parse tree
	 */
	void exitAlterLogfileGroup(MySQLParser.AlterLogfileGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#alterProcedure}.
	 * @param ctx the parse tree
	 */
	void enterAlterProcedure(MySQLParser.AlterProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#alterProcedure}.
	 * @param ctx the parse tree
	 */
	void exitAlterProcedure(MySQLParser.AlterProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#alterServer}.
	 * @param ctx the parse tree
	 */
	void enterAlterServer(MySQLParser.AlterServerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#alterServer}.
	 * @param ctx the parse tree
	 */
	void exitAlterServer(MySQLParser.AlterServerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#alterTable}.
	 * @param ctx the parse tree
	 */
	void enterAlterTable(MySQLParser.AlterTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#alterTable}.
	 * @param ctx the parse tree
	 */
	void exitAlterTable(MySQLParser.AlterTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#alterTablespace}.
	 * @param ctx the parse tree
	 */
	void enterAlterTablespace(MySQLParser.AlterTablespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#alterTablespace}.
	 * @param ctx the parse tree
	 */
	void exitAlterTablespace(MySQLParser.AlterTablespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#alterView}.
	 * @param ctx the parse tree
	 */
	void enterAlterView(MySQLParser.AlterViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#alterView}.
	 * @param ctx the parse tree
	 */
	void exitAlterView(MySQLParser.AlterViewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByTableOption}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByTableOption(MySQLParser.AlterByTableOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByTableOption}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByTableOption(MySQLParser.AlterByTableOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByAddColumn}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByAddColumn(MySQLParser.AlterByAddColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByAddColumn}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByAddColumn(MySQLParser.AlterByAddColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByAddColumns}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByAddColumns(MySQLParser.AlterByAddColumnsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByAddColumns}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByAddColumns(MySQLParser.AlterByAddColumnsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByAddIndex}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByAddIndex(MySQLParser.AlterByAddIndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByAddIndex}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByAddIndex(MySQLParser.AlterByAddIndexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByAddPrimaryKey}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByAddPrimaryKey(MySQLParser.AlterByAddPrimaryKeyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByAddPrimaryKey}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByAddPrimaryKey(MySQLParser.AlterByAddPrimaryKeyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByAddUniqueKey}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByAddUniqueKey(MySQLParser.AlterByAddUniqueKeyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByAddUniqueKey}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByAddUniqueKey(MySQLParser.AlterByAddUniqueKeyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByAddSpecialIndex}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByAddSpecialIndex(MySQLParser.AlterByAddSpecialIndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByAddSpecialIndex}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByAddSpecialIndex(MySQLParser.AlterByAddSpecialIndexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByAddForeignKey}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByAddForeignKey(MySQLParser.AlterByAddForeignKeyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByAddForeignKey}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByAddForeignKey(MySQLParser.AlterByAddForeignKeyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByAddCheckTableConstraint}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByAddCheckTableConstraint(MySQLParser.AlterByAddCheckTableConstraintContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByAddCheckTableConstraint}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByAddCheckTableConstraint(MySQLParser.AlterByAddCheckTableConstraintContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterBySetAlgorithm}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterBySetAlgorithm(MySQLParser.AlterBySetAlgorithmContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterBySetAlgorithm}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterBySetAlgorithm(MySQLParser.AlterBySetAlgorithmContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByChangeDefault}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByChangeDefault(MySQLParser.AlterByChangeDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByChangeDefault}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByChangeDefault(MySQLParser.AlterByChangeDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByChangeColumn}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByChangeColumn(MySQLParser.AlterByChangeColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByChangeColumn}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByChangeColumn(MySQLParser.AlterByChangeColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByRenameColumn}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByRenameColumn(MySQLParser.AlterByRenameColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByRenameColumn}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByRenameColumn(MySQLParser.AlterByRenameColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByLock}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByLock(MySQLParser.AlterByLockContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByLock}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByLock(MySQLParser.AlterByLockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByModifyColumn}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByModifyColumn(MySQLParser.AlterByModifyColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByModifyColumn}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByModifyColumn(MySQLParser.AlterByModifyColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByDropColumn}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByDropColumn(MySQLParser.AlterByDropColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByDropColumn}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByDropColumn(MySQLParser.AlterByDropColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByDropPrimaryKey}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByDropPrimaryKey(MySQLParser.AlterByDropPrimaryKeyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByDropPrimaryKey}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByDropPrimaryKey(MySQLParser.AlterByDropPrimaryKeyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByRenameIndex}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByRenameIndex(MySQLParser.AlterByRenameIndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByRenameIndex}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByRenameIndex(MySQLParser.AlterByRenameIndexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByDropIndex}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByDropIndex(MySQLParser.AlterByDropIndexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByDropIndex}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByDropIndex(MySQLParser.AlterByDropIndexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByDropForeignKey}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByDropForeignKey(MySQLParser.AlterByDropForeignKeyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByDropForeignKey}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByDropForeignKey(MySQLParser.AlterByDropForeignKeyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByDisableKeys}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByDisableKeys(MySQLParser.AlterByDisableKeysContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByDisableKeys}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByDisableKeys(MySQLParser.AlterByDisableKeysContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByEnableKeys}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByEnableKeys(MySQLParser.AlterByEnableKeysContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByEnableKeys}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByEnableKeys(MySQLParser.AlterByEnableKeysContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByRename}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByRename(MySQLParser.AlterByRenameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByRename}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByRename(MySQLParser.AlterByRenameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByOrder}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByOrder(MySQLParser.AlterByOrderContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByOrder}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByOrder(MySQLParser.AlterByOrderContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByConvertCharset}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByConvertCharset(MySQLParser.AlterByConvertCharsetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByConvertCharset}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByConvertCharset(MySQLParser.AlterByConvertCharsetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByDefaultCharset}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByDefaultCharset(MySQLParser.AlterByDefaultCharsetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByDefaultCharset}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByDefaultCharset(MySQLParser.AlterByDefaultCharsetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByDiscardTablespace}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByDiscardTablespace(MySQLParser.AlterByDiscardTablespaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByDiscardTablespace}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByDiscardTablespace(MySQLParser.AlterByDiscardTablespaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByImportTablespace}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByImportTablespace(MySQLParser.AlterByImportTablespaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByImportTablespace}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByImportTablespace(MySQLParser.AlterByImportTablespaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByForce}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByForce(MySQLParser.AlterByForceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByForce}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByForce(MySQLParser.AlterByForceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByValidate}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByValidate(MySQLParser.AlterByValidateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByValidate}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByValidate(MySQLParser.AlterByValidateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByAddPartition}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByAddPartition(MySQLParser.AlterByAddPartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByAddPartition}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByAddPartition(MySQLParser.AlterByAddPartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByDropPartition}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByDropPartition(MySQLParser.AlterByDropPartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByDropPartition}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByDropPartition(MySQLParser.AlterByDropPartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByDiscardPartition}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByDiscardPartition(MySQLParser.AlterByDiscardPartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByDiscardPartition}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByDiscardPartition(MySQLParser.AlterByDiscardPartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByImportPartition}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByImportPartition(MySQLParser.AlterByImportPartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByImportPartition}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByImportPartition(MySQLParser.AlterByImportPartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByTruncatePartition}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByTruncatePartition(MySQLParser.AlterByTruncatePartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByTruncatePartition}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByTruncatePartition(MySQLParser.AlterByTruncatePartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByCoalescePartition}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByCoalescePartition(MySQLParser.AlterByCoalescePartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByCoalescePartition}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByCoalescePartition(MySQLParser.AlterByCoalescePartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByReorganizePartition}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByReorganizePartition(MySQLParser.AlterByReorganizePartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByReorganizePartition}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByReorganizePartition(MySQLParser.AlterByReorganizePartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByExchangePartition}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByExchangePartition(MySQLParser.AlterByExchangePartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByExchangePartition}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByExchangePartition(MySQLParser.AlterByExchangePartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByAnalyzePartition}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByAnalyzePartition(MySQLParser.AlterByAnalyzePartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByAnalyzePartition}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByAnalyzePartition(MySQLParser.AlterByAnalyzePartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByCheckPartition}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByCheckPartition(MySQLParser.AlterByCheckPartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByCheckPartition}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByCheckPartition(MySQLParser.AlterByCheckPartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByOptimizePartition}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByOptimizePartition(MySQLParser.AlterByOptimizePartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByOptimizePartition}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByOptimizePartition(MySQLParser.AlterByOptimizePartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByRebuildPartition}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByRebuildPartition(MySQLParser.AlterByRebuildPartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByRebuildPartition}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByRebuildPartition(MySQLParser.AlterByRebuildPartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByRepairPartition}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByRepairPartition(MySQLParser.AlterByRepairPartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByRepairPartition}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByRepairPartition(MySQLParser.AlterByRepairPartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByRemovePartitioning}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByRemovePartitioning(MySQLParser.AlterByRemovePartitioningContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByRemovePartitioning}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByRemovePartitioning(MySQLParser.AlterByRemovePartitioningContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterByUpgradePartitioning}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void enterAlterByUpgradePartitioning(MySQLParser.AlterByUpgradePartitioningContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterByUpgradePartitioning}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 */
	void exitAlterByUpgradePartitioning(MySQLParser.AlterByUpgradePartitioningContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#dropDatabase}.
	 * @param ctx the parse tree
	 */
	void enterDropDatabase(MySQLParser.DropDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#dropDatabase}.
	 * @param ctx the parse tree
	 */
	void exitDropDatabase(MySQLParser.DropDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#dropEvent}.
	 * @param ctx the parse tree
	 */
	void enterDropEvent(MySQLParser.DropEventContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#dropEvent}.
	 * @param ctx the parse tree
	 */
	void exitDropEvent(MySQLParser.DropEventContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#dropIndex}.
	 * @param ctx the parse tree
	 */
	void enterDropIndex(MySQLParser.DropIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#dropIndex}.
	 * @param ctx the parse tree
	 */
	void exitDropIndex(MySQLParser.DropIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#dropLogfileGroup}.
	 * @param ctx the parse tree
	 */
	void enterDropLogfileGroup(MySQLParser.DropLogfileGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#dropLogfileGroup}.
	 * @param ctx the parse tree
	 */
	void exitDropLogfileGroup(MySQLParser.DropLogfileGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#dropProcedure}.
	 * @param ctx the parse tree
	 */
	void enterDropProcedure(MySQLParser.DropProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#dropProcedure}.
	 * @param ctx the parse tree
	 */
	void exitDropProcedure(MySQLParser.DropProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#dropFunction}.
	 * @param ctx the parse tree
	 */
	void enterDropFunction(MySQLParser.DropFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#dropFunction}.
	 * @param ctx the parse tree
	 */
	void exitDropFunction(MySQLParser.DropFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#dropServer}.
	 * @param ctx the parse tree
	 */
	void enterDropServer(MySQLParser.DropServerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#dropServer}.
	 * @param ctx the parse tree
	 */
	void exitDropServer(MySQLParser.DropServerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#dropTable}.
	 * @param ctx the parse tree
	 */
	void enterDropTable(MySQLParser.DropTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#dropTable}.
	 * @param ctx the parse tree
	 */
	void exitDropTable(MySQLParser.DropTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#dropTablespace}.
	 * @param ctx the parse tree
	 */
	void enterDropTablespace(MySQLParser.DropTablespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#dropTablespace}.
	 * @param ctx the parse tree
	 */
	void exitDropTablespace(MySQLParser.DropTablespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#dropTrigger}.
	 * @param ctx the parse tree
	 */
	void enterDropTrigger(MySQLParser.DropTriggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#dropTrigger}.
	 * @param ctx the parse tree
	 */
	void exitDropTrigger(MySQLParser.DropTriggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#dropView}.
	 * @param ctx the parse tree
	 */
	void enterDropView(MySQLParser.DropViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#dropView}.
	 * @param ctx the parse tree
	 */
	void exitDropView(MySQLParser.DropViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#renameTable}.
	 * @param ctx the parse tree
	 */
	void enterRenameTable(MySQLParser.RenameTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#renameTable}.
	 * @param ctx the parse tree
	 */
	void exitRenameTable(MySQLParser.RenameTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#renameTableClause}.
	 * @param ctx the parse tree
	 */
	void enterRenameTableClause(MySQLParser.RenameTableClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#renameTableClause}.
	 * @param ctx the parse tree
	 */
	void exitRenameTableClause(MySQLParser.RenameTableClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#truncateTable}.
	 * @param ctx the parse tree
	 */
	void enterTruncateTable(MySQLParser.TruncateTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#truncateTable}.
	 * @param ctx the parse tree
	 */
	void exitTruncateTable(MySQLParser.TruncateTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#callStatement}.
	 * @param ctx the parse tree
	 */
	void enterCallStatement(MySQLParser.CallStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#callStatement}.
	 * @param ctx the parse tree
	 */
	void exitCallStatement(MySQLParser.CallStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#deleteStatement}.
	 * @param ctx the parse tree
	 */
	void enterDeleteStatement(MySQLParser.DeleteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#deleteStatement}.
	 * @param ctx the parse tree
	 */
	void exitDeleteStatement(MySQLParser.DeleteStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoStatement(MySQLParser.DoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoStatement(MySQLParser.DoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#handlerStatement}.
	 * @param ctx the parse tree
	 */
	void enterHandlerStatement(MySQLParser.HandlerStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#handlerStatement}.
	 * @param ctx the parse tree
	 */
	void exitHandlerStatement(MySQLParser.HandlerStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#insertStatement}.
	 * @param ctx the parse tree
	 */
	void enterInsertStatement(MySQLParser.InsertStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#insertStatement}.
	 * @param ctx the parse tree
	 */
	void exitInsertStatement(MySQLParser.InsertStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#loadDataStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoadDataStatement(MySQLParser.LoadDataStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#loadDataStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoadDataStatement(MySQLParser.LoadDataStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#loadXmlStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoadXmlStatement(MySQLParser.LoadXmlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#loadXmlStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoadXmlStatement(MySQLParser.LoadXmlStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#replaceStatement}.
	 * @param ctx the parse tree
	 */
	void enterReplaceStatement(MySQLParser.ReplaceStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#replaceStatement}.
	 * @param ctx the parse tree
	 */
	void exitReplaceStatement(MySQLParser.ReplaceStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleSelect}
	 * labeled alternative in {@link MySQLParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleSelect(MySQLParser.SimpleSelectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleSelect}
	 * labeled alternative in {@link MySQLParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleSelect(MySQLParser.SimpleSelectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesisSelect}
	 * labeled alternative in {@link MySQLParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void enterParenthesisSelect(MySQLParser.ParenthesisSelectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesisSelect}
	 * labeled alternative in {@link MySQLParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void exitParenthesisSelect(MySQLParser.ParenthesisSelectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unionSelect}
	 * labeled alternative in {@link MySQLParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void enterUnionSelect(MySQLParser.UnionSelectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unionSelect}
	 * labeled alternative in {@link MySQLParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void exitUnionSelect(MySQLParser.UnionSelectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unionParenthesisSelect}
	 * labeled alternative in {@link MySQLParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void enterUnionParenthesisSelect(MySQLParser.UnionParenthesisSelectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unionParenthesisSelect}
	 * labeled alternative in {@link MySQLParser#selectStatement}.
	 * @param ctx the parse tree
	 */
	void exitUnionParenthesisSelect(MySQLParser.UnionParenthesisSelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#updateStatement}.
	 * @param ctx the parse tree
	 */
	void enterUpdateStatement(MySQLParser.UpdateStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#updateStatement}.
	 * @param ctx the parse tree
	 */
	void exitUpdateStatement(MySQLParser.UpdateStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#insertStatementValue}.
	 * @param ctx the parse tree
	 */
	void enterInsertStatementValue(MySQLParser.InsertStatementValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#insertStatementValue}.
	 * @param ctx the parse tree
	 */
	void exitInsertStatementValue(MySQLParser.InsertStatementValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#updatedElement}.
	 * @param ctx the parse tree
	 */
	void enterUpdatedElement(MySQLParser.UpdatedElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#updatedElement}.
	 * @param ctx the parse tree
	 */
	void exitUpdatedElement(MySQLParser.UpdatedElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#assignmentField}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentField(MySQLParser.AssignmentFieldContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#assignmentField}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentField(MySQLParser.AssignmentFieldContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#lockClause}.
	 * @param ctx the parse tree
	 */
	void enterLockClause(MySQLParser.LockClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#lockClause}.
	 * @param ctx the parse tree
	 */
	void exitLockClause(MySQLParser.LockClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#singleDeleteStatement}.
	 * @param ctx the parse tree
	 */
	void enterSingleDeleteStatement(MySQLParser.SingleDeleteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#singleDeleteStatement}.
	 * @param ctx the parse tree
	 */
	void exitSingleDeleteStatement(MySQLParser.SingleDeleteStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#multipleDeleteStatement}.
	 * @param ctx the parse tree
	 */
	void enterMultipleDeleteStatement(MySQLParser.MultipleDeleteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#multipleDeleteStatement}.
	 * @param ctx the parse tree
	 */
	void exitMultipleDeleteStatement(MySQLParser.MultipleDeleteStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#handlerOpenStatement}.
	 * @param ctx the parse tree
	 */
	void enterHandlerOpenStatement(MySQLParser.HandlerOpenStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#handlerOpenStatement}.
	 * @param ctx the parse tree
	 */
	void exitHandlerOpenStatement(MySQLParser.HandlerOpenStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#handlerReadIndexStatement}.
	 * @param ctx the parse tree
	 */
	void enterHandlerReadIndexStatement(MySQLParser.HandlerReadIndexStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#handlerReadIndexStatement}.
	 * @param ctx the parse tree
	 */
	void exitHandlerReadIndexStatement(MySQLParser.HandlerReadIndexStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#handlerReadStatement}.
	 * @param ctx the parse tree
	 */
	void enterHandlerReadStatement(MySQLParser.HandlerReadStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#handlerReadStatement}.
	 * @param ctx the parse tree
	 */
	void exitHandlerReadStatement(MySQLParser.HandlerReadStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#handlerCloseStatement}.
	 * @param ctx the parse tree
	 */
	void enterHandlerCloseStatement(MySQLParser.HandlerCloseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#handlerCloseStatement}.
	 * @param ctx the parse tree
	 */
	void exitHandlerCloseStatement(MySQLParser.HandlerCloseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#singleUpdateStatement}.
	 * @param ctx the parse tree
	 */
	void enterSingleUpdateStatement(MySQLParser.SingleUpdateStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#singleUpdateStatement}.
	 * @param ctx the parse tree
	 */
	void exitSingleUpdateStatement(MySQLParser.SingleUpdateStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#multipleUpdateStatement}.
	 * @param ctx the parse tree
	 */
	void enterMultipleUpdateStatement(MySQLParser.MultipleUpdateStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#multipleUpdateStatement}.
	 * @param ctx the parse tree
	 */
	void exitMultipleUpdateStatement(MySQLParser.MultipleUpdateStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void enterOrderByClause(MySQLParser.OrderByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void exitOrderByClause(MySQLParser.OrderByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#orderByExpression}.
	 * @param ctx the parse tree
	 */
	void enterOrderByExpression(MySQLParser.OrderByExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#orderByExpression}.
	 * @param ctx the parse tree
	 */
	void exitOrderByExpression(MySQLParser.OrderByExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#tableSources}.
	 * @param ctx the parse tree
	 */
	void enterTableSources(MySQLParser.TableSourcesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#tableSources}.
	 * @param ctx the parse tree
	 */
	void exitTableSources(MySQLParser.TableSourcesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableSourceBase}
	 * labeled alternative in {@link MySQLParser#tableSource}.
	 * @param ctx the parse tree
	 */
	void enterTableSourceBase(MySQLParser.TableSourceBaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableSourceBase}
	 * labeled alternative in {@link MySQLParser#tableSource}.
	 * @param ctx the parse tree
	 */
	void exitTableSourceBase(MySQLParser.TableSourceBaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableSourceNested}
	 * labeled alternative in {@link MySQLParser#tableSource}.
	 * @param ctx the parse tree
	 */
	void enterTableSourceNested(MySQLParser.TableSourceNestedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableSourceNested}
	 * labeled alternative in {@link MySQLParser#tableSource}.
	 * @param ctx the parse tree
	 */
	void exitTableSourceNested(MySQLParser.TableSourceNestedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code atomTableItem}
	 * labeled alternative in {@link MySQLParser#tableSourceItem}.
	 * @param ctx the parse tree
	 */
	void enterAtomTableItem(MySQLParser.AtomTableItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code atomTableItem}
	 * labeled alternative in {@link MySQLParser#tableSourceItem}.
	 * @param ctx the parse tree
	 */
	void exitAtomTableItem(MySQLParser.AtomTableItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subqueryTableItem}
	 * labeled alternative in {@link MySQLParser#tableSourceItem}.
	 * @param ctx the parse tree
	 */
	void enterSubqueryTableItem(MySQLParser.SubqueryTableItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subqueryTableItem}
	 * labeled alternative in {@link MySQLParser#tableSourceItem}.
	 * @param ctx the parse tree
	 */
	void exitSubqueryTableItem(MySQLParser.SubqueryTableItemContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableSourcesItem}
	 * labeled alternative in {@link MySQLParser#tableSourceItem}.
	 * @param ctx the parse tree
	 */
	void enterTableSourcesItem(MySQLParser.TableSourcesItemContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableSourcesItem}
	 * labeled alternative in {@link MySQLParser#tableSourceItem}.
	 * @param ctx the parse tree
	 */
	void exitTableSourcesItem(MySQLParser.TableSourcesItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#indexHint}.
	 * @param ctx the parse tree
	 */
	void enterIndexHint(MySQLParser.IndexHintContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#indexHint}.
	 * @param ctx the parse tree
	 */
	void exitIndexHint(MySQLParser.IndexHintContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#indexHintType}.
	 * @param ctx the parse tree
	 */
	void enterIndexHintType(MySQLParser.IndexHintTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#indexHintType}.
	 * @param ctx the parse tree
	 */
	void exitIndexHintType(MySQLParser.IndexHintTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code innerJoin}
	 * labeled alternative in {@link MySQLParser#joinPart}.
	 * @param ctx the parse tree
	 */
	void enterInnerJoin(MySQLParser.InnerJoinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code innerJoin}
	 * labeled alternative in {@link MySQLParser#joinPart}.
	 * @param ctx the parse tree
	 */
	void exitInnerJoin(MySQLParser.InnerJoinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code straightJoin}
	 * labeled alternative in {@link MySQLParser#joinPart}.
	 * @param ctx the parse tree
	 */
	void enterStraightJoin(MySQLParser.StraightJoinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code straightJoin}
	 * labeled alternative in {@link MySQLParser#joinPart}.
	 * @param ctx the parse tree
	 */
	void exitStraightJoin(MySQLParser.StraightJoinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code outerJoin}
	 * labeled alternative in {@link MySQLParser#joinPart}.
	 * @param ctx the parse tree
	 */
	void enterOuterJoin(MySQLParser.OuterJoinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code outerJoin}
	 * labeled alternative in {@link MySQLParser#joinPart}.
	 * @param ctx the parse tree
	 */
	void exitOuterJoin(MySQLParser.OuterJoinContext ctx);
	/**
	 * Enter a parse tree produced by the {@code naturalJoin}
	 * labeled alternative in {@link MySQLParser#joinPart}.
	 * @param ctx the parse tree
	 */
	void enterNaturalJoin(MySQLParser.NaturalJoinContext ctx);
	/**
	 * Exit a parse tree produced by the {@code naturalJoin}
	 * labeled alternative in {@link MySQLParser#joinPart}.
	 * @param ctx the parse tree
	 */
	void exitNaturalJoin(MySQLParser.NaturalJoinContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#queryExpression}.
	 * @param ctx the parse tree
	 */
	void enterQueryExpression(MySQLParser.QueryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#queryExpression}.
	 * @param ctx the parse tree
	 */
	void exitQueryExpression(MySQLParser.QueryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#queryExpressionNointo}.
	 * @param ctx the parse tree
	 */
	void enterQueryExpressionNointo(MySQLParser.QueryExpressionNointoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#queryExpressionNointo}.
	 * @param ctx the parse tree
	 */
	void exitQueryExpressionNointo(MySQLParser.QueryExpressionNointoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void enterQuerySpecification(MySQLParser.QuerySpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void exitQuerySpecification(MySQLParser.QuerySpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#querySpecificationNointo}.
	 * @param ctx the parse tree
	 */
	void enterQuerySpecificationNointo(MySQLParser.QuerySpecificationNointoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#querySpecificationNointo}.
	 * @param ctx the parse tree
	 */
	void exitQuerySpecificationNointo(MySQLParser.QuerySpecificationNointoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#unionParenthesis}.
	 * @param ctx the parse tree
	 */
	void enterUnionParenthesis(MySQLParser.UnionParenthesisContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#unionParenthesis}.
	 * @param ctx the parse tree
	 */
	void exitUnionParenthesis(MySQLParser.UnionParenthesisContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#unionStatement}.
	 * @param ctx the parse tree
	 */
	void enterUnionStatement(MySQLParser.UnionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#unionStatement}.
	 * @param ctx the parse tree
	 */
	void exitUnionStatement(MySQLParser.UnionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#selectSpec}.
	 * @param ctx the parse tree
	 */
	void enterSelectSpec(MySQLParser.SelectSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#selectSpec}.
	 * @param ctx the parse tree
	 */
	void exitSelectSpec(MySQLParser.SelectSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#selectElements}.
	 * @param ctx the parse tree
	 */
	void enterSelectElements(MySQLParser.SelectElementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#selectElements}.
	 * @param ctx the parse tree
	 */
	void exitSelectElements(MySQLParser.SelectElementsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectStarElement}
	 * labeled alternative in {@link MySQLParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void enterSelectStarElement(MySQLParser.SelectStarElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectStarElement}
	 * labeled alternative in {@link MySQLParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void exitSelectStarElement(MySQLParser.SelectStarElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectColumnElement}
	 * labeled alternative in {@link MySQLParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void enterSelectColumnElement(MySQLParser.SelectColumnElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectColumnElement}
	 * labeled alternative in {@link MySQLParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void exitSelectColumnElement(MySQLParser.SelectColumnElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectFunctionElement}
	 * labeled alternative in {@link MySQLParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void enterSelectFunctionElement(MySQLParser.SelectFunctionElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectFunctionElement}
	 * labeled alternative in {@link MySQLParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void exitSelectFunctionElement(MySQLParser.SelectFunctionElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectExpressionElement}
	 * labeled alternative in {@link MySQLParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void enterSelectExpressionElement(MySQLParser.SelectExpressionElementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectExpressionElement}
	 * labeled alternative in {@link MySQLParser#selectElement}.
	 * @param ctx the parse tree
	 */
	void exitSelectExpressionElement(MySQLParser.SelectExpressionElementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectIntoVariables}
	 * labeled alternative in {@link MySQLParser#selectIntoExpression}.
	 * @param ctx the parse tree
	 */
	void enterSelectIntoVariables(MySQLParser.SelectIntoVariablesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectIntoVariables}
	 * labeled alternative in {@link MySQLParser#selectIntoExpression}.
	 * @param ctx the parse tree
	 */
	void exitSelectIntoVariables(MySQLParser.SelectIntoVariablesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectIntoDumpFile}
	 * labeled alternative in {@link MySQLParser#selectIntoExpression}.
	 * @param ctx the parse tree
	 */
	void enterSelectIntoDumpFile(MySQLParser.SelectIntoDumpFileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectIntoDumpFile}
	 * labeled alternative in {@link MySQLParser#selectIntoExpression}.
	 * @param ctx the parse tree
	 */
	void exitSelectIntoDumpFile(MySQLParser.SelectIntoDumpFileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code selectIntoTextFile}
	 * labeled alternative in {@link MySQLParser#selectIntoExpression}.
	 * @param ctx the parse tree
	 */
	void enterSelectIntoTextFile(MySQLParser.SelectIntoTextFileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code selectIntoTextFile}
	 * labeled alternative in {@link MySQLParser#selectIntoExpression}.
	 * @param ctx the parse tree
	 */
	void exitSelectIntoTextFile(MySQLParser.SelectIntoTextFileContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#selectFieldsInto}.
	 * @param ctx the parse tree
	 */
	void enterSelectFieldsInto(MySQLParser.SelectFieldsIntoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#selectFieldsInto}.
	 * @param ctx the parse tree
	 */
	void exitSelectFieldsInto(MySQLParser.SelectFieldsIntoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#selectLinesInto}.
	 * @param ctx the parse tree
	 */
	void enterSelectLinesInto(MySQLParser.SelectLinesIntoContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#selectLinesInto}.
	 * @param ctx the parse tree
	 */
	void exitSelectLinesInto(MySQLParser.SelectLinesIntoContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void enterFromClause(MySQLParser.FromClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void exitFromClause(MySQLParser.FromClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#groupByItem}.
	 * @param ctx the parse tree
	 */
	void enterGroupByItem(MySQLParser.GroupByItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#groupByItem}.
	 * @param ctx the parse tree
	 */
	void exitGroupByItem(MySQLParser.GroupByItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void enterLimitClause(MySQLParser.LimitClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void exitLimitClause(MySQLParser.LimitClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#limitClauseAtom}.
	 * @param ctx the parse tree
	 */
	void enterLimitClauseAtom(MySQLParser.LimitClauseAtomContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#limitClauseAtom}.
	 * @param ctx the parse tree
	 */
	void exitLimitClauseAtom(MySQLParser.LimitClauseAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#startTransaction}.
	 * @param ctx the parse tree
	 */
	void enterStartTransaction(MySQLParser.StartTransactionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#startTransaction}.
	 * @param ctx the parse tree
	 */
	void exitStartTransaction(MySQLParser.StartTransactionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#beginWork}.
	 * @param ctx the parse tree
	 */
	void enterBeginWork(MySQLParser.BeginWorkContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#beginWork}.
	 * @param ctx the parse tree
	 */
	void exitBeginWork(MySQLParser.BeginWorkContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#commitWork}.
	 * @param ctx the parse tree
	 */
	void enterCommitWork(MySQLParser.CommitWorkContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#commitWork}.
	 * @param ctx the parse tree
	 */
	void exitCommitWork(MySQLParser.CommitWorkContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#rollbackWork}.
	 * @param ctx the parse tree
	 */
	void enterRollbackWork(MySQLParser.RollbackWorkContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#rollbackWork}.
	 * @param ctx the parse tree
	 */
	void exitRollbackWork(MySQLParser.RollbackWorkContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#savepointStatement}.
	 * @param ctx the parse tree
	 */
	void enterSavepointStatement(MySQLParser.SavepointStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#savepointStatement}.
	 * @param ctx the parse tree
	 */
	void exitSavepointStatement(MySQLParser.SavepointStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#rollbackStatement}.
	 * @param ctx the parse tree
	 */
	void enterRollbackStatement(MySQLParser.RollbackStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#rollbackStatement}.
	 * @param ctx the parse tree
	 */
	void exitRollbackStatement(MySQLParser.RollbackStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#releaseStatement}.
	 * @param ctx the parse tree
	 */
	void enterReleaseStatement(MySQLParser.ReleaseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#releaseStatement}.
	 * @param ctx the parse tree
	 */
	void exitReleaseStatement(MySQLParser.ReleaseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#lockTables}.
	 * @param ctx the parse tree
	 */
	void enterLockTables(MySQLParser.LockTablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#lockTables}.
	 * @param ctx the parse tree
	 */
	void exitLockTables(MySQLParser.LockTablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#unlockTables}.
	 * @param ctx the parse tree
	 */
	void enterUnlockTables(MySQLParser.UnlockTablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#unlockTables}.
	 * @param ctx the parse tree
	 */
	void exitUnlockTables(MySQLParser.UnlockTablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#setAutocommitStatement}.
	 * @param ctx the parse tree
	 */
	void enterSetAutocommitStatement(MySQLParser.SetAutocommitStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#setAutocommitStatement}.
	 * @param ctx the parse tree
	 */
	void exitSetAutocommitStatement(MySQLParser.SetAutocommitStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#setTransactionStatement}.
	 * @param ctx the parse tree
	 */
	void enterSetTransactionStatement(MySQLParser.SetTransactionStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#setTransactionStatement}.
	 * @param ctx the parse tree
	 */
	void exitSetTransactionStatement(MySQLParser.SetTransactionStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#transactionMode}.
	 * @param ctx the parse tree
	 */
	void enterTransactionMode(MySQLParser.TransactionModeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#transactionMode}.
	 * @param ctx the parse tree
	 */
	void exitTransactionMode(MySQLParser.TransactionModeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#lockTableElement}.
	 * @param ctx the parse tree
	 */
	void enterLockTableElement(MySQLParser.LockTableElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#lockTableElement}.
	 * @param ctx the parse tree
	 */
	void exitLockTableElement(MySQLParser.LockTableElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#lockAction}.
	 * @param ctx the parse tree
	 */
	void enterLockAction(MySQLParser.LockActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#lockAction}.
	 * @param ctx the parse tree
	 */
	void exitLockAction(MySQLParser.LockActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#transactionOption}.
	 * @param ctx the parse tree
	 */
	void enterTransactionOption(MySQLParser.TransactionOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#transactionOption}.
	 * @param ctx the parse tree
	 */
	void exitTransactionOption(MySQLParser.TransactionOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#transactionLevel}.
	 * @param ctx the parse tree
	 */
	void enterTransactionLevel(MySQLParser.TransactionLevelContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#transactionLevel}.
	 * @param ctx the parse tree
	 */
	void exitTransactionLevel(MySQLParser.TransactionLevelContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#changeMaster}.
	 * @param ctx the parse tree
	 */
	void enterChangeMaster(MySQLParser.ChangeMasterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#changeMaster}.
	 * @param ctx the parse tree
	 */
	void exitChangeMaster(MySQLParser.ChangeMasterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#changeReplicationFilter}.
	 * @param ctx the parse tree
	 */
	void enterChangeReplicationFilter(MySQLParser.ChangeReplicationFilterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#changeReplicationFilter}.
	 * @param ctx the parse tree
	 */
	void exitChangeReplicationFilter(MySQLParser.ChangeReplicationFilterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#purgeBinaryLogs}.
	 * @param ctx the parse tree
	 */
	void enterPurgeBinaryLogs(MySQLParser.PurgeBinaryLogsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#purgeBinaryLogs}.
	 * @param ctx the parse tree
	 */
	void exitPurgeBinaryLogs(MySQLParser.PurgeBinaryLogsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#resetMaster}.
	 * @param ctx the parse tree
	 */
	void enterResetMaster(MySQLParser.ResetMasterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#resetMaster}.
	 * @param ctx the parse tree
	 */
	void exitResetMaster(MySQLParser.ResetMasterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#resetSlave}.
	 * @param ctx the parse tree
	 */
	void enterResetSlave(MySQLParser.ResetSlaveContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#resetSlave}.
	 * @param ctx the parse tree
	 */
	void exitResetSlave(MySQLParser.ResetSlaveContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#startSlave}.
	 * @param ctx the parse tree
	 */
	void enterStartSlave(MySQLParser.StartSlaveContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#startSlave}.
	 * @param ctx the parse tree
	 */
	void exitStartSlave(MySQLParser.StartSlaveContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#stopSlave}.
	 * @param ctx the parse tree
	 */
	void enterStopSlave(MySQLParser.StopSlaveContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#stopSlave}.
	 * @param ctx the parse tree
	 */
	void exitStopSlave(MySQLParser.StopSlaveContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#startGroupReplication}.
	 * @param ctx the parse tree
	 */
	void enterStartGroupReplication(MySQLParser.StartGroupReplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#startGroupReplication}.
	 * @param ctx the parse tree
	 */
	void exitStartGroupReplication(MySQLParser.StartGroupReplicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#stopGroupReplication}.
	 * @param ctx the parse tree
	 */
	void enterStopGroupReplication(MySQLParser.StopGroupReplicationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#stopGroupReplication}.
	 * @param ctx the parse tree
	 */
	void exitStopGroupReplication(MySQLParser.StopGroupReplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code masterStringOption}
	 * labeled alternative in {@link MySQLParser#masterOption}.
	 * @param ctx the parse tree
	 */
	void enterMasterStringOption(MySQLParser.MasterStringOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code masterStringOption}
	 * labeled alternative in {@link MySQLParser#masterOption}.
	 * @param ctx the parse tree
	 */
	void exitMasterStringOption(MySQLParser.MasterStringOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code masterDecimalOption}
	 * labeled alternative in {@link MySQLParser#masterOption}.
	 * @param ctx the parse tree
	 */
	void enterMasterDecimalOption(MySQLParser.MasterDecimalOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code masterDecimalOption}
	 * labeled alternative in {@link MySQLParser#masterOption}.
	 * @param ctx the parse tree
	 */
	void exitMasterDecimalOption(MySQLParser.MasterDecimalOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code masterBoolOption}
	 * labeled alternative in {@link MySQLParser#masterOption}.
	 * @param ctx the parse tree
	 */
	void enterMasterBoolOption(MySQLParser.MasterBoolOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code masterBoolOption}
	 * labeled alternative in {@link MySQLParser#masterOption}.
	 * @param ctx the parse tree
	 */
	void exitMasterBoolOption(MySQLParser.MasterBoolOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code masterRealOption}
	 * labeled alternative in {@link MySQLParser#masterOption}.
	 * @param ctx the parse tree
	 */
	void enterMasterRealOption(MySQLParser.MasterRealOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code masterRealOption}
	 * labeled alternative in {@link MySQLParser#masterOption}.
	 * @param ctx the parse tree
	 */
	void exitMasterRealOption(MySQLParser.MasterRealOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code masterUidListOption}
	 * labeled alternative in {@link MySQLParser#masterOption}.
	 * @param ctx the parse tree
	 */
	void enterMasterUidListOption(MySQLParser.MasterUidListOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code masterUidListOption}
	 * labeled alternative in {@link MySQLParser#masterOption}.
	 * @param ctx the parse tree
	 */
	void exitMasterUidListOption(MySQLParser.MasterUidListOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#stringMasterOption}.
	 * @param ctx the parse tree
	 */
	void enterStringMasterOption(MySQLParser.StringMasterOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#stringMasterOption}.
	 * @param ctx the parse tree
	 */
	void exitStringMasterOption(MySQLParser.StringMasterOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#decimalMasterOption}.
	 * @param ctx the parse tree
	 */
	void enterDecimalMasterOption(MySQLParser.DecimalMasterOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#decimalMasterOption}.
	 * @param ctx the parse tree
	 */
	void exitDecimalMasterOption(MySQLParser.DecimalMasterOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#boolMasterOption}.
	 * @param ctx the parse tree
	 */
	void enterBoolMasterOption(MySQLParser.BoolMasterOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#boolMasterOption}.
	 * @param ctx the parse tree
	 */
	void exitBoolMasterOption(MySQLParser.BoolMasterOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#channelOption}.
	 * @param ctx the parse tree
	 */
	void enterChannelOption(MySQLParser.ChannelOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#channelOption}.
	 * @param ctx the parse tree
	 */
	void exitChannelOption(MySQLParser.ChannelOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doDbReplication}
	 * labeled alternative in {@link MySQLParser#replicationFilter}.
	 * @param ctx the parse tree
	 */
	void enterDoDbReplication(MySQLParser.DoDbReplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doDbReplication}
	 * labeled alternative in {@link MySQLParser#replicationFilter}.
	 * @param ctx the parse tree
	 */
	void exitDoDbReplication(MySQLParser.DoDbReplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ignoreDbReplication}
	 * labeled alternative in {@link MySQLParser#replicationFilter}.
	 * @param ctx the parse tree
	 */
	void enterIgnoreDbReplication(MySQLParser.IgnoreDbReplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ignoreDbReplication}
	 * labeled alternative in {@link MySQLParser#replicationFilter}.
	 * @param ctx the parse tree
	 */
	void exitIgnoreDbReplication(MySQLParser.IgnoreDbReplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doTableReplication}
	 * labeled alternative in {@link MySQLParser#replicationFilter}.
	 * @param ctx the parse tree
	 */
	void enterDoTableReplication(MySQLParser.DoTableReplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doTableReplication}
	 * labeled alternative in {@link MySQLParser#replicationFilter}.
	 * @param ctx the parse tree
	 */
	void exitDoTableReplication(MySQLParser.DoTableReplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ignoreTableReplication}
	 * labeled alternative in {@link MySQLParser#replicationFilter}.
	 * @param ctx the parse tree
	 */
	void enterIgnoreTableReplication(MySQLParser.IgnoreTableReplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ignoreTableReplication}
	 * labeled alternative in {@link MySQLParser#replicationFilter}.
	 * @param ctx the parse tree
	 */
	void exitIgnoreTableReplication(MySQLParser.IgnoreTableReplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wildDoTableReplication}
	 * labeled alternative in {@link MySQLParser#replicationFilter}.
	 * @param ctx the parse tree
	 */
	void enterWildDoTableReplication(MySQLParser.WildDoTableReplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wildDoTableReplication}
	 * labeled alternative in {@link MySQLParser#replicationFilter}.
	 * @param ctx the parse tree
	 */
	void exitWildDoTableReplication(MySQLParser.WildDoTableReplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wildIgnoreTableReplication}
	 * labeled alternative in {@link MySQLParser#replicationFilter}.
	 * @param ctx the parse tree
	 */
	void enterWildIgnoreTableReplication(MySQLParser.WildIgnoreTableReplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wildIgnoreTableReplication}
	 * labeled alternative in {@link MySQLParser#replicationFilter}.
	 * @param ctx the parse tree
	 */
	void exitWildIgnoreTableReplication(MySQLParser.WildIgnoreTableReplicationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rewriteDbReplication}
	 * labeled alternative in {@link MySQLParser#replicationFilter}.
	 * @param ctx the parse tree
	 */
	void enterRewriteDbReplication(MySQLParser.RewriteDbReplicationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rewriteDbReplication}
	 * labeled alternative in {@link MySQLParser#replicationFilter}.
	 * @param ctx the parse tree
	 */
	void exitRewriteDbReplication(MySQLParser.RewriteDbReplicationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#tablePair}.
	 * @param ctx the parse tree
	 */
	void enterTablePair(MySQLParser.TablePairContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#tablePair}.
	 * @param ctx the parse tree
	 */
	void exitTablePair(MySQLParser.TablePairContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#threadType}.
	 * @param ctx the parse tree
	 */
	void enterThreadType(MySQLParser.ThreadTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#threadType}.
	 * @param ctx the parse tree
	 */
	void exitThreadType(MySQLParser.ThreadTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code gtidsUntilOption}
	 * labeled alternative in {@link MySQLParser#untilOption}.
	 * @param ctx the parse tree
	 */
	void enterGtidsUntilOption(MySQLParser.GtidsUntilOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code gtidsUntilOption}
	 * labeled alternative in {@link MySQLParser#untilOption}.
	 * @param ctx the parse tree
	 */
	void exitGtidsUntilOption(MySQLParser.GtidsUntilOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code masterLogUntilOption}
	 * labeled alternative in {@link MySQLParser#untilOption}.
	 * @param ctx the parse tree
	 */
	void enterMasterLogUntilOption(MySQLParser.MasterLogUntilOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code masterLogUntilOption}
	 * labeled alternative in {@link MySQLParser#untilOption}.
	 * @param ctx the parse tree
	 */
	void exitMasterLogUntilOption(MySQLParser.MasterLogUntilOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code relayLogUntilOption}
	 * labeled alternative in {@link MySQLParser#untilOption}.
	 * @param ctx the parse tree
	 */
	void enterRelayLogUntilOption(MySQLParser.RelayLogUntilOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code relayLogUntilOption}
	 * labeled alternative in {@link MySQLParser#untilOption}.
	 * @param ctx the parse tree
	 */
	void exitRelayLogUntilOption(MySQLParser.RelayLogUntilOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sqlGapsUntilOption}
	 * labeled alternative in {@link MySQLParser#untilOption}.
	 * @param ctx the parse tree
	 */
	void enterSqlGapsUntilOption(MySQLParser.SqlGapsUntilOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sqlGapsUntilOption}
	 * labeled alternative in {@link MySQLParser#untilOption}.
	 * @param ctx the parse tree
	 */
	void exitSqlGapsUntilOption(MySQLParser.SqlGapsUntilOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code userConnectionOption}
	 * labeled alternative in {@link MySQLParser#connectionOption}.
	 * @param ctx the parse tree
	 */
	void enterUserConnectionOption(MySQLParser.UserConnectionOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code userConnectionOption}
	 * labeled alternative in {@link MySQLParser#connectionOption}.
	 * @param ctx the parse tree
	 */
	void exitUserConnectionOption(MySQLParser.UserConnectionOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code passwordConnectionOption}
	 * labeled alternative in {@link MySQLParser#connectionOption}.
	 * @param ctx the parse tree
	 */
	void enterPasswordConnectionOption(MySQLParser.PasswordConnectionOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code passwordConnectionOption}
	 * labeled alternative in {@link MySQLParser#connectionOption}.
	 * @param ctx the parse tree
	 */
	void exitPasswordConnectionOption(MySQLParser.PasswordConnectionOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code defaultAuthConnectionOption}
	 * labeled alternative in {@link MySQLParser#connectionOption}.
	 * @param ctx the parse tree
	 */
	void enterDefaultAuthConnectionOption(MySQLParser.DefaultAuthConnectionOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code defaultAuthConnectionOption}
	 * labeled alternative in {@link MySQLParser#connectionOption}.
	 * @param ctx the parse tree
	 */
	void exitDefaultAuthConnectionOption(MySQLParser.DefaultAuthConnectionOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code pluginDirConnectionOption}
	 * labeled alternative in {@link MySQLParser#connectionOption}.
	 * @param ctx the parse tree
	 */
	void enterPluginDirConnectionOption(MySQLParser.PluginDirConnectionOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code pluginDirConnectionOption}
	 * labeled alternative in {@link MySQLParser#connectionOption}.
	 * @param ctx the parse tree
	 */
	void exitPluginDirConnectionOption(MySQLParser.PluginDirConnectionOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#gtuidSet}.
	 * @param ctx the parse tree
	 */
	void enterGtuidSet(MySQLParser.GtuidSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#gtuidSet}.
	 * @param ctx the parse tree
	 */
	void exitGtuidSet(MySQLParser.GtuidSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#xaStartTransaction}.
	 * @param ctx the parse tree
	 */
	void enterXaStartTransaction(MySQLParser.XaStartTransactionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#xaStartTransaction}.
	 * @param ctx the parse tree
	 */
	void exitXaStartTransaction(MySQLParser.XaStartTransactionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#xaEndTransaction}.
	 * @param ctx the parse tree
	 */
	void enterXaEndTransaction(MySQLParser.XaEndTransactionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#xaEndTransaction}.
	 * @param ctx the parse tree
	 */
	void exitXaEndTransaction(MySQLParser.XaEndTransactionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#xaPrepareStatement}.
	 * @param ctx the parse tree
	 */
	void enterXaPrepareStatement(MySQLParser.XaPrepareStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#xaPrepareStatement}.
	 * @param ctx the parse tree
	 */
	void exitXaPrepareStatement(MySQLParser.XaPrepareStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#xaCommitWork}.
	 * @param ctx the parse tree
	 */
	void enterXaCommitWork(MySQLParser.XaCommitWorkContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#xaCommitWork}.
	 * @param ctx the parse tree
	 */
	void exitXaCommitWork(MySQLParser.XaCommitWorkContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#xaRollbackWork}.
	 * @param ctx the parse tree
	 */
	void enterXaRollbackWork(MySQLParser.XaRollbackWorkContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#xaRollbackWork}.
	 * @param ctx the parse tree
	 */
	void exitXaRollbackWork(MySQLParser.XaRollbackWorkContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#xaRecoverWork}.
	 * @param ctx the parse tree
	 */
	void enterXaRecoverWork(MySQLParser.XaRecoverWorkContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#xaRecoverWork}.
	 * @param ctx the parse tree
	 */
	void exitXaRecoverWork(MySQLParser.XaRecoverWorkContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#prepareStatement}.
	 * @param ctx the parse tree
	 */
	void enterPrepareStatement(MySQLParser.PrepareStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#prepareStatement}.
	 * @param ctx the parse tree
	 */
	void exitPrepareStatement(MySQLParser.PrepareStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#executeStatement}.
	 * @param ctx the parse tree
	 */
	void enterExecuteStatement(MySQLParser.ExecuteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#executeStatement}.
	 * @param ctx the parse tree
	 */
	void exitExecuteStatement(MySQLParser.ExecuteStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#deallocatePrepare}.
	 * @param ctx the parse tree
	 */
	void enterDeallocatePrepare(MySQLParser.DeallocatePrepareContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#deallocatePrepare}.
	 * @param ctx the parse tree
	 */
	void exitDeallocatePrepare(MySQLParser.DeallocatePrepareContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#routineBody}.
	 * @param ctx the parse tree
	 */
	void enterRoutineBody(MySQLParser.RoutineBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#routineBody}.
	 * @param ctx the parse tree
	 */
	void exitRoutineBody(MySQLParser.RoutineBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void enterBlockStatement(MySQLParser.BlockStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#blockStatement}.
	 * @param ctx the parse tree
	 */
	void exitBlockStatement(MySQLParser.BlockStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void enterCaseStatement(MySQLParser.CaseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#caseStatement}.
	 * @param ctx the parse tree
	 */
	void exitCaseStatement(MySQLParser.CaseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(MySQLParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(MySQLParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#iterateStatement}.
	 * @param ctx the parse tree
	 */
	void enterIterateStatement(MySQLParser.IterateStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#iterateStatement}.
	 * @param ctx the parse tree
	 */
	void exitIterateStatement(MySQLParser.IterateStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#leaveStatement}.
	 * @param ctx the parse tree
	 */
	void enterLeaveStatement(MySQLParser.LeaveStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#leaveStatement}.
	 * @param ctx the parse tree
	 */
	void exitLeaveStatement(MySQLParser.LeaveStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoopStatement(MySQLParser.LoopStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#loopStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoopStatement(MySQLParser.LoopStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#repeatStatement}.
	 * @param ctx the parse tree
	 */
	void enterRepeatStatement(MySQLParser.RepeatStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#repeatStatement}.
	 * @param ctx the parse tree
	 */
	void exitRepeatStatement(MySQLParser.RepeatStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void enterReturnStatement(MySQLParser.ReturnStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#returnStatement}.
	 * @param ctx the parse tree
	 */
	void exitReturnStatement(MySQLParser.ReturnStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(MySQLParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(MySQLParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code CloseCursor}
	 * labeled alternative in {@link MySQLParser#cursorStatement}.
	 * @param ctx the parse tree
	 */
	void enterCloseCursor(MySQLParser.CloseCursorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code CloseCursor}
	 * labeled alternative in {@link MySQLParser#cursorStatement}.
	 * @param ctx the parse tree
	 */
	void exitCloseCursor(MySQLParser.CloseCursorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code FetchCursor}
	 * labeled alternative in {@link MySQLParser#cursorStatement}.
	 * @param ctx the parse tree
	 */
	void enterFetchCursor(MySQLParser.FetchCursorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code FetchCursor}
	 * labeled alternative in {@link MySQLParser#cursorStatement}.
	 * @param ctx the parse tree
	 */
	void exitFetchCursor(MySQLParser.FetchCursorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code OpenCursor}
	 * labeled alternative in {@link MySQLParser#cursorStatement}.
	 * @param ctx the parse tree
	 */
	void enterOpenCursor(MySQLParser.OpenCursorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code OpenCursor}
	 * labeled alternative in {@link MySQLParser#cursorStatement}.
	 * @param ctx the parse tree
	 */
	void exitOpenCursor(MySQLParser.OpenCursorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#declareVariable}.
	 * @param ctx the parse tree
	 */
	void enterDeclareVariable(MySQLParser.DeclareVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#declareVariable}.
	 * @param ctx the parse tree
	 */
	void exitDeclareVariable(MySQLParser.DeclareVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#declareCondition}.
	 * @param ctx the parse tree
	 */
	void enterDeclareCondition(MySQLParser.DeclareConditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#declareCondition}.
	 * @param ctx the parse tree
	 */
	void exitDeclareCondition(MySQLParser.DeclareConditionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#declareCursor}.
	 * @param ctx the parse tree
	 */
	void enterDeclareCursor(MySQLParser.DeclareCursorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#declareCursor}.
	 * @param ctx the parse tree
	 */
	void exitDeclareCursor(MySQLParser.DeclareCursorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#declareHandler}.
	 * @param ctx the parse tree
	 */
	void enterDeclareHandler(MySQLParser.DeclareHandlerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#declareHandler}.
	 * @param ctx the parse tree
	 */
	void exitDeclareHandler(MySQLParser.DeclareHandlerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code handlerConditionCode}
	 * labeled alternative in {@link MySQLParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 */
	void enterHandlerConditionCode(MySQLParser.HandlerConditionCodeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code handlerConditionCode}
	 * labeled alternative in {@link MySQLParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 */
	void exitHandlerConditionCode(MySQLParser.HandlerConditionCodeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code handlerConditionState}
	 * labeled alternative in {@link MySQLParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 */
	void enterHandlerConditionState(MySQLParser.HandlerConditionStateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code handlerConditionState}
	 * labeled alternative in {@link MySQLParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 */
	void exitHandlerConditionState(MySQLParser.HandlerConditionStateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code handlerConditionName}
	 * labeled alternative in {@link MySQLParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 */
	void enterHandlerConditionName(MySQLParser.HandlerConditionNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code handlerConditionName}
	 * labeled alternative in {@link MySQLParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 */
	void exitHandlerConditionName(MySQLParser.HandlerConditionNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code handlerConditionWarning}
	 * labeled alternative in {@link MySQLParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 */
	void enterHandlerConditionWarning(MySQLParser.HandlerConditionWarningContext ctx);
	/**
	 * Exit a parse tree produced by the {@code handlerConditionWarning}
	 * labeled alternative in {@link MySQLParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 */
	void exitHandlerConditionWarning(MySQLParser.HandlerConditionWarningContext ctx);
	/**
	 * Enter a parse tree produced by the {@code handlerConditionNotfound}
	 * labeled alternative in {@link MySQLParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 */
	void enterHandlerConditionNotfound(MySQLParser.HandlerConditionNotfoundContext ctx);
	/**
	 * Exit a parse tree produced by the {@code handlerConditionNotfound}
	 * labeled alternative in {@link MySQLParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 */
	void exitHandlerConditionNotfound(MySQLParser.HandlerConditionNotfoundContext ctx);
	/**
	 * Enter a parse tree produced by the {@code handlerConditionException}
	 * labeled alternative in {@link MySQLParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 */
	void enterHandlerConditionException(MySQLParser.HandlerConditionExceptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code handlerConditionException}
	 * labeled alternative in {@link MySQLParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 */
	void exitHandlerConditionException(MySQLParser.HandlerConditionExceptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#procedureSqlStatement}.
	 * @param ctx the parse tree
	 */
	void enterProcedureSqlStatement(MySQLParser.ProcedureSqlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#procedureSqlStatement}.
	 * @param ctx the parse tree
	 */
	void exitProcedureSqlStatement(MySQLParser.ProcedureSqlStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#caseAlternative}.
	 * @param ctx the parse tree
	 */
	void enterCaseAlternative(MySQLParser.CaseAlternativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#caseAlternative}.
	 * @param ctx the parse tree
	 */
	void exitCaseAlternative(MySQLParser.CaseAlternativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#elifAlternative}.
	 * @param ctx the parse tree
	 */
	void enterElifAlternative(MySQLParser.ElifAlternativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#elifAlternative}.
	 * @param ctx the parse tree
	 */
	void exitElifAlternative(MySQLParser.ElifAlternativeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterUserMysqlV56}
	 * labeled alternative in {@link MySQLParser#alterUser}.
	 * @param ctx the parse tree
	 */
	void enterAlterUserMysqlV56(MySQLParser.AlterUserMysqlV56Context ctx);
	/**
	 * Exit a parse tree produced by the {@code alterUserMysqlV56}
	 * labeled alternative in {@link MySQLParser#alterUser}.
	 * @param ctx the parse tree
	 */
	void exitAlterUserMysqlV56(MySQLParser.AlterUserMysqlV56Context ctx);
	/**
	 * Enter a parse tree produced by the {@code alterUserMysqlV57}
	 * labeled alternative in {@link MySQLParser#alterUser}.
	 * @param ctx the parse tree
	 */
	void enterAlterUserMysqlV57(MySQLParser.AlterUserMysqlV57Context ctx);
	/**
	 * Exit a parse tree produced by the {@code alterUserMysqlV57}
	 * labeled alternative in {@link MySQLParser#alterUser}.
	 * @param ctx the parse tree
	 */
	void exitAlterUserMysqlV57(MySQLParser.AlterUserMysqlV57Context ctx);
	/**
	 * Enter a parse tree produced by the {@code createUserMysqlV56}
	 * labeled alternative in {@link MySQLParser#createUser}.
	 * @param ctx the parse tree
	 */
	void enterCreateUserMysqlV56(MySQLParser.CreateUserMysqlV56Context ctx);
	/**
	 * Exit a parse tree produced by the {@code createUserMysqlV56}
	 * labeled alternative in {@link MySQLParser#createUser}.
	 * @param ctx the parse tree
	 */
	void exitCreateUserMysqlV56(MySQLParser.CreateUserMysqlV56Context ctx);
	/**
	 * Enter a parse tree produced by the {@code createUserMysqlV57}
	 * labeled alternative in {@link MySQLParser#createUser}.
	 * @param ctx the parse tree
	 */
	void enterCreateUserMysqlV57(MySQLParser.CreateUserMysqlV57Context ctx);
	/**
	 * Exit a parse tree produced by the {@code createUserMysqlV57}
	 * labeled alternative in {@link MySQLParser#createUser}.
	 * @param ctx the parse tree
	 */
	void exitCreateUserMysqlV57(MySQLParser.CreateUserMysqlV57Context ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#dropUser}.
	 * @param ctx the parse tree
	 */
	void enterDropUser(MySQLParser.DropUserContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#dropUser}.
	 * @param ctx the parse tree
	 */
	void exitDropUser(MySQLParser.DropUserContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#grantStatement}.
	 * @param ctx the parse tree
	 */
	void enterGrantStatement(MySQLParser.GrantStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#grantStatement}.
	 * @param ctx the parse tree
	 */
	void exitGrantStatement(MySQLParser.GrantStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#grantProxy}.
	 * @param ctx the parse tree
	 */
	void enterGrantProxy(MySQLParser.GrantProxyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#grantProxy}.
	 * @param ctx the parse tree
	 */
	void exitGrantProxy(MySQLParser.GrantProxyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#renameUser}.
	 * @param ctx the parse tree
	 */
	void enterRenameUser(MySQLParser.RenameUserContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#renameUser}.
	 * @param ctx the parse tree
	 */
	void exitRenameUser(MySQLParser.RenameUserContext ctx);
	/**
	 * Enter a parse tree produced by the {@code detailRevoke}
	 * labeled alternative in {@link MySQLParser#revokeStatement}.
	 * @param ctx the parse tree
	 */
	void enterDetailRevoke(MySQLParser.DetailRevokeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code detailRevoke}
	 * labeled alternative in {@link MySQLParser#revokeStatement}.
	 * @param ctx the parse tree
	 */
	void exitDetailRevoke(MySQLParser.DetailRevokeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code shortRevoke}
	 * labeled alternative in {@link MySQLParser#revokeStatement}.
	 * @param ctx the parse tree
	 */
	void enterShortRevoke(MySQLParser.ShortRevokeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code shortRevoke}
	 * labeled alternative in {@link MySQLParser#revokeStatement}.
	 * @param ctx the parse tree
	 */
	void exitShortRevoke(MySQLParser.ShortRevokeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#revokeProxy}.
	 * @param ctx the parse tree
	 */
	void enterRevokeProxy(MySQLParser.RevokeProxyContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#revokeProxy}.
	 * @param ctx the parse tree
	 */
	void exitRevokeProxy(MySQLParser.RevokeProxyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#setPasswordStatement}.
	 * @param ctx the parse tree
	 */
	void enterSetPasswordStatement(MySQLParser.SetPasswordStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#setPasswordStatement}.
	 * @param ctx the parse tree
	 */
	void exitSetPasswordStatement(MySQLParser.SetPasswordStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#userSpecification}.
	 * @param ctx the parse tree
	 */
	void enterUserSpecification(MySQLParser.UserSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#userSpecification}.
	 * @param ctx the parse tree
	 */
	void exitUserSpecification(MySQLParser.UserSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code passwordAuthOption}
	 * labeled alternative in {@link MySQLParser#userAuthOption}.
	 * @param ctx the parse tree
	 */
	void enterPasswordAuthOption(MySQLParser.PasswordAuthOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code passwordAuthOption}
	 * labeled alternative in {@link MySQLParser#userAuthOption}.
	 * @param ctx the parse tree
	 */
	void exitPasswordAuthOption(MySQLParser.PasswordAuthOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringAuthOption}
	 * labeled alternative in {@link MySQLParser#userAuthOption}.
	 * @param ctx the parse tree
	 */
	void enterStringAuthOption(MySQLParser.StringAuthOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringAuthOption}
	 * labeled alternative in {@link MySQLParser#userAuthOption}.
	 * @param ctx the parse tree
	 */
	void exitStringAuthOption(MySQLParser.StringAuthOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hashAuthOption}
	 * labeled alternative in {@link MySQLParser#userAuthOption}.
	 * @param ctx the parse tree
	 */
	void enterHashAuthOption(MySQLParser.HashAuthOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hashAuthOption}
	 * labeled alternative in {@link MySQLParser#userAuthOption}.
	 * @param ctx the parse tree
	 */
	void exitHashAuthOption(MySQLParser.HashAuthOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleAuthOption}
	 * labeled alternative in {@link MySQLParser#userAuthOption}.
	 * @param ctx the parse tree
	 */
	void enterSimpleAuthOption(MySQLParser.SimpleAuthOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleAuthOption}
	 * labeled alternative in {@link MySQLParser#userAuthOption}.
	 * @param ctx the parse tree
	 */
	void exitSimpleAuthOption(MySQLParser.SimpleAuthOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#tlsOption}.
	 * @param ctx the parse tree
	 */
	void enterTlsOption(MySQLParser.TlsOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#tlsOption}.
	 * @param ctx the parse tree
	 */
	void exitTlsOption(MySQLParser.TlsOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#userResourceOption}.
	 * @param ctx the parse tree
	 */
	void enterUserResourceOption(MySQLParser.UserResourceOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#userResourceOption}.
	 * @param ctx the parse tree
	 */
	void exitUserResourceOption(MySQLParser.UserResourceOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#userPasswordOption}.
	 * @param ctx the parse tree
	 */
	void enterUserPasswordOption(MySQLParser.UserPasswordOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#userPasswordOption}.
	 * @param ctx the parse tree
	 */
	void exitUserPasswordOption(MySQLParser.UserPasswordOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#userLockOption}.
	 * @param ctx the parse tree
	 */
	void enterUserLockOption(MySQLParser.UserLockOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#userLockOption}.
	 * @param ctx the parse tree
	 */
	void exitUserLockOption(MySQLParser.UserLockOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#privelegeClause}.
	 * @param ctx the parse tree
	 */
	void enterPrivelegeClause(MySQLParser.PrivelegeClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#privelegeClause}.
	 * @param ctx the parse tree
	 */
	void exitPrivelegeClause(MySQLParser.PrivelegeClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#privilege}.
	 * @param ctx the parse tree
	 */
	void enterPrivilege(MySQLParser.PrivilegeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#privilege}.
	 * @param ctx the parse tree
	 */
	void exitPrivilege(MySQLParser.PrivilegeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code currentSchemaPriviLevel}
	 * labeled alternative in {@link MySQLParser#privilegeLevel}.
	 * @param ctx the parse tree
	 */
	void enterCurrentSchemaPriviLevel(MySQLParser.CurrentSchemaPriviLevelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code currentSchemaPriviLevel}
	 * labeled alternative in {@link MySQLParser#privilegeLevel}.
	 * @param ctx the parse tree
	 */
	void exitCurrentSchemaPriviLevel(MySQLParser.CurrentSchemaPriviLevelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code globalPrivLevel}
	 * labeled alternative in {@link MySQLParser#privilegeLevel}.
	 * @param ctx the parse tree
	 */
	void enterGlobalPrivLevel(MySQLParser.GlobalPrivLevelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code globalPrivLevel}
	 * labeled alternative in {@link MySQLParser#privilegeLevel}.
	 * @param ctx the parse tree
	 */
	void exitGlobalPrivLevel(MySQLParser.GlobalPrivLevelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code definiteSchemaPrivLevel}
	 * labeled alternative in {@link MySQLParser#privilegeLevel}.
	 * @param ctx the parse tree
	 */
	void enterDefiniteSchemaPrivLevel(MySQLParser.DefiniteSchemaPrivLevelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code definiteSchemaPrivLevel}
	 * labeled alternative in {@link MySQLParser#privilegeLevel}.
	 * @param ctx the parse tree
	 */
	void exitDefiniteSchemaPrivLevel(MySQLParser.DefiniteSchemaPrivLevelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code definiteFullTablePrivLevel}
	 * labeled alternative in {@link MySQLParser#privilegeLevel}.
	 * @param ctx the parse tree
	 */
	void enterDefiniteFullTablePrivLevel(MySQLParser.DefiniteFullTablePrivLevelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code definiteFullTablePrivLevel}
	 * labeled alternative in {@link MySQLParser#privilegeLevel}.
	 * @param ctx the parse tree
	 */
	void exitDefiniteFullTablePrivLevel(MySQLParser.DefiniteFullTablePrivLevelContext ctx);
	/**
	 * Enter a parse tree produced by the {@code definiteFullTablePrivLevel2}
	 * labeled alternative in {@link MySQLParser#privilegeLevel}.
	 * @param ctx the parse tree
	 */
	void enterDefiniteFullTablePrivLevel2(MySQLParser.DefiniteFullTablePrivLevel2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code definiteFullTablePrivLevel2}
	 * labeled alternative in {@link MySQLParser#privilegeLevel}.
	 * @param ctx the parse tree
	 */
	void exitDefiniteFullTablePrivLevel2(MySQLParser.DefiniteFullTablePrivLevel2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code definiteTablePrivLevel}
	 * labeled alternative in {@link MySQLParser#privilegeLevel}.
	 * @param ctx the parse tree
	 */
	void enterDefiniteTablePrivLevel(MySQLParser.DefiniteTablePrivLevelContext ctx);
	/**
	 * Exit a parse tree produced by the {@code definiteTablePrivLevel}
	 * labeled alternative in {@link MySQLParser#privilegeLevel}.
	 * @param ctx the parse tree
	 */
	void exitDefiniteTablePrivLevel(MySQLParser.DefiniteTablePrivLevelContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#renameUserClause}.
	 * @param ctx the parse tree
	 */
	void enterRenameUserClause(MySQLParser.RenameUserClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#renameUserClause}.
	 * @param ctx the parse tree
	 */
	void exitRenameUserClause(MySQLParser.RenameUserClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#analyzeTable}.
	 * @param ctx the parse tree
	 */
	void enterAnalyzeTable(MySQLParser.AnalyzeTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#analyzeTable}.
	 * @param ctx the parse tree
	 */
	void exitAnalyzeTable(MySQLParser.AnalyzeTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#checkTable}.
	 * @param ctx the parse tree
	 */
	void enterCheckTable(MySQLParser.CheckTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#checkTable}.
	 * @param ctx the parse tree
	 */
	void exitCheckTable(MySQLParser.CheckTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#checksumTable}.
	 * @param ctx the parse tree
	 */
	void enterChecksumTable(MySQLParser.ChecksumTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#checksumTable}.
	 * @param ctx the parse tree
	 */
	void exitChecksumTable(MySQLParser.ChecksumTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#optimizeTable}.
	 * @param ctx the parse tree
	 */
	void enterOptimizeTable(MySQLParser.OptimizeTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#optimizeTable}.
	 * @param ctx the parse tree
	 */
	void exitOptimizeTable(MySQLParser.OptimizeTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#repairTable}.
	 * @param ctx the parse tree
	 */
	void enterRepairTable(MySQLParser.RepairTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#repairTable}.
	 * @param ctx the parse tree
	 */
	void exitRepairTable(MySQLParser.RepairTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#checkTableOption}.
	 * @param ctx the parse tree
	 */
	void enterCheckTableOption(MySQLParser.CheckTableOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#checkTableOption}.
	 * @param ctx the parse tree
	 */
	void exitCheckTableOption(MySQLParser.CheckTableOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#createUdfunction}.
	 * @param ctx the parse tree
	 */
	void enterCreateUdfunction(MySQLParser.CreateUdfunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#createUdfunction}.
	 * @param ctx the parse tree
	 */
	void exitCreateUdfunction(MySQLParser.CreateUdfunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#installPlugin}.
	 * @param ctx the parse tree
	 */
	void enterInstallPlugin(MySQLParser.InstallPluginContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#installPlugin}.
	 * @param ctx the parse tree
	 */
	void exitInstallPlugin(MySQLParser.InstallPluginContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#uninstallPlugin}.
	 * @param ctx the parse tree
	 */
	void enterUninstallPlugin(MySQLParser.UninstallPluginContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#uninstallPlugin}.
	 * @param ctx the parse tree
	 */
	void exitUninstallPlugin(MySQLParser.UninstallPluginContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setVariable}
	 * labeled alternative in {@link MySQLParser#setStatement}.
	 * @param ctx the parse tree
	 */
	void enterSetVariable(MySQLParser.SetVariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setVariable}
	 * labeled alternative in {@link MySQLParser#setStatement}.
	 * @param ctx the parse tree
	 */
	void exitSetVariable(MySQLParser.SetVariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setCharset}
	 * labeled alternative in {@link MySQLParser#setStatement}.
	 * @param ctx the parse tree
	 */
	void enterSetCharset(MySQLParser.SetCharsetContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setCharset}
	 * labeled alternative in {@link MySQLParser#setStatement}.
	 * @param ctx the parse tree
	 */
	void exitSetCharset(MySQLParser.SetCharsetContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setNames}
	 * labeled alternative in {@link MySQLParser#setStatement}.
	 * @param ctx the parse tree
	 */
	void enterSetNames(MySQLParser.SetNamesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setNames}
	 * labeled alternative in {@link MySQLParser#setStatement}.
	 * @param ctx the parse tree
	 */
	void exitSetNames(MySQLParser.SetNamesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setPassword}
	 * labeled alternative in {@link MySQLParser#setStatement}.
	 * @param ctx the parse tree
	 */
	void enterSetPassword(MySQLParser.SetPasswordContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setPassword}
	 * labeled alternative in {@link MySQLParser#setStatement}.
	 * @param ctx the parse tree
	 */
	void exitSetPassword(MySQLParser.SetPasswordContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setTransaction}
	 * labeled alternative in {@link MySQLParser#setStatement}.
	 * @param ctx the parse tree
	 */
	void enterSetTransaction(MySQLParser.SetTransactionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setTransaction}
	 * labeled alternative in {@link MySQLParser#setStatement}.
	 * @param ctx the parse tree
	 */
	void exitSetTransaction(MySQLParser.SetTransactionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setAutocommit}
	 * labeled alternative in {@link MySQLParser#setStatement}.
	 * @param ctx the parse tree
	 */
	void enterSetAutocommit(MySQLParser.SetAutocommitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setAutocommit}
	 * labeled alternative in {@link MySQLParser#setStatement}.
	 * @param ctx the parse tree
	 */
	void exitSetAutocommit(MySQLParser.SetAutocommitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setNewValueInsideTrigger}
	 * labeled alternative in {@link MySQLParser#setStatement}.
	 * @param ctx the parse tree
	 */
	void enterSetNewValueInsideTrigger(MySQLParser.SetNewValueInsideTriggerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setNewValueInsideTrigger}
	 * labeled alternative in {@link MySQLParser#setStatement}.
	 * @param ctx the parse tree
	 */
	void exitSetNewValueInsideTrigger(MySQLParser.SetNewValueInsideTriggerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showMasterLogs}
	 * labeled alternative in {@link MySQLParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowMasterLogs(MySQLParser.ShowMasterLogsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showMasterLogs}
	 * labeled alternative in {@link MySQLParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowMasterLogs(MySQLParser.ShowMasterLogsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showLogEvents}
	 * labeled alternative in {@link MySQLParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowLogEvents(MySQLParser.ShowLogEventsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showLogEvents}
	 * labeled alternative in {@link MySQLParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowLogEvents(MySQLParser.ShowLogEventsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showObjectFilter}
	 * labeled alternative in {@link MySQLParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowObjectFilter(MySQLParser.ShowObjectFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showObjectFilter}
	 * labeled alternative in {@link MySQLParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowObjectFilter(MySQLParser.ShowObjectFilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showColumns}
	 * labeled alternative in {@link MySQLParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowColumns(MySQLParser.ShowColumnsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showColumns}
	 * labeled alternative in {@link MySQLParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowColumns(MySQLParser.ShowColumnsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showCreateDb}
	 * labeled alternative in {@link MySQLParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowCreateDb(MySQLParser.ShowCreateDbContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showCreateDb}
	 * labeled alternative in {@link MySQLParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowCreateDb(MySQLParser.ShowCreateDbContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showCreateFullIdObject}
	 * labeled alternative in {@link MySQLParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowCreateFullIdObject(MySQLParser.ShowCreateFullIdObjectContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showCreateFullIdObject}
	 * labeled alternative in {@link MySQLParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowCreateFullIdObject(MySQLParser.ShowCreateFullIdObjectContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showCreateUser}
	 * labeled alternative in {@link MySQLParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowCreateUser(MySQLParser.ShowCreateUserContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showCreateUser}
	 * labeled alternative in {@link MySQLParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowCreateUser(MySQLParser.ShowCreateUserContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showEngine}
	 * labeled alternative in {@link MySQLParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowEngine(MySQLParser.ShowEngineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showEngine}
	 * labeled alternative in {@link MySQLParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowEngine(MySQLParser.ShowEngineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showGlobalInfo}
	 * labeled alternative in {@link MySQLParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowGlobalInfo(MySQLParser.ShowGlobalInfoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showGlobalInfo}
	 * labeled alternative in {@link MySQLParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowGlobalInfo(MySQLParser.ShowGlobalInfoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showErrors}
	 * labeled alternative in {@link MySQLParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowErrors(MySQLParser.ShowErrorsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showErrors}
	 * labeled alternative in {@link MySQLParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowErrors(MySQLParser.ShowErrorsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showCountErrors}
	 * labeled alternative in {@link MySQLParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowCountErrors(MySQLParser.ShowCountErrorsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showCountErrors}
	 * labeled alternative in {@link MySQLParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowCountErrors(MySQLParser.ShowCountErrorsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showSchemaFilter}
	 * labeled alternative in {@link MySQLParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowSchemaFilter(MySQLParser.ShowSchemaFilterContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showSchemaFilter}
	 * labeled alternative in {@link MySQLParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowSchemaFilter(MySQLParser.ShowSchemaFilterContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showRoutine}
	 * labeled alternative in {@link MySQLParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowRoutine(MySQLParser.ShowRoutineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showRoutine}
	 * labeled alternative in {@link MySQLParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowRoutine(MySQLParser.ShowRoutineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showGrants}
	 * labeled alternative in {@link MySQLParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowGrants(MySQLParser.ShowGrantsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showGrants}
	 * labeled alternative in {@link MySQLParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowGrants(MySQLParser.ShowGrantsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showIndexes}
	 * labeled alternative in {@link MySQLParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowIndexes(MySQLParser.ShowIndexesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showIndexes}
	 * labeled alternative in {@link MySQLParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowIndexes(MySQLParser.ShowIndexesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showOpenTables}
	 * labeled alternative in {@link MySQLParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowOpenTables(MySQLParser.ShowOpenTablesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showOpenTables}
	 * labeled alternative in {@link MySQLParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowOpenTables(MySQLParser.ShowOpenTablesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showProfile}
	 * labeled alternative in {@link MySQLParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowProfile(MySQLParser.ShowProfileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showProfile}
	 * labeled alternative in {@link MySQLParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowProfile(MySQLParser.ShowProfileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showSlaveStatus}
	 * labeled alternative in {@link MySQLParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void enterShowSlaveStatus(MySQLParser.ShowSlaveStatusContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showSlaveStatus}
	 * labeled alternative in {@link MySQLParser#showStatement}.
	 * @param ctx the parse tree
	 */
	void exitShowSlaveStatus(MySQLParser.ShowSlaveStatusContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#variableClause}.
	 * @param ctx the parse tree
	 */
	void enterVariableClause(MySQLParser.VariableClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#variableClause}.
	 * @param ctx the parse tree
	 */
	void exitVariableClause(MySQLParser.VariableClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#showCommonEntity}.
	 * @param ctx the parse tree
	 */
	void enterShowCommonEntity(MySQLParser.ShowCommonEntityContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#showCommonEntity}.
	 * @param ctx the parse tree
	 */
	void exitShowCommonEntity(MySQLParser.ShowCommonEntityContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#showFilter}.
	 * @param ctx the parse tree
	 */
	void enterShowFilter(MySQLParser.ShowFilterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#showFilter}.
	 * @param ctx the parse tree
	 */
	void exitShowFilter(MySQLParser.ShowFilterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#showGlobalInfoClause}.
	 * @param ctx the parse tree
	 */
	void enterShowGlobalInfoClause(MySQLParser.ShowGlobalInfoClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#showGlobalInfoClause}.
	 * @param ctx the parse tree
	 */
	void exitShowGlobalInfoClause(MySQLParser.ShowGlobalInfoClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#showSchemaEntity}.
	 * @param ctx the parse tree
	 */
	void enterShowSchemaEntity(MySQLParser.ShowSchemaEntityContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#showSchemaEntity}.
	 * @param ctx the parse tree
	 */
	void exitShowSchemaEntity(MySQLParser.ShowSchemaEntityContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#showProfileType}.
	 * @param ctx the parse tree
	 */
	void enterShowProfileType(MySQLParser.ShowProfileTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#showProfileType}.
	 * @param ctx the parse tree
	 */
	void exitShowProfileType(MySQLParser.ShowProfileTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#binlogStatement}.
	 * @param ctx the parse tree
	 */
	void enterBinlogStatement(MySQLParser.BinlogStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#binlogStatement}.
	 * @param ctx the parse tree
	 */
	void exitBinlogStatement(MySQLParser.BinlogStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#cacheIndexStatement}.
	 * @param ctx the parse tree
	 */
	void enterCacheIndexStatement(MySQLParser.CacheIndexStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#cacheIndexStatement}.
	 * @param ctx the parse tree
	 */
	void exitCacheIndexStatement(MySQLParser.CacheIndexStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#flushStatement}.
	 * @param ctx the parse tree
	 */
	void enterFlushStatement(MySQLParser.FlushStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#flushStatement}.
	 * @param ctx the parse tree
	 */
	void exitFlushStatement(MySQLParser.FlushStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#killStatement}.
	 * @param ctx the parse tree
	 */
	void enterKillStatement(MySQLParser.KillStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#killStatement}.
	 * @param ctx the parse tree
	 */
	void exitKillStatement(MySQLParser.KillStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#loadIndexIntoCache}.
	 * @param ctx the parse tree
	 */
	void enterLoadIndexIntoCache(MySQLParser.LoadIndexIntoCacheContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#loadIndexIntoCache}.
	 * @param ctx the parse tree
	 */
	void exitLoadIndexIntoCache(MySQLParser.LoadIndexIntoCacheContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#resetStatement}.
	 * @param ctx the parse tree
	 */
	void enterResetStatement(MySQLParser.ResetStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#resetStatement}.
	 * @param ctx the parse tree
	 */
	void exitResetStatement(MySQLParser.ResetStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#shutdownStatement}.
	 * @param ctx the parse tree
	 */
	void enterShutdownStatement(MySQLParser.ShutdownStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#shutdownStatement}.
	 * @param ctx the parse tree
	 */
	void exitShutdownStatement(MySQLParser.ShutdownStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#tableIndexes}.
	 * @param ctx the parse tree
	 */
	void enterTableIndexes(MySQLParser.TableIndexesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#tableIndexes}.
	 * @param ctx the parse tree
	 */
	void exitTableIndexes(MySQLParser.TableIndexesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleFlushOption}
	 * labeled alternative in {@link MySQLParser#flushOption}.
	 * @param ctx the parse tree
	 */
	void enterSimpleFlushOption(MySQLParser.SimpleFlushOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleFlushOption}
	 * labeled alternative in {@link MySQLParser#flushOption}.
	 * @param ctx the parse tree
	 */
	void exitSimpleFlushOption(MySQLParser.SimpleFlushOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code channelFlushOption}
	 * labeled alternative in {@link MySQLParser#flushOption}.
	 * @param ctx the parse tree
	 */
	void enterChannelFlushOption(MySQLParser.ChannelFlushOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code channelFlushOption}
	 * labeled alternative in {@link MySQLParser#flushOption}.
	 * @param ctx the parse tree
	 */
	void exitChannelFlushOption(MySQLParser.ChannelFlushOptionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableFlushOption}
	 * labeled alternative in {@link MySQLParser#flushOption}.
	 * @param ctx the parse tree
	 */
	void enterTableFlushOption(MySQLParser.TableFlushOptionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableFlushOption}
	 * labeled alternative in {@link MySQLParser#flushOption}.
	 * @param ctx the parse tree
	 */
	void exitTableFlushOption(MySQLParser.TableFlushOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#flushTableOption}.
	 * @param ctx the parse tree
	 */
	void enterFlushTableOption(MySQLParser.FlushTableOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#flushTableOption}.
	 * @param ctx the parse tree
	 */
	void exitFlushTableOption(MySQLParser.FlushTableOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#loadedTableIndexes}.
	 * @param ctx the parse tree
	 */
	void enterLoadedTableIndexes(MySQLParser.LoadedTableIndexesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#loadedTableIndexes}.
	 * @param ctx the parse tree
	 */
	void exitLoadedTableIndexes(MySQLParser.LoadedTableIndexesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#simpleDescribeStatement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleDescribeStatement(MySQLParser.SimpleDescribeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#simpleDescribeStatement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleDescribeStatement(MySQLParser.SimpleDescribeStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#fullDescribeStatement}.
	 * @param ctx the parse tree
	 */
	void enterFullDescribeStatement(MySQLParser.FullDescribeStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#fullDescribeStatement}.
	 * @param ctx the parse tree
	 */
	void exitFullDescribeStatement(MySQLParser.FullDescribeStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#helpStatement}.
	 * @param ctx the parse tree
	 */
	void enterHelpStatement(MySQLParser.HelpStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#helpStatement}.
	 * @param ctx the parse tree
	 */
	void exitHelpStatement(MySQLParser.HelpStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#useStatement}.
	 * @param ctx the parse tree
	 */
	void enterUseStatement(MySQLParser.UseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#useStatement}.
	 * @param ctx the parse tree
	 */
	void exitUseStatement(MySQLParser.UseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#signalStatement}.
	 * @param ctx the parse tree
	 */
	void enterSignalStatement(MySQLParser.SignalStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#signalStatement}.
	 * @param ctx the parse tree
	 */
	void exitSignalStatement(MySQLParser.SignalStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#resignalStatement}.
	 * @param ctx the parse tree
	 */
	void enterResignalStatement(MySQLParser.ResignalStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#resignalStatement}.
	 * @param ctx the parse tree
	 */
	void exitResignalStatement(MySQLParser.ResignalStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#signalConditionInformation}.
	 * @param ctx the parse tree
	 */
	void enterSignalConditionInformation(MySQLParser.SignalConditionInformationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#signalConditionInformation}.
	 * @param ctx the parse tree
	 */
	void exitSignalConditionInformation(MySQLParser.SignalConditionInformationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#diagnosticsStatement}.
	 * @param ctx the parse tree
	 */
	void enterDiagnosticsStatement(MySQLParser.DiagnosticsStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#diagnosticsStatement}.
	 * @param ctx the parse tree
	 */
	void exitDiagnosticsStatement(MySQLParser.DiagnosticsStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#diagnosticsConditionInformationName}.
	 * @param ctx the parse tree
	 */
	void enterDiagnosticsConditionInformationName(MySQLParser.DiagnosticsConditionInformationNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#diagnosticsConditionInformationName}.
	 * @param ctx the parse tree
	 */
	void exitDiagnosticsConditionInformationName(MySQLParser.DiagnosticsConditionInformationNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code describeStatements}
	 * labeled alternative in {@link MySQLParser#describeObjectClause}.
	 * @param ctx the parse tree
	 */
	void enterDescribeStatements(MySQLParser.DescribeStatementsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code describeStatements}
	 * labeled alternative in {@link MySQLParser#describeObjectClause}.
	 * @param ctx the parse tree
	 */
	void exitDescribeStatements(MySQLParser.DescribeStatementsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code describeConnection}
	 * labeled alternative in {@link MySQLParser#describeObjectClause}.
	 * @param ctx the parse tree
	 */
	void enterDescribeConnection(MySQLParser.DescribeConnectionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code describeConnection}
	 * labeled alternative in {@link MySQLParser#describeObjectClause}.
	 * @param ctx the parse tree
	 */
	void exitDescribeConnection(MySQLParser.DescribeConnectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#fullId}.
	 * @param ctx the parse tree
	 */
	void enterFullId(MySQLParser.FullIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#fullId}.
	 * @param ctx the parse tree
	 */
	void exitFullId(MySQLParser.FullIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#tableName}.
	 * @param ctx the parse tree
	 */
	void enterTableName(MySQLParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#tableName}.
	 * @param ctx the parse tree
	 */
	void exitTableName(MySQLParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#fullColumnName}.
	 * @param ctx the parse tree
	 */
	void enterFullColumnName(MySQLParser.FullColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#fullColumnName}.
	 * @param ctx the parse tree
	 */
	void exitFullColumnName(MySQLParser.FullColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#indexColumnName}.
	 * @param ctx the parse tree
	 */
	void enterIndexColumnName(MySQLParser.IndexColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#indexColumnName}.
	 * @param ctx the parse tree
	 */
	void exitIndexColumnName(MySQLParser.IndexColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#userName}.
	 * @param ctx the parse tree
	 */
	void enterUserName(MySQLParser.UserNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#userName}.
	 * @param ctx the parse tree
	 */
	void exitUserName(MySQLParser.UserNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#mysqlVariable}.
	 * @param ctx the parse tree
	 */
	void enterMysqlVariable(MySQLParser.MysqlVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#mysqlVariable}.
	 * @param ctx the parse tree
	 */
	void exitMysqlVariable(MySQLParser.MysqlVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#charsetName}.
	 * @param ctx the parse tree
	 */
	void enterCharsetName(MySQLParser.CharsetNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#charsetName}.
	 * @param ctx the parse tree
	 */
	void exitCharsetName(MySQLParser.CharsetNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#collationName}.
	 * @param ctx the parse tree
	 */
	void enterCollationName(MySQLParser.CollationNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#collationName}.
	 * @param ctx the parse tree
	 */
	void exitCollationName(MySQLParser.CollationNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#engineName}.
	 * @param ctx the parse tree
	 */
	void enterEngineName(MySQLParser.EngineNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#engineName}.
	 * @param ctx the parse tree
	 */
	void exitEngineName(MySQLParser.EngineNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#uuidSet}.
	 * @param ctx the parse tree
	 */
	void enterUuidSet(MySQLParser.UuidSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#uuidSet}.
	 * @param ctx the parse tree
	 */
	void exitUuidSet(MySQLParser.UuidSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#xid}.
	 * @param ctx the parse tree
	 */
	void enterXid(MySQLParser.XidContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#xid}.
	 * @param ctx the parse tree
	 */
	void exitXid(MySQLParser.XidContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#xuidStringId}.
	 * @param ctx the parse tree
	 */
	void enterXuidStringId(MySQLParser.XuidStringIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#xuidStringId}.
	 * @param ctx the parse tree
	 */
	void exitXuidStringId(MySQLParser.XuidStringIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#authPlugin}.
	 * @param ctx the parse tree
	 */
	void enterAuthPlugin(MySQLParser.AuthPluginContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#authPlugin}.
	 * @param ctx the parse tree
	 */
	void exitAuthPlugin(MySQLParser.AuthPluginContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#uid}.
	 * @param ctx the parse tree
	 */
	void enterUid(MySQLParser.UidContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#uid}.
	 * @param ctx the parse tree
	 */
	void exitUid(MySQLParser.UidContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#simpleId}.
	 * @param ctx the parse tree
	 */
	void enterSimpleId(MySQLParser.SimpleIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#simpleId}.
	 * @param ctx the parse tree
	 */
	void exitSimpleId(MySQLParser.SimpleIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#dottedId}.
	 * @param ctx the parse tree
	 */
	void enterDottedId(MySQLParser.DottedIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#dottedId}.
	 * @param ctx the parse tree
	 */
	void exitDottedId(MySQLParser.DottedIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#decimalLiteral}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLiteral(MySQLParser.DecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#decimalLiteral}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLiteral(MySQLParser.DecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#fileSizeLiteral}.
	 * @param ctx the parse tree
	 */
	void enterFileSizeLiteral(MySQLParser.FileSizeLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#fileSizeLiteral}.
	 * @param ctx the parse tree
	 */
	void exitFileSizeLiteral(MySQLParser.FileSizeLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(MySQLParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#stringLiteral}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(MySQLParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(MySQLParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#booleanLiteral}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(MySQLParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#hexadecimalLiteral}.
	 * @param ctx the parse tree
	 */
	void enterHexadecimalLiteral(MySQLParser.HexadecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#hexadecimalLiteral}.
	 * @param ctx the parse tree
	 */
	void exitHexadecimalLiteral(MySQLParser.HexadecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#nullNotnull}.
	 * @param ctx the parse tree
	 */
	void enterNullNotnull(MySQLParser.NullNotnullContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#nullNotnull}.
	 * @param ctx the parse tree
	 */
	void exitNullNotnull(MySQLParser.NullNotnullContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(MySQLParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(MySQLParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringDataType}
	 * labeled alternative in {@link MySQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterStringDataType(MySQLParser.StringDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringDataType}
	 * labeled alternative in {@link MySQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitStringDataType(MySQLParser.StringDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nationalStringDataType}
	 * labeled alternative in {@link MySQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterNationalStringDataType(MySQLParser.NationalStringDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nationalStringDataType}
	 * labeled alternative in {@link MySQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitNationalStringDataType(MySQLParser.NationalStringDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nationalVaryingStringDataType}
	 * labeled alternative in {@link MySQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterNationalVaryingStringDataType(MySQLParser.NationalVaryingStringDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nationalVaryingStringDataType}
	 * labeled alternative in {@link MySQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitNationalVaryingStringDataType(MySQLParser.NationalVaryingStringDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dimensionDataType}
	 * labeled alternative in {@link MySQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDimensionDataType(MySQLParser.DimensionDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dimensionDataType}
	 * labeled alternative in {@link MySQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDimensionDataType(MySQLParser.DimensionDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleDataType}
	 * labeled alternative in {@link MySQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterSimpleDataType(MySQLParser.SimpleDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleDataType}
	 * labeled alternative in {@link MySQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitSimpleDataType(MySQLParser.SimpleDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code collectionDataType}
	 * labeled alternative in {@link MySQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterCollectionDataType(MySQLParser.CollectionDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code collectionDataType}
	 * labeled alternative in {@link MySQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitCollectionDataType(MySQLParser.CollectionDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code spatialDataType}
	 * labeled alternative in {@link MySQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterSpatialDataType(MySQLParser.SpatialDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code spatialDataType}
	 * labeled alternative in {@link MySQLParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitSpatialDataType(MySQLParser.SpatialDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#collectionOptions}.
	 * @param ctx the parse tree
	 */
	void enterCollectionOptions(MySQLParser.CollectionOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#collectionOptions}.
	 * @param ctx the parse tree
	 */
	void exitCollectionOptions(MySQLParser.CollectionOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#convertedDataType}.
	 * @param ctx the parse tree
	 */
	void enterConvertedDataType(MySQLParser.ConvertedDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#convertedDataType}.
	 * @param ctx the parse tree
	 */
	void exitConvertedDataType(MySQLParser.ConvertedDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#lengthOneDimension}.
	 * @param ctx the parse tree
	 */
	void enterLengthOneDimension(MySQLParser.LengthOneDimensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#lengthOneDimension}.
	 * @param ctx the parse tree
	 */
	void exitLengthOneDimension(MySQLParser.LengthOneDimensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#lengthTwoDimension}.
	 * @param ctx the parse tree
	 */
	void enterLengthTwoDimension(MySQLParser.LengthTwoDimensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#lengthTwoDimension}.
	 * @param ctx the parse tree
	 */
	void exitLengthTwoDimension(MySQLParser.LengthTwoDimensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#lengthTwoOptionalDimension}.
	 * @param ctx the parse tree
	 */
	void enterLengthTwoOptionalDimension(MySQLParser.LengthTwoOptionalDimensionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#lengthTwoOptionalDimension}.
	 * @param ctx the parse tree
	 */
	void exitLengthTwoOptionalDimension(MySQLParser.LengthTwoOptionalDimensionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#uidList}.
	 * @param ctx the parse tree
	 */
	void enterUidList(MySQLParser.UidListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#uidList}.
	 * @param ctx the parse tree
	 */
	void exitUidList(MySQLParser.UidListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#tables}.
	 * @param ctx the parse tree
	 */
	void enterTables(MySQLParser.TablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#tables}.
	 * @param ctx the parse tree
	 */
	void exitTables(MySQLParser.TablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#indexColumnNames}.
	 * @param ctx the parse tree
	 */
	void enterIndexColumnNames(MySQLParser.IndexColumnNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#indexColumnNames}.
	 * @param ctx the parse tree
	 */
	void exitIndexColumnNames(MySQLParser.IndexColumnNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#expressions}.
	 * @param ctx the parse tree
	 */
	void enterExpressions(MySQLParser.ExpressionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#expressions}.
	 * @param ctx the parse tree
	 */
	void exitExpressions(MySQLParser.ExpressionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#expressionsWithDefaults}.
	 * @param ctx the parse tree
	 */
	void enterExpressionsWithDefaults(MySQLParser.ExpressionsWithDefaultsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#expressionsWithDefaults}.
	 * @param ctx the parse tree
	 */
	void exitExpressionsWithDefaults(MySQLParser.ExpressionsWithDefaultsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#constants}.
	 * @param ctx the parse tree
	 */
	void enterConstants(MySQLParser.ConstantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#constants}.
	 * @param ctx the parse tree
	 */
	void exitConstants(MySQLParser.ConstantsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#simpleStrings}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStrings(MySQLParser.SimpleStringsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#simpleStrings}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStrings(MySQLParser.SimpleStringsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#userVariables}.
	 * @param ctx the parse tree
	 */
	void enterUserVariables(MySQLParser.UserVariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#userVariables}.
	 * @param ctx the parse tree
	 */
	void exitUserVariables(MySQLParser.UserVariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void enterDefaultValue(MySQLParser.DefaultValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#defaultValue}.
	 * @param ctx the parse tree
	 */
	void exitDefaultValue(MySQLParser.DefaultValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#currentTimestamp}.
	 * @param ctx the parse tree
	 */
	void enterCurrentTimestamp(MySQLParser.CurrentTimestampContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#currentTimestamp}.
	 * @param ctx the parse tree
	 */
	void exitCurrentTimestamp(MySQLParser.CurrentTimestampContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#expressionOrDefault}.
	 * @param ctx the parse tree
	 */
	void enterExpressionOrDefault(MySQLParser.ExpressionOrDefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#expressionOrDefault}.
	 * @param ctx the parse tree
	 */
	void exitExpressionOrDefault(MySQLParser.ExpressionOrDefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#ifExists}.
	 * @param ctx the parse tree
	 */
	void enterIfExists(MySQLParser.IfExistsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#ifExists}.
	 * @param ctx the parse tree
	 */
	void exitIfExists(MySQLParser.IfExistsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#ifNotExists}.
	 * @param ctx the parse tree
	 */
	void enterIfNotExists(MySQLParser.IfNotExistsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#ifNotExists}.
	 * @param ctx the parse tree
	 */
	void exitIfNotExists(MySQLParser.IfNotExistsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code specificFunctionCall}
	 * labeled alternative in {@link MySQLParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterSpecificFunctionCall(MySQLParser.SpecificFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code specificFunctionCall}
	 * labeled alternative in {@link MySQLParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitSpecificFunctionCall(MySQLParser.SpecificFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aggregateFunctionCall}
	 * labeled alternative in {@link MySQLParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterAggregateFunctionCall(MySQLParser.AggregateFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aggregateFunctionCall}
	 * labeled alternative in {@link MySQLParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitAggregateFunctionCall(MySQLParser.AggregateFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code scalarFunctionCall}
	 * labeled alternative in {@link MySQLParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterScalarFunctionCall(MySQLParser.ScalarFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code scalarFunctionCall}
	 * labeled alternative in {@link MySQLParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitScalarFunctionCall(MySQLParser.ScalarFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code udfFunctionCall}
	 * labeled alternative in {@link MySQLParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterUdfFunctionCall(MySQLParser.UdfFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code udfFunctionCall}
	 * labeled alternative in {@link MySQLParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitUdfFunctionCall(MySQLParser.UdfFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code passwordFunctionCall}
	 * labeled alternative in {@link MySQLParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterPasswordFunctionCall(MySQLParser.PasswordFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code passwordFunctionCall}
	 * labeled alternative in {@link MySQLParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitPasswordFunctionCall(MySQLParser.PasswordFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleFunctionCall}
	 * labeled alternative in {@link MySQLParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterSimpleFunctionCall(MySQLParser.SimpleFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleFunctionCall}
	 * labeled alternative in {@link MySQLParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitSimpleFunctionCall(MySQLParser.SimpleFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dataTypeFunctionCall}
	 * labeled alternative in {@link MySQLParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterDataTypeFunctionCall(MySQLParser.DataTypeFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dataTypeFunctionCall}
	 * labeled alternative in {@link MySQLParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitDataTypeFunctionCall(MySQLParser.DataTypeFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valuesFunctionCall}
	 * labeled alternative in {@link MySQLParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterValuesFunctionCall(MySQLParser.ValuesFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valuesFunctionCall}
	 * labeled alternative in {@link MySQLParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitValuesFunctionCall(MySQLParser.ValuesFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code caseFunctionCall}
	 * labeled alternative in {@link MySQLParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterCaseFunctionCall(MySQLParser.CaseFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code caseFunctionCall}
	 * labeled alternative in {@link MySQLParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitCaseFunctionCall(MySQLParser.CaseFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code charFunctionCall}
	 * labeled alternative in {@link MySQLParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterCharFunctionCall(MySQLParser.CharFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code charFunctionCall}
	 * labeled alternative in {@link MySQLParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitCharFunctionCall(MySQLParser.CharFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code positionFunctionCall}
	 * labeled alternative in {@link MySQLParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterPositionFunctionCall(MySQLParser.PositionFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code positionFunctionCall}
	 * labeled alternative in {@link MySQLParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitPositionFunctionCall(MySQLParser.PositionFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code substrFunctionCall}
	 * labeled alternative in {@link MySQLParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterSubstrFunctionCall(MySQLParser.SubstrFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code substrFunctionCall}
	 * labeled alternative in {@link MySQLParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitSubstrFunctionCall(MySQLParser.SubstrFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code trimFunctionCall}
	 * labeled alternative in {@link MySQLParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterTrimFunctionCall(MySQLParser.TrimFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code trimFunctionCall}
	 * labeled alternative in {@link MySQLParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitTrimFunctionCall(MySQLParser.TrimFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code weightFunctionCall}
	 * labeled alternative in {@link MySQLParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterWeightFunctionCall(MySQLParser.WeightFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code weightFunctionCall}
	 * labeled alternative in {@link MySQLParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitWeightFunctionCall(MySQLParser.WeightFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code extractFunctionCall}
	 * labeled alternative in {@link MySQLParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterExtractFunctionCall(MySQLParser.ExtractFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code extractFunctionCall}
	 * labeled alternative in {@link MySQLParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitExtractFunctionCall(MySQLParser.ExtractFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code getFormatFunctionCall}
	 * labeled alternative in {@link MySQLParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void enterGetFormatFunctionCall(MySQLParser.GetFormatFunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code getFormatFunctionCall}
	 * labeled alternative in {@link MySQLParser#specificFunction}.
	 * @param ctx the parse tree
	 */
	void exitGetFormatFunctionCall(MySQLParser.GetFormatFunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#caseFuncAlternative}.
	 * @param ctx the parse tree
	 */
	void enterCaseFuncAlternative(MySQLParser.CaseFuncAlternativeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#caseFuncAlternative}.
	 * @param ctx the parse tree
	 */
	void exitCaseFuncAlternative(MySQLParser.CaseFuncAlternativeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code levelWeightList}
	 * labeled alternative in {@link MySQLParser#levelsInWeightString}.
	 * @param ctx the parse tree
	 */
	void enterLevelWeightList(MySQLParser.LevelWeightListContext ctx);
	/**
	 * Exit a parse tree produced by the {@code levelWeightList}
	 * labeled alternative in {@link MySQLParser#levelsInWeightString}.
	 * @param ctx the parse tree
	 */
	void exitLevelWeightList(MySQLParser.LevelWeightListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code levelWeightRange}
	 * labeled alternative in {@link MySQLParser#levelsInWeightString}.
	 * @param ctx the parse tree
	 */
	void enterLevelWeightRange(MySQLParser.LevelWeightRangeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code levelWeightRange}
	 * labeled alternative in {@link MySQLParser#levelsInWeightString}.
	 * @param ctx the parse tree
	 */
	void exitLevelWeightRange(MySQLParser.LevelWeightRangeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#levelInWeightListElement}.
	 * @param ctx the parse tree
	 */
	void enterLevelInWeightListElement(MySQLParser.LevelInWeightListElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#levelInWeightListElement}.
	 * @param ctx the parse tree
	 */
	void exitLevelInWeightListElement(MySQLParser.LevelInWeightListElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#aggregateWindowedFunction}.
	 * @param ctx the parse tree
	 */
	void enterAggregateWindowedFunction(MySQLParser.AggregateWindowedFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#aggregateWindowedFunction}.
	 * @param ctx the parse tree
	 */
	void exitAggregateWindowedFunction(MySQLParser.AggregateWindowedFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#scalarFunctionName}.
	 * @param ctx the parse tree
	 */
	void enterScalarFunctionName(MySQLParser.ScalarFunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#scalarFunctionName}.
	 * @param ctx the parse tree
	 */
	void exitScalarFunctionName(MySQLParser.ScalarFunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#passwordFunctionClause}.
	 * @param ctx the parse tree
	 */
	void enterPasswordFunctionClause(MySQLParser.PasswordFunctionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#passwordFunctionClause}.
	 * @param ctx the parse tree
	 */
	void exitPasswordFunctionClause(MySQLParser.PasswordFunctionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#functionArgs}.
	 * @param ctx the parse tree
	 */
	void enterFunctionArgs(MySQLParser.FunctionArgsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#functionArgs}.
	 * @param ctx the parse tree
	 */
	void exitFunctionArgs(MySQLParser.FunctionArgsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#functionArg}.
	 * @param ctx the parse tree
	 */
	void enterFunctionArg(MySQLParser.FunctionArgContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#functionArg}.
	 * @param ctx the parse tree
	 */
	void exitFunctionArg(MySQLParser.FunctionArgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code isExpression}
	 * labeled alternative in {@link MySQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterIsExpression(MySQLParser.IsExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code isExpression}
	 * labeled alternative in {@link MySQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitIsExpression(MySQLParser.IsExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link MySQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNotExpression(MySQLParser.NotExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link MySQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNotExpression(MySQLParser.NotExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalExpression}
	 * labeled alternative in {@link MySQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalExpression(MySQLParser.LogicalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalExpression}
	 * labeled alternative in {@link MySQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalExpression(MySQLParser.LogicalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code predicateExpression}
	 * labeled alternative in {@link MySQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterPredicateExpression(MySQLParser.PredicateExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code predicateExpression}
	 * labeled alternative in {@link MySQLParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitPredicateExpression(MySQLParser.PredicateExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code soundsLikePredicate}
	 * labeled alternative in {@link MySQLParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterSoundsLikePredicate(MySQLParser.SoundsLikePredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code soundsLikePredicate}
	 * labeled alternative in {@link MySQLParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitSoundsLikePredicate(MySQLParser.SoundsLikePredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expressionAtomPredicate}
	 * labeled alternative in {@link MySQLParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterExpressionAtomPredicate(MySQLParser.ExpressionAtomPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expressionAtomPredicate}
	 * labeled alternative in {@link MySQLParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitExpressionAtomPredicate(MySQLParser.ExpressionAtomPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inPredicate}
	 * labeled alternative in {@link MySQLParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterInPredicate(MySQLParser.InPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code inPredicate}
	 * labeled alternative in {@link MySQLParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitInPredicate(MySQLParser.InPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subqueryComparasionPredicate}
	 * labeled alternative in {@link MySQLParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterSubqueryComparasionPredicate(MySQLParser.SubqueryComparasionPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subqueryComparasionPredicate}
	 * labeled alternative in {@link MySQLParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitSubqueryComparasionPredicate(MySQLParser.SubqueryComparasionPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code betweenPredicate}
	 * labeled alternative in {@link MySQLParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterBetweenPredicate(MySQLParser.BetweenPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code betweenPredicate}
	 * labeled alternative in {@link MySQLParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitBetweenPredicate(MySQLParser.BetweenPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryComparasionPredicate}
	 * labeled alternative in {@link MySQLParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterBinaryComparasionPredicate(MySQLParser.BinaryComparasionPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryComparasionPredicate}
	 * labeled alternative in {@link MySQLParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitBinaryComparasionPredicate(MySQLParser.BinaryComparasionPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code isNullPredicate}
	 * labeled alternative in {@link MySQLParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterIsNullPredicate(MySQLParser.IsNullPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code isNullPredicate}
	 * labeled alternative in {@link MySQLParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitIsNullPredicate(MySQLParser.IsNullPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code likePredicate}
	 * labeled alternative in {@link MySQLParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterLikePredicate(MySQLParser.LikePredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code likePredicate}
	 * labeled alternative in {@link MySQLParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitLikePredicate(MySQLParser.LikePredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code regexpPredicate}
	 * labeled alternative in {@link MySQLParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterRegexpPredicate(MySQLParser.RegexpPredicateContext ctx);
	/**
	 * Exit a parse tree produced by the {@code regexpPredicate}
	 * labeled alternative in {@link MySQLParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitRegexpPredicate(MySQLParser.RegexpPredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unaryExpressionAtom}
	 * labeled alternative in {@link MySQLParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterUnaryExpressionAtom(MySQLParser.UnaryExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unaryExpressionAtom}
	 * labeled alternative in {@link MySQLParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitUnaryExpressionAtom(MySQLParser.UnaryExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code collateExpressionAtom}
	 * labeled alternative in {@link MySQLParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterCollateExpressionAtom(MySQLParser.CollateExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code collateExpressionAtom}
	 * labeled alternative in {@link MySQLParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitCollateExpressionAtom(MySQLParser.CollateExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subqueryExpessionAtom}
	 * labeled alternative in {@link MySQLParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterSubqueryExpessionAtom(MySQLParser.SubqueryExpessionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subqueryExpessionAtom}
	 * labeled alternative in {@link MySQLParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitSubqueryExpessionAtom(MySQLParser.SubqueryExpessionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mysqlVariableExpressionAtom}
	 * labeled alternative in {@link MySQLParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterMysqlVariableExpressionAtom(MySQLParser.MysqlVariableExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mysqlVariableExpressionAtom}
	 * labeled alternative in {@link MySQLParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitMysqlVariableExpressionAtom(MySQLParser.MysqlVariableExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nestedExpressionAtom}
	 * labeled alternative in {@link MySQLParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterNestedExpressionAtom(MySQLParser.NestedExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nestedExpressionAtom}
	 * labeled alternative in {@link MySQLParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitNestedExpressionAtom(MySQLParser.NestedExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nestedRowExpressionAtom}
	 * labeled alternative in {@link MySQLParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterNestedRowExpressionAtom(MySQLParser.NestedRowExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nestedRowExpressionAtom}
	 * labeled alternative in {@link MySQLParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitNestedRowExpressionAtom(MySQLParser.NestedRowExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mathExpressionAtom}
	 * labeled alternative in {@link MySQLParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterMathExpressionAtom(MySQLParser.MathExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mathExpressionAtom}
	 * labeled alternative in {@link MySQLParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitMathExpressionAtom(MySQLParser.MathExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intervalExpressionAtom}
	 * labeled alternative in {@link MySQLParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterIntervalExpressionAtom(MySQLParser.IntervalExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intervalExpressionAtom}
	 * labeled alternative in {@link MySQLParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitIntervalExpressionAtom(MySQLParser.IntervalExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code existsExpessionAtom}
	 * labeled alternative in {@link MySQLParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterExistsExpessionAtom(MySQLParser.ExistsExpessionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code existsExpessionAtom}
	 * labeled alternative in {@link MySQLParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitExistsExpessionAtom(MySQLParser.ExistsExpessionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constantExpressionAtom}
	 * labeled alternative in {@link MySQLParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterConstantExpressionAtom(MySQLParser.ConstantExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constantExpressionAtom}
	 * labeled alternative in {@link MySQLParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitConstantExpressionAtom(MySQLParser.ConstantExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCallExpressionAtom}
	 * labeled alternative in {@link MySQLParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCallExpressionAtom(MySQLParser.FunctionCallExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCallExpressionAtom}
	 * labeled alternative in {@link MySQLParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCallExpressionAtom(MySQLParser.FunctionCallExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code binaryExpressionAtom}
	 * labeled alternative in {@link MySQLParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterBinaryExpressionAtom(MySQLParser.BinaryExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code binaryExpressionAtom}
	 * labeled alternative in {@link MySQLParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitBinaryExpressionAtom(MySQLParser.BinaryExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fullColumnNameExpressionAtom}
	 * labeled alternative in {@link MySQLParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterFullColumnNameExpressionAtom(MySQLParser.FullColumnNameExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fullColumnNameExpressionAtom}
	 * labeled alternative in {@link MySQLParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitFullColumnNameExpressionAtom(MySQLParser.FullColumnNameExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bitExpressionAtom}
	 * labeled alternative in {@link MySQLParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void enterBitExpressionAtom(MySQLParser.BitExpressionAtomContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bitExpressionAtom}
	 * labeled alternative in {@link MySQLParser#expressionAtom}.
	 * @param ctx the parse tree
	 */
	void exitBitExpressionAtom(MySQLParser.BitExpressionAtomContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOperator(MySQLParser.UnaryOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#unaryOperator}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOperator(MySQLParser.UnaryOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(MySQLParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(MySQLParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void enterLogicalOperator(MySQLParser.LogicalOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#logicalOperator}.
	 * @param ctx the parse tree
	 */
	void exitLogicalOperator(MySQLParser.LogicalOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#bitOperator}.
	 * @param ctx the parse tree
	 */
	void enterBitOperator(MySQLParser.BitOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#bitOperator}.
	 * @param ctx the parse tree
	 */
	void exitBitOperator(MySQLParser.BitOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#mathOperator}.
	 * @param ctx the parse tree
	 */
	void enterMathOperator(MySQLParser.MathOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#mathOperator}.
	 * @param ctx the parse tree
	 */
	void exitMathOperator(MySQLParser.MathOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#charsetNameBase}.
	 * @param ctx the parse tree
	 */
	void enterCharsetNameBase(MySQLParser.CharsetNameBaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#charsetNameBase}.
	 * @param ctx the parse tree
	 */
	void exitCharsetNameBase(MySQLParser.CharsetNameBaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#transactionLevelBase}.
	 * @param ctx the parse tree
	 */
	void enterTransactionLevelBase(MySQLParser.TransactionLevelBaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#transactionLevelBase}.
	 * @param ctx the parse tree
	 */
	void exitTransactionLevelBase(MySQLParser.TransactionLevelBaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#privilegesBase}.
	 * @param ctx the parse tree
	 */
	void enterPrivilegesBase(MySQLParser.PrivilegesBaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#privilegesBase}.
	 * @param ctx the parse tree
	 */
	void exitPrivilegesBase(MySQLParser.PrivilegesBaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#intervalTypeBase}.
	 * @param ctx the parse tree
	 */
	void enterIntervalTypeBase(MySQLParser.IntervalTypeBaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#intervalTypeBase}.
	 * @param ctx the parse tree
	 */
	void exitIntervalTypeBase(MySQLParser.IntervalTypeBaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#dataTypeBase}.
	 * @param ctx the parse tree
	 */
	void enterDataTypeBase(MySQLParser.DataTypeBaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#dataTypeBase}.
	 * @param ctx the parse tree
	 */
	void exitDataTypeBase(MySQLParser.DataTypeBaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#keywordsCanBeId}.
	 * @param ctx the parse tree
	 */
	void enterKeywordsCanBeId(MySQLParser.KeywordsCanBeIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#keywordsCanBeId}.
	 * @param ctx the parse tree
	 */
	void exitKeywordsCanBeId(MySQLParser.KeywordsCanBeIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link MySQLParser#functionNameBase}.
	 * @param ctx the parse tree
	 */
	void enterFunctionNameBase(MySQLParser.FunctionNameBaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link MySQLParser#functionNameBase}.
	 * @param ctx the parse tree
	 */
	void exitFunctionNameBase(MySQLParser.FunctionNameBaseContext ctx);
}