package io.github.melin.superior.parser.postgre

import io.github.melin.superior.common.AlterType
import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.AlterTable
import io.github.melin.superior.common.relational.AlterTableAction
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
            CREATE TEMPORARY TABLE test.public.authors (
                id INTEGER NOT NULL PRIMARY KEY,
                last_name TEXT,
                first_name TEXT,
                age int not null
            ) PARTITION BY RANGE (age); 
        """.trimIndent()

        val statementData = PostgreSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is CreateTable) {
            Assert.assertEquals(StatementType.CREATE_TABLE, statementData.type)
            Assert.assertTrue(statement.temporary)
            Assert.assertEquals(TableId("test", "public", "authors"), statement.tableId)
            Assert.assertEquals(4, statement.columnRels?.size)
            Assert.assertTrue(statement.columnRels?.get(0)?.isPk!!)

            Assert.assertEquals("RANGE", statement.partitionType)
            Assert.assertEquals(1, statement.partitionColumnNames?.size)
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
            Assert.assertEquals(AlterType.ADD_INDEX, statement.alterType)
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
            Assert.assertEquals(AlterType.DROP_INDEX, statement.alterType)
            val dropIndex = statement.firstAction() as DropIndex
            Assert.assertEquals("title_idx", dropIndex.indexName)
        }
    }

    @Test
    fun addPartitonTest() {
        val sql = "create table pkslow_person_r1 partition of pkslow_person_r for values from (MINVALUE) to (10);  \n"

        val statementData = PostgreSqlHelper.getStatementData(sql)
        Assert.assertEquals(StatementType.ALTER_TABLE, statementData.type)

        val statement = statementData.statement
        if (statement is AlterTable) {
            Assert.assertEquals(AlterType.ADD_PARTITION, statement.alterType)
            Assert.assertEquals("pkslow_person_r", statement.tableId.tableName)

            val action = statement.firstAction() as AlterTableAction
            Assert.assertEquals("pkslow_person_r1", action.newTableId?.tableName)
        }
    }
}
