package io.github.melin.superior.parser.oracle

import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.TableId
import io.github.melin.superior.common.relational.dml.*
import org.apache.commons.io.FileUtils
import org.junit.Assert
import org.junit.Test
import java.io.File

class OracleSqlParserDmlTest {
    @Test
    fun querySqlTest0() {
        val sql = """
            select * from test1;
            select * from test2;
        """.trimIndent()

        val sql1 = FileUtils.readFileToString(File("./src/test/resources/insert.sql"), "UTF-8")
        val statement = OracleSqlHelper.parseStatement(sql1)
        
        if (statement is InsertTable) {
            Assert.assertEquals(StatementType.INSERT, statement.statementType)
            Assert.assertEquals(27, statement.queryStmt.inputTables.size)
            Assert.assertEquals(TableId("dwd", "dwd_d03_contract_det_s"), statement.outputTables.get(0))
        } else {
            Assert.fail()
        }
    }

    @Test
    fun cteSqlTest0() {
        val sql = """
            WITH
              cte1 AS (SELECT a, b FROM table1),
              cte2 AS (SELECT c, d FROM table2)
            SELECT b, d FROM cte1 JOIN cte2
            WHERE cte1.a = cte2.c
        """.trimIndent()

        val statement = OracleSqlHelper.parseStatement(sql)
        
        if (statement is QueryStmt) {
            Assert.assertEquals(StatementType.SELECT, statement.statementType)
            Assert.assertEquals(2, statement.inputTables.size)
            Assert.assertEquals(TableId("table1"), statement.inputTables.get(0))
        } else {
            Assert.fail()
        }
    }

    @Test
    fun deleteTest() {
        val sql = """
            DELETE FROM films
            WHERE producer_id IN (SELECT id FROM producers WHERE name = 'foo');
        """.trimIndent()

        val statement = OracleSqlHelper.parseStatement(sql)
        
        if (statement is DeleteTable) {
            Assert.assertEquals(StatementType.DELETE, statement.statementType)
            Assert.assertEquals("films", statement.tableId?.tableName)
            Assert.assertEquals(1, statement.inputTables.size)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun updateTest0() {
        val sql = """
            UPDATE employees SET sales_count = sales_count + 1 WHERE id =
            (SELECT sales_person FROM accounts WHERE name = 'Acme Corporation');
        """.trimIndent()

        val statement = OracleSqlHelper.parseStatement(sql)
        
        if (statement is UpdateTable) {
            Assert.assertEquals(StatementType.UPDATE, statement.statementType)
            Assert.assertEquals("employees", statement.tableId?.tableName)
            Assert.assertEquals(1, statement.inputTables.size)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun insertTest0() {
        val sql = """
            INSERT ALL
              INTO pivot_dest (id, day, val) VALUES (id, 'mon', mon_val)
              INTO pivot_dest (id, day, val) VALUES (id, 'tue', tue_val)
              INTO pivot_dest (id, day, val) VALUES (id, 'wed', wed_val)
              INTO pivot_dest (id, day, val) VALUES (id, 'thu', thu_val)
              INTO pivot_dest (id, day, val) VALUES (id, 'fri', fri_val)
            SELECT *
            FROM   pivot_source;
        """.trimIndent()

        val statement = OracleSqlHelper.parseStatement(sql)
        
        if (statement is InsertTable) {
            Assert.assertEquals(StatementType.INSERT, statement.statementType)
            Assert.assertEquals("pivot_dest", statement.outputTables.get(0).tableName)
            Assert.assertEquals(1, statement.outputTables.size)
            Assert.assertEquals(1, statement.queryStmt.inputTables.size)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun insertTest1() {
        val sql = """
            INSERT ALL
              INTO dest_tab1 (id, description) VALUES (id, description)
              INTO dest_tab2 (id, description) VALUES (id, description)
              INTO dest_tab3 (id, description) VALUES (id, description)
            SELECT id, description
            FROM   source_tab;
        """.trimIndent()

        val statement = OracleSqlHelper.parseStatement(sql)
        
        if (statement is InsertTable) {
            Assert.assertEquals(StatementType.INSERT, statement.statementType)
            Assert.assertEquals("dest_tab1", statement.outputTables.get(0).tableName)
            Assert.assertEquals(3, statement.outputTables.size)
            Assert.assertEquals(1, statement.queryStmt.inputTables.size)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun insertTest2() {
        val sql = """
            INSERT ALL
              WHEN id <= 3 THEN
                INTO dest_tab1 (id, description) VALUES (id, description)
              WHEN id BETWEEN 4 AND 7 THEN
                INTO dest_tab2 (id, description) VALUES (id, description)
              WHEN id >= 8 THEN
                INTO dest_tab3 (id, description) VALUES (id, description)
            SELECT id, description
            FROM   source_tab;
        """.trimIndent()

        val statement = OracleSqlHelper.parseStatement(sql)
        
        if (statement is InsertTable) {
            Assert.assertEquals(StatementType.INSERT, statement.statementType)
            Assert.assertEquals("dest_tab1", statement.outputTables.get(0).tableName)
            Assert.assertEquals(3, statement.outputTables.size)
            Assert.assertEquals(1, statement.queryStmt.inputTables.size)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun insertTest3() {
        val sql = """
            INSERT FIRST
              WHEN id <= 3 THEN
                INTO dest_tab1 (id, description) VALUES (id, description)
              WHEN id <= 5 THEN
                INTO dest_tab2 (id, description) VALUES (id, description)
              ELSE
                INTO dest_tab3 (id, description) VALUES (id, description)
            SELECT id, description
            FROM   source_tab;
        """.trimIndent()

        val statement = OracleSqlHelper.parseStatement(sql)
        
        if (statement is InsertTable) {
            Assert.assertEquals(StatementType.INSERT, statement.statementType)
            Assert.assertEquals("dest_tab1", statement.outputTables.get(0).tableName)
            Assert.assertEquals(3, statement.outputTables.size)
            Assert.assertEquals(1, statement.queryStmt.inputTables.size)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun insertTest4() {
        val sql = """
            INSERT INTO films SELECT * FROM tmp_films WHERE date_prod < '2004-05-07';
        """.trimIndent()

        val statement = OracleSqlHelper.parseStatement(sql)
        
        if (statement is InsertTable) {
            Assert.assertEquals(StatementType.INSERT, statement.statementType)
            Assert.assertEquals("films", statement.tableId?.tableName)
            Assert.assertEquals(1, statement.outputTables.size)
            Assert.assertEquals(1, statement.queryStmt.inputTables.size)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun deltaMergeTest() {
        val sql = """
            MERGE INTO bonuses D
            USING (SELECT employee_id, salary, department_id FROM hr.employees
            WHERE department_id = 80) S
            ON (D.employee_id = S.employee_id)
            WHEN MATCHED THEN UPDATE SET D.bonus = D.bonus + S.salary*.01
                DELETE WHERE (S.salary > 8000)
            WHEN NOT MATCHED THEN INSERT (D.employee_id, D.bonus)
                VALUES (S.employee_id, S.salary*.01)
                WHERE (S.salary <= 8000);
        """.trimIndent()

        val statement = OracleSqlHelper.parseStatement(sql)
        
        if (statement is MergeTable) {
            Assert.assertEquals(StatementType.MERGE, statement.statementType)
            Assert.assertEquals("bonuses", statement.targetTable.tableName)
            Assert.assertEquals(1, statement.inputTables.size)
        } else {
            Assert.fail()
        }
    }
}