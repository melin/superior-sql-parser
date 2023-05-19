package io.github.melin.superior.parser.presto

import io.github.melin.superior.common.*
import io.github.melin.superior.common.relational.StatementData
import io.github.melin.superior.common.relational.TableId
import io.github.melin.superior.common.relational.dml.QueryStmt
import io.github.melin.superior.common.relational.create.CreateTableAsSelect
import io.github.melin.superior.common.relational.drop.DropTable
import io.github.melin.superior.parser.presto.antlr4.PrestoSqlBaseBaseVisitor
import io.github.melin.superior.parser.presto.antlr4.PrestoSqlBaseParser
import org.antlr.v4.runtime.tree.ParseTree
import org.antlr.v4.runtime.tree.RuleNode
import org.apache.commons.lang3.StringUtils

/**
 *
 * Created by libinsong on 2018/1/10.
 */
class PrestoSqlAntlr4Visitor : PrestoSqlBaseBaseVisitor<StatementData>() {

    private var currentOptType: StatementType = StatementType.UNKOWN
    private var command: String? = null

    private var limit:Int? = null
    private var inputTables: ArrayList<TableId> = arrayListOf()

    fun setCommand(command: String) {
        this.command = command
    }

    override fun visit(tree: ParseTree?): StatementData? {
        val data = super.visit(tree)

        if (data == null) {
            throw SQLParserException("不支持的SQL")
        }

        return data;
    }

    override fun shouldVisitNextChild(node: RuleNode, currentResult: StatementData?): Boolean {
        return if (currentResult == null) true else false
    }

    override fun visitStatementDefault(ctx: PrestoSqlBaseParser.StatementDefaultContext): StatementData? {
        if (StringUtils.equalsIgnoreCase("select", ctx.start.text)) {
            currentOptType = StatementType.SELECT
            super.visitQuery(ctx.query())

            val limit = ctx.query()?.queryNoWith()?.limit?.text?.toInt()
            val queryStmt = QueryStmt(inputTables, limit)
            return StatementData(StatementType.SELECT, queryStmt)
        } else {
            return null
        }
    }

    override fun visitCreateTableAsSelect(ctx: PrestoSqlBaseParser.CreateTableAsSelectContext): StatementData? {
        currentOptType = StatementType.CREATE_TABLE_AS_SELECT
        val tableId = createTableSource(ctx.qualifiedName())
        val createTable = CreateTableAsSelect(tableId)

        var querySql = StringUtils.substring(command, ctx.query().start.startIndex)
        if (StringUtils.startsWith(querySql, "(") && StringUtils.endsWith(querySql, ")")) {
            querySql = StringUtils.substringBetween(querySql, "(", ")")
        }

        createTable.lifeCycle = 7
        createTable.querySql = querySql
        createTable.inputTables.addAll(inputTables)

        super.visitQuery(ctx.query())

        return StatementData(StatementType.CREATE_TABLE_AS_SELECT, createTable)
    }

    override fun visitDropTable(ctx: PrestoSqlBaseParser.DropTableContext): StatementData? {
        val tableId = createTableSource(ctx.qualifiedName())

        val dropTable = DropTable(tableId)
        dropTable.ifExists = ctx.EXISTS() != null
        return StatementData(StatementType.DROP_TABLE, dropTable)
    }

    override fun visitExplain(ctx: PrestoSqlBaseParser.ExplainContext): StatementData? {
        return StatementData(StatementType.EXPLAIN)
    }

    override fun visitQualifiedName(ctx: PrestoSqlBaseParser.QualifiedNameContext): StatementData? {
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
