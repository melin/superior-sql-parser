package com.dataworker.sql.parser.util

import org.apache.commons.lang3.StringUtils
import java.lang.IllegalArgumentException
import com.alibaba.druid.sql.SQLUtils
import com.alibaba.druid.util.JdbcConstants
import com.dataworker.sql.parser.DbType
import com.dataworker.sql.parser.model.TableData
import com.dataworker.sql.parser.model.TableSource
import com.dataworker.sql.parser.presto.PrestoSQLHelper
import com.dataworker.sql.parser.spark.SparkSQLHelper
import com.dataworker.sql.parser.mysql.MySQLHelper

/**
 * Created by binsong.li on 2019-08-19 09:38
 */
object SqlUtils {
    fun sqlExportTables(dbType: DbType, sql: String): ArrayList<TableSource> {
        val innerSql = StringUtils.trim(sql)
        if (!StringUtils.startsWithIgnoreCase(innerSql, "select")) {
            throw IllegalArgumentException("只支持 select sql 语句: " + innerSql)
        }

        if (dbType == DbType.SPARK_SQL) {
            val statementData = SparkSQLHelper.getStatementData(sql)
            val statement = statementData.statement as TableData
            return statement.inputTables
        } else if (dbType == DbType.MYSQL || dbType == DbType.TIDB) {
            val statementData = MySQLHelper.getStatementData(sql)
            val statement = statementData.statement as TableData
            return statement.inputTables
        } else if (dbType == DbType.PRESTO) {
            val statementData = PrestoSQLHelper.getStatementData(sql)
            val statement = statementData?.statement as TableData
            return statement.inputTables
        } else if (dbType == DbType.ORACLE) {
            return parserSql(JdbcConstants.ORACLE, sql);
        } else if (dbType == DbType.TSQL) {
            return parserSql(JdbcConstants.SQL_SERVER, sql);
        } else if (dbType == DbType.DB2) {
            return parserSql(JdbcConstants.ORACLE, sql);
        } else if (dbType == DbType.POSTGRESQL) {
            return parserSql(JdbcConstants.SQL_SERVER, sql);
        } else if (dbType == DbType.DRUID) {
            return parserSql(JdbcConstants.ORACLE, sql);
        } else {
            throw IllegalArgumentException("不支持的SqlType: " + dbType.name)
        }
    }

    fun sqlFormat(dbType: DbType, sql: String): String {
        if (dbType == DbType.SPARK_SQL) {
            val result = SQLUtils.format(sql, JdbcConstants.HIVE)
            return SQLUtils.format(result, JdbcConstants.HIVE, SQLUtils.DEFAULT_LCASE_FORMAT_OPTION)
        } else if (dbType == DbType.MYSQL || dbType == DbType.TIDB) {
            val result = SQLUtils.format(sql, JdbcConstants.MYSQL)
            return SQLUtils.format(result, JdbcConstants.HIVE, SQLUtils.DEFAULT_LCASE_FORMAT_OPTION)
        } else if (dbType == DbType.ORACLE) {
            val result = SQLUtils.format(sql, JdbcConstants.ORACLE)
            return SQLUtils.format(result, JdbcConstants.HIVE, SQLUtils.DEFAULT_LCASE_FORMAT_OPTION)
        } else if (dbType == DbType.TSQL) {
            val result = SQLUtils.format(sql, JdbcConstants.SQL_SERVER)
            return SQLUtils.format(result, JdbcConstants.HIVE, SQLUtils.DEFAULT_LCASE_FORMAT_OPTION)
        } else if (dbType == DbType.DB2) {
            val result = SQLUtils.format(sql, JdbcConstants.DB2)
            return SQLUtils.format(result, JdbcConstants.HIVE, SQLUtils.DEFAULT_LCASE_FORMAT_OPTION)
        } else if (dbType == DbType.POSTGRESQL) {
            val result = SQLUtils.format(sql, JdbcConstants.POSTGRESQL)
            return SQLUtils.format(result, JdbcConstants.HIVE, SQLUtils.DEFAULT_LCASE_FORMAT_OPTION)
        } else {
            throw IllegalArgumentException("不支持的SqlType: " + dbType.name)
        }
    }

    private fun parserSql(dbType: com.alibaba.druid.DbType, sql: String): ArrayList<TableSource> {
        val stmtList = SQLUtils.parseStatements(sql, dbType)
        val stmt = stmtList[0]
        val statVisitor = SQLUtils.createSchemaStatVisitor(dbType)
        stmt.accept(statVisitor)

        val list = ArrayList<TableSource>()
        statVisitor.getTables().forEach { table, stat ->
            val names = StringUtils.split(table.name, ".")
            val tableSource = if (names.size == 2) TableSource(names.get(0), names.get(1))
            else TableSource(null, names.get(0))

            list.add(tableSource)
        }

        return list
    }
}
