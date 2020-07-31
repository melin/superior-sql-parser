package com.dataworker.sql.parser.util

import com.dataworker.sql.parser.DbType
import org.junit.Assert
import org.junit.Test

/**
 * Created by binsong.li on 2019-08-19 17:53
 */

class SqlUtilsTest {

    @Test
    fun sqlExportTablesTest0() {
        val sql = "select * from dc.test a join hello b on a.id=b.id"
        val tables = SqlUtils.sqlExportTables(DbType.ORACLE, sql);

        Assert.assertEquals(2, tables.size)
    }

    @Test
    fun sqlExportTablesTest1() {
        val sql = """
            SELECT dataSource AS "dataSource",
       max("value") AS "调用时间最大值",
       min("value") AS "调用时间最小值",
       avg("value") AS "调用时间平均值"
FROM druid.druid_metrics
WHERE __time >= TIMESTAMP '2019-08-19 00:00:00'
  AND __time <= TIMESTAMP '2019-08-19 23:59:59'
  AND metric IN ('sqlQuery/time')
    AND dataSource IN ('[forseti.temporary.cache]',
                     '[forseti.subreasoncode]',
                     'forseti.dubbo',
                       'forseti.subreasoncode',
                     'forseti.api.riskservice.reasoncode',
                     'forseti.temporary.cache',          
       '[forseti.dubbo]',
                     '[forseti.api.riskservice.reasoncode]')
GROUP BY 1
        """.trimIndent()
        val tables = SqlUtils.sqlExportTables(DbType.ORACLE, sql);

        Assert.assertEquals(1, tables.size)
        Assert.assertEquals("druid", tables.get(0).databaseName)
        Assert.assertEquals("druid_metrics", tables.get(0).tableName)
    }

    @Test
    fun sqlExportTablesTest2() {
        val sql = """
            select avg("call_num") from (SELECT dept_no as "dept_no", sales_manager as "sales_manager", partner_name as "partner_name", partner_code as "partner_code",
                __time, SUM(call_num) as "call_num" 
            FROM druid.ws_feature_invoke_base_dwa_dt
            GROUP BY 1, 2, 3, 4, 5)  where  "dept_no" in ( '27050206','270503040402') and "dept_no" in ( '27050206','270503040402')
        """.trimIndent()
        val tables = SqlUtils.sqlExportTables(DbType.ORACLE, sql);

        Assert.assertEquals(1, tables.size)
        Assert.assertEquals("druid", tables.get(0).databaseName)
        Assert.assertEquals("ws_feature_invoke_base_dwa_dt", tables.get(0).tableName)
    }
}
