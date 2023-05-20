package io.github.melin.superior.parser.postgre

import io.github.melin.superior.common.relational.Statement
import io.github.melin.superior.common.antlr4.ParseErrorListener
import io.github.melin.superior.common.antlr4.ParseException
import io.github.melin.superior.common.antlr4.UpperCaseCharStream
import io.github.melin.superior.common.StatementType
import io.github.melin.superior.parser.postgre.antlr4.PostgreSqlLexer
import io.github.melin.superior.parser.postgre.antlr4.PostgreSqlParser
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.atn.PredictionMode
import org.antlr.v4.runtime.misc.ParseCancellationException
import org.apache.commons.lang3.StringUtils

/**
 * Created by libinsong on 2020/6/30 9:58 上午
 */
object PostgreSqlHelper {

    @JvmStatic fun checkSupportedSQL(statementType: StatementType): Boolean {
        return when (statementType) {
            StatementType.CREATE_TABLE -> true
            StatementType.CREATE_VIEW -> true
            StatementType.ALTER_TABLE -> true
            StatementType.CREATE_FUNCTION -> true
            StatementType.CREATE_PROCEDURE -> true

            StatementType.DROP_TABLE -> true
            StatementType.DROP_VIEW -> true

            StatementType.SELECT -> true
            StatementType.CREATE_TABLE_AS_SELECT -> true
            else -> false
        }
    }

    @JvmStatic fun getStatementData(command: String): Statement {
        val trimCmd = StringUtils.trim(command)

        val charStream =
            UpperCaseCharStream(CharStreams.fromString(trimCmd))
        val lexer = PostgreSqlLexer(charStream)
        lexer.removeErrorListeners()
        lexer.addErrorListener(ParseErrorListener())

        val tokenStream = CommonTokenStream(lexer)
        val parser = PostgreSqlParser(tokenStream)
        parser.removeErrorListeners()
        parser.addErrorListener(ParseErrorListener())
        //parser.interpreter.predictionMode = PredictionMode.SLL

        val sqlVisitor = PostgreSqlAntlr4Visitor()
        try {
            try {
                // first, try parsing with potentially faster SLL mode
                return sqlVisitor.visit(parser.stmt())
            } catch (e: ParseCancellationException) {
                tokenStream.seek(0) // rewind input stream
                parser.reset()

                // Try Again.
                parser.interpreter.predictionMode = PredictionMode.LL
                return sqlVisitor.visit(parser.stmt())
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
