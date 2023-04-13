package io.github.melin.superior.parser.postgre

import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.AlterTable
import io.github.melin.superior.common.relational.TableId
import io.github.melin.superior.common.relational.create.CreateIndex
import io.github.melin.superior.common.relational.dml.QueryStmt
import io.github.melin.superior.common.relational.drop.DropIndex
import org.junit.Assert
import org.junit.Test

/**
 * Created by libinsong on 2020/6/30 11:04 上午
 */
class PostgreSqlParserTest {

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
    fun createIndexTest() {
        val sql = "CREATE UNIQUE INDEX title_idx ON films (title) INCLUDE (director, rating);\n"

        val statementData = PostgreSqlHelper.getStatementData(sql)
        Assert.assertEquals(StatementType.ALTER_TABLE, statementData.type)

        val statement = statementData.statement
        if (statement is AlterTable) {
            Assert.assertEquals(TableId("films"), statement.tableId)
            val createIndex = statement.firstAction() as CreateIndex
            Assert.assertEquals("title_idx", createIndex.indexName)
        }
    }

    @Test
    fun dropIndexTest() {
        val sql = "DROP INDEX title_idx"

        val statementData = PostgreSqlHelper.getStatementData(sql)
        Assert.assertEquals(StatementType.ALTER_TABLE, statementData.type)

        val statement = statementData.statement
        if (statement is AlterTable) {
            val dropIndex = statement.firstAction() as DropIndex
            Assert.assertEquals("title_idx", dropIndex.indexName)
        }
    }
}
