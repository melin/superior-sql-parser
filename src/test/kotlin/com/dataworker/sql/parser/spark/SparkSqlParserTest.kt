package com.dataworker.sql.parser.spark

import com.dataworker.sql.parser.*
import com.dataworker.sql.parser.model.*
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
    fun createDatabaseTest2() {
        val sql = "CREATE DATABASE IF NOT EXISTS bigdata location 's3a://hive/s3/'"

        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is DcDatabase) {
            val name = statement.databaseName
            Assert.assertEquals("bigdata", name)
            val location = statement.location;
            Assert.assertEquals("s3a://hive/s3/",location)
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
            STORED AS ORC
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
            Assert.assertEquals(statement.fileFormat, "ORC")
            Assert.assertFalse(statement.temporary)
            Assert.assertEquals(7, statement.lifeCycle)

            Assert.assertEquals(1, statement.partitionColumnNames?.size)
            Assert.assertEquals("ds", statement.partitionColumnNames?.get(0))
        } else {
            Assert.fail()
        }
    }

    @Test
    fun createTableTest1() {
        val sql = """create table if not exists platformtool.test_users_dt(
                    name string comment '姓名',
                    address string comment '地址',
                    image binary comment 'image'
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
            Assert.assertEquals("姓名", statement.columns?.get(0)?.comment)

            Assert.assertEquals(2, statement.partitionColumnNames?.size)
            Assert.assertEquals("ds", statement.partitionColumnNames?.get(0))
            Assert.assertEquals("event_type", statement.partitionColumnNames?.get(1))
        } else {
            Assert.fail()
        }
    }

    @Test
    fun createTableTest2() {
        val sql = """
            CREATE TABLE dc_cluster_compute (
                id	    bigint	comment	'id',
                data_center	string	comment	'数据中心',
                code	string	comment	'code',
                name	string	comment	'集群名称'
            ) 
            comment	'计算集群'
            lifecycle 100; 
            """

        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is DcTable) {
            val name = statement.tableName
            Assert.assertEquals("dc_cluster_compute", name)
            Assert.assertEquals(100, statement.lifeCycle)
            Assert.assertEquals("数据中心", statement.columns?.get(1)?.comment)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun createTableTest3() {
        val sql = """
            CREATE TABLE bigdata.iceberg_test_dt (
            id bigint,
            data string)
            stored as iceberg
            PARTITIONED BY (ds string)
            lifecycle 100;
            """

        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is DcTable) {
            val name = statement.tableName
            Assert.assertEquals("iceberg_test_dt", name)
            Assert.assertEquals(100, statement.lifeCycle)
            Assert.assertEquals(1, statement.partitionColumnNames?.size)
            Assert.assertEquals("ds", statement.partitionColumnNames?.get(0))
        } else {
            Assert.fail()
        }
    }

    @Test
    fun createTableTest4() {
        val sql = """
            CREATE TABLE `bigdata`.`export_test_dt` (
            `message` STRING COMMENT '',
            `collect_time` TIMESTAMP COMMENT '',
            `ds` STRING COMMENT '')
            USING orc
            PARTITIONED BY (ds)
            TBLPROPERTIES (
            'transient_lastDdlTime' = '1627281671')
            lifeCycle 100
            """

        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is DcTable) {
            val name = statement.tableName
            Assert.assertEquals("export_test_dt", name)
            Assert.assertEquals(100, statement.lifeCycle)
            Assert.assertEquals("orc", statement.fileFormat)
            Assert.assertEquals(1, statement.partitionColumnNames?.size)
            Assert.assertEquals("ds", statement.partitionColumnNames?.get(0))
        } else {
            Assert.fail()
        }
    }

    @Test
    fun createTableTest5() {
        val sql = """
            CREATE TABLE `bigdata`.`export_test_dt` (
              `message` STRING COMMENT '',
              `collect_time` TIMESTAMP COMMENT '',
              `the_date` STRING COMMENT '',
              `the_nums` STRING COMMENT '')
            USING orc
            PARTITIONED BY (the_date, the_nums)
            TBLPROPERTIES (
              'transient_lastDdlTime' = '1627288235')
            lifeCycle 100
            """

        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is DcTable) {
            val name = statement.tableName
            Assert.assertEquals("export_test_dt", name)
            Assert.assertEquals(100, statement.lifeCycle)
            Assert.assertEquals("orc", statement.fileFormat)
            Assert.assertEquals(2, statement.partitionColumnNames?.size)
            Assert.assertEquals("the_date", statement.partitionColumnNames?.get(0))
            Assert.assertEquals("the_nums", statement.partitionColumnNames?.get(1))
        } else {
            Assert.fail()
        }
    }

    @Test
    fun createHudiTableTest5() {
        val sql = """
            create table test_hudi_table ( id int, name string, price double, ts long) 
            stored as hudi
            primary key (id, name) with MOR
            partitioned by (dt string)
            lifeCycle 300
            """

        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        Assert.assertEquals(StatementType.CREATE_TABLE, statementData.type)
        if (statement is DcTable) {
            val name = statement.tableName
            Assert.assertEquals("test_hudi_table", name)
            Assert.assertEquals(2, statement.hudiPrimaryKeys.size)
            Assert.assertEquals("id", statement.hudiPrimaryKeys.get(0))
            Assert.assertEquals("name", statement.hudiPrimaryKeys.get(1))
            Assert.assertEquals("MOR", statement.hudiType)

            Assert.assertEquals(300, statement.lifeCycle)
            Assert.assertEquals("hudi", statement.fileFormat)
            Assert.assertEquals(1, statement.partitionColumnNames?.size)
            Assert.assertEquals("dt", statement.partitionColumnNames?.get(0))
        } else {
            Assert.fail()
        }
    }

    @Test
    fun createHudiTableTest6() {
        val sql = """
            create table test_hudi_table ( id int, name string, price double, ts long) 
            stored as hudi
            primary key (id, name)
            partitioned by (dt string)
            lifeCycle 300
            """

        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        Assert.assertEquals(StatementType.CREATE_TABLE, statementData.type)
        if (statement is DcTable) {
            val name = statement.tableName
            Assert.assertEquals("test_hudi_table", name)
            Assert.assertEquals(2, statement.hudiPrimaryKeys.size)
            Assert.assertEquals("id", statement.hudiPrimaryKeys.get(0))
            Assert.assertEquals("name", statement.hudiPrimaryKeys.get(1))
            Assert.assertEquals("COW", statement.hudiType)

            Assert.assertEquals(300, statement.lifeCycle)
            Assert.assertEquals("hudi", statement.fileFormat)
            Assert.assertEquals(1, statement.partitionColumnNames?.size)
            Assert.assertEquals("dt", statement.partitionColumnNames?.get(0))
        } else {
            Assert.fail()
        }
    }

    @Test
    fun descTableTest0() {
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
    fun descPartitionTest() {
        val sql = "DESC formatted user partition(ds=20190708)"

        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is DcTable) {
            Assert.assertEquals(StatementType.DESC_TABLE, statementData.type)
            Assert.assertEquals("user", statement.tableName)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun createTableLikeTest() {
        val sql = "create table IF NOT EXISTS test.sale_detail_like  like demo.sale_detail"

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
        val sql = "create table \nIF NOT EXISTS tdl_users_1 STORED AS ORC as select * from bigdata.users a left outer join address b on a.addr_id = b.id"

        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is DcTable) {
            val name = statement.tableName
            Assert.assertEquals(StatementType.CREATE_TABLE_AS_SELECT, statementData.type)
            Assert.assertEquals(statement.fileFormat, "ORC")
            Assert.assertEquals("tdl_users_1", name)
            Assert.assertEquals("select * from bigdata.users a left outer join address b on a.addr_id = b.id", statement.querySql)
            Assert.assertEquals(2, statement.tableData?.inputTables?.size)
            Assert.assertEquals("users", statement.tableData?.inputTables?.get(0)?.tableName)
            Assert.assertEquals("address", statement.tableData?.inputTables?.get(1)?.tableName)
        } else {
            Assert.fail()
        }

        val sql1 = SparkSQLHelper.replaceSql(sql,
                mapOf("bigdata.users" to "iceberg_spark.bigdata.users", "address" to "iceberg_spark.bigdata.address"))
        Assert.assertEquals("create table \nIF NOT EXISTS tdl_users_1 STORED AS ORC as " +
                "select * from iceberg_spark.bigdata.users a left outer join iceberg_spark.bigdata.address b on a.addr_id = b.id",
                sql1);
    }

    @Test
    fun createTableSelectTest1() {
        val sql = """
               CREATE TABLE t
               PARTITIONED BY (b)
               AS SELECT 1 as a, "a" as b
               """

        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is DcTable) {
            val name = statement.tableName
            Assert.assertEquals(StatementType.CREATE_TABLE_AS_SELECT, statementData.type)
            Assert.assertEquals("t", name)
            Assert.assertEquals("SELECT 1 as a, \"a\" as b", statement.querySql)
            Assert.assertEquals("b", statement.partitionColumnNames?.get(0))
        } else {
            Assert.fail()
        }
    }

    @Test
    fun createTableSelectTest2() {
        val sql = "create table \nIF NOT EXISTS tdl_users_1 using parquet as (select * from users a left outer join address b on a.addr_id = b.id)"

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

        val sql1 = SparkSQLHelper.replaceSql(sql,
                mapOf("users" to "iceberg_users", "address" to "iceberg_address"))
        Assert.assertEquals("create table \nIF NOT EXISTS tdl_users_1 using parquet as (select * from iceberg_users a left outer join iceberg_address b on a.addr_id = b.id)",
            sql1);
    }

    @Test
    fun createTableSelectTest3() {
        val sql = "create table \nIF NOT EXISTS tdl_users_1 using parquet as (select * from users a left outer join address b on a.addr_id = b.id" +
                " left outer join `bigdata`.users c on c.userid_id = a.id)"

        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is DcTable) {
            val name = statement.tableName
            Assert.assertEquals(StatementType.CREATE_TABLE_AS_SELECT, statementData.type)
            Assert.assertEquals("tdl_users_1", name)
            //Assert.assertEquals("select * from users a left outer join address b on a.addr_id = b.id", statement.querySql)
            Assert.assertEquals(3, statement.tableData?.inputTables?.size)
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
            Assert.assertEquals("select * from account", statement.querySql)
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
            Assert.assertEquals("select * from account", statement.querySql)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun alterViewTest0() {
        val sql = "ALTER VIEW v1 AS SELECT x, UPPER(s) s FROM t2"

        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is DcView) {
            val name = statement.tableName
            Assert.assertEquals("v1", name)
            Assert.assertEquals("SELECT x, UPPER(s) s FROM t2", statement.querySql)
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
    fun touchTableTest() {
        var sql = "alter table test.table_name TOUCH"

        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        Assert.assertEquals(StatementType.ALTER_TABLE_TOUCH, statementData.type)
        if (statement is TouchTable) {
            Assert.assertEquals("table_name", statement.tableName)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun touchTablePrtitionTest() {
        var sql = "alter table test.table_name TOUCH partition(ds=20210812, type='login')"

        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        Assert.assertEquals(StatementType.ALTER_TABLE_TOUCH, statementData.type)
        if (statement is TouchTable) {
            Assert.assertEquals("table_name", statement.tableName)
            Assert.assertEquals(2, statement.partitionSpecs.size)
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
    fun addColumnsTest() {
        val sql = "alter table test.sale_detail add columns (col_name1 string comment 'col_name1', col_name2 string comment 'col_name2')"

        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is DcTable) {
            Assert.assertEquals(StatementType.ALTER_TABLE_ADD_COLS, statementData.type)
            val name = statement.tableName
            Assert.assertEquals("sale_detail", name)
            Assert.assertEquals(2, statement.columns?.size)
        } else {
            Assert.fail()
        }

        val sql1 = SparkSQLHelper.replaceSql(sql,
                mapOf("test.sale_detail" to "iceberg_spark.test.sale_detail"))
        Assert.assertEquals("alter table iceberg_spark.test.sale_detail add columns " +
                "(col_name1 string comment 'col_name1', col_name2 string comment 'col_name2')",
                sql1);
    }

    @Test
    fun addColumnTest() {
        val sql = "ALTER TABLE db.sample ADD COLUMN age int FIRST"

        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is DcTable) {
            Assert.assertEquals(StatementType.ALTER_TABLE_ADD_COL, statementData.type)
            val name = statement.tableName
            Assert.assertEquals("sample", name)
            Assert.assertEquals(1, statement.columns?.size)
        } else {
            Assert.fail()
        }

        val sql1 = SparkSQLHelper.replaceSql(sql,
                mapOf("db.sample" to "iceberg_spark.db.sample"))
        Assert.assertEquals("ALTER TABLE iceberg_spark.db.sample ADD COLUMN age int FIRST", sql1);
    }

    @Test
    fun renameColumnTest() {
        val sql = "ALTER TABLE db.sample RENAME COLUMN data TO payload"

        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is DcAlterColumn) {
            Assert.assertEquals(StatementType.ALTER_TABLE_RENAME_COL, statementData.type)
            val name = statement.tableName
            Assert.assertEquals("sample", name)
            Assert.assertEquals("payload", statement.newName)
        } else {
            Assert.fail()
        }

        val sql1 = SparkSQLHelper.replaceSql(sql,
                mapOf("db.sample" to "iceberg_spark.db.sample"))
        Assert.assertEquals("ALTER TABLE iceberg_spark.db.sample RENAME COLUMN data TO payload", sql1);
    }

    @Test
    fun changeColumnTest() {
        var sql = "ALTER TABLE db.sample ALTER COLUMN location.lat TYPE double"
        var statementData = SparkSQLHelper.getStatementData(sql)
        var statement = statementData.statement
        if (statement is DcAlterColumn) {
            Assert.assertEquals(StatementType.ALTER_TABLE_CHANGE_COL, statementData.type)
            val name = statement.tableName
            Assert.assertEquals("sample", name)
        } else {
            Assert.fail()
        }

        sql = "ALTER TABLE db.sample ALTER COLUMN id DROP NOT NULL"
        statementData = SparkSQLHelper.getStatementData(sql)
        statement = statementData.statement
        if (statement is DcAlterColumn) {
            Assert.assertEquals(StatementType.ALTER_TABLE_CHANGE_COL, statementData.type)
            val name = statement.tableName
            Assert.assertEquals("sample", name)
        } else {
            Assert.fail()
        }

        sql = "ALTER TABLE db.sample ALTER COLUMN point.z AFTER y"
        statementData = SparkSQLHelper.getStatementData(sql)
        statement = statementData.statement
        if (statement is DcAlterColumn) {
            Assert.assertEquals(StatementType.ALTER_TABLE_CHANGE_COL, statementData.type)
            val name = statement.tableName
            Assert.assertEquals("sample", name)
        } else {
            Assert.fail()
        }

        sql = "ALTER TABLE db.sample ALTER COLUMN id COMMENT 'unique id'"
        statementData = SparkSQLHelper.getStatementData(sql)
        statement = statementData.statement
        if (statement is DcAlterColumn) {
            Assert.assertEquals(StatementType.ALTER_TABLE_CHANGE_COL, statementData.type)
            val name = statement.tableName
            Assert.assertEquals("sample", name)
            Assert.assertEquals("unique id", statement.comment)
        } else {
            Assert.fail()
        }

        val sql1 = SparkSQLHelper.replaceSql(sql,
                mapOf("db.sample" to "iceberg_spark.db.sample"))
        Assert.assertEquals("ALTER TABLE iceberg_spark.db.sample ALTER COLUMN id COMMENT 'unique id'", sql1);
    }

    @Test
    fun dropColumnTest() {
        val sql = "ALTER TABLE db.sample DROP COLUMN id"

        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is DcAlterColumn) {
            Assert.assertEquals(StatementType.ALTER_TABLE_DROP_COL, statementData.type)
            val name = statement.tableName
            Assert.assertEquals("sample", name)
        } else {
            Assert.fail()
        }

        val sql1 = SparkSQLHelper.replaceSql(sql,
                mapOf("db.sample" to "iceberg_spark.db.sample"))
        Assert.assertEquals("ALTER TABLE iceberg_spark.db.sample DROP COLUMN id", sql1);
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
    fun dropPartitionTest0() {
        val sql = "ALTER TABLE page_view DROP IF EXISTS PARTITION (dt='2008-08-08', country='us'), PARTITION (dt='2008-08-09', country='us')"

        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        Assert.assertEquals(StatementType.ALTER_TABLE_DROP_PARTS, statementData.type)
        if (statement is DropTablePartition) {
            val name = statement.tableName
            Assert.assertEquals("page_view", name)
            Assert.assertTrue(statement.ifExists)
            Assert.assertEquals(2, statement.partitionSpecs.size)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun dropPartitionTest1() {
        val sql = "ALTER TABLE page_view DROP PARTITION (dt='2008-08-08', country='us'), PARTITION (dt='2008-08-09', country='us')"

        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        Assert.assertEquals(StatementType.ALTER_TABLE_DROP_PARTS, statementData.type)
        if (statement is DropTablePartition) {
            val name = statement.tableName
            Assert.assertEquals("page_view", name)
            Assert.assertFalse(statement.ifExists)
            Assert.assertEquals(2, statement.partitionSpecs.size)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun addPartitionTest0() {
        val sql = "ALTER TABLE page_view ADD PARTITION (partCol = 'value1') "

        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        Assert.assertEquals(StatementType.ALTER_TABLE_ADD_PARTS, statementData.type)
        if (statement is AddTablePartition) {
            val name = statement.tableName
            Assert.assertFalse(statement.ifNotExists)
            Assert.assertEquals("page_view", name)
            Assert.assertEquals(1, statement.partitionSpecs.size)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun addPartitionTest1() {
        val sql = "ALTER TABLE page_view add IF NOT EXISTS PARTITION (dt='2008-08-08', country='us')"

        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        Assert.assertEquals(StatementType.ALTER_TABLE_ADD_PARTS, statementData.type)
        if (statement is AddTablePartition) {
            val name = statement.tableName
            Assert.assertEquals("page_view", name)
            Assert.assertTrue(statement.ifNotExists)
            Assert.assertEquals(1, statement.partitionSpecs.size)
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
                "using jar 'hdfs://tdhdfs/user/datacompute/platformtool/resources/132/latest/hivemall-spark.jar'"

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
    fun createFuncTest1() {
        val sql = "CREATE TEMPORARY FUNCTION IF NOT EXISTS stream_json_extract_value AS 'com.dataworker.spark.jobserver.driver.udf.GenericUDTFJsonExtractValue'"

        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is DcFunction) {
            val name = statement.name
            Assert.assertEquals("stream_json_extract_value", name)
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
                "     from tidb_datacompute.t_table t \n" +
                "     left join tidb_datacompute.sec_table_privs t1\n" +
                "            on t.table_name = t1.table_name\n" +
                "           and t1.status=1\n" +
                "           and t1.expire_date >= current_date()\n" +
                "     left join tidb_datacompute.dc_project_member t2\n" +
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
    fun queryTest7() {
        val sql = "select true is false"

        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is TableData) {
            Assert.assertEquals(StatementType.SELECT, statementData.type)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun queryTest8() {
        val sql = "select 'test' as name"

        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is TableData) {
            Assert.assertEquals(StatementType.SELECT, statementData.type)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun insertIntoTest0() {
        val sql = "insert into TABLE users PARTITION(ds='20170220') values('libinsong', 12, 'test'), ('libinsong', 13, 'test')"
        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is TableData) {
            Assert.assertEquals(StatementType.INSERT_VALUES, statementData.type)
            Assert.assertEquals(InsertMode.INTO, statement.insertMode)
            Assert.assertEquals("users", statement.outpuTables.get(0).tableName)
            Assert.assertEquals(2, statementData.values?.size)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun insertIntoTest1() {
        val sql = "insert into bigdata.delta_lsw_test values('lsw'),('lsw1')"
        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is TableData) {
            Assert.assertEquals(StatementType.INSERT_VALUES, statementData.type)
            Assert.assertEquals(InsertMode.INTO, statement.insertMode)
            Assert.assertEquals("delta_lsw_test", statement.outpuTables.get(0).tableName)
            Assert.assertEquals(2, statementData.values?.size)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun insertTableCustomColumn() {
        val sql = "INSERT INTO test_demo_test (name) VALUES('lisi')"
        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is TableData) {
            Assert.assertEquals(StatementType.INSERT_VALUES, statementData.type)
            Assert.assertEquals(InsertMode.INTO, statement.insertMode)
            Assert.assertEquals("test_demo_test", statement.outpuTables.get(0).tableName)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun insertOverwriteTest0() {
        val sql = "insert OVERWRITE TABLE users PARTITION(ds='20170220') values('libinsong')"
        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is TableData) {
            Assert.assertEquals(StatementType.INSERT_VALUES, statementData.type)
            Assert.assertEquals(InsertMode.OVERWRITE, statement.insertMode)
            Assert.assertEquals(1, statement.partitions?.size)
            Assert.assertEquals("users", statement.outpuTables.get(0).tableName)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun insertOverwriteTest1() {
        val sql = "insert OVERWRITE TABLE users PARTITION(ds) values('libinsong', '20170220')"
        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is TableData) {
            Assert.assertEquals(StatementType.INSERT_VALUES, statementData.type)
            Assert.assertEquals(InsertMode.OVERWRITE, statement.insertMode)
            Assert.assertEquals(1, statement.partitions?.size)
            Assert.assertEquals("users", statement.outpuTables.get(0).tableName)
        } else {
            Assert.fail()
        }

        val sql1 = SparkSQLHelper.replaceSql(sql,
                mapOf("users" to "iceberg_users"))
        Assert.assertEquals("insert OVERWRITE TABLE iceberg_users PARTITION(ds) values('libinsong', '20170220')", sql1);
    }

    @Test
    fun insertOverwriteQueryTest2() {
        val sql = "insert INTO users PARTITION(ds='20170220') select * from account a join address b on a.addr_id=b.id"
        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is TableData) {
            Assert.assertEquals(StatementType.INSERT_SELECT, statementData.type)
            Assert.assertEquals("users", statement.outpuTables.get(0).tableName)
            Assert.assertEquals(InsertMode.INTO, statement.insertMode)
            Assert.assertEquals(1, statement.partitions?.size)
            Assert.assertEquals(statementData.querySql, "select * from account a join address b on a.addr_id=b.id")

            Assert.assertEquals(2, statement.inputTables.size)
            Assert.assertEquals("account", statement.inputTables.get(0).tableName)
            Assert.assertEquals("address", statement.inputTables.get(1).tableName)
        } else {
            Assert.fail()
        }

        val sql1 = SparkSQLHelper.replaceSql(sql,
                mapOf("users" to "iceberg_spark.bigdata.users", "account" to "iceberg_spark.bigdata.account"))
        Assert.assertEquals("insert INTO iceberg_spark.bigdata.users PARTITION(ds='20170220') " +
                "select * from iceberg_spark.bigdata.account a join address b on a.addr_id=b.id",
                sql1);
    }

    @Test
    fun insertOverwriteQueryTest3() {
        val sql = "insert INTO users select * from account a join address b on a.addr_id=b.id"
        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is TableData) {
            Assert.assertEquals(StatementType.INSERT_SELECT, statementData.type)
            Assert.assertEquals("users", statement.outpuTables.get(0).tableName)
            Assert.assertEquals(InsertMode.INTO, statement.insertMode)
            Assert.assertEquals(0, statement.partitions?.size)
            Assert.assertEquals(statementData.querySql, "select * from account a join address b on a.addr_id=b.id")

            Assert.assertEquals(2, statement.inputTables.size)
            Assert.assertEquals("account", statement.inputTables.get(0).tableName)
            Assert.assertEquals("address", statement.inputTables.get(1).tableName)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun insertOverwriteQueryTest4() {
        val sql = "insert OVERWRITE TABLE users PARTITION(ds='20170220') select * from account1 union all " +
                "select * from account2"
        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is TableData) {
            Assert.assertEquals(StatementType.INSERT_SELECT, statementData.type)
            Assert.assertEquals("users", statement.outpuTables.get(0).tableName)
            Assert.assertEquals(InsertMode.OVERWRITE, statement.insertMode)
            Assert.assertEquals(1, statement.partitions?.size)
            Assert.assertEquals(statementData.querySql, "select * from account1 union all select * from account2");

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
    fun showViewsTest() {
        var sql = "show views"

        val statementData = SparkSQLHelper.getStatementData(sql)
        Assert.assertEquals(StatementType.SHOW_VIEWS, statementData.type)
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

    @Test
    fun compressTable() {
        var sql = "compress table platformtool.table_partition_dt partition(ds='20181127') options(type='gzip')"

        val statementData = SparkSQLHelper.getStatementData(sql)
        Assert.assertEquals(StatementType.COMPRESS_TABLE, statementData.type)
    }

    @Test
    fun compressFile() {
        var sql = "compress file '/user/datacompute/users/xiuxiu.zheng/parquet/instance' "

        val statementData = SparkSQLHelper.getStatementData(sql)
        Assert.assertEquals(StatementType.COMPRESS_FILE, statementData.type)
    }

    @Test
    fun mergeTest() {
        var sql = "merge table test OPTIONS (mergefile=2)"

        SparkSQLHelper.getStatementData(sql)
    }

    @Test
    fun substrFile() {
        var sql = "SELECT substring('Spark SQL' from 5)"

        val statementData = SparkSQLHelper.getStatementData(sql)
        Assert.assertEquals(StatementType.SELECT, statementData.type)
    }

    @Test
    fun druidSql() {
        var sql = "SELECT * from druid.`select * from test`"

        val statementData = SparkSQLHelper.getStatementData(sql)
        Assert.assertEquals(StatementType.SELECT, statementData.type)
        val statement = statementData.statement
        if (statement is TableData) {
            Assert.assertEquals("druid", statement.inputTables.get(0).databaseName)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun druidSql1() {
        var sql = "SELECT * from tdl_xdsd_sd"

        val statementData = SparkSQLHelper.getStatementData(sql)
        Assert.assertEquals(StatementType.SELECT, statementData.type)
        val statement = statementData.statement
        if (statement is TableData) {
            Assert.assertNull(statement.inputTables.get(0).databaseName)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun deleteTest() {
        val sql = "delete from aa.user where name='xc'"

        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is DeleteTable) {
            Assert.assertEquals(StatementType.DELETE, statementData.type)
            Assert.assertEquals("user", statement.tableName)
            Assert.assertEquals("name='xc'", statement.where)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun updateTest0() {
        val sql = "update user set name='xxx', age=20 where id=2"

        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is UpdateTable) {
            Assert.assertEquals(StatementType.UPDATE, statementData.type)
            Assert.assertEquals("user", statement.tableName)
            Assert.assertEquals("id=2", statement.where)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun updateTest1() {
        val sql = "update user set name='xxx'"

        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is UpdateTable) {
            Assert.assertEquals(StatementType.UPDATE, statementData.type)
            Assert.assertEquals("user", statement.tableName)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun vaccumTest() {
        val sql = "VACUUM user RETAIN 10 HOURS"

        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is VacuumTable) {
            Assert.assertEquals(StatementType.VACUUM, statementData.type)
            Assert.assertEquals("user", statement.tableName)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun deltaDetailTest() {
        val sql = "DESC DETAIL user"

        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is DetailTable) {
            Assert.assertEquals(StatementType.DESC_DETAIL, statementData.type)
            Assert.assertEquals("user", statement.tableName)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun deltaHistoryTest0() {
        val sql = "DESC HISTORY user limit 20"

        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is HistoryTable) {
            Assert.assertEquals(StatementType.DESC_HISTORY, statementData.type)
            Assert.assertEquals("user", statement.tableName)
            Assert.assertEquals(20, statement.limit)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun deltaHistoryTest1() {
        val sql = "DESC HISTORY user"

        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is HistoryTable) {
            Assert.assertEquals(StatementType.DESC_HISTORY, statementData.type)
            Assert.assertEquals("user", statement.tableName)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun deltaMergeTest() {
        val sql = """
            MERGE INTO logs
            USING updates
            ON logs.uniqueId = updates.uniqueId
            WHEN NOT MATCHED
              THEN INSERT *
        """.trimIndent()

        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is DeltaMerge) {
            Assert.assertEquals(StatementType.MERGE_INTO_TABLE, statementData.type)
            Assert.assertEquals("logs", statement.targetTable.tableName)
            Assert.assertEquals(1, statement.sourceTables.size)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun deltaMergeTest0() {
        val sql = """
            MERGE INTO logs
            USING updates
            ON logs.uniqueId = updates.uniqueId AND logs.date > current_date() - INTERVAL 7 DAYS
            WHEN NOT MATCHED AND updates.date > current_date() - INTERVAL 7 DAYS
              THEN INSERT *
        """.trimIndent()

        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is DeltaMerge) {
            Assert.assertEquals(StatementType.MERGE_INTO_TABLE, statementData.type)
            Assert.assertEquals("logs", statement.targetTable.tableName)
            Assert.assertEquals(1, statement.sourceTables.size)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun deltaMergeTest1() {
        val sql = """
            MERGE INTO customers
            USING (
              SELECT updates.customerId as mergeKey, updates.*
              FROM updates
              UNION ALL
              SELECT NULL as mergeKey, updates.*
              FROM updates JOIN customers
              ON updates.customerid = customers.customerid 
              WHERE customers.current = true AND updates.address <> customers.address
            ) staged_updates
            ON customers.customerId = mergeKey
            WHEN MATCHED AND customers.current = true AND customers.address <> staged_updates.address THEN  
              UPDATE SET current = false, endDate = staged_updates.effectiveDate
            WHEN NOT MATCHED THEN 
              INSERT(customerid, address, current, effectivedate, enddate) 
              VALUES(staged_updates.customerId, staged_updates.address, true, staged_updates.effectiveDate, null)
        """.trimIndent()

        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is DeltaMerge) {
            Assert.assertEquals(StatementType.MERGE_INTO_TABLE, statementData.type)
            Assert.assertEquals("customers", statement.targetTable.tableName)
            Assert.assertEquals(2, statement.sourceTables.size)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun deltaMergeTest2() {
        val sql = """
            MERGE INTO target t
            USING (
              SELECT key, latest.newValue as newValue, latest.deleted as deleted FROM (    
                SELECT key, max(struct(time, newValue, deleted)) as latest FROM changes GROUP BY key
              )
            ) s
            ON s.key = t.key
            WHEN MATCHED AND s.deleted = true THEN DELETE
            WHEN MATCHED THEN UPDATE SET key = s.key, value = s.newValue
            WHEN NOT MATCHED AND s.deleted = false THEN INSERT (key, value) VALUES (key, newValue)
        """.trimIndent()

        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is DeltaMerge) {
            Assert.assertEquals(StatementType.MERGE_INTO_TABLE, statementData.type)
            Assert.assertEquals("target", statement.targetTable.tableName)
            Assert.assertEquals(1, statement.sourceTables.size)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun deltaMergeTest3() {
        val sql = """
            MERGE INTO
               bigdata.merge_test a1
            USING
               bigdata.merge_test1 a2
            ON
               a1.name = a2.name
            WHEN MATCHED THEN UPDATE SET a1.age = a2.age
        """.trimIndent()

        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is DeltaMerge) {
            Assert.assertEquals(StatementType.MERGE_INTO_TABLE, statementData.type)
            Assert.assertEquals("merge_test", statement.targetTable.tableName)
            Assert.assertEquals(1, statement.sourceTables.size)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun deltaMergeConvert() {
        val sql = """
            CONVERT TO DELTA bigdata.test
            PARTITIONED BY (ds string, event string)   
        """.trimIndent()

        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is DeltaConvert) {
            Assert.assertEquals(StatementType.DELTA_CONVERT, statementData.type)
            Assert.assertEquals("test", statement.tableName)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun cetSelectTest0() {
        val sql = """
            with q1 as ( select key from q2 where key = '5'),
            q2 as ( select key from test where key = '5')
            select * from (select key from q1) a
        """.trimIndent()

        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is TableData) {
            Assert.assertEquals("test", statement.inputTables.get(0).tableName)
            Assert.assertEquals(StatementType.SELECT, statementData.type)
            Assert.assertEquals(2, statement.cteTempTables?.size)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun cetInsertTest0() {
        val sql = """
            with
            a as (select * from src where key is not null),
            b as (select  * from src2 where value>0),
            c as (select * from src3 where value>0),
            d as (select a.key,b.value from a join b on a.key=b.key),
            e as (select a.key,c.value from a left outer join c on a.key=c.key and c.key is not null)
            insert overwrite table srcp partition (p='abc')
            select * from d union all select * from e
        """.trimIndent()

        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is TableData) {
            Assert.assertEquals(3, statement.inputTables.size)
            Assert.assertEquals(StatementType.INSERT_SELECT, statementData.type)
            Assert.assertEquals(5, statement.cteTempTables?.size)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun exportTest0() {
        val sql = """
           with 
                a as (select * from test),
                druid_result as (select * from a)
           export table druid_result TO 'druid_result.csv'
        """.trimIndent()

        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is ExportData) {
            Assert.assertEquals(1, statement.inputTables.size)
            Assert.assertEquals(StatementType.EXPORT_TABLE, statementData.type)
            Assert.assertEquals("druid_result", statement.tableName)
            Assert.assertEquals("a", statement.cteTempTables?.get(0))
        } else {
            Assert.fail()
        }
    }

    @Test
    fun createExternalTableTest1() {
        val sql = """CREATE EXTERNAL TABLE s3Db.test_zc_s3(
                        name String COMMENT 'name',
                        cnt INT COMMENT 'cnt'
                    ) COMMENT '原始数据表'
                    LOCATION 's3a://hive/test/'
            """

        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is DcTable) {
            val name = statement.databaseName
            Assert.assertEquals(statement.locationPath,"LOCATION's3a://hive/test/'");
            Assert.assertEquals("s3Db", name)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun createTableTbl() {
        val sql = """create table bigdata.test_orc9_dt (
                        name string comment '',
                        name2 String comment ''
                    )
                    TBLPROPERTIES ('compression'='ZSTD', 'fileFormat'='orc', 'encryption'='0', "orc.encrypt"="hz_admin_key:name2", "orc.mask"='nullify:name')
                    STORED AS orc
                    comment 'orc测试'
                    lifecycle 7
            """

        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is DcTable) {
            val prop = statement.properties
        } else {
            Assert.fail()
        }
    }

    @Test
    fun countCondTest() {
        var sql = "select count(type='mac' or null) From test_table where a=2"

        val statementData = SparkSQLHelper.getStatementData(sql)
        Assert.assertEquals(StatementType.SELECT, statementData.type)
        val statement = statementData.statement
        if (statement is TableData) {
            Assert.assertEquals("test_table", statement.inputTables.get(0).tableName)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun queryLakeTableMetaTest0() {
        val sql = "select * from dc.user.history limit 101"
        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is TableData) {
            Assert.assertEquals(StatementType.SELECT, statementData.type)
            Assert.assertEquals(1, statement.inputTables.size)
            Assert.assertEquals("user", statement.inputTables.get(0).tableName)
            Assert.assertEquals("history", statement.inputTables.get(0).metaAction)
            Assert.assertEquals(101, statement.limit)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun queryLakeTableMetaTest1() {
        val sql = """
            select h.made_current_at, s.operation, h.snapshot_id, h.is_current_ancestor, s.summary['spark.app.id']
            from db.table.history h
            join db.table.snapshots s on h.snapshot_id = s.snapshot_id
            order by made_current_at
        """.trimIndent()

        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is TableData) {
            Assert.assertEquals(StatementType.SELECT, statementData.type)
            Assert.assertEquals(2, statement.inputTables.size)
            Assert.assertEquals("table", statement.inputTables.get(0).tableName)
            Assert.assertEquals("history", statement.inputTables.get(0).metaAction)

            Assert.assertEquals("table", statement.inputTables.get(1).tableName)
            Assert.assertEquals("snapshots", statement.inputTables.get(1).metaAction)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun dataXTest() {
        val sql = "datax reader('sftp') options(host='x.x.x.x') writer('hive') options(table='demo')"
        val statementData = SparkSQLHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is DataxExpr) {
            Assert.assertEquals(StatementType.DATAX, statementData.type)
            Assert.assertEquals("sftp", statement.srcType)
            Assert.assertEquals("x.x.x.x", statement.srcOptions.get("host"))

            Assert.assertEquals("hive", statement.distType)
            Assert.assertEquals("demo", statement.distOptions.get("table"))
        } else {
            Assert.fail()
        }
    }

    @Test
    fun notSupportSql() {
        val sql = "insert overwrite directory '/user/ahao' ROW FORMAT DELIMITED FIELDS TERMINATED BY '\\t' select * from nlp_dev.all_category_sample"
        try {
            SparkSQLHelper.getStatementData(sql)
            Assert.fail()
        } catch (e: SQLParserException) {
            Assert.assertTrue(true)
        }
    }
}
