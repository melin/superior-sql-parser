package io.github.melin.superior.parser.trino

import com.github.melin.superior.sql.parser.util.CommonUtils
import io.github.melin.superior.common.relational.Statement
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.atn.PredictionMode
import org.antlr.v4.runtime.misc.ParseCancellationException
import org.apache.commons.lang3.StringUtils
import io.github.melin.superior.common.antlr4.ParseErrorListener
import io.github.melin.superior.common.antlr4.ParseException
import io.github.melin.superior.parser.trino.antlr4.TrinoSqlBaseBaseVisitor
import io.github.melin.superior.parser.trino.antlr4.TrinoSqlBaseLexer
import io.github.melin.superior.parser.trino.antlr4.TrinoSqlBaseParser
import org.antlr.v4.runtime.atn.LexerATNSimulator
import org.antlr.v4.runtime.atn.ParserATNSimulator
import org.antlr.v4.runtime.atn.PredictionContextCache

/**
 *
 * Created by libinsong on 2018/1/10.
 */
object TrinoSqlHelper {

    @JvmStatic fun sqlKeywords(): List<String> {
        val keywords = hashSetOf<String>()
        (0 until TrinoSqlBaseLexer.VOCABULARY.maxTokenType).forEach { idx ->
            val name = TrinoSqlBaseLexer.VOCABULARY.getLiteralName(idx)
            if (name != null) {
                val matchResult = CommonUtils.KEYWORD_REGEX.find(name)
                if (matchResult != null) {
                    keywords.add(matchResult.groupValues.get(1))
                }
            }
        }

        return keywords.sorted()
    }

    @JvmStatic fun parseStatement(command: String): Statement {
        val statements = this.parseMultiStatement(command)
        if (statements.size != 1) {
            throw IllegalStateException("only parser one sql, sql count: " + statements.size)
        } else {
            return statements.get(0)
        }
    }

    @JvmStatic fun parseMultiStatement(command: String): List<Statement> {
        val trimCmd = StringUtils.trim(command)
        val sqlVisitor = TrinoSqlAntlr4Visitor(false, trimCmd)
        innerParseStatement(trimCmd, sqlVisitor)
        return sqlVisitor.getSqlStatements()
    }

    @JvmStatic fun splitSql(command: String): List<String> {
        val trimCmd = StringUtils.trim(command)
        val sqlVisitor = TrinoSqlAntlr4Visitor(true, trimCmd)
        innerParseStatement(trimCmd, sqlVisitor)
        return sqlVisitor.getSplitSqls()
    }

    @JvmStatic fun checkSqlSyntax(command: String) {
        val sqlVisitor = TrinoSqlBaseBaseVisitor<Statement>()
        innerParseStatement(command, sqlVisitor)
    }

    private fun innerParseStatement(
        command: String,
        sqlVisitor: TrinoSqlBaseBaseVisitor<Statement>
    ) {
        val charStream = CaseInsensitiveStream(CharStreams.fromString(command))
        val lexer = TrinoSqlBaseLexer(charStream)
        lexer.removeErrorListeners()
        lexer.addErrorListener(ParseErrorListener())

        val tokenStream = CommonTokenStream(lexer)
        val parser = TrinoSqlBaseParser(tokenStream)
        parser.removeErrorListeners()
        parser.addErrorListener(ParseErrorListener())

        lexer.interpreter =
            LexerATNSimulator(lexer, lexer.atn, lexer.interpreter.decisionToDFA, PredictionContextCache())
        parser.interpreter =
            ParserATNSimulator(parser, parser.atn, parser.interpreter.decisionToDFA, PredictionContextCache())

        parser.interpreter.predictionMode = PredictionMode.SLL

        try {
            try {
                // first, try parsing with potentially faster SLL mode
                sqlVisitor.visit(parser.sqlStatements())
            } catch (e: ParseCancellationException) {
                tokenStream.seek(0) // rewind input stream
                parser.reset()

                // Try Again.
                parser.interpreter.predictionMode = PredictionMode.LL
                sqlVisitor.visit(parser.sqlStatements())
            }
        } catch (e: ParseException) {
            if (StringUtils.isNotBlank(e.command)) {
                throw e;
            } else {
                throw e.withCommand(command)
            }
        } finally {
            parser.getInterpreter().clearDFA();
            lexer.getInterpreter().clearDFA();
        }
    }
}
