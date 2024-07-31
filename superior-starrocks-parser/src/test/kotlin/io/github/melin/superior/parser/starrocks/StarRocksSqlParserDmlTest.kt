package io.github.melin.superior.parser.starrocks

import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.TableId
import io.github.melin.superior.common.relational.common.ShowStatement
import io.github.melin.superior.common.relational.create.CreateTableAsSelect
import io.github.melin.superior.common.relational.dml.*
import io.github.melin.superior.parser.starrocks.relational.DropTask
import io.github.melin.superior.parser.starrocks.relational.SubmitTask
import org.junit.Assert
import org.junit.Test

class StarRocksSqlParserDmlTest {

    @Test
    fun selectTest0() {
        val sql =
            """
            SELECT * FROM hive1.hive_db.hive_table limit 10 offset 20;
            select hello('test', 23)
        """
                .trimIndent()

        val statements = StarRocksHelper.parseMultiStatement(sql)
        Assert.assertEquals(2, statements.size)

        val statement = statements.get(0)
        if (statement is QueryStmt) {
            Assert.assertEquals(StatementType.SELECT, statement.statementType)
            Assert.assertEquals(1, statement.inputTables.size)
            Assert.assertEquals(10, statement.limit)
            Assert.assertEquals(20, statement.offset)
            Assert.assertEquals(TableId("hive1", "hive_db", "hive_table"), statement.inputTables.get(0))
        } else {
            Assert.fail()
        }

        val statement1 = statements.get(1)
        if (statement1 is QueryStmt) {
            Assert.assertEquals(StatementType.SELECT, statement1.statementType)
            Assert.assertEquals(0, statement1.inputTables.size)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun selectTest1() {
        val sql =
            """
            with t1 as (select * from bigdata.users),
                t2 as (select 2)
            select * from t1 union all select * from t2;
        """
                .trimIndent()

        val statement = StarRocksHelper.parseStatement(sql)
        if (statement is QueryStmt) {
            Assert.assertEquals(StatementType.SELECT, statement.statementType)
            Assert.assertEquals(1, statement.inputTables.size)
            Assert.assertEquals(TableId("bigdata", "users"), statement.inputTables.get(0))
        } else {
            Assert.fail()
        }
    }

    @Test
    fun deleteTest0() {
        val sql =
            """
            DELETE FROM my_table PARTITION p1 WHERE k1 = 3;
        """
                .trimIndent()

        val statement = StarRocksHelper.parseStatement(sql)
        if (statement is DeleteTable) {
            Assert.assertEquals(StatementType.DELETE, statement.statementType)
            Assert.assertEquals("my_table", statement.tableId.tableName)
            Assert.assertEquals(0, statement.inputTables.size)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun deleteTest1() {
        val sql =
            """
            DELETE FROM score_board
            WHERE name IN (select name from users where country = "China");
        """
                .trimIndent()

        val statement = StarRocksHelper.parseStatement(sql)
        if (statement is DeleteTable) {
            Assert.assertEquals(StatementType.DELETE, statement.statementType)
            Assert.assertEquals("score_board", statement.tableId.tableName)
            Assert.assertEquals(1, statement.inputTables.size)
            Assert.assertEquals("users", statement.inputTables.get(0).tableName)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun deleteTest2() {
        val sql =
            """
            WITH foo_producers as (
                SELECT * from producers
                where producers.name = 'foo'
            )
            DELETE FROM films USING foo_producers
            WHERE producer_id = foo_producers.id;
        """
                .trimIndent()

        val statement = StarRocksHelper.parseStatement(sql)
        if (statement is DeleteTable) {
            Assert.assertEquals(StatementType.DELETE, statement.statementType)
            Assert.assertEquals("films", statement.tableId.tableName)
            Assert.assertEquals(1, statement.inputTables.size)
            Assert.assertEquals("producers", statement.inputTables.get(0).tableName)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun updateTest1() {
        val sql =
            """
            UPDATE employees
            SET sales_count = sales_count + 1           
            FROM accounts
            WHERE accounts.name = 'Acme Corporation'
               AND employees.id = accounts.sales_person;
        """
                .trimIndent()

        val statement = StarRocksHelper.parseStatement(sql)
        if (statement is UpdateTable) {
            Assert.assertEquals(StatementType.UPDATE, statement.statementType)
            Assert.assertEquals("employees", statement.tableId.tableName)
            Assert.assertEquals(1, statement.inputTables.size)
            Assert.assertEquals("accounts", statement.inputTables.get(0).tableName)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun updateTest2() {
        val sql =
            """
            WITH acme_accounts as (
                SELECT * from accounts
                 WHERE accounts.name = 'Acme Corporation'
            )
            UPDATE employees SET sales_count = sales_count + 1
            FROM acme_accounts
            WHERE employees.id = acme_accounts.sales_person;
        """
                .trimIndent()

        val statement = StarRocksHelper.parseStatement(sql)
        if (statement is UpdateTable) {
            Assert.assertEquals(StatementType.UPDATE, statement.statementType)
            Assert.assertEquals("employees", statement.tableId.tableName)
            Assert.assertEquals(1, statement.inputTables.size)
            Assert.assertEquals("accounts", statement.inputTables.get(0).tableName)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun insertTest1() {
        val sql =
            """
            INSERT INTO test SELECT * FROM test2;
        """
                .trimIndent()

        val statement = StarRocksHelper.parseStatement(sql)
        if (statement is InsertTable) {
            Assert.assertEquals(StatementType.INSERT, statement.statementType)
            Assert.assertEquals("test", statement.tableId.tableName)
            Assert.assertEquals(1, statement.queryStmt.inputTables.size)
            Assert.assertEquals("test2", statement.queryStmt.inputTables.get(0).tableName)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun insertTest2() {
        val sql =
            """
            INSERT INTO test PARTITION(p1, p2) WITH LABEL `label1` SELECT * FROM test2;
        """
                .trimIndent()

        val statement = StarRocksHelper.parseStatement(sql)
        if (statement is InsertTable) {
            Assert.assertEquals(StatementType.INSERT, statement.statementType)
            Assert.assertEquals("test", statement.tableId.tableName)
            Assert.assertEquals(1, statement.queryStmt.inputTables.size)
            Assert.assertEquals("test2", statement.queryStmt.inputTables.get(0).tableName)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun insertTest3() {
        val sql =
            """
            INSERT INTO test.`table1` VALUES (1, "test", 23)
        """
                .trimIndent()

        val statement = StarRocksHelper.parseStatement(sql)
        if (statement is InsertTable) {
            Assert.assertEquals(StatementType.INSERT, statement.statementType)
            Assert.assertEquals("table1", statement.tableId.tableName)
            Assert.assertEquals(0, statement.queryStmt.inputTables.size)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun insertTest4() {
        val sql =
            """
            INSERT OVERWRITE
            FILES(
                "path" = "s3://test/test.parquest",
                "format" = "parquet",
                "compression" = "uncompressed",
                "target_max_file_size" = "10240", -- 1M
                "aws.s3.access_key" = "test_access_key",
                "aws.s3.secret_key" = "test_secret_key",
                "aws.s3.region" = "test-region-1"
            )
            SELECT * FROM test_db.test_table;
        """
                .trimIndent()

        val statement = StarRocksHelper.parseStatement(sql)
        if (statement is InsertFiles) {
            Assert.assertEquals(StatementType.INSERT, statement.statementType)
            Assert.assertEquals(7, statement.properties.size)
            Assert.assertEquals(1, statement.queryStmt.inputTables.size)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun showTest() {
        val sql =
            """
            SHOW CREATE MATERIALIZED VIEW lo_mv1;
            SHOW CREATE TABLE example_db.example_table;
            SHOW DELETE FROM bigdata;
        """
                .trimIndent()

        val statements = StarRocksHelper.parseMultiStatement(sql)
        Assert.assertEquals(3, statements.size)

        val statement = statements.get(2) as ShowStatement
        Assert.assertTrue(statement.checkSql("SHOW DELETE FROM"))

        Assert.assertFalse(statement.checkSql("SHOW DELETE"))
    }

    @Test
    fun taskTest() {
        val sql =
            """
            SUBMIT /*+set_var(query_timeout=100000)*/ TASK test1 AS
            INSERT OVERWRITE insert_wiki_edit
            SELECT * FROM source_wiki_edit;
            
            DROP TASK test1
        """
                .trimIndent()

        val statements = StarRocksHelper.parseMultiStatement(sql)
        Assert.assertEquals(2, statements.size)

        val submitTask = statements.get(0) as SubmitTask
        Assert.assertEquals("test1", submitTask.taskName)

        val dropTask = statements.get(1) as DropTask
        Assert.assertEquals("test1", dropTask.taskName)
    }

    @Test
    fun ctasTest() {
        val sql =
            """
            CREATE TABLE order_new (a, b, c) AS SELECT k1, k2, k3 FROM orders;
        """
                .trimIndent()

        val statements = StarRocksHelper.parseMultiStatement(sql)
        Assert.assertEquals(1, statements.size)

        val statement = statements.get(0) as CreateTableAsSelect

        Assert.assertEquals("order_new", statement.tableId.tableName)
        Assert.assertEquals("orders", statement.queryStmt.inputTables.get(0).tableName)
    }
}
