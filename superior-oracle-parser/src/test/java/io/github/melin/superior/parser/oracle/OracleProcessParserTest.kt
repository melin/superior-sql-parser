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
                        SELECT CUSTOMER_NAME, PRICE FROM ORDERS_TEST;
                        SELECT CUSTOMER_NAME, PRICE FROM ORDERS_TEST_1;
                        dbms_output.put_line(ORD.CUSTOMER_NAME || ORD.PRICE);
                    END LOOP;
            END;
        """.trimIndent()

        val statement = OracleSqlHelper.parseStatement(sql)
        
        if (statement is CreateProcedure) {
            Assert.assertEquals(StatementType.CREATE_PROCEDURE, statement.statementType)
            Assert.assertEquals(4, statement.childStatements.size)
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
            Assert.assertEquals(3, statement.childStatements.size)
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

    @Test
    fun processTest4() {
        val sql = """
            DECLARE
                CURSOR C_ORDERS IS
                    SELECT CUSTOMER_NAME, PRICE FROM ORDERS;
            BEGIN
                FOR ORD IN C_ORDERS
                    LOOP
                        SELECT CUSTOMER_NAME, PRICE FROM ORDERS_TEST;
                        SELECT CUSTOMER_NAME, PRICE FROM ORDERS_TEST_1;
                        dbms_output.put_line(ORD.CUSTOMER_NAME || ORD.PRICE);
                    END LOOP;
            END;
            
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

        val statements = OracleSqlHelper.parseMultiStatement(sql)
        Assert.assertEquals(2, statements.size)
        var statement = statements.get(0)

        if (statement is CreateProcedure) {
            Assert.assertEquals(StatementType.CREATE_PROCEDURE, statement.statementType)
            Assert.assertEquals(4, statement.childStatements.size)
        } else {
            Assert.fail()
        }

        statement = statements.get(1)

        if (statement is CreateFunction) {
            Assert.assertEquals(StatementType.CREATE_FUNCTION, statement.statementType)
            Assert.assertEquals(1, statement.childStatements.size)
            Assert.assertEquals("SELECT order_total \n" +
                    "   INTO acc_bal \n" +
                    "   FROM orders \n" +
                    "   WHERE customer_id = acc_no", statement.childStatements.get(0).getSql())
        } else {
            Assert.fail()
        }
    }

    @Test
    fun processTest5() {
        val sql = """
           CREATE OR REPLACE PROCEDURE create_and_manipulate_tables AS
            BEGIN
                EXECUTE IMMEDIATE '
                    CREATE TABLE schema1.test_table_s1 (
                        id NUMBER PRIMARY KEY,
                        name VARCHAR2(100)
                    )
                ';

                EXECUTE IMMEDIATE 'INSERT INTO schema1.test_table_s1 (id, name) VALUES (1, ''Alice'')';                
            END;
        """.trimIndent()

        val statement = OracleSqlHelper.parseStatement(sql)

        if (statement is CreateProcedure) {
            Assert.assertEquals(StatementType.CREATE_PROCEDURE, statement.statementType)
            Assert.assertEquals(ProcedureId("create_and_manipulate_tables"), statement.procedureId)
            Assert.assertEquals(2, statement.childStatements.size)
            Assert.assertEquals(StatementType.CREATE_TABLE, statement.childStatements.get(0).statementType)
            Assert.assertEquals(StatementType.INSERT, statement.childStatements.get(1).statementType)
            Assert.assertEquals("INSERT INTO schema1.test_table_s1 (id, name) VALUES (1, 'Alice')", statement.childStatements.get(1).getSql())
        } else {
            Assert.fail()
        }

    }
}