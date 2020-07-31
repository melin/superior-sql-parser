package com.dataworker.sql.parser.clickhouse

import com.dataworker.sql.parser.StatementType
import com.dataworker.sql.parser.model.DcTable
import com.dataworker.sql.parser.model.TableData
import org.junit.Assert
import org.junit.Test

/**
 *
 * Created by libinsong on 2018/1/10.
 */
class ClickHouseParserTest {

    //@Test
    fun createTableTest() {
        val sql = """CREATE TABLE ods.access_log (
              add_time DateTime,
              big_app_id String,
              app_id String,
              seq_id Nullable(String),
              uuid Nullable(String),
              time Nullable(String),
              device_key Nullable(String),
              manufacturer Nullable(String),
              ds Date
            ) ENGINE = MergeTree() 
            PARTITION BY toYYYYMM(ds)
            ORDER BY (add_time, big_app_id, app_id) 
            SETTINGS index_granularity = 8192
            """

        val statementData = ClickHouseHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is DcTable) {
            val name = statement.databaseName
            Assert.assertEquals("test", name)
            Assert.assertFalse(statement.location)
            Assert.assertFalse(statement.external)
            Assert.assertEquals(statement.fileFormate, "ORC")
            Assert.assertFalse(statement.temporary)
            Assert.assertEquals(7, statement.lifeCycle)
        } else {
            Assert.fail()
        }
    }
}
