package io.github.melin.superior.parser.postgre

import com.github.melin.superior.sql.parser.util.CommonUtils
import io.github.melin.superior.common.antlr4.AntlrCaches
import io.github.melin.superior.common.antlr4.ParseErrorListener
import io.github.melin.superior.common.antlr4.ParseException
import io.github.melin.superior.common.antlr4.UpperCaseCharStream
import io.github.melin.superior.common.relational.Statement
import io.github.melin.superior.parser.postgre.antlr4.PostgreSqlLexer
import io.github.melin.superior.parser.postgre.antlr4.PostgreSqlParser
import io.github.melin.superior.parser.postgre.antlr4.PostgreSqlParserBaseVisitor
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.atn.PredictionMode
import org.antlr.v4.runtime.misc.ParseCancellationException
import org.apache.commons.lang3.StringUtils

/** Created by libinsong on 2020/6/30 9:58 上午 */
object PostgreSqlHelper {

    @JvmStatic
    fun sqlKeywords(): List<String> {
        val keywords = hashSetOf<String>()
        (0 until PostgreSqlLexer.VOCABULARY.maxTokenType).forEach { idx ->
            val name = PostgreSqlLexer.VOCABULARY.getLiteralName(idx)
            if (name != null) {
                val matchResult = CommonUtils.KEYWORD_REGEX.find(name)
                if (matchResult != null) {
                    keywords.add(matchResult.groupValues.get(1))
                }
            }
        }

        return keywords.sorted()
    }

    @JvmStatic
    fun parseStatement(command: String): Statement {
        val statements = this.parseMultiStatement(command)
        if (statements.size != 1) {
            throw IllegalStateException(
                "only parser one sql, sql count: " + statements.size
            )
        } else {
            return statements.get(0)
        }
    }

    @JvmStatic
    fun parseMultiStatement(command: String): List<Statement> {
        val trimCmd = StringUtils.trim(command)
        val sqlVisitor = PostgreSqlAntlr4Visitor(false, trimCmd)
        innerParseStatement(trimCmd, sqlVisitor)
        return sqlVisitor.getSqlStatements()
    }

    @JvmStatic
    fun splitSql(command: String): List<String> {
        val trimCmd = StringUtils.trim(command)
        val sqlVisitor = PostgreSqlAntlr4Visitor(true, trimCmd)
        innerParseStatement(trimCmd, sqlVisitor)
        return sqlVisitor.getSplitSqls()
    }

    @JvmStatic
    fun checkSqlSyntax(command: String) {
        val sqlVisitor = PostgreSqlParserBaseVisitor<Statement>()
        innerParseStatement(command, sqlVisitor)
    }

    private fun innerParseStatement(
        command: String,
        sqlVisitor: PostgreSqlParserBaseVisitor<Statement>
    ) {
        val charStream = UpperCaseCharStream(CharStreams.fromString(command))
        val lexer = PostgreSqlLexer(charStream)
        lexer.removeErrorListeners()
        lexer.addErrorListener(ParseErrorListener())

        val tokenStream = CommonTokenStream(lexer)
        val parser = PostgreSqlParser(tokenStream)
        AbstractSqlParser.installCaches(parser)
        parser.removeErrorListeners()
        parser.addErrorListener(ParseErrorListener())

        // parser.interpreter.predictionMode = PredictionMode.SLL
        try {
            try {
                // first, try parsing with potentially faster SLL mode
                sqlVisitor.visit(parser.root())
            } catch (e: ParseCancellationException) {
                tokenStream.seek(0) // rewind input stream
                parser.reset()

                // Try Again.
                parser.interpreter.predictionMode = PredictionMode.LL
                sqlVisitor.visit(parser.root())
            }
        } catch (e: ParseException) {
            if (StringUtils.isNotBlank(e.command)) {
                throw e
            } else {
                throw e.withCommand(command)
            }
        } finally {
            val releaseAntlrCache =
                System.getenv(AntlrCaches.RELEASE_ANTLR_CACHE_AFTER_PARSING)
            if (releaseAntlrCache == null || "true".equals(releaseAntlrCache)) {
                AbstractSqlParser.refreshParserCaches()
            }
        }
    }
}
