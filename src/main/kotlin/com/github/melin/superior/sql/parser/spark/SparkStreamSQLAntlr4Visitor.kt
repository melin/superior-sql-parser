package com.github.melin.superior.sql.parser.spark

import com.github.melin.superior.sql.parser.StatementType
import com.github.melin.superior.sql.parser.model.*
import com.github.melin.superior.sql.parser.antlr4.spark.SparkStreamSqlParser
import com.github.melin.superior.sql.parser.antlr4.spark.SparkStreamSqlParserBaseVisitor
import com.github.melin.superior.sql.parser.util.StringUtil
import org.apache.commons.lang3.StringUtils

class SparkStreamSQLAntlr4Visitor : SparkStreamSqlParserBaseVisitor<StatementData>() {

    private var command: String? = null

    private val tableDatas = ArrayList<StatementData>()

    override fun visitSqlStatement(ctx: SparkStreamSqlParser.SqlStatementContext?): StatementData {
        val tableData = super.visitSqlStatement(ctx)
        tableDatas.add(tableData)

        return tableData;
    }

    override fun visitCreateStreamTable(ctx: SparkStreamSqlParser.CreateStreamTableContext): StatementData {
        val tableName = ctx.tableName.table.ID().text
        val columns = if (ctx.columns != null) {
            ctx.columns.children
                    .filter {
                        it is SparkStreamSqlParser.ColTypeContext
                    }.map { item ->
                        val column = item as SparkStreamSqlParser.ColTypeContext
                        val colName = column.ID().text
                        var dataType = column.dataType().text
                        val colComment = if (column.comment != null) StringUtil.cleanQuote(column.comment.text) else null
                        val jsonPath = if (column.jsonPath != null) StringUtil.cleanQuote(column.jsonPath.text) else null
                        val pattern = if (column.pattern != null) StringUtil.cleanQuote(column.pattern.text) else null
                        StreamColumn(colName, dataType, colComment, jsonPath, pattern)
                    }
        } else {
            emptyList()
        }

        val properties = HashMap<String, String>()
        if (ctx.tableProps != null) {
            ctx.tableProps.children.filter { it is SparkStreamSqlParser.TablePropertyContext }.map { item ->
                val property = item as SparkStreamSqlParser.TablePropertyContext
                val key = StringUtil.cleanQuote(property.key.text)
                val value = StringUtil.cleanQuote(property.value.text)
                properties.put(key, value)
            }
        }

        val table = StreamTable(tableName, columns, properties)
        return StatementData(StatementType.CREATE_TABLE, table)
    }

    override fun visitSetStatement(ctx: SparkStreamSqlParser.SetStatementContext): StatementData {
        val key = ctx.setKeyExpr().text
        var value = StringUtil.cleanQuote(ctx.valueKeyExpr().text)
        value = StringUtil.cleanQuote(value)

        var data = SetData(key, value)
        return StatementData(StatementType.SET, data)
    }

    override fun visitInsertStatement(ctx: SparkStreamSqlParser.InsertStatementContext): StatementData {
        val dbName = if (ctx.tableName.db != null) ctx.tableName.db.ID().text else null;
        val tableName = ctx.tableName.table.ID().text

        val querySql = StringUtils.substring(command, ctx.select.start.startIndex, ctx.select.stop.stopIndex + 1)

        var table = StreamInsertStatement(dbName, tableName, querySql)
        return StatementData(StatementType.INSERT_SELECT, table)
    }

    fun setCommand(command: String) {
        this.command = command
    }

    fun getTableDatas(): ArrayList<StatementData> {
        return tableDatas
    }
}
