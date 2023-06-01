package io.github.melin.superior.parser.trino

import io.github.melin.superior.common.*
import io.github.melin.superior.common.relational.DefaultStatement
import io.github.melin.superior.common.relational.Statement
import io.github.melin.superior.common.relational.TableId
import io.github.melin.superior.common.relational.dml.QueryStmt
import io.github.melin.superior.common.relational.create.CreateTableAsSelect
import io.github.melin.superior.common.relational.drop.DropTable
import io.github.melin.superior.parser.trino.antlr4.TrinoSqlBaseBaseVisitor
import io.github.melin.superior.parser.trino.antlr4.TrinoSqlBaseParser
import org.antlr.v4.runtime.tree.RuleNode
import org.apache.commons.lang3.StringUtils

/**
 *
 * Created by libinsong on 2018/1/10.
 */
class TrinoSqlAntlr4Visitor : TrinoSqlBaseBaseVisitor<Statement>() {

    private var currentOptType: StatementType = StatementType.UNKOWN
    private var command: String? = null

    private var limit:Int? = null
    private var offset:Int? = null
    private var inputTables: ArrayList<TableId> = arrayListOf()
    private var cteTempTables: ArrayList<TableId> = arrayListOf()

    fun setCommand(command: String) {
        this.command = command
    }

    private var statements: ArrayList<Statement> = arrayListOf()

    fun getSqlStatements(): List<Statement> {
        return statements
    }

    override fun shouldVisitNextChild(node: RuleNode, currentResult: Statement?): Boolean {
        return if (currentResult == null) true else false
    }

    override fun visitSqlStatements(ctx: TrinoSqlBaseParser.SqlStatementsContext): Statement? {
        ctx.singleStatement().forEach {
            statements.add(this.visitSingleStatement(it))
            clean()
        }
        return null
    }

    private fun clean() {
        currentOptType = StatementType.UNKOWN

        limit = null
        offset = null
        inputTables = arrayListOf()
        cteTempTables = arrayListOf()

        command = null
    }

    override fun visitStatementDefault(ctx: TrinoSqlBaseParser.StatementDefaultContext): Statement? {
        if (StringUtils.equalsIgnoreCase("select", ctx.start.text)) {
            currentOptType = StatementType.SELECT
            super.visitQuery(ctx.query())

            val limit = ctx.query()?.queryNoWith()?.limit?.text?.toInt()
            return QueryStmt(inputTables, limit)
        } else {
            return null
        }
    }

    override fun visitCreateTableAsSelect(ctx: TrinoSqlBaseParser.CreateTableAsSelectContext): Statement? {
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

    override fun visitDropTable(ctx: TrinoSqlBaseParser.DropTableContext): Statement? {
        val tableId = createTableSource(ctx.qualifiedName())

        val dropTable = DropTable(tableId)
        dropTable.ifExists = ctx.EXISTS() != null
        return dropTable
    }

    override fun visitExplain(ctx: TrinoSqlBaseParser.ExplainContext): Statement? {
        return DefaultStatement(StatementType.EXPLAIN)
    }

    override fun visitQualifiedName(ctx: TrinoSqlBaseParser.QualifiedNameContext): Statement? {
        if (!(ctx.parent is TrinoSqlBaseParser.TableNameContext)) {
            return null
        }

        if (currentOptType == StatementType.SELECT ||
            currentOptType == StatementType.CREATE_TABLE_AS_SELECT) {

            val tableName = createTableSource(ctx)
            inputTables.add(tableName)
        }
        return null
    }

    private fun createTableSource(ctx: TrinoSqlBaseParser.QualifiedNameContext): TableId {
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
