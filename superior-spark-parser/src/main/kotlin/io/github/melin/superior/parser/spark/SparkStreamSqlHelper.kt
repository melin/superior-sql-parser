package io.github.melin.superior.parser.spark

import com.github.melin.superior.sql.parser.util.CommonUtils
import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.antlr4.AntlrCaches
import io.github.melin.superior.common.antlr4.ParseErrorListener
import io.github.melin.superior.common.antlr4.ParseException
import io.github.melin.superior.common.antlr4.UpperCaseCharStream
import io.github.melin.superior.common.relational.Statement
import io.github.melin.superior.parser.spark.antlr4.SparkStreamSqlLexer
import io.github.melin.superior.parser.spark.antlr4.SparkStreamSqlParser
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.atn.PredictionMode
import org.antlr.v4.runtime.misc.ParseCancellationException
import org.apache.commons.lang3.StringUtils

object SparkStreamSqlHelper {

    @JvmStatic
    fun checkSupportedSQL(statementType: StatementType): Boolean {
        return when (statementType) {
            StatementType.CREATE_TABLE,
            StatementType.SET,
            StatementType.INSERT -> true
            else -> false
        }
    }

    @JvmStatic
    fun sqlKeywords(): List<String> {
        val keywords = hashSetOf<String>()
        (0 until SparkStreamSqlLexer.VOCABULARY.maxTokenType).forEach { idx ->
            val name = SparkStreamSqlLexer.VOCABULARY.getLiteralName(idx)
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
        val lexer = SparkStreamSqlLexer(charStream)
        lexer.removeErrorListeners()
        lexer.addErrorListener(ParseErrorListener())

        val tokenStream = CommonTokenStream(lexer)
        val parser = SparkStreamSqlParser(tokenStream)
        AbstractSparkStreamSqlParser.installCaches(parser)
        parser.addParseListener(SparkSqlPostProcessor())
        parser.removeErrorListeners()
        parser.addErrorListener(ParseErrorListener())
        parser.interpreter.predictionMode = PredictionMode.LL

        val sqlVisitor = SparkStreamSqlAntlr4Visitor()
        try {
            try {
                // first, try parsing with potentially faster SLL mode
                sqlVisitor.visit(parser.sqlStatements())
                return sqlVisitor.getTableDatas()
            } catch (e: ParseCancellationException) {
                tokenStream.seek(0) // rewind input stream
                parser.reset()

                // Try Again.
                parser.interpreter.predictionMode = PredictionMode.LL
                sqlVisitor.visit(parser.sqlStatements())
                return sqlVisitor.getTableDatas()
            }
        } catch (e: ParseException) {
            if (StringUtils.isNotBlank(e.command)) {
                throw e
            } else {
                throw e.withCommand(trimCmd)
            }
        } finally {
            val releaseAntlrCache = System.getenv(AntlrCaches.RELEASE_ANTLR_CACHE_AFTER_PARSING)
            if (releaseAntlrCache == null || "true".equals(releaseAntlrCache)) {
                AbstractSparkStreamSqlParser.refreshParserCaches()
            }
        }
    }
}
