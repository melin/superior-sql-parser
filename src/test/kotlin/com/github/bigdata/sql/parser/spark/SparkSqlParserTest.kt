package com.github.bigdata.sql.parser.spark

import com.github.bigdata.sql.parser.*
import org.junit.Assert
import org.junit.Test

/**
 *
 * Created by libinsong on 2018/1/10.
 */
class SparkSqlParserTest {

    @Test
    fun createDatabaseTest() {
        val sql = "CREATE DATABASE IF NOT EXISTS bigdata"

        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is DcDatabase) {
            val name = statement.databaseName
            Assert.assertEquals("bigdata", name)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun dropDatabaseTest() {
        val sql = "drop DATABASE IF EXISTS bigdata"

        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is DcDatabase) {
            val name = statement.databaseName
            Assert.assertEquals("bigdata", name)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun descDatabaseTest() {
        var sql = "desc database bigdata"

        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is DcDatabase) {
            val name = statement.databaseName
            Assert.assertEquals("bigdata", name)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun createTableTest() {
        val sql = """CREATE TABLE if not exists test.users (
                name         STRING COMMENT 'Employee name',
                address      int COMMENT 'address',
                item1      double,
                item2      DECIMAL(9, 2),
                item3      TIMESTAMP,
                item4      BIGINT,
                item5      BOOLEAN
            )
            COMMENT 'hello world'
            PARTITIONED BY (ds STRING COMMENT 'part sdf')
            STORED AS PARQUET
            TBLPROPERTIES ('dataCenter'='hangzhou')
            lifecycle 7
            """

        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is DcTable) {
            val name = statement.databaseName
            Assert.assertEquals("test", name)
            Assert.assertFalse(statement.location)
            Assert.assertFalse(statement.external)
            Assert.assertFalse(statement.temporary)
            Assert.assertEquals(7, statement.lifeCycle)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun createTableTest1() {
        val sql = """create table if not exists platformtool.test_users_dt(
                    name string comment '姓名',
                    address string comment '地址'
                )
                comment 'user info'
                PARTITIONED BY (ds string, event_type string)
                lifecycle 7
            """

        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is DcTable) {
            val name = statement.databaseName
            Assert.assertEquals("platformtool", name)
            Assert.assertEquals(7, statement.lifeCycle)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun descTableTest() {
        var sql = "desc table users"
        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is DcTable) {
            val name = statement.tableName
            Assert.assertEquals("users", name)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun createTableLikeTest() {
        val sql = "create table IF NOT EXISTS test.sale_detail_like like demo.sale_detail"

        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is DcCopyTable) {
            val name = statement.newTableName
            Assert.assertEquals("sale_detail", statement.oldTableName)
            Assert.assertEquals("sale_detail_like", name)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun createTableSelectTest() {
        val sql = "create table \nIF NOT EXISTS tdl_users_1 as select * from users a left outer join address b on a.addr_id = b.id"

        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is DcTable) {
            val name = statement.tableName
            Assert.assertEquals(StatementType.CREATE_TABLE_AS_SELECT, statementData.type)
            Assert.assertEquals("tdl_users_1", name)
            Assert.assertEquals("select * from users a left outer join address b on a.addr_id = b.id", statement.querySql)
            Assert.assertEquals(2, statement.tableData?.inputTables?.size)
            Assert.assertEquals("address", statement.tableData?.inputTables?.get(1)?.tableName)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun dropTableTest() {
        val sql = "drop table if exists sale_detail_drop2"

        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is DcTable) {
            val name = statement.tableName
            Assert.assertEquals("sale_detail_drop2", name)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun dropViewTest() {
        val sql = "drop view if exists sale_detail_drop2"

        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is DcView) {
            val name = statement.tableName
            Assert.assertEquals("sale_detail_drop2", name)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun truncateTableTest() {
        val sql = "TRUNCATE TABLE test.user partition(ds='20170403')"

        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is DcTable) {
            val name = statement.tableName
            Assert.assertEquals("user", name)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun msckTableTest() {
        val sql = "MSCK REPAIR TABLE test.user"

        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is DcTable) {
            val name = statement.tableName
            Assert.assertEquals("user", name)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun createViewTest0() {
        val sql = """CREATE View view_users
            comment 'view test'
            as
            select * from account
            """

        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is DcView) {
            val name = statement.tableName
            Assert.assertEquals("view_users", name)
            Assert.assertEquals("view test", statement.comment)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun createViewTest1() {
        val sql = """CREATE View if not exists view_users
            comment 'view test'
            as
            select * from account
            """

        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is DcView) {
            val name = statement.tableName
            Assert.assertEquals("view_users", name)
            Assert.assertEquals("view test", statement.comment)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun renameTableTest() {
        var sql = "alter table test.table_name rename to new_table_name"

        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is DcRenameTable) {
            val name = statement.newName
            Assert.assertEquals("new_table_name", name)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun alterTablePropertiesTest() {
        val sql = "ALTER TABLE test.sale_detail SET TBLPROPERTIES ('comment' = 'new coments for statement sale_detail', 'lifeCycle' = '7')"

        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is DcTable) {
            Assert.assertEquals(StatementType.ALTER_TABLE_PROPERTIES, statementData.type)
            val name = statement.tableName
            Assert.assertEquals("sale_detail", name)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun addColumnTest() {
        val sql = "alter table test.sale_detail add columns (col_name1 string comment 'col_name1', col_name2 string comment 'col_name2')"

        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is DcTable) {
            val name = statement.tableName
            Assert.assertEquals("sale_detail", name)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun setTableLocationTest() {
        val sql = "alter table demo partition(ds='20180317') set location '/user/hive'"

        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is TableSource) {
            Assert.assertEquals(StatementType.ALTER_TABLE_SET_LOCATION, statementData.type)
            val name = statement.tableName
            Assert.assertEquals("demo", name)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun updateColumnTest() {
        val sql = "ALTER TABLE sale_detail CHANGE COLUMN old_col_name new_col_name string comment 'sdsd'"

        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is DcAlterColumn) {
            val name = statement.tableName
            Assert.assertEquals("sale_detail", name)
            Assert.assertEquals("sdsd", statement.comment)
        } else {
            Assert.fail()
        }

        val sql1 = "ALTER TABLE test_users_dt CHANGE age2 age3 int"

        val statementData1 = SparkSQLHelper.getStatementData(sql1)
        val statement1 = statementData1.statement
        if (statement1 is DcAlterColumn) {
            val name = statement1.tableName
            Assert.assertEquals("test_users_dt", name)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun addPartitionTest() {
        val sql = "ALTER TABLE page_view ADD PARTITION (partCol = 'value1') "

        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is DcTable) {
            val name = statement.tableName
            Assert.assertEquals("page_view", name)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun dropPartitionTest() {
        val sql = "ALTER TABLE page_view DROP PARTITION (dt='2008-08-08', country='us')"

        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is DcTable) {
            val name = statement.tableName
            Assert.assertEquals("page_view", name)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun renamePartitionTest() {
        val sql = "ALTER TABLE page_view PARTITION (dt='2008-08-08')  RENAME TO PARTITION (dt='20080808')"

        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is DcTable) {
            val name = statement.tableName
            Assert.assertEquals("page_view", name)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun createFuncTest() {
        val sql = "CREATE FUNCTION train_perceptron AS 'hivemall.classifier.PerceptronUDTF' " +
                "using jar 'hdfs://tdhdfs/user/admin/platformtool/resources/132/latest/hivemall-spark.jar'"

        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is DcFunction) {
            val name = statement.name
            Assert.assertEquals("train_perceptron", name)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun dropFuncTest() {
        val sql = "drop FUNCTION train_perceptron"

        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is DcFunction) {
            val name = statement.name
            Assert.assertEquals("train_perceptron", name)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun descFunctionTest() {
        var sql = "desc function random_int"
        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is DcFunction) {
            val name = statement.name
            Assert.assertEquals("random_int", name)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun queryTest0() {
        val sql = "select * from users a join address b on a.addr_id=b.id limit 101"
        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is TableData) {
            Assert.assertEquals(StatementType.SELECT, statementData.type)
            Assert.assertEquals(2, statement.inputTables.size)
            Assert.assertEquals("users", statement.inputTables.get(0).tableName)
            Assert.assertEquals("address", statement.inputTables.get(1).tableName)
            Assert.assertEquals(101, statement.limit)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun queryTest1() {
        val sql = "select * from (select * from users where name='melin') a limit 1001"
        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is TableData) {
            Assert.assertEquals(StatementType.SELECT, statementData.type)
            Assert.assertEquals(1, statement.inputTables.size)
            Assert.assertEquals("users", statement.inputTables.get(0).tableName)
            Assert.assertEquals(1001, statement.limit)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun queryTest2() {
        val sql = "select * from users a join (select * from address where type='hangzhou') b on a.addr_id=b.id limit 101"
        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is TableData) {
            Assert.assertEquals(StatementType.SELECT, statementData.type)
            Assert.assertEquals(2, statement.inputTables.size)
            Assert.assertEquals("users", statement.inputTables.get(0).tableName)
            Assert.assertEquals("address", statement.inputTables.get(1).tableName)
            Assert.assertEquals(101, statement.limit)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun queryTest3() {
        val sql = "select bzdys, bzhyyh, bzdy, week, round((bzdy-bzdys)*100/bzdys, 2) " +
                "from (select lag(bzdy) over (order by week) bzdys, bzhyyh, bzdy, week " +
                "from (select count(distinct partner_code) bzhyyh, count(1) bzdy, week from tdl_dt2x_table)) limit 111"

        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is TableData) {
            Assert.assertEquals(StatementType.SELECT, statementData.type)
            Assert.assertEquals(1, statement.inputTables.size)
            Assert.assertEquals("tdl_dt2x_table", statement.inputTables.get(0).tableName)
            Assert.assertEquals(111, statement.limit)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun queryTest4() {
        val sql = "select 2-1"

        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is TableData) {
            Assert.assertEquals(StatementType.SELECT, statementData.type)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun queryTest5() {
        val sql = "select \n" +
                "     t.table_name\n" +
                "     ,concat_ws('.',t.database_name,t.table_name) tab_name\n" +
                "     ,t.database_name\n" +
                "     ,t.owner \n" +
                "     ,count(distinct t2.project_code) prj_cnt\n" +
                "     ,count(distinct t1.obj_name) app_user_cnt\n" +
                "     from tidb_bigdata.t_table t \n" +
                "     left join tidb_bigdata.sec_table_privs t1\n" +
                "            on t.table_name = t1.table_name\n" +
                "           and t1.status=1\n" +
                "           and t1.expire_date >= current_date()\n" +
                "     left join tidb_bigdata.dc_project_member t2\n" +
                "             on t1.obj_id = t2.user_id\n" +
                "     where t.`lifecycle` == 1" +
                "     group by t.table_name,t.owner,t.database_name "

        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is TableData) {
            Assert.assertEquals(StatementType.SELECT, statementData.type)
            Assert.assertEquals(3, statement.inputTables.size)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun queryTest6() {
        val sql = "select * from test"

        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is TableData) {
            Assert.assertEquals(StatementType.SELECT, statementData.type)
            Assert.assertEquals(1, statement.inputTables.size)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun insertIntoTest() {
        val sql = "insert into TABLE users PARTITION(ds='20170220') values(\"libinsong\")"
        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is TableData) {
            Assert.assertEquals(StatementType.INSERT_VALUES, statementData.type)
            Assert.assertEquals("users", statement.outpuTables.get(0).tableName)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun insertOverwriteTest() {
        val sql = "insert OVERWRITE TABLE users PARTITION(ds='20170220') values(\"libinsong\")"
        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is TableData) {
            Assert.assertEquals(StatementType.INSERT_VALUES, statementData.type)
            Assert.assertEquals("users", statement.outpuTables.get(0).tableName)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun insertOverwriteQueryTest0() {
        val sql = "insert OVERWRITE TABLE users PARTITION(ds='20170220') select * from account a join address b on a.addr_id=b.id"
        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is TableData) {
            Assert.assertEquals(StatementType.INSERT_SELECT, statementData.type)
            Assert.assertEquals("users", statement.outpuTables.get(0).tableName)

            Assert.assertEquals(2, statement.inputTables.size)
            Assert.assertEquals("account", statement.inputTables.get(0).tableName)
            Assert.assertEquals("address", statement.inputTables.get(1).tableName)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun insertOverwriteQueryTest1() {
        val sql = "insert OVERWRITE TABLE users PARTITION(ds='20170220') select * from account1 union all " +
                "select * from account2"
        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is TableData) {
            Assert.assertEquals(StatementType.INSERT_SELECT, statementData.type)
            Assert.assertEquals("users", statement.outpuTables.get(0).tableName)

            Assert.assertEquals(2, statement.inputTables.size)
            Assert.assertEquals("account1", statement.inputTables.get(0).tableName)
            Assert.assertEquals("account2", statement.inputTables.get(1).tableName)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun mutilInsertTest() {
        val sql = "FROM default.sample_07\n" +
                "\n" +
                "INSERT OVERWRITE TABLE toodey1 SELECT sample_07.code,sample_07.salary\n" +
                "\n" +
                "INSERT OVERWRITE TABLE toodey2 SELECT sample_07.code,sample_07.salary WHERE sample_07.salary >= 50000\n" +
                "\n" +
                "INSERT OVERWRITE TABLE toodey3 SELECT sample_07.total_emp,sample_07.salary WHERE sample_07.salary <= 50000"

        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is TableData) {
            Assert.assertEquals(StatementType.MULTI_INSERT, statementData.type)
            Assert.assertEquals("sample_07", statement.inputTables.get(0).tableName)
            Assert.assertEquals(3, statement.outpuTables.size)
            Assert.assertEquals("toodey3", statement.outpuTables.get(2).tableName)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun showTablesTest() {
        var sql = "show Tables"

        val statementData = SparkSQLHelper.getStatementData(sql)
        Assert.assertEquals(StatementType.SHOW_TABLES, statementData.type)
    }

    @Test
    fun useTest() {
        var sql = "use bigdata"

        val statementData = SparkSQLHelper.getStatementData(sql)
        Assert.assertEquals(StatementType.USE, statementData.type)
        val statement = statementData.statement
        if (statement is DcDatabase) {
            Assert.assertEquals("bigdata", statement.databaseName)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun setTest() {
        var sql = "set spark.executor.memory=30g"

        val statementData = SparkSQLHelper.getStatementData(sql)
        Assert.assertEquals(StatementType.SET, statementData.type)
    }
}