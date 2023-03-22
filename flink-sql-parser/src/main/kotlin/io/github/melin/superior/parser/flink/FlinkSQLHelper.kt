package io.github.melin.superior.parser.flink

import io.github.melin.superior.common.StatementData
import io.github.melin.superior.common.StatementType
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.atn.PredictionMode
import org.antlr.v4.runtime.misc.ParseCancellationException
import org.apache.commons.lang3.StringUtils
import io.github.melin.superior.common.StatementType.*
import io.github.melin.superior.common.antlr4.ParseErrorListener
import io.github.melin.superior.common.antlr4.ParseException
import io.github.melin.superior.common.antlr4.UpperCaseCharStream
import io.github.melin.superior.parser.flink.antlr4.FlinkSqlLexer
import io.github.melin.superior.parser.flink.antlr4.FlinkSqlParser

/**
 *
 * Created by libinsong on 2018/1/10.
 */
object FlinkSQLHelper {

    @JvmStatic fun checkSupportedSQL(statementType: StatementType): Boolean {
        return when (statementType) {
            FLINK_CDC_BEGIN,
            FLINK_CDC_END,
            FLINK_CDC_CTAS,
            FLINK_CDC_CDAS,
            -> true
            else -> false
        }
    }

    @JvmStatic fun getStatementData(command: String) : StatementData {
        val trimCmd = StringUtils.trim(command)

        val charStream =
            UpperCaseCharStream(CharStreams.fromString(trimCmd))
        val lexer = FlinkSqlLexer(charStream)
        lexer.removeErrorListeners()
        lexer.addErrorListener(ParseErrorListener())

        val tokenStream = CommonTokenStream(lexer)
        val parser = FlinkSqlParser(tokenStream)
        parser.addParseListener(FlinkSqlPostProcessor())
        parser.removeErrorListeners()
        parser.addErrorListener(ParseErrorListener())
        parser.interpreter.predictionMode = PredictionMode.SLL

        val sqlVisitor = FlinkSQLAntlr4Visitor()
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
                return sqlVisitor.visit(parser.statement())
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
