package io.github.melin.superior.parser.spark

import com.github.melin.superior.sql.parser.util.CommonUtils
import io.github.melin.superior.common.relational.*
import io.github.melin.superior.common.relational.common.SetStatement
import io.github.melin.superior.common.relational.create.CreateTable
import io.github.melin.superior.common.relational.dml.InsertMode
import io.github.melin.superior.common.relational.dml.InsertTable
import io.github.melin.superior.common.relational.table.ColumnRel
import io.github.melin.superior.parser.spark.antlr4.SparkStreamSqlParser
import io.github.melin.superior.parser.spark.antlr4.SparkStreamSqlParserBaseVisitor
import org.apache.commons.lang3.StringUtils

class SparkStreamSqlAntlr4Visitor : SparkStreamSqlParserBaseVisitor<Statement>() {

    private var command: String? = null

    private val tableDatas = ArrayList<Statement>()

    override fun visitSqlStatement(ctx: SparkStreamSqlParser.SqlStatementContext?): Statement {
        val tableData = super.visitSqlStatement(ctx)
        tableDatas.add(tableData)

        return tableData;
    }

    override fun visitCreateStreamTable(ctx: SparkStreamSqlParser.CreateStreamTableContext): Statement {
        val tableName = ctx.tableName.table.ID().text
        val columns = if (ctx.columns != null) {
            ctx.columns.children
                .filter {
                    it is SparkStreamSqlParser.ColTypeContext
                }.map { item ->
                    val column = item as SparkStreamSqlParser.ColTypeContext
                    val colName = column.ID().text
                    val dataType = column.dataType().text
                    val colComment = if (column.comment != null) CommonUtils.cleanQuote(column.comment.text) else null
                    val jsonPath = if (column.jsonPath != null) CommonUtils.cleanQuote(column.jsonPath.text) else null
                    //val pattern = if (column.pattern != null) StringUtil.cleanQuote(column.pattern.text) else null

                    val columnRel = ColumnRel(colName, dataType, colComment, true)
                    columnRel.jsonPath = jsonPath
                    columnRel
                }
        } else {
            emptyList()
        }

        val properties = HashMap<String, String>()
        if (ctx.tableProps != null) {
            ctx.tableProps.children.filter { it is SparkStreamSqlParser.TablePropertyContext }.map { item ->
                val property = item as SparkStreamSqlParser.TablePropertyContext
                val key = CommonUtils.cleanQuote(property.key.text)
                val value = CommonUtils.cleanQuote(property.value.text)
                properties.put(key, value)
            }
        }

        return CreateTable(TableId(tableName), null, null, null, columns, properties)
    }

    override fun visitSetStatement(ctx: SparkStreamSqlParser.SetStatementContext): Statement {
        val key = ctx.setKeyExpr().text
        var value = CommonUtils.cleanQuote(ctx.valueKeyExpr().text)
        value = CommonUtils.cleanQuote(value)

        return SetStatement(key, value)
    }

    override fun visitInsertStatement(ctx: SparkStreamSqlParser.InsertStatementContext): Statement {
        val schemaName = if (ctx.tableName.db != null) ctx.tableName.db.ID().text else null;
        val tableName = ctx.tableName.table.ID().text

        val tableId = TableId(schemaName, tableName)
        val querySql = CommonUtils.subsql(command, ctx.select)
        val insertTable = InsertTable(InsertMode.INTO, tableId)
        insertTable.querySql = querySql
        return insertTable
    }

    fun setCommand(command: String) {
        this.command = command
    }

    fun getTableDatas(): ArrayList<Statement> {
        return tableDatas
    }
}
