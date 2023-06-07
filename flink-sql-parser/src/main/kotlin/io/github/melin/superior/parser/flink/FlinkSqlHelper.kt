package io.github.melin.superior.parser.flink

import io.github.melin.superior.common.antlr4.ParseErrorListener
import io.github.melin.superior.common.antlr4.ParseException
import io.github.melin.superior.common.antlr4.UpperCaseCharStream
import io.github.melin.superior.common.relational.Statement
import io.github.melin.superior.parser.flink.antlr4.FlinkSqlLexer
import io.github.melin.superior.parser.flink.antlr4.FlinkSqlParser
import io.github.melin.superior.parser.flink.antlr4.FlinkSqlParserBaseListener
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.atn.PredictionMode
import org.antlr.v4.runtime.misc.ParseCancellationException
import org.apache.commons.lang3.StringUtils

/**
 *
 * Created by libinsong on 2018/1/10.
 */
object FlinkSqlHelper {

    @JvmStatic fun parseStatement(command: String): Statement {
        val statements = this.parseMultiStatement(command)
        if (statements.size != 1) {
            throw IllegalStateException("only parser one sql, sql count: " + statements.size)
        } else {
            return statements.get(0)
        }
    }

    @JvmStatic fun parseMultiStatement(command: String): List<Statement> {
        val sqlVisitor = innerParseStatement(command)
        return sqlVisitor.getSqlStatements()
    }

    @JvmStatic fun splitSql(command: String): List<String> {
        val sqlVisitor = innerParseStatement(command, true)
        return sqlVisitor.getSplitSqls()
    }

    private fun innerParseStatement(command: String, splitSql: Boolean = false): FlinkSqlAntlr4Visitor {
        val trimCmd = StringUtils.trim(command)

        val charStream =
            UpperCaseCharStream(CharStreams.fromString(trimCmd))
        val lexer = FlinkSqlLexer(charStream)
        lexer.removeErrorListeners()
        lexer.addErrorListener(ParseErrorListener())

        val tokenStream = CommonTokenStream(lexer)
        val parser = FlinkSqlParser(tokenStream)
        parser.addParseListener(FlinkSqlParserBaseListener())
        parser.removeErrorListeners()
        parser.addErrorListener(ParseErrorListener())
        parser.interpreter.predictionMode = PredictionMode.SLL

        val sqlVisitor = FlinkSqlAntlr4Visitor(splitSql)
        sqlVisitor.setCommand(trimCmd)

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

            return sqlVisitor
        } catch (e: ParseException) {
            if (StringUtils.isNotBlank(e.command)) {
                throw e;
            } else {
                throw e.withCommand(trimCmd)
            }
        }
    }
}
