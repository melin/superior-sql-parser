// Generated from com/dataworker/sql/parser/antlr4/clickhouse/ClickHouseParser.g4 by ANTLR 4.7.1
package com.dataworker.sql.parser.antlr4.clickhouse;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link ClickHouseParser}.
 */
public interface ClickHouseParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#queryList}.
	 * @param ctx the parse tree
	 */
	void enterQueryList(ClickHouseParser.QueryListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#queryList}.
	 * @param ctx the parse tree
	 */
	void exitQueryList(ClickHouseParser.QueryListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#queryStmt}.
	 * @param ctx the parse tree
	 */
	void enterQueryStmt(ClickHouseParser.QueryStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#queryStmt}.
	 * @param ctx the parse tree
	 */
	void exitQueryStmt(ClickHouseParser.QueryStmtContext ctx);
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
	 * Enter a parse tree produced by the {@code AlterTableStmt}
	 * labeled alternative in {@link ClickHouseParser#alterStmt}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableStmt(ClickHouseParser.AlterTableStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AlterTableStmt}
	 * labeled alternative in {@link ClickHouseParser#alterStmt}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableStmt(ClickHouseParser.AlterTableStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AlterTableAddClause}
	 * labeled alternative in {@link ClickHouseParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableAddClause(ClickHouseParser.AlterTableAddClauseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AlterTableAddClause}
	 * labeled alternative in {@link ClickHouseParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableAddClause(ClickHouseParser.AlterTableAddClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AlterTableDropClause}
	 * labeled alternative in {@link ClickHouseParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableDropClause(ClickHouseParser.AlterTableDropClauseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AlterTableDropClause}
	 * labeled alternative in {@link ClickHouseParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableDropClause(ClickHouseParser.AlterTableDropClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AlterTableModifyClause}
	 * labeled alternative in {@link ClickHouseParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void enterAlterTableModifyClause(ClickHouseParser.AlterTableModifyClauseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AlterTableModifyClause}
	 * labeled alternative in {@link ClickHouseParser#alterTableClause}.
	 * @param ctx the parse tree
	 */
	void exitAlterTableModifyClause(ClickHouseParser.AlterTableModifyClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#checkStmt}.
	 * @param ctx the parse tree
	 */
	void enterCheckStmt(ClickHouseParser.CheckStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#checkStmt}.
	 * @param ctx the parse tree
	 */
	void exitCheckStmt(ClickHouseParser.CheckStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createDatabaseStmt}
	 * labeled alternative in {@link ClickHouseParser#createStmt}.
	 * @param ctx the parse tree
	 */
	void enterCreateDatabaseStmt(ClickHouseParser.CreateDatabaseStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createDatabaseStmt}
	 * labeled alternative in {@link ClickHouseParser#createStmt}.
	 * @param ctx the parse tree
	 */
	void exitCreateDatabaseStmt(ClickHouseParser.CreateDatabaseStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code createTableStmt}
	 * labeled alternative in {@link ClickHouseParser#createStmt}.
	 * @param ctx the parse tree
	 */
	void enterCreateTableStmt(ClickHouseParser.CreateTableStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code createTableStmt}
	 * labeled alternative in {@link ClickHouseParser#createStmt}.
	 * @param ctx the parse tree
	 */
	void exitCreateTableStmt(ClickHouseParser.CreateTableStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SchemaDescriptionClause}
	 * labeled alternative in {@link ClickHouseParser#schemaClause}.
	 * @param ctx the parse tree
	 */
	void enterSchemaDescriptionClause(ClickHouseParser.SchemaDescriptionClauseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SchemaDescriptionClause}
	 * labeled alternative in {@link ClickHouseParser#schemaClause}.
	 * @param ctx the parse tree
	 */
	void exitSchemaDescriptionClause(ClickHouseParser.SchemaDescriptionClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SchemaAsSubqueryClause}
	 * labeled alternative in {@link ClickHouseParser#schemaClause}.
	 * @param ctx the parse tree
	 */
	void enterSchemaAsSubqueryClause(ClickHouseParser.SchemaAsSubqueryClauseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SchemaAsSubqueryClause}
	 * labeled alternative in {@link ClickHouseParser#schemaClause}.
	 * @param ctx the parse tree
	 */
	void exitSchemaAsSubqueryClause(ClickHouseParser.SchemaAsSubqueryClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SchemaAsTableClause}
	 * labeled alternative in {@link ClickHouseParser#schemaClause}.
	 * @param ctx the parse tree
	 */
	void enterSchemaAsTableClause(ClickHouseParser.SchemaAsTableClauseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SchemaAsTableClause}
	 * labeled alternative in {@link ClickHouseParser#schemaClause}.
	 * @param ctx the parse tree
	 */
	void exitSchemaAsTableClause(ClickHouseParser.SchemaAsTableClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code SchemaAsFunctionClause}
	 * labeled alternative in {@link ClickHouseParser#schemaClause}.
	 * @param ctx the parse tree
	 */
	void enterSchemaAsFunctionClause(ClickHouseParser.SchemaAsFunctionClauseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code SchemaAsFunctionClause}
	 * labeled alternative in {@link ClickHouseParser#schemaClause}.
	 * @param ctx the parse tree
	 */
	void exitSchemaAsFunctionClause(ClickHouseParser.SchemaAsFunctionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#engineClause}.
	 * @param ctx the parse tree
	 */
	void enterEngineClause(ClickHouseParser.EngineClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#engineClause}.
	 * @param ctx the parse tree
	 */
	void exitEngineClause(ClickHouseParser.EngineClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#partitionByClause}.
	 * @param ctx the parse tree
	 */
	void enterPartitionByClause(ClickHouseParser.PartitionByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#partitionByClause}.
	 * @param ctx the parse tree
	 */
	void exitPartitionByClause(ClickHouseParser.PartitionByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#primaryKeyClause}.
	 * @param ctx the parse tree
	 */
	void enterPrimaryKeyClause(ClickHouseParser.PrimaryKeyClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#primaryKeyClause}.
	 * @param ctx the parse tree
	 */
	void exitPrimaryKeyClause(ClickHouseParser.PrimaryKeyClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#sampleByClause}.
	 * @param ctx the parse tree
	 */
	void enterSampleByClause(ClickHouseParser.SampleByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#sampleByClause}.
	 * @param ctx the parse tree
	 */
	void exitSampleByClause(ClickHouseParser.SampleByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#ttlClause}.
	 * @param ctx the parse tree
	 */
	void enterTtlClause(ClickHouseParser.TtlClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#ttlClause}.
	 * @param ctx the parse tree
	 */
	void exitTtlClause(ClickHouseParser.TtlClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#engineExpr}.
	 * @param ctx the parse tree
	 */
	void enterEngineExpr(ClickHouseParser.EngineExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#engineExpr}.
	 * @param ctx the parse tree
	 */
	void exitEngineExpr(ClickHouseParser.EngineExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TableElementExprColumn}
	 * labeled alternative in {@link ClickHouseParser#tableElementExpr}.
	 * @param ctx the parse tree
	 */
	void enterTableElementExprColumn(ClickHouseParser.TableElementExprColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TableElementExprColumn}
	 * labeled alternative in {@link ClickHouseParser#tableElementExpr}.
	 * @param ctx the parse tree
	 */
	void exitTableElementExprColumn(ClickHouseParser.TableElementExprColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#tableColumnDfnt}.
	 * @param ctx the parse tree
	 */
	void enterTableColumnDfnt(ClickHouseParser.TableColumnDfntContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#tableColumnDfnt}.
	 * @param ctx the parse tree
	 */
	void exitTableColumnDfnt(ClickHouseParser.TableColumnDfntContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#tableColumnPropertyExpr}.
	 * @param ctx the parse tree
	 */
	void enterTableColumnPropertyExpr(ClickHouseParser.TableColumnPropertyExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#tableColumnPropertyExpr}.
	 * @param ctx the parse tree
	 */
	void exitTableColumnPropertyExpr(ClickHouseParser.TableColumnPropertyExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#ttlExpr}.
	 * @param ctx the parse tree
	 */
	void enterTtlExpr(ClickHouseParser.TtlExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#ttlExpr}.
	 * @param ctx the parse tree
	 */
	void exitTtlExpr(ClickHouseParser.TtlExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#describeStmt}.
	 * @param ctx the parse tree
	 */
	void enterDescribeStmt(ClickHouseParser.DescribeStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#describeStmt}.
	 * @param ctx the parse tree
	 */
	void exitDescribeStmt(ClickHouseParser.DescribeStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DropDatabaseStmt}
	 * labeled alternative in {@link ClickHouseParser#dropStmt}.
	 * @param ctx the parse tree
	 */
	void enterDropDatabaseStmt(ClickHouseParser.DropDatabaseStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DropDatabaseStmt}
	 * labeled alternative in {@link ClickHouseParser#dropStmt}.
	 * @param ctx the parse tree
	 */
	void exitDropDatabaseStmt(ClickHouseParser.DropDatabaseStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code DropTableStmt}
	 * labeled alternative in {@link ClickHouseParser#dropStmt}.
	 * @param ctx the parse tree
	 */
	void enterDropTableStmt(ClickHouseParser.DropTableStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code DropTableStmt}
	 * labeled alternative in {@link ClickHouseParser#dropStmt}.
	 * @param ctx the parse tree
	 */
	void exitDropTableStmt(ClickHouseParser.DropTableStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#insertStmt}.
	 * @param ctx the parse tree
	 */
	void enterInsertStmt(ClickHouseParser.InsertStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#insertStmt}.
	 * @param ctx the parse tree
	 */
	void exitInsertStmt(ClickHouseParser.InsertStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#valuesClause}.
	 * @param ctx the parse tree
	 */
	void enterValuesClause(ClickHouseParser.ValuesClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#valuesClause}.
	 * @param ctx the parse tree
	 */
	void exitValuesClause(ClickHouseParser.ValuesClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#valueTupleExpr}.
	 * @param ctx the parse tree
	 */
	void enterValueTupleExpr(ClickHouseParser.ValueTupleExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#valueTupleExpr}.
	 * @param ctx the parse tree
	 */
	void exitValueTupleExpr(ClickHouseParser.ValueTupleExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#optimizeStmt}.
	 * @param ctx the parse tree
	 */
	void enterOptimizeStmt(ClickHouseParser.OptimizeStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#optimizeStmt}.
	 * @param ctx the parse tree
	 */
	void exitOptimizeStmt(ClickHouseParser.OptimizeStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#partitionClause}.
	 * @param ctx the parse tree
	 */
	void enterPartitionClause(ClickHouseParser.PartitionClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#partitionClause}.
	 * @param ctx the parse tree
	 */
	void exitPartitionClause(ClickHouseParser.PartitionClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#selectUnionStmt}.
	 * @param ctx the parse tree
	 */
	void enterSelectUnionStmt(ClickHouseParser.SelectUnionStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#selectUnionStmt}.
	 * @param ctx the parse tree
	 */
	void exitSelectUnionStmt(ClickHouseParser.SelectUnionStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#selectStmt}.
	 * @param ctx the parse tree
	 */
	void enterSelectStmt(ClickHouseParser.SelectStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#selectStmt}.
	 * @param ctx the parse tree
	 */
	void exitSelectStmt(ClickHouseParser.SelectStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#withClause}.
	 * @param ctx the parse tree
	 */
	void enterWithClause(ClickHouseParser.WithClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#withClause}.
	 * @param ctx the parse tree
	 */
	void exitWithClause(ClickHouseParser.WithClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void enterFromClause(ClickHouseParser.FromClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void exitFromClause(ClickHouseParser.FromClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#sampleClause}.
	 * @param ctx the parse tree
	 */
	void enterSampleClause(ClickHouseParser.SampleClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#sampleClause}.
	 * @param ctx the parse tree
	 */
	void exitSampleClause(ClickHouseParser.SampleClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#arrayJoinClause}.
	 * @param ctx the parse tree
	 */
	void enterArrayJoinClause(ClickHouseParser.ArrayJoinClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#arrayJoinClause}.
	 * @param ctx the parse tree
	 */
	void exitArrayJoinClause(ClickHouseParser.ArrayJoinClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#prewhereClause}.
	 * @param ctx the parse tree
	 */
	void enterPrewhereClause(ClickHouseParser.PrewhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#prewhereClause}.
	 * @param ctx the parse tree
	 */
	void exitPrewhereClause(ClickHouseParser.PrewhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(ClickHouseParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(ClickHouseParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void enterGroupByClause(ClickHouseParser.GroupByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void exitGroupByClause(ClickHouseParser.GroupByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void enterHavingClause(ClickHouseParser.HavingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void exitHavingClause(ClickHouseParser.HavingClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void enterOrderByClause(ClickHouseParser.OrderByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void exitOrderByClause(ClickHouseParser.OrderByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#limitByClause}.
	 * @param ctx the parse tree
	 */
	void enterLimitByClause(ClickHouseParser.LimitByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#limitByClause}.
	 * @param ctx the parse tree
	 */
	void exitLimitByClause(ClickHouseParser.LimitByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void enterLimitClause(ClickHouseParser.LimitClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void exitLimitClause(ClickHouseParser.LimitClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#settingsClause}.
	 * @param ctx the parse tree
	 */
	void enterSettingsClause(ClickHouseParser.SettingsClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#settingsClause}.
	 * @param ctx the parse tree
	 */
	void exitSettingsClause(ClickHouseParser.SettingsClauseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JoinExprOp}
	 * labeled alternative in {@link ClickHouseParser#joinExpr}.
	 * @param ctx the parse tree
	 */
	void enterJoinExprOp(ClickHouseParser.JoinExprOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JoinExprOp}
	 * labeled alternative in {@link ClickHouseParser#joinExpr}.
	 * @param ctx the parse tree
	 */
	void exitJoinExprOp(ClickHouseParser.JoinExprOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JoinExprTable}
	 * labeled alternative in {@link ClickHouseParser#joinExpr}.
	 * @param ctx the parse tree
	 */
	void enterJoinExprTable(ClickHouseParser.JoinExprTableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JoinExprTable}
	 * labeled alternative in {@link ClickHouseParser#joinExpr}.
	 * @param ctx the parse tree
	 */
	void exitJoinExprTable(ClickHouseParser.JoinExprTableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JoinExprParens}
	 * labeled alternative in {@link ClickHouseParser#joinExpr}.
	 * @param ctx the parse tree
	 */
	void enterJoinExprParens(ClickHouseParser.JoinExprParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JoinExprParens}
	 * labeled alternative in {@link ClickHouseParser#joinExpr}.
	 * @param ctx the parse tree
	 */
	void exitJoinExprParens(ClickHouseParser.JoinExprParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JoinExprCrossOp}
	 * labeled alternative in {@link ClickHouseParser#joinExpr}.
	 * @param ctx the parse tree
	 */
	void enterJoinExprCrossOp(ClickHouseParser.JoinExprCrossOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JoinExprCrossOp}
	 * labeled alternative in {@link ClickHouseParser#joinExpr}.
	 * @param ctx the parse tree
	 */
	void exitJoinExprCrossOp(ClickHouseParser.JoinExprCrossOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JoinOpInner}
	 * labeled alternative in {@link ClickHouseParser#joinOp}.
	 * @param ctx the parse tree
	 */
	void enterJoinOpInner(ClickHouseParser.JoinOpInnerContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JoinOpInner}
	 * labeled alternative in {@link ClickHouseParser#joinOp}.
	 * @param ctx the parse tree
	 */
	void exitJoinOpInner(ClickHouseParser.JoinOpInnerContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JoinOpLeftRight}
	 * labeled alternative in {@link ClickHouseParser#joinOp}.
	 * @param ctx the parse tree
	 */
	void enterJoinOpLeftRight(ClickHouseParser.JoinOpLeftRightContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JoinOpLeftRight}
	 * labeled alternative in {@link ClickHouseParser#joinOp}.
	 * @param ctx the parse tree
	 */
	void exitJoinOpLeftRight(ClickHouseParser.JoinOpLeftRightContext ctx);
	/**
	 * Enter a parse tree produced by the {@code JoinOpFull}
	 * labeled alternative in {@link ClickHouseParser#joinOp}.
	 * @param ctx the parse tree
	 */
	void enterJoinOpFull(ClickHouseParser.JoinOpFullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code JoinOpFull}
	 * labeled alternative in {@link ClickHouseParser#joinOp}.
	 * @param ctx the parse tree
	 */
	void exitJoinOpFull(ClickHouseParser.JoinOpFullContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#joinOpCross}.
	 * @param ctx the parse tree
	 */
	void enterJoinOpCross(ClickHouseParser.JoinOpCrossContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#joinOpCross}.
	 * @param ctx the parse tree
	 */
	void exitJoinOpCross(ClickHouseParser.JoinOpCrossContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#joinConstraintClause}.
	 * @param ctx the parse tree
	 */
	void enterJoinConstraintClause(ClickHouseParser.JoinConstraintClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#joinConstraintClause}.
	 * @param ctx the parse tree
	 */
	void exitJoinConstraintClause(ClickHouseParser.JoinConstraintClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#limitExpr}.
	 * @param ctx the parse tree
	 */
	void enterLimitExpr(ClickHouseParser.LimitExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#limitExpr}.
	 * @param ctx the parse tree
	 */
	void exitLimitExpr(ClickHouseParser.LimitExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#orderExprList}.
	 * @param ctx the parse tree
	 */
	void enterOrderExprList(ClickHouseParser.OrderExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#orderExprList}.
	 * @param ctx the parse tree
	 */
	void exitOrderExprList(ClickHouseParser.OrderExprListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#orderExpr}.
	 * @param ctx the parse tree
	 */
	void enterOrderExpr(ClickHouseParser.OrderExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#orderExpr}.
	 * @param ctx the parse tree
	 */
	void exitOrderExpr(ClickHouseParser.OrderExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#ratioExpr}.
	 * @param ctx the parse tree
	 */
	void enterRatioExpr(ClickHouseParser.RatioExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#ratioExpr}.
	 * @param ctx the parse tree
	 */
	void exitRatioExpr(ClickHouseParser.RatioExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#settingExprList}.
	 * @param ctx the parse tree
	 */
	void enterSettingExprList(ClickHouseParser.SettingExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#settingExprList}.
	 * @param ctx the parse tree
	 */
	void exitSettingExprList(ClickHouseParser.SettingExprListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#settingExpr}.
	 * @param ctx the parse tree
	 */
	void enterSettingExpr(ClickHouseParser.SettingExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#settingExpr}.
	 * @param ctx the parse tree
	 */
	void exitSettingExpr(ClickHouseParser.SettingExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#setStmt}.
	 * @param ctx the parse tree
	 */
	void enterSetStmt(ClickHouseParser.SetStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#setStmt}.
	 * @param ctx the parse tree
	 */
	void exitSetStmt(ClickHouseParser.SetStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showCreateTableStmt}
	 * labeled alternative in {@link ClickHouseParser#showStmt}.
	 * @param ctx the parse tree
	 */
	void enterShowCreateTableStmt(ClickHouseParser.ShowCreateTableStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showCreateTableStmt}
	 * labeled alternative in {@link ClickHouseParser#showStmt}.
	 * @param ctx the parse tree
	 */
	void exitShowCreateTableStmt(ClickHouseParser.ShowCreateTableStmtContext ctx);
	/**
	 * Enter a parse tree produced by the {@code showTablesStmt}
	 * labeled alternative in {@link ClickHouseParser#showStmt}.
	 * @param ctx the parse tree
	 */
	void enterShowTablesStmt(ClickHouseParser.ShowTablesStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code showTablesStmt}
	 * labeled alternative in {@link ClickHouseParser#showStmt}.
	 * @param ctx the parse tree
	 */
	void exitShowTablesStmt(ClickHouseParser.ShowTablesStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#useStmt}.
	 * @param ctx the parse tree
	 */
	void enterUseStmt(ClickHouseParser.UseStmtContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#useStmt}.
	 * @param ctx the parse tree
	 */
	void exitUseStmt(ClickHouseParser.UseStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#valueExprList}.
	 * @param ctx the parse tree
	 */
	void enterValueExprList(ClickHouseParser.ValueExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#valueExprList}.
	 * @param ctx the parse tree
	 */
	void exitValueExprList(ClickHouseParser.ValueExprListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValueExprLiteral}
	 * labeled alternative in {@link ClickHouseParser#valueExpr}.
	 * @param ctx the parse tree
	 */
	void enterValueExprLiteral(ClickHouseParser.ValueExprLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValueExprLiteral}
	 * labeled alternative in {@link ClickHouseParser#valueExpr}.
	 * @param ctx the parse tree
	 */
	void exitValueExprLiteral(ClickHouseParser.ValueExprLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValueExprTuple}
	 * labeled alternative in {@link ClickHouseParser#valueExpr}.
	 * @param ctx the parse tree
	 */
	void enterValueExprTuple(ClickHouseParser.ValueExprTupleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValueExprTuple}
	 * labeled alternative in {@link ClickHouseParser#valueExpr}.
	 * @param ctx the parse tree
	 */
	void exitValueExprTuple(ClickHouseParser.ValueExprTupleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ValueExprArray}
	 * labeled alternative in {@link ClickHouseParser#valueExpr}.
	 * @param ctx the parse tree
	 */
	void enterValueExprArray(ClickHouseParser.ValueExprArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ValueExprArray}
	 * labeled alternative in {@link ClickHouseParser#valueExpr}.
	 * @param ctx the parse tree
	 */
	void exitValueExprArray(ClickHouseParser.ValueExprArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnTypeExprSimple}
	 * labeled alternative in {@link ClickHouseParser#columnTypeExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnTypeExprSimple(ClickHouseParser.ColumnTypeExprSimpleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnTypeExprSimple}
	 * labeled alternative in {@link ClickHouseParser#columnTypeExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnTypeExprSimple(ClickHouseParser.ColumnTypeExprSimpleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnTypeExprParam}
	 * labeled alternative in {@link ClickHouseParser#columnTypeExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnTypeExprParam(ClickHouseParser.ColumnTypeExprParamContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnTypeExprParam}
	 * labeled alternative in {@link ClickHouseParser#columnTypeExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnTypeExprParam(ClickHouseParser.ColumnTypeExprParamContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnTypeExprEnum}
	 * labeled alternative in {@link ClickHouseParser#columnTypeExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnTypeExprEnum(ClickHouseParser.ColumnTypeExprEnumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnTypeExprEnum}
	 * labeled alternative in {@link ClickHouseParser#columnTypeExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnTypeExprEnum(ClickHouseParser.ColumnTypeExprEnumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnTypeExprComplex}
	 * labeled alternative in {@link ClickHouseParser#columnTypeExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnTypeExprComplex(ClickHouseParser.ColumnTypeExprComplexContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnTypeExprComplex}
	 * labeled alternative in {@link ClickHouseParser#columnTypeExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnTypeExprComplex(ClickHouseParser.ColumnTypeExprComplexContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnTypeExprNested}
	 * labeled alternative in {@link ClickHouseParser#columnTypeExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnTypeExprNested(ClickHouseParser.ColumnTypeExprNestedContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnTypeExprNested}
	 * labeled alternative in {@link ClickHouseParser#columnTypeExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnTypeExprNested(ClickHouseParser.ColumnTypeExprNestedContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#columnExprList}.
	 * @param ctx the parse tree
	 */
	void enterColumnExprList(ClickHouseParser.ColumnExprListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#columnExprList}.
	 * @param ctx the parse tree
	 */
	void exitColumnExprList(ClickHouseParser.ColumnExprListContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnsExprAsterisk}
	 * labeled alternative in {@link ClickHouseParser#columnsExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnsExprAsterisk(ClickHouseParser.ColumnsExprAsteriskContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnsExprAsterisk}
	 * labeled alternative in {@link ClickHouseParser#columnsExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnsExprAsterisk(ClickHouseParser.ColumnsExprAsteriskContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnsExprSubquery}
	 * labeled alternative in {@link ClickHouseParser#columnsExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnsExprSubquery(ClickHouseParser.ColumnsExprSubqueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnsExprSubquery}
	 * labeled alternative in {@link ClickHouseParser#columnsExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnsExprSubquery(ClickHouseParser.ColumnsExprSubqueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnsExprColumn}
	 * labeled alternative in {@link ClickHouseParser#columnsExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnsExprColumn(ClickHouseParser.ColumnsExprColumnContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnsExprColumn}
	 * labeled alternative in {@link ClickHouseParser#columnsExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnsExprColumn(ClickHouseParser.ColumnsExprColumnContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnExprTernaryOp}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnExprTernaryOp(ClickHouseParser.ColumnExprTernaryOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnExprTernaryOp}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnExprTernaryOp(ClickHouseParser.ColumnExprTernaryOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnExprAlias}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnExprAlias(ClickHouseParser.ColumnExprAliasContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnExprAlias}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnExprAlias(ClickHouseParser.ColumnExprAliasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnExprExtract}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnExprExtract(ClickHouseParser.ColumnExprExtractContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnExprExtract}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnExprExtract(ClickHouseParser.ColumnExprExtractContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnExprSubquery}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnExprSubquery(ClickHouseParser.ColumnExprSubqueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnExprSubquery}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnExprSubquery(ClickHouseParser.ColumnExprSubqueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnExprTrim}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnExprTrim(ClickHouseParser.ColumnExprTrimContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnExprTrim}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnExprTrim(ClickHouseParser.ColumnExprTrimContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnExprLiteral}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnExprLiteral(ClickHouseParser.ColumnExprLiteralContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnExprLiteral}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnExprLiteral(ClickHouseParser.ColumnExprLiteralContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnExprArray}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnExprArray(ClickHouseParser.ColumnExprArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnExprArray}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnExprArray(ClickHouseParser.ColumnExprArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnExprTuple}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnExprTuple(ClickHouseParser.ColumnExprTupleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnExprTuple}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnExprTuple(ClickHouseParser.ColumnExprTupleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnExprArrayAccess}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnExprArrayAccess(ClickHouseParser.ColumnExprArrayAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnExprArrayAccess}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnExprArrayAccess(ClickHouseParser.ColumnExprArrayAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnExprBetween}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnExprBetween(ClickHouseParser.ColumnExprBetweenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnExprBetween}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnExprBetween(ClickHouseParser.ColumnExprBetweenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnExprParens}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnExprParens(ClickHouseParser.ColumnExprParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnExprParens}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnExprParens(ClickHouseParser.ColumnExprParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnExprUnaryOp}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnExprUnaryOp(ClickHouseParser.ColumnExprUnaryOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnExprUnaryOp}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnExprUnaryOp(ClickHouseParser.ColumnExprUnaryOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnExprTupleAccess}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnExprTupleAccess(ClickHouseParser.ColumnExprTupleAccessContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnExprTupleAccess}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnExprTupleAccess(ClickHouseParser.ColumnExprTupleAccessContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnExprCase}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnExprCase(ClickHouseParser.ColumnExprCaseContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnExprCase}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnExprCase(ClickHouseParser.ColumnExprCaseContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnExprInterval}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnExprInterval(ClickHouseParser.ColumnExprIntervalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnExprInterval}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnExprInterval(ClickHouseParser.ColumnExprIntervalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnExprIsNull}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnExprIsNull(ClickHouseParser.ColumnExprIsNullContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnExprIsNull}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnExprIsNull(ClickHouseParser.ColumnExprIsNullContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnExprIdentifier}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnExprIdentifier(ClickHouseParser.ColumnExprIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnExprIdentifier}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnExprIdentifier(ClickHouseParser.ColumnExprIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnExprBinaryOp}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnExprBinaryOp(ClickHouseParser.ColumnExprBinaryOpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnExprBinaryOp}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnExprBinaryOp(ClickHouseParser.ColumnExprBinaryOpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnExprAsterisk}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnExprAsterisk(ClickHouseParser.ColumnExprAsteriskContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnExprAsterisk}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnExprAsterisk(ClickHouseParser.ColumnExprAsteriskContext ctx);
	/**
	 * Enter a parse tree produced by the {@code ColumnExprFunction}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnExprFunction(ClickHouseParser.ColumnExprFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code ColumnExprFunction}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnExprFunction(ClickHouseParser.ColumnExprFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#columnParamList}.
	 * @param ctx the parse tree
	 */
	void enterColumnParamList(ClickHouseParser.ColumnParamListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#columnParamList}.
	 * @param ctx the parse tree
	 */
	void exitColumnParamList(ClickHouseParser.ColumnParamListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#columnArgList}.
	 * @param ctx the parse tree
	 */
	void enterColumnArgList(ClickHouseParser.ColumnArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#columnArgList}.
	 * @param ctx the parse tree
	 */
	void exitColumnArgList(ClickHouseParser.ColumnArgListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#columnArgExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnArgExpr(ClickHouseParser.ColumnArgExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#columnArgExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnArgExpr(ClickHouseParser.ColumnArgExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#columnLambdaExpr}.
	 * @param ctx the parse tree
	 */
	void enterColumnLambdaExpr(ClickHouseParser.ColumnLambdaExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#columnLambdaExpr}.
	 * @param ctx the parse tree
	 */
	void exitColumnLambdaExpr(ClickHouseParser.ColumnLambdaExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#columnIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterColumnIdentifier(ClickHouseParser.ColumnIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#columnIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitColumnIdentifier(ClickHouseParser.ColumnIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#commentExpr}.
	 * @param ctx the parse tree
	 */
	void enterCommentExpr(ClickHouseParser.CommentExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#commentExpr}.
	 * @param ctx the parse tree
	 */
	void exitCommentExpr(ClickHouseParser.CommentExprContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TableExprIdentifier}
	 * labeled alternative in {@link ClickHouseParser#tableExpr}.
	 * @param ctx the parse tree
	 */
	void enterTableExprIdentifier(ClickHouseParser.TableExprIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TableExprIdentifier}
	 * labeled alternative in {@link ClickHouseParser#tableExpr}.
	 * @param ctx the parse tree
	 */
	void exitTableExprIdentifier(ClickHouseParser.TableExprIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TableExprSubquery}
	 * labeled alternative in {@link ClickHouseParser#tableExpr}.
	 * @param ctx the parse tree
	 */
	void enterTableExprSubquery(ClickHouseParser.TableExprSubqueryContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TableExprSubquery}
	 * labeled alternative in {@link ClickHouseParser#tableExpr}.
	 * @param ctx the parse tree
	 */
	void exitTableExprSubquery(ClickHouseParser.TableExprSubqueryContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TableExprAlias}
	 * labeled alternative in {@link ClickHouseParser#tableExpr}.
	 * @param ctx the parse tree
	 */
	void enterTableExprAlias(ClickHouseParser.TableExprAliasContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TableExprAlias}
	 * labeled alternative in {@link ClickHouseParser#tableExpr}.
	 * @param ctx the parse tree
	 */
	void exitTableExprAlias(ClickHouseParser.TableExprAliasContext ctx);
	/**
	 * Enter a parse tree produced by the {@code TableExprFunction}
	 * labeled alternative in {@link ClickHouseParser#tableExpr}.
	 * @param ctx the parse tree
	 */
	void enterTableExprFunction(ClickHouseParser.TableExprFunctionContext ctx);
	/**
	 * Exit a parse tree produced by the {@code TableExprFunction}
	 * labeled alternative in {@link ClickHouseParser#tableExpr}.
	 * @param ctx the parse tree
	 */
	void exitTableExprFunction(ClickHouseParser.TableExprFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#tableIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterTableIdentifier(ClickHouseParser.TableIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#tableIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitTableIdentifier(ClickHouseParser.TableIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#tableArgList}.
	 * @param ctx the parse tree
	 */
	void enterTableArgList(ClickHouseParser.TableArgListContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#tableArgList}.
	 * @param ctx the parse tree
	 */
	void exitTableArgList(ClickHouseParser.TableArgListContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#tableArgExpr}.
	 * @param ctx the parse tree
	 */
	void enterTableArgExpr(ClickHouseParser.TableArgExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#tableArgExpr}.
	 * @param ctx the parse tree
	 */
	void exitTableArgExpr(ClickHouseParser.TableArgExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#databaseIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterDatabaseIdentifier(ClickHouseParser.DatabaseIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#databaseIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitDatabaseIdentifier(ClickHouseParser.DatabaseIdentifierContext ctx);
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
	 * Enter a parse tree produced by {@link ClickHouseParser#unaryOp}.
	 * @param ctx the parse tree
	 */
	void enterUnaryOp(ClickHouseParser.UnaryOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#unaryOp}.
	 * @param ctx the parse tree
	 */
	void exitUnaryOp(ClickHouseParser.UnaryOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#binaryOp}.
	 * @param ctx the parse tree
	 */
	void enterBinaryOp(ClickHouseParser.BinaryOpContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#binaryOp}.
	 * @param ctx the parse tree
	 */
	void exitBinaryOp(ClickHouseParser.BinaryOpContext ctx);
	/**
	 * Enter a parse tree produced by {@link ClickHouseParser#enumValue}.
	 * @param ctx the parse tree
	 */
	void enterEnumValue(ClickHouseParser.EnumValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link ClickHouseParser#enumValue}.
	 * @param ctx the parse tree
	 */
	void exitEnumValue(ClickHouseParser.EnumValueContext ctx);
}