package com.github.bigdata.sql.parser.stream

import com.github.bigdata.sql.antlr4.stream.StreamSqlParser
import com.github.bigdata.sql.antlr4.stream.StreamSqlParserBaseVisitor
import com.github.bigdata.sql.parser.*
import com.github.bigdata.sql.parser.util.StringUtil
import org.apache.commons.lang.StringUtils

class StreamSQLAntlr4Visitor : StreamSqlParserBaseVisitor<StatementData>() {

    private var command: String? = null

    private val tableDatas = ArrayList<StatementData>()

    override fun visitSqlStatement(ctx: StreamSqlParser.SqlStatementContext?): StatementData {
        val tableData = super.visitSqlStatement(ctx)
        tableDatas.add(tableData)

        return tableData;
    }

    override fun visitCreateSoureTable(ctx: StreamSqlParser.CreateSoureTableContext): StatementData {
        val tableName = ctx.tableName().ID().text
        var columns: List<DcColumn> = ctx.columns.children
            .filter { it is StreamSqlParser.ColTypeContext }.map { item ->
                val column = item as StreamSqlParser.ColTypeContext
                val colName = column.ID().text
                var dataType = column.dataType().text
                val colComment = if (column.comment != null) StringUtil.cleanSingleQuote(column.comment.text) else null
                    DcColumn(colName, dataType, colComment)
            }

        var properties = HashMap<String, String>()
        if(ctx.tableProps != null) {
            ctx.tableProps.children.filter { it is StreamSqlParser.TablePropertyContext }.map { item ->
                val property = item as StreamSqlParser.TablePropertyContext
                val key = StringUtil.cleanSingleQuote(property.key.text)
                var value = StringUtil.cleanSingleQuote(property.value.text)
                value = StringUtil.cleanDoubleQuote(value)
                properties.put(key, value)
            }
        }

        val timeModeText = ctx.timeMode.timeMode.text
        val timeMode = if(StringUtils.equalsIgnoreCase("proctime", timeModeText)) {
            StreamTimeMode.PROCTIME
        } else {
            StreamTimeMode.ROWTIME
        }
        var timeAttrName = if(ctx.timeMode.attrName != null ) ctx.timeMode.attrName.text else "proctime"

        val table = StreamSourceTable(tableName, columns, properties, timeMode, timeAttrName)

        if(StringUtils.equalsIgnoreCase("rowtime", timeModeText)) {
            table.waterMarkType = StreamWaterMark.DELAY
            table.intervalTime = ctx.getChild(9).getChild(7).text.toInt()
        }

        return StatementData(StatementType.CREATE_TABLE, table)
    }

    override fun visitCreateSinkTable(ctx: StreamSqlParser.CreateSinkTableContext): StatementData {
        val tableName = ctx.tableName().ID().text
        var columns: List<DcColumn> = ctx.columns.children
                .filter { it is StreamSqlParser.ColTypeContext }.map { item ->
                    val column = item as StreamSqlParser.ColTypeContext
                    val colName = column.ID().text
                    var dataType = column.dataType().text
                    val colComment = if (column.comment != null) StringUtil.cleanSingleQuote(column.comment.text) else null
                    DcColumn(colName, dataType, colComment)
                }

        var properties = HashMap<String, String>()
        if(ctx.tableProps != null) {
            ctx.tableProps.children.filter { it is StreamSqlParser.TablePropertyContext }.map { item ->
                val property = item as StreamSqlParser.TablePropertyContext
                val key = StringUtil.cleanSingleQuote(property.key.text)
                var value = StringUtil.cleanSingleQuote(property.value.text)
                value = StringUtil.cleanDoubleQuote(value)
                properties.put(key, value)
            }
        }

        val table = StreamSinkTable(tableName, columns, properties)

        return StatementData(StatementType.CREATE_TABLE, table)
    }

    override fun visitCreateView(ctx: StreamSqlParser.CreateViewContext): StatementData {
        val tableName = ctx.tableName().ID().text
        val querySql = StringUtils.substring(command, ctx.select.start.startIndex, ctx.select.stop.stopIndex + 1)

        var table = StreamView(tableName, querySql)
        return StatementData(StatementType.CREATE_VIEW, table)
    }

    override fun visitCreateFunction(ctx: StreamSqlParser.CreateFunctionContext): StatementData {
        val functionName = ctx.functionName().ID().text
        var className = StringUtil.cleanDoubleQuote(ctx.className.text)
        className = StringUtil.cleanSingleQuote(className)
        var jarFile = StringUtil.cleanDoubleQuote(ctx.jarFile.text)
        jarFile = StringUtil.cleanSingleQuote(jarFile)

        var table = DcFunction(functionName, className, jarFile)
        return StatementData(StatementType.CREATE_FUNCTION, table)
    }

    override fun visitSetStatement(ctx: StreamSqlParser.SetStatementContext): StatementData {
        val key = ctx.setKeyExpr().text
        var value = StringUtil.cleanDoubleQuote(ctx.valueKeyExpr().text)
        value = StringUtil.cleanSingleQuote(value)

        var data = SetData(key, value)
        return StatementData(StatementType.SET, data)
    }

    override fun visitInsertStatement(ctx: StreamSqlParser.InsertStatementContext): StatementData {
        val tableName = ctx.tableName().ID().text
        val querySql = StringUtils.substring(command, ctx.select.start.startIndex, ctx.select.stop.stopIndex + 1)

        var table = StreamInsertStatement(tableName, querySql)
        return StatementData(StatementType.INSERT_SELECT, table)
    }

    fun setCommand(command: String) {
        this.command = command
    }

    fun getTableDatas(): ArrayList<StatementData> {
        return tableDatas
    }
}