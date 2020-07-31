// Generated from com/dataworker/sql/parser/antlr4/spark/SparkSqlBase.g4 by ANTLR 4.7.2
package com.dataworker.sql.parser.antlr4.spark;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SparkSqlBaseParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SparkSqlBaseVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#singleStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleStatement(SparkSqlBaseParser.SingleStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#singleExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleExpression(SparkSqlBaseParser.SingleExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#singleTableIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleTableIdentifier(SparkSqlBaseParser.SingleTableIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#singleMultipartIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleMultipartIdentifier(SparkSqlBaseParser.SingleMultipartIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#singleFunctionIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleFunctionIdentifier(SparkSqlBaseParser.SingleFunctionIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#singleDataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleDataType(SparkSqlBaseParser.SingleDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#singleTableSchema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleTableSchema(SparkSqlBaseParser.SingleTableSchemaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code statementDefault}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStatementDefault(SparkSqlBaseParser.StatementDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dmlStatement}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDmlStatement(SparkSqlBaseParser.DmlStatementContext ctx);
	/**
	 * Visit a parse tree produced by the {@code use}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUse(SparkSqlBaseParser.UseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createNamespace}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateNamespace(SparkSqlBaseParser.CreateNamespaceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setNamespaceProperties}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetNamespaceProperties(SparkSqlBaseParser.SetNamespacePropertiesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setNamespaceLocation}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetNamespaceLocation(SparkSqlBaseParser.SetNamespaceLocationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropNamespace}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropNamespace(SparkSqlBaseParser.DropNamespaceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showNamespaces}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowNamespaces(SparkSqlBaseParser.ShowNamespacesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createTable}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTable(SparkSqlBaseParser.CreateTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createHiveTable}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateHiveTable(SparkSqlBaseParser.CreateHiveTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createTableLike}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableLike(SparkSqlBaseParser.CreateTableLikeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code replaceTable}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReplaceTable(SparkSqlBaseParser.ReplaceTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code analyze}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnalyze(SparkSqlBaseParser.AnalyzeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addTableColumns}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddTableColumns(SparkSqlBaseParser.AddTableColumnsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code renameTableColumn}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameTableColumn(SparkSqlBaseParser.RenameTableColumnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropTableColumns}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTableColumns(SparkSqlBaseParser.DropTableColumnsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code renameTable}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameTable(SparkSqlBaseParser.RenameTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setTableProperties}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetTableProperties(SparkSqlBaseParser.SetTablePropertiesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unsetTableProperties}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsetTableProperties(SparkSqlBaseParser.UnsetTablePropertiesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterTableAlterColumn}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableAlterColumn(SparkSqlBaseParser.AlterTableAlterColumnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code hiveChangeColumn}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHiveChangeColumn(SparkSqlBaseParser.HiveChangeColumnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setTableSerDe}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetTableSerDe(SparkSqlBaseParser.SetTableSerDeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addTablePartition}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddTablePartition(SparkSqlBaseParser.AddTablePartitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code renameTablePartition}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameTablePartition(SparkSqlBaseParser.RenameTablePartitionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropTablePartitions}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTablePartitions(SparkSqlBaseParser.DropTablePartitionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setTableLocation}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetTableLocation(SparkSqlBaseParser.SetTableLocationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code recoverPartitions}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecoverPartitions(SparkSqlBaseParser.RecoverPartitionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropTable}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTable(SparkSqlBaseParser.DropTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropView}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropView(SparkSqlBaseParser.DropViewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createView}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateView(SparkSqlBaseParser.CreateViewContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createTempViewUsing}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTempViewUsing(SparkSqlBaseParser.CreateTempViewUsingContext ctx);
	/**
	 * Visit a parse tree produced by the {@code alterViewQuery}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterViewQuery(SparkSqlBaseParser.AlterViewQueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createFunction}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateFunction(SparkSqlBaseParser.CreateFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dropFunction}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropFunction(SparkSqlBaseParser.DropFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code explain}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplain(SparkSqlBaseParser.ExplainContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showTables}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowTables(SparkSqlBaseParser.ShowTablesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showTable}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowTable(SparkSqlBaseParser.ShowTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showTblProperties}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowTblProperties(SparkSqlBaseParser.ShowTblPropertiesContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showColumns}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowColumns(SparkSqlBaseParser.ShowColumnsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showViews}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowViews(SparkSqlBaseParser.ShowViewsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showPartitions}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowPartitions(SparkSqlBaseParser.ShowPartitionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showFunctions}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowFunctions(SparkSqlBaseParser.ShowFunctionsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showCreateTable}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCreateTable(SparkSqlBaseParser.ShowCreateTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showCurrentNamespace}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCurrentNamespace(SparkSqlBaseParser.ShowCurrentNamespaceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code describeFunction}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeFunction(SparkSqlBaseParser.DescribeFunctionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code describeNamespace}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeNamespace(SparkSqlBaseParser.DescribeNamespaceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code describeDeltaDetail}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeDeltaDetail(SparkSqlBaseParser.DescribeDeltaDetailContext ctx);
	/**
	 * Visit a parse tree produced by the {@code describeDeltaHistory}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeDeltaHistory(SparkSqlBaseParser.DescribeDeltaHistoryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code describeRelation}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeRelation(SparkSqlBaseParser.DescribeRelationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code describeQuery}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeQuery(SparkSqlBaseParser.DescribeQueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code commentNamespace}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommentNamespace(SparkSqlBaseParser.CommentNamespaceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code commentTable}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommentTable(SparkSqlBaseParser.CommentTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code refreshTable}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefreshTable(SparkSqlBaseParser.RefreshTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code refreshResource}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefreshResource(SparkSqlBaseParser.RefreshResourceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cacheTable}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCacheTable(SparkSqlBaseParser.CacheTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code uncacheTable}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUncacheTable(SparkSqlBaseParser.UncacheTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code clearCache}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClearCache(SparkSqlBaseParser.ClearCacheContext ctx);
	/**
	 * Visit a parse tree produced by the {@code loadData}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoadData(SparkSqlBaseParser.LoadDataContext ctx);
	/**
	 * Visit a parse tree produced by the {@code truncateTable}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTruncateTable(SparkSqlBaseParser.TruncateTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code repairTable}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepairTable(SparkSqlBaseParser.RepairTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code manageResource}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitManageResource(SparkSqlBaseParser.ManageResourceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code failNativeCommand}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFailNativeCommand(SparkSqlBaseParser.FailNativeCommandContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setConfiguration}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetConfiguration(SparkSqlBaseParser.SetConfigurationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code resetConfiguration}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResetConfiguration(SparkSqlBaseParser.ResetConfigurationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mergeTable}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMergeTable(SparkSqlBaseParser.MergeTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code killJob}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKillJob(SparkSqlBaseParser.KillJobContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addJar}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddJar(SparkSqlBaseParser.AddJarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code readTable}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReadTable(SparkSqlBaseParser.ReadTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code loadTempTable}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoadTempTable(SparkSqlBaseParser.LoadTempTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exportTable}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExportTable(SparkSqlBaseParser.ExportTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compressTable}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompressTable(SparkSqlBaseParser.CompressTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code compressFile}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompressFile(SparkSqlBaseParser.CompressFileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code distcpDatasource}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDistcpDatasource(SparkSqlBaseParser.DistcpDatasourceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code vacuumTable}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVacuumTable(SparkSqlBaseParser.VacuumTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code deltaConvert}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeltaConvert(SparkSqlBaseParser.DeltaConvertContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#dataSource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataSource(SparkSqlBaseParser.DataSourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#unsupportedHiveNativeCommands}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsupportedHiveNativeCommands(SparkSqlBaseParser.UnsupportedHiveNativeCommandsContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#createTableHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableHeader(SparkSqlBaseParser.CreateTableHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#replaceTableHeader}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReplaceTableHeader(SparkSqlBaseParser.ReplaceTableHeaderContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#bucketSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBucketSpec(SparkSqlBaseParser.BucketSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#skewSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSkewSpec(SparkSqlBaseParser.SkewSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#locationSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocationSpec(SparkSqlBaseParser.LocationSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#commentSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommentSpec(SparkSqlBaseParser.CommentSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(SparkSqlBaseParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code insertOverwriteTable}
	 * labeled alternative in {@link SparkSqlBaseParser#insertInto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertOverwriteTable(SparkSqlBaseParser.InsertOverwriteTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code insertIntoTable}
	 * labeled alternative in {@link SparkSqlBaseParser#insertInto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertIntoTable(SparkSqlBaseParser.InsertIntoTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code insertOverwriteHiveDir}
	 * labeled alternative in {@link SparkSqlBaseParser#insertInto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertOverwriteHiveDir(SparkSqlBaseParser.InsertOverwriteHiveDirContext ctx);
	/**
	 * Visit a parse tree produced by the {@code insertOverwriteDir}
	 * labeled alternative in {@link SparkSqlBaseParser#insertInto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertOverwriteDir(SparkSqlBaseParser.InsertOverwriteDirContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#partitionSpecLocation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionSpecLocation(SparkSqlBaseParser.PartitionSpecLocationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#partitionSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionSpec(SparkSqlBaseParser.PartitionSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#partitionVal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionVal(SparkSqlBaseParser.PartitionValContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#namespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamespace(SparkSqlBaseParser.NamespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#describeFuncName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeFuncName(SparkSqlBaseParser.DescribeFuncNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#describeColName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeColName(SparkSqlBaseParser.DescribeColNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#ctes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCtes(SparkSqlBaseParser.CtesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#namedQuery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedQuery(SparkSqlBaseParser.NamedQueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#tableProvider}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableProvider(SparkSqlBaseParser.TableProviderContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#createTableClauses}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableClauses(SparkSqlBaseParser.CreateTableClausesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#tablePropertyList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablePropertyList(SparkSqlBaseParser.TablePropertyListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#tableProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableProperty(SparkSqlBaseParser.TablePropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#tablePropertyKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablePropertyKey(SparkSqlBaseParser.TablePropertyKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#tablePropertyValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablePropertyValue(SparkSqlBaseParser.TablePropertyValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#constantList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantList(SparkSqlBaseParser.ConstantListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#nestedConstantList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNestedConstantList(SparkSqlBaseParser.NestedConstantListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#createFileFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateFileFormat(SparkSqlBaseParser.CreateFileFormatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableFileFormat}
	 * labeled alternative in {@link SparkSqlBaseParser#fileFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableFileFormat(SparkSqlBaseParser.TableFileFormatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code genericFileFormat}
	 * labeled alternative in {@link SparkSqlBaseParser#fileFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenericFileFormat(SparkSqlBaseParser.GenericFileFormatContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#storageHandler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorageHandler(SparkSqlBaseParser.StorageHandlerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#resource}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResource(SparkSqlBaseParser.ResourceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code singleInsertQuery}
	 * labeled alternative in {@link SparkSqlBaseParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleInsertQuery(SparkSqlBaseParser.SingleInsertQueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiInsertQuery}
	 * labeled alternative in {@link SparkSqlBaseParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiInsertQuery(SparkSqlBaseParser.MultiInsertQueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code deleteFromTable}
	 * labeled alternative in {@link SparkSqlBaseParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteFromTable(SparkSqlBaseParser.DeleteFromTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code updateTable}
	 * labeled alternative in {@link SparkSqlBaseParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateTable(SparkSqlBaseParser.UpdateTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code mergeIntoTable}
	 * labeled alternative in {@link SparkSqlBaseParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMergeIntoTable(SparkSqlBaseParser.MergeIntoTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#queryOrganization}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryOrganization(SparkSqlBaseParser.QueryOrganizationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#multiInsertQueryBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiInsertQueryBody(SparkSqlBaseParser.MultiInsertQueryBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code queryTermDefault}
	 * labeled alternative in {@link SparkSqlBaseParser#queryTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryTermDefault(SparkSqlBaseParser.QueryTermDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code setOperation}
	 * labeled alternative in {@link SparkSqlBaseParser#queryTerm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetOperation(SparkSqlBaseParser.SetOperationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code queryPrimaryDefault}
	 * labeled alternative in {@link SparkSqlBaseParser#queryPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryPrimaryDefault(SparkSqlBaseParser.QueryPrimaryDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code fromStmt}
	 * labeled alternative in {@link SparkSqlBaseParser#queryPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromStmt(SparkSqlBaseParser.FromStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code table}
	 * labeled alternative in {@link SparkSqlBaseParser#queryPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTable(SparkSqlBaseParser.TableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inlineTableDefault1}
	 * labeled alternative in {@link SparkSqlBaseParser#queryPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineTableDefault1(SparkSqlBaseParser.InlineTableDefault1Context ctx);
	/**
	 * Visit a parse tree produced by the {@code subquery}
	 * labeled alternative in {@link SparkSqlBaseParser#queryPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery(SparkSqlBaseParser.SubqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#sortItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSortItem(SparkSqlBaseParser.SortItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#fromStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromStatement(SparkSqlBaseParser.FromStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#fromStatementBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromStatementBody(SparkSqlBaseParser.FromStatementBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code transformQuerySpecification}
	 * labeled alternative in {@link SparkSqlBaseParser#querySpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransformQuerySpecification(SparkSqlBaseParser.TransformQuerySpecificationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code regularQuerySpecification}
	 * labeled alternative in {@link SparkSqlBaseParser#querySpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegularQuerySpecification(SparkSqlBaseParser.RegularQuerySpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#transformClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransformClause(SparkSqlBaseParser.TransformClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#selectClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectClause(SparkSqlBaseParser.SelectClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#setClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetClause(SparkSqlBaseParser.SetClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#matchedClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchedClause(SparkSqlBaseParser.MatchedClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#notMatchedClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotMatchedClause(SparkSqlBaseParser.NotMatchedClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#matchedAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchedAction(SparkSqlBaseParser.MatchedActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#notMatchedAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotMatchedAction(SparkSqlBaseParser.NotMatchedActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#assignmentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentList(SparkSqlBaseParser.AssignmentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(SparkSqlBaseParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(SparkSqlBaseParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#havingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHavingClause(SparkSqlBaseParser.HavingClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#hint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHint(SparkSqlBaseParser.HintContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#hintStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHintStatement(SparkSqlBaseParser.HintStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#fromClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromClause(SparkSqlBaseParser.FromClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#aggregationClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregationClause(SparkSqlBaseParser.AggregationClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#groupingSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupingSet(SparkSqlBaseParser.GroupingSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#pivotClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPivotClause(SparkSqlBaseParser.PivotClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#pivotColumn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPivotColumn(SparkSqlBaseParser.PivotColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#pivotValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPivotValue(SparkSqlBaseParser.PivotValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#lateralView}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLateralView(SparkSqlBaseParser.LateralViewContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#setQuantifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetQuantifier(SparkSqlBaseParser.SetQuantifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#relation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRelation(SparkSqlBaseParser.RelationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#joinRelation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinRelation(SparkSqlBaseParser.JoinRelationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#joinType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinType(SparkSqlBaseParser.JoinTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#joinCriteria}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinCriteria(SparkSqlBaseParser.JoinCriteriaContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#sample}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSample(SparkSqlBaseParser.SampleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sampleByPercentile}
	 * labeled alternative in {@link SparkSqlBaseParser#sampleMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSampleByPercentile(SparkSqlBaseParser.SampleByPercentileContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sampleByRows}
	 * labeled alternative in {@link SparkSqlBaseParser#sampleMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSampleByRows(SparkSqlBaseParser.SampleByRowsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sampleByBucket}
	 * labeled alternative in {@link SparkSqlBaseParser#sampleMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSampleByBucket(SparkSqlBaseParser.SampleByBucketContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sampleByBytes}
	 * labeled alternative in {@link SparkSqlBaseParser#sampleMethod}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSampleByBytes(SparkSqlBaseParser.SampleByBytesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(SparkSqlBaseParser.IdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#identifierSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierSeq(SparkSqlBaseParser.IdentifierSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#orderedIdentifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderedIdentifierList(SparkSqlBaseParser.OrderedIdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#orderedIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderedIdentifier(SparkSqlBaseParser.OrderedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#identifierCommentList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierCommentList(SparkSqlBaseParser.IdentifierCommentListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#identifierComment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierComment(SparkSqlBaseParser.IdentifierCommentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tableName}
	 * labeled alternative in {@link SparkSqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(SparkSqlBaseParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by the {@code aliasedQuery}
	 * labeled alternative in {@link SparkSqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAliasedQuery(SparkSqlBaseParser.AliasedQueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code aliasedRelation}
	 * labeled alternative in {@link SparkSqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAliasedRelation(SparkSqlBaseParser.AliasedRelationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code inlineTableDefault2}
	 * labeled alternative in {@link SparkSqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineTableDefault2(SparkSqlBaseParser.InlineTableDefault2Context ctx);
	/**
	 * Visit a parse tree produced by the {@code tableValuedFunction}
	 * labeled alternative in {@link SparkSqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableValuedFunction(SparkSqlBaseParser.TableValuedFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#inlineTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInlineTable(SparkSqlBaseParser.InlineTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#functionTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionTable(SparkSqlBaseParser.FunctionTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#tableAlias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableAlias(SparkSqlBaseParser.TableAliasContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rowFormatSerde}
	 * labeled alternative in {@link SparkSqlBaseParser#rowFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowFormatSerde(SparkSqlBaseParser.RowFormatSerdeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rowFormatDelimited}
	 * labeled alternative in {@link SparkSqlBaseParser#rowFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowFormatDelimited(SparkSqlBaseParser.RowFormatDelimitedContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#multipartIdentifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipartIdentifierList(SparkSqlBaseParser.MultipartIdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#multipartIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipartIdentifier(SparkSqlBaseParser.MultipartIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#tableIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableIdentifier(SparkSqlBaseParser.TableIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#functionIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionIdentifier(SparkSqlBaseParser.FunctionIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#namedExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedExpression(SparkSqlBaseParser.NamedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#namedExpressionSeq}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedExpressionSeq(SparkSqlBaseParser.NamedExpressionSeqContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#transformList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransformList(SparkSqlBaseParser.TransformListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identityTransform}
	 * labeled alternative in {@link SparkSqlBaseParser#transform}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentityTransform(SparkSqlBaseParser.IdentityTransformContext ctx);
	/**
	 * Visit a parse tree produced by the {@code applyTransform}
	 * labeled alternative in {@link SparkSqlBaseParser#transform}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApplyTransform(SparkSqlBaseParser.ApplyTransformContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#transformArgument}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransformArgument(SparkSqlBaseParser.TransformArgumentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SparkSqlBaseParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link SparkSqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalNot(SparkSqlBaseParser.LogicalNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code predicated}
	 * labeled alternative in {@link SparkSqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicated(SparkSqlBaseParser.PredicatedContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exists}
	 * labeled alternative in {@link SparkSqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExists(SparkSqlBaseParser.ExistsContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logicalBinary}
	 * labeled alternative in {@link SparkSqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogicalBinary(SparkSqlBaseParser.LogicalBinaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate(SparkSqlBaseParser.PredicateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueExpressionDefault}
	 * labeled alternative in {@link SparkSqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueExpressionDefault(SparkSqlBaseParser.ValueExpressionDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link SparkSqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(SparkSqlBaseParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmeticBinary}
	 * labeled alternative in {@link SparkSqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticBinary(SparkSqlBaseParser.ArithmeticBinaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code arithmeticUnary}
	 * labeled alternative in {@link SparkSqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticUnary(SparkSqlBaseParser.ArithmeticUnaryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code struct}
	 * labeled alternative in {@link SparkSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStruct(SparkSqlBaseParser.StructContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dereference}
	 * labeled alternative in {@link SparkSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDereference(SparkSqlBaseParser.DereferenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code simpleCase}
	 * labeled alternative in {@link SparkSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleCase(SparkSqlBaseParser.SimpleCaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code columnReference}
	 * labeled alternative in {@link SparkSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnReference(SparkSqlBaseParser.ColumnReferenceContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rowConstructor}
	 * labeled alternative in {@link SparkSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowConstructor(SparkSqlBaseParser.RowConstructorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code last}
	 * labeled alternative in {@link SparkSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLast(SparkSqlBaseParser.LastContext ctx);
	/**
	 * Visit a parse tree produced by the {@code star}
	 * labeled alternative in {@link SparkSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStar(SparkSqlBaseParser.StarContext ctx);
	/**
	 * Visit a parse tree produced by the {@code overlay}
	 * labeled alternative in {@link SparkSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOverlay(SparkSqlBaseParser.OverlayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subscript}
	 * labeled alternative in {@link SparkSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubscript(SparkSqlBaseParser.SubscriptContext ctx);
	/**
	 * Visit a parse tree produced by the {@code subqueryExpression}
	 * labeled alternative in {@link SparkSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubqueryExpression(SparkSqlBaseParser.SubqueryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code substring}
	 * labeled alternative in {@link SparkSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstring(SparkSqlBaseParser.SubstringContext ctx);
	/**
	 * Visit a parse tree produced by the {@code currentDatetime}
	 * labeled alternative in {@link SparkSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrentDatetime(SparkSqlBaseParser.CurrentDatetimeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code cast}
	 * labeled alternative in {@link SparkSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCast(SparkSqlBaseParser.CastContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constantDefault}
	 * labeled alternative in {@link SparkSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstantDefault(SparkSqlBaseParser.ConstantDefaultContext ctx);
	/**
	 * Visit a parse tree produced by the {@code lambda}
	 * labeled alternative in {@link SparkSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLambda(SparkSqlBaseParser.LambdaContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link SparkSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesizedExpression(SparkSqlBaseParser.ParenthesizedExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code extract}
	 * labeled alternative in {@link SparkSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtract(SparkSqlBaseParser.ExtractContext ctx);
	/**
	 * Visit a parse tree produced by the {@code trim}
	 * labeled alternative in {@link SparkSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrim(SparkSqlBaseParser.TrimContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link SparkSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(SparkSqlBaseParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code searchedCase}
	 * labeled alternative in {@link SparkSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSearchedCase(SparkSqlBaseParser.SearchedCaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code position}
	 * labeled alternative in {@link SparkSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPosition(SparkSqlBaseParser.PositionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code first}
	 * labeled alternative in {@link SparkSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFirst(SparkSqlBaseParser.FirstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link SparkSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullLiteral(SparkSqlBaseParser.NullLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intervalLiteral}
	 * labeled alternative in {@link SparkSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalLiteral(SparkSqlBaseParser.IntervalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeConstructor}
	 * labeled alternative in {@link SparkSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeConstructor(SparkSqlBaseParser.TypeConstructorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link SparkSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumericLiteral(SparkSqlBaseParser.NumericLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link SparkSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiteral(SparkSqlBaseParser.BooleanLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link SparkSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiteral(SparkSqlBaseParser.StringLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(SparkSqlBaseParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#arithmeticOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArithmeticOperator(SparkSqlBaseParser.ArithmeticOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#predicateOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicateOperator(SparkSqlBaseParser.PredicateOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#booleanValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanValue(SparkSqlBaseParser.BooleanValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#interval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInterval(SparkSqlBaseParser.IntervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#errorCapturingMultiUnitsInterval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErrorCapturingMultiUnitsInterval(SparkSqlBaseParser.ErrorCapturingMultiUnitsIntervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#multiUnitsInterval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiUnitsInterval(SparkSqlBaseParser.MultiUnitsIntervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#errorCapturingUnitToUnitInterval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErrorCapturingUnitToUnitInterval(SparkSqlBaseParser.ErrorCapturingUnitToUnitIntervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#unitToUnitInterval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnitToUnitInterval(SparkSqlBaseParser.UnitToUnitIntervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#intervalValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalValue(SparkSqlBaseParser.IntervalValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#intervalUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalUnit(SparkSqlBaseParser.IntervalUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#colPosition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColPosition(SparkSqlBaseParser.ColPositionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code complexDataType}
	 * labeled alternative in {@link SparkSqlBaseParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexDataType(SparkSqlBaseParser.ComplexDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code primitiveDataType}
	 * labeled alternative in {@link SparkSqlBaseParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimitiveDataType(SparkSqlBaseParser.PrimitiveDataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#qualifiedColTypeWithPositionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedColTypeWithPositionList(SparkSqlBaseParser.QualifiedColTypeWithPositionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#qualifiedColTypeWithPosition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedColTypeWithPosition(SparkSqlBaseParser.QualifiedColTypeWithPositionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#colTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColTypeList(SparkSqlBaseParser.ColTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#colType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColType(SparkSqlBaseParser.ColTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#complexColTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexColTypeList(SparkSqlBaseParser.ComplexColTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#complexColType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComplexColType(SparkSqlBaseParser.ComplexColTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#whenClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhenClause(SparkSqlBaseParser.WhenClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#windowClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowClause(SparkSqlBaseParser.WindowClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#namedWindow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNamedWindow(SparkSqlBaseParser.NamedWindowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code windowRef}
	 * labeled alternative in {@link SparkSqlBaseParser#windowSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowRef(SparkSqlBaseParser.WindowRefContext ctx);
	/**
	 * Visit a parse tree produced by the {@code windowDef}
	 * labeled alternative in {@link SparkSqlBaseParser#windowSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowDef(SparkSqlBaseParser.WindowDefContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#windowFrame}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowFrame(SparkSqlBaseParser.WindowFrameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#frameBound}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrameBound(SparkSqlBaseParser.FrameBoundContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedNameList(SparkSqlBaseParser.QualifiedNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#functionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionName(SparkSqlBaseParser.FunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#qualifiedName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedName(SparkSqlBaseParser.QualifiedNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#errorCapturingIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErrorCapturingIdentifier(SparkSqlBaseParser.ErrorCapturingIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code errorIdent}
	 * labeled alternative in {@link SparkSqlBaseParser#errorCapturingIdentifierExtra}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitErrorIdent(SparkSqlBaseParser.ErrorIdentContext ctx);
	/**
	 * Visit a parse tree produced by the {@code realIdent}
	 * labeled alternative in {@link SparkSqlBaseParser#errorCapturingIdentifierExtra}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRealIdent(SparkSqlBaseParser.RealIdentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(SparkSqlBaseParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link SparkSqlBaseParser#strictIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnquotedIdentifier(SparkSqlBaseParser.UnquotedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code quotedIdentifierAlternative}
	 * labeled alternative in {@link SparkSqlBaseParser#strictIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuotedIdentifierAlternative(SparkSqlBaseParser.QuotedIdentifierAlternativeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#quotedIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuotedIdentifier(SparkSqlBaseParser.QuotedIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exponentLiteral}
	 * labeled alternative in {@link SparkSqlBaseParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExponentLiteral(SparkSqlBaseParser.ExponentLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link SparkSqlBaseParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDecimalLiteral(SparkSqlBaseParser.DecimalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code legacyDecimalLiteral}
	 * labeled alternative in {@link SparkSqlBaseParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLegacyDecimalLiteral(SparkSqlBaseParser.LegacyDecimalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link SparkSqlBaseParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntegerLiteral(SparkSqlBaseParser.IntegerLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bigIntLiteral}
	 * labeled alternative in {@link SparkSqlBaseParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBigIntLiteral(SparkSqlBaseParser.BigIntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code smallIntLiteral}
	 * labeled alternative in {@link SparkSqlBaseParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSmallIntLiteral(SparkSqlBaseParser.SmallIntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tinyIntLiteral}
	 * labeled alternative in {@link SparkSqlBaseParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTinyIntLiteral(SparkSqlBaseParser.TinyIntLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code doubleLiteral}
	 * labeled alternative in {@link SparkSqlBaseParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoubleLiteral(SparkSqlBaseParser.DoubleLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code bigDecimalLiteral}
	 * labeled alternative in {@link SparkSqlBaseParser#number}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBigDecimalLiteral(SparkSqlBaseParser.BigDecimalLiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#alterColumnAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterColumnAction(SparkSqlBaseParser.AlterColumnActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#ansiNonReserved}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnsiNonReserved(SparkSqlBaseParser.AnsiNonReservedContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#strictNonReserved}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrictNonReserved(SparkSqlBaseParser.StrictNonReservedContext ctx);
	/**
	 * Visit a parse tree produced by {@link SparkSqlBaseParser#nonReserved}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonReserved(SparkSqlBaseParser.NonReservedContext ctx);
}