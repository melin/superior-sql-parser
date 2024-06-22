package io.github.melin.superior.parser.flink

import io.github.melin.superior.common.relational.common.SyncDatabase
import io.github.melin.superior.common.relational.common.SyncTable
import org.junit.Assert
import org.junit.Test

/** Created by libinsong on 2018/1/10. */
class FlinkCdcSqlParserTest {

    @Test
    fun createTableTest() {
        val sql =
            """
            CREATE TABLE IF NOT EXISTS qeqw 
            WITH ('jdbcWriteBatchSize' = '1024')
            AS TABLE mysql
            OPTIONS('server-id'='8001-8004')
        """
                .trimIndent()

        val statement = FlinkSqlHelper.parseStatement(sql)
        if (statement is SyncTable) {
            val table = statement.sinkTableId
            Assert.assertEquals("qeqw", table.tableName)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun createDatabaseTest() {
        val sql =
            """
            CREATE DATABASE IF NOT EXISTS holo_tpcds 
            WITH ('sink.parallelism' = '4') 
            AS DATABASE mysql.tpcds 
            INCLUDING ALL TABLES 
            EXCLUDING TABLE "test"
            OPTIONS('server-id'='8001-8004')
        """
                .trimIndent()

        val statement = FlinkSqlHelper.parseStatement(sql)
        if (statement is SyncDatabase) {
            Assert.assertEquals("holo_tpcds", statement.sinkDatabaseName)
            Assert.assertEquals("test", statement.excludingTables)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun createDatabaseFromKafkaTest() {
        val sql =
            """
            CREATE DATABASE IF NOT EXISTS flink_cdc_demos 
            WITH (
                'connector' = 'jdbc',
                'url' = 'jdbc:mysql://172.18.1.55:3306/flink_cdc_demos?characterEncoding=utf-8&useSSL=false',
                'username' = 'root',
                'password' = 'Datac@123',
                'table-name' = '${'$'}{tableName}',
                'sink.buffer-flush.interval' = '2s',
                'sink.buffer-flush.max-rows' = '100',
                'sink.max-retries' = '5'
            ) 
            AS DATABASE `demo1, demo2, demo3, demo4`
            OPTIONS(
            	'connector' = 'kafka',
                'brokers' = '172.18.1.56:9093'
            )
        """
                .trimIndent()

        val statement = FlinkSqlHelper.parseStatement(sql)
        if (statement is SyncDatabase) {
            Assert.assertEquals(
                "demo1, demo2, demo3, demo4",
                statement.sourceDatabaseName
            )
            Assert.assertEquals(
                "172.18.1.56:9093",
                statement.sourceOptions?.get("brokers")
            )
        } else {
            Assert.fail()
        }
    }
}
