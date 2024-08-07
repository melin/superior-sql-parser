package io.github.melin.superior.parser.mysql

import com.github.melin.superior.sql.parser.mysql.MySqlHelper
import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.create.CreateProcedure
import io.github.melin.superior.common.relational.create.CreateTableAsSelect
import org.junit.Assert
import org.junit.Test

class MySqlProcedureParserTest {

    @Test
    fun procedureTest0() {
        val sql = """
            CREATE PROCEDURE UpdateEmployeeSalary(IN employeeId INT, IN newSalary DECIMAL(10, 2))
            BEGIN
                -- Update the salary of an employee with the given ID
                UPDATE employees
                SET salary = newSalary
                WHERE id = employeeId;
                
                select * from demos;
            END;
        """.trimIndent()

        val statement = MySqlHelper.parseStatement(sql)

        if (statement is CreateProcedure) {
            Assert.assertEquals(StatementType.CREATE_PROCEDURE, statement.statementType)
            Assert.assertEquals("UpdateEmployeeSalary", statement.procedureId?.procedureName)
            Assert.assertEquals(2, statement.childStatements.size)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun procedureTest1() {
        val sql = """
            create procedure my_procedure()
            begin
                declare my_id varchar(32);
                declare my_name varchar(50);
                DECLARE done INT DEFAULT FALSE;
             
                DECLARE My_Cursor CURSOR FOR ( SELECT id, name FROM t_people ); 
                DECLARE CONTINUE HANDLER FOR NOT FOUND SET done = TRUE; 
             
                OPEN My_Cursor; 
                myLoop: LOOP 
                    FETCH My_Cursor into my_id, my_name;
                    IF done THEN 
                        LEAVE myLoop; 
                    END IF;
                    UPDATE t_user SET c_name = my_name WHERE id = my_id and rtrim(ltrim(c_name)) = '';
             
                    COMMIT;
                END LOOP myLoop;
                CLOSE My_Cursor;
            END;
        """.trimIndent()

        val statement = MySqlHelper.parseStatement(sql)

        if (statement is CreateProcedure) {
            Assert.assertEquals(StatementType.CREATE_PROCEDURE, statement.statementType)
            Assert.assertEquals("my_procedure", statement.procedureId?.procedureName)
            Assert.assertEquals(2, statement.childStatements.size)
        } else {
            Assert.fail()
        }
    }
}