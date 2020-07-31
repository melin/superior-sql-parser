package com.dataworker.sql.parser.spark

import com.dataworker.sql.parser.StatementType
import com.dataworker.sql.parser.model.StatementData
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.atn.PredictionMode
import org.antlr.v4.runtime.misc.ParseCancellationException
import org.apache.commons.lang3.StringUtils
import com.dataworker.sql.parser.antlr4.ParseErrorListener
import com.dataworker.sql.parser.antlr4.ParseException
import com.dataworker.sql.parser.antlr4.PostProcessor
import com.dataworker.sql.parser.antlr4.UpperCaseCharStream
import com.dataworker.sql.parser.antlr4.spark.SparkStreamSqlLexer
import com.dataworker.sql.parser.antlr4.spark.SparkStreamSqlParser

object SparkStreamSQLHelper {

    @JvmStatic fun checkSupportedSQL(statementType: StatementType): Boolean {
        return when (statementType) {
            StatementType.CREATE_TABLE,
            StatementType.SET,
            StatementType.INSERT_SELECT
            -> true
            else -> false
        }
    }

    @JvmStatic fun getStatementData(command: String) : ArrayList<StatementData> {
        val trimCmd = StringUtils.trim(command)

        val charStream = UpperCaseCharStream(CharStreams.fromString(trimCmd))
        val lexer = SparkStreamSqlLexer(charStream)
        lexer.removeErrorListeners()
        lexer.addErrorListener(ParseErrorListener())

        val tokenStream = CommonTokenStream(lexer)
        val parser = SparkStreamSqlParser(tokenStream)
        parser.addParseListener(PostProcessor())
        parser.removeErrorListeners()
        parser.addErrorListener(ParseErrorListener())
        parser.interpreter.predictionMode = PredictionMode.SLL

        val sqlVisitor = SparkStreamSQLAntlr4Visitor()
        sqlVisitor.setCommand(trimCmd)
        try {
            try {
                // first, try parsing with potentially faster SLL mode
                sqlVisitor.visit(parser.sqlStatements())
                return sqlVisitor.getTableDatas()
            }
            catch (e: ParseCancellationException) {
                tokenStream.seek(0) // rewind input stream
                parser.reset()

                // Try Again.
                parser.interpreter.predictionMode = PredictionMode.LL
                sqlVisitor.visit(parser.sqlStatements())
                return sqlVisitor.getTableDatas()
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
