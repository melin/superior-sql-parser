package com.github.melin.superior.sql.parser.flink

import com.github.melin.superior.sql.parser.StatementType
import com.github.melin.superior.sql.parser.StatementType.*
import com.github.melin.superior.sql.parser.antlr4.*
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.atn.PredictionMode
import org.antlr.v4.runtime.misc.ParseCancellationException
import org.apache.commons.lang3.StringUtils
import com.github.melin.superior.sql.parser.antlr4.flink.FlinkSqlLexer
import com.github.melin.superior.sql.parser.antlr4.flink.FlinkSqlParser
import com.github.melin.superior.sql.parser.model.*
import java.lang.IllegalArgumentException

/**
 *
 * Created by libinsong on 2018/1/10.
 */
object FlinkSQLHelper {

    @JvmStatic fun checkSupportedSQL(statementType: StatementType): Boolean {
        return when (statementType) {
            FLINK_CDC_BEGIN,
            FLINK_CDC_END,
            FLINK_CDC_CTAS,
            FLINK_CDC_CDAS,
            -> true
            else -> false
        }
    }

    @JvmStatic fun getStatementData(command: String) : StatementData {
        val trimCmd = StringUtils.trim(command)

        val charStream = UpperCaseCharStream(CharStreams.fromString(trimCmd))
        val lexer = FlinkSqlLexer(charStream)
        lexer.removeErrorListeners()
        lexer.addErrorListener(ParseErrorListener())

        val tokenStream = CommonTokenStream(lexer)
        val parser = FlinkSqlParser(tokenStream)
        parser.addParseListener(FlinkSqlPostProcessor())
        parser.removeErrorListeners()
        parser.addErrorListener(ParseErrorListener())
        parser.interpreter.predictionMode = PredictionMode.SLL

        val sqlVisitor = FlinkSQLAntlr4Visitor()
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

    @JvmStatic fun replaceSql(sql: String, oldTable: String, newTable: String): String {
        val statementData = getStatementData(sql)
        statementData.querySql = sql
        return replaceSql(statementData, mapOf(oldTable to newTable))
    }

    @JvmStatic fun replaceSql(statementData: StatementData, oldTable: String, newTable: String): String {
        return replaceSql(statementData, mapOf(oldTable to newTable))
    }

    @JvmStatic fun replaceSql(sql: String, tables: Map<String, String>): String {
        val statementData = getStatementData(sql)
        statementData.querySql = sql
        return replaceSql(statementData, tables)
    }

    @JvmStatic fun replaceSql(statementData: StatementData, tables: Map<String, String>): String {
        val statement = statementData.statement
        val sqlType = statementData.type
        var sql: String = statementData.querySql ?: return ""

        if (statement is TableData
                && (SELECT == sqlType || INSERT_VALUES == sqlType || INSERT_SELECT == sqlType)) {

            val tokens: java.util.ArrayList<CommonToken> = ArrayList()
            for (tableSource in (statement.outpuTables + statement.inputTables)) {
                if (tables.containsKey(tableSource.getFullTableName())) {
                    tokens.addAll(tableSource.tokens)
                }
            }
            tokens.sortBy { it.start }
            tokens.reverse()
            for (token in tokens) {
                sql = innerReplaceSql(token, sql, tables)
            }

            return sql
        } else if (statement is Table && (CREATE_TABLE_AS_SELECT == sqlType || REPLACE_TABLE_AS_SELECT == sqlType)) {
            val tokens: java.util.ArrayList<CommonToken> = ArrayList()
            val tableData = statement.tableData
            if (tableData != null) {
                for (tableSource in tableData.inputTables) {
                    if (tables.containsKey(tableSource.getFullTableName())) {
                        tokens.addAll(tableSource.tokens)
                    }
                }
                tokens.sortBy { it.start }
                tokens.reverse()
                for (token in tokens) {
                    sql = innerReplaceSql(token, sql, tables)
                }
            }

            return sql
        } else if (statement is Table
                && (DROP_TABLE == sqlType || ALTER_TABLE_ADD_COLS == sqlType || ALTER_TABLE_ADD_COL == sqlType)) {

            val token = statement.token;
            sql = innerReplaceSql(token, sql, tables)

            return sql
        } else if (statement is AlterColumn
                && (ALTER_TABLE_RENAME_COL == sqlType || ALTER_TABLE_CHANGE_COL == sqlType || ALTER_TABLE_DROP_COL == sqlType)) {

            val token = statement.token;
            sql = innerReplaceSql(token, sql, tables)

            return sql
        } else if (statement is RenameTable && DROP_TABLE == sqlType) {

            var token = statement.newToken;
            sql = innerReplaceSql(token, sql, tables)

            token = statement.oldToken;
            sql = innerReplaceSql(token, sql, tables)

            return sql
        } else {
            throw IllegalArgumentException("不支持sql 类型: " + statementData.type)
        }
    }

    private fun innerReplaceSql(token: CommonToken?, sql: String, tables: Map<String, String>): String {
        var newsql = sql;
        if (token != null) {
            val tableName = StringUtils.substring(sql, token.start, token.stop + 1)
            newsql = StringUtils.substring(sql, 0, token.start) +
                    tables.get(tableName) + StringUtils.substring(sql, token.stop + 1)
        }

        return newsql
    }
}
