package io.github.melin.superior.parser.spark

import io.github.melin.superior.common.relational.common.SQLFunction
import org.junit.Assert
import org.junit.Test

class UserUDFParserTest {

    @Test
    fun udfTest0() {
        val sql =
            """
            CREATE TEMP FUNCTION foo() RETURNS INT RETURN 1
        """
                .trimIndent()

        val statement = SparkSqlHelper.parseStatement(sql)

        if (statement is SQLFunction) {
            Assert.assertEquals("foo", statement.name.functionName)
        } else {
            Assert.fail()
        }
    }
}
