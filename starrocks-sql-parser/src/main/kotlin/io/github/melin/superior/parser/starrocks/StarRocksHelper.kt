package io.github.melin.superior.parser.starrocks

import io.github.melin.superior.common.relational.Statement
import io.github.melin.superior.common.StatementType
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
    @JvmStatic fun checkSupportedSQL(statementType: StatementType): Boolean {
        return when (statementType) {
            StatementType.SELECT -> true
            else -> false
        }
    }

    @JvmStatic fun getStatementData(command: String): Statement {
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
                return sqlVisitor.visit(parser.singleStatement())
            }
            catch (e: ParseCancellationException) {
                tokenStream.seek(0) // rewind input stream
                parser.reset()

                // Try Again.
                return sqlVisitor.visit(parser.singleStatement())
            }
        } catch (e: ParseException) {
            if(StringUtils.isNotBlank(e.command)) {
                throw e;
            } else {
                throw e.withCommand(trimCmd)
            }
        }
    }
}
