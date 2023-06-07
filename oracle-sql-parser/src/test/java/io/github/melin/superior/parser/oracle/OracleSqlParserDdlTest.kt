package io.github.melin.superior.parser.oracle

import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.DefaultStatement
import io.github.melin.superior.common.relational.common.CommentData
import io.github.melin.superior.common.relational.create.CreateDatabase
import io.github.melin.superior.common.relational.create.CreateMaterializedView
import io.github.melin.superior.common.relational.create.CreateTable
import io.github.melin.superior.common.relational.create.CreateView
import org.junit.Assert
import org.junit.Test

class OracleSqlParserDdlTest {
    @Test
    fun createDatabaseTest() {
        val sql = """
            CREATE DATABASE bigdata1 USER SYSTEM IDENTIFIED BY 123213
            drop DATABASE bigdata2
        """.trimIndent()

        val statements = OracleSqlHelper.parseMultiStatement(sql)

        val createDatabse = statements.get(0)
        val dropDatabase = statements.get(1)
        if (createDatabse is CreateDatabase) {
            Assert.assertEquals("bigdata1", createDatabse.databaseName)
        } else {
            Assert.fail()
        }

        if (dropDatabase is DefaultStatement) {
            Assert.assertTrue(true)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun createTableTest0() {
        val sql = """
            CREATE TABLE employees(
                employee_id number(10) NOT NULL,
                employee_name varchar2(50) NOT NULL,
                city varchar2(50),
                CONSTRAINT employees_pk PRIMARY KEY (employee_id)
            )
        """.trimIndent()

        OracleSqlHelper.splitSql(sql)

        val statement = OracleSqlHelper.parseStatement(sql)
        
        if (statement is CreateTable) {
            Assert.assertEquals(StatementType.CREATE_TABLE, statement.statementType)
            Assert.assertEquals("employees", statement.tableId.tableName)
            Assert.assertEquals(3, statement.columnRels?.size)
            Assert.assertTrue(statement.columnRels?.get(0)?.isPk!!)
            Assert.assertFalse(statement.columnRels?.get(1)?.isPk!!)
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
        """.trimIndent()

        val statement = OracleSqlHelper.parseStatement(sql)
        
        if (statement is CreateView) {
            Assert.assertEquals(StatementType.CREATE_VIEW, statement.statementType)
            Assert.assertEquals("comedies", statement.tableId.tableName)

            Assert.assertEquals(2, statement.inputTables.size)
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
                  sum(invoice_amt) as sales_amt
                FROM invoice
                WHERE invoice_date < CURRENT_DATE
                GROUP BY
                  seller_no,
                  invoice_date;
        """.trimIndent()

        val statement = OracleSqlHelper.parseStatement(sql)
        
        if (statement is CreateMaterializedView) {
            Assert.assertEquals(StatementType.CREATE_MATERIALIZED_VIEW, statement.statementType)
            Assert.assertEquals("sales_summary", statement.tableId.tableName)

            Assert.assertEquals(1, statement.inputTables.size)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun commentTest0() {
        val sql = """
            COMMENT ON COLUMN employees.job_id IS 'abbreviated job title'
            COMMENT ON COLUMN employees1.job_id IS 'abbreviated job title';
        """.trimIndent()

        val statement = OracleSqlHelper.parseMultiStatement(sql)
        val st1 = statement.get(0)
        val st2 = statement.get(1)
        
        if (st1 is CommentData) {
            Assert.assertEquals(StatementType.COMMENT, st1.statementType)
            Assert.assertEquals("employees.job_id", st1.objValue)
            Assert.assertEquals("abbreviated job title", st1.comment)
            Assert.assertFalse(st1.isNull)
        }

        if (st2 is CommentData) {
            Assert.assertEquals(StatementType.COMMENT, st2.statementType)
            Assert.assertEquals("employees1.job_id", st2.objValue)
            Assert.assertEquals("abbreviated job title", st2.comment)
            Assert.assertFalse(st2.isNull)
        }
    }
}