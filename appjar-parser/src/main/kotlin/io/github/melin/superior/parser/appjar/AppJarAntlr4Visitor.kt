package io.github.melin.superior.parser.appjar

import com.github.melin.superior.sql.parser.util.StringUtil
import io.github.melin.superior.common.relational.StatementData
import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.common.SetData
import io.github.melin.superior.common.relational.common.UnSetData
import io.github.melin.superior.parser.job.antlr4.AppJarParser
import io.github.melin.superior.parser.job.antlr4.AppJarParserBaseVisitor
import org.apache.commons.lang3.StringUtils

/**
 *
 * Created by binsong.li on 2018/3/31 下午1:44
 */
class AppJarAntlr4Visitor : AppJarParserBaseVisitor<StatementData>() {

    private var command: String? = null

    private val tableDatas = ArrayList<StatementData>()

    override fun visitJobTask(ctx: AppJarParser.JobTaskContext): StatementData {
        val tableData = super.visitJobTask(ctx)
        tableDatas.add(tableData)

        return tableData;
    }

    override fun visitJobStatement(ctx: AppJarParser.JobStatementContext): StatementData {
        val resourceName = ctx.resourceNameExpr().text
        val className = ctx.classNameExpr().text

        var params: ArrayList<String> = arrayListOf()

        if(ctx.paramsExpr() != null) {
            ctx.paramsExpr().children.forEach{ item ->
                val param = item as AppJarParser.ParamExprContext
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

        val jobData = AppJarInfo(resourceName, className, params)
        return StatementData(StatementType.APP_JAR, jobData)
    }

    override fun visitSetStatement(ctx: AppJarParser.SetStatementContext): StatementData {
        val key = ctx.keyExpr().text
        var value = StringUtils.substring(command, ctx.value.start.startIndex, ctx.value.stop.stopIndex + 1)
        value = StringUtil.cleanQuote(value)

        val data = SetData(key, value)
        return StatementData(StatementType.SET, data)
    }

    override fun visitUnsetStatement(ctx: AppJarParser.UnsetStatementContext): StatementData {
        val key = ctx.keyExpr().text
        val data = UnSetData(key)
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