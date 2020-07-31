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

            statementData.limit = limit
            data = StatementData(StatementType.SELECT, statementData)
            return data
        } else {
            return null
        }
    }

    override fun visitQualifiedName(ctx: PrestoSqlBaseParser.QualifiedNameContext): StatementData? {
        if (currentOptType == null) {
            return null
        }

        if (!(ctx.parent is PrestoSqlBaseParser.TableNameContext)) {
            return null
        }

        if (currentOptType == StatementType.SELECT) {
            val list = ctx.identifier()

            var db: String? = null
            val text = if (list.size == 1) {
                ctx.text
            } else {
                val index = StringUtils.lastIndexOf(ctx.text, ".")
                db = StringUtils.substring(ctx.text, 0, index)

                StringUtils.substring(ctx.text, index + 1)
            }
            val tableSource = TableSource(db, text)
            statementData.inputTables.add(tableSource)
        }
        return null
    }

}
