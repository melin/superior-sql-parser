package io.github.melin.superior.parser.flink

import io.github.melin.superior.common.relational.create.CreateTable
import io.github.melin.superior.common.relational.create.CreateTableAsSelect
import io.github.melin.superior.common.relational.create.CreateView
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

    @Test
    fun createTableAsQueryTest() {
        val sql = """
            CREATE VIEW IF NOT EXISTS `MDM_VIEW_PRODUCT_ENRICHMENT` AS 
            (SELECT 'WTCTH' BU_CODE, 'WTCTH' FORMULA_COUNTRY_ID,
                uif.ITEM PRODUCT_ID,
                CAST(CAST(uif.UDA_ID AS DECIMAL(5, 0)) AS STRING) ENRICHMENT_ID,
                uif.UDA_TEXT ENRICHMENT_VALUE,
                u.UDA_DESC ENRICHMENT_DESC,
                u.SINGLE_VALUE_IND SINGLE_VALUE_IND,
                u.DISPLAY_TYPE CONTROL_TYPE,
                'EN' LANG,
                'FLINKJDBC' CREATE_BY,
                uif.LAST_UPDATE_ID LAST_UPDATE_BY,
                uif.CREATE_DATETIME CREATED,
                uif.LAST_UPDATE_DATETIME LAST_UPDATED
            FROM RETEK_UDA_ITEM_FF_PRODUCT_ENRICHMENT uif
            JOIN MDM_DIM_UDA_LOOKUPMAP_ORACLE FOR SYSTEM_TIME AS OF uif.KAFKA_PROCESS_TIME AS u
                ON CAST(uif.UDA_ID AS DECIMAL(5, 0)) = u.UDA_ID
            JOIN MDM_DIM_PRODUCT_ATTRIB_TYPE_LOOKUPMAP_MYSQL FOR SYSTEM_TIME AS OF uif.KAFKA_PROCESS_TIME AS pat
                ON CAST(CAST(uif.UDA_ID AS DECIMAL(5, 0)) AS STRING) = pat.ATTRIB_ID
                AND pat.ATTRIB_TYPE = 'PRODUCT_ENRICHMENT'
            )
        """.trimIndent()

        val createTable = FlinkSqlHelper.parseStatement(sql)
        if (createTable is CreateView) {
            Assert.assertEquals("MDM_VIEW_PRODUCT_ENRICHMENT", createTable.tableId.tableName)
            Assert.assertEquals(3, createTable.inputTables.size)
        } else {
            Assert.fail()
        }
    }
}
