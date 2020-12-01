package com.dataworker.sql.parser.mysql

import com.dataworker.sql.parser.model.StatementData
import com.dataworker.sql.parser.StatementType
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.ParserRuleContext
import org.antlr.v4.runtime.atn.PredictionMode
import org.antlr.v4.runtime.misc.ParseCancellationException
import org.antlr.v4.runtime.tree.TerminalNodeImpl
import org.apache.commons.lang3.StringUtils
import com.dataworker.sql.parser.antlr4.ParseErrorListener
import com.dataworker.sql.parser.antlr4.ParseException
import com.dataworker.sql.parser.antlr4.PostProcessor
import com.dataworker.sql.parser.antlr4.UpperCaseCharStream
import com.dataworker.sql.parser.antlr4.mysql.MySQLLexer
import com.dataworker.sql.parser.antlr4.mysql.MySQLParser

/**
 *
 * Created by libinsong on 2018/1/10.
 */
object MySQLHelper {

    @JvmStatic fun checkSupportedSQL(statementType: StatementType?): Boolean {
        return when (statementType) {
            StatementType.CREATE_TABLE,
            StatementType.DROP_TABLE_TIDB,
            StatementType.TRUNCATE_TABLE,
            StatementType.RENAME_TABLE,
            StatementType.ALTER_TABLE_CHANGE_COL,
            StatementType.ALTER_TABLE_MODIFY_COL,
            StatementType.ALTER_TABLE_ADD_COL,
            StatementType.ALTER_TABLE_DROP_COL,
            StatementType.ALTER_TABLE_ADD_INDEX,
            StatementType.ALTER_TABLE_DROP_INDEX,
            StatementType.ALTER_TABLE_ADD_UNIQUE_KEY,

            StatementType.INSERT_SELECT,
            StatementType.INSERT_VALUES,
            StatementType.SELECT,
            StatementType.DELETE,
            StatementType.UPDATE,
            StatementType.ANALYZE_TABLE,
            StatementType.SHOW
            -> true
            else -> false
        }
    }

    @JvmStatic fun getStatementData(command: String) : StatementData {
        val trimCmd = StringUtils.trim(command)

        if(StringUtils.startsWithIgnoreCase(trimCmd,"show")) {
            return StatementData(StatementType.SHOW, null)
        }

        val charStream = UpperCaseCharStream(CharStreams.fromString(trimCmd))
        val lexer = MySQLLexer(charStream)
        lexer.removeErrorListeners()
        lexer.addErrorListener(ParseErrorListener())

        val tokenStream = CommonTokenStream(lexer)
        val parser = MySQLParser(tokenStream)
        parser.removeErrorListeners()
        parser.addErrorListener(ParseErrorListener())
        parser.interpreter.predictionMode = PredictionMode.LL

        val sqlVisitor = MySQLAntlr4Visitor()
        try {
            try {
                // first, try parsing with potentially faster SLL mode
                val data = sqlVisitor.visit(parser.sqlStatement())
                if(data == null) {
                    return StatementData(StatementType.UNKOWN)
                } else {
                    return data
                }
            }
            catch (e: ParseCancellationException) {
                tokenStream.seek(0) // rewind input stream
                parser.reset()

                // Try Again.
                parser.interpreter.predictionMode = PredictionMode.LL
                val data = sqlVisitor.visit(parser.sqlStatement())
                if(data == null) {
                    return StatementData(StatementType.UNKOWN)
                } else {
                    return data
                }
            }
        } catch (e: ParseException) {
            if(StringUtils.isNotBlank(e.command)) {
                throw e;
            } else {
                throw e.withCommand(trimCmd)
            }
        }
    }

    @JvmStatic fun splitAlterSql(sql: String): List<String> {
        val _items = mutableListOf<String>()

        val charStream = UpperCaseCharStream(CharStreams.fromString(sql))
        val lexer = MySQLLexer(charStream)
        lexer.removeErrorListeners()
        lexer.addErrorListener(ParseErrorListener())

        val tokens = CommonTokenStream(lexer)
        val parser = MySQLParser(tokens)
        val statement = parser.sqlStatement().getChild(0).getChild(0)

        if (statement is MySQLParser.AlterTableContext) {
            val tableNameContext = statement.getChild(2) as MySQLParser.TableNameContext
            val stopIndex = tableNameContext.stop.stopIndex
            val alterSqlPrefix = StringUtils.substring(sql, 0, stopIndex + 1);

            val childStat = statement.getChild(3)
            if (childStat is MySQLParser.AlterByAddColumnsContext) {
                val child = childStat.getChild(2)
                var startIndex = if(child is MySQLParser.UidContext) {
                    val rightNode = child.getChild(0)
                    if (rightNode is TerminalNodeImpl) {
                        rightNode.symbol.startIndex
                    } else {
                        val childNode = rightNode.getChild(0)
                        if (childNode is MySQLParser.EngineNameContext) {
                            childNode.start.startIndex
                        } else {
                            val node = rightNode.getChild(0) as TerminalNodeImpl
                            node.symbol.startIndex
                        }
                    }
                } else {
                    val right = child as TerminalNodeImpl
                    right.symbol.startIndex + 1
                }

                for(i in 3 .. childStat.childCount) {
                    val node = childStat.getChild(i)
                    if(node is TerminalNodeImpl) {
                        if("," == node.text) {
                            val alterSql = StringUtils.substring(sql, startIndex, node.symbol.startIndex)
                            _items.add(alterSqlPrefix + " ADD COLUMN " + alterSql)
                            startIndex = node.symbol.startIndex + 1
                        }
                    }
                }

                var alterSql = StringUtils.substring(sql, startIndex)
                alterSql = StringUtils.substringBeforeLast(alterSql, ")")
                _items.add(alterSqlPrefix + " ADD COLUMN " + alterSql)

            } else {
                val childCount = statement.childCount;

                var index = 3
                while (index < childCount) {
                    val startContext = statement.getChild(index) as ParserRuleContext
                    index = index + 1
                    val stopContext:TerminalNodeImpl?
                            = if(index<childCount) statement.getChild(index) as TerminalNodeImpl else null

                    val startIndex = startContext.start.startIndex
                    val stopIndex = if(stopContext != null) stopContext.symbol.startIndex else -1;

                    var sql = if(stopIndex > 0) {
                        StringUtils.substring(sql, startIndex, stopIndex)
                    } else {
                        StringUtils.substring(sql, startIndex)
                    }

                    sql = StringUtils.trim(sql)
                    if(StringUtils.endsWith(sql, ";")) {
                        sql = StringUtils.substring(sql, 0, -1)
                    }

                    _items.add(alterSqlPrefix + " " + sql)

                    index = index + 1
                }
            }
        }

        return _items.toList()
    }
}
