package io.github.melin.superior.parser.oracle

import com.github.melin.superior.sql.parser.util.CommonUtils
import io.github.melin.superior.common.relational.Statement
import io.github.melin.superior.common.antlr4.ParseErrorListener
import io.github.melin.superior.common.antlr4.ParseException
import io.github.melin.superior.common.antlr4.UpperCaseCharStream
import io.github.melin.superior.parser.oracle.antlr4.OracleLexer
import io.github.melin.superior.parser.oracle.antlr4.OracleParser
import io.github.melin.superior.parser.oracle.antlr4.OracleParserBaseVisitor
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.atn.PredictionMode
import org.antlr.v4.runtime.misc.ParseCancellationException
import org.apache.commons.lang3.StringUtils

/**
 * Created by libinsong on 2020/6/30 9:58 上午
 */
object OracleSqlHelper {

    @JvmStatic fun sqlKeywords(): List<String> {
        val keywords = hashSetOf<String>()
        (0 until OracleLexer.VOCABULARY.maxTokenType).forEach { idx ->
            val name = OracleLexer.VOCABULARY.getLiteralName(idx)
            if (name != null) {
                val matchResult = CommonUtils.KEYWORD_REGEX.find(name)
                if (matchResult != null) {
                    keywords.add(matchResult.groupValues.get(0))
                }
            }
        }

        return keywords.sorted()
    }

    @JvmStatic fun parseStatement(command: String): Statement {
        var sql = StringUtils.trim(command);
        if (!StringUtils.endsWith(sql, ";")) {
            sql += ";"
        }
        val statements = this.parseMultiStatement(sql)
        if (statements.size != 1) {
            throw IllegalStateException("only parser one sql, sql count: " + statements.size)
        } else {
            return statements.get(0)
        }
    }

    @JvmStatic fun parseMultiStatement(command: String): List<Statement> {
        val trimCmd = StringUtils.trim(command)
        val sqlVisitor = OracleSqlAntlr4Visitor(false, trimCmd)
        innerParseStatement(trimCmd, sqlVisitor)
        return sqlVisitor.getSqlStatements()
    }

    @JvmStatic fun splitSql(command: String): List<String> {
        var trimCmd = StringUtils.trim(command);
        if (!StringUtils.endsWith(trimCmd, ";")) {
            trimCmd += ";"
        }

        val sqlVisitor = OracleSqlAntlr4Visitor(true, trimCmd)
        innerParseStatement(trimCmd, sqlVisitor)
        return sqlVisitor.getSplitSqls()
    }

    @JvmStatic fun checkSqlSyntax(command: String) {
        var trimCmd = StringUtils.trim(command);
        if (!StringUtils.endsWith(trimCmd, ";")) {
            trimCmd += ";"
        }

        val sqlVisitor = OracleParserBaseVisitor<Statement>()
        innerParseStatement(trimCmd, sqlVisitor)
    }

    private fun innerParseStatement(
        command: String,
        sqlVisitor: OracleParserBaseVisitor<Statement>
    ) {
        val charStream = UpperCaseCharStream(CharStreams.fromString(command))
        val lexer = OracleLexer(charStream)
        lexer.removeErrorListeners()
        lexer.addErrorListener(ParseErrorListener())

        val tokenStream = CommonTokenStream(lexer)
        val parser = OracleParser(tokenStream)
        parser.removeErrorListeners()
        parser.addErrorListener(ParseErrorListener())
        // parser.interpreter.predictionMode = PredictionMode.SLL

        try {
            try {
                // first, try parsing with potentially faster SLL mode
                sqlVisitor.visit(parser.sql_script())
            }
            catch (e: ParseCancellationException) {
                tokenStream.seek(0) // rewind input stream
                parser.reset()

                // Try Again.
                parser.interpreter.predictionMode = PredictionMode.LL
                sqlVisitor.visit(parser.sql_script())
            }
        } catch (e: ParseException) {
            if (StringUtils.isNotBlank(e.command)) {
                throw e;
            } else {
                throw e.withCommand(command)
            }
        }
    }
}
