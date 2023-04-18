package io.github.melin.superior.parser.oracle

import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.TableId
import io.github.melin.superior.common.relational.dml.QueryStmt
import org.junit.Assert
import org.junit.Test

class OracleSqlParserDmlTest {
    @Test
    fun querySqlTest0() {
        val sql = """
            SELECT CUSTOMER_NAME, PRICE FROM FLINKUSER.ORDERS;
        """.trimIndent()

        val statementData = OracleSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is QueryStmt) {
            Assert.assertEquals(StatementType.SELECT, statementData.type)
            Assert.assertEquals(1, statement.inputTables.size)
            Assert.assertEquals(TableId("FLINKUSER", "ORDERS"), statement.inputTables.get(0))
        } else {
            Assert.fail()
        }
    }
}