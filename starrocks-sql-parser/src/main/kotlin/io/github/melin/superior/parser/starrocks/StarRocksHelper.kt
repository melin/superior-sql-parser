package io.github.melin.superior.parser.starrocks

import io.github.melin.superior.common.relational.Statement
import io.github.melin.superior.common.antlr4.ParseErrorListener
import io.github.melin.superior.common.antlr4.ParseException
import io.github.melin.superior.common.antlr4.UpperCaseCharStream
import io.github.melin.superior.parser.starrocks.antlr4.StarRocksLexer
import io.github.melin.superior.parser.starrocks.antlr4.StarRocksParser
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.misc.ParseCancellationException
import org.apache.commons.lang3.StringUtils

/**
 * Created by libinsong on 2020/6/30 10:01 上午
 */
object StarRocksHelper {

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
        val charStream = UpperCaseCharStream(CharStreams.fromString(trimCmd))
        val lexer = StarRocksLexer(charStream)
        lexer.removeErrorListeners()
        lexer.addErrorListener(ParseErrorListener())

        val tokenStream = CommonTokenStream(lexer)
        val parser = StarRocksParser(tokenStream)
        parser.removeErrorListeners()
        parser.addErrorListener(ParseErrorListener())
        parser.addParseListener(PostProcessListener(3500000, 10000))

        val sqlVisitor = StarRocksAntlr4Visitor()
        sqlVisitor.setCommand(trimCmd)

        try {
            try {
                // first, try parsing with potentially faster SLL mode
                sqlVisitor.visit(parser.sqlStatements())
            } catch (e: ParseCancellationException) {
                tokenStream.seek(0) // rewind input stream
                parser.reset()

                // Try Again.
                sqlVisitor.visit(parser.sqlStatements())
            }

            return sqlVisitor.getSqlStatements()
        } catch (e: ParseException) {
            if(StringUtils.isNotBlank(e.command)) {
                throw e;
            } else {
                throw e.withCommand(trimCmd)
            }
        }
    }
}
