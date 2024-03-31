package io.github.melin.superior.parser.appjar

import com.github.melin.superior.sql.parser.util.CommonUtils
import io.github.melin.superior.common.relational.Statement
import io.github.melin.superior.common.relational.common.SetStatement
import io.github.melin.superior.common.relational.common.ReSetStatement
import io.github.melin.superior.parser.job.antlr4.AppJarParser
import io.github.melin.superior.parser.job.antlr4.AppJarParserBaseVisitor
import org.apache.commons.lang3.StringUtils

/**
 *
 * Created by binsong.li on 2018/3/31 下午1:44
 */
class AppJarAntlr4Visitor : AppJarParserBaseVisitor<Statement>() {

    private var command: String? = null

    private val jobStmts = ArrayList<Statement>()

    override fun visitJobTask(ctx: AppJarParser.JobTaskContext): Statement {
        val jobStmt = super.visitJobTask(ctx)
        var sql = CommonUtils.subsql(command, ctx)
        sql = CommonUtils.cleanLastSemi(sql)
        jobStmt.setSql(sql)

        jobStmts.add(jobStmt)
        return jobStmt;
    }

    override fun visitJobStatement(ctx: AppJarParser.JobStatementContext): Statement {
        val resourceName = ctx.resourceNameExpr().text
        val className = ctx.classNameExpr().text

        val params: ArrayList<String> = arrayListOf()

        if (ctx.paramsExpr() != null) {
            ctx.paramsExpr().children.forEach{ item ->
                val param = item as AppJarParser.ParamExprContext
                var value = CommonUtils.subsql(command, param)
                if (StringUtils.startsWith(value, "/")) { //解决连续多个文件路径，不能正确解析
                    value = replaceWhitespace(value)

                    params.addAll(StringUtils.split(value, " "));
                } else {
                    value = CommonUtils.cleanQuote(value)
                    params.add(value)
                }
            }
        }

        return AppJarInfo(resourceName, className, params)
    }

    override fun visitSetStatement(ctx: AppJarParser.SetStatementContext): Statement {
        val key = ctx.keyExpr().text
        var value = CommonUtils.subsql(command, ctx.value)
        value = CommonUtils.cleanQuote(value)

        return SetStatement(key, value)
    }

    override fun visitResetStatement(ctx: AppJarParser.ResetStatementContext): Statement {
        val key = ctx.keyExpr().text
        return ReSetStatement(key)
    }

    private fun replaceWhitespace(str: String): String {
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
        return str
    }

    fun getJobStmts(): ArrayList<Statement> {
        return jobStmts
    }

    fun setCommand(command: String) {
        this.command = command
    }
}