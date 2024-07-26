package io.github.melin.superior.parser.postgre

import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.FunctionId
import io.github.melin.superior.common.relational.ProcedureId
import io.github.melin.superior.common.relational.create.CreateFunction
import io.github.melin.superior.common.relational.create.CreateProcedure
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

        val statement = PostgreSqlHelper.parseStatement(sql)
        
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

        val statement = PostgreSqlHelper.parseStatement(sql)
        
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
                
                update accounts_2
                set balance = balance + amount 
                where id = receiver;
            END;
            ${'$'}${'$'}  LANGUAGE plpgsql
                SECURITY DEFINER
        """.trimIndent()

        val statement = PostgreSqlHelper.parseStatement(sql)
        
        if (statement is CreateFunction) {
            Assert.assertEquals(StatementType.CREATE_FUNCTION, statement.statementType)
            Assert.assertEquals(FunctionId( "check_password"), statement.functionId)
            Assert.assertEquals(2, statement.childStatements.size)
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
            DECLARE
               max_rk int;
               max_trade_time_length int;
               max_trade_time character varying;
            BEGIN
                update accounts_1
                set balance = balance - amount 
                where id = sender;
            
                update accounts_2
                set balance = balance + amount 
                where id = receiver;
            
                commit;
            END;${'$'}${'$'};
            
            create or replace procedure prac_transfer1(
                           sender int,
                           receiver int, 
                           amount dec
                        )
                        LANGUAGE plpgsql
                        as ${'$'}${'$'}
                        DECLARE
                           max_rk int;
                           max_trade_time_length int;
                           max_trade_time character varying;
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

        val statements = PostgreSqlHelper.parseMultiStatement(sql)
        val statement = statements.get(0)
        
        if (statement is CreateProcedure) {
            Assert.assertEquals(StatementType.CREATE_PROCEDURE, statement.statementType)
            Assert.assertEquals(ProcedureId( "prac_transfer"), statement.procedureId)
            Assert.assertEquals(2, statement.childStatements.size)
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
             RETURNS SETOF record
             LANGUAGE plpgsql
             NOT FENCED NOT SHIPPABLE
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

        val statement = PostgreSqlHelper.parseStatement(sql)
        
        if (statement is CreateProcedure) {
            Assert.assertEquals(StatementType.CREATE_PROCEDURE, statement.statementType)
            Assert.assertEquals(ProcedureId( "prac_transfer"), statement.procedureId)
            Assert.assertEquals(2, statement.childStatements.size)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun createFunctionTest5() {
        val sql = """
            CREATE OR REPLACE FUNCTION fetch_film_titles_and_years(
               OUT p_title VARCHAR(255), 
               OUT p_release_year INTEGER
            )
            RETURNS SETOF RECORD 
            LANGUAGE plpgsql
            AS ${'$'}${'$'}
            DECLARE
                film_cursor CURSOR FOR
                    SELECT title, release_year
                    FROM film;
                film_record RECORD;
            BEGIN
                -- Open cursor
                OPEN film_cursor;
            
                -- Fetch rows and return
                LOOP
                    FETCH NEXT FROM film_cursor INTO film_record;
                    EXIT WHEN NOT FOUND;
            
                    p_title = film_record.title;
                    p_release_year = film_record.release_year;
                    RETURN NEXT;
                END LOOP;
            
                -- Close cursor
                CLOSE film_cursor;
                
                update accounts
                set balance = balance + amount 
                where id = receiver;
            END;
            ${'$'}${'$'}
        """.trimIndent()

        val statement = PostgreSqlHelper.parseStatement(sql)

        if (statement is CreateFunction) {
            Assert.assertEquals(StatementType.CREATE_FUNCTION, statement.statementType)
            Assert.assertEquals(FunctionId( "fetch_film_titles_and_years"), statement.functionId)
            Assert.assertEquals(2, statement.childStatements.size)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun createFunctionTest6() {
        val sql = """
            create or replace procedure prac_transfer(
               sender int,
               receiver int, 
               amount dec
            )
             RETURNS SETOF record
             LANGUAGE plpgsql
             NOT FENCED NOT SHIPPABLE
            as ${'$'}${'$'}
            BEGIN
                update accounts
                set balance = balance - amount 
                where id = sender;            
                commit;
            END;${'$'}${'$'};
            
            create or replace procedure prac_transfer1(
               sender int,
               receiver int, 
               amount dec
            )
             RETURNS SETOF record
             LANGUAGE plpgsql
             NOT FENCED NOT SHIPPABLE
            as ${'$'}${'$'}
            BEGIN
                update accounts_1
                set balance = balance - amount 
                where id = sender;            
                commit;
            END;${'$'}${'$'};
        """.trimIndent()

        val statements = PostgreSqlHelper.parseMultiStatement(sql)
        Assert.assertEquals(2, statements.size)
        var statement = statements.get(0)

        if (statement is CreateProcedure) {
            Assert.assertEquals(StatementType.CREATE_PROCEDURE, statement.statementType)
            Assert.assertEquals(ProcedureId( "prac_transfer"), statement.procedureId)
            Assert.assertEquals(1, statement.childStatements.size)
        } else {
            Assert.fail()
        }

        statement = statements.get(1)

        if (statement is CreateProcedure) {
            Assert.assertEquals(StatementType.CREATE_PROCEDURE, statement.statementType)
            Assert.assertEquals(ProcedureId( "prac_transfer1"), statement.procedureId)
            Assert.assertEquals(1, statement.childStatements.size)
        } else {
            Assert.fail()
        }
    }
}