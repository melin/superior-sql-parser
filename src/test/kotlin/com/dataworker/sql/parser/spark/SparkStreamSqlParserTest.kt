package com.dataworker.sql.parser.spark

import com.dataworker.sql.parser.*
import com.dataworker.sql.parser.model.*
import org.junit.Assert
import org.junit.Test

/**
 *
 * Created by libinsong on 2018/3/15.
 */
class SparkStreamSqlParserTest {

    @Test
    fun createTableTest() {
        val sql = "CREATE Stream TABLE student_scores (\n" +
                "  student_number string comment '学号', \n" +
                "  student_name string comment '姓名', \n" +
                "  subject string comment '学科',\n" +
                "  score '/data/score' INT comment '成绩' \n" +
                ")\n" +
                "WITH (\n" +
                "  type = \"dis\",\n" +
                "  format = \"json\",\n" +
                "  kafka.group.id = \"cn-north-1\"\n" +
                ")"

        val statementData = SparkStreamSQLHelper.getStatementData(sql).get(0)
        val statement = statementData.statement
        if (statement is StreamStreamTable) {
            Assert.assertEquals(StatementType.CREATE_TABLE, statementData.type)
            Assert.assertEquals("student_scores", statement.tableName)
            Assert.assertEquals("cn-north-1", statement.properties.get("kafka.group.id"))
        } else {
            Assert.fail()
        }
    }

    @Test
    fun createTableTest4() {
        val sql = """
            CREATE Stream TABLE orders (
	userid string,
	money bigint
)
WITH (
	type = 'kafka',
	topic = 'flink-topic-input',
	encode = 'json',
	kafka.bootstrap.servers = 'localhost:9092',
	kafka.group.id = 'flink-group'
);

insert into stat_orders SELECT userid, SUM(money) as total_money FROM orders
GROUP BY TUMBLE(proctime, INTERVAL '10' SECOND), userid;

set spark.test = 'hello world';
set spark.test = setsd,sd,resr;
set spark.test = hello world;
set spark.test = hello-world;
set spark.test = hello $\{usename} test;
#set spark.test = hello comment;
set spark.test = hello 'test' world;
set spark.test = hello "test" world;
set spark.test = hdfs://user/hive;
set spark.test = 12,12;
set spark.test = 3.45;
set spark.test = ibdex.json;
set spark.test = dw.eset_sdfe_sd;
set spark.test = demo.test;
set spark.test = dsd(id)%=2;

            """

        val statementDatas = SparkStreamSQLHelper.getStatementData(sql)
        Assert.assertEquals(16, statementDatas.size)
        val statement = statementDatas.get(0).statement
        if (statement is StreamStreamTable) {
            Assert.assertEquals("orders", statement.tableName)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun setConfigTest() {
        val sql = "set spark.test = false";

        val statementData = SparkStreamSQLHelper.getStatementData(sql).get(0)
        val statement = statementData.statement
        if (statement is SetData) {
            Assert.assertEquals(StatementType.SET, statementData.type)
            Assert.assertEquals("spark.test", statement.key)
            Assert.assertEquals("false", statement.value)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun setConfigTest1() {
        val sql = "set spark.test = 'hello world'";

        val statementData = SparkStreamSQLHelper.getStatementData(sql).get(0)
        val statement = statementData.statement
        if (statement is SetData) {
            Assert.assertEquals(StatementType.SET, statementData.type)
            Assert.assertEquals("spark.test", statement.key)
            Assert.assertEquals("hello world", statement.value)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun setConfigTest2() {
        val sql = "set spark.test = 12 ";

        val statementData = SparkStreamSQLHelper.getStatementData(sql).get(0)
        val statement = statementData.statement
        if (statement is SetData) {
            Assert.assertEquals(StatementType.SET, statementData.type)
            Assert.assertEquals("spark.test", statement.key)
            Assert.assertEquals("12", statement.value)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun setConfigTest3() {
        val sql = "set spark.test = 'demo' ";

        val statementData = SparkStreamSQLHelper.getStatementData(sql).get(0)
        val statement = statementData.statement
        if (statement is SetData) {
            Assert.assertEquals(StatementType.SET, statementData.type)
            Assert.assertEquals("spark.test", statement.key)
            Assert.assertEquals("demo", statement.value)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun insertSqlTest() {
        val sql = "insert into bigdata.test_result1 select * from users";

        val statementData = SparkStreamSQLHelper.getStatementData(sql).get(0)
        val statement = statementData.statement
        if (statement is StreamInsertStatement) {
            Assert.assertEquals(StatementType.INSERT_SELECT, statementData.type)
            Assert.assertEquals("test_result1", statement.tableName)
            Assert.assertEquals("select * from users", statement.querySql)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun insertUDTFSqlTest() {
        val sql = "insert into stat_orders_kafka\n" +
        "SELECT \n" +
                "    TUMBLE_START(proctime, INTERVAL '10' SECOND),\n" +
                "    TUMBLE_END(proctime, INTERVAL '10' SECOND),\n" +
                "    userid, \n" +
                "    SUM(money) as total_money \n" +
                "FROM (select userid, money, proctime from orders LEFT JOIN LATERAL TABLE(demoFunc(a)) as T(newuserid) ON TRUE) a\n" +
                "GROUP BY TUMBLE(proctime, INTERVAL '10' SECOND), userid;";

        val statementData = SparkStreamSQLHelper.getStatementData(sql).get(0)
        val statement = statementData.statement
        if (statement is StreamInsertStatement) {
            Assert.assertEquals(StatementType.INSERT_SELECT, statementData.type)
            Assert.assertEquals("stat_orders_kafka", statement.tableName)
        } else {
            Assert.fail()
        }
    }

}
