package io.github.melin.superior.parser.mysql

import com.github.melin.superior.sql.parser.mysql.MySQLHelper
import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.dml.QueryStmt
import io.github.melin.superior.common.relational.dml.InsertStmt
import io.github.melin.superior.common.relational.dml.DeleteTable
import io.github.melin.superior.common.relational.dml.UpdateTable
import org.junit.Assert
import org.junit.Test

/**
 *
 * Created by libinsong on 2018/1/10.
 */
class MySQLParserDmlTest {

    @Test
    fun selectTest0() {
        val sql = "select * from users limit 1"

        val tableData = MySQLHelper.getStatementData(sql)
        val statement = tableData.statement
        if(statement is QueryStmt) {
            Assert.assertEquals(StatementType.SELECT, tableData.type)
            Assert.assertEquals(1, statement.inputTables.size)
            Assert.assertEquals(1, statement.limit)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun selectTest1() {
        val sql = "select * from users a left outer join address b on a.address_id = b.id limit 100, 10"

        val statementData = MySQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if(statement is QueryStmt) {
            Assert.assertEquals(StatementType.SELECT, statementData.type)
            Assert.assertEquals(2, statement.inputTables.size)
            Assert.assertEquals(10, statement.limit)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun deleteTest0() {
        val sql = """
            DELETE FROM films
            WHERE producer_id IN (SELECT id FROM producers WHERE name = 'foo');
        """.trimIndent()

        val statementData = MySQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is DeleteTable) {
            Assert.assertEquals(StatementType.DELETE, statementData.type)
            Assert.assertEquals("films", statement.firstTableId().tableName)
            Assert.assertEquals(1, statement.inputTables.size)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun deleteTest1() {
        val sql = """
            DELETE t1, t2 FROM t1 INNER JOIN t2 INNER JOIN t3
            WHERE t1.id=t2.id AND t2.id=t3.id;
        """.trimIndent()

        val statementData = MySQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is DeleteTable) {
            Assert.assertEquals(StatementType.DELETE, statementData.type)
            Assert.assertEquals("t1", statement.firstTableId().tableName)
            Assert.assertEquals(2, statement.outputTables.size)
            Assert.assertEquals(3, statement.inputTables.size)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun deleteTest2() {
        val sql = """
            DELETE FROM t1, t2 USING t1 INNER JOIN t2 INNER JOIN t3
            WHERE t1.id=t2.id AND t2.id=t3.id;
        """.trimIndent()

        val statementData = MySQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is DeleteTable) {
            Assert.assertEquals(StatementType.DELETE, statementData.type)
            Assert.assertEquals("t1", statement.firstTableId().tableName)
            Assert.assertEquals(2, statement.outputTables.size)
            Assert.assertEquals(3, statement.inputTables.size)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun updateTest0() {
        val sql = """
            UPDATE employees SET sales_count = sales_count + 1 WHERE id =
            (SELECT sales_person FROM accounts WHERE name = 'Acme Corporation');
        """.trimIndent()

        val statementData = MySQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is UpdateTable) {
            Assert.assertEquals(StatementType.UPDATE, statementData.type)
            Assert.assertEquals("employees", statement.firstTableId().tableName)
            Assert.assertEquals(1, statement.inputTables.size)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun updateTest1() {
        val sql = """
            UPDATE product p LEFT JOIN product_price pp ON p.productid= pp.productid 
            SET p.isdelete = 1 WHERE pp.productid IS NULL;
        """.trimIndent()

        val statementData = MySQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is UpdateTable) {
            Assert.assertEquals(StatementType.UPDATE, statementData.type)
            Assert.assertEquals("product", statement.firstTableId().tableName)
            Assert.assertEquals(2, statement.outputTables.size)
            Assert.assertEquals(0, statement.inputTables.size)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun insertValuesTest() {
        //val sql = "insert into user values('name')"
        val sql = "insert into bigdata.user select * from users a left outer join address b on a.address_id = b.id"

        val statementData = MySQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if(statement is InsertStmt) {
            Assert.assertEquals(StatementType.INSERT_SELECT, statementData.type)
            Assert.assertEquals("bigdata", statement.tableId?.schemaName)
            Assert.assertEquals("user", statement.tableId?.tableName)
            Assert.assertEquals(2, statement.inputTables.size)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun countCondTest() {
        var sql = "select count(type='mac' or null) From test_table where a=2"

        val statementData = MySQLHelper.getStatementData(sql)
        Assert.assertEquals(StatementType.SELECT, statementData.type)
        val statement = statementData.statement
        if (statement is QueryStmt) {
            Assert.assertEquals("test_table", statement.inputTables.get(0).tableName)
        } else {
            Assert.fail()
        }
    }
}

