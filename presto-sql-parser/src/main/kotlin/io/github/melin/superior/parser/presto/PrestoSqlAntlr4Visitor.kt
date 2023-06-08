package io.github.melin.superior.parser.presto

import com.github.melin.superior.sql.parser.util.CommonUtils
import io.github.melin.superior.common.*
import io.github.melin.superior.common.relational.DefaultStatement
import io.github.melin.superior.common.relational.Statement
import io.github.melin.superior.common.relational.TableId
import io.github.melin.superior.common.relational.common.ShowStatement
import io.github.melin.superior.common.relational.dml.QueryStmt
import io.github.melin.superior.common.relational.create.CreateTableAsSelect
import io.github.melin.superior.common.relational.drop.DropTable
import io.github.melin.superior.parser.presto.antlr4.PrestoSqlBaseBaseVisitor
import io.github.melin.superior.parser.presto.antlr4.PrestoSqlBaseParser
import org.antlr.v4.runtime.tree.RuleNode
import org.apache.commons.lang3.StringUtils

/**
 *
 * Created by libinsong on 2018/1/10.
 */
class PrestoSqlAntlr4Visitor(val splitSql: Boolean = false): PrestoSqlBaseBaseVisitor<Statement>() {

    private var currentOptType: StatementType = StatementType.UNKOWN
    private var command: String? = null

    private var limit:Int? = null
    private var offset:Int? = null
    private var inputTables: ArrayList<TableId> = arrayListOf()
    private var cteTempTables: ArrayList<TableId> = arrayListOf()

    private var statements: ArrayList<Statement> = arrayListOf()
    private val sqls: ArrayList<String> = arrayListOf()

    fun getSqlStatements(): List<Statement> {
        return statements
    }

    fun getSplitSqls(): List<String> {
        return sqls
    }

    override fun shouldVisitNextChild(node: RuleNode, currentResult: Statement?): Boolean {
        return if (currentResult == null) true else false
    }

    override fun visitSqlStatements(ctx: PrestoSqlBaseParser.SqlStatementsContext): Statement? {
        ctx.singleStatement().forEach {
            var sql = StringUtils.substring(command, it.start.startIndex, it.stop.stopIndex + 1)
            sql = CommonUtils.cleanLastSemi(sql)
            if (splitSql) {
                sqls.add(sql)
            } else {
                val startNode = it.start.text
                val statement = if (StringUtils.equalsIgnoreCase("show", startNode)) {
                    val keyWords: ArrayList<String> = arrayListOf()
                    CommonUtils.findShowStatementKeyWord(keyWords, it)
                    ShowStatement(*keyWords.toTypedArray())
                } else {
                    var statement = this.visitSingleStatement(it)
                    if (statement == null) {
                        statement = DefaultStatement(StatementType.UNKOWN)
                    }
                    statement
                }

                statement.setSql(sql)
                statements.add(statement)

                clean()
            }
        }
        return null
    }

    private fun clean() {
        currentOptType = StatementType.UNKOWN

        limit = null
        offset = null
        inputTables = arrayListOf()
        cteTempTables = arrayListOf()
    }

    fun setCommand(command: String) {
        this.command = command
    }

    override fun visitStatementDefault(ctx: PrestoSqlBaseParser.StatementDefaultContext): Statement? {
        if (StringUtils.equalsIgnoreCase("select", ctx.start.text)) {
            currentOptType = StatementType.SELECT
            super.visitQuery(ctx.query())

            val limit = ctx.query()?.queryNoWith()?.limit?.text?.toInt()
            return QueryStmt(inputTables, limit)
        } else {
            return null
        }
    }

    override fun visitCreateTableAsSelect(ctx: PrestoSqlBaseParser.CreateTableAsSelectContext): Statement? {
        currentOptType = StatementType.CREATE_TABLE_AS_SELECT
        val tableId = createTableSource(ctx.qualifiedName())
        val createTable = CreateTableAsSelect(tableId)

        var querySql = StringUtils.substring(command, ctx.query().start.startIndex)
        if (StringUtils.startsWith(querySql, "(") && StringUtils.endsWith(querySql, ")")) {
            querySql = StringUtils.substringBetween(querySql, "(", ")")
        }

        createTable.lifeCycle = 7
        createTable.querySql = querySql

        super.visitQuery(ctx.query())

        createTable.inputTables.addAll(inputTables)
        return createTable
    }

    override fun visitDropTable(ctx: PrestoSqlBaseParser.DropTableContext): Statement? {
        val tableId = createTableSource(ctx.qualifiedName())

        val dropTable = DropTable(tableId)
        dropTable.ifExists = ctx.EXISTS() != null
        return dropTable
    }

    override fun visitExplain(ctx: PrestoSqlBaseParser.ExplainContext): Statement? {
        return DefaultStatement(StatementType.EXPLAIN)
    }

    override fun visitQualifiedName(ctx: PrestoSqlBaseParser.QualifiedNameContext): Statement? {
        if (!(ctx.parent is PrestoSqlBaseParser.TableNameContext)) {
            return null
        }

        if (currentOptType == StatementType.SELECT ||
            currentOptType == StatementType.CREATE_TABLE_AS_SELECT) {

            val tableName = createTableSource(ctx)
            inputTables.add(tableName)
        }
        return null
    }

    private fun createTableSource(ctx: PrestoSqlBaseParser.QualifiedNameContext): TableId {
        val list = ctx.identifier()

        var catalogName: String? = null
        var databaseName: String? = null
        val tableName = if (list.size == 1) {
            ctx.text
        } else if (list.size == 2) {
            val index = StringUtils.lastIndexOf(ctx.text, ".")
            databaseName = StringUtils.substring(ctx.text, 0, index)

            StringUtils.substring(ctx.text, index + 1)
        } else {
            val items = StringUtils.split(ctx.text, ".");
            catalogName = items[0];
            databaseName = items[1];
            items[2]
        }

        return TableId(catalogName, databaseName, tableName)
    }
}
