package com.dataworker.sql.parser.tsql

import com.dataworker.sql.parser.StatementType
import com.dataworker.sql.parser.model.TableData
import org.junit.Assert
import org.junit.Test

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
        if (statement is TableData) {
            Assert.assertEquals(StatementType.SELECT, statementData.type)
            Assert.assertEquals(2, statement.inputTables.size)
        } else {
            Assert.fail()
        }
    }
}
