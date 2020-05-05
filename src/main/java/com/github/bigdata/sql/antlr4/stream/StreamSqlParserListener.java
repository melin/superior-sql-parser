// Generated from com/github/bigdata/sql/antlr4/stream/StreamSqlParser.g4 by ANTLR 4.7
package com.github.bigdata.sql.antlr4.stream;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link StreamSqlParser}.
 */
public interface StreamSqlParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link StreamSqlParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(StreamSqlParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link StreamSqlParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(StreamSqlParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link StreamSqlParser#sqlStatements}.
	 * @param ctx the parse tree
	 */
	void enterSqlStatements(StreamSqlParser.SqlStatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link StreamSqlParser#sqlStatements}.
	 * @param ctx the parse tree
	 */
	void exitSqlStatements(StreamSqlParser.SqlStatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link StreamSqlParser#sqlStatement}.
	 * @param ctx the parse tree
	 */
	void enterSqlStatement(StreamSqlParser.SqlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link StreamSqlParser#sqlStatement}.
	 * @param ctx the parse tree
	 */
	void exitSqlStatement(StreamSqlParser.SqlStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link StreamSqlParser#createSoureTable}.
	 * @param ctx the parse tree
	 */
	void enterCreateSoureTable(StreamSqlParser.CreateSoureTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link StreamSqlParser#createSoureTable}.
	 * @param ctx the parse tree
	 */
	void exitCreateSoureTable(StreamSqlParser.CreateSoureTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link StreamSqlParser#createSinkTable}.
	 * @param ctx the parse tree
	 */
	void enterCreateSinkTable(StreamSqlParser.CreateSinkTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link StreamSqlParser#createSinkTable}.
	 * @param ctx the parse tree
	 */
	void exitCreateSinkTable(StreamSqlParser.CreateSinkTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link StreamSqlParser#createSideTable}.
	 * @param ctx the parse tree
	 */
	void enterCreateSideTable(StreamSqlParser.CreateSideTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link StreamSqlParser#createSideTable}.
	 * @param ctx the parse tree
	 */
	void exitCreateSideTable(StreamSqlParser.CreateSideTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link StreamSqlParser#createView}.
	 * @param ctx the parse tree
	 */
	void enterCreateView(StreamSqlParser.CreateViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link StreamSqlParser#createView}.
	 * @param ctx the parse tree
	 */
	void exitCreateView(StreamSqlParser.CreateViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link StreamSqlParser#createFunction}.
	 * @param ctx the parse tree
	 */
	void enterCreateFunction(StreamSqlParser.CreateFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link StreamSqlParser#createFunction}.
	 * @param ctx the parse tree
	 */
	void exitCreateFunction(StreamSqlParser.CreateFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link StreamSqlParser#insertStatement}.
	 * @param ctx the parse tree
	 */
	void enterInsertStatement(StreamSqlParser.InsertStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link StreamSqlParser#insertStatement}.
	 * @param ctx the parse tree
	 */
	void exitInsertStatement(StreamSqlParser.InsertStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link StreamSqlParser#setStatement}.
	 * @param ctx the parse tree
	 */
	void enterSetStatement(StreamSqlParser.SetStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link StreamSqlParser#setStatement}.
	 * @param ctx the parse tree
	 */
	void exitSetStatement(StreamSqlParser.SetStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link StreamSqlParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(StreamSqlParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link StreamSqlParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(StreamSqlParser.EmptyStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link StreamSqlParser#setKeyExpr}.
	 * @param ctx the parse tree
	 */
	void enterSetKeyExpr(StreamSqlParser.SetKeyExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link StreamSqlParser#setKeyExpr}.
	 * @param ctx the parse tree
	 */
	void exitSetKeyExpr(StreamSqlParser.SetKeyExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link StreamSqlParser#valueKeyExpr}.
	 * @param ctx the parse tree
	 */
	void enterValueKeyExpr(StreamSqlParser.ValueKeyExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link StreamSqlParser#valueKeyExpr}.
	 * @param ctx the parse tree
	 */
	void exitValueKeyExpr(StreamSqlParser.ValueKeyExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link StreamSqlParser#selectExpr}.
	 * @param ctx the parse tree
	 */
	void enterSelectExpr(StreamSqlParser.SelectExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link StreamSqlParser#selectExpr}.
	 * @param ctx the parse tree
	 */
	void exitSelectExpr(StreamSqlParser.SelectExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link StreamSqlParser#word}.
	 * @param ctx the parse tree
	 */
	void enterWord(StreamSqlParser.WordContext ctx);
	/**
	 * Exit a parse tree produced by {@link StreamSqlParser#word}.
	 * @param ctx the parse tree
	 */
	void exitWord(StreamSqlParser.WordContext ctx);
	/**
	 * Enter a parse tree produced by {@link StreamSqlParser#colTypeList}.
	 * @param ctx the parse tree
	 */
	void enterColTypeList(StreamSqlParser.ColTypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link StreamSqlParser#colTypeList}.
	 * @param ctx the parse tree
	 */
	void exitColTypeList(StreamSqlParser.ColTypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link StreamSqlParser#colType}.
	 * @param ctx the parse tree
	 */
	void enterColType(StreamSqlParser.ColTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link StreamSqlParser#colType}.
	 * @param ctx the parse tree
	 */
	void exitColType(StreamSqlParser.ColTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link StreamSqlParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(StreamSqlParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link StreamSqlParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(StreamSqlParser.DataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link StreamSqlParser#tableNameList}.
	 * @param ctx the parse tree
	 */
	void enterTableNameList(StreamSqlParser.TableNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link StreamSqlParser#tableNameList}.
	 * @param ctx the parse tree
	 */
	void exitTableNameList(StreamSqlParser.TableNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link StreamSqlParser#tablePropertyList}.
	 * @param ctx the parse tree
	 */
	void enterTablePropertyList(StreamSqlParser.TablePropertyListContext ctx);
	/**
	 * Exit a parse tree produced by {@link StreamSqlParser#tablePropertyList}.
	 * @param ctx the parse tree
	 */
	void exitTablePropertyList(StreamSqlParser.TablePropertyListContext ctx);
	/**
	 * Enter a parse tree produced by {@link StreamSqlParser#tableProperty}.
	 * @param ctx the parse tree
	 */
	void enterTableProperty(StreamSqlParser.TablePropertyContext ctx);
	/**
	 * Exit a parse tree produced by {@link StreamSqlParser#tableProperty}.
	 * @param ctx the parse tree
	 */
	void exitTableProperty(StreamSqlParser.TablePropertyContext ctx);
	/**
	 * Enter a parse tree produced by {@link StreamSqlParser#tablePropertyKey}.
	 * @param ctx the parse tree
	 */
	void enterTablePropertyKey(StreamSqlParser.TablePropertyKeyContext ctx);
	/**
	 * Exit a parse tree produced by {@link StreamSqlParser#tablePropertyKey}.
	 * @param ctx the parse tree
	 */
	void exitTablePropertyKey(StreamSqlParser.TablePropertyKeyContext ctx);
	/**
	 * Enter a parse tree produced by {@link StreamSqlParser#tablePropertyValue}.
	 * @param ctx the parse tree
	 */
	void enterTablePropertyValue(StreamSqlParser.TablePropertyValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link StreamSqlParser#tablePropertyValue}.
	 * @param ctx the parse tree
	 */
	void exitTablePropertyValue(StreamSqlParser.TablePropertyValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link StreamSqlParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void enterBooleanValue(StreamSqlParser.BooleanValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link StreamSqlParser#booleanValue}.
	 * @param ctx the parse tree
	 */
	void exitBooleanValue(StreamSqlParser.BooleanValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link StreamSqlParser#timeModeExpr}.
	 * @param ctx the parse tree
	 */
	void enterTimeModeExpr(StreamSqlParser.TimeModeExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link StreamSqlParser#timeModeExpr}.
	 * @param ctx the parse tree
	 */
	void exitTimeModeExpr(StreamSqlParser.TimeModeExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link StreamSqlParser#attrNameExpr}.
	 * @param ctx the parse tree
	 */
	void enterAttrNameExpr(StreamSqlParser.AttrNameExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link StreamSqlParser#attrNameExpr}.
	 * @param ctx the parse tree
	 */
	void exitAttrNameExpr(StreamSqlParser.AttrNameExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link StreamSqlParser#tableName}.
	 * @param ctx the parse tree
	 */
	void enterTableName(StreamSqlParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link StreamSqlParser#tableName}.
	 * @param ctx the parse tree
	 */
	void exitTableName(StreamSqlParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link StreamSqlParser#functionName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionName(StreamSqlParser.FunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link StreamSqlParser#functionName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionName(StreamSqlParser.FunctionNameContext ctx);
}