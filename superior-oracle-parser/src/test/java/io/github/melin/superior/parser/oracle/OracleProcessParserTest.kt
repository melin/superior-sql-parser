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
import io.github.melin.superior.common.relational.table.TruncateTable
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

    @Test
    fun executeImmediateTruncatePartitionTest() {
        val sql = """
            CREATE OR REPLACE PROCEDURE truncate_partition_proc AS
                VN_MON VARCHAR2(10) := '202301';
            BEGIN
                EXECUTE IMMEDIATE 'ALTER TABLE TABLE_1 TRUNCATE PARTITION PY_' ||
                                  VN_MON || '  ';
            END;
        """.trimIndent()

        val statement = OracleSqlHelper.parseStatement(sql)

        if (statement is CreateProcedure) {
            Assert.assertEquals(StatementType.CREATE_PROCEDURE, statement.statementType)
            Assert.assertEquals(ProcedureId("truncate_partition_proc"), statement.procedureId)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun executeImmediateTruncatePartitionAnonymousBlockTest() {
        val sql = """
            DECLARE
                VN_MON VARCHAR2(10) := '202301';
            BEGIN
                EXECUTE IMMEDIATE 'ALTER TABLE TABLE_1 TRUNCATE PARTITION PY_' ||
                                  VN_MON || '  ';
            END;
        """.trimIndent()

        val statement = OracleSqlHelper.parseStatement(sql)

        if (statement is CreateProcedure) {
            Assert.assertEquals(StatementType.CREATE_PROCEDURE, statement.statementType)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun createPlpgsqlFunctionTest() {
        // Test PL/pgSQL style function syntax
        val sql = """
            CREATE OR REPLACE FUNCTION mart_rpt.TEST_PROC(v_indate numeric, OUT v_retcode character varying, OUT v_err character varying)
             RETURNS record
             LANGUAGE plpgsql
             NOT FENCED NOT SHIPPABLE
            AS ${'$'}${'$'} DECLARE
                v_temp VARCHAR2(100);
            BEGIN
                v_retcode := '0';
                v_err := 'SUCCESS';
            END${'$'}${'$'}
        """.trimIndent()

        val statement = OracleSqlHelper.parseStatement(sql)

        if (statement is CreateFunction) {
            Assert.assertEquals(StatementType.CREATE_FUNCTION, statement.statementType)
            Assert.assertEquals(FunctionId("mart_rpt", "TEST_PROC"), statement.functionId)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun createPlpgsqlProcedureTest() {
        // Test PL/pgSQL style procedure syntax
        val sql = """
            CREATE OR REPLACE PROCEDURE mart_rpt.TEST_PROC2(v_indate numeric)
             RETURNS void
             LANGUAGE plpgsql
             NOT FENCED NOT SHIPPABLE
            AS ${'$'}${'$'}
            BEGIN
                UPDATE test_table SET col1 = v_indate;
            END${'$'}${'$'}
        """.trimIndent()

        val statement = OracleSqlHelper.parseStatement(sql)

        if (statement is CreateProcedure) {
            Assert.assertEquals(StatementType.CREATE_PROCEDURE, statement.statementType)
            Assert.assertEquals(1, statement.childStatements.size)
            Assert.assertEquals(ProcedureId("mart_rpt", "TEST_PROC2"), statement.procedureId)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun oracleCursorWithParamsTest() {
        val sql = """
            CREATE FUNCTION test_cursor_params()
            RETURNS record
            LANGUAGE plpgsql
            AS ${'$'}${'$'}
            DECLARE
              CURSOR emp_cursor(dept_id IN NUMBER DEFAULT 10) IS
                SELECT employee_id, first_name FROM employees WHERE department_id = dept_id;
              CURSOR simple_cur IS SELECT * FROM users;
            BEGIN
              NULL;
            END;
            ${'$'}${'$'}
        """.trimIndent()

        val statement = OracleSqlHelper.parseStatement(sql)

        if (statement is CreateFunction) {
            Assert.assertEquals(StatementType.CREATE_FUNCTION, statement.statementType)
            Assert.assertEquals(FunctionId("test_cursor_params"), statement.functionId)
            // Should have 2 child statements (two cursor SELECT queries)
            Assert.assertEquals(2, statement.childStatements.size)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun plpgsqlRaiseStatementTest() {
        // Test PL/pgSQL RAISE statement with various forms
        val sql = """
            CREATE OR REPLACE FUNCTION test_raise_func
            RETURNS void
            LANGUAGE plpgsql
            AS ${'$'}${'$'}
            BEGIN
                RAISE NOTICE 'This is a notice message';
                RAISE WARNING 'Warning: value is %', v_value;
                RAISE EXCEPTION 'Error occurred: %', error_msg USING ERRCODE = 'P0001';
                RAISE DEBUG 'Debug info';
                RAISE INFO 'Information message';
                RAISE LOG 'Log entry';
                RAISE SQLSTATE '22012';
                RAISE;
            END;
            ${'$'}${'$'}
        """.trimIndent()

        val statement = OracleSqlHelper.parseStatement(sql)

        if (statement is CreateFunction) {
            Assert.assertEquals(StatementType.CREATE_FUNCTION, statement.statementType)
            Assert.assertEquals(FunctionId("test_raise_func"), statement.functionId)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun plpgsqlRaiseWithUsingClauseTest() {
        // Test RAISE with USING clause
        val sql = """
            CREATE OR REPLACE PROCEDURE test_raise_using
            RETURNS void
            LANGUAGE plpgsql
            AS ${'$'}${'$'}
            BEGIN
                analyze  mart_s.ax01;
                RAISE EXCEPTION 'Division by zero'
                    USING ERRCODE = '22012',
                          HINT = 'Check the denominator value',
                          DETAIL = 'Cannot divide by zero';
            END;
            ${'$'}${'$'}
        """.trimIndent()

        val statement = OracleSqlHelper.parseStatement(sql)

        if (statement is CreateProcedure) {
            Assert.assertEquals(StatementType.CREATE_PROCEDURE, statement.statementType)
            Assert.assertEquals(ProcedureId("test_raise_using"), statement.procedureId)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun plpgsqlAnalyzeStatementTest() {
        // Test PostgreSQL ANALYZE statement - simple form
        val sql1 = "ANALYZE"
        OracleSqlHelper.parseStatement(sql1)

        // Test ANALYZE with table name
        val sql2 = "analyze my_table"
        OracleSqlHelper.parseStatement(sql2)

        // Test ANALYZE VERBOSE
        val sql3 = "ANALYZE VERBOSE my_schema.my_table"
        OracleSqlHelper.parseStatement(sql3)

        // Test ANALYSE (British spelling)
        val sql4 = "ANALYSE my_table"
        OracleSqlHelper.parseStatement(sql4)

        // Test ANALYZE with multiple tables
        val sql5 = "ANALYZE table1, table2, table3"
        OracleSqlHelper.parseStatement(sql5)

        // Test ANALYZE with column list
        val sql6 = "ANALYZE my_table (col1, col2, col3)"
        OracleSqlHelper.parseStatement(sql6)
    }

    @Test
    fun plpgsqlAnalyzeWithOptionsTest() {
        // Test ANALYZE with options
        val sql1 = "ANALYZE (VERBOSE true) my_table"
        OracleSqlHelper.parseStatement(sql1)

        // Test ANALYZE with multiple options
        val sql2 = "ANALYZE (VERBOSE, SKIP_LOCKED) my_table"
        OracleSqlHelper.parseStatement(sql2)

        // Test ANALYZE with option value
        val sql3 = "ANALYZE (VERBOSE true, BUFFER_USAGE_LIMIT 512) my_table"
        OracleSqlHelper.parseStatement(sql3)
    }

    @Test
    fun truncateTableWithoutExecuteImmediateTest() {
        // Test TRUNCATE TABLE statement inside procedure without EXECUTE IMMEDIATE
        val sql = """
           CREATE OR REPLACE PROCEDURE create_and_manipulate_tables AS
            BEGIN
                truncate table schema1.test_table_s1;
            END;
        """.trimIndent()

        val statement = OracleSqlHelper.parseStatement(sql)

        if (statement is CreateProcedure) {
            Assert.assertEquals(StatementType.CREATE_PROCEDURE, statement.statementType)
            Assert.assertEquals(ProcedureId("create_and_manipulate_tables"), statement.procedureId)
            Assert.assertEquals(1, statement.childStatements.size)

            val childStatement = statement.childStatements.get(0)
            Assert.assertEquals(StatementType.TRUNCATE_TABLE, childStatement.statementType)

            if (childStatement is TruncateTable) {
                Assert.assertEquals("schema1", childStatement.tableId.schemaName)
                Assert.assertEquals("test_table_s1", childStatement.tableId.tableName)
            } else {
                Assert.fail("Expected TruncateTable statement")
            }
        } else {
            Assert.fail()
        }
    }

    @Test
    fun multipleDmlStatementsWithoutExecuteImmediateTest() {
        // Test multiple DML statements inside procedure without EXECUTE IMMEDIATE
        val sql = """
           CREATE OR REPLACE PROCEDURE test_multiple_dml AS
            BEGIN
                truncate table schema1.table1;
                DELETE FROM schema2.table2 WHERE id > 100;
                UPDATE schema3.table3 SET status = 'active';
            END;
        """.trimIndent()

        val statement = OracleSqlHelper.parseStatement(sql)

        if (statement is CreateProcedure) {
            Assert.assertEquals(StatementType.CREATE_PROCEDURE, statement.statementType)
            Assert.assertEquals(ProcedureId("test_multiple_dml"), statement.procedureId)
            Assert.assertEquals(3, statement.childStatements.size)

            Assert.assertEquals(StatementType.TRUNCATE_TABLE, statement.childStatements.get(0).statementType)
            Assert.assertEquals(StatementType.DELETE, statement.childStatements.get(1).statementType)
            Assert.assertEquals(StatementType.UPDATE, statement.childStatements.get(2).statementType)
        } else {
            Assert.fail()
        }
    }

}