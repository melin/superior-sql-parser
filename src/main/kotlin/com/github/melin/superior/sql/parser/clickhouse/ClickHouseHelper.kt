package com.github.melin.superior.sql.parser.clickhouse

import com.github.melin.superior.sql.parser.StatementType
import com.github.melin.superior.sql.parser.model.StatementData
import com.github.melin.superior.sql.parser.StatementType.*
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.atn.PredictionMode
import org.antlr.v4.runtime.misc.ParseCancellationException
import org.apache.commons.lang3.StringUtils
import com.github.melin.superior.sql.parser.antlr4.ParseException
import com.github.melin.superior.sql.parser.antlr4.clickhouse.ClickHouseLexer
import com.github.melin.superior.sql.parser.antlr4.clickhouse.ClickHouseParser

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

            SELECT,
            SHOW_CREATE_TABLE,

            OPTIMIZE

            -> true
            else -> false
        }
    }

    @JvmStatic fun getStatementData(command: String) : StatementData? {
        val trimCmd = StringUtils.trim(command)

        val charStream = CharStreams.fromString(trimCmd);
        val lexer = ClickHouseLexer(charStream)

        val tokenStream = CommonTokenStream(lexer)
        val parser = ClickHouseParser(tokenStream)
        parser.interpreter.predictionMode = PredictionMode.LL

        val sqlVisitor = ClickHouseAntlr4Visitor()
        sqlVisitor.setCommand(trimCmd)

        try {
            try {
                // first, try parsing with potentially faster SLL mode
                return sqlVisitor.visit(parser.queryList())
            } catch (e: ParseCancellationException) {
                tokenStream.seek(0) // rewind input stream
                parser.reset()

                // Try Again.
                parser.interpreter.predictionMode = PredictionMode.LL
                return sqlVisitor.visit(parser.queryList())
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
