package io.github.melin.superior.parser.presto

import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.TableDescriptor
import io.github.melin.superior.common.relational.TableLineage
import io.github.melin.superior.common.relational.ddl.table.CreateTableAsSelect
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
        if (statement is TableLineage) {
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
        if (statement is TableLineage) {
            Assert.assertEquals(StatementType.SELECT, statementData.type)
            Assert.assertEquals(1, statement.inputTables.size)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun queryLimitTest() {
        val sql = """
            select * from preso_table limit 10
        """.trimIndent()

        val statementData = PrestoSQLHelper.getStatementData(sql)
        val statement = statementData?.statement
        if (statement is TableLineage) {
            Assert.assertEquals(StatementType.SELECT, statementData.type)
            Assert.assertEquals(1, statement.inputTables.size)
            Assert.assertEquals(10, statement.limit)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun createTableSelectTest() {
        val sql = """
            create table dd_s_s as select * from bigdata.test_demo_test limit 1
        """.trimIndent()

        val statementData = PrestoSQLHelper.getStatementData(sql)
        val statement = statementData?.statement
        if (statement is CreateTableAsSelect) {
            Assert.assertEquals(StatementType.CREATE_TABLE_AS_SELECT, statementData.type)
            Assert.assertEquals("dd_s_s", statement.tableId.tableName)
            Assert.assertEquals(1, statement.tableLineage?.inputTables?.size)
            Assert.assertEquals(1, statement.tableLineage?.limit)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun dropTableTest() {
        val sql = """
            drop table if exists bigdata.tdl_small_files_2
        """.trimIndent()

        val statementData = PrestoSQLHelper.getStatementData(sql)
        val statement = statementData?.statement
        if (statement is TableDescriptor) {
            Assert.assertEquals(StatementType.DROP_TABLE, statementData.type)
            Assert.assertEquals("bigdata", statement.schemaName)
            Assert.assertEquals("tdl_small_files_2", statement.tableName)
        } else {
            Assert.fail()
        }
    }
}
