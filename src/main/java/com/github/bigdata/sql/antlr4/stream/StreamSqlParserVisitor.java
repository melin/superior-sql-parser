// Generated from com/github/bigdata/sql/antlr4/stream/StreamSqlParser.g4 by ANTLR 4.7
package com.github.bigdata.sql.antlr4.stream;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link StreamSqlParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface StreamSqlParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link StreamSqlParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(StreamSqlParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by {@link StreamSqlParser#sqlStatements}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlStatements(StreamSqlParser.SqlStatementsContext ctx);
	/**
	 * Visit a parse tree produced by {@link StreamSqlParser#sqlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSqlStatement(StreamSqlParser.SqlStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StreamSqlParser#createSoureTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateSoureTable(StreamSqlParser.CreateSoureTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link StreamSqlParser#createSinkTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateSinkTable(StreamSqlParser.CreateSinkTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link StreamSqlParser#createView}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateView(StreamSqlParser.CreateViewContext ctx);
	/**
	 * Visit a parse tree produced by {@link StreamSqlParser#createFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateFunction(StreamSqlParser.CreateFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link StreamSqlParser#insertStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertStatement(StreamSqlParser.InsertStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StreamSqlParser#setStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetStatement(StreamSqlParser.SetStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StreamSqlParser#emptyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStatement(StreamSqlParser.EmptyStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link StreamSqlParser#setKeyExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetKeyExpr(StreamSqlParser.SetKeyExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link StreamSqlParser#valueKeyExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueKeyExpr(StreamSqlParser.ValueKeyExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link StreamSqlParser#selectExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectExpr(StreamSqlParser.SelectExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link StreamSqlParser#word}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWord(StreamSqlParser.WordContext ctx);
	/**
	 * Visit a parse tree produced by {@link StreamSqlParser#colTypeList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColTypeList(StreamSqlParser.ColTypeListContext ctx);
	/**
	 * Visit a parse tree produced by {@link StreamSqlParser#colType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColType(StreamSqlParser.ColTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link StreamSqlParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataType(StreamSqlParser.DataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link StreamSqlParser#tablePropertyList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablePropertyList(StreamSqlParser.TablePropertyListContext ctx);
	/**
	 * Visit a parse tree produced by {@link StreamSqlParser#tableProperty}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableProperty(StreamSqlParser.TablePropertyContext ctx);
	/**
	 * Visit a parse tree produced by {@link StreamSqlParser#tablePropertyKey}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablePropertyKey(StreamSqlParser.TablePropertyKeyContext ctx);
	/**
	 * Visit a parse tree produced by {@link StreamSqlParser#tablePropertyValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablePropertyValue(StreamSqlParser.TablePropertyValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link StreamSqlParser#booleanValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanValue(StreamSqlParser.BooleanValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link StreamSqlParser#timeModeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTimeModeExpr(StreamSqlParser.TimeModeExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link StreamSqlParser#attrNameExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttrNameExpr(StreamSqlParser.AttrNameExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link StreamSqlParser#tableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(StreamSqlParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link StreamSqlParser#functionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionName(StreamSqlParser.FunctionNameContext ctx);
}