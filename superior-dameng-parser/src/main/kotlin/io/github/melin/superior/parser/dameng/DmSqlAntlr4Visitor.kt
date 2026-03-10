package io.github.melin.superior.parser.dameng

import com.github.melin.superior.sql.parser.util.CommonUtils
import io.github.melin.superior.common.SQLParserException
import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.TableType
import io.github.melin.superior.common.antlr4.ParserUtils.source
import io.github.melin.superior.common.relational.DefaultStatement
import io.github.melin.superior.common.relational.Statement
import io.github.melin.superior.common.relational.TableId
import io.github.melin.superior.common.relational.alter.AlterTable
import io.github.melin.superior.common.relational.common.CommentStatement
import io.github.melin.superior.common.relational.common.ShowStatement
import io.github.melin.superior.common.relational.create.CreateMaterializedView
import io.github.melin.superior.common.relational.create.CreateTable
import io.github.melin.superior.common.relational.create.CreateView
import io.github.melin.superior.common.relational.dml.*
import io.github.melin.superior.common.relational.drop.DropTable
import io.github.melin.superior.parser.dameng.antlr4.DmSqlParser
import io.github.melin.superior.parser.dameng.antlr4.DmSqlParserBaseVisitor
import org.antlr.v4.runtime.ParserRuleContext
import org.apache.commons.lang3.StringUtils

/** Created by libinsong on 2018/2/8. */
class DmSqlAntlr4Visitor(val splitSql: Boolean = false, val command: String?) : DmSqlParserBaseVisitor<Statement>() {

    private var rootTableId: TableId = TableId("")
    private var currentOptType: StatementType = StatementType.UNKOWN
    private var limit: Int? = null
    private var offset: Int? = null
    private val primaryKeys = ArrayList<String>()

    private var queryStmt: QueryStmt? = null
    private var inputTables: ArrayList<TableId> = arrayListOf()
    private var outputTables: ArrayList<TableId> = arrayListOf()
    private var cteTempTables: ArrayList<TableId> = arrayListOf()

    // 多语句解析结果
    private var statements: ArrayList<Statement> = arrayListOf()
    // 存储过程和函数中包含的子语句
    private var childStatements: ArrayList<Statement> = arrayListOf()
    private val sqls: ArrayList<String> = arrayListOf()

    fun getSqlStatements(): List<Statement> {
        return statements
    }

    fun getSplitSqls(): List<String> {
        return sqls
    }

    override fun visitDmprogram(ctx: DmSqlParser.DmprogramContext): Statement? {
        ctx.sql_clauses().forEach {
            var sql = source(it)
            if (splitSql) {
                if (StringUtils.endsWith(sql, ";")) {
                    sql = StringUtils.substringBeforeLast(sql, ";")
                }
                sqls.add(sql)
            } else {
                val startNode = it.start.text
                val statement =
                    if (StringUtils.equalsIgnoreCase("show", startNode)) {
                        val keyWords: ArrayList<String> = arrayListOf()
                        CommonUtils.findShowStatementKeyWord(keyWords, it)
                        ShowStatement(*keyWords.toTypedArray())
                    } else {
                        var statement = this.visitSql_clauses(it)
                        if (statement == null) {
                            statement = DefaultStatement(StatementType.UNKOWN)
                        }
                        statement
                    }

                statement.setSql(sql)
                statements.add(statement)
                currentOptType = StatementType.UNKOWN
            }
        }

        return null
    }

    override fun visitSelect_stmt(ctx: DmSqlParser.Select_stmtContext?): Statement? {
        currentOptType = StatementType.SELECT
        super.visitSelect_stmt(ctx)
        return queryStmt
    }

    override fun visitQuery_exp(ctx: DmSqlParser.Query_expContext?): Statement? {
        super.visitQuery_exp(ctx)
        queryStmt = QueryStmt(inputTables, limit, offset)
        val sql = source(ctx)
        queryStmt?.setSql(sql)
        return queryStmt
    }

    override fun visitMerge_into_stmt(ctx: DmSqlParser.Merge_into_stmtContext?): Statement {
        currentOptType = StatementType.MERGE
        super.visitMerge_into_stmt(ctx)
        return MergeTable(rootTableId, inputTables)
    }

    override fun visitInsert_stmt(ctx: DmSqlParser.Insert_stmtContext?): Statement {
        currentOptType = StatementType.INSERT
        super.visitInsert_stmt(ctx)
        var curQueryStmt: QueryStmt = QueryStmt()
        if (queryStmt != null) {
            curQueryStmt = queryStmt as QueryStmt
        }
        val retObj = InsertTable(InsertMode.INTO, curQueryStmt, rootTableId)
        retObj.outputTables.clear()
        retObj.outputTables.addAll(outputTables)
        return retObj
    }

    override fun visitUpdate_stmt(ctx: DmSqlParser.Update_stmtContext?): Statement {
        currentOptType = StatementType.UPDATE
        super.visitUpdate_stmt(ctx)
        return UpdateTable(rootTableId, inputTables)
    }

    override fun visitDelete_stmt(ctx: DmSqlParser.Delete_stmtContext?): Statement {
        currentOptType = StatementType.DELETE
        super.visitDelete_stmt(ctx)
        return DeleteTable(rootTableId, inputTables)
    }

    override fun visitCreate_table_stmt(ctx: DmSqlParser.Create_table_stmtContext?): Statement {
        currentOptType = StatementType.CREATE_TABLE
        super.visitCreate_table_stmt(ctx)
        return CreateTable(rootTableId, TableType.DAMENG)
    }

    override fun visitCreate_view_stmt(ctx: DmSqlParser.Create_view_stmtContext?): Statement {
        currentOptType = StatementType.CREATE_VIEW
        super.visitCreate_view_stmt(ctx)
        return CreateView(rootTableId, QueryStmt(inputTables, limit, offset))
    }

    override fun visitCreate_materialized_view_stmt(ctx: DmSqlParser.Create_materialized_view_stmtContext?): Statement {
        currentOptType = StatementType.CREATE_MATERIALIZED_VIEW
        super.visitCreate_materialized_view_stmt(ctx)
        return CreateMaterializedView(rootTableId, QueryStmt(inputTables, limit, offset))
    }

    override fun visitFull_view_name2(ctx: DmSqlParser.Full_view_name2Context?): Statement? {
        if (currentOptType == StatementType.CREATE_VIEW
            || currentOptType == StatementType.CREATE_MATERIALIZED_VIEW) {
            if (ctx?.qualified_name2() != null) {
                rootTableId = parseTableViewName(ctx.qualified_name2())
            }
        }
        return super.visitFull_view_name2(ctx)
    }

    override fun visitComment_stmt(ctx: DmSqlParser.Comment_stmtContext): Statement {
        super.visitComment_stmt(ctx)
        var objValue: String? = null
        val isNull = false
        var objType: String = ""
        val text: String = CommonUtils.cleanQuote(ctx.LT_STRING().text)
        val fullTableName = ctx.full_table_name()
        val fullColumnName = ctx.full_column_name()
        val fullViewName = ctx.full_view_name()
        if (fullTableName != null) {
            objType = "TABLE"
            objValue = fullTableName.qualified_name().text
        } else if(fullColumnName != null) {
            objType = "COLUMN"
            objValue = fullColumnName.qualified_name().text
        } else if(fullViewName != null) {
            objType = "VIEW"
            objValue = fullViewName.qualified_name().text
        }
        currentOptType = StatementType.COMMENT
        return CommentStatement(text, isNull, objType, objValue)
    }

    override fun visitDrop_stmt(ctx: DmSqlParser.Drop_stmtContext?): Statement? {
        super.visitDrop_stmt(ctx)
        val dropDbObject = ctx?.drop_db_object()
        if (dropDbObject?.db_object()?.text.equals("table")) {
            currentOptType = StatementType.DROP_TABLE
            val dropStmtBody = ctx?.drop_stmt_body_1()
            if (dropStmtBody?.full_object_name() != null) {
                rootTableId = parseTableViewName(dropStmtBody.full_object_name().qualified_name())
            } else if(dropStmtBody?.full_table_name() != null) {
                rootTableId = parseTableViewName(dropStmtBody.full_table_name().qualified_name())
            }
            val dropTable = DropTable(rootTableId, dropDbObject?.exist()?.text == "ifexists")
            if (dropStmtBody?.purge_option() != null) {
                dropTable.purge = true
            }
            return dropTable
        }
        return null
    }

    override fun visitAlter_table_stmt(ctx: DmSqlParser.Alter_table_stmtContext): Statement {
        currentOptType = StatementType.ALTER_TABLE
        super.visitAlter_table_stmt(ctx)
        rootTableId = parseTableViewName(ctx.full_table_name().qualified_name())
        return AlterTable(rootTableId)
    }

    override fun visitFull_tv_name(ctx: DmSqlParser.Full_tv_nameContext): Statement? {
        super.visitFull_tv_name(ctx)
        val tableId = parseTableViewName(ctx.qualified_name())
        val parentLv2 = ctx.parent?.parent
        val parentLv5 = parentLv2?.parent?.parent?.parent
        val parentLv6 = parentLv5?.parent
        if (parentLv6 is DmSqlParser.Update_stmt_bodyContext
            || parentLv5 is DmSqlParser.Delete_stmtContext
            || parentLv2 is DmSqlParser.Insert_stmtContext
            || parentLv5 is DmSqlParser.Insert_stmtContext
            || parentLv5 is DmSqlParser.Insert_stmt_bodyContext
            || parentLv5 is DmSqlParser.Multi_insert_stmt_bodyContext
            || parentLv2 is DmSqlParser.Merge_into_stmtContext) {
            if (rootTableId.tableName == "") {
                tableId.also { rootTableId = it }
            }
            addOutputTableId(tableId)
        } else {
            if (!inputTables.contains(tableId) && !cteTempTables.contains(tableId)) {
                inputTables.add(tableId)
            }
        }
        return null
    }

    override fun visitFull_table_name(ctx: DmSqlParser.Full_table_nameContext?): Statement? {
        if (ctx?.qualified_name() != null) {
            rootTableId = parseTableViewName(ctx.qualified_name())
        }
        return super.visitFull_table_name(ctx)
    }

    private fun parseTableViewName(ctx: ParserRuleContext): TableId {
        if (ctx.childCount == 1) {
            return TableId(null, null, CommonUtils.cleanQuote(ctx.getChild(0).text))
        } else if (ctx.childCount == 3) {
            return TableId(null, CommonUtils.cleanQuote(ctx.getChild(0).text), CommonUtils.cleanQuote(ctx.getChild(2).text))
        } else {
            throw SQLParserException("not suuport tablename")
        }
    }

    private fun addOutputTableId(tableId: TableId) {
        if (!outputTables.contains(tableId)) {
            outputTables.add(tableId)
        }
    }
}
