package io.github.melin.superior.parser.postgre

import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.FunctionId
import io.github.melin.superior.common.relational.ProcedureId
import io.github.melin.superior.common.relational.create.CreateFunction
import io.github.melin.superior.common.relational.create.CreateProcedure
import org.junit.Assert
import org.junit.Test

class RedshiftSqlProcessParserTest {
    @Test
    fun createFunctionTest() {
        val sql = """
            CREATE FUNCTION public.myadd(integer, integer) RETURNS integer
            AS 'select ${'$'}1 + ${'$'}2;'
            LANGUAGE SQL
            IMMUTABLE
            RETURNS NULL ON NULL INPUT;
        """.trimIndent()

        val statement = RedshiftSqlHelper.parseStatement(sql)
        
        if (statement is CreateFunction) {
            Assert.assertEquals(StatementType.CREATE_FUNCTION, statement.statementType)
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

        val statement = RedshiftSqlHelper.parseStatement(sql)
        
        if (statement is CreateFunction) {
            Assert.assertEquals(StatementType.CREATE_FUNCTION, statement.statementType)
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

        val statement = RedshiftSqlHelper.parseStatement(sql)
        
        if (statement is CreateFunction) {
            Assert.assertEquals(StatementType.CREATE_FUNCTION, statement.statementType)
            Assert.assertEquals(FunctionId( "check_password"), statement.functionId)
            Assert.assertEquals(1, statement.inputTables.size)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun createFunctionTest3() {
        val sql = """
            create or replace procedure prac_transfer(
               sender int,
               receiver int, 
               amount dec
            )
            LANGUAGE plpgsql
            as ${'$'}${'$'}
            BEGIN
                update accounts_1
                set balance = balance - amount 
                where id = sender;
            
                update accounts_2
                set balance = balance + amount 
                where id = receiver;
            
                commit;
            END;${'$'}${'$'};
        """.trimIndent()

        val statement = RedshiftSqlHelper.parseStatement(sql)
        
        if (statement is CreateProcedure) {
            Assert.assertEquals(StatementType.CREATE_PROCEDURE, statement.statementType)
            Assert.assertEquals(ProcedureId( "prac_transfer"), statement.procedureId)
            Assert.assertEquals(2, statement.outputTables.size)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun createFunctionTest4() {
        val sql = """
            create or replace procedure prac_transfer(
               sender int,
               receiver int, 
               amount dec
            )
            LANGUAGE plpgsql
            as ${'$'}${'$'}
            BEGIN
                update accounts
                set balance = balance - amount 
                where id = sender;
            
                update accounts
                set balance = balance + amount 
                where id = receiver;
            
                commit;
            END;${'$'}${'$'};
        """.trimIndent()

        val statement = RedshiftSqlHelper.parseStatement(sql)
        
        if (statement is CreateProcedure) {
            Assert.assertEquals(StatementType.CREATE_PROCEDURE, statement.statementType)
            Assert.assertEquals(ProcedureId( "prac_transfer"), statement.procedureId)
            Assert.assertEquals(1, statement.outputTables.size)
        } else {
            Assert.fail()
        }
    }
}