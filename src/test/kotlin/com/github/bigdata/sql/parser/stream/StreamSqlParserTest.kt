package com.github.bigdata.sql.parser.stream

import com.github.bigdata.sql.parser.*
import org.junit.Assert
import org.junit.Test

/**
 *
 * Created by libinsong on 2018/3/15.
 */
class StreamSqlParserTest {

    @Test
    fun createTableTest() {
        val sql = "CREATE SOURCE TABLE student_scores (\n" +
                "  student_number varchar comment '学号', \n" +
                "  student_name varchar comment '姓名', \n" +
                "  subject varchar comment '学科',\n" +
                "  score INT comment '成绩' \n" +
                ")\n" +
                "WITH (\n" +
                "  type = \"dis\",\n" +
                "  kafka.region = \"cn-north-1\"\n" +
                ") TIMESTAMP BY proctime proctime1"

        val statementData = StreamSQLHelper.getStatementData(sql).get(0)
        val statement = statementData.statement
        if (statement is StreamSourceTable) {
            Assert.assertEquals(StatementType.CREATE_TABLE, statementData.type)
            Assert.assertEquals("student_scores", statement.tableName)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun createTableTest1() {
        val sql = "CREATE SOURCE TABLE student_scores (\n" +
                "  student_number varchar comment '学号', \n" +
                "  student_name varchar comment '姓名', \n" +
                "  subject varchar comment '学科',\n" +
                "  score INT comment '成绩' \n" +
                ")\n" +
                "WITH (\n" +
                "  type = \"dis\",\n" +
                "  region = \"cn-north-1\"\n" +
                ") TIMESTAMP BY proctime proctime"

        val statementData = StreamSQLHelper.getStatementData(sql).get(0)
        val statement = statementData.statement
        if (statement is StreamSourceTable) {
            Assert.assertEquals(StatementType.CREATE_TABLE, statementData.type)
            Assert.assertEquals("student_scores", statement.tableName)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun createTableTest2() {
        val sql = "CREATE SOURCE TABLE student_scores (\n" +
                "  student_number varchar comment '学号', \n" +
                "  student_name varchar comment '姓名', \n" +
                "  subject varchar comment '学科',\n" +
                "  score INT comment '成绩', \n" +
                "  time2 BIGINT\n" +
                ")\n" +
                "WITH (\n" +
                "  type = \"dis\",\n" +
                "  region = \"cn-north-1\" \n" +
                ") TIMESTAMP BY rowtime time2 \n" +
                "SET WATERMARK DELAY 10"

        val statementData = StreamSQLHelper.getStatementData(sql).get(0)
        val statement = statementData.statement
        if (statement is StreamSourceTable) {
            Assert.assertEquals(StatementType.CREATE_TABLE, statementData.type)
            Assert.assertEquals("student_scores", statement.tableName)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun createTableTest4() {
        val sql = """
            CREATE SOURCE TABLE orders (
	userid varchar,
	money bigint
)
WITH (
	type = 'kafka',
	topic = 'flink-topic-input',
	encode = 'json',
	kafka.bootstrap.servers = 'localhost:9092',
	kafka.group.id = 'flink-group'
)
TIMESTAMP BY proctime proctime;

insert into stat_orders SELECT userid, SUM(money) as total_money FROM orders
GROUP BY TUMBLE(proctime, INTERVAL '10' SECOND), userid;

CREATE SINK TABLE stat_orders (
	userid varchar,
	total_money bigint
)
WITH (
	type = 'kafka',
	topic = 'flink-topic-output',
	encode = 'json',
	kafka.bootstrap.servers = 'localhost:9092'
);

set flink.test = 'hello world';
set flink.test = setsd,sd,resr;
set flink.test = hello world;
set flink.test = hello-world;
set flink.test = hello $\{usename} test;
#set flink.test = hello comment;
set flink.test = hello 'test' world;
set flink.test = hello "test" world;
set flink.test = hdfs://user/hive;
set flink.test = 12,12;
set flink.test = 3.45;
set flink.test = ibdex.json;
set flink.test = dw.eset_sdfe_sd;
set flink.test = demo.test;
set flink.test = dsd(id)%=2;

            """

        val statementDatas = StreamSQLHelper.getStatementData(sql)
        Assert.assertEquals(17, statementDatas.size)
        val statement = statementDatas.get(0).statement
        if (statement is StreamSourceTable) {
            Assert.assertEquals("orders", statement.tableName)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun createViewTest() {
        val sql = "create view test_view as select * from users;";

        val statementData = StreamSQLHelper.getStatementData(sql).get(0)
        val statement = statementData.statement
        if (statement is StreamView) {
            Assert.assertEquals(StatementType.CREATE_VIEW, statementData.type)
            Assert.assertEquals("test_view", statement.tableName)
            Assert.assertEquals("select * from users", statement.querySql)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun createFunctionTest() {
        val sql = "create function to_json as 'cn.github.JsonTest' USING \"demo.jar\"";

        val statementData = StreamSQLHelper.getStatementData(sql).get(0)
        val statement = statementData.statement
        if (statement is DcFunction) {
            Assert.assertEquals(StatementType.CREATE_FUNCTION, statementData.type)
            Assert.assertEquals("to_json", statement.name)
            Assert.assertEquals("cn.github.JsonTest", statement.className)
            Assert.assertEquals("demo.jar", statement.file)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun setConfigTest() {
        val sql = "set flink.test = false";

        val statementData = StreamSQLHelper.getStatementData(sql).get(0)
        val statement = statementData.statement
        if (statement is SetData) {
            Assert.assertEquals(StatementType.SET, statementData.type)
            Assert.assertEquals("flink.test", statement.key)
            Assert.assertEquals("false", statement.value)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun setConfigTest1() {
        val sql = "set flink.test = 'hello world'";

        val statementData = StreamSQLHelper.getStatementData(sql).get(0)
        val statement = statementData.statement
        if (statement is SetData) {
            Assert.assertEquals(StatementType.SET, statementData.type)
            Assert.assertEquals("flink.test", statement.key)
            Assert.assertEquals("hello world", statement.value)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun setConfigTest2() {
        val sql = "set flink.test = 12 ";

        val statementData = StreamSQLHelper.getStatementData(sql).get(0)
        val statement = statementData.statement
        if (statement is SetData) {
            Assert.assertEquals(StatementType.SET, statementData.type)
            Assert.assertEquals("flink.test", statement.key)
            Assert.assertEquals("12", statement.value)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun setConfigTest3() {
        val sql = "set flink.test = 'demo' ";

        val statementData = StreamSQLHelper.getStatementData(sql).get(0)
        val statement = statementData.statement
        if (statement is SetData) {
            Assert.assertEquals(StatementType.SET, statementData.type)
            Assert.assertEquals("flink.test", statement.key)
            Assert.assertEquals("demo", statement.value)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun insertSqlTest() {
        val sql = "insert into  test_result select * from users";

        val statementData = StreamSQLHelper.getStatementData(sql).get(0)
        val statement = statementData.statement
        if (statement is StreamInsertStatement) {
            Assert.assertEquals(StatementType.INSERT_SELECT, statementData.type)
            Assert.assertEquals("test_result", statement.tableName)
            Assert.assertEquals("select * from users", statement.querySql)
        } else {
            Assert.fail()
        }
    }
}