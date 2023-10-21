package io.github.melin.superior.parser.postgre

import io.github.melin.superior.common.AlterType
import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.*
import io.github.melin.superior.common.relational.alter.*
import io.github.melin.superior.common.relational.common.CommentData
import io.github.melin.superior.common.relational.common.RefreshMaterializedView
import io.github.melin.superior.common.relational.create.*
import io.github.melin.superior.common.relational.drop.DropDatabase
import io.github.melin.superior.common.relational.drop.DropMaterializedView
import io.github.melin.superior.common.relational.drop.DropTable
import io.github.melin.superior.parser.postgre.relational.CreatePartitionTable
import org.junit.Assert
import org.junit.Test

/**
 * Created by libinsong on 2020/6/30 11:04 上午
 */
class PostgreSqlParserDdlTest {

    @Test
    fun createDatabaseTest() {
        val sql = """
            CREATE DATABASE bigdata1;
            drop DATABASE bigdata2
        """.trimIndent()

        val statements = PostgreSqlHelper.parseMultiStatement(sql)

        val createDatabse = statements.get(0)
        val dropDatabase = statements.get(1)
        if (createDatabse is CreateDatabase) {
            Assert.assertEquals("bigdata1", createDatabse.databaseName)
        } else {
            Assert.fail()
        }
        if (dropDatabase is DropDatabase) {
            Assert.assertEquals("bigdata2", dropDatabase.databaseName)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun createSchemaTest() {
        val sql = """
            CREATE schema bigdata1;
            CREATE schema bigdata2;
        """.trimIndent()

        val statements = PostgreSqlHelper.parseMultiStatement(sql)

        val createSchema1 = statements.get(0)
        val createSchema2 = statements.get(1)
        if (createSchema1 is CreateSchema) {
            Assert.assertEquals("bigdata1", createSchema1.schemaName)
        } else {
            Assert.fail()
        }
        if (createSchema2 is CreateSchema) {
            Assert.assertEquals("bigdata2", createSchema2.schemaName)
        } else {
            Assert.fail()
        }
    }

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

        val statement = PostgreSqlHelper.parseStatement(sql)
        
        if (statement is CreateTable) {
            Assert.assertEquals(StatementType.CREATE_TABLE, statement.statementType)
            Assert.assertTrue(statement.temporary)
            Assert.assertEquals(TableId("test", "public", "authors"), statement.tableId)
            Assert.assertEquals(4, statement.columnRels?.size)
            Assert.assertTrue(statement.columnRels?.get(0)?.primaryKey!!)

            Assert.assertEquals("RANGE", statement.partitionType)
            Assert.assertEquals(1, statement.partitionColumnNames?.size)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun createView0() {
        val sql = """
            CREATE OR REPLACE VIEW comedies AS
            SELECT f.*,
                   country_code_to_name(f.country_code) AS country,
                   (SELECT avg(r.rating)
                    FROM user_ratings r
                    WHERE r.film_id = f.id) AS avg_rating
            FROM films f
            WHERE f.kind = 'Comedy'
            WITH CASCADED CHECK OPTION;
        """.trimIndent()

        val statement = PostgreSqlHelper.parseStatement(sql)
        
        if (statement is CreateView) {
            Assert.assertEquals(StatementType.CREATE_VIEW, statement.statementType)
            Assert.assertEquals("comedies", statement.tableId.tableName)

            Assert.assertEquals(2, statement.queryStmt.inputTables.size)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun createMatView0() {
        val sql = """
            CREATE MATERIALIZED VIEW sales_summary AS
              SELECT
                  seller_no,
                  invoice_date,
                  sum(invoice_amt)::numeric(13,2) as sales_amt
                FROM invoice
                WHERE invoice_date < CURRENT_DATE
                GROUP BY
                  seller_no,
                  invoice_date;
        """.trimIndent()

        val statement = PostgreSqlHelper.parseStatement(sql)
        
        if (statement is CreateMaterializedView) {
            Assert.assertEquals(StatementType.CREATE_MATERIALIZED_VIEW, statement.statementType)
            Assert.assertEquals("sales_summary", statement.tableId.tableName)

            Assert.assertEquals(1, statement.queryStmt.inputTables.size)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun dropMvTest() {
        val sql = """
            DROP MATERIALIZED VIEW tickets_mv;
        """.trimIndent()

        val statement = PostgreSqlHelper.parseStatement(sql)

        if (statement is DropMaterializedView) {
            Assert.assertEquals(StatementType.DROP_MATERIALIZED_VIEW, statement.statementType)
            Assert.assertEquals(TableId("tickets_mv"), statement.tableId)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun refreshMvTest() {
        val sql = """
            REFRESH MATERIALIZED VIEW tickets_mv;
        """.trimIndent()

        val statement = PostgreSqlHelper.parseStatement(sql)

        if (statement is RefreshMaterializedView) {
            Assert.assertEquals(StatementType.REFRESH_MV, statement.statementType)
            Assert.assertEquals(TableId("tickets_mv"), statement.tableId)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun renameMvTest() {
        val sql = """
            ALTER MATERIALIZED VIEW tickets_mv RENAME TO tickets_mv_1;
        """.trimIndent()

        val statement = PostgreSqlHelper.parseStatement(sql)

        if (statement is AlterMaterializedView) {
            Assert.assertEquals(StatementType.ALTER_MATERIALIZED_VIEW, statement.statementType)
            Assert.assertEquals(TableId("tickets_mv"), statement.tableId)
            Assert.assertEquals(AlterType.RENAME, statement.firstAction().alterType)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun dropTable0() {
        val sql = """
            drop TABLE test.public.authors
        """.trimIndent()

        val statement = PostgreSqlHelper.parseStatement(sql)
        
        if (statement is DropTable) {
            Assert.assertEquals(StatementType.DROP_TABLE, statement.statementType)
            Assert.assertEquals(TableId("test", "public", "authors"), statement.tableId)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun dropTable1() {
        val sql = """
            drop TABLE authors, tests
        """.trimIndent()

        val statement = PostgreSqlHelper.parseStatement(sql)
        
        if (statement is DropTable) {
            Assert.assertEquals(StatementType.DROP_TABLE, statement.statementType)
            Assert.assertEquals(TableId("authors"), statement.tableId)
            Assert.assertEquals(2, statement.tableIds.size)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun createIndexTest() {
        val sql = "CREATE UNIQUE INDEX title_idx ON films (title) INCLUDE (director, rating);\n"

        val statement = PostgreSqlHelper.parseStatement(sql)
        Assert.assertEquals(StatementType.ALTER_TABLE, statement.statementType)

        
        if (statement is AlterTable) {
            Assert.assertEquals(TableId("films"), statement.tableId)
            val createIndex = statement.firstAction() as CreateIndex
            Assert.assertEquals(AlterType.ADD_INDEX, createIndex.alterType)
            Assert.assertEquals("title_idx", createIndex.indexName)
        }
    }

    @Test
    fun dropIndexTest() {
        val sql = "DROP INDEX title_idx"

        val statement = PostgreSqlHelper.parseStatement(sql)
        Assert.assertEquals(StatementType.ALTER_TABLE, statement.statementType)

        
        if (statement is AlterTable) {
            val dropIndex = statement.firstAction() as DropIndex
            Assert.assertEquals(AlterType.DROP_INDEX, dropIndex.alterType)
            Assert.assertEquals("title_idx", dropIndex.indexName)
        }
    }

    @Test
    fun createPartitonTableTest() {
        val sql = "create table pkslow_person_r1 partition of pkslow_person_r for values from (MINVALUE) to (10);  \n"
        val statement = PostgreSqlHelper.parseStatement(sql)
        Assert.assertEquals(StatementType.CREATE_TABLE, statement.statementType)

        if (statement is CreatePartitionTable) {
            Assert.assertEquals("pkslow_person_r", statement.tableId.tableName)
            Assert.assertEquals("pkslow_person_r1", statement.partitionTableId.tableName)
        }
    }

    @Test
    fun commentTest0() {
        val sql = """
            COMMENT ON TABLE my_schema.my_table IS 'Employee Information';
        """.trimIndent()

        val statement = PostgreSqlHelper.parseStatement(sql)
        
        if (statement is CommentData) {
            Assert.assertEquals(StatementType.COMMENT, statement.statementType)
            Assert.assertEquals("Employee Information", statement.comment)
            Assert.assertFalse(statement.isNull)
        }
    }

    @Test
    fun alterTableTest() {
        val sql = """
            ALTER TABLE distributors ADD COLUMN address varchar(30),
                ALTER COLUMN status SET default 'current';
        """.trimIndent()
        val statements = PostgreSqlHelper.parseMultiStatement(sql)

        val alterTable1 = statements.get(0) as AlterTable
        Assert.assertEquals("distributors", alterTable1.tableId.tableName)
        var action = alterTable1.actions.get(0) as AlterColumnAction
        Assert.assertEquals(AlterType.ADD_COLUMN, action.alterType)
        Assert.assertEquals("address", action.columName)
        Assert.assertEquals("varchar(30)", action.dataType)

        action = alterTable1.actions.get(1) as AlterColumnAction
        Assert.assertEquals(AlterType.SET_COLUMN_DEFAULT, action.alterType)
        Assert.assertEquals("status", action.columName)
        Assert.assertEquals("current", action.defaultExpression)
    }
}
