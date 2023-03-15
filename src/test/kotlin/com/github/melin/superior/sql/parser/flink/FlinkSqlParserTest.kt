package com.github.melin.superior.sql.parser.flink

import com.github.melin.superior.sql.parser.model.*
import org.junit.Assert
import org.junit.Test

/**
 *
 * Created by libinsong on 2018/1/10.
 */
class FlinkSqlParserTest {

    @Test
    fun createTableTest() {
        val sql = """
            CREATE TABLE IF NOT EXISTS user
            WITH ('jdbcWriteBatchSize' = '1024')
            AS TABLE mysql
            OPTIONS('server-id'='8001-8004')
            ADD COLUMN (
              `t_idx` AS COALESCE(SPLIT_INDEX(`tbl`, 'r', 1), 'default') FIRST,
              `c_id` AS `id` + 10 AFTER `id`)
        """.trimIndent()

        val statementData = FlinkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is CreateTable) {
            val table = statement.sinkTable
            Assert.assertEquals("user", table.tableName)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun createDatabaseTest() {
        val sql = """
            CREATE DATABASE IF NOT EXISTS holo_tpcds 
            WITH ('sink.parallelism' = '4') 
            AS DATABASE mysql.tpcds 
            INCLUDING ALL TABLES 
            OPTIONS('server-id'='8001-8004')
        """.trimIndent()

        val statementData = FlinkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is CreateDatabase) {
            val database = statement.sinkDatabase
            Assert.assertEquals("holo_tpcds", database.databaseName)
        } else {
            Assert.fail()
        }
    }
}
