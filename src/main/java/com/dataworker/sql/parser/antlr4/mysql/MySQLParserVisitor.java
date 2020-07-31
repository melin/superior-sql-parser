// Generated from com/dataworker/sql/parser/antlr4/mysql/MySQLParser.g4 by ANTLR 4.7.1
package com.dataworker.sql.parser.antlr4.mysql;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MySQLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MySQLParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MySQLParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(MySQLParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#sqlStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlStatements(MySQLParser.SqlStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#sqlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlStatement(MySQLParser.SqlStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#emptyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStatement(MySQLParser.EmptyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#ddlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDdlStatement(MySQLParser.DdlStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#dmlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDmlStatement(MySQLParser.DmlStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#transactionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransactionStatement(MySQLParser.TransactionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#replicationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReplicationStatement(MySQLParser.ReplicationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#preparedStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreparedStatement(MySQLParser.PreparedStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#compoundStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompoundStatement(MySQLParser.CompoundStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#administrationStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAdministrationStatement(MySQLParser.AdministrationStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#utilityStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUtilityStatement(MySQLParser.UtilityStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#createDatabase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDatabase(MySQLParser.CreateDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#createEvent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateEvent(MySQLParser.CreateEventContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#createIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateIndex(MySQLParser.CreateIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#createLogfileGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateLogfileGroup(MySQLParser.CreateLogfileGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#createProcedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateProcedure(MySQLParser.CreateProcedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#createFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateFunction(MySQLParser.CreateFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#createServer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateServer(MySQLParser.CreateServerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code copyCreateTable}
	 * labeled alternative in {@link MySQLParser#createTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCopyCreateTable(MySQLParser.CopyCreateTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code queryCreateTable}
	 * labeled alternative in {@link MySQLParser#createTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryCreateTable(MySQLParser.QueryCreateTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code columnCreateTable}
	 * labeled alternative in {@link MySQLParser#createTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnCreateTable(MySQLParser.ColumnCreateTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#createTablespaceInnodb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTablespaceInnodb(MySQLParser.CreateTablespaceInnodbContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#createTablespaceNdb}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTablespaceNdb(MySQLParser.CreateTablespaceNdbContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#createTrigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTrigger(MySQLParser.CreateTriggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#createView}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateView(MySQLParser.CreateViewContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#createDatabaseOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDatabaseOption(MySQLParser.CreateDatabaseOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#ownerStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOwnerStatement(MySQLParser.OwnerStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code preciseSchedule}
	 * labeled alternative in {@link MySQLParser#scheduleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPreciseSchedule(MySQLParser.PreciseScheduleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intervalSchedule}
	 * labeled alternative in {@link MySQLParser#scheduleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalSchedule(MySQLParser.IntervalScheduleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#timestampValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimestampValue(MySQLParser.TimestampValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#intervalExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalExpr(MySQLParser.IntervalExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#intervalType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalType(MySQLParser.IntervalTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#enableType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnableType(MySQLParser.EnableTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#indexType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexType(MySQLParser.IndexTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#indexOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexOption(MySQLParser.IndexOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#procedureParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureParameter(MySQLParser.ProcedureParameterContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#functionParameter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionParameter(MySQLParser.FunctionParameterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code routineComment}
	 * labeled alternative in {@link MySQLParser#routineOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutineComment(MySQLParser.RoutineCommentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code routineLanguage}
	 * labeled alternative in {@link MySQLParser#routineOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutineLanguage(MySQLParser.RoutineLanguageContext ctx);
	/**
	 * Visit a parse tree produced by the {@code routineBehavior}
	 * labeled alternative in {@link MySQLParser#routineOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutineBehavior(MySQLParser.RoutineBehaviorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code routineData}
	 * labeled alternative in {@link MySQLParser#routineOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutineData(MySQLParser.RoutineDataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code routineSecurity}
	 * labeled alternative in {@link MySQLParser#routineOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutineSecurity(MySQLParser.RoutineSecurityContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#serverOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitServerOption(MySQLParser.ServerOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#createDefinitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDefinitions(MySQLParser.CreateDefinitionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code columnDeclaration}
	 * labeled alternative in {@link MySQLParser#createDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnDeclaration(MySQLParser.ColumnDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constraintDeclaration}
	 * labeled alternative in {@link MySQLParser#createDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintDeclaration(MySQLParser.ConstraintDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code indexDeclaration}
	 * labeled alternative in {@link MySQLParser#createDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexDeclaration(MySQLParser.IndexDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#columnDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnDefinition(MySQLParser.ColumnDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nullColumnConstraint}
	 * labeled alternative in {@link MySQLParser#columnConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullColumnConstraint(MySQLParser.NullColumnConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code defaultColumnConstraint}
	 * labeled alternative in {@link MySQLParser#columnConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultColumnConstraint(MySQLParser.DefaultColumnConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code autoIncrementColumnConstraint}
	 * labeled alternative in {@link MySQLParser#columnConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAutoIncrementColumnConstraint(MySQLParser.AutoIncrementColumnConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryKeyColumnConstraint}
	 * labeled alternative in {@link MySQLParser#columnConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryKeyColumnConstraint(MySQLParser.PrimaryKeyColumnConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code uniqueKeyColumnConstraint}
	 * labeled alternative in {@link MySQLParser#columnConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUniqueKeyColumnConstraint(MySQLParser.UniqueKeyColumnConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code commentColumnConstraint}
	 * labeled alternative in {@link MySQLParser#columnConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommentColumnConstraint(MySQLParser.CommentColumnConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code formatColumnConstraint}
	 * labeled alternative in {@link MySQLParser#columnConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormatColumnConstraint(MySQLParser.FormatColumnConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code storageColumnConstraint}
	 * labeled alternative in {@link MySQLParser#columnConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorageColumnConstraint(MySQLParser.StorageColumnConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code referenceColumnConstraint}
	 * labeled alternative in {@link MySQLParser#columnConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceColumnConstraint(MySQLParser.ReferenceColumnConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code collateColumnConstraint}
	 * labeled alternative in {@link MySQLParser#columnConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollateColumnConstraint(MySQLParser.CollateColumnConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code generatedColumnConstraint}
	 * labeled alternative in {@link MySQLParser#columnConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGeneratedColumnConstraint(MySQLParser.GeneratedColumnConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code serialDefaultColumnConstraint}
	 * labeled alternative in {@link MySQLParser#columnConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSerialDefaultColumnConstraint(MySQLParser.SerialDefaultColumnConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primaryKeyTableConstraint}
	 * labeled alternative in {@link MySQLParser#tableConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryKeyTableConstraint(MySQLParser.PrimaryKeyTableConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code uniqueKeyTableConstraint}
	 * labeled alternative in {@link MySQLParser#tableConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUniqueKeyTableConstraint(MySQLParser.UniqueKeyTableConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code foreignKeyTableConstraint}
	 * labeled alternative in {@link MySQLParser#tableConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitForeignKeyTableConstraint(MySQLParser.ForeignKeyTableConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code checkTableConstraint}
	 * labeled alternative in {@link MySQLParser#tableConstraint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckTableConstraint(MySQLParser.CheckTableConstraintContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#referenceDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceDefinition(MySQLParser.ReferenceDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#referenceAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceAction(MySQLParser.ReferenceActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#referenceControlType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReferenceControlType(MySQLParser.ReferenceControlTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleIndexDeclaration}
	 * labeled alternative in {@link MySQLParser#indexColumnDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleIndexDeclaration(MySQLParser.SimpleIndexDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code specialIndexDeclaration}
	 * labeled alternative in {@link MySQLParser#indexColumnDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecialIndexDeclaration(MySQLParser.SpecialIndexDeclarationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableOptionEngine}
	 * labeled alternative in {@link MySQLParser#tableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOptionEngine(MySQLParser.TableOptionEngineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableOptionAutoIncrement}
	 * labeled alternative in {@link MySQLParser#tableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOptionAutoIncrement(MySQLParser.TableOptionAutoIncrementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableOptionAverage}
	 * labeled alternative in {@link MySQLParser#tableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOptionAverage(MySQLParser.TableOptionAverageContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableOptionCharset}
	 * labeled alternative in {@link MySQLParser#tableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOptionCharset(MySQLParser.TableOptionCharsetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableOptionChecksum}
	 * labeled alternative in {@link MySQLParser#tableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOptionChecksum(MySQLParser.TableOptionChecksumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableOptionCollate}
	 * labeled alternative in {@link MySQLParser#tableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOptionCollate(MySQLParser.TableOptionCollateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableOptionComment}
	 * labeled alternative in {@link MySQLParser#tableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOptionComment(MySQLParser.TableOptionCommentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableOptionCompression}
	 * labeled alternative in {@link MySQLParser#tableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOptionCompression(MySQLParser.TableOptionCompressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableOptionConnection}
	 * labeled alternative in {@link MySQLParser#tableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOptionConnection(MySQLParser.TableOptionConnectionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableOptionDataDirectory}
	 * labeled alternative in {@link MySQLParser#tableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOptionDataDirectory(MySQLParser.TableOptionDataDirectoryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableOptionDelay}
	 * labeled alternative in {@link MySQLParser#tableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOptionDelay(MySQLParser.TableOptionDelayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableOptionEncryption}
	 * labeled alternative in {@link MySQLParser#tableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOptionEncryption(MySQLParser.TableOptionEncryptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableOptionIndexDirectory}
	 * labeled alternative in {@link MySQLParser#tableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOptionIndexDirectory(MySQLParser.TableOptionIndexDirectoryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableOptionInsertMethod}
	 * labeled alternative in {@link MySQLParser#tableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOptionInsertMethod(MySQLParser.TableOptionInsertMethodContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableOptionKeyBlockSize}
	 * labeled alternative in {@link MySQLParser#tableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOptionKeyBlockSize(MySQLParser.TableOptionKeyBlockSizeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableOptionMaxRows}
	 * labeled alternative in {@link MySQLParser#tableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOptionMaxRows(MySQLParser.TableOptionMaxRowsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableOptionMinRows}
	 * labeled alternative in {@link MySQLParser#tableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOptionMinRows(MySQLParser.TableOptionMinRowsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableOptionPackKeys}
	 * labeled alternative in {@link MySQLParser#tableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOptionPackKeys(MySQLParser.TableOptionPackKeysContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableOptionPassword}
	 * labeled alternative in {@link MySQLParser#tableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOptionPassword(MySQLParser.TableOptionPasswordContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableOptionRowFormat}
	 * labeled alternative in {@link MySQLParser#tableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOptionRowFormat(MySQLParser.TableOptionRowFormatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableOptionRecalculation}
	 * labeled alternative in {@link MySQLParser#tableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOptionRecalculation(MySQLParser.TableOptionRecalculationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableOptionPersistent}
	 * labeled alternative in {@link MySQLParser#tableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOptionPersistent(MySQLParser.TableOptionPersistentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableOptionSamplePage}
	 * labeled alternative in {@link MySQLParser#tableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOptionSamplePage(MySQLParser.TableOptionSamplePageContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableOptionTablespace}
	 * labeled alternative in {@link MySQLParser#tableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOptionTablespace(MySQLParser.TableOptionTablespaceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableOptionUnion}
	 * labeled alternative in {@link MySQLParser#tableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOptionUnion(MySQLParser.TableOptionUnionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#tablespaceStorage}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablespaceStorage(MySQLParser.TablespaceStorageContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#partitionDefinitions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionDefinitions(MySQLParser.PartitionDefinitionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code partitionFunctionHash}
	 * labeled alternative in {@link MySQLParser#partitionFunctionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionFunctionHash(MySQLParser.PartitionFunctionHashContext ctx);
	/**
	 * Visit a parse tree produced by the {@code partitionFunctionKey}
	 * labeled alternative in {@link MySQLParser#partitionFunctionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionFunctionKey(MySQLParser.PartitionFunctionKeyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code partitionFunctionRange}
	 * labeled alternative in {@link MySQLParser#partitionFunctionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionFunctionRange(MySQLParser.PartitionFunctionRangeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code partitionFunctionList}
	 * labeled alternative in {@link MySQLParser#partitionFunctionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionFunctionList(MySQLParser.PartitionFunctionListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subPartitionFunctionHash}
	 * labeled alternative in {@link MySQLParser#subpartitionFunctionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubPartitionFunctionHash(MySQLParser.SubPartitionFunctionHashContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subPartitionFunctionKey}
	 * labeled alternative in {@link MySQLParser#subpartitionFunctionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubPartitionFunctionKey(MySQLParser.SubPartitionFunctionKeyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code partitionComparision}
	 * labeled alternative in {@link MySQLParser#partitionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionComparision(MySQLParser.PartitionComparisionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code partitionListAtom}
	 * labeled alternative in {@link MySQLParser#partitionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionListAtom(MySQLParser.PartitionListAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code partitionListVector}
	 * labeled alternative in {@link MySQLParser#partitionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionListVector(MySQLParser.PartitionListVectorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code partitionSimple}
	 * labeled alternative in {@link MySQLParser#partitionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionSimple(MySQLParser.PartitionSimpleContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#partitionDefinerAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionDefinerAtom(MySQLParser.PartitionDefinerAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#partitionDefinerVector}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionDefinerVector(MySQLParser.PartitionDefinerVectorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#subpartitionDefinition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubpartitionDefinition(MySQLParser.SubpartitionDefinitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code partitionOptionEngine}
	 * labeled alternative in {@link MySQLParser#partitionOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionOptionEngine(MySQLParser.PartitionOptionEngineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code partitionOptionComment}
	 * labeled alternative in {@link MySQLParser#partitionOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionOptionComment(MySQLParser.PartitionOptionCommentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code partitionOptionDataDirectory}
	 * labeled alternative in {@link MySQLParser#partitionOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionOptionDataDirectory(MySQLParser.PartitionOptionDataDirectoryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code partitionOptionIndexDirectory}
	 * labeled alternative in {@link MySQLParser#partitionOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionOptionIndexDirectory(MySQLParser.PartitionOptionIndexDirectoryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code partitionOptionMaxRows}
	 * labeled alternative in {@link MySQLParser#partitionOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionOptionMaxRows(MySQLParser.PartitionOptionMaxRowsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code partitionOptionMinRows}
	 * labeled alternative in {@link MySQLParser#partitionOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionOptionMinRows(MySQLParser.PartitionOptionMinRowsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code partitionOptionTablespace}
	 * labeled alternative in {@link MySQLParser#partitionOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionOptionTablespace(MySQLParser.PartitionOptionTablespaceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code partitionOptionNodeGroup}
	 * labeled alternative in {@link MySQLParser#partitionOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionOptionNodeGroup(MySQLParser.PartitionOptionNodeGroupContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterSimpleDatabase}
	 * labeled alternative in {@link MySQLParser#alterDatabase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterSimpleDatabase(MySQLParser.AlterSimpleDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterUpgradeName}
	 * labeled alternative in {@link MySQLParser#alterDatabase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterUpgradeName(MySQLParser.AlterUpgradeNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#alterEvent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterEvent(MySQLParser.AlterEventContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#alterFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterFunction(MySQLParser.AlterFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#alterInstance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterInstance(MySQLParser.AlterInstanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#alterLogfileGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterLogfileGroup(MySQLParser.AlterLogfileGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#alterProcedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterProcedure(MySQLParser.AlterProcedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#alterServer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterServer(MySQLParser.AlterServerContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#alterTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTable(MySQLParser.AlterTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#alterTablespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTablespace(MySQLParser.AlterTablespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#alterView}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterView(MySQLParser.AlterViewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByTableOption}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByTableOption(MySQLParser.AlterByTableOptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByAddColumn}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByAddColumn(MySQLParser.AlterByAddColumnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByAddColumns}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByAddColumns(MySQLParser.AlterByAddColumnsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByAddIndex}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByAddIndex(MySQLParser.AlterByAddIndexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByAddPrimaryKey}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByAddPrimaryKey(MySQLParser.AlterByAddPrimaryKeyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByAddUniqueKey}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByAddUniqueKey(MySQLParser.AlterByAddUniqueKeyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByAddSpecialIndex}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByAddSpecialIndex(MySQLParser.AlterByAddSpecialIndexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByAddForeignKey}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByAddForeignKey(MySQLParser.AlterByAddForeignKeyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByAddCheckTableConstraint}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByAddCheckTableConstraint(MySQLParser.AlterByAddCheckTableConstraintContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterBySetAlgorithm}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterBySetAlgorithm(MySQLParser.AlterBySetAlgorithmContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByChangeDefault}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByChangeDefault(MySQLParser.AlterByChangeDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByChangeColumn}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByChangeColumn(MySQLParser.AlterByChangeColumnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByRenameColumn}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByRenameColumn(MySQLParser.AlterByRenameColumnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByLock}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByLock(MySQLParser.AlterByLockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByModifyColumn}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByModifyColumn(MySQLParser.AlterByModifyColumnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByDropColumn}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByDropColumn(MySQLParser.AlterByDropColumnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByDropPrimaryKey}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByDropPrimaryKey(MySQLParser.AlterByDropPrimaryKeyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByRenameIndex}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByRenameIndex(MySQLParser.AlterByRenameIndexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByDropIndex}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByDropIndex(MySQLParser.AlterByDropIndexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByDropForeignKey}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByDropForeignKey(MySQLParser.AlterByDropForeignKeyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByDisableKeys}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByDisableKeys(MySQLParser.AlterByDisableKeysContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByEnableKeys}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByEnableKeys(MySQLParser.AlterByEnableKeysContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByRename}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByRename(MySQLParser.AlterByRenameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByOrder}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByOrder(MySQLParser.AlterByOrderContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByConvertCharset}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByConvertCharset(MySQLParser.AlterByConvertCharsetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByDefaultCharset}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByDefaultCharset(MySQLParser.AlterByDefaultCharsetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByDiscardTablespace}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByDiscardTablespace(MySQLParser.AlterByDiscardTablespaceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByImportTablespace}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByImportTablespace(MySQLParser.AlterByImportTablespaceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByForce}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByForce(MySQLParser.AlterByForceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByValidate}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByValidate(MySQLParser.AlterByValidateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByAddPartition}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByAddPartition(MySQLParser.AlterByAddPartitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByDropPartition}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByDropPartition(MySQLParser.AlterByDropPartitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByDiscardPartition}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByDiscardPartition(MySQLParser.AlterByDiscardPartitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByImportPartition}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByImportPartition(MySQLParser.AlterByImportPartitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByTruncatePartition}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByTruncatePartition(MySQLParser.AlterByTruncatePartitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByCoalescePartition}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByCoalescePartition(MySQLParser.AlterByCoalescePartitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByReorganizePartition}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByReorganizePartition(MySQLParser.AlterByReorganizePartitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByExchangePartition}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByExchangePartition(MySQLParser.AlterByExchangePartitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByAnalyzePartition}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByAnalyzePartition(MySQLParser.AlterByAnalyzePartitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByCheckPartition}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByCheckPartition(MySQLParser.AlterByCheckPartitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByOptimizePartition}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByOptimizePartition(MySQLParser.AlterByOptimizePartitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByRebuildPartition}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByRebuildPartition(MySQLParser.AlterByRebuildPartitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByRepairPartition}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByRepairPartition(MySQLParser.AlterByRepairPartitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByRemovePartitioning}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByRemovePartitioning(MySQLParser.AlterByRemovePartitioningContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterByUpgradePartitioning}
	 * labeled alternative in {@link MySQLParser#alterSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterByUpgradePartitioning(MySQLParser.AlterByUpgradePartitioningContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#dropDatabase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropDatabase(MySQLParser.DropDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#dropEvent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropEvent(MySQLParser.DropEventContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#dropIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropIndex(MySQLParser.DropIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#dropLogfileGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropLogfileGroup(MySQLParser.DropLogfileGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#dropProcedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropProcedure(MySQLParser.DropProcedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#dropFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropFunction(MySQLParser.DropFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#dropServer}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropServer(MySQLParser.DropServerContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#dropTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTable(MySQLParser.DropTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#dropTablespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTablespace(MySQLParser.DropTablespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#dropTrigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTrigger(MySQLParser.DropTriggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#dropView}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropView(MySQLParser.DropViewContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#renameTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameTable(MySQLParser.RenameTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#renameTableClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameTableClause(MySQLParser.RenameTableClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#truncateTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruncateTable(MySQLParser.TruncateTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#callStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallStatement(MySQLParser.CallStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#deleteStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteStatement(MySQLParser.DeleteStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#doStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoStatement(MySQLParser.DoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#handlerStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandlerStatement(MySQLParser.HandlerStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#insertStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertStatement(MySQLParser.InsertStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#loadDataStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoadDataStatement(MySQLParser.LoadDataStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#loadXmlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoadXmlStatement(MySQLParser.LoadXmlStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#replaceStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReplaceStatement(MySQLParser.ReplaceStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleSelect}
	 * labeled alternative in {@link MySQLParser#selectStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleSelect(MySQLParser.SimpleSelectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesisSelect}
	 * labeled alternative in {@link MySQLParser#selectStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesisSelect(MySQLParser.ParenthesisSelectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unionSelect}
	 * labeled alternative in {@link MySQLParser#selectStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnionSelect(MySQLParser.UnionSelectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unionParenthesisSelect}
	 * labeled alternative in {@link MySQLParser#selectStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnionParenthesisSelect(MySQLParser.UnionParenthesisSelectContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#updateStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateStatement(MySQLParser.UpdateStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#insertStatementValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertStatementValue(MySQLParser.InsertStatementValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#updatedElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdatedElement(MySQLParser.UpdatedElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#assignmentField}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentField(MySQLParser.AssignmentFieldContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#lockClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLockClause(MySQLParser.LockClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#singleDeleteStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleDeleteStatement(MySQLParser.SingleDeleteStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#multipleDeleteStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleDeleteStatement(MySQLParser.MultipleDeleteStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#handlerOpenStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandlerOpenStatement(MySQLParser.HandlerOpenStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#handlerReadIndexStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandlerReadIndexStatement(MySQLParser.HandlerReadIndexStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#handlerReadStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandlerReadStatement(MySQLParser.HandlerReadStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#handlerCloseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandlerCloseStatement(MySQLParser.HandlerCloseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#singleUpdateStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleUpdateStatement(MySQLParser.SingleUpdateStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#multipleUpdateStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleUpdateStatement(MySQLParser.MultipleUpdateStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#orderByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByClause(MySQLParser.OrderByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#orderByExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByExpression(MySQLParser.OrderByExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#tableSources}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableSources(MySQLParser.TableSourcesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableSourceBase}
	 * labeled alternative in {@link MySQLParser#tableSource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableSourceBase(MySQLParser.TableSourceBaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableSourceNested}
	 * labeled alternative in {@link MySQLParser#tableSource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableSourceNested(MySQLParser.TableSourceNestedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code atomTableItem}
	 * labeled alternative in {@link MySQLParser#tableSourceItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAtomTableItem(MySQLParser.AtomTableItemContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subqueryTableItem}
	 * labeled alternative in {@link MySQLParser#tableSourceItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubqueryTableItem(MySQLParser.SubqueryTableItemContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableSourcesItem}
	 * labeled alternative in {@link MySQLParser#tableSourceItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableSourcesItem(MySQLParser.TableSourcesItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#indexHint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexHint(MySQLParser.IndexHintContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#indexHintType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexHintType(MySQLParser.IndexHintTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code innerJoin}
	 * labeled alternative in {@link MySQLParser#joinPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerJoin(MySQLParser.InnerJoinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code straightJoin}
	 * labeled alternative in {@link MySQLParser#joinPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStraightJoin(MySQLParser.StraightJoinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code outerJoin}
	 * labeled alternative in {@link MySQLParser#joinPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOuterJoin(MySQLParser.OuterJoinContext ctx);
	/**
	 * Visit a parse tree produced by the {@code naturalJoin}
	 * labeled alternative in {@link MySQLParser#joinPart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaturalJoin(MySQLParser.NaturalJoinContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#queryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryExpression(MySQLParser.QueryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#queryExpressionNointo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryExpressionNointo(MySQLParser.QueryExpressionNointoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#querySpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuerySpecification(MySQLParser.QuerySpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#querySpecificationNointo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuerySpecificationNointo(MySQLParser.QuerySpecificationNointoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#unionParenthesis}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnionParenthesis(MySQLParser.UnionParenthesisContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#unionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnionStatement(MySQLParser.UnionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#selectSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectSpec(MySQLParser.SelectSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#selectElements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectElements(MySQLParser.SelectElementsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selectStarElement}
	 * labeled alternative in {@link MySQLParser#selectElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectStarElement(MySQLParser.SelectStarElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selectColumnElement}
	 * labeled alternative in {@link MySQLParser#selectElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectColumnElement(MySQLParser.SelectColumnElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selectFunctionElement}
	 * labeled alternative in {@link MySQLParser#selectElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectFunctionElement(MySQLParser.SelectFunctionElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selectExpressionElement}
	 * labeled alternative in {@link MySQLParser#selectElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectExpressionElement(MySQLParser.SelectExpressionElementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selectIntoVariables}
	 * labeled alternative in {@link MySQLParser#selectIntoExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectIntoVariables(MySQLParser.SelectIntoVariablesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selectIntoDumpFile}
	 * labeled alternative in {@link MySQLParser#selectIntoExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectIntoDumpFile(MySQLParser.SelectIntoDumpFileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code selectIntoTextFile}
	 * labeled alternative in {@link MySQLParser#selectIntoExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectIntoTextFile(MySQLParser.SelectIntoTextFileContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#selectFieldsInto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectFieldsInto(MySQLParser.SelectFieldsIntoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#selectLinesInto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectLinesInto(MySQLParser.SelectLinesIntoContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#fromClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromClause(MySQLParser.FromClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#groupByItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupByItem(MySQLParser.GroupByItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#limitClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitClause(MySQLParser.LimitClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#limitClauseAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitClauseAtom(MySQLParser.LimitClauseAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#startTransaction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartTransaction(MySQLParser.StartTransactionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#beginWork}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBeginWork(MySQLParser.BeginWorkContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#commitWork}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommitWork(MySQLParser.CommitWorkContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#rollbackWork}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollbackWork(MySQLParser.RollbackWorkContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#savepointStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSavepointStatement(MySQLParser.SavepointStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#rollbackStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRollbackStatement(MySQLParser.RollbackStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#releaseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReleaseStatement(MySQLParser.ReleaseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#lockTables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLockTables(MySQLParser.LockTablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#unlockTables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnlockTables(MySQLParser.UnlockTablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#setAutocommitStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetAutocommitStatement(MySQLParser.SetAutocommitStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#setTransactionStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetTransactionStatement(MySQLParser.SetTransactionStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#transactionMode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransactionMode(MySQLParser.TransactionModeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#lockTableElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLockTableElement(MySQLParser.LockTableElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#lockAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLockAction(MySQLParser.LockActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#transactionOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransactionOption(MySQLParser.TransactionOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#transactionLevel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransactionLevel(MySQLParser.TransactionLevelContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#changeMaster}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChangeMaster(MySQLParser.ChangeMasterContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#changeReplicationFilter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChangeReplicationFilter(MySQLParser.ChangeReplicationFilterContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#purgeBinaryLogs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPurgeBinaryLogs(MySQLParser.PurgeBinaryLogsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#resetMaster}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResetMaster(MySQLParser.ResetMasterContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#resetSlave}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResetSlave(MySQLParser.ResetSlaveContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#startSlave}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartSlave(MySQLParser.StartSlaveContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#stopSlave}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStopSlave(MySQLParser.StopSlaveContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#startGroupReplication}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStartGroupReplication(MySQLParser.StartGroupReplicationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#stopGroupReplication}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStopGroupReplication(MySQLParser.StopGroupReplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code masterStringOption}
	 * labeled alternative in {@link MySQLParser#masterOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMasterStringOption(MySQLParser.MasterStringOptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code masterDecimalOption}
	 * labeled alternative in {@link MySQLParser#masterOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMasterDecimalOption(MySQLParser.MasterDecimalOptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code masterBoolOption}
	 * labeled alternative in {@link MySQLParser#masterOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMasterBoolOption(MySQLParser.MasterBoolOptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code masterRealOption}
	 * labeled alternative in {@link MySQLParser#masterOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMasterRealOption(MySQLParser.MasterRealOptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code masterUidListOption}
	 * labeled alternative in {@link MySQLParser#masterOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMasterUidListOption(MySQLParser.MasterUidListOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#stringMasterOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringMasterOption(MySQLParser.StringMasterOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#decimalMasterOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalMasterOption(MySQLParser.DecimalMasterOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#boolMasterOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolMasterOption(MySQLParser.BoolMasterOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#channelOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChannelOption(MySQLParser.ChannelOptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doDbReplication}
	 * labeled alternative in {@link MySQLParser#replicationFilter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoDbReplication(MySQLParser.DoDbReplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ignoreDbReplication}
	 * labeled alternative in {@link MySQLParser#replicationFilter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgnoreDbReplication(MySQLParser.IgnoreDbReplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doTableReplication}
	 * labeled alternative in {@link MySQLParser#replicationFilter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoTableReplication(MySQLParser.DoTableReplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ignoreTableReplication}
	 * labeled alternative in {@link MySQLParser#replicationFilter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIgnoreTableReplication(MySQLParser.IgnoreTableReplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wildDoTableReplication}
	 * labeled alternative in {@link MySQLParser#replicationFilter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildDoTableReplication(MySQLParser.WildDoTableReplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wildIgnoreTableReplication}
	 * labeled alternative in {@link MySQLParser#replicationFilter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildIgnoreTableReplication(MySQLParser.WildIgnoreTableReplicationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rewriteDbReplication}
	 * labeled alternative in {@link MySQLParser#replicationFilter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRewriteDbReplication(MySQLParser.RewriteDbReplicationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#tablePair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablePair(MySQLParser.TablePairContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#threadType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitThreadType(MySQLParser.ThreadTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code gtidsUntilOption}
	 * labeled alternative in {@link MySQLParser#untilOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGtidsUntilOption(MySQLParser.GtidsUntilOptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code masterLogUntilOption}
	 * labeled alternative in {@link MySQLParser#untilOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMasterLogUntilOption(MySQLParser.MasterLogUntilOptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code relayLogUntilOption}
	 * labeled alternative in {@link MySQLParser#untilOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelayLogUntilOption(MySQLParser.RelayLogUntilOptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sqlGapsUntilOption}
	 * labeled alternative in {@link MySQLParser#untilOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlGapsUntilOption(MySQLParser.SqlGapsUntilOptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code userConnectionOption}
	 * labeled alternative in {@link MySQLParser#connectionOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserConnectionOption(MySQLParser.UserConnectionOptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code passwordConnectionOption}
	 * labeled alternative in {@link MySQLParser#connectionOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPasswordConnectionOption(MySQLParser.PasswordConnectionOptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code defaultAuthConnectionOption}
	 * labeled alternative in {@link MySQLParser#connectionOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultAuthConnectionOption(MySQLParser.DefaultAuthConnectionOptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code pluginDirConnectionOption}
	 * labeled alternative in {@link MySQLParser#connectionOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPluginDirConnectionOption(MySQLParser.PluginDirConnectionOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#gtuidSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGtuidSet(MySQLParser.GtuidSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#xaStartTransaction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXaStartTransaction(MySQLParser.XaStartTransactionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#xaEndTransaction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXaEndTransaction(MySQLParser.XaEndTransactionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#xaPrepareStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXaPrepareStatement(MySQLParser.XaPrepareStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#xaCommitWork}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXaCommitWork(MySQLParser.XaCommitWorkContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#xaRollbackWork}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXaRollbackWork(MySQLParser.XaRollbackWorkContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#xaRecoverWork}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXaRecoverWork(MySQLParser.XaRecoverWorkContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#prepareStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrepareStatement(MySQLParser.PrepareStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#executeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecuteStatement(MySQLParser.ExecuteStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#deallocatePrepare}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeallocatePrepare(MySQLParser.DeallocatePrepareContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#routineBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutineBody(MySQLParser.RoutineBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#blockStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockStatement(MySQLParser.BlockStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#caseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseStatement(MySQLParser.CaseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#ifStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfStatement(MySQLParser.IfStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#iterateStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterateStatement(MySQLParser.IterateStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#leaveStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeaveStatement(MySQLParser.LeaveStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#loopStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoopStatement(MySQLParser.LoopStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#repeatStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeatStatement(MySQLParser.RepeatStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#returnStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReturnStatement(MySQLParser.ReturnStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#whileStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileStatement(MySQLParser.WhileStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CloseCursor}
	 * labeled alternative in {@link MySQLParser#cursorStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloseCursor(MySQLParser.CloseCursorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FetchCursor}
	 * labeled alternative in {@link MySQLParser#cursorStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFetchCursor(MySQLParser.FetchCursorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OpenCursor}
	 * labeled alternative in {@link MySQLParser#cursorStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenCursor(MySQLParser.OpenCursorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#declareVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareVariable(MySQLParser.DeclareVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#declareCondition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareCondition(MySQLParser.DeclareConditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#declareCursor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareCursor(MySQLParser.DeclareCursorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#declareHandler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclareHandler(MySQLParser.DeclareHandlerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code handlerConditionCode}
	 * labeled alternative in {@link MySQLParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandlerConditionCode(MySQLParser.HandlerConditionCodeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code handlerConditionState}
	 * labeled alternative in {@link MySQLParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandlerConditionState(MySQLParser.HandlerConditionStateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code handlerConditionName}
	 * labeled alternative in {@link MySQLParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandlerConditionName(MySQLParser.HandlerConditionNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code handlerConditionWarning}
	 * labeled alternative in {@link MySQLParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandlerConditionWarning(MySQLParser.HandlerConditionWarningContext ctx);
	/**
	 * Visit a parse tree produced by the {@code handlerConditionNotfound}
	 * labeled alternative in {@link MySQLParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandlerConditionNotfound(MySQLParser.HandlerConditionNotfoundContext ctx);
	/**
	 * Visit a parse tree produced by the {@code handlerConditionException}
	 * labeled alternative in {@link MySQLParser#handlerConditionValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandlerConditionException(MySQLParser.HandlerConditionExceptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#procedureSqlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureSqlStatement(MySQLParser.ProcedureSqlStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#caseAlternative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseAlternative(MySQLParser.CaseAlternativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#elifAlternative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElifAlternative(MySQLParser.ElifAlternativeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterUserMysqlV56}
	 * labeled alternative in {@link MySQLParser#alterUser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterUserMysqlV56(MySQLParser.AlterUserMysqlV56Context ctx);
	/**
	 * Visit a parse tree produced by the {@code alterUserMysqlV57}
	 * labeled alternative in {@link MySQLParser#alterUser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterUserMysqlV57(MySQLParser.AlterUserMysqlV57Context ctx);
	/**
	 * Visit a parse tree produced by the {@code createUserMysqlV56}
	 * labeled alternative in {@link MySQLParser#createUser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateUserMysqlV56(MySQLParser.CreateUserMysqlV56Context ctx);
	/**
	 * Visit a parse tree produced by the {@code createUserMysqlV57}
	 * labeled alternative in {@link MySQLParser#createUser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateUserMysqlV57(MySQLParser.CreateUserMysqlV57Context ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#dropUser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropUser(MySQLParser.DropUserContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#grantStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantStatement(MySQLParser.GrantStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#grantProxy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGrantProxy(MySQLParser.GrantProxyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#renameUser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameUser(MySQLParser.RenameUserContext ctx);
	/**
	 * Visit a parse tree produced by the {@code detailRevoke}
	 * labeled alternative in {@link MySQLParser#revokeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDetailRevoke(MySQLParser.DetailRevokeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code shortRevoke}
	 * labeled alternative in {@link MySQLParser#revokeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShortRevoke(MySQLParser.ShortRevokeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#revokeProxy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRevokeProxy(MySQLParser.RevokeProxyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#setPasswordStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetPasswordStatement(MySQLParser.SetPasswordStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#userSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserSpecification(MySQLParser.UserSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code passwordAuthOption}
	 * labeled alternative in {@link MySQLParser#userAuthOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPasswordAuthOption(MySQLParser.PasswordAuthOptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringAuthOption}
	 * labeled alternative in {@link MySQLParser#userAuthOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringAuthOption(MySQLParser.StringAuthOptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code hashAuthOption}
	 * labeled alternative in {@link MySQLParser#userAuthOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHashAuthOption(MySQLParser.HashAuthOptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleAuthOption}
	 * labeled alternative in {@link MySQLParser#userAuthOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleAuthOption(MySQLParser.SimpleAuthOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#tlsOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTlsOption(MySQLParser.TlsOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#userResourceOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserResourceOption(MySQLParser.UserResourceOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#userPasswordOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserPasswordOption(MySQLParser.UserPasswordOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#userLockOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserLockOption(MySQLParser.UserLockOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#privelegeClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivelegeClause(MySQLParser.PrivelegeClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#privilege}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivilege(MySQLParser.PrivilegeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code currentSchemaPriviLevel}
	 * labeled alternative in {@link MySQLParser#privilegeLevel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrentSchemaPriviLevel(MySQLParser.CurrentSchemaPriviLevelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code globalPrivLevel}
	 * labeled alternative in {@link MySQLParser#privilegeLevel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGlobalPrivLevel(MySQLParser.GlobalPrivLevelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code definiteSchemaPrivLevel}
	 * labeled alternative in {@link MySQLParser#privilegeLevel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefiniteSchemaPrivLevel(MySQLParser.DefiniteSchemaPrivLevelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code definiteFullTablePrivLevel}
	 * labeled alternative in {@link MySQLParser#privilegeLevel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefiniteFullTablePrivLevel(MySQLParser.DefiniteFullTablePrivLevelContext ctx);
	/**
	 * Visit a parse tree produced by the {@code definiteFullTablePrivLevel2}
	 * labeled alternative in {@link MySQLParser#privilegeLevel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefiniteFullTablePrivLevel2(MySQLParser.DefiniteFullTablePrivLevel2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code definiteTablePrivLevel}
	 * labeled alternative in {@link MySQLParser#privilegeLevel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefiniteTablePrivLevel(MySQLParser.DefiniteTablePrivLevelContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#renameUserClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameUserClause(MySQLParser.RenameUserClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#analyzeTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnalyzeTable(MySQLParser.AnalyzeTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#checkTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckTable(MySQLParser.CheckTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#checksumTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChecksumTable(MySQLParser.ChecksumTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#optimizeTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptimizeTable(MySQLParser.OptimizeTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#repairTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepairTable(MySQLParser.RepairTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#checkTableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckTableOption(MySQLParser.CheckTableOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#createUdfunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateUdfunction(MySQLParser.CreateUdfunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#installPlugin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstallPlugin(MySQLParser.InstallPluginContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#uninstallPlugin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUninstallPlugin(MySQLParser.UninstallPluginContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setVariable}
	 * labeled alternative in {@link MySQLParser#setStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetVariable(MySQLParser.SetVariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setCharset}
	 * labeled alternative in {@link MySQLParser#setStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetCharset(MySQLParser.SetCharsetContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setNames}
	 * labeled alternative in {@link MySQLParser#setStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetNames(MySQLParser.SetNamesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setPassword}
	 * labeled alternative in {@link MySQLParser#setStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetPassword(MySQLParser.SetPasswordContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setTransaction}
	 * labeled alternative in {@link MySQLParser#setStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetTransaction(MySQLParser.SetTransactionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setAutocommit}
	 * labeled alternative in {@link MySQLParser#setStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetAutocommit(MySQLParser.SetAutocommitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setNewValueInsideTrigger}
	 * labeled alternative in {@link MySQLParser#setStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetNewValueInsideTrigger(MySQLParser.SetNewValueInsideTriggerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showMasterLogs}
	 * labeled alternative in {@link MySQLParser#showStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowMasterLogs(MySQLParser.ShowMasterLogsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showLogEvents}
	 * labeled alternative in {@link MySQLParser#showStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowLogEvents(MySQLParser.ShowLogEventsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showObjectFilter}
	 * labeled alternative in {@link MySQLParser#showStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowObjectFilter(MySQLParser.ShowObjectFilterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showColumns}
	 * labeled alternative in {@link MySQLParser#showStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowColumns(MySQLParser.ShowColumnsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showCreateDb}
	 * labeled alternative in {@link MySQLParser#showStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCreateDb(MySQLParser.ShowCreateDbContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showCreateFullIdObject}
	 * labeled alternative in {@link MySQLParser#showStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCreateFullIdObject(MySQLParser.ShowCreateFullIdObjectContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showCreateUser}
	 * labeled alternative in {@link MySQLParser#showStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCreateUser(MySQLParser.ShowCreateUserContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showEngine}
	 * labeled alternative in {@link MySQLParser#showStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowEngine(MySQLParser.ShowEngineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showGlobalInfo}
	 * labeled alternative in {@link MySQLParser#showStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowGlobalInfo(MySQLParser.ShowGlobalInfoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showErrors}
	 * labeled alternative in {@link MySQLParser#showStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowErrors(MySQLParser.ShowErrorsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showCountErrors}
	 * labeled alternative in {@link MySQLParser#showStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCountErrors(MySQLParser.ShowCountErrorsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showSchemaFilter}
	 * labeled alternative in {@link MySQLParser#showStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowSchemaFilter(MySQLParser.ShowSchemaFilterContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showRoutine}
	 * labeled alternative in {@link MySQLParser#showStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowRoutine(MySQLParser.ShowRoutineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showGrants}
	 * labeled alternative in {@link MySQLParser#showStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowGrants(MySQLParser.ShowGrantsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showIndexes}
	 * labeled alternative in {@link MySQLParser#showStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowIndexes(MySQLParser.ShowIndexesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showOpenTables}
	 * labeled alternative in {@link MySQLParser#showStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowOpenTables(MySQLParser.ShowOpenTablesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showProfile}
	 * labeled alternative in {@link MySQLParser#showStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowProfile(MySQLParser.ShowProfileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showSlaveStatus}
	 * labeled alternative in {@link MySQLParser#showStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowSlaveStatus(MySQLParser.ShowSlaveStatusContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#variableClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariableClause(MySQLParser.VariableClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#showCommonEntity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCommonEntity(MySQLParser.ShowCommonEntityContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#showFilter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowFilter(MySQLParser.ShowFilterContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#showGlobalInfoClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowGlobalInfoClause(MySQLParser.ShowGlobalInfoClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#showSchemaEntity}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowSchemaEntity(MySQLParser.ShowSchemaEntityContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#showProfileType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowProfileType(MySQLParser.ShowProfileTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#binlogStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinlogStatement(MySQLParser.BinlogStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#cacheIndexStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCacheIndexStatement(MySQLParser.CacheIndexStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#flushStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlushStatement(MySQLParser.FlushStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#killStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKillStatement(MySQLParser.KillStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#loadIndexIntoCache}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoadIndexIntoCache(MySQLParser.LoadIndexIntoCacheContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#resetStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResetStatement(MySQLParser.ResetStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#shutdownStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShutdownStatement(MySQLParser.ShutdownStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#tableIndexes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableIndexes(MySQLParser.TableIndexesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleFlushOption}
	 * labeled alternative in {@link MySQLParser#flushOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleFlushOption(MySQLParser.SimpleFlushOptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code channelFlushOption}
	 * labeled alternative in {@link MySQLParser#flushOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChannelFlushOption(MySQLParser.ChannelFlushOptionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableFlushOption}
	 * labeled alternative in {@link MySQLParser#flushOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableFlushOption(MySQLParser.TableFlushOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#flushTableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlushTableOption(MySQLParser.FlushTableOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#loadedTableIndexes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoadedTableIndexes(MySQLParser.LoadedTableIndexesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#simpleDescribeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleDescribeStatement(MySQLParser.SimpleDescribeStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#fullDescribeStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullDescribeStatement(MySQLParser.FullDescribeStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#helpStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHelpStatement(MySQLParser.HelpStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#useStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseStatement(MySQLParser.UseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#signalStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignalStatement(MySQLParser.SignalStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#resignalStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResignalStatement(MySQLParser.ResignalStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#signalConditionInformation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignalConditionInformation(MySQLParser.SignalConditionInformationContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#diagnosticsStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiagnosticsStatement(MySQLParser.DiagnosticsStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#diagnosticsConditionInformationName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDiagnosticsConditionInformationName(MySQLParser.DiagnosticsConditionInformationNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code describeStatements}
	 * labeled alternative in {@link MySQLParser#describeObjectClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeStatements(MySQLParser.DescribeStatementsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code describeConnection}
	 * labeled alternative in {@link MySQLParser#describeObjectClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeConnection(MySQLParser.DescribeConnectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#fullId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullId(MySQLParser.FullIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#tableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(MySQLParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#fullColumnName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullColumnName(MySQLParser.FullColumnNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#indexColumnName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexColumnName(MySQLParser.IndexColumnNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#userName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserName(MySQLParser.UserNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#mysqlVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMysqlVariable(MySQLParser.MysqlVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#charsetName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharsetName(MySQLParser.CharsetNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#collationName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollationName(MySQLParser.CollationNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#engineName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEngineName(MySQLParser.EngineNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#uuidSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUuidSet(MySQLParser.UuidSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#xid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXid(MySQLParser.XidContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#xuidStringId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitXuidStringId(MySQLParser.XuidStringIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#authPlugin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAuthPlugin(MySQLParser.AuthPluginContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#uid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUid(MySQLParser.UidContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#simpleId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleId(MySQLParser.SimpleIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#dottedId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDottedId(MySQLParser.DottedIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#decimalLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalLiteral(MySQLParser.DecimalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#fileSizeLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileSizeLiteral(MySQLParser.FileSizeLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#stringLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(MySQLParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#booleanLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(MySQLParser.BooleanLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#hexadecimalLiteral}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHexadecimalLiteral(MySQLParser.HexadecimalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#nullNotnull}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullNotnull(MySQLParser.NullNotnullContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(MySQLParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringDataType}
	 * labeled alternative in {@link MySQLParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringDataType(MySQLParser.StringDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nationalStringDataType}
	 * labeled alternative in {@link MySQLParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNationalStringDataType(MySQLParser.NationalStringDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nationalVaryingStringDataType}
	 * labeled alternative in {@link MySQLParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNationalVaryingStringDataType(MySQLParser.NationalVaryingStringDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dimensionDataType}
	 * labeled alternative in {@link MySQLParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDimensionDataType(MySQLParser.DimensionDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleDataType}
	 * labeled alternative in {@link MySQLParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleDataType(MySQLParser.SimpleDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code collectionDataType}
	 * labeled alternative in {@link MySQLParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollectionDataType(MySQLParser.CollectionDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code spatialDataType}
	 * labeled alternative in {@link MySQLParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpatialDataType(MySQLParser.SpatialDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#collectionOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollectionOptions(MySQLParser.CollectionOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#convertedDataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConvertedDataType(MySQLParser.ConvertedDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#lengthOneDimension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLengthOneDimension(MySQLParser.LengthOneDimensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#lengthTwoDimension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLengthTwoDimension(MySQLParser.LengthTwoDimensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#lengthTwoOptionalDimension}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLengthTwoOptionalDimension(MySQLParser.LengthTwoOptionalDimensionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#uidList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUidList(MySQLParser.UidListContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#tables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTables(MySQLParser.TablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#indexColumnNames}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexColumnNames(MySQLParser.IndexColumnNamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#expressions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressions(MySQLParser.ExpressionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#expressionsWithDefaults}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionsWithDefaults(MySQLParser.ExpressionsWithDefaultsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#constants}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstants(MySQLParser.ConstantsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#simpleStrings}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleStrings(MySQLParser.SimpleStringsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#userVariables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserVariables(MySQLParser.UserVariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#defaultValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultValue(MySQLParser.DefaultValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#currentTimestamp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrentTimestamp(MySQLParser.CurrentTimestampContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#expressionOrDefault}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionOrDefault(MySQLParser.ExpressionOrDefaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#ifExists}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExists(MySQLParser.IfExistsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#ifNotExists}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfNotExists(MySQLParser.IfNotExistsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code specificFunctionCall}
	 * labeled alternative in {@link MySQLParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecificFunctionCall(MySQLParser.SpecificFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code aggregateFunctionCall}
	 * labeled alternative in {@link MySQLParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregateFunctionCall(MySQLParser.AggregateFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code scalarFunctionCall}
	 * labeled alternative in {@link MySQLParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalarFunctionCall(MySQLParser.ScalarFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code udfFunctionCall}
	 * labeled alternative in {@link MySQLParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUdfFunctionCall(MySQLParser.UdfFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code passwordFunctionCall}
	 * labeled alternative in {@link MySQLParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPasswordFunctionCall(MySQLParser.PasswordFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleFunctionCall}
	 * labeled alternative in {@link MySQLParser#specificFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleFunctionCall(MySQLParser.SimpleFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dataTypeFunctionCall}
	 * labeled alternative in {@link MySQLParser#specificFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataTypeFunctionCall(MySQLParser.DataTypeFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valuesFunctionCall}
	 * labeled alternative in {@link MySQLParser#specificFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValuesFunctionCall(MySQLParser.ValuesFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code caseFunctionCall}
	 * labeled alternative in {@link MySQLParser#specificFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseFunctionCall(MySQLParser.CaseFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code charFunctionCall}
	 * labeled alternative in {@link MySQLParser#specificFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharFunctionCall(MySQLParser.CharFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code positionFunctionCall}
	 * labeled alternative in {@link MySQLParser#specificFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositionFunctionCall(MySQLParser.PositionFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code substrFunctionCall}
	 * labeled alternative in {@link MySQLParser#specificFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstrFunctionCall(MySQLParser.SubstrFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code trimFunctionCall}
	 * labeled alternative in {@link MySQLParser#specificFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrimFunctionCall(MySQLParser.TrimFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code weightFunctionCall}
	 * labeled alternative in {@link MySQLParser#specificFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWeightFunctionCall(MySQLParser.WeightFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code extractFunctionCall}
	 * labeled alternative in {@link MySQLParser#specificFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtractFunctionCall(MySQLParser.ExtractFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code getFormatFunctionCall}
	 * labeled alternative in {@link MySQLParser#specificFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGetFormatFunctionCall(MySQLParser.GetFormatFunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#caseFuncAlternative}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseFuncAlternative(MySQLParser.CaseFuncAlternativeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code levelWeightList}
	 * labeled alternative in {@link MySQLParser#levelsInWeightString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLevelWeightList(MySQLParser.LevelWeightListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code levelWeightRange}
	 * labeled alternative in {@link MySQLParser#levelsInWeightString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLevelWeightRange(MySQLParser.LevelWeightRangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#levelInWeightListElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLevelInWeightListElement(MySQLParser.LevelInWeightListElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#aggregateWindowedFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregateWindowedFunction(MySQLParser.AggregateWindowedFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#scalarFunctionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScalarFunctionName(MySQLParser.ScalarFunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#passwordFunctionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPasswordFunctionClause(MySQLParser.PasswordFunctionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#functionArgs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionArgs(MySQLParser.FunctionArgsContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#functionArg}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionArg(MySQLParser.FunctionArgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code isExpression}
	 * labeled alternative in {@link MySQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsExpression(MySQLParser.IsExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code notExpression}
	 * labeled alternative in {@link MySQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotExpression(MySQLParser.NotExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalExpression}
	 * labeled alternative in {@link MySQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalExpression(MySQLParser.LogicalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code predicateExpression}
	 * labeled alternative in {@link MySQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicateExpression(MySQLParser.PredicateExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code soundsLikePredicate}
	 * labeled alternative in {@link MySQLParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSoundsLikePredicate(MySQLParser.SoundsLikePredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expressionAtomPredicate}
	 * labeled alternative in {@link MySQLParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpressionAtomPredicate(MySQLParser.ExpressionAtomPredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inPredicate}
	 * labeled alternative in {@link MySQLParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInPredicate(MySQLParser.InPredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subqueryComparasionPredicate}
	 * labeled alternative in {@link MySQLParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubqueryComparasionPredicate(MySQLParser.SubqueryComparasionPredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code betweenPredicate}
	 * labeled alternative in {@link MySQLParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBetweenPredicate(MySQLParser.BetweenPredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binaryComparasionPredicate}
	 * labeled alternative in {@link MySQLParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryComparasionPredicate(MySQLParser.BinaryComparasionPredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code isNullPredicate}
	 * labeled alternative in {@link MySQLParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsNullPredicate(MySQLParser.IsNullPredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code likePredicate}
	 * labeled alternative in {@link MySQLParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLikePredicate(MySQLParser.LikePredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code regexpPredicate}
	 * labeled alternative in {@link MySQLParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegexpPredicate(MySQLParser.RegexpPredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unaryExpressionAtom}
	 * labeled alternative in {@link MySQLParser#expressionAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryExpressionAtom(MySQLParser.UnaryExpressionAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code collateExpressionAtom}
	 * labeled alternative in {@link MySQLParser#expressionAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollateExpressionAtom(MySQLParser.CollateExpressionAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subqueryExpessionAtom}
	 * labeled alternative in {@link MySQLParser#expressionAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubqueryExpessionAtom(MySQLParser.SubqueryExpessionAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mysqlVariableExpressionAtom}
	 * labeled alternative in {@link MySQLParser#expressionAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMysqlVariableExpressionAtom(MySQLParser.MysqlVariableExpressionAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nestedExpressionAtom}
	 * labeled alternative in {@link MySQLParser#expressionAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedExpressionAtom(MySQLParser.NestedExpressionAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nestedRowExpressionAtom}
	 * labeled alternative in {@link MySQLParser#expressionAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedRowExpressionAtom(MySQLParser.NestedRowExpressionAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mathExpressionAtom}
	 * labeled alternative in {@link MySQLParser#expressionAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathExpressionAtom(MySQLParser.MathExpressionAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intervalExpressionAtom}
	 * labeled alternative in {@link MySQLParser#expressionAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalExpressionAtom(MySQLParser.IntervalExpressionAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code existsExpessionAtom}
	 * labeled alternative in {@link MySQLParser#expressionAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExistsExpessionAtom(MySQLParser.ExistsExpessionAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constantExpressionAtom}
	 * labeled alternative in {@link MySQLParser#expressionAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantExpressionAtom(MySQLParser.ConstantExpressionAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCallExpressionAtom}
	 * labeled alternative in {@link MySQLParser#expressionAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCallExpressionAtom(MySQLParser.FunctionCallExpressionAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code binaryExpressionAtom}
	 * labeled alternative in {@link MySQLParser#expressionAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryExpressionAtom(MySQLParser.BinaryExpressionAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fullColumnNameExpressionAtom}
	 * labeled alternative in {@link MySQLParser#expressionAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFullColumnNameExpressionAtom(MySQLParser.FullColumnNameExpressionAtomContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bitExpressionAtom}
	 * labeled alternative in {@link MySQLParser#expressionAtom}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitExpressionAtom(MySQLParser.BitExpressionAtomContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#unaryOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOperator(MySQLParser.UnaryOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(MySQLParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#logicalOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalOperator(MySQLParser.LogicalOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#bitOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitOperator(MySQLParser.BitOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#mathOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMathOperator(MySQLParser.MathOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#charsetNameBase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharsetNameBase(MySQLParser.CharsetNameBaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#transactionLevelBase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransactionLevelBase(MySQLParser.TransactionLevelBaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#privilegesBase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrivilegesBase(MySQLParser.PrivilegesBaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#intervalTypeBase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalTypeBase(MySQLParser.IntervalTypeBaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#dataTypeBase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataTypeBase(MySQLParser.DataTypeBaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#keywordsCanBeId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeywordsCanBeId(MySQLParser.KeywordsCanBeIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link MySQLParser#functionNameBase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionNameBase(MySQLParser.FunctionNameBaseContext ctx);
}