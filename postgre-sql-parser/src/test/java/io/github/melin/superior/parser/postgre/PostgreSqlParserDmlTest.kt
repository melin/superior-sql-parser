package io.github.melin.superior.parser.postgre

import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.create.CreateTableAsSelect
import io.github.melin.superior.common.relational.dml.QueryStmt
import org.junit.Assert
import org.junit.Test

/**
 * Created by libinsong on 2020/6/30 11:04 上午
 */
class PostgreSqlParserDmlTest {

    @Test
    fun queryTest0() {
        val sql = """
            select a.* from datacompute1.datacompute.dc_job a left join datacompute1.datacompute.dc_job_scheduler b on a.id=b.job_id
        """.trimIndent()

        val statementData = PostgreSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is QueryStmt) {
            Assert.assertEquals(StatementType.SELECT, statementData.type)
            Assert.assertEquals(2, statement.inputTables.size)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun createAsQueryTest0() {
        val sql = """
            CREATE TABLE films_recent AS
            SELECT * FROM films WHERE date_prod >= '2002-01-01';
        """.trimIndent()

        val statementData = PostgreSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is CreateTableAsSelect) {
            Assert.assertEquals(StatementType.CREATE_TABLE_AS_SELECT, statementData.type)
            Assert.assertEquals("films_recent", statement.tableId.tableName)
            Assert.assertEquals(1, statement.inputTables.size)
            Assert.assertEquals("films", statement.inputTables.get(0).tableName)
        } else {
            Assert.fail()
        }
    }
}
