package io.github.melin.superior.parser.postgre

import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.FunctionId
import io.github.melin.superior.common.relational.create.CreateFunction
import org.junit.Assert
import org.junit.Test

class PostgreSqlProcessParserTest {
    @Test
    fun createFunctionTest() {
        val sql = """
            CREATE FUNCTION public.myadd(integer, integer) RETURNS integer
            AS 'select ${'$'}1 + ${'$'}2;'
            LANGUAGE SQL
            IMMUTABLE
            RETURNS NULL ON NULL INPUT;
        """.trimIndent()

        val statementData = PostgreSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is CreateFunction) {
            Assert.assertEquals(StatementType.CREATE_FUNCTION, statementData.type)
            Assert.assertEquals(FunctionId("public", "myadd"), statement.functionId)
            Assert.assertEquals("myadd", statement.functionId.functionName)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun createFunctionTest1() {
        val sql = """
            CREATE FUNCTION myadd(integer, integer) RETURNS integer
            AS 'select ${'$'}1 + ${'$'}2;'
            LANGUAGE SQL
            IMMUTABLE
            RETURNS NULL ON NULL INPUT;
        """.trimIndent()

        val statementData = PostgreSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is CreateFunction) {
            Assert.assertEquals(StatementType.CREATE_FUNCTION, statementData.type)
            Assert.assertEquals(FunctionId("myadd"), statement.functionId)
            Assert.assertEquals("myadd", statement.functionId.functionName)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun createFunctionTest2() {
        val sql = """
            CREATE FUNCTION check_password(uname TEXT, pass TEXT)
            RETURNS BOOLEAN AS ${'$'}${'$'}
            DECLARE passed BOOLEAN;
            BEGIN
                    SELECT  (pwd = ${'$'}2) INTO passed
                    FROM    pwds
                    WHERE   username = ${'$'}1;
                    RETURN passed;
            END;
            ${'$'}${'$'}  LANGUAGE plpgsql
                SECURITY DEFINER
        """.trimIndent()

        val statementData = PostgreSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is CreateFunction) {
            Assert.assertEquals(StatementType.CREATE_FUNCTION, statementData.type)
            Assert.assertEquals(FunctionId( "check_password"), statement.functionId)
            Assert.assertEquals(1, statement.inputTables.size)
        } else {
            Assert.fail()
        }
    }
}