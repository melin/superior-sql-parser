// Generated from com/dataworker/sql/parser/antlr4/spark/SparkSqlBase.g4 by ANTLR 4.7.2
package com.dataworker.sql.parser.antlr4.spark;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link SparkSqlBaseParser}.
 */
public interface SparkSqlBaseListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#singleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSingleStatement(SparkSqlBaseParser.SingleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#singleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSingleStatement(SparkSqlBaseParser.SingleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSingleExpression(SparkSqlBaseParser.SingleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#singleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSingleExpression(SparkSqlBaseParser.SingleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#singleTableIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterSingleTableIdentifier(SparkSqlBaseParser.SingleTableIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#singleTableIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitSingleTableIdentifier(SparkSqlBaseParser.SingleTableIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#singleMultipartIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterSingleMultipartIdentifier(SparkSqlBaseParser.SingleMultipartIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#singleMultipartIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitSingleMultipartIdentifier(SparkSqlBaseParser.SingleMultipartIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#singleFunctionIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterSingleFunctionIdentifier(SparkSqlBaseParser.SingleFunctionIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#singleFunctionIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitSingleFunctionIdentifier(SparkSqlBaseParser.SingleFunctionIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#singleDataType}.
	 * @param ctx the parse tree
	 */
	void enterSingleDataType(SparkSqlBaseParser.SingleDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#singleDataType}.
	 * @param ctx the parse tree
	 */
	void exitSingleDataType(SparkSqlBaseParser.SingleDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#singleTableSchema}.
	 * @param ctx the parse tree
	 */
	void enterSingleTableSchema(SparkSqlBaseParser.SingleTableSchemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#singleTableSchema}.
	 * @param ctx the parse tree
	 */
	void exitSingleTableSchema(SparkSqlBaseParser.SingleTableSchemaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code statementDefault}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatementDefault(SparkSqlBaseParser.StatementDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code statementDefault}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatementDefault(SparkSqlBaseParser.StatementDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dmlStatement}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDmlStatement(SparkSqlBaseParser.DmlStatementContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dmlStatement}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDmlStatement(SparkSqlBaseParser.DmlStatementContext ctx);
	/**
	 * Enter a parse tree produced by the {@code use}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterUse(SparkSqlBaseParser.UseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code use}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitUse(SparkSqlBaseParser.UseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createNamespace}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateNamespace(SparkSqlBaseParser.CreateNamespaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createNamespace}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateNamespace(SparkSqlBaseParser.CreateNamespaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setNamespaceProperties}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetNamespaceProperties(SparkSqlBaseParser.SetNamespacePropertiesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setNamespaceProperties}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetNamespaceProperties(SparkSqlBaseParser.SetNamespacePropertiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setNamespaceLocation}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetNamespaceLocation(SparkSqlBaseParser.SetNamespaceLocationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setNamespaceLocation}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetNamespaceLocation(SparkSqlBaseParser.SetNamespaceLocationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropNamespace}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropNamespace(SparkSqlBaseParser.DropNamespaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropNamespace}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropNamespace(SparkSqlBaseParser.DropNamespaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showNamespaces}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowNamespaces(SparkSqlBaseParser.ShowNamespacesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showNamespaces}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowNamespaces(SparkSqlBaseParser.ShowNamespacesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createTable}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTable(SparkSqlBaseParser.CreateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createTable}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTable(SparkSqlBaseParser.CreateTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createHiveTable}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateHiveTable(SparkSqlBaseParser.CreateHiveTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createHiveTable}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateHiveTable(SparkSqlBaseParser.CreateHiveTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createTableLike}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableLike(SparkSqlBaseParser.CreateTableLikeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createTableLike}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableLike(SparkSqlBaseParser.CreateTableLikeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code replaceTable}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReplaceTable(SparkSqlBaseParser.ReplaceTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code replaceTable}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReplaceTable(SparkSqlBaseParser.ReplaceTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code analyze}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAnalyze(SparkSqlBaseParser.AnalyzeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code analyze}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAnalyze(SparkSqlBaseParser.AnalyzeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addTableColumns}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAddTableColumns(SparkSqlBaseParser.AddTableColumnsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addTableColumns}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAddTableColumns(SparkSqlBaseParser.AddTableColumnsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code renameTableColumn}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRenameTableColumn(SparkSqlBaseParser.RenameTableColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code renameTableColumn}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRenameTableColumn(SparkSqlBaseParser.RenameTableColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropTableColumns}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropTableColumns(SparkSqlBaseParser.DropTableColumnsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropTableColumns}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropTableColumns(SparkSqlBaseParser.DropTableColumnsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code renameTable}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRenameTable(SparkSqlBaseParser.RenameTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code renameTable}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRenameTable(SparkSqlBaseParser.RenameTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setTableProperties}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetTableProperties(SparkSqlBaseParser.SetTablePropertiesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setTableProperties}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetTableProperties(SparkSqlBaseParser.SetTablePropertiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unsetTableProperties}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterUnsetTableProperties(SparkSqlBaseParser.UnsetTablePropertiesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unsetTableProperties}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitUnsetTableProperties(SparkSqlBaseParser.UnsetTablePropertiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterTableAlterColumn}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableAlterColumn(SparkSqlBaseParser.AlterTableAlterColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterTableAlterColumn}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableAlterColumn(SparkSqlBaseParser.AlterTableAlterColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code hiveChangeColumn}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterHiveChangeColumn(SparkSqlBaseParser.HiveChangeColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code hiveChangeColumn}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitHiveChangeColumn(SparkSqlBaseParser.HiveChangeColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setTableSerDe}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetTableSerDe(SparkSqlBaseParser.SetTableSerDeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setTableSerDe}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetTableSerDe(SparkSqlBaseParser.SetTableSerDeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addTablePartition}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAddTablePartition(SparkSqlBaseParser.AddTablePartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addTablePartition}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAddTablePartition(SparkSqlBaseParser.AddTablePartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code renameTablePartition}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRenameTablePartition(SparkSqlBaseParser.RenameTablePartitionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code renameTablePartition}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRenameTablePartition(SparkSqlBaseParser.RenameTablePartitionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropTablePartitions}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropTablePartitions(SparkSqlBaseParser.DropTablePartitionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropTablePartitions}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropTablePartitions(SparkSqlBaseParser.DropTablePartitionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setTableLocation}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetTableLocation(SparkSqlBaseParser.SetTableLocationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setTableLocation}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetTableLocation(SparkSqlBaseParser.SetTableLocationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code recoverPartitions}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRecoverPartitions(SparkSqlBaseParser.RecoverPartitionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code recoverPartitions}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRecoverPartitions(SparkSqlBaseParser.RecoverPartitionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropTable}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropTable(SparkSqlBaseParser.DropTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropTable}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropTable(SparkSqlBaseParser.DropTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropView}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropView(SparkSqlBaseParser.DropViewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropView}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropView(SparkSqlBaseParser.DropViewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createView}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateView(SparkSqlBaseParser.CreateViewContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createView}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateView(SparkSqlBaseParser.CreateViewContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createTempViewUsing}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateTempViewUsing(SparkSqlBaseParser.CreateTempViewUsingContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createTempViewUsing}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateTempViewUsing(SparkSqlBaseParser.CreateTempViewUsingContext ctx);
	/**
	 * Enter a parse tree produced by the {@code alterViewQuery}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAlterViewQuery(SparkSqlBaseParser.AlterViewQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code alterViewQuery}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAlterViewQuery(SparkSqlBaseParser.AlterViewQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createFunction}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCreateFunction(SparkSqlBaseParser.CreateFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createFunction}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCreateFunction(SparkSqlBaseParser.CreateFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dropFunction}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDropFunction(SparkSqlBaseParser.DropFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dropFunction}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDropFunction(SparkSqlBaseParser.DropFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code explain}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExplain(SparkSqlBaseParser.ExplainContext ctx);
	/**
	 * Exit a parse tree produced by the {@code explain}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExplain(SparkSqlBaseParser.ExplainContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showTables}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowTables(SparkSqlBaseParser.ShowTablesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showTables}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowTables(SparkSqlBaseParser.ShowTablesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showTable}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowTable(SparkSqlBaseParser.ShowTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showTable}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowTable(SparkSqlBaseParser.ShowTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showTblProperties}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowTblProperties(SparkSqlBaseParser.ShowTblPropertiesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showTblProperties}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowTblProperties(SparkSqlBaseParser.ShowTblPropertiesContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showColumns}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowColumns(SparkSqlBaseParser.ShowColumnsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showColumns}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowColumns(SparkSqlBaseParser.ShowColumnsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showViews}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowViews(SparkSqlBaseParser.ShowViewsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showViews}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowViews(SparkSqlBaseParser.ShowViewsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showPartitions}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowPartitions(SparkSqlBaseParser.ShowPartitionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showPartitions}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowPartitions(SparkSqlBaseParser.ShowPartitionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showFunctions}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowFunctions(SparkSqlBaseParser.ShowFunctionsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showFunctions}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowFunctions(SparkSqlBaseParser.ShowFunctionsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showCreateTable}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowCreateTable(SparkSqlBaseParser.ShowCreateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showCreateTable}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowCreateTable(SparkSqlBaseParser.ShowCreateTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showCurrentNamespace}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterShowCurrentNamespace(SparkSqlBaseParser.ShowCurrentNamespaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showCurrentNamespace}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitShowCurrentNamespace(SparkSqlBaseParser.ShowCurrentNamespaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code describeFunction}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDescribeFunction(SparkSqlBaseParser.DescribeFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code describeFunction}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDescribeFunction(SparkSqlBaseParser.DescribeFunctionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code describeNamespace}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDescribeNamespace(SparkSqlBaseParser.DescribeNamespaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code describeNamespace}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDescribeNamespace(SparkSqlBaseParser.DescribeNamespaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code describeDeltaDetail}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDescribeDeltaDetail(SparkSqlBaseParser.DescribeDeltaDetailContext ctx);
	/**
	 * Exit a parse tree produced by the {@code describeDeltaDetail}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDescribeDeltaDetail(SparkSqlBaseParser.DescribeDeltaDetailContext ctx);
	/**
	 * Enter a parse tree produced by the {@code describeDeltaHistory}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDescribeDeltaHistory(SparkSqlBaseParser.DescribeDeltaHistoryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code describeDeltaHistory}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDescribeDeltaHistory(SparkSqlBaseParser.DescribeDeltaHistoryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code describeRelation}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDescribeRelation(SparkSqlBaseParser.DescribeRelationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code describeRelation}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDescribeRelation(SparkSqlBaseParser.DescribeRelationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code describeQuery}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDescribeQuery(SparkSqlBaseParser.DescribeQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code describeQuery}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDescribeQuery(SparkSqlBaseParser.DescribeQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code commentNamespace}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCommentNamespace(SparkSqlBaseParser.CommentNamespaceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code commentNamespace}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCommentNamespace(SparkSqlBaseParser.CommentNamespaceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code commentTable}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCommentTable(SparkSqlBaseParser.CommentTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code commentTable}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCommentTable(SparkSqlBaseParser.CommentTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code refreshTable}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRefreshTable(SparkSqlBaseParser.RefreshTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code refreshTable}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRefreshTable(SparkSqlBaseParser.RefreshTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code refreshResource}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRefreshResource(SparkSqlBaseParser.RefreshResourceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code refreshResource}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRefreshResource(SparkSqlBaseParser.RefreshResourceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cacheTable}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCacheTable(SparkSqlBaseParser.CacheTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cacheTable}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCacheTable(SparkSqlBaseParser.CacheTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code uncacheTable}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterUncacheTable(SparkSqlBaseParser.UncacheTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code uncacheTable}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitUncacheTable(SparkSqlBaseParser.UncacheTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code clearCache}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterClearCache(SparkSqlBaseParser.ClearCacheContext ctx);
	/**
	 * Exit a parse tree produced by the {@code clearCache}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitClearCache(SparkSqlBaseParser.ClearCacheContext ctx);
	/**
	 * Enter a parse tree produced by the {@code loadData}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterLoadData(SparkSqlBaseParser.LoadDataContext ctx);
	/**
	 * Exit a parse tree produced by the {@code loadData}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitLoadData(SparkSqlBaseParser.LoadDataContext ctx);
	/**
	 * Enter a parse tree produced by the {@code truncateTable}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterTruncateTable(SparkSqlBaseParser.TruncateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code truncateTable}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitTruncateTable(SparkSqlBaseParser.TruncateTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code repairTable}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterRepairTable(SparkSqlBaseParser.RepairTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code repairTable}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitRepairTable(SparkSqlBaseParser.RepairTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code manageResource}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterManageResource(SparkSqlBaseParser.ManageResourceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code manageResource}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitManageResource(SparkSqlBaseParser.ManageResourceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code failNativeCommand}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterFailNativeCommand(SparkSqlBaseParser.FailNativeCommandContext ctx);
	/**
	 * Exit a parse tree produced by the {@code failNativeCommand}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitFailNativeCommand(SparkSqlBaseParser.FailNativeCommandContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setConfiguration}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterSetConfiguration(SparkSqlBaseParser.SetConfigurationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setConfiguration}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitSetConfiguration(SparkSqlBaseParser.SetConfigurationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code resetConfiguration}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterResetConfiguration(SparkSqlBaseParser.ResetConfigurationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code resetConfiguration}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitResetConfiguration(SparkSqlBaseParser.ResetConfigurationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mergeTable}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterMergeTable(SparkSqlBaseParser.MergeTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mergeTable}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitMergeTable(SparkSqlBaseParser.MergeTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code killJob}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterKillJob(SparkSqlBaseParser.KillJobContext ctx);
	/**
	 * Exit a parse tree produced by the {@code killJob}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitKillJob(SparkSqlBaseParser.KillJobContext ctx);
	/**
	 * Enter a parse tree produced by the {@code addJar}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterAddJar(SparkSqlBaseParser.AddJarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code addJar}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitAddJar(SparkSqlBaseParser.AddJarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code readTable}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterReadTable(SparkSqlBaseParser.ReadTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code readTable}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitReadTable(SparkSqlBaseParser.ReadTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code loadTempTable}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterLoadTempTable(SparkSqlBaseParser.LoadTempTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code loadTempTable}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitLoadTempTable(SparkSqlBaseParser.LoadTempTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exportTable}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterExportTable(SparkSqlBaseParser.ExportTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exportTable}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitExportTable(SparkSqlBaseParser.ExportTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compressTable}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCompressTable(SparkSqlBaseParser.CompressTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compressTable}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCompressTable(SparkSqlBaseParser.CompressTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code compressFile}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterCompressFile(SparkSqlBaseParser.CompressFileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code compressFile}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitCompressFile(SparkSqlBaseParser.CompressFileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code distcpDatasource}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDistcpDatasource(SparkSqlBaseParser.DistcpDatasourceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code distcpDatasource}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDistcpDatasource(SparkSqlBaseParser.DistcpDatasourceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code vacuumTable}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterVacuumTable(SparkSqlBaseParser.VacuumTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code vacuumTable}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitVacuumTable(SparkSqlBaseParser.VacuumTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code deltaConvert}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterDeltaConvert(SparkSqlBaseParser.DeltaConvertContext ctx);
	/**
	 * Exit a parse tree produced by the {@code deltaConvert}
	 * labeled alternative in {@link SparkSqlBaseParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitDeltaConvert(SparkSqlBaseParser.DeltaConvertContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#dataSource}.
	 * @param ctx the parse tree
	 */
	void enterDataSource(SparkSqlBaseParser.DataSourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#dataSource}.
	 * @param ctx the parse tree
	 */
	void exitDataSource(SparkSqlBaseParser.DataSourceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#unsupportedHiveNativeCommands}.
	 * @param ctx the parse tree
	 */
	void enterUnsupportedHiveNativeCommands(SparkSqlBaseParser.UnsupportedHiveNativeCommandsContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#unsupportedHiveNativeCommands}.
	 * @param ctx the parse tree
	 */
	void exitUnsupportedHiveNativeCommands(SparkSqlBaseParser.UnsupportedHiveNativeCommandsContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#createTableHeader}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableHeader(SparkSqlBaseParser.CreateTableHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#createTableHeader}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableHeader(SparkSqlBaseParser.CreateTableHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#replaceTableHeader}.
	 * @param ctx the parse tree
	 */
	void enterReplaceTableHeader(SparkSqlBaseParser.ReplaceTableHeaderContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#replaceTableHeader}.
	 * @param ctx the parse tree
	 */
	void exitReplaceTableHeader(SparkSqlBaseParser.ReplaceTableHeaderContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#bucketSpec}.
	 * @param ctx the parse tree
	 */
	void enterBucketSpec(SparkSqlBaseParser.BucketSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#bucketSpec}.
	 * @param ctx the parse tree
	 */
	void exitBucketSpec(SparkSqlBaseParser.BucketSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#skewSpec}.
	 * @param ctx the parse tree
	 */
	void enterSkewSpec(SparkSqlBaseParser.SkewSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#skewSpec}.
	 * @param ctx the parse tree
	 */
	void exitSkewSpec(SparkSqlBaseParser.SkewSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#locationSpec}.
	 * @param ctx the parse tree
	 */
	void enterLocationSpec(SparkSqlBaseParser.LocationSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#locationSpec}.
	 * @param ctx the parse tree
	 */
	void exitLocationSpec(SparkSqlBaseParser.LocationSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#commentSpec}.
	 * @param ctx the parse tree
	 */
	void enterCommentSpec(SparkSqlBaseParser.CommentSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#commentSpec}.
	 * @param ctx the parse tree
	 */
	void exitCommentSpec(SparkSqlBaseParser.CommentSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#query}.
	 * @param ctx the parse tree
	 */
	void enterQuery(SparkSqlBaseParser.QueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#query}.
	 * @param ctx the parse tree
	 */
	void exitQuery(SparkSqlBaseParser.QueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code insertOverwriteTable}
	 * labeled alternative in {@link SparkSqlBaseParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void enterInsertOverwriteTable(SparkSqlBaseParser.InsertOverwriteTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code insertOverwriteTable}
	 * labeled alternative in {@link SparkSqlBaseParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void exitInsertOverwriteTable(SparkSqlBaseParser.InsertOverwriteTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code insertIntoTable}
	 * labeled alternative in {@link SparkSqlBaseParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void enterInsertIntoTable(SparkSqlBaseParser.InsertIntoTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code insertIntoTable}
	 * labeled alternative in {@link SparkSqlBaseParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void exitInsertIntoTable(SparkSqlBaseParser.InsertIntoTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code insertOverwriteHiveDir}
	 * labeled alternative in {@link SparkSqlBaseParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void enterInsertOverwriteHiveDir(SparkSqlBaseParser.InsertOverwriteHiveDirContext ctx);
	/**
	 * Exit a parse tree produced by the {@code insertOverwriteHiveDir}
	 * labeled alternative in {@link SparkSqlBaseParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void exitInsertOverwriteHiveDir(SparkSqlBaseParser.InsertOverwriteHiveDirContext ctx);
	/**
	 * Enter a parse tree produced by the {@code insertOverwriteDir}
	 * labeled alternative in {@link SparkSqlBaseParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void enterInsertOverwriteDir(SparkSqlBaseParser.InsertOverwriteDirContext ctx);
	/**
	 * Exit a parse tree produced by the {@code insertOverwriteDir}
	 * labeled alternative in {@link SparkSqlBaseParser#insertInto}.
	 * @param ctx the parse tree
	 */
	void exitInsertOverwriteDir(SparkSqlBaseParser.InsertOverwriteDirContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#partitionSpecLocation}.
	 * @param ctx the parse tree
	 */
	void enterPartitionSpecLocation(SparkSqlBaseParser.PartitionSpecLocationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#partitionSpecLocation}.
	 * @param ctx the parse tree
	 */
	void exitPartitionSpecLocation(SparkSqlBaseParser.PartitionSpecLocationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#partitionSpec}.
	 * @param ctx the parse tree
	 */
	void enterPartitionSpec(SparkSqlBaseParser.PartitionSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#partitionSpec}.
	 * @param ctx the parse tree
	 */
	void exitPartitionSpec(SparkSqlBaseParser.PartitionSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#partitionVal}.
	 * @param ctx the parse tree
	 */
	void enterPartitionVal(SparkSqlBaseParser.PartitionValContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#partitionVal}.
	 * @param ctx the parse tree
	 */
	void exitPartitionVal(SparkSqlBaseParser.PartitionValContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#namespace}.
	 * @param ctx the parse tree
	 */
	void enterNamespace(SparkSqlBaseParser.NamespaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#namespace}.
	 * @param ctx the parse tree
	 */
	void exitNamespace(SparkSqlBaseParser.NamespaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#describeFuncName}.
	 * @param ctx the parse tree
	 */
	void enterDescribeFuncName(SparkSqlBaseParser.DescribeFuncNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#describeFuncName}.
	 * @param ctx the parse tree
	 */
	void exitDescribeFuncName(SparkSqlBaseParser.DescribeFuncNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#describeColName}.
	 * @param ctx the parse tree
	 */
	void enterDescribeColName(SparkSqlBaseParser.DescribeColNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#describeColName}.
	 * @param ctx the parse tree
	 */
	void exitDescribeColName(SparkSqlBaseParser.DescribeColNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#ctes}.
	 * @param ctx the parse tree
	 */
	void enterCtes(SparkSqlBaseParser.CtesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#ctes}.
	 * @param ctx the parse tree
	 */
	void exitCtes(SparkSqlBaseParser.CtesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#namedQuery}.
	 * @param ctx the parse tree
	 */
	void enterNamedQuery(SparkSqlBaseParser.NamedQueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#namedQuery}.
	 * @param ctx the parse tree
	 */
	void exitNamedQuery(SparkSqlBaseParser.NamedQueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#tableProvider}.
	 * @param ctx the parse tree
	 */
	void enterTableProvider(SparkSqlBaseParser.TableProviderContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#tableProvider}.
	 * @param ctx the parse tree
	 */
	void exitTableProvider(SparkSqlBaseParser.TableProviderContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#createTableClauses}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableClauses(SparkSqlBaseParser.CreateTableClausesContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#createTableClauses}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableClauses(SparkSqlBaseParser.CreateTableClausesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#tablePropertyList}.
	 * @param ctx the parse tree
	 */
	void enterTablePropertyList(SparkSqlBaseParser.TablePropertyListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#tablePropertyList}.
	 * @param ctx the parse tree
	 */
	void exitTablePropertyList(SparkSqlBaseParser.TablePropertyListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#tableProperty}.
	 * @param ctx the parse tree
	 */
	void enterTableProperty(SparkSqlBaseParser.TablePropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#tableProperty}.
	 * @param ctx the parse tree
	 */
	void exitTableProperty(SparkSqlBaseParser.TablePropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#tablePropertyKey}.
	 * @param ctx the parse tree
	 */
	void enterTablePropertyKey(SparkSqlBaseParser.TablePropertyKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#tablePropertyKey}.
	 * @param ctx the parse tree
	 */
	void exitTablePropertyKey(SparkSqlBaseParser.TablePropertyKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#tablePropertyValue}.
	 * @param ctx the parse tree
	 */
	void enterTablePropertyValue(SparkSqlBaseParser.TablePropertyValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#tablePropertyValue}.
	 * @param ctx the parse tree
	 */
	void exitTablePropertyValue(SparkSqlBaseParser.TablePropertyValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#constantList}.
	 * @param ctx the parse tree
	 */
	void enterConstantList(SparkSqlBaseParser.ConstantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#constantList}.
	 * @param ctx the parse tree
	 */
	void exitConstantList(SparkSqlBaseParser.ConstantListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#nestedConstantList}.
	 * @param ctx the parse tree
	 */
	void enterNestedConstantList(SparkSqlBaseParser.NestedConstantListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#nestedConstantList}.
	 * @param ctx the parse tree
	 */
	void exitNestedConstantList(SparkSqlBaseParser.NestedConstantListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#createFileFormat}.
	 * @param ctx the parse tree
	 */
	void enterCreateFileFormat(SparkSqlBaseParser.CreateFileFormatContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#createFileFormat}.
	 * @param ctx the parse tree
	 */
	void exitCreateFileFormat(SparkSqlBaseParser.CreateFileFormatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableFileFormat}
	 * labeled alternative in {@link SparkSqlBaseParser#fileFormat}.
	 * @param ctx the parse tree
	 */
	void enterTableFileFormat(SparkSqlBaseParser.TableFileFormatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableFileFormat}
	 * labeled alternative in {@link SparkSqlBaseParser#fileFormat}.
	 * @param ctx the parse tree
	 */
	void exitTableFileFormat(SparkSqlBaseParser.TableFileFormatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code genericFileFormat}
	 * labeled alternative in {@link SparkSqlBaseParser#fileFormat}.
	 * @param ctx the parse tree
	 */
	void enterGenericFileFormat(SparkSqlBaseParser.GenericFileFormatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code genericFileFormat}
	 * labeled alternative in {@link SparkSqlBaseParser#fileFormat}.
	 * @param ctx the parse tree
	 */
	void exitGenericFileFormat(SparkSqlBaseParser.GenericFileFormatContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#storageHandler}.
	 * @param ctx the parse tree
	 */
	void enterStorageHandler(SparkSqlBaseParser.StorageHandlerContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#storageHandler}.
	 * @param ctx the parse tree
	 */
	void exitStorageHandler(SparkSqlBaseParser.StorageHandlerContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#resource}.
	 * @param ctx the parse tree
	 */
	void enterResource(SparkSqlBaseParser.ResourceContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#resource}.
	 * @param ctx the parse tree
	 */
	void exitResource(SparkSqlBaseParser.ResourceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code singleInsertQuery}
	 * labeled alternative in {@link SparkSqlBaseParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 */
	void enterSingleInsertQuery(SparkSqlBaseParser.SingleInsertQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code singleInsertQuery}
	 * labeled alternative in {@link SparkSqlBaseParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 */
	void exitSingleInsertQuery(SparkSqlBaseParser.SingleInsertQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code multiInsertQuery}
	 * labeled alternative in {@link SparkSqlBaseParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 */
	void enterMultiInsertQuery(SparkSqlBaseParser.MultiInsertQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code multiInsertQuery}
	 * labeled alternative in {@link SparkSqlBaseParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 */
	void exitMultiInsertQuery(SparkSqlBaseParser.MultiInsertQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code deleteFromTable}
	 * labeled alternative in {@link SparkSqlBaseParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 */
	void enterDeleteFromTable(SparkSqlBaseParser.DeleteFromTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code deleteFromTable}
	 * labeled alternative in {@link SparkSqlBaseParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 */
	void exitDeleteFromTable(SparkSqlBaseParser.DeleteFromTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code updateTable}
	 * labeled alternative in {@link SparkSqlBaseParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 */
	void enterUpdateTable(SparkSqlBaseParser.UpdateTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code updateTable}
	 * labeled alternative in {@link SparkSqlBaseParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 */
	void exitUpdateTable(SparkSqlBaseParser.UpdateTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code mergeIntoTable}
	 * labeled alternative in {@link SparkSqlBaseParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 */
	void enterMergeIntoTable(SparkSqlBaseParser.MergeIntoTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code mergeIntoTable}
	 * labeled alternative in {@link SparkSqlBaseParser#dmlStatementNoWith}.
	 * @param ctx the parse tree
	 */
	void exitMergeIntoTable(SparkSqlBaseParser.MergeIntoTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#queryOrganization}.
	 * @param ctx the parse tree
	 */
	void enterQueryOrganization(SparkSqlBaseParser.QueryOrganizationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#queryOrganization}.
	 * @param ctx the parse tree
	 */
	void exitQueryOrganization(SparkSqlBaseParser.QueryOrganizationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#multiInsertQueryBody}.
	 * @param ctx the parse tree
	 */
	void enterMultiInsertQueryBody(SparkSqlBaseParser.MultiInsertQueryBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#multiInsertQueryBody}.
	 * @param ctx the parse tree
	 */
	void exitMultiInsertQueryBody(SparkSqlBaseParser.MultiInsertQueryBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code queryTermDefault}
	 * labeled alternative in {@link SparkSqlBaseParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void enterQueryTermDefault(SparkSqlBaseParser.QueryTermDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code queryTermDefault}
	 * labeled alternative in {@link SparkSqlBaseParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void exitQueryTermDefault(SparkSqlBaseParser.QueryTermDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code setOperation}
	 * labeled alternative in {@link SparkSqlBaseParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void enterSetOperation(SparkSqlBaseParser.SetOperationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code setOperation}
	 * labeled alternative in {@link SparkSqlBaseParser#queryTerm}.
	 * @param ctx the parse tree
	 */
	void exitSetOperation(SparkSqlBaseParser.SetOperationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code queryPrimaryDefault}
	 * labeled alternative in {@link SparkSqlBaseParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterQueryPrimaryDefault(SparkSqlBaseParser.QueryPrimaryDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code queryPrimaryDefault}
	 * labeled alternative in {@link SparkSqlBaseParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitQueryPrimaryDefault(SparkSqlBaseParser.QueryPrimaryDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code fromStmt}
	 * labeled alternative in {@link SparkSqlBaseParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterFromStmt(SparkSqlBaseParser.FromStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code fromStmt}
	 * labeled alternative in {@link SparkSqlBaseParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitFromStmt(SparkSqlBaseParser.FromStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code table}
	 * labeled alternative in {@link SparkSqlBaseParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterTable(SparkSqlBaseParser.TableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code table}
	 * labeled alternative in {@link SparkSqlBaseParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitTable(SparkSqlBaseParser.TableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inlineTableDefault1}
	 * labeled alternative in {@link SparkSqlBaseParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterInlineTableDefault1(SparkSqlBaseParser.InlineTableDefault1Context ctx);
	/**
	 * Exit a parse tree produced by the {@code inlineTableDefault1}
	 * labeled alternative in {@link SparkSqlBaseParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitInlineTableDefault1(SparkSqlBaseParser.InlineTableDefault1Context ctx);
	/**
	 * Enter a parse tree produced by the {@code subquery}
	 * labeled alternative in {@link SparkSqlBaseParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterSubquery(SparkSqlBaseParser.SubqueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subquery}
	 * labeled alternative in {@link SparkSqlBaseParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitSubquery(SparkSqlBaseParser.SubqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#sortItem}.
	 * @param ctx the parse tree
	 */
	void enterSortItem(SparkSqlBaseParser.SortItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#sortItem}.
	 * @param ctx the parse tree
	 */
	void exitSortItem(SparkSqlBaseParser.SortItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#fromStatement}.
	 * @param ctx the parse tree
	 */
	void enterFromStatement(SparkSqlBaseParser.FromStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#fromStatement}.
	 * @param ctx the parse tree
	 */
	void exitFromStatement(SparkSqlBaseParser.FromStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#fromStatementBody}.
	 * @param ctx the parse tree
	 */
	void enterFromStatementBody(SparkSqlBaseParser.FromStatementBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#fromStatementBody}.
	 * @param ctx the parse tree
	 */
	void exitFromStatementBody(SparkSqlBaseParser.FromStatementBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code transformQuerySpecification}
	 * labeled alternative in {@link SparkSqlBaseParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void enterTransformQuerySpecification(SparkSqlBaseParser.TransformQuerySpecificationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code transformQuerySpecification}
	 * labeled alternative in {@link SparkSqlBaseParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void exitTransformQuerySpecification(SparkSqlBaseParser.TransformQuerySpecificationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code regularQuerySpecification}
	 * labeled alternative in {@link SparkSqlBaseParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void enterRegularQuerySpecification(SparkSqlBaseParser.RegularQuerySpecificationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code regularQuerySpecification}
	 * labeled alternative in {@link SparkSqlBaseParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void exitRegularQuerySpecification(SparkSqlBaseParser.RegularQuerySpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#transformClause}.
	 * @param ctx the parse tree
	 */
	void enterTransformClause(SparkSqlBaseParser.TransformClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#transformClause}.
	 * @param ctx the parse tree
	 */
	void exitTransformClause(SparkSqlBaseParser.TransformClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#selectClause}.
	 * @param ctx the parse tree
	 */
	void enterSelectClause(SparkSqlBaseParser.SelectClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#selectClause}.
	 * @param ctx the parse tree
	 */
	void exitSelectClause(SparkSqlBaseParser.SelectClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#setClause}.
	 * @param ctx the parse tree
	 */
	void enterSetClause(SparkSqlBaseParser.SetClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#setClause}.
	 * @param ctx the parse tree
	 */
	void exitSetClause(SparkSqlBaseParser.SetClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#matchedClause}.
	 * @param ctx the parse tree
	 */
	void enterMatchedClause(SparkSqlBaseParser.MatchedClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#matchedClause}.
	 * @param ctx the parse tree
	 */
	void exitMatchedClause(SparkSqlBaseParser.MatchedClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#notMatchedClause}.
	 * @param ctx the parse tree
	 */
	void enterNotMatchedClause(SparkSqlBaseParser.NotMatchedClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#notMatchedClause}.
	 * @param ctx the parse tree
	 */
	void exitNotMatchedClause(SparkSqlBaseParser.NotMatchedClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#matchedAction}.
	 * @param ctx the parse tree
	 */
	void enterMatchedAction(SparkSqlBaseParser.MatchedActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#matchedAction}.
	 * @param ctx the parse tree
	 */
	void exitMatchedAction(SparkSqlBaseParser.MatchedActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#notMatchedAction}.
	 * @param ctx the parse tree
	 */
	void enterNotMatchedAction(SparkSqlBaseParser.NotMatchedActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#notMatchedAction}.
	 * @param ctx the parse tree
	 */
	void exitNotMatchedAction(SparkSqlBaseParser.NotMatchedActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#assignmentList}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentList(SparkSqlBaseParser.AssignmentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#assignmentList}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentList(SparkSqlBaseParser.AssignmentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(SparkSqlBaseParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(SparkSqlBaseParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(SparkSqlBaseParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(SparkSqlBaseParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void enterHavingClause(SparkSqlBaseParser.HavingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void exitHavingClause(SparkSqlBaseParser.HavingClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#hint}.
	 * @param ctx the parse tree
	 */
	void enterHint(SparkSqlBaseParser.HintContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#hint}.
	 * @param ctx the parse tree
	 */
	void exitHint(SparkSqlBaseParser.HintContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#hintStatement}.
	 * @param ctx the parse tree
	 */
	void enterHintStatement(SparkSqlBaseParser.HintStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#hintStatement}.
	 * @param ctx the parse tree
	 */
	void exitHintStatement(SparkSqlBaseParser.HintStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void enterFromClause(SparkSqlBaseParser.FromClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void exitFromClause(SparkSqlBaseParser.FromClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#aggregationClause}.
	 * @param ctx the parse tree
	 */
	void enterAggregationClause(SparkSqlBaseParser.AggregationClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#aggregationClause}.
	 * @param ctx the parse tree
	 */
	void exitAggregationClause(SparkSqlBaseParser.AggregationClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#groupingSet}.
	 * @param ctx the parse tree
	 */
	void enterGroupingSet(SparkSqlBaseParser.GroupingSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#groupingSet}.
	 * @param ctx the parse tree
	 */
	void exitGroupingSet(SparkSqlBaseParser.GroupingSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#pivotClause}.
	 * @param ctx the parse tree
	 */
	void enterPivotClause(SparkSqlBaseParser.PivotClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#pivotClause}.
	 * @param ctx the parse tree
	 */
	void exitPivotClause(SparkSqlBaseParser.PivotClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#pivotColumn}.
	 * @param ctx the parse tree
	 */
	void enterPivotColumn(SparkSqlBaseParser.PivotColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#pivotColumn}.
	 * @param ctx the parse tree
	 */
	void exitPivotColumn(SparkSqlBaseParser.PivotColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#pivotValue}.
	 * @param ctx the parse tree
	 */
	void enterPivotValue(SparkSqlBaseParser.PivotValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#pivotValue}.
	 * @param ctx the parse tree
	 */
	void exitPivotValue(SparkSqlBaseParser.PivotValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#lateralView}.
	 * @param ctx the parse tree
	 */
	void enterLateralView(SparkSqlBaseParser.LateralViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#lateralView}.
	 * @param ctx the parse tree
	 */
	void exitLateralView(SparkSqlBaseParser.LateralViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#setQuantifier}.
	 * @param ctx the parse tree
	 */
	void enterSetQuantifier(SparkSqlBaseParser.SetQuantifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#setQuantifier}.
	 * @param ctx the parse tree
	 */
	void exitSetQuantifier(SparkSqlBaseParser.SetQuantifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#relation}.
	 * @param ctx the parse tree
	 */
	void enterRelation(SparkSqlBaseParser.RelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#relation}.
	 * @param ctx the parse tree
	 */
	void exitRelation(SparkSqlBaseParser.RelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#joinRelation}.
	 * @param ctx the parse tree
	 */
	void enterJoinRelation(SparkSqlBaseParser.JoinRelationContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#joinRelation}.
	 * @param ctx the parse tree
	 */
	void exitJoinRelation(SparkSqlBaseParser.JoinRelationContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#joinType}.
	 * @param ctx the parse tree
	 */
	void enterJoinType(SparkSqlBaseParser.JoinTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#joinType}.
	 * @param ctx the parse tree
	 */
	void exitJoinType(SparkSqlBaseParser.JoinTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#joinCriteria}.
	 * @param ctx the parse tree
	 */
	void enterJoinCriteria(SparkSqlBaseParser.JoinCriteriaContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#joinCriteria}.
	 * @param ctx the parse tree
	 */
	void exitJoinCriteria(SparkSqlBaseParser.JoinCriteriaContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#sample}.
	 * @param ctx the parse tree
	 */
	void enterSample(SparkSqlBaseParser.SampleContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#sample}.
	 * @param ctx the parse tree
	 */
	void exitSample(SparkSqlBaseParser.SampleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sampleByPercentile}
	 * labeled alternative in {@link SparkSqlBaseParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void enterSampleByPercentile(SparkSqlBaseParser.SampleByPercentileContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sampleByPercentile}
	 * labeled alternative in {@link SparkSqlBaseParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void exitSampleByPercentile(SparkSqlBaseParser.SampleByPercentileContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sampleByRows}
	 * labeled alternative in {@link SparkSqlBaseParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void enterSampleByRows(SparkSqlBaseParser.SampleByRowsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sampleByRows}
	 * labeled alternative in {@link SparkSqlBaseParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void exitSampleByRows(SparkSqlBaseParser.SampleByRowsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sampleByBucket}
	 * labeled alternative in {@link SparkSqlBaseParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void enterSampleByBucket(SparkSqlBaseParser.SampleByBucketContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sampleByBucket}
	 * labeled alternative in {@link SparkSqlBaseParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void exitSampleByBucket(SparkSqlBaseParser.SampleByBucketContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sampleByBytes}
	 * labeled alternative in {@link SparkSqlBaseParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void enterSampleByBytes(SparkSqlBaseParser.SampleByBytesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sampleByBytes}
	 * labeled alternative in {@link SparkSqlBaseParser#sampleMethod}.
	 * @param ctx the parse tree
	 */
	void exitSampleByBytes(SparkSqlBaseParser.SampleByBytesContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(SparkSqlBaseParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(SparkSqlBaseParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#identifierSeq}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierSeq(SparkSqlBaseParser.IdentifierSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#identifierSeq}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierSeq(SparkSqlBaseParser.IdentifierSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#orderedIdentifierList}.
	 * @param ctx the parse tree
	 */
	void enterOrderedIdentifierList(SparkSqlBaseParser.OrderedIdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#orderedIdentifierList}.
	 * @param ctx the parse tree
	 */
	void exitOrderedIdentifierList(SparkSqlBaseParser.OrderedIdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#orderedIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterOrderedIdentifier(SparkSqlBaseParser.OrderedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#orderedIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitOrderedIdentifier(SparkSqlBaseParser.OrderedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#identifierCommentList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierCommentList(SparkSqlBaseParser.IdentifierCommentListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#identifierCommentList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierCommentList(SparkSqlBaseParser.IdentifierCommentListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#identifierComment}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierComment(SparkSqlBaseParser.IdentifierCommentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#identifierComment}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierComment(SparkSqlBaseParser.IdentifierCommentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tableName}
	 * labeled alternative in {@link SparkSqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterTableName(SparkSqlBaseParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableName}
	 * labeled alternative in {@link SparkSqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitTableName(SparkSqlBaseParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aliasedQuery}
	 * labeled alternative in {@link SparkSqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterAliasedQuery(SparkSqlBaseParser.AliasedQueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aliasedQuery}
	 * labeled alternative in {@link SparkSqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitAliasedQuery(SparkSqlBaseParser.AliasedQueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code aliasedRelation}
	 * labeled alternative in {@link SparkSqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterAliasedRelation(SparkSqlBaseParser.AliasedRelationContext ctx);
	/**
	 * Exit a parse tree produced by the {@code aliasedRelation}
	 * labeled alternative in {@link SparkSqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitAliasedRelation(SparkSqlBaseParser.AliasedRelationContext ctx);
	/**
	 * Enter a parse tree produced by the {@code inlineTableDefault2}
	 * labeled alternative in {@link SparkSqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterInlineTableDefault2(SparkSqlBaseParser.InlineTableDefault2Context ctx);
	/**
	 * Exit a parse tree produced by the {@code inlineTableDefault2}
	 * labeled alternative in {@link SparkSqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitInlineTableDefault2(SparkSqlBaseParser.InlineTableDefault2Context ctx);
	/**
	 * Enter a parse tree produced by the {@code tableValuedFunction}
	 * labeled alternative in {@link SparkSqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void enterTableValuedFunction(SparkSqlBaseParser.TableValuedFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tableValuedFunction}
	 * labeled alternative in {@link SparkSqlBaseParser#relationPrimary}.
	 * @param ctx the parse tree
	 */
	void exitTableValuedFunction(SparkSqlBaseParser.TableValuedFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#inlineTable}.
	 * @param ctx the parse tree
	 */
	void enterInlineTable(SparkSqlBaseParser.InlineTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#inlineTable}.
	 * @param ctx the parse tree
	 */
	void exitInlineTable(SparkSqlBaseParser.InlineTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#functionTable}.
	 * @param ctx the parse tree
	 */
	void enterFunctionTable(SparkSqlBaseParser.FunctionTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#functionTable}.
	 * @param ctx the parse tree
	 */
	void exitFunctionTable(SparkSqlBaseParser.FunctionTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#tableAlias}.
	 * @param ctx the parse tree
	 */
	void enterTableAlias(SparkSqlBaseParser.TableAliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#tableAlias}.
	 * @param ctx the parse tree
	 */
	void exitTableAlias(SparkSqlBaseParser.TableAliasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rowFormatSerde}
	 * labeled alternative in {@link SparkSqlBaseParser#rowFormat}.
	 * @param ctx the parse tree
	 */
	void enterRowFormatSerde(SparkSqlBaseParser.RowFormatSerdeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rowFormatSerde}
	 * labeled alternative in {@link SparkSqlBaseParser#rowFormat}.
	 * @param ctx the parse tree
	 */
	void exitRowFormatSerde(SparkSqlBaseParser.RowFormatSerdeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rowFormatDelimited}
	 * labeled alternative in {@link SparkSqlBaseParser#rowFormat}.
	 * @param ctx the parse tree
	 */
	void enterRowFormatDelimited(SparkSqlBaseParser.RowFormatDelimitedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rowFormatDelimited}
	 * labeled alternative in {@link SparkSqlBaseParser#rowFormat}.
	 * @param ctx the parse tree
	 */
	void exitRowFormatDelimited(SparkSqlBaseParser.RowFormatDelimitedContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#multipartIdentifierList}.
	 * @param ctx the parse tree
	 */
	void enterMultipartIdentifierList(SparkSqlBaseParser.MultipartIdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#multipartIdentifierList}.
	 * @param ctx the parse tree
	 */
	void exitMultipartIdentifierList(SparkSqlBaseParser.MultipartIdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#multipartIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterMultipartIdentifier(SparkSqlBaseParser.MultipartIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#multipartIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitMultipartIdentifier(SparkSqlBaseParser.MultipartIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#tableIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterTableIdentifier(SparkSqlBaseParser.TableIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#tableIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitTableIdentifier(SparkSqlBaseParser.TableIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#functionIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterFunctionIdentifier(SparkSqlBaseParser.FunctionIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#functionIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitFunctionIdentifier(SparkSqlBaseParser.FunctionIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#namedExpression}.
	 * @param ctx the parse tree
	 */
	void enterNamedExpression(SparkSqlBaseParser.NamedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#namedExpression}.
	 * @param ctx the parse tree
	 */
	void exitNamedExpression(SparkSqlBaseParser.NamedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#namedExpressionSeq}.
	 * @param ctx the parse tree
	 */
	void enterNamedExpressionSeq(SparkSqlBaseParser.NamedExpressionSeqContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#namedExpressionSeq}.
	 * @param ctx the parse tree
	 */
	void exitNamedExpressionSeq(SparkSqlBaseParser.NamedExpressionSeqContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#transformList}.
	 * @param ctx the parse tree
	 */
	void enterTransformList(SparkSqlBaseParser.TransformListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#transformList}.
	 * @param ctx the parse tree
	 */
	void exitTransformList(SparkSqlBaseParser.TransformListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identityTransform}
	 * labeled alternative in {@link SparkSqlBaseParser#transform}.
	 * @param ctx the parse tree
	 */
	void enterIdentityTransform(SparkSqlBaseParser.IdentityTransformContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identityTransform}
	 * labeled alternative in {@link SparkSqlBaseParser#transform}.
	 * @param ctx the parse tree
	 */
	void exitIdentityTransform(SparkSqlBaseParser.IdentityTransformContext ctx);
	/**
	 * Enter a parse tree produced by the {@code applyTransform}
	 * labeled alternative in {@link SparkSqlBaseParser#transform}.
	 * @param ctx the parse tree
	 */
	void enterApplyTransform(SparkSqlBaseParser.ApplyTransformContext ctx);
	/**
	 * Exit a parse tree produced by the {@code applyTransform}
	 * labeled alternative in {@link SparkSqlBaseParser#transform}.
	 * @param ctx the parse tree
	 */
	void exitApplyTransform(SparkSqlBaseParser.ApplyTransformContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#transformArgument}.
	 * @param ctx the parse tree
	 */
	void enterTransformArgument(SparkSqlBaseParser.TransformArgumentContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#transformArgument}.
	 * @param ctx the parse tree
	 */
	void exitTransformArgument(SparkSqlBaseParser.TransformArgumentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(SparkSqlBaseParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(SparkSqlBaseParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link SparkSqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalNot(SparkSqlBaseParser.LogicalNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalNot}
	 * labeled alternative in {@link SparkSqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalNot(SparkSqlBaseParser.LogicalNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code predicated}
	 * labeled alternative in {@link SparkSqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterPredicated(SparkSqlBaseParser.PredicatedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code predicated}
	 * labeled alternative in {@link SparkSqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitPredicated(SparkSqlBaseParser.PredicatedContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exists}
	 * labeled alternative in {@link SparkSqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterExists(SparkSqlBaseParser.ExistsContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exists}
	 * labeled alternative in {@link SparkSqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitExists(SparkSqlBaseParser.ExistsContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logicalBinary}
	 * labeled alternative in {@link SparkSqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void enterLogicalBinary(SparkSqlBaseParser.LogicalBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logicalBinary}
	 * labeled alternative in {@link SparkSqlBaseParser#booleanExpression}.
	 * @param ctx the parse tree
	 */
	void exitLogicalBinary(SparkSqlBaseParser.LogicalBinaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(SparkSqlBaseParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(SparkSqlBaseParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueExpressionDefault}
	 * labeled alternative in {@link SparkSqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterValueExpressionDefault(SparkSqlBaseParser.ValueExpressionDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueExpressionDefault}
	 * labeled alternative in {@link SparkSqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitValueExpressionDefault(SparkSqlBaseParser.ValueExpressionDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link SparkSqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterComparison(SparkSqlBaseParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparison}
	 * labeled alternative in {@link SparkSqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitComparison(SparkSqlBaseParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticBinary}
	 * labeled alternative in {@link SparkSqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticBinary(SparkSqlBaseParser.ArithmeticBinaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticBinary}
	 * labeled alternative in {@link SparkSqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticBinary(SparkSqlBaseParser.ArithmeticBinaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code arithmeticUnary}
	 * labeled alternative in {@link SparkSqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticUnary(SparkSqlBaseParser.ArithmeticUnaryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code arithmeticUnary}
	 * labeled alternative in {@link SparkSqlBaseParser#valueExpression}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticUnary(SparkSqlBaseParser.ArithmeticUnaryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code struct}
	 * labeled alternative in {@link SparkSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterStruct(SparkSqlBaseParser.StructContext ctx);
	/**
	 * Exit a parse tree produced by the {@code struct}
	 * labeled alternative in {@link SparkSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitStruct(SparkSqlBaseParser.StructContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dereference}
	 * labeled alternative in {@link SparkSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterDereference(SparkSqlBaseParser.DereferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dereference}
	 * labeled alternative in {@link SparkSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitDereference(SparkSqlBaseParser.DereferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code simpleCase}
	 * labeled alternative in {@link SparkSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleCase(SparkSqlBaseParser.SimpleCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code simpleCase}
	 * labeled alternative in {@link SparkSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleCase(SparkSqlBaseParser.SimpleCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code columnReference}
	 * labeled alternative in {@link SparkSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterColumnReference(SparkSqlBaseParser.ColumnReferenceContext ctx);
	/**
	 * Exit a parse tree produced by the {@code columnReference}
	 * labeled alternative in {@link SparkSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitColumnReference(SparkSqlBaseParser.ColumnReferenceContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rowConstructor}
	 * labeled alternative in {@link SparkSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterRowConstructor(SparkSqlBaseParser.RowConstructorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rowConstructor}
	 * labeled alternative in {@link SparkSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitRowConstructor(SparkSqlBaseParser.RowConstructorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code last}
	 * labeled alternative in {@link SparkSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterLast(SparkSqlBaseParser.LastContext ctx);
	/**
	 * Exit a parse tree produced by the {@code last}
	 * labeled alternative in {@link SparkSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitLast(SparkSqlBaseParser.LastContext ctx);
	/**
	 * Enter a parse tree produced by the {@code star}
	 * labeled alternative in {@link SparkSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterStar(SparkSqlBaseParser.StarContext ctx);
	/**
	 * Exit a parse tree produced by the {@code star}
	 * labeled alternative in {@link SparkSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitStar(SparkSqlBaseParser.StarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code overlay}
	 * labeled alternative in {@link SparkSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterOverlay(SparkSqlBaseParser.OverlayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code overlay}
	 * labeled alternative in {@link SparkSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitOverlay(SparkSqlBaseParser.OverlayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subscript}
	 * labeled alternative in {@link SparkSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubscript(SparkSqlBaseParser.SubscriptContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subscript}
	 * labeled alternative in {@link SparkSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubscript(SparkSqlBaseParser.SubscriptContext ctx);
	/**
	 * Enter a parse tree produced by the {@code subqueryExpression}
	 * labeled alternative in {@link SparkSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubqueryExpression(SparkSqlBaseParser.SubqueryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code subqueryExpression}
	 * labeled alternative in {@link SparkSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubqueryExpression(SparkSqlBaseParser.SubqueryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code substring}
	 * labeled alternative in {@link SparkSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSubstring(SparkSqlBaseParser.SubstringContext ctx);
	/**
	 * Exit a parse tree produced by the {@code substring}
	 * labeled alternative in {@link SparkSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSubstring(SparkSqlBaseParser.SubstringContext ctx);
	/**
	 * Enter a parse tree produced by the {@code currentDatetime}
	 * labeled alternative in {@link SparkSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterCurrentDatetime(SparkSqlBaseParser.CurrentDatetimeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code currentDatetime}
	 * labeled alternative in {@link SparkSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitCurrentDatetime(SparkSqlBaseParser.CurrentDatetimeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code cast}
	 * labeled alternative in {@link SparkSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterCast(SparkSqlBaseParser.CastContext ctx);
	/**
	 * Exit a parse tree produced by the {@code cast}
	 * labeled alternative in {@link SparkSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitCast(SparkSqlBaseParser.CastContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constantDefault}
	 * labeled alternative in {@link SparkSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterConstantDefault(SparkSqlBaseParser.ConstantDefaultContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constantDefault}
	 * labeled alternative in {@link SparkSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitConstantDefault(SparkSqlBaseParser.ConstantDefaultContext ctx);
	/**
	 * Enter a parse tree produced by the {@code lambda}
	 * labeled alternative in {@link SparkSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterLambda(SparkSqlBaseParser.LambdaContext ctx);
	/**
	 * Exit a parse tree produced by the {@code lambda}
	 * labeled alternative in {@link SparkSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitLambda(SparkSqlBaseParser.LambdaContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link SparkSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterParenthesizedExpression(SparkSqlBaseParser.ParenthesizedExpressionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesizedExpression}
	 * labeled alternative in {@link SparkSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitParenthesizedExpression(SparkSqlBaseParser.ParenthesizedExpressionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code extract}
	 * labeled alternative in {@link SparkSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterExtract(SparkSqlBaseParser.ExtractContext ctx);
	/**
	 * Exit a parse tree produced by the {@code extract}
	 * labeled alternative in {@link SparkSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitExtract(SparkSqlBaseParser.ExtractContext ctx);
	/**
	 * Enter a parse tree produced by the {@code trim}
	 * labeled alternative in {@link SparkSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterTrim(SparkSqlBaseParser.TrimContext ctx);
	/**
	 * Exit a parse tree produced by the {@code trim}
	 * labeled alternative in {@link SparkSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitTrim(SparkSqlBaseParser.TrimContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link SparkSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(SparkSqlBaseParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functionCall}
	 * labeled alternative in {@link SparkSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(SparkSqlBaseParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code searchedCase}
	 * labeled alternative in {@link SparkSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterSearchedCase(SparkSqlBaseParser.SearchedCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code searchedCase}
	 * labeled alternative in {@link SparkSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitSearchedCase(SparkSqlBaseParser.SearchedCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code position}
	 * labeled alternative in {@link SparkSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterPosition(SparkSqlBaseParser.PositionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code position}
	 * labeled alternative in {@link SparkSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitPosition(SparkSqlBaseParser.PositionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code first}
	 * labeled alternative in {@link SparkSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void enterFirst(SparkSqlBaseParser.FirstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code first}
	 * labeled alternative in {@link SparkSqlBaseParser#primaryExpression}.
	 * @param ctx the parse tree
	 */
	void exitFirst(SparkSqlBaseParser.FirstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link SparkSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterNullLiteral(SparkSqlBaseParser.NullLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nullLiteral}
	 * labeled alternative in {@link SparkSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitNullLiteral(SparkSqlBaseParser.NullLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intervalLiteral}
	 * labeled alternative in {@link SparkSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterIntervalLiteral(SparkSqlBaseParser.IntervalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intervalLiteral}
	 * labeled alternative in {@link SparkSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitIntervalLiteral(SparkSqlBaseParser.IntervalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeConstructor}
	 * labeled alternative in {@link SparkSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterTypeConstructor(SparkSqlBaseParser.TypeConstructorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeConstructor}
	 * labeled alternative in {@link SparkSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitTypeConstructor(SparkSqlBaseParser.TypeConstructorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link SparkSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterNumericLiteral(SparkSqlBaseParser.NumericLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code numericLiteral}
	 * labeled alternative in {@link SparkSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitNumericLiteral(SparkSqlBaseParser.NumericLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link SparkSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiteral(SparkSqlBaseParser.BooleanLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code booleanLiteral}
	 * labeled alternative in {@link SparkSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiteral(SparkSqlBaseParser.BooleanLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link SparkSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterStringLiteral(SparkSqlBaseParser.StringLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code stringLiteral}
	 * labeled alternative in {@link SparkSqlBaseParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitStringLiteral(SparkSqlBaseParser.StringLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(SparkSqlBaseParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(SparkSqlBaseParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#arithmeticOperator}.
	 * @param ctx the parse tree
	 */
	void enterArithmeticOperator(SparkSqlBaseParser.ArithmeticOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#arithmeticOperator}.
	 * @param ctx the parse tree
	 */
	void exitArithmeticOperator(SparkSqlBaseParser.ArithmeticOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#predicateOperator}.
	 * @param ctx the parse tree
	 */
	void enterPredicateOperator(SparkSqlBaseParser.PredicateOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#predicateOperator}.
	 * @param ctx the parse tree
	 */
	void exitPredicateOperator(SparkSqlBaseParser.PredicateOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void enterBooleanValue(SparkSqlBaseParser.BooleanValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void exitBooleanValue(SparkSqlBaseParser.BooleanValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#interval}.
	 * @param ctx the parse tree
	 */
	void enterInterval(SparkSqlBaseParser.IntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#interval}.
	 * @param ctx the parse tree
	 */
	void exitInterval(SparkSqlBaseParser.IntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#errorCapturingMultiUnitsInterval}.
	 * @param ctx the parse tree
	 */
	void enterErrorCapturingMultiUnitsInterval(SparkSqlBaseParser.ErrorCapturingMultiUnitsIntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#errorCapturingMultiUnitsInterval}.
	 * @param ctx the parse tree
	 */
	void exitErrorCapturingMultiUnitsInterval(SparkSqlBaseParser.ErrorCapturingMultiUnitsIntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#multiUnitsInterval}.
	 * @param ctx the parse tree
	 */
	void enterMultiUnitsInterval(SparkSqlBaseParser.MultiUnitsIntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#multiUnitsInterval}.
	 * @param ctx the parse tree
	 */
	void exitMultiUnitsInterval(SparkSqlBaseParser.MultiUnitsIntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#errorCapturingUnitToUnitInterval}.
	 * @param ctx the parse tree
	 */
	void enterErrorCapturingUnitToUnitInterval(SparkSqlBaseParser.ErrorCapturingUnitToUnitIntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#errorCapturingUnitToUnitInterval}.
	 * @param ctx the parse tree
	 */
	void exitErrorCapturingUnitToUnitInterval(SparkSqlBaseParser.ErrorCapturingUnitToUnitIntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#unitToUnitInterval}.
	 * @param ctx the parse tree
	 */
	void enterUnitToUnitInterval(SparkSqlBaseParser.UnitToUnitIntervalContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#unitToUnitInterval}.
	 * @param ctx the parse tree
	 */
	void exitUnitToUnitInterval(SparkSqlBaseParser.UnitToUnitIntervalContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#intervalValue}.
	 * @param ctx the parse tree
	 */
	void enterIntervalValue(SparkSqlBaseParser.IntervalValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#intervalValue}.
	 * @param ctx the parse tree
	 */
	void exitIntervalValue(SparkSqlBaseParser.IntervalValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#intervalUnit}.
	 * @param ctx the parse tree
	 */
	void enterIntervalUnit(SparkSqlBaseParser.IntervalUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#intervalUnit}.
	 * @param ctx the parse tree
	 */
	void exitIntervalUnit(SparkSqlBaseParser.IntervalUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#colPosition}.
	 * @param ctx the parse tree
	 */
	void enterColPosition(SparkSqlBaseParser.ColPositionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#colPosition}.
	 * @param ctx the parse tree
	 */
	void exitColPosition(SparkSqlBaseParser.ColPositionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code complexDataType}
	 * labeled alternative in {@link SparkSqlBaseParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterComplexDataType(SparkSqlBaseParser.ComplexDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code complexDataType}
	 * labeled alternative in {@link SparkSqlBaseParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitComplexDataType(SparkSqlBaseParser.ComplexDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code primitiveDataType}
	 * labeled alternative in {@link SparkSqlBaseParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterPrimitiveDataType(SparkSqlBaseParser.PrimitiveDataTypeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code primitiveDataType}
	 * labeled alternative in {@link SparkSqlBaseParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitPrimitiveDataType(SparkSqlBaseParser.PrimitiveDataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#qualifiedColTypeWithPositionList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedColTypeWithPositionList(SparkSqlBaseParser.QualifiedColTypeWithPositionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#qualifiedColTypeWithPositionList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedColTypeWithPositionList(SparkSqlBaseParser.QualifiedColTypeWithPositionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#qualifiedColTypeWithPosition}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedColTypeWithPosition(SparkSqlBaseParser.QualifiedColTypeWithPositionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#qualifiedColTypeWithPosition}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedColTypeWithPosition(SparkSqlBaseParser.QualifiedColTypeWithPositionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#colTypeList}.
	 * @param ctx the parse tree
	 */
	void enterColTypeList(SparkSqlBaseParser.ColTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#colTypeList}.
	 * @param ctx the parse tree
	 */
	void exitColTypeList(SparkSqlBaseParser.ColTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#colType}.
	 * @param ctx the parse tree
	 */
	void enterColType(SparkSqlBaseParser.ColTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#colType}.
	 * @param ctx the parse tree
	 */
	void exitColType(SparkSqlBaseParser.ColTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#complexColTypeList}.
	 * @param ctx the parse tree
	 */
	void enterComplexColTypeList(SparkSqlBaseParser.ComplexColTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#complexColTypeList}.
	 * @param ctx the parse tree
	 */
	void exitComplexColTypeList(SparkSqlBaseParser.ComplexColTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#complexColType}.
	 * @param ctx the parse tree
	 */
	void enterComplexColType(SparkSqlBaseParser.ComplexColTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#complexColType}.
	 * @param ctx the parse tree
	 */
	void exitComplexColType(SparkSqlBaseParser.ComplexColTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#whenClause}.
	 * @param ctx the parse tree
	 */
	void enterWhenClause(SparkSqlBaseParser.WhenClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#whenClause}.
	 * @param ctx the parse tree
	 */
	void exitWhenClause(SparkSqlBaseParser.WhenClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#windowClause}.
	 * @param ctx the parse tree
	 */
	void enterWindowClause(SparkSqlBaseParser.WindowClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#windowClause}.
	 * @param ctx the parse tree
	 */
	void exitWindowClause(SparkSqlBaseParser.WindowClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#namedWindow}.
	 * @param ctx the parse tree
	 */
	void enterNamedWindow(SparkSqlBaseParser.NamedWindowContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#namedWindow}.
	 * @param ctx the parse tree
	 */
	void exitNamedWindow(SparkSqlBaseParser.NamedWindowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code windowRef}
	 * labeled alternative in {@link SparkSqlBaseParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void enterWindowRef(SparkSqlBaseParser.WindowRefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code windowRef}
	 * labeled alternative in {@link SparkSqlBaseParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void exitWindowRef(SparkSqlBaseParser.WindowRefContext ctx);
	/**
	 * Enter a parse tree produced by the {@code windowDef}
	 * labeled alternative in {@link SparkSqlBaseParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void enterWindowDef(SparkSqlBaseParser.WindowDefContext ctx);
	/**
	 * Exit a parse tree produced by the {@code windowDef}
	 * labeled alternative in {@link SparkSqlBaseParser#windowSpec}.
	 * @param ctx the parse tree
	 */
	void exitWindowDef(SparkSqlBaseParser.WindowDefContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#windowFrame}.
	 * @param ctx the parse tree
	 */
	void enterWindowFrame(SparkSqlBaseParser.WindowFrameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#windowFrame}.
	 * @param ctx the parse tree
	 */
	void exitWindowFrame(SparkSqlBaseParser.WindowFrameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#frameBound}.
	 * @param ctx the parse tree
	 */
	void enterFrameBound(SparkSqlBaseParser.FrameBoundContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#frameBound}.
	 * @param ctx the parse tree
	 */
	void exitFrameBound(SparkSqlBaseParser.FrameBoundContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedNameList(SparkSqlBaseParser.QualifiedNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#qualifiedNameList}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedNameList(SparkSqlBaseParser.QualifiedNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#functionName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionName(SparkSqlBaseParser.FunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#functionName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionName(SparkSqlBaseParser.FunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedName(SparkSqlBaseParser.QualifiedNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#qualifiedName}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedName(SparkSqlBaseParser.QualifiedNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#errorCapturingIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterErrorCapturingIdentifier(SparkSqlBaseParser.ErrorCapturingIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#errorCapturingIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitErrorCapturingIdentifier(SparkSqlBaseParser.ErrorCapturingIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code errorIdent}
	 * labeled alternative in {@link SparkSqlBaseParser#errorCapturingIdentifierExtra}.
	 * @param ctx the parse tree
	 */
	void enterErrorIdent(SparkSqlBaseParser.ErrorIdentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code errorIdent}
	 * labeled alternative in {@link SparkSqlBaseParser#errorCapturingIdentifierExtra}.
	 * @param ctx the parse tree
	 */
	void exitErrorIdent(SparkSqlBaseParser.ErrorIdentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code realIdent}
	 * labeled alternative in {@link SparkSqlBaseParser#errorCapturingIdentifierExtra}.
	 * @param ctx the parse tree
	 */
	void enterRealIdent(SparkSqlBaseParser.RealIdentContext ctx);
	/**
	 * Exit a parse tree produced by the {@code realIdent}
	 * labeled alternative in {@link SparkSqlBaseParser#errorCapturingIdentifierExtra}.
	 * @param ctx the parse tree
	 */
	void exitRealIdent(SparkSqlBaseParser.RealIdentContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(SparkSqlBaseParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(SparkSqlBaseParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link SparkSqlBaseParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterUnquotedIdentifier(SparkSqlBaseParser.UnquotedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code unquotedIdentifier}
	 * labeled alternative in {@link SparkSqlBaseParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitUnquotedIdentifier(SparkSqlBaseParser.UnquotedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code quotedIdentifierAlternative}
	 * labeled alternative in {@link SparkSqlBaseParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterQuotedIdentifierAlternative(SparkSqlBaseParser.QuotedIdentifierAlternativeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code quotedIdentifierAlternative}
	 * labeled alternative in {@link SparkSqlBaseParser#strictIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitQuotedIdentifierAlternative(SparkSqlBaseParser.QuotedIdentifierAlternativeContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#quotedIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterQuotedIdentifier(SparkSqlBaseParser.QuotedIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#quotedIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitQuotedIdentifier(SparkSqlBaseParser.QuotedIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exponentLiteral}
	 * labeled alternative in {@link SparkSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void enterExponentLiteral(SparkSqlBaseParser.ExponentLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exponentLiteral}
	 * labeled alternative in {@link SparkSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void exitExponentLiteral(SparkSqlBaseParser.ExponentLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link SparkSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void enterDecimalLiteral(SparkSqlBaseParser.DecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code decimalLiteral}
	 * labeled alternative in {@link SparkSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void exitDecimalLiteral(SparkSqlBaseParser.DecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code legacyDecimalLiteral}
	 * labeled alternative in {@link SparkSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void enterLegacyDecimalLiteral(SparkSqlBaseParser.LegacyDecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code legacyDecimalLiteral}
	 * labeled alternative in {@link SparkSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void exitLegacyDecimalLiteral(SparkSqlBaseParser.LegacyDecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link SparkSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void enterIntegerLiteral(SparkSqlBaseParser.IntegerLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code integerLiteral}
	 * labeled alternative in {@link SparkSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void exitIntegerLiteral(SparkSqlBaseParser.IntegerLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bigIntLiteral}
	 * labeled alternative in {@link SparkSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void enterBigIntLiteral(SparkSqlBaseParser.BigIntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bigIntLiteral}
	 * labeled alternative in {@link SparkSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void exitBigIntLiteral(SparkSqlBaseParser.BigIntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code smallIntLiteral}
	 * labeled alternative in {@link SparkSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void enterSmallIntLiteral(SparkSqlBaseParser.SmallIntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code smallIntLiteral}
	 * labeled alternative in {@link SparkSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void exitSmallIntLiteral(SparkSqlBaseParser.SmallIntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tinyIntLiteral}
	 * labeled alternative in {@link SparkSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void enterTinyIntLiteral(SparkSqlBaseParser.TinyIntLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tinyIntLiteral}
	 * labeled alternative in {@link SparkSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void exitTinyIntLiteral(SparkSqlBaseParser.TinyIntLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code doubleLiteral}
	 * labeled alternative in {@link SparkSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void enterDoubleLiteral(SparkSqlBaseParser.DoubleLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code doubleLiteral}
	 * labeled alternative in {@link SparkSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void exitDoubleLiteral(SparkSqlBaseParser.DoubleLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code bigDecimalLiteral}
	 * labeled alternative in {@link SparkSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void enterBigDecimalLiteral(SparkSqlBaseParser.BigDecimalLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code bigDecimalLiteral}
	 * labeled alternative in {@link SparkSqlBaseParser#number}.
	 * @param ctx the parse tree
	 */
	void exitBigDecimalLiteral(SparkSqlBaseParser.BigDecimalLiteralContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#alterColumnAction}.
	 * @param ctx the parse tree
	 */
	void enterAlterColumnAction(SparkSqlBaseParser.AlterColumnActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#alterColumnAction}.
	 * @param ctx the parse tree
	 */
	void exitAlterColumnAction(SparkSqlBaseParser.AlterColumnActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#ansiNonReserved}.
	 * @param ctx the parse tree
	 */
	void enterAnsiNonReserved(SparkSqlBaseParser.AnsiNonReservedContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#ansiNonReserved}.
	 * @param ctx the parse tree
	 */
	void exitAnsiNonReserved(SparkSqlBaseParser.AnsiNonReservedContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#strictNonReserved}.
	 * @param ctx the parse tree
	 */
	void enterStrictNonReserved(SparkSqlBaseParser.StrictNonReservedContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#strictNonReserved}.
	 * @param ctx the parse tree
	 */
	void exitStrictNonReserved(SparkSqlBaseParser.StrictNonReservedContext ctx);
	/**
	 * Enter a parse tree produced by {@link SparkSqlBaseParser#nonReserved}.
	 * @param ctx the parse tree
	 */
	void enterNonReserved(SparkSqlBaseParser.NonReservedContext ctx);
	/**
	 * Exit a parse tree produced by {@link SparkSqlBaseParser#nonReserved}.
	 * @param ctx the parse tree
	 */
	void exitNonReserved(SparkSqlBaseParser.NonReservedContext ctx);
}