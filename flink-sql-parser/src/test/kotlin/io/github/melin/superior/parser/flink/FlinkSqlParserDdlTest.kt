package io.github.melin.superior.parser.flink

import io.github.melin.superior.common.relational.create.CreateTable
import org.junit.Assert
import org.junit.Test

/**
 *
 * Created by libinsong on 2018/1/10.
 */
class FlinkSqlParserDdlTest {

    @Test
    fun createTableTest() {
        val sql = """
            CREATE TABLE IF NOT EXISTS `RETEK_XX_ITEM_ATTR_TRANSLATE_PRODUCT_ENRICHMENT`(
              `ITEM`                 STRING,
              `UDA_ID`               DECIMAL(5,0),
              `UDA_VALUE_ID`         DECIMAL(3,0),
              `LANG`                 DECIMAL(6,0),
              `TRANSLATED_VALUE`     STRING,
              `LAST_UPDATE_ID`       STRING,
              `CREATE_DATETIME`      TIMESTAMP(3),
              `LAST_UPDATE_DATETIME` TIMESTAMP(3),
              `KAFKA_PROCESS_TIME` AS PROCTIME()
            ) WITH (
                'connector' = 'kafka',
            'properties.acks' = '-1',
            'properties.allow.auto.create.topics' = 'true',
                'topic' = 'test',
                'properties.bootstrap.servers' = 'localhost:9082',
                'value.format' = 'changelog-json',
                'properties.group.id' = 'test',
                'key.fields' = 'ITEM;UDA_ID;LANG',
                'key.format'='json',
                'scan.startup.mode' = 'earliest-offset',
                'value.changelog-json.timestamp-format.standard'='ISO-8601',
                'value.changelog-json.ignore-parse-errors' = 'true'
            );
        """.trimIndent()

        val createTable = FlinkSqlHelper.parseStatement(sql)
        if (createTable is CreateTable) {
            Assert.assertEquals("RETEK_XX_ITEM_ATTR_TRANSLATE_PRODUCT_ENRICHMENT", createTable.tableId.tableName)
            Assert.assertEquals(9, createTable.columnRels?.size)
            Assert.assertEquals(12, createTable.properties?.size)
        } else {
            Assert.fail()
        }
    }
}
