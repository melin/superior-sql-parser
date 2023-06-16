package io.github.melin.superior.parser.flink

import io.github.melin.superior.common.antlr4.ParseErrorListener
import io.github.melin.superior.common.antlr4.ParseException
import io.github.melin.superior.common.antlr4.UpperCaseCharStream
import io.github.melin.superior.common.relational.Statement
import io.github.melin.superior.parser.flink.antlr4.*
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
        val trimCmd = StringUtils.trim(command)
        val sqlVisitor = FlinkSqlAntlr4Visitor(false, trimCmd)
        innerParseStatement(trimCmd, sqlVisitor)
        return sqlVisitor.getSqlStatements()
    }

    @JvmStatic fun splitSql(command: String): List<String> {
        val trimCmd = StringUtils.trim(command)
        val sqlVisitor = FlinkSqlAntlr4Visitor(true, trimCmd)
        innerParseStatement(trimCmd, sqlVisitor)
        return sqlVisitor.getSplitSqls()
    }

    @JvmStatic fun checkSqlSyntax(command: String) {
        val sqlVisitor = FlinkSqlParserBaseVisitor<Statement>()
        innerParseStatement(command, sqlVisitor)
    }

    private fun innerParseStatement(
        command: String,
        sqlVisitor: FlinkSqlParserBaseVisitor<Statement>
    ) {
        val charStream = UpperCaseCharStream(CharStreams.fromString(command))
        val lexer = FlinkSqlLexer(charStream)
        lexer.removeErrorListeners()
        lexer.addErrorListener(ParseErrorListener())

        val tokenStream = CommonTokenStream(lexer)
        val parser = FlinkSqlParser(tokenStream)
        parser.addParseListener(FlinkSqlParserBaseListener())
        parser.removeErrorListeners()
        parser.addErrorListener(ParseErrorListener())
        //parser.interpreter.predictionMode = PredictionMode.SLL

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
        }
    }
}
