package io.github.melin.superior.parser.flink

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
        if (statement is FlinkCdcCreateTable) {
            val table = statement.sinkTableName
            Assert.assertEquals("user", table.tableName)
            Assert.assertEquals(2, statement.computeCols?.size)
            Assert.assertEquals("COALESCE(SPLIT_INDEX(`tbl`, 'r', 1), 'default')", statement.computeCols?.get(0)?.expression)
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
            EXCLUDING TABLE "test"
            OPTIONS('server-id'='8001-8004')
        """.trimIndent()

        val statementData = FlinkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is FlinkCdcCreateDatabase) {
            val database = statement.sinkDatabaseName
            Assert.assertEquals("holo_tpcds", database.databaseName)
            Assert.assertEquals("test", statement.excludeTable)
        } else {
            Assert.fail()
        }
    }
}
