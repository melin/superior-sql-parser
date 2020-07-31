package com.dataworker.sql.parser.clickhouse

import com.dataworker.sql.parser.model.StatementData
import com.dataworker.sql.parser.StatementType
import com.dataworker.sql.parser.StatementType.*
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.atn.PredictionMode
import org.antlr.v4.runtime.misc.ParseCancellationException
import org.apache.commons.lang3.StringUtils
import com.dataworker.sql.parser.antlr4.ParseErrorListener
import com.dataworker.sql.parser.antlr4.ParseException
import com.dataworker.sql.parser.antlr4.PostProcessor
import com.dataworker.sql.parser.antlr4.UpperCaseCharStream
import com.dataworker.sql.parser.antlr4.clickhouse.ClickHouseLexer
import com.dataworker.sql.parser.antlr4.clickhouse.ClickHouseParser

/**
 *
 * Created by libinsong on 2018/1/10.
 */
object ClickHouseHelper {

    @JvmStatic fun checkSupportedSQL(statementType: StatementType): Boolean {
        return when (statementType) {
            CREATE_TABLE,
            CREATE_TABLE_AS_SELECT,
            DROP_TABLE,
            TRUNCATE_TABLE,

            SELECT,
            INSERT_VALUES,
            INSERT_SELECT,

            CREATE_VIEW,
            DROP_VIEW,

            SHOW_CREATE_TABLE,
            SHOW_FUNCTIONS,

            DELETE,
            UPDATE
            -> true
            else -> false
        }
    }

    @JvmStatic fun getStatementData(command: String) : StatementData {
        val trimCmd = StringUtils.trim(command)

        val charStream = UpperCaseCharStream(CharStreams.fromString(trimCmd))
        val lexer = ClickHouseLexer(charStream)
        lexer.removeErrorListeners()
        lexer.addErrorListener(ParseErrorListener())

        val tokenStream = CommonTokenStream(lexer)
        val parser = ClickHouseParser(tokenStream)
        parser.addParseListener(PostProcessor())
        parser.removeErrorListeners()
        parser.addErrorListener(ParseErrorListener())
        parser.interpreter.predictionMode = PredictionMode.SLL

        val sqlVisitor = ClickHouseAntlr4Visitor()
        sqlVisitor.setCommand(trimCmd)

        try {
            try {
                // first, try parsing with potentially faster SLL mode
                return sqlVisitor.visit(parser.query())
            }
            catch (e: ParseCancellationException) {
                tokenStream.seek(0) // rewind input stream
                parser.reset()

                // Try Again.
                parser.interpreter.predictionMode = PredictionMode.LL
                return sqlVisitor.visit(parser.query())
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
