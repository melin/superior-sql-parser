package com.dataworker.sql.parser.job

import com.dataworker.sql.parser.StatementType
import com.dataworker.sql.parser.model.*
import com.dataworker.sql.parser.antlr4.job.JobTaskParser
import com.dataworker.sql.parser.antlr4.job.JobTaskParserBaseVisitor
import com.dataworker.sql.parser.util.StringUtil
import org.apache.commons.lang3.StringUtils

/**
 *
 * Created by binsong.li on 2018/3/31 下午1:44
 */
class JobTaskAntlr4Visitor : JobTaskParserBaseVisitor<StatementData>() {

    private var command: String? = null

    private val tableDatas = ArrayList<StatementData>()

    override fun visitJobTask(ctx: JobTaskParser.JobTaskContext): StatementData {
        val tableData = super.visitJobTask(ctx)
        tableDatas.add(tableData)

        return tableData;
    }

    override fun visitJobStatement(ctx: JobTaskParser.JobStatementContext): StatementData {
        val resourceName = ctx.resourceNameExpr().text
        val className = ctx.classNameExpr().text

        var params: ArrayList<String> = arrayListOf()

        if(ctx.paramsExpr() != null) {
            ctx.paramsExpr().children.forEach{ item ->
                val param = item as JobTaskParser.ParamExprContext
                var value = StringUtils.substring(command, param.start.startIndex, param.stop.stopIndex + 1)
                if(StringUtils.startsWith(value, "/")) { //解决连续多个文件路径，不能正确解析
                    value = replaceWhitespace(value)

                    params.addAll(StringUtils.split(value, " "));
                } else {
                    value = StringUtil.cleanQuote(value)
                    params.add(value)
                }
            }
        }

        val jobData = JobData(resourceName, className, params)
        return StatementData(StatementType.JOB, jobData)
    }

    override fun visitSetStatement(ctx: JobTaskParser.SetStatementContext): StatementData {
        val key = ctx.keyExpr().text
        var value = StringUtils.substring(command, ctx.value.start.startIndex, ctx.value.stop.stopIndex + 1)
        value = StringUtil.cleanQuote(value)

        var data = SetData(key, value)
        return StatementData(StatementType.SET, data)
    }

    override fun visitUnsetStatement(ctx: JobTaskParser.UnsetStatementContext): StatementData {
        val key = ctx.keyExpr().text
        var data = UnSetData(key)
        return StatementData(StatementType.UNSET, data)
    }

    private fun replaceWhitespace(str: String?): String? {
        if (str != null) {
            val len = str.length
            if (len > 0) {
                val dest = CharArray(len)
                var destPos = 0
                for (i in 0 until len) {
                    val c = str[i]
                    if (!Character.isWhitespace(c)) {
                        dest[destPos++] = c
                    } else {
                        dest[destPos++] = ' '
                    }
                }
                return String(dest, 0, destPos)
            }
        }
        return str
    }

    fun getTableDatas(): ArrayList<StatementData> {
        return tableDatas
    }

    fun setCommand(command: String) {
        this.command = command
    }
}