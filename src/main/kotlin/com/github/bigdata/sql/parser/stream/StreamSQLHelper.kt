package com.github.bigdata.sql.parser.stream

import com.github.bigdata.sql.antlr4.ParseErrorListener
import com.github.bigdata.sql.antlr4.ParseException
import com.github.bigdata.sql.antlr4.PostProcessor
import com.github.bigdata.sql.antlr4.UpperCaseCharStream
import com.github.bigdata.sql.antlr4.stream.StreamSqlLexer
import com.github.bigdata.sql.antlr4.stream.StreamSqlParser
import com.github.bigdata.sql.parser.StatementData
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.atn.PredictionMode
import org.antlr.v4.runtime.misc.ParseCancellationException
import org.apache.commons.lang.StringUtils

object StreamSQLHelper {

    @JvmStatic fun getStatementData(command: String) : ArrayList<StatementData> {
        val trimCmd = StringUtils.trim(command)

        val charStream = UpperCaseCharStream(CharStreams.fromString(trimCmd))
        val lexer = StreamSqlLexer(charStream)
        lexer.removeErrorListeners()
        lexer.addErrorListener(ParseErrorListener())

        val tokenStream = CommonTokenStream(lexer)
        val parser = StreamSqlParser(tokenStream)
        parser.addParseListener(PostProcessor())
        parser.removeErrorListeners()
        parser.addErrorListener(ParseErrorListener())
        parser.interpreter.predictionMode = PredictionMode.SLL

        val sqlVisitor = StreamSQLAntlr4Visitor()
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