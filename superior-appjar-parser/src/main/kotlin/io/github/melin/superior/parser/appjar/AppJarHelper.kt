package io.github.melin.superior.parser.appjar

import com.github.melin.superior.sql.parser.util.CommonUtils
import io.github.melin.superior.common.antlr4.AntlrCaches.RELEASE_ANTLR_CACHE_AFTER_PARSING
import io.github.melin.superior.common.antlr4.ParseErrorListener
import io.github.melin.superior.common.antlr4.ParseException
import io.github.melin.superior.common.antlr4.UpperCaseCharStream
import io.github.melin.superior.common.relational.Statement
import io.github.melin.superior.parser.job.antlr4.AppJarLexer
import io.github.melin.superior.parser.job.antlr4.AppJarParser
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.atn.PredictionMode
import org.antlr.v4.runtime.misc.ParseCancellationException
import org.apache.commons.lang3.StringUtils

/** Created by binsong.li on 2018/3/31 下午1:47 */
object AppJarHelper {

    @JvmStatic
    fun sqlKeywords(): List<String> {
        val keywords = hashSetOf<String>()
        (0 until AppJarLexer.VOCABULARY.maxTokenType).forEach { idx ->
            val name = AppJarLexer.VOCABULARY.getLiteralName(idx)
            if (name != null) {
                val matchResult = CommonUtils.KEYWORD_REGEX.find(name)
                if (matchResult != null) {
                    keywords.add(matchResult.groupValues.get(1))
                }
            }
        }

        return keywords.sorted()
    }

    @JvmStatic
    fun parseStatement(command: String): ArrayList<Statement> {
        val trimCmd = StringUtils.trim(command)

        val charStream = UpperCaseCharStream(CharStreams.fromString(trimCmd))
        val lexer = AppJarLexer(charStream)
        lexer.removeErrorListeners()
        lexer.addErrorListener(ParseErrorListener())

        val tokenStream = CommonTokenStream(lexer)
        val parser = AppJarParser(tokenStream)
        AbstractJarParser.installCaches(parser)
        parser.removeErrorListeners()
        parser.addErrorListener(ParseErrorListener())
        parser.interpreter.predictionMode = PredictionMode.SLL

        val cmdVisitor = AppJarAntlr4Visitor()
        cmdVisitor.setCommand(trimCmd)
        try {
            try {
                // first, try parsing with potentially faster SLL mode
                cmdVisitor.visit(parser.jobTasks())
                return cmdVisitor.getJobStmts()
            } catch (e: ParseCancellationException) {
                tokenStream.seek(0) // rewind input stream
                parser.reset()

                // Try Again.
                parser.interpreter.predictionMode = PredictionMode.LL
                cmdVisitor.visit(parser.jobTasks())
                return cmdVisitor.getJobStmts()
            }
        } catch (e: ParseException) {
            if (StringUtils.isNotBlank(e.command)) {
                throw e
            } else {
                throw e.withCommand(trimCmd)
            }
        } finally {
            val releaseAntlrCache =
                System.getenv(RELEASE_ANTLR_CACHE_AFTER_PARSING)
            if (releaseAntlrCache == null || "true".equals(releaseAntlrCache)) {
                AbstractJarParser.refreshParserCaches()
            }
        }
    }
}
