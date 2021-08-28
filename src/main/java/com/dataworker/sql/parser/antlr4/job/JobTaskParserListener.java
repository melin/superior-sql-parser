// Generated from com/dataworker/sql/parser/antlr4/job/JobTaskParser.g4 by ANTLR 4.8
package com.dataworker.sql.parser.antlr4.job;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link JobTaskParser}.
 */
public interface JobTaskParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link JobTaskParser#root}.
	 * @param ctx the parse tree
	 */
	void enterRoot(JobTaskParser.RootContext ctx);
	/**
	 * Exit a parse tree produced by {@link JobTaskParser#root}.
	 * @param ctx the parse tree
	 */
	void exitRoot(JobTaskParser.RootContext ctx);
	/**
	 * Enter a parse tree produced by {@link JobTaskParser#jobTasks}.
	 * @param ctx the parse tree
	 */
	void enterJobTasks(JobTaskParser.JobTasksContext ctx);
	/**
	 * Exit a parse tree produced by {@link JobTaskParser#jobTasks}.
	 * @param ctx the parse tree
	 */
	void exitJobTasks(JobTaskParser.JobTasksContext ctx);
	/**
	 * Enter a parse tree produced by {@link JobTaskParser#jobTask}.
	 * @param ctx the parse tree
	 */
	void enterJobTask(JobTaskParser.JobTaskContext ctx);
	/**
	 * Exit a parse tree produced by {@link JobTaskParser#jobTask}.
	 * @param ctx the parse tree
	 */
	void exitJobTask(JobTaskParser.JobTaskContext ctx);
	/**
	 * Enter a parse tree produced by {@link JobTaskParser#jobStatement}.
	 * @param ctx the parse tree
	 */
	void enterJobStatement(JobTaskParser.JobStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JobTaskParser#jobStatement}.
	 * @param ctx the parse tree
	 */
	void exitJobStatement(JobTaskParser.JobStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JobTaskParser#resourceNameExpr}.
	 * @param ctx the parse tree
	 */
	void enterResourceNameExpr(JobTaskParser.ResourceNameExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JobTaskParser#resourceNameExpr}.
	 * @param ctx the parse tree
	 */
	void exitResourceNameExpr(JobTaskParser.ResourceNameExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JobTaskParser#classNameExpr}.
	 * @param ctx the parse tree
	 */
	void enterClassNameExpr(JobTaskParser.ClassNameExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JobTaskParser#classNameExpr}.
	 * @param ctx the parse tree
	 */
	void exitClassNameExpr(JobTaskParser.ClassNameExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JobTaskParser#paramsExpr}.
	 * @param ctx the parse tree
	 */
	void enterParamsExpr(JobTaskParser.ParamsExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JobTaskParser#paramsExpr}.
	 * @param ctx the parse tree
	 */
	void exitParamsExpr(JobTaskParser.ParamsExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JobTaskParser#paramExpr}.
	 * @param ctx the parse tree
	 */
	void enterParamExpr(JobTaskParser.ParamExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JobTaskParser#paramExpr}.
	 * @param ctx the parse tree
	 */
	void exitParamExpr(JobTaskParser.ParamExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JobTaskParser#fileDir}.
	 * @param ctx the parse tree
	 */
	void enterFileDir(JobTaskParser.FileDirContext ctx);
	/**
	 * Exit a parse tree produced by {@link JobTaskParser#fileDir}.
	 * @param ctx the parse tree
	 */
	void exitFileDir(JobTaskParser.FileDirContext ctx);
	/**
	 * Enter a parse tree produced by {@link JobTaskParser#setStatement}.
	 * @param ctx the parse tree
	 */
	void enterSetStatement(JobTaskParser.SetStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JobTaskParser#setStatement}.
	 * @param ctx the parse tree
	 */
	void exitSetStatement(JobTaskParser.SetStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JobTaskParser#unsetStatement}.
	 * @param ctx the parse tree
	 */
	void enterUnsetStatement(JobTaskParser.UnsetStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JobTaskParser#unsetStatement}.
	 * @param ctx the parse tree
	 */
	void exitUnsetStatement(JobTaskParser.UnsetStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link JobTaskParser#keyExpr}.
	 * @param ctx the parse tree
	 */
	void enterKeyExpr(JobTaskParser.KeyExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JobTaskParser#keyExpr}.
	 * @param ctx the parse tree
	 */
	void exitKeyExpr(JobTaskParser.KeyExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JobTaskParser#valueExpr}.
	 * @param ctx the parse tree
	 */
	void enterValueExpr(JobTaskParser.ValueExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link JobTaskParser#valueExpr}.
	 * @param ctx the parse tree
	 */
	void exitValueExpr(JobTaskParser.ValueExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link JobTaskParser#word}.
	 * @param ctx the parse tree
	 */
	void enterWord(JobTaskParser.WordContext ctx);
	/**
	 * Exit a parse tree produced by {@link JobTaskParser#word}.
	 * @param ctx the parse tree
	 */
	void exitWord(JobTaskParser.WordContext ctx);
	/**
	 * Enter a parse tree produced by {@link JobTaskParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement(JobTaskParser.EmptyStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link JobTaskParser#emptyStatement}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement(JobTaskParser.EmptyStatementContext ctx);
}