package com.github.bigdata.sql.parser.job

import com.github.bigdata.sql.antlr4.ParseErrorListener
import com.github.bigdata.sql.antlr4.ParseException
import com.github.bigdata.sql.antlr4.PostProcessor
import com.github.bigdata.sql.antlr4.UpperCaseCharStream
import com.github.bigdata.sql.antlr4.job.JobTaskLexer
import com.github.bigdata.sql.antlr4.job.JobTaskParser
import com.github.bigdata.sql.parser.StatementData
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.atn.PredictionMode
import org.antlr.v4.runtime.misc.ParseCancellationException
import org.apache.commons.lang.StringUtils

/**
 *
 * Created by binsong.li on 2018/3/31 下午1:47
 */
object JobTaskHelper {

    @JvmStatic fun getStatementData(command: String) : ArrayList<StatementData> {
        val trimCmd = StringUtils.trim(command)

        val charStream = UpperCaseCharStream(CharStreams.fromString(trimCmd))
        val lexer = JobTaskLexer(charStream)
        lexer.removeErrorListeners()
        lexer.addErrorListener(ParseErrorListener())

        val tokenStream = CommonTokenStream(lexer)
        val parser = JobTaskParser(tokenStream)
        parser.addParseListener(PostProcessor())
        parser.removeErrorListeners()
        parser.addErrorListener(ParseErrorListener())
        parser.interpreter.predictionMode = PredictionMode.SLL

        val cmdVisitor = JobTaskAntlr4Visitor()
        cmdVisitor.setCommand(trimCmd)
        try {
            try {
                // first, try parsing with potentially faster SLL mode
                cmdVisitor.visit(parser.jobTasks())
                return cmdVisitor.getTableDatas()
            }
            catch (e: ParseCancellationException) {
                tokenStream.seek(0) // rewind input stream
                parser.reset()

                // Try Again.
                parser.interpreter.predictionMode = PredictionMode.LL
                cmdVisitor.visit(parser.jobTasks())
                return cmdVisitor.getTableDatas()
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