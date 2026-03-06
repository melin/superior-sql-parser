package io.github.melin.superior.parser.dameng

import com.github.melin.superior.sql.parser.util.CommonUtils
import io.github.melin.superior.common.SQLParserException
import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.TableType
import io.github.melin.superior.common.antlr4.ParserUtils.source
import io.github.melin.superior.common.relational.DefaultStatement
import io.github.melin.superior.common.relational.Statement
import io.github.melin.superior.common.relational.TableId
import io.github.melin.superior.common.relational.common.CommentStatement
import io.github.melin.superior.common.relational.common.ShowStatement
import io.github.melin.superior.common.relational.create.CreateMaterializedView
import io.github.melin.superior.common.relational.create.CreateTable
import io.github.melin.superior.common.relational.create.CreateView
import io.github.melin.superior.common.relational.dml.*
import io.github.melin.superior.common.relational.drop.DropTable
import io.github.melin.superior.parser.dameng.antlr4.DmSqlParser
import io.github.melin.superior.parser.dameng.antlr4.DmSqlParserBaseVisitor
import org.apache.commons.lang3.StringUtils

/** Created by libinsong on 2018/2/8. */
class DmSqlAntlr4Visitor(val splitSql: Boolean = false, val command: String?) : DmSqlParserBaseVisitor<Statement>() {

    private var currentOptType: StatementType = StatementType.UNKOWN
    private var limit: Int? = null
    private var offset: Int? = null
    private val primaryKeys = ArrayList<String>()

    private var queryStmt: QueryStmt? = null
    private var inputTables: ArrayList<TableId> = arrayListOf()
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
        super.visitSelect_stmt(ctx)
        currentOptType = StatementType.SELECT
//        this.visitWithout_into_select2(ctx?.without_into_select2())
        if (queryStmt == null) {
            queryStmt = QueryStmt(inputTables, limit, offset)
        }
        queryStmt?.setSql(source(ctx))
        return queryStmt
    }

    override fun visitMerge_into_stmt(ctx: DmSqlParser.Merge_into_stmtContext?): Statement {
        super.visitMerge_into_stmt(ctx)
        currentOptType = StatementType.MERGE
        return MergeTable(TableId(""))
    }

    override fun visitInsert_stmt(ctx: DmSqlParser.Insert_stmtContext?): Statement {
        super.visitInsert_stmt(ctx)
        currentOptType = StatementType.INSERT
        return InsertTable(InsertMode.INTO, QueryStmt(), TableId(""))
    }

    override fun visitUpdate_stmt(ctx: DmSqlParser.Update_stmtContext?): Statement {
        super.visitUpdate_stmt(ctx)
        currentOptType = StatementType.UPDATE
        return UpdateTable(TableId(""), inputTables)
    }

    override fun visitDelete_stmt(ctx: DmSqlParser.Delete_stmtContext?): Statement {
        super.visitDelete_stmt(ctx)
        currentOptType = StatementType.DELETE
        return DeleteTable(TableId(""), inputTables)
    }

    override fun visitCreate_table_stmt(ctx: DmSqlParser.Create_table_stmtContext?): Statement {
        super.visitCreate_table_stmt(ctx)
        currentOptType = StatementType.CREATE_TABLE
        return CreateTable(TableId(""), TableType.DAMENG)
    }

    override fun visitCreate_view_stmt(ctx: DmSqlParser.Create_view_stmtContext?): Statement {
        super.visitCreate_view_stmt(ctx)
        currentOptType = StatementType.CREATE_VIEW
        return CreateView(TableId(""), QueryStmt(inputTables, limit, offset))
    }

    override fun visitCreate_materialized_view_stmt(ctx: DmSqlParser.Create_materialized_view_stmtContext?): Statement {
        super.visitCreate_materialized_view_stmt(ctx)
        currentOptType = StatementType.CREATE_MATERIALIZED_VIEW
        return CreateMaterializedView(TableId(""), QueryStmt(inputTables, limit, offset))
    }

    override fun visitComment_stmt(ctx: DmSqlParser.Comment_stmtContext?): Statement {
        super.visitComment_stmt(ctx)
        currentOptType = StatementType.COMMENT
        return CommentStatement()
    }

    override fun visitDrop_stmt(ctx: DmSqlParser.Drop_stmtContext?): Statement {
        super.visitDrop_stmt(ctx)
        val dropDbObject = ctx?.drop_db_object()
        if (dropDbObject?.db_object()?.text.equals("table")) {
            currentOptType = StatementType.DROP_TABLE
        }
        return DropTable(TableId(""), dropDbObject?.exist()?.text == "ifexists")
    }

    override fun visitQualified_name(ctx: DmSqlParser.Qualified_nameContext): Statement? {
        super.visitQualified_name(ctx)
        val tableId = parseTableViewName(ctx)
        if (!inputTables.contains(tableId) && !cteTempTables.contains(tableId)) {
            inputTables.add(tableId)
        }
        return null
    }

    private fun parseTableViewName(ctx: DmSqlParser.Qualified_nameContext): TableId {
        if (ctx.childCount == 1) {
            return TableId(null, null, ctx.getChild(0).text)
        } else if (ctx.childCount == 3) {
            return TableId(null, ctx.getChild(0).text, ctx.getChild(2).text)
        } else {
            throw SQLParserException("not suuport tablename")
        }
    }
}
