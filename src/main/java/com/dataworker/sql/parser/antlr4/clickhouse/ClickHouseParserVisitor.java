// Generated from com/dataworker/sql/parser/antlr4/clickhouse/ClickHouseParser.g4 by ANTLR 4.7.1
package com.dataworker.sql.parser.antlr4.clickhouse;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link ClickHouseParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface ClickHouseParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#queryList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryList(ClickHouseParser.QueryListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#queryStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryStmt(ClickHouseParser.QueryStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(ClickHouseParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AlterTableStmt}
	 * labeled alternative in {@link ClickHouseParser#alterStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableStmt(ClickHouseParser.AlterTableStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AlterTableAddClause}
	 * labeled alternative in {@link ClickHouseParser#alterTableClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableAddClause(ClickHouseParser.AlterTableAddClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AlterTableDropClause}
	 * labeled alternative in {@link ClickHouseParser#alterTableClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableDropClause(ClickHouseParser.AlterTableDropClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code AlterTableModifyClause}
	 * labeled alternative in {@link ClickHouseParser#alterTableClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterTableModifyClause(ClickHouseParser.AlterTableModifyClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#checkStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckStmt(ClickHouseParser.CheckStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createDatabaseStmt}
	 * labeled alternative in {@link ClickHouseParser#createStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateDatabaseStmt(ClickHouseParser.CreateDatabaseStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code createTableStmt}
	 * labeled alternative in {@link ClickHouseParser#createStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateTableStmt(ClickHouseParser.CreateTableStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SchemaDescriptionClause}
	 * labeled alternative in {@link ClickHouseParser#schemaClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemaDescriptionClause(ClickHouseParser.SchemaDescriptionClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SchemaAsSubqueryClause}
	 * labeled alternative in {@link ClickHouseParser#schemaClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemaAsSubqueryClause(ClickHouseParser.SchemaAsSubqueryClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SchemaAsTableClause}
	 * labeled alternative in {@link ClickHouseParser#schemaClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemaAsTableClause(ClickHouseParser.SchemaAsTableClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code SchemaAsFunctionClause}
	 * labeled alternative in {@link ClickHouseParser#schemaClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemaAsFunctionClause(ClickHouseParser.SchemaAsFunctionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#engineClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEngineClause(ClickHouseParser.EngineClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#partitionByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionByClause(ClickHouseParser.PartitionByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#primaryKeyClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrimaryKeyClause(ClickHouseParser.PrimaryKeyClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#sampleByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSampleByClause(ClickHouseParser.SampleByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#ttlClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTtlClause(ClickHouseParser.TtlClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#engineExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEngineExpr(ClickHouseParser.EngineExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TableElementExprColumn}
	 * labeled alternative in {@link ClickHouseParser#tableElementExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableElementExprColumn(ClickHouseParser.TableElementExprColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#tableColumnDfnt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableColumnDfnt(ClickHouseParser.TableColumnDfntContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#tableColumnPropertyExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableColumnPropertyExpr(ClickHouseParser.TableColumnPropertyExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#ttlExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTtlExpr(ClickHouseParser.TtlExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#describeStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDescribeStmt(ClickHouseParser.DescribeStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DropDatabaseStmt}
	 * labeled alternative in {@link ClickHouseParser#dropStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropDatabaseStmt(ClickHouseParser.DropDatabaseStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DropTableStmt}
	 * labeled alternative in {@link ClickHouseParser#dropStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropTableStmt(ClickHouseParser.DropTableStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#insertStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertStmt(ClickHouseParser.InsertStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#valuesClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValuesClause(ClickHouseParser.ValuesClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#valueTupleExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueTupleExpr(ClickHouseParser.ValueTupleExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#optimizeStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptimizeStmt(ClickHouseParser.OptimizeStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#partitionClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionClause(ClickHouseParser.PartitionClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#selectUnionStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectUnionStmt(ClickHouseParser.SelectUnionStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#selectStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectStmt(ClickHouseParser.SelectStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#withClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithClause(ClickHouseParser.WithClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#fromClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromClause(ClickHouseParser.FromClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#sampleClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSampleClause(ClickHouseParser.SampleClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#arrayJoinClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArrayJoinClause(ClickHouseParser.ArrayJoinClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#prewhereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrewhereClause(ClickHouseParser.PrewhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(ClickHouseParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#groupByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupByClause(ClickHouseParser.GroupByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#havingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHavingClause(ClickHouseParser.HavingClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#orderByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByClause(ClickHouseParser.OrderByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#limitByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitByClause(ClickHouseParser.LimitByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#limitClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitClause(ClickHouseParser.LimitClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#settingsClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSettingsClause(ClickHouseParser.SettingsClauseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JoinExprOp}
	 * labeled alternative in {@link ClickHouseParser#joinExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinExprOp(ClickHouseParser.JoinExprOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JoinExprTable}
	 * labeled alternative in {@link ClickHouseParser#joinExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinExprTable(ClickHouseParser.JoinExprTableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JoinExprParens}
	 * labeled alternative in {@link ClickHouseParser#joinExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinExprParens(ClickHouseParser.JoinExprParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JoinExprCrossOp}
	 * labeled alternative in {@link ClickHouseParser#joinExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinExprCrossOp(ClickHouseParser.JoinExprCrossOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JoinOpInner}
	 * labeled alternative in {@link ClickHouseParser#joinOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinOpInner(ClickHouseParser.JoinOpInnerContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JoinOpLeftRight}
	 * labeled alternative in {@link ClickHouseParser#joinOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinOpLeftRight(ClickHouseParser.JoinOpLeftRightContext ctx);
	/**
	 * Visit a parse tree produced by the {@code JoinOpFull}
	 * labeled alternative in {@link ClickHouseParser#joinOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinOpFull(ClickHouseParser.JoinOpFullContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#joinOpCross}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinOpCross(ClickHouseParser.JoinOpCrossContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#joinConstraintClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinConstraintClause(ClickHouseParser.JoinConstraintClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#limitExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitExpr(ClickHouseParser.LimitExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#orderExprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderExprList(ClickHouseParser.OrderExprListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#orderExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderExpr(ClickHouseParser.OrderExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#ratioExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRatioExpr(ClickHouseParser.RatioExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#settingExprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSettingExprList(ClickHouseParser.SettingExprListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#settingExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSettingExpr(ClickHouseParser.SettingExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#setStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetStmt(ClickHouseParser.SetStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showCreateTableStmt}
	 * labeled alternative in {@link ClickHouseParser#showStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCreateTableStmt(ClickHouseParser.ShowCreateTableStmtContext ctx);
	/**
	 * Visit a parse tree produced by the {@code showTablesStmt}
	 * labeled alternative in {@link ClickHouseParser#showStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowTablesStmt(ClickHouseParser.ShowTablesStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#useStmt}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUseStmt(ClickHouseParser.UseStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#valueExprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueExprList(ClickHouseParser.ValueExprListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValueExprLiteral}
	 * labeled alternative in {@link ClickHouseParser#valueExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueExprLiteral(ClickHouseParser.ValueExprLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValueExprTuple}
	 * labeled alternative in {@link ClickHouseParser#valueExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueExprTuple(ClickHouseParser.ValueExprTupleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ValueExprArray}
	 * labeled alternative in {@link ClickHouseParser#valueExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueExprArray(ClickHouseParser.ValueExprArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColumnTypeExprSimple}
	 * labeled alternative in {@link ClickHouseParser#columnTypeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnTypeExprSimple(ClickHouseParser.ColumnTypeExprSimpleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColumnTypeExprParam}
	 * labeled alternative in {@link ClickHouseParser#columnTypeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnTypeExprParam(ClickHouseParser.ColumnTypeExprParamContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColumnTypeExprEnum}
	 * labeled alternative in {@link ClickHouseParser#columnTypeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnTypeExprEnum(ClickHouseParser.ColumnTypeExprEnumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColumnTypeExprComplex}
	 * labeled alternative in {@link ClickHouseParser#columnTypeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnTypeExprComplex(ClickHouseParser.ColumnTypeExprComplexContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColumnTypeExprNested}
	 * labeled alternative in {@link ClickHouseParser#columnTypeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnTypeExprNested(ClickHouseParser.ColumnTypeExprNestedContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#columnExprList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnExprList(ClickHouseParser.ColumnExprListContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColumnsExprAsterisk}
	 * labeled alternative in {@link ClickHouseParser#columnsExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnsExprAsterisk(ClickHouseParser.ColumnsExprAsteriskContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColumnsExprSubquery}
	 * labeled alternative in {@link ClickHouseParser#columnsExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnsExprSubquery(ClickHouseParser.ColumnsExprSubqueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColumnsExprColumn}
	 * labeled alternative in {@link ClickHouseParser#columnsExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnsExprColumn(ClickHouseParser.ColumnsExprColumnContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColumnExprTernaryOp}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnExprTernaryOp(ClickHouseParser.ColumnExprTernaryOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColumnExprAlias}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnExprAlias(ClickHouseParser.ColumnExprAliasContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColumnExprExtract}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnExprExtract(ClickHouseParser.ColumnExprExtractContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColumnExprSubquery}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnExprSubquery(ClickHouseParser.ColumnExprSubqueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColumnExprTrim}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnExprTrim(ClickHouseParser.ColumnExprTrimContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColumnExprLiteral}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnExprLiteral(ClickHouseParser.ColumnExprLiteralContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColumnExprArray}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnExprArray(ClickHouseParser.ColumnExprArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColumnExprTuple}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnExprTuple(ClickHouseParser.ColumnExprTupleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColumnExprArrayAccess}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnExprArrayAccess(ClickHouseParser.ColumnExprArrayAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColumnExprBetween}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnExprBetween(ClickHouseParser.ColumnExprBetweenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColumnExprParens}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnExprParens(ClickHouseParser.ColumnExprParensContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColumnExprUnaryOp}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnExprUnaryOp(ClickHouseParser.ColumnExprUnaryOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColumnExprTupleAccess}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnExprTupleAccess(ClickHouseParser.ColumnExprTupleAccessContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColumnExprCase}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnExprCase(ClickHouseParser.ColumnExprCaseContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColumnExprInterval}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnExprInterval(ClickHouseParser.ColumnExprIntervalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColumnExprIsNull}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnExprIsNull(ClickHouseParser.ColumnExprIsNullContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColumnExprIdentifier}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnExprIdentifier(ClickHouseParser.ColumnExprIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColumnExprBinaryOp}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnExprBinaryOp(ClickHouseParser.ColumnExprBinaryOpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColumnExprAsterisk}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnExprAsterisk(ClickHouseParser.ColumnExprAsteriskContext ctx);
	/**
	 * Visit a parse tree produced by the {@code ColumnExprFunction}
	 * labeled alternative in {@link ClickHouseParser#columnExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnExprFunction(ClickHouseParser.ColumnExprFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#columnParamList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnParamList(ClickHouseParser.ColumnParamListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#columnArgList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnArgList(ClickHouseParser.ColumnArgListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#columnArgExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnArgExpr(ClickHouseParser.ColumnArgExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#columnLambdaExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnLambdaExpr(ClickHouseParser.ColumnLambdaExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#columnIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnIdentifier(ClickHouseParser.ColumnIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#commentExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCommentExpr(ClickHouseParser.CommentExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TableExprIdentifier}
	 * labeled alternative in {@link ClickHouseParser#tableExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableExprIdentifier(ClickHouseParser.TableExprIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TableExprSubquery}
	 * labeled alternative in {@link ClickHouseParser#tableExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableExprSubquery(ClickHouseParser.TableExprSubqueryContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TableExprAlias}
	 * labeled alternative in {@link ClickHouseParser#tableExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableExprAlias(ClickHouseParser.TableExprAliasContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TableExprFunction}
	 * labeled alternative in {@link ClickHouseParser#tableExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableExprFunction(ClickHouseParser.TableExprFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#tableIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableIdentifier(ClickHouseParser.TableIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#tableArgList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableArgList(ClickHouseParser.TableArgListContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#tableArgExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableArgExpr(ClickHouseParser.TableArgExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#databaseIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatabaseIdentifier(ClickHouseParser.DatabaseIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#literal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiteral(ClickHouseParser.LiteralContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(ClickHouseParser.KeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(ClickHouseParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#unaryOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnaryOp(ClickHouseParser.UnaryOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#binaryOp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryOp(ClickHouseParser.BinaryOpContext ctx);
	/**
	 * Visit a parse tree produced by {@link ClickHouseParser#enumValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEnumValue(ClickHouseParser.EnumValueContext ctx);
}