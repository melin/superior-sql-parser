package com.dataworker.sql.parser.postgresql

import com.dataworker.sql.parser.StatementType
import com.dataworker.sql.parser.model.TableData
import org.junit.Assert
import org.junit.Test

/**
 * Created by libinsong on 2020/6/30 11:04 上午
 */
class PostgreSQLParserTest {

    @Test
    fun queryTest0() {
        val sql = """
            select a.* from datacompute1.datacompute.dc_job a left join datacompute1.datacompute.dc_job_scheduler b on a.id=b.job_id
        """.trimIndent()

        val statementData = PostgreSQLHelper.getStatementData(sql)
        val statement = statementData?.statement
        if (statement is TableData) {
            Assert.assertEquals(StatementType.SELECT, statementData.type)
            Assert.assertEquals(2, statement.inputTables.size)
        } else {
            Assert.fail()
        }
    }
}
