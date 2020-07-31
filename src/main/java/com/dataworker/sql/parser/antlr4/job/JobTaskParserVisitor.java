// Generated from com/dataworker/sql/parser/antlr4/job/JobTaskParser.g4 by ANTLR 4.7.1
package com.dataworker.sql.parser.antlr4.job;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link JobTaskParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface JobTaskParserVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link JobTaskParser#root}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoot(JobTaskParser.RootContext ctx);
	/**
	 * Visit a parse tree produced by {@link JobTaskParser#jobTasks}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJobTasks(JobTaskParser.JobTasksContext ctx);
	/**
	 * Visit a parse tree produced by {@link JobTaskParser#jobTask}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJobTask(JobTaskParser.JobTaskContext ctx);
	/**
	 * Visit a parse tree produced by {@link JobTaskParser#jobStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJobStatement(JobTaskParser.JobStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JobTaskParser#resourceNameExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResourceNameExpr(JobTaskParser.ResourceNameExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JobTaskParser#classNameExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClassNameExpr(JobTaskParser.ClassNameExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JobTaskParser#paramsExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamsExpr(JobTaskParser.ParamsExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JobTaskParser#paramExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParamExpr(JobTaskParser.ParamExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JobTaskParser#fileDir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFileDir(JobTaskParser.FileDirContext ctx);
	/**
	 * Visit a parse tree produced by {@link JobTaskParser#setStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetStatement(JobTaskParser.SetStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JobTaskParser#unsetStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnsetStatement(JobTaskParser.UnsetStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link JobTaskParser#keyExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyExpr(JobTaskParser.KeyExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JobTaskParser#valueExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueExpr(JobTaskParser.ValueExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link JobTaskParser#word}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWord(JobTaskParser.WordContext ctx);
	/**
	 * Visit a parse tree produced by {@link JobTaskParser#emptyStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmptyStatement(JobTaskParser.EmptyStatementContext ctx);
}