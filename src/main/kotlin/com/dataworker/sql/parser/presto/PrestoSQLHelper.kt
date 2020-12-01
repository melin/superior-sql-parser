package com.dataworker.sql.parser.presto

import com.dataworker.sql.parser.model.StatementData
import com.dataworker.sql.parser.StatementType
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.atn.PredictionMode
import org.antlr.v4.runtime.misc.ParseCancellationException
import org.apache.commons.lang3.StringUtils
import com.dataworker.sql.parser.antlr4.ParseErrorListener
import com.dataworker.sql.parser.antlr4.ParseException
import com.dataworker.sql.parser.antlr4.PostProcessor
import com.dataworker.sql.parser.antlr4.presto.PrestoSqlBaseLexer
import com.dataworker.sql.parser.antlr4.presto.PrestoSqlBaseParser
import com.dataworker.sql.parser.antlr4.presto.CaseInsensitiveStream

/**
 *
 * Created by libinsong on 2018/1/10.
 */
object PrestoSQLHelper {

    @JvmStatic fun checkSupportedSQL(statementType: StatementType): Boolean {
        return when (statementType) {
            StatementType.SELECT -> true
            else -> false
        }
    }

    @JvmStatic fun getStatementData(command: String) : StatementData? {
        val trimCmd = StringUtils.trim(command)

        val charStream = CaseInsensitiveStream(CharStreams.fromString(trimCmd))
        val lexer = PrestoSqlBaseLexer(charStream)
        lexer.removeErrorListeners()
        lexer.addErrorListener(ParseErrorListener())

        val tokenStream = CommonTokenStream(lexer)
        val parser = PrestoSqlBaseParser(tokenStream)
        parser.removeErrorListeners()
        parser.addErrorListener(ParseErrorListener())
        parser.interpreter.predictionMode = PredictionMode.SLL

        val sqlVisitor = PrestoSQLAntlr4Visitor()
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
                parser.interpreter.predictionMode = PredictionMode.LL
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
