package com.github.bigdata.sql.parser.spark

import com.github.bigdata.sql.antlr4.ParseErrorListener
import com.github.bigdata.sql.antlr4.ParseException
import com.github.bigdata.sql.antlr4.PostProcessor
import com.github.bigdata.sql.antlr4.UpperCaseCharStream
import com.github.bigdata.sql.antlr4.spark.SparkSqlBaseLexer
import com.github.bigdata.sql.antlr4.spark.SparkSqlBaseParser
import com.github.bigdata.sql.parser.StatementType
import com.github.bigdata.sql.parser.StatementType.*
import com.github.bigdata.sql.parser.StatementData
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.atn.PredictionMode
import org.antlr.v4.runtime.misc.ParseCancellationException
import org.apache.commons.lang.StringUtils

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
            CREATE_TABLE_AS_LIKE,
            DROP_TABLE,
            TRUNCATE_TABLE,
            READ_TABLE,
            MERGE_TABLE,
            REFRESH_TABLE,
            LOAD_TABLE,
            LOAD_TEMP_TABLE,
            EXPORT_TABLE,
            ANALYZE_TABLE,

            ALTER_TABLE_RENAME,
            ALTER_TABLE_ADD_COLS,
            ALTER_TABLE_PROPERTIES,
            ALTER_TABLE_RENAME_COL,
            ALTER_TABLE_DROP_PARTS,
            ALTER_TABLE_ADD_PARTS,
            ALTER_TABLE_RENAME_PART,
            ALTER_TABLE_SET_LOCATION,
            DESC_TABLE,
            MSCK_TABLE,

            SELECT,
            INSERT_VALUES,
            INSERT_SELECT,
            MULTI_INSERT,

            CREATE_VIEW,
            DROP_VIEW,
            ALTER_VIEW_QUERY,
            ALTER_VIEW_RENAME,
            ALTER_VIEW_PROPERTIES,

            SHOW, //mysql 命令
            SHOW_COLUMNS,
            SHOW_PARTITIONS,
            SHOW_TABLES,
            SHOW_TABLE,
            SHOW_TABLE_PROPERTIES,
            SHOW_CREATE_TABLE,

            SHOW_FUNCTIONS,
            DESC_FUNCTION,

            //LIST_JARS,
            //DELETE_JAR,

            KILL,
            STATUS,
            ADDJAR,
            ANGEL,

            CACHE,
            UNCACHE,
            CLEAR_CACHE,

            EXPLAIN
            -> true
            else -> false
        }
    }

    @JvmStatic fun getStatementData(command: String) : StatementData {
        val trimCmd = StringUtils.trim(command)

        val charStream = UpperCaseCharStream(CharStreams.fromString(trimCmd))
        val lexer = SparkSqlBaseLexer(charStream)
        lexer.removeErrorListeners()
        lexer.addErrorListener(ParseErrorListener())

        val tokenStream = CommonTokenStream(lexer)
        val parser = SparkSqlBaseParser(tokenStream)
        parser.addParseListener(PostProcessor())
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