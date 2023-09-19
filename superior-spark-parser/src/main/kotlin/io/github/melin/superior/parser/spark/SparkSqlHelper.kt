package io.github.melin.superior.parser.spark

import io.github.melin.superior.common.relational.Statement
import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.StatementType.*
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.atn.PredictionMode
import org.antlr.v4.runtime.misc.ParseCancellationException
import org.apache.commons.lang3.StringUtils
import io.github.melin.superior.common.antlr4.ParseErrorListener
import io.github.melin.superior.common.antlr4.ParseException
import io.github.melin.superior.common.antlr4.UpperCaseCharStream
import io.github.melin.superior.parser.spark.antlr4.SparkSqlLexer
import io.github.melin.superior.parser.spark.antlr4.SparkSqlParser
import io.github.melin.superior.parser.spark.antlr4.SparkSqlParserBaseVisitor

/**
 *
 * Created by libinsong on 2018/1/10.
 */
object SparkSqlHelper {

    @JvmStatic fun checkSupportedSQL(statementType: StatementType): Boolean {
        return when (statementType) {
            CREATE_DATABASE,
            CREATE_SCHEMA,
            CREATE_TABLE,
            CREATE_TABLE_AS_SELECT,
            CREATE_TABLE_AS_LIKE,
            TRUNCATE_TABLE,
            MERGE,
            REFRESH_TABLE,
            EXPORT_TABLE,
            ANALYZE_TABLE,

            ALTER_TABLE,
            REPAIR_TABLE,

            SELECT,
            INSERT,

            CREATE_FILE_VIEW,
            CREATE_VIEW,
            CREATE_TEMP_VIEW_USING,
            DROP_DATABASE,
            DROP_SCHEMA,
            DROP_VIEW,
            DROP_TABLE,

            SHOW,
            DESC,

            CACHE,
            UNCACHE,
            CLEAR_CACHE,

            DATATUNNEL,
            CALL,
            HELP,
            MERGE_FILE,
            SYNC_TABLE_META,
            SYNC_TABLE,
            SYNC_DATABASE,

            DELETE,
            UPDATE,

            SET,

            EXPLAIN
            -> true
            else -> false
        }
    }

    @JvmStatic fun parseStatement(command: String): Statement {
        val statements = this.parseMultiStatement(command)
        if (statements.size != 1) {
            throw IllegalStateException("only parser one sql, sql count: " + statements.size)
        } else {
            return statements.get(0)
        }
    }

    @JvmStatic fun parseMultiStatement(command: String): List<Statement> {
        val trimCmd = StringUtils.trim(command)
        val sqlVisitor = SparkSqlAntlr4Visitor(false, trimCmd)
        innerParseStatement(trimCmd, sqlVisitor)
        return sqlVisitor.getSqlStatements()
    }

    @JvmStatic fun splitSql(command: String): List<String> {
        val trimCmd = StringUtils.trim(command)
        val sqlVisitor = SparkSqlAntlr4Visitor(true, trimCmd)
        innerParseStatement(trimCmd, sqlVisitor)
        return sqlVisitor.getSplitSqls()
    }

    @JvmStatic fun checkSqlSyntax(command: String) {
        val sqlVisitor = SparkSqlParserBaseVisitor<Statement>()
        innerParseStatement(command, sqlVisitor)
    }

    private fun innerParseStatement(
        command: String,
        sqlVisitor: SparkSqlParserBaseVisitor<Statement>
    ) {
        val charStream = UpperCaseCharStream(CharStreams.fromString(command))
        val lexer = SparkSqlLexer(charStream)
        lexer.removeErrorListeners()
        lexer.addErrorListener(ParseErrorListener())

        val tokenStream = CommonTokenStream(lexer)
        val parser = SparkSqlParser(tokenStream)
        parser.addParseListener(SparkSqlPostProcessor())
        parser.removeErrorListeners()
        parser.addErrorListener(ParseErrorListener())
        parser.interpreter.predictionMode = PredictionMode.SLL

        try {
            try {
                // first, try parsing with potentially faster SLL mode
                sqlVisitor.visitSqlStatements(parser.sqlStatements())
            } catch (e: ParseCancellationException) {
                tokenStream.seek(0) // rewind input stream
                parser.reset()

                // Try Again.
                parser.interpreter.predictionMode = PredictionMode.LL
                sqlVisitor.visitSqlStatements(parser.sqlStatements())
            }
        } catch (e: ParseException) {
            if (StringUtils.isNotBlank(e.command)) {
                throw e;
            } else {
                throw e.withCommand(command)
            }
        }
    }
}
