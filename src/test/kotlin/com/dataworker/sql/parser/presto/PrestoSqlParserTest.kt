package com.dataworker.sql.parser.presto

import com.dataworker.sql.parser.StatementType
import com.dataworker.sql.parser.model.TableData
import org.junit.Assert
import org.junit.Test

/**
 *
 * Created by libinsong on 2018/1/10.
 */
class PrestoSqlParserTest {

    @Test
    fun queryTest0() {
        val sql = """
            select a.* from datacompute1.datacompute.dc_job a left join datacompute1.datacompute.dc_job_scheduler b on a.id=b.job_id
        """.trimIndent()

        val statementData = PrestoSQLHelper.getStatementData(sql)
        val statement = statementData?.statement
        if (statement is TableData) {
            Assert.assertEquals(StatementType.SELECT, statementData.type)
            Assert.assertEquals(2, statement.inputTables.size)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun queryTest1() {
        val sql = """
            SELECT COUNT(app_name) AS "应用名" FROM (SELECT * FROM ops.dwd_app_to_container_wt 
            WHERE ds=date_format(CURRENT_DATE - interval '1' DAY, "%Y%m%d") ) tdbi_view
        """.trimIndent()

        val statementData = PrestoSQLHelper.getStatementData(sql)
        val statement = statementData?.statement
        if (statement is TableData) {
            Assert.assertEquals(StatementType.SELECT, statementData.type)
            Assert.assertEquals(1, statement.inputTables.size)
        } else {
            Assert.fail()
        }
    }
}
