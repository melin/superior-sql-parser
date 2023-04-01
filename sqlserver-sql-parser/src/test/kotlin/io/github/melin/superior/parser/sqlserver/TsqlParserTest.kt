package io.github.melin.superior.parser.sqlserver

import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.TableLineage
import org.junit.Assert

/**
 * Created by libinsong on 2020/6/30 11:05 上午
 */
class TsqlParserTest {

    //@Test
    fun queryTest0() {
        val sql = """
            SELECT * FROM DBName.do.TestTable TestTable
        """.trimIndent()

        val statementData = TsqlHelper.getStatementData(sql)
        val statement = statementData?.statement
        if (statement is TableLineage) {
            Assert.assertEquals(StatementType.SELECT, statementData.type)
            Assert.assertEquals(2, statement.inputTables.size)
        } else {
            Assert.fail()
        }
    }
}
