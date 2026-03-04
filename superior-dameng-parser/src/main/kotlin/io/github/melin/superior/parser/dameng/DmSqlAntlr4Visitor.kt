package io.github.melin.superior.parser.dameng

import com.github.melin.superior.sql.parser.util.CommonUtils
import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.TableType
import io.github.melin.superior.common.antlr4.ParserUtils.source
import io.github.melin.superior.common.relational.DefaultStatement
import io.github.melin.superior.common.relational.Statement
import io.github.melin.superior.common.relational.TableId
import io.github.melin.superior.common.relational.common.ShowStatement
import io.github.melin.superior.common.relational.create.CreateTable
import io.github.melin.superior.common.relational.dml.*
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
        currentOptType = StatementType.SELECT
        if (queryStmt == null) {
            queryStmt = QueryStmt(inputTables, limit, offset)
        }
        queryStmt?.setSql(source(ctx))
        return queryStmt
    }

    override fun visitMerge_into_stmt(ctx: DmSqlParser.Merge_into_stmtContext?): Statement? {
        currentOptType = StatementType.MERGE
        return MergeTable(TableId(""))
    }

    override fun visitInsert_stmt(ctx: DmSqlParser.Insert_stmtContext?): Statement? {
        currentOptType = StatementType.INSERT
        return InsertTable(InsertMode.INTO, QueryStmt(), TableId(""))
    }

    override fun visitUpdate_stmt(ctx: DmSqlParser.Update_stmtContext?): Statement? {
        currentOptType = StatementType.UPDATE
        return UpdateTable(TableId(""), inputTables)
    }

    override fun visitDelete_stmt(ctx: DmSqlParser.Delete_stmtContext?): Statement? {
        currentOptType = StatementType.DELETE
        return DeleteTable(TableId(""), inputTables)
    }

    override fun visitCreate_table_stmt(ctx: DmSqlParser.Create_table_stmtContext?): Statement? {
        currentOptType = StatementType.CREATE_TABLE
        return CreateTable(TableId(""), TableType.DAMENG)
    }
}
