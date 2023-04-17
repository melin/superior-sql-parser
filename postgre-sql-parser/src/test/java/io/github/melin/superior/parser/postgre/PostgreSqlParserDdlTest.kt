package io.github.melin.superior.parser.postgre

import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.AlterTable
import io.github.melin.superior.common.relational.TableId
import io.github.melin.superior.common.relational.create.CreateIndex
import io.github.melin.superior.common.relational.create.CreateTable
import io.github.melin.superior.common.relational.dml.QueryStmt
import io.github.melin.superior.common.relational.drop.DropIndex
import io.github.melin.superior.common.relational.drop.DropTable
import org.junit.Assert
import org.junit.Test

/**
 * Created by libinsong on 2020/6/30 11:04 上午
 */
class PostgreSqlParserDdlTest {
    @Test
    fun createTable0() {
        val sql = """
            CREATE TABLE test.public.authors (
                id INTEGER NOT NULL PRIMARY KEY,
                last_name TEXT,
                first_name TEXT
            )
        """.trimIndent()

        val statementData = PostgreSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is CreateTable) {
            Assert.assertEquals(StatementType.CREATE_TABLE, statementData.type)
            Assert.assertEquals(TableId("test", "public", "authors"), statement.tableId)
            Assert.assertEquals(3, statement.columnRels?.size)
            Assert.assertEquals(true, statement.columnRels?.get(0)?.isPk)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun dropTable0() {
        val sql = """
            drop TABLE test.public.authors
        """.trimIndent()

        val statementData = PostgreSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is DropTable) {
            Assert.assertEquals(StatementType.DROP_TABLE, statementData.type)
            Assert.assertEquals(TableId("test", "public", "authors"), statement.getFirstTableId())
        } else {
            Assert.fail()
        }
    }

    @Test
    fun dropTable1() {
        val sql = """
            drop TABLE authors, tests
        """.trimIndent()

        val statementData = PostgreSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is DropTable) {
            Assert.assertEquals(StatementType.DROP_TABLE, statementData.type)
            Assert.assertEquals(TableId("authors"), statement.getFirstTableId())
            Assert.assertEquals(2, statement.tableIds.size)
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
