package com.dataworker.sql.parser.presto

import com.dataworker.sql.parser.SQLParserException
import com.dataworker.sql.parser.StatementType
import com.dataworker.sql.parser.model.*
import com.dataworker.sql.parser.antlr4.presto.PrestoSqlBaseBaseVisitor
import com.dataworker.sql.parser.antlr4.presto.PrestoSqlBaseParser
import org.antlr.v4.runtime.tree.ParseTree
import org.apache.commons.lang3.StringUtils

/**
 *
 * Created by libinsong on 2018/1/10.
 */
class PrestoSQLAntlr4Visitor : PrestoSqlBaseBaseVisitor<StatementData>() {

    private var currentOptType: StatementType = StatementType.UNKOWN
    private val statementData = TableData();
    private var table: DcTable? = null
    private var limit:Int? = null
    private var command: String? = null
    private var data: StatementData? = null

    fun setCommand(command: String) {
        this.command = command
    }

    override fun visit(tree: ParseTree?): StatementData? {
        super.visit(tree)

        if (data == null) {
            throw SQLParserException("不支持的SQL")
        }

        return data;
    }

    override fun visitStatementDefault(ctx: PrestoSqlBaseParser.StatementDefaultContext): StatementData? {
        if (StringUtils.equalsIgnoreCase("select", ctx.start.text)) {
            currentOptType = StatementType.SELECT
            super.visitQuery(ctx.query())

            statementData.limit = ctx.query()?.queryNoWith()?.limit?.text?.toInt()
            data = StatementData(StatementType.SELECT, statementData)
            return data
        } else {
            return null
        }
    }

    override fun visitShowCreateTable(ctx: PrestoSqlBaseParser.ShowCreateTableContext): StatementData? {
        val tableSource = createTableSource(ctx.qualifiedName())

        val dcTable = DcTable(tableSource.catalogName, tableSource.databaseName, tableSource.tableName)
        data = StatementData(StatementType.SHOW_CREATE_TABLE, dcTable)
        return data
    }

    override fun visitCreateTableAsSelect(ctx: PrestoSqlBaseParser.CreateTableAsSelectContext): StatementData? {
        currentOptType = StatementType.CREATE_TABLE_AS_SELECT
        val tableSource = createTableSource(ctx.qualifiedName())
        table = DcTable(tableSource.catalogName, tableSource.databaseName, tableSource.tableName)

        var querySql = StringUtils.substring(command, ctx.query().start.startIndex)
        if (StringUtils.startsWith(querySql, "(") && StringUtils.endsWith(querySql, ")")) {
            querySql = StringUtils.substringBetween(querySql, "(", ")")
        }

        table?.lifeCycle = 7
        table?.querySql = querySql
        statementData.limit = ctx.query()?.queryNoWith()?.limit?.text?.toInt()

        super.visitQuery(ctx.query())

        table?.tableData = statementData
        data = StatementData(StatementType.CREATE_TABLE_AS_SELECT, table)
        return data;
    }

    override fun visitDropTable(ctx: PrestoSqlBaseParser.DropTableContext): StatementData? {
        val tableSource = createTableSource(ctx.qualifiedName())

        val dcTable = DcTable(tableSource.catalogName, tableSource.databaseName, tableSource.tableName)
        val token = CommonToken(ctx.qualifiedName().start.startIndex, ctx.qualifiedName().stop.stopIndex)
        dcTable.ifExists = ctx.EXISTS() != null
        dcTable.token = token
        data = StatementData(StatementType.DROP_TABLE, dcTable)
        return data
    }

    override fun visitExplain(ctx: PrestoSqlBaseParser.ExplainContext): StatementData? {
        data = StatementData(StatementType.EXPLAIN)
        return data
    }

    override fun visitQualifiedName(ctx: PrestoSqlBaseParser.QualifiedNameContext): StatementData? {
        if (!(ctx.parent is PrestoSqlBaseParser.TableNameContext)) {
            return null
        }

        if (currentOptType == StatementType.SELECT) {
            val tableSource = createTableSource(ctx)
            statementData.inputTables.add(tableSource)
        } else if (currentOptType == StatementType.CREATE_TABLE_AS_SELECT) {
            val tableSource = createTableSource(ctx)
            statementData.inputTables.add(tableSource)
        }
        return null
    }

    private fun createTableSource(ctx: PrestoSqlBaseParser.QualifiedNameContext): TableSource {
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

        return TableSource(catalogName, databaseName, tableName)
    }
}
