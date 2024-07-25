package io.github.melin.superior.parser.oracle

import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.FunctionId
import io.github.melin.superior.common.relational.ProcedureId
import io.github.melin.superior.common.relational.TableId
import io.github.melin.superior.common.relational.common.CallProcedure
import io.github.melin.superior.common.relational.create.CreateFunction
import io.github.melin.superior.common.relational.create.CreateProcedure
import io.github.melin.superior.common.relational.drop.DropFunction
import io.github.melin.superior.common.relational.drop.DropProcedure
import org.junit.Assert
import org.junit.Test

class OracleProcessParserTest {
    @Test
    fun processTest0() {
        val sql = """
            DECLARE
                CURSOR C_ORDERS IS
                    SELECT CUSTOMER_NAME, PRICE FROM ORDERS;
            BEGIN
                FOR ORD IN C_ORDERS
                    LOOP
                        dbms_output.put_line(ORD.CUSTOMER_NAME || ORD.PRICE);
                    END LOOP;
            END;
        """.trimIndent()

        val statement = OracleSqlHelper.parseStatement(sql)
        
        if (statement is CreateProcedure) {
            Assert.assertEquals(StatementType.CREATE_PROCEDURE, statement.statementType)
            Assert.assertEquals(2, statement.childStatements.size)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun createFunctionTest() {
        val sql = """
            CREATE FUNCTION test.get_bal(acc_no IN NUMBER) 
               RETURN NUMBER 
               IS acc_bal NUMBER(11,2);
            BEGIN 
               SELECT order_total 
               INTO acc_bal 
               FROM orders 
               WHERE customer_id = acc_no; 
               RETURN(acc_bal); 
             END;
        """.trimIndent()

        val statement = OracleSqlHelper.parseStatement(sql)
        
        if (statement is CreateFunction) {
            Assert.assertEquals(StatementType.CREATE_FUNCTION, statement.statementType)
            Assert.assertEquals(FunctionId("test", "get_bal"), statement.functionId)
            Assert.assertEquals(1, statement.childStatements.size)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun createFunctionTest1() {
        val sql = """
            CREATE FUNCTION get_bal(acc_no IN NUMBER) 
               RETURN NUMBER 
               IS acc_bal NUMBER(11,2);
            BEGIN 
               SELECT order_total 
               INTO acc_bal 
               FROM orders 
               WHERE customer_id = acc_no; 
               RETURN(acc_bal); 
             END;
        """.trimIndent()

        val statement = OracleSqlHelper.parseStatement(sql)
        
        if (statement is CreateFunction) {
            Assert.assertEquals(StatementType.CREATE_FUNCTION, statement.statementType)
            Assert.assertEquals(FunctionId( "get_bal"), statement.functionId)
            Assert.assertEquals(1, statement.childStatements.size)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun createProcedureTest0() {
        val sql = """
            CREATE OR REPLACE Procedure UpdateCourse( name_in IN varchar2 )
            IS
               cnumber number;
               cursor c1 is
               SELECT course_number
                FROM courses_tbl
                WHERE course_name = name_in;
            BEGIN
               open c1;
               fetch c1 into cnumber;
            
               if c1%notfound then
                  cnumber := 9999;
               end if;
            
               INSERT INTO student_courses( course_name,course_number )
               VALUES ( name_in, cnumber );
            
               commit;
               close c1;
            EXCEPTION
            WHEN OTHERS THEN
               raise_application_error(-20001,'An error was encountered - '||SQLCODE||' -ERROR- '||SQLERRM);
            END;
        """.trimIndent()

        val statement = OracleSqlHelper.parseStatement(sql)
        
        if (statement is CreateProcedure) {
            Assert.assertEquals(StatementType.CREATE_PROCEDURE, statement.statementType)
            Assert.assertEquals(ProcedureId("UpdateCourse"), statement.procedureId)
            Assert.assertEquals(1, statement.childStatements.size)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun dropTest() {
        val sql = """
            DROP FUNCTION get_bal;
            DROP PROCEDURE demos.UpdateCourse;
        """.trimIndent()

        val statements = OracleSqlHelper.parseMultiStatement(sql)

        val dropFunction = statements.get(0)
        val dropProcess = statements.get(1)

        if (dropFunction is DropFunction) {
            Assert.assertEquals("get_bal", dropFunction.functionId.functionName)
        } else {
            Assert.fail()
        }

        if (dropProcess is DropProcedure) {
            Assert.assertEquals("demos", dropProcess.procedureId.schemaName)
            Assert.assertEquals("UpdateCourse", dropProcess.procedureId.procedureName)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun callProcessTest() {
        val sql = """
            Call UpdateCourse('tes');
            begin
                UpdateCourse('tes');
            end;
        """.trimIndent()

        val statements = OracleSqlHelper.parseMultiStatement(sql)

        val procedure1 = statements.get(0)
        val procedure2 = statements.get(1)

        if (procedure1 is CallProcedure) {
            Assert.assertEquals("UpdateCourse", procedure1.procedureIds.first().procedureName)
        } else {
            Assert.fail()
        }

        if (procedure2 is CreateProcedure) {
            Assert.assertEquals(1, procedure2.childStatements.size)
        } else {
            Assert.fail()
        }
    }
}