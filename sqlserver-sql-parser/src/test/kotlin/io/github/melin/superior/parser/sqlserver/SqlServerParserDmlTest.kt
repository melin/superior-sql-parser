package io.github.melin.superior.parser.sqlserver

import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.dml.QueryStmt
import org.junit.Assert
import org.junit.Test

/**
 * Created by libinsong on 2020/6/30 11:05 上午
 */
class SqlServerParserDmlTest {

    @Test
    fun queryTest0() {
        val sql = """
            SELECT * FROM DBName.do.TestTable TestTable
        """.trimIndent()

        val statementData = SqlServerHelper.getStatementData(sql)
        val statement = statementData?.statement
        if (statement is QueryStmt) {
            Assert.assertEquals(StatementType.SELECT, statementData.type)
            Assert.assertEquals(1, statement.inputTables.size)
        } else {
            Assert.fail()
        }
    }


}
