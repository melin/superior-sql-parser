package com.github.melin.superior.sql.parser.mysql

import com.google.common.collect.Lists
import io.github.melin.superior.common.relational.Statement
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream
import org.antlr.v4.runtime.ParserRuleContext
import org.antlr.v4.runtime.atn.PredictionMode
import org.antlr.v4.runtime.misc.ParseCancellationException
import org.antlr.v4.runtime.tree.TerminalNodeImpl
import org.apache.commons.lang3.StringUtils
import io.github.melin.superior.common.antlr4.ParseErrorListener
import io.github.melin.superior.common.antlr4.ParseException
import io.github.melin.superior.common.antlr4.UpperCaseCharStream
import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.DefaultStatement
import io.github.melin.superior.parser.mysql.MySQLAntlr4Visitor
import io.github.melin.superior.parser.mysql.antlr4.MySqlLexer
import io.github.melin.superior.parser.mysql.antlr4.MySqlParser

/**
 *
 * Created by libinsong on 2018/1/10.
 */
object MySQLHelper {

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

        if (StringUtils.startsWithIgnoreCase(trimCmd,"show")) {
            return Lists.newArrayList(DefaultStatement(StatementType.SHOW))
        }

        val charStream =
            UpperCaseCharStream(CharStreams.fromString(trimCmd))
        val lexer = MySqlLexer(charStream)
        lexer.removeErrorListeners()
        lexer.addErrorListener(ParseErrorListener())

        val tokenStream = CommonTokenStream(lexer)
        val parser = MySqlParser(tokenStream)
        parser.removeErrorListeners()
        parser.addErrorListener(ParseErrorListener())

        val sqlVisitor = MySQLAntlr4Visitor()
        sqlVisitor.setCommand(command)
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
            return sqlVisitor.getSqlStatements()
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

        val charStream =
            UpperCaseCharStream(CharStreams.fromString(sql))
        val lexer = MySqlLexer(charStream)
        lexer.removeErrorListeners()
        lexer.addErrorListener(ParseErrorListener())

        val tokens = CommonTokenStream(lexer)
        val parser = MySqlParser(tokens)
        val statement = parser.sqlStatement().getChild(0).getChild(0)

        if (statement is MySqlParser.AlterTableContext) {
            val tableNameContext = statement.getChild(2) as MySqlParser.TableNameContext
            val stopIndex = tableNameContext.stop.stopIndex
            val alterSqlPrefix = StringUtils.substring(sql, 0, stopIndex + 1);

            val childStat = statement.getChild(3)
            if (childStat is MySqlParser.AlterByAddColumnsContext) {
                val child = childStat.getChild(2)
                var startIndex = if(child is MySqlParser.UidContext) {
                    val rightNode = child.getChild(0)
                    if (rightNode is TerminalNodeImpl) {
                        rightNode.symbol.startIndex
                    } else {
                        val childNode = rightNode.getChild(0)
                        if (childNode is MySqlParser.EngineNameContext) {
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
                    val stopIndex = if (stopContext != null) stopContext.symbol.startIndex else -1;

                    var sql = if(stopIndex > 0) {
                        StringUtils.substring(sql, startIndex, stopIndex)
                    } else {
                        StringUtils.substring(sql, startIndex)
                    }

                    sql = StringUtils.trim(sql)
                    if (StringUtils.endsWith(sql, ";")) {
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
