package io.github.melin.superior.parser.spark

import io.github.melin.superior.common.StatementData
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

/**
 *
 * Created by libinsong on 2018/1/10.
 */
object SparkSQLHelper {

    @JvmStatic fun checkSupportedSQL(statementType: StatementType): Boolean {
        return when (statementType) {
            DESC_DATABASE,

            CREATE_TABLE,
            CREATE_TABLE_AS_SELECT,
            REPLACE_TABLE,
            REPLACE_TABLE_AS_SELECT,
            CREATE_TABLE_AS_LIKE,
            DROP_TABLE,
            TRUNCATE_TABLE,
            MERGE_TABLE,
            REFRESH_TABLE,
            LOAD_TEMP_TABLE,
            EXPORT_TABLE,
            ANALYZE_TABLE,

            ALTER_TABLE_RENAME,
            ALTER_TABLE_ADD_COLS,
            ALTER_TABLE_PROPERTIES,
            ALTER_TABLE_RENAME_COL,
            ALTER_TABLE_CHANGE_COL,
            ALTER_TABLE_DROP_PARTS,
            ALTER_TABLE_ADD_PARTS,
            ALTER_TABLE_RENAME_PART,
            ALTER_TABLE_SET_LOCATION,
            DESC_TABLE,
            MSCK_TABLE,
            ALTER_TABLE_TOUCH,

            SELECT,
            INSERT_VALUES,
            INSERT_SELECT,
            MULTI_INSERT,

            CREATE_VIEW,
            CREATE_TEMPORARY_VIEW,
            DROP_VIEW,
            ALTER_VIEW_QUERY,
            ALTER_VIEW_RENAME,
            ALTER_VIEW_PROPERTIES,

            SHOW, //mysql 命令
            SHOW_COLUMNS,
            SHOW_PARTITIONS,
            SHOW_TABLES,
            SHOW_VIEWS,
            SHOW_TABLE_EXTENDED,
            SHOW_TABLE_PROPERTIES,
            SHOW_CREATE_TABLE,

            SHOW_FUNCTIONS,
            DESC_FUNCTION,

            CACHE,
            UNCACHE,
            CLEAR_CACHE,

            DATATUNNEL,
            CALL,
            SYNC,

            DELETE,
            UPDATE,
            MERGE_INTO_TABLE,

            EXPLAIN
            -> true
            else -> false
        }
    }

    @JvmStatic fun getStatementData(command: String) : StatementData {
        val trimCmd = StringUtils.trim(command)

        val charStream =
            UpperCaseCharStream(CharStreams.fromString(trimCmd))
        val lexer = SparkSqlLexer(charStream)
        lexer.removeErrorListeners()
        lexer.addErrorListener(ParseErrorListener())

        val tokenStream = CommonTokenStream(lexer)
        val parser = SparkSqlParser(tokenStream)
        parser.addParseListener(SparkSqlPostProcessor())
        parser.removeErrorListeners()
        parser.addErrorListener(ParseErrorListener())
        parser.interpreter.predictionMode = PredictionMode.SLL

        val sqlVisitor = SparkSQLAntlr4Visitor()
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
