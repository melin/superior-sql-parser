package io.github.melin.superior.parser.oracle

import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.create.CreateTable
import org.junit.Assert
import org.junit.Test

class OracleSqlParserDdlTest {
    @Test
    fun createTableTest0() {
        val sql = """
            CREATE TABLE employees(
                employee_id number(10) NOT NULL,
                employee_name varchar2(50) NOT NULL,
                city varchar2(50),
                CONSTRAINT employees_pk PRIMARY KEY (employee_id)
            );
        """.trimIndent()

        val statementData = OracleSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is CreateTable) {
            Assert.assertEquals(StatementType.CREATE_TABLE, statementData.type)
            Assert.assertEquals("employees", statement.tableId.tableName)
            Assert.assertEquals(3, statement.columnRels?.size)
            Assert.assertTrue(statement.columnRels?.get(0)?.isPk!!)
            Assert.assertFalse(statement.columnRels?.get(1)?.isPk!!)
        } else {
            Assert.fail()
        }
    }
}