package com.dataworker.sql.parser.tsql

import com.dataworker.sql.parser.StatementType
import com.dataworker.sql.parser.antlr4.ParseErrorListener
import com.dataworker.sql.parser.antlr4.ParseException
import com.dataworker.sql.parser.antlr4.PostProcessor
import com.dataworker.sql.parser.antlr4.UpperCaseCharStream
import com.dataworker.sql.parser.antlr4.tsql.TSqlLexer
import com.dataworker.sql.parser.antlr4.tsql.TSqlParser
import com.dataworker.sql.parser.model.StatementData
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.atn.PredictionMode
import org.antlr.v4.runtime.misc.ParseCancellationException
import org.apache.commons.lang3.StringUtils

/**
 * Created by libinsong on 2020/6/30 10:01 上午
 */
object TsqlHelper {
    @JvmStatic fun checkSupportedSQL(statementType: StatementType): Boolean {
        return when (statementType) {
            StatementType.SELECT -> true
            else -> false
        }
    }

    @JvmStatic fun getStatementData(command: String) : StatementData? {
        val trimCmd = StringUtils.trim(command)

        val charStream = UpperCaseCharStream(CharStreams.fromString(trimCmd))
        val lexer = TSqlLexer(charStream)
        lexer.removeErrorListeners()
        lexer.addErrorListener(ParseErrorListener())

        val tokenStream = CommonTokenStream(lexer)
        val parser = TSqlParser(tokenStream)
        parser.removeErrorListeners()
        parser.addErrorListener(ParseErrorListener())
        parser.interpreter.predictionMode = PredictionMode.SLL

        val sqlVisitor = TsqlAntlr4Visitor()

        try {
            try {
                // first, try parsing with potentially faster SLL mode
                return sqlVisitor.visit(parser.sql_clause())
            }
            catch (e: ParseCancellationException) {
                tokenStream.seek(0) // rewind input stream
                parser.reset()

                // Try Again.
                parser.interpreter.predictionMode = PredictionMode.LL
                return sqlVisitor.visit(parser.sql_clause())
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
