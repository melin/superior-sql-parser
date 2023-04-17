package io.github.melin.superior.parser.spark

import io.github.melin.superior.common.*
import io.github.melin.superior.common.relational.*
import io.github.melin.superior.common.relational.create.*
import io.github.melin.superior.common.relational.namespace.Namespace
import io.github.melin.superior.common.relational.namespace.UseNamespace
import io.github.melin.superior.common.relational.create.CreateView
import io.github.melin.superior.common.relational.dml.*
import io.github.melin.superior.common.relational.drop.*
import io.github.melin.superior.common.relational.table.*
import io.github.melin.superior.parser.spark.relational.*
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

        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is CreateNamespace) {
            Assert.assertEquals("bigdata", statement.namespaceId.schemaName)
            Assert.assertEquals(Namespace.DATABASE, statement.namespace)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun createDatabaseTest2() {
        val sql = "CREATE DATABASE IF NOT EXISTS bigdata location 's3a://hive/s3/'"

        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is CreateNamespace) {
            Assert.assertEquals("bigdata", statement.namespaceId.schemaName)
            Assert.assertEquals(Namespace.DATABASE, statement.namespace)
            val location = statement.location;
            Assert.assertEquals("s3a://hive/s3/",location)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun dropDatabaseTest() {
        val sql = "drop DATABASE IF EXISTS bigdata"

        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is DropNamespace) {
            Assert.assertEquals("bigdata", statement.namespaceId.schemaName)
            Assert.assertEquals(Namespace.DATABASE, statement.namespace)
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

        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is CreateTable) {
            val schemaName = statement.tableId.schemaName
            Assert.assertEquals("test", schemaName)
            Assert.assertNull(statement.location)
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

        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is CreateTable) {
            val schemaName = statement.tableId.schemaName
            Assert.assertEquals("platformtool", schemaName)
            Assert.assertEquals(7, statement.lifeCycle)
            Assert.assertEquals("姓名", statement.columnRels?.get(0)?.comment)
            Assert.assertEquals("hive", statement.createTableType)
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

        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is CreateTable) {
            val tableName = statement.tableId.tableName
            Assert.assertEquals("dc_cluster_compute", tableName)
            Assert.assertEquals(100, statement.lifeCycle)
            Assert.assertEquals("hive", statement.createTableType)
            Assert.assertEquals("数据中心", statement.columnRels?.get(1)?.comment)
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

        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is CreateTable) {
            val tableName = statement.tableId.tableName
            Assert.assertEquals("iceberg_test_dt", tableName)
            Assert.assertEquals(100, statement.lifeCycle)
            Assert.assertEquals("hive", statement.createTableType)
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

        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is CreateTable) {
            val tableName = statement.tableId.tableName
            Assert.assertEquals("export_test_dt", tableName)
            Assert.assertEquals(100, statement.lifeCycle)
            Assert.assertEquals("orc", statement.fileFormat)
            Assert.assertEquals("spark", statement.createTableType)
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

        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is CreateTable) {
            val tableName = statement.tableId.tableName
            Assert.assertEquals("export_test_dt", tableName)
            Assert.assertEquals(100, statement.lifeCycle)
            Assert.assertEquals("orc", statement.fileFormat)
            Assert.assertEquals("spark", statement.createTableType)
            Assert.assertEquals(2, statement.partitionColumnNames?.size)
            Assert.assertEquals("the_date", statement.partitionColumnNames?.get(0))
            Assert.assertEquals("the_nums", statement.partitionColumnNames?.get(1))
        } else {
            Assert.fail()
        }
    }

    @Test
    fun createTableTest7() {
        val sql = """
            CREATE TABLE test_demo_test (name string, age int)
            using orc
            LIFECYCLE 10;
            """

        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is CreateTable) {
            val tableName = statement.tableId.tableName
            Assert.assertEquals("test_demo_test", tableName)
            Assert.assertEquals(10, statement.lifeCycle)
            Assert.assertEquals("orc", statement.fileFormat)
            Assert.assertEquals("spark", statement.createTableType)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun createTableTest9() {
        val sql = """
            create table dzlog_test_dt (
                message string,
                collect_time timestamp
            ) 
            using parquet
            partitioned by (ds string) 
            lifeCycle 14;
            """

        try {
            SparkSqlHelper.getStatementData(sql)
            Assert.fail()
        } catch (e: Exception) {
            Assert.assertTrue(true)
        }
    }

    @Test
    fun createHudiTableTest5() {
        val sql = """
            create table test_hudi_table ( id int, name string, price double, ts long, dt string) 
            using hudi
            tblproperties (
              type = 'MOR',
              primaryKey = 'id, name',
              preCombineField = 'ts'
             )
            partitioned by (dt)
            lifeCycle 300
            """

        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        Assert.assertEquals(StatementType.CREATE_TABLE, statementData.type)
        if (statement is CreateTable) {
            val tableName = statement.tableId.tableName
            Assert.assertEquals("test_hudi_table", tableName)
            Assert.assertEquals("id, name", statement.properties?.get("primaryKey"))
            Assert.assertEquals("MOR", statement.properties?.get("type"))

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
            create table test_hudi_table ( id int, name string, price double, ts long, dt string) 
            using hudi
            tblproperties (
              type = 'cow',
              primaryKey = 'id, name',
              preCombineField = 'ts'
             )
            partitioned by (dt)
            lifeCycle 300
            """

        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        Assert.assertEquals(StatementType.CREATE_TABLE, statementData.type)
        if (statement is CreateTable) {
            val name = statement.tableId.tableName
            Assert.assertEquals("test_hudi_table", name)
            Assert.assertEquals("id, name", statement.properties?.get("primaryKey"))
            Assert.assertEquals("cow", statement.properties?.get("type"))

            Assert.assertEquals(300, statement.lifeCycle)
            Assert.assertEquals("hudi", statement.fileFormat)
            Assert.assertEquals(1, statement.partitionColumnNames?.size)
            Assert.assertEquals("dt", statement.partitionColumnNames?.get(0))
        } else {
            Assert.fail()
        }
    }

    @Test
    fun createIcebergTable() {
        val sql = """
            CREATE TABLE IF NOT EXISTS iceberg_melin.test_table_02 (
                id bigint, data string, ds timestamp) 
            USING iceberg PARTITIONED BY (days(ts))
            lifeCycle 300
        """.trimIndent()

        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        Assert.assertEquals(StatementType.CREATE_TABLE, statementData.type)
        if (statement is CreateTable) {
            val tableName = statement.tableId.tableName
            Assert.assertEquals("test_table_02", tableName)

            Assert.assertEquals(300, statement.lifeCycle)
            Assert.assertEquals("iceberg", statement.fileFormat)
            Assert.assertEquals(1, statement.partitionColumnNames?.size)
            Assert.assertEquals("days(ts)", statement.partitionColumnNames?.get(0))
        } else {
            Assert.fail()
        }
    }

    @Test
    fun replaceHudiTableTest() {
        val sql = """
            create or replace table test_hudi_table ( id int, name string, price double, ts long, dt string) 
            using hudi
            tblproperties (
              type = 'mor',
              primaryKey = 'id, name',
              preCombineField = 'ts'
             )
            partitioned by (dt)
            lifeCycle 300
            """

        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        Assert.assertEquals(StatementType.CREATE_TABLE, statementData.type)
        if (statement is CreateTable) {
            val tableName = statement.tableId.tableName
            Assert.assertTrue(statement.replace)
            Assert.assertEquals("test_hudi_table", tableName)
            Assert.assertEquals("id, name", statement.properties?.get("primaryKey"))
            Assert.assertEquals("mor", statement.properties?.get("type"))

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
        val sql = "desc table users"
        val statementData = SparkSqlHelper.getStatementData(sql)
        Assert.assertEquals(StatementType.DESC, statementData.type)
    }

    @Test
    fun createTableLikeTest() {
        val sql = "create table IF NOT EXISTS test.sale_detail_like  like demo.sale_detail"

        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is CreateTableLike) {
            Assert.assertEquals(TableId("demo", "sale_detail"), statement.oldTableId)
            Assert.assertEquals(TableId("test", "sale_detail_like"), statement.tableId)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun createTableSelectTest() {
        val sql = "create table \nIF NOT EXISTS tdl_users_1 STORED AS ORC as select *, bigdata.TEST(name) from bigdata.users a left outer join address b on a.addr_id = b.id"

        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is CreateTableAsSelect) {
            val tableName = statement.tableId.tableName
            Assert.assertEquals(StatementType.CREATE_TABLE_AS_SELECT, statementData.type)
            Assert.assertEquals(statement.fileFormat, "ORC")
            Assert.assertEquals("tdl_users_1", tableName)
            Assert.assertEquals("select *, bigdata.TEST(name) from bigdata.users a left outer join address b on a.addr_id = b.id", statement.querySql)
            Assert.assertEquals(2, statement.inputTables.size)
            Assert.assertEquals("users", statement.inputTables.get(0).tableName)
            Assert.assertEquals("address", statement.inputTables.get(1).tableName)

            Assert.assertEquals("bigdata.test", statement.functionNames.first())
        } else {
            Assert.fail()
        }
    }

    @Test
    fun createTableSelectTest1() {
        val sql = """
               CREATE TABLE t
               USING ICEBERG
               PARTITIONED BY (b)
               AS SELECT 1 as a, "a" as b
               """

        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is CreateTableAsSelect) {
            val tableName = statement.tableId.tableName
            Assert.assertEquals(StatementType.CREATE_TABLE_AS_SELECT, statementData.type)
            Assert.assertEquals("ICEBERG", statement.fileFormat)
            Assert.assertEquals("t", tableName)
            Assert.assertEquals("SELECT 1 as a, \"a\" as b", statement.querySql)
            Assert.assertEquals("b", statement.partitionColumnNames?.get(0))
        } else {
            Assert.fail()
        }
    }

    @Test
    fun createTableSelectTest2() {
        val sql = "create table \nIF NOT EXISTS tdl_users_1 using parquet as (select * from users a left outer join address b on a.addr_id = b.id)"

        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is CreateTableAsSelect) {
            val tableName = statement.tableId.tableName
            Assert.assertEquals(StatementType.CREATE_TABLE_AS_SELECT, statementData.type)
            Assert.assertEquals("tdl_users_1", tableName)
            Assert.assertEquals("select * from users a left outer join address b on a.addr_id = b.id", statement.querySql)
            Assert.assertEquals(2, statement.inputTables.size)
            Assert.assertEquals("parquet", statement.fileFormat)
            Assert.assertEquals("address", statement.inputTables.get(1).tableName)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun createTableSelectTest3() {
        val sql = "create table \nIF NOT EXISTS tdl_users_1 using parquet as (select * from users a left outer join address b on a.addr_id = b.id" +
                " left outer join `bigdata`.users c on c.userid_id = a.id)"

        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is CreateTableAsSelect) {
            val tableName = statement.tableId.tableName
            Assert.assertEquals(StatementType.CREATE_TABLE_AS_SELECT, statementData.type)
            Assert.assertEquals("tdl_users_1", tableName)
            //Assert.assertEquals("select * from users a left outer join address b on a.addr_id = b.id", statement.querySql)
            Assert.assertEquals(3, statement.inputTables.size)
            Assert.assertEquals("address", statement.inputTables.get(1).tableName)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun createTableSelectTest4() {
        val sql = "create table huaixin_rp.bigdata.test_iceberg_1 using iceberg PARTITIONED BY(ds) as " +
                "SELECT 'xxx' as name, 23 as price, '20211203' as ds"

        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is CreateTableAsSelect) {
            val tableName = statement.tableId.tableName
            Assert.assertEquals(StatementType.CREATE_TABLE_AS_SELECT, statementData.type)
            Assert.assertEquals("test_iceberg_1", tableName)
            Assert.assertEquals("SELECT 'xxx' as name, 23 as price, '20211203' as ds", statement.querySql)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun replaceTableSelectTest() {
        val sql = "create or replace table tdl_users_1 STORED AS ORC as select * from bigdata.users a left outer join address b on a.addr_id = b.id"

        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is CreateTableAsSelect) {
            val tableName = statement.tableId.tableName
            Assert.assertTrue(statement.replace)
            Assert.assertEquals(StatementType.CREATE_TABLE_AS_SELECT, statementData.type)
            Assert.assertEquals(statement.fileFormat, "ORC")
            Assert.assertEquals("tdl_users_1", tableName)
            Assert.assertEquals("select * from bigdata.users a left outer join address b on a.addr_id = b.id", statement.querySql)
            Assert.assertEquals(2, statement.inputTables.size)
            Assert.assertEquals("users", statement.inputTables.get(0).tableName)
            Assert.assertEquals("address", statement.inputTables.get(1).tableName)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun dropTableTest() {
        val sql = "drop table if exists sale_detail_drop2"

        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        Assert.assertEquals(StatementType.DROP_TABLE, statementData.type)
        if (statement is DropTable) {
            val name = statement.tableId.tableName
            Assert.assertEquals("sale_detail_drop2", name)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun dropViewTest() {
        val sql = "drop view if exists sale_detail_drop2"

        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        Assert.assertEquals(StatementType.DROP_VIEW, statementData.type)
        if (statement is DropView) {
            Assert.assertEquals("sale_detail_drop2", statement.tableId.tableName)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun truncateTableTest() {
        val sql = "TRUNCATE TABLE test.user partition(ds='20170403')"

        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is TruncateTable) {
            val name = statement.tableId.tableName
            Assert.assertEquals("user", name)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun msckTableTest() {
        val sql = "MSCK REPAIR TABLE test.user"

        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is RepairTable) {
            val name = statement.tableId.tableName
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

        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is CreateView) {
            Assert.assertEquals(StatementType.CREATE_VIEW, statementData.type)
            Assert.assertEquals("view_users", statement.tableId.tableName)
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
            select *, bigdata.test(name) from account
            """

        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is CreateView) {
            Assert.assertEquals(StatementType.CREATE_VIEW, statementData.type)
            Assert.assertEquals("view_users", statement.tableId.tableName)
            Assert.assertEquals("view test", statement.comment)
            Assert.assertEquals(1, statement.functionNames.size)
            Assert.assertEquals("bigdata.test", statement.functionNames.first())

            Assert.assertEquals("select *, bigdata.test(name) from account", statement.querySql)
            Assert.assertEquals("account", statement.inputTables.get(0).tableName)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun createTemporaryViewTest0() {
        val sql = """
            CREATE TEMPORARY VIEW jdbcTable
            USING org.apache.spark.sql.jdbc
            OPTIONS (
              url "jdbc:postgresql:dbserver",
              dbtable "schema.tablename",
              user 'username',
              password 'password'
            )
            """

        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is CreateView) {
            Assert.assertEquals(StatementType.CREATE_TEMPORARY_VIEW, statementData.type)
            Assert.assertEquals("jdbcTable", statement.tableId.tableName)
            Assert.assertEquals("org.apache.spark.sql.jdbc", statement.tableProvider)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun alterViewTest0() {
        val sql = "ALTER VIEW v1 AS SELECT x, UPPER(s) s FROM t2"

        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is AlterTable) {
            Assert.assertEquals("v1", statement.tableId.tableName)
            val action = statement.firstAction() as AlterViewAction
            Assert.assertEquals(AlterType.ALTER_VIEW_QUERY, statement.alterType)
            Assert.assertEquals("SELECT x, UPPER(s) s FROM t2", action.querySql)
            Assert.assertEquals("t2", action.inputTables.get(0).tableName)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun renameTableTest() {
        val sql = "alter table test.table_name rename to new_table_name"

        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is AlterTable) {
            val action = statement.firstAction() as AlterTableAction
            Assert.assertEquals(AlterType.RENAME_TABLE, statement.alterType)
            Assert.assertEquals("new_table_name", action.newTableName)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun touchTableTest() {
        val sql = "alter table test.table_name TOUCH"

        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        Assert.assertEquals(StatementType.ALTER_TABLE, statementData.type)
        if (statement is AlterTable) {
            Assert.assertEquals("table_name", statement.tableId.tableName)
            Assert.assertEquals(AlterType.TOUCH_TABLE, statement.alterType)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun touchTablePrtitionTest() {
        val sql = "alter table test.table_name TOUCH partition(ds=20210812, type='login')"

        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        Assert.assertEquals(StatementType.ALTER_TABLE, statementData.type)
        if (statement is AlterTable) {
            Assert.assertEquals("table_name", statement.tableId.tableName)
            Assert.assertEquals(AlterType.TOUCH_TABLE, statement.alterType)
            val action = statement.firstAction() as AlterTableAction
            Assert.assertEquals(2, action.partitionVals?.size)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun alterTablePropertiesTest() {
        val sql = "ALTER TABLE test.sale_detail SET TBLPROPERTIES ('comment' = 'new coments for statement sale_detail', 'lifeCycle' = '7')"

        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is AlterTable) {
            Assert.assertEquals(StatementType.ALTER_TABLE, statementData.type)
            Assert.assertEquals("sale_detail", statement.tableId.tableName)
            val action = statement.firstAction() as AlterTableAction
            Assert.assertEquals(2, action.properties?.size)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun addColumnsTest() {
        val sql = "alter table test.sale_detail add columns (col_name1 string comment 'col_name1', col_name2 string comment 'col_name2')"

        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is AlterTable) {
            Assert.assertEquals(StatementType.ALTER_TABLE, statementData.type)
            Assert.assertEquals("sale_detail", statement.tableId.tableName)
            val cols = statement.actions as List<AlterColumnAction>
            Assert.assertEquals(2, cols.size)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun addColumnTest() {
        val sql = "ALTER TABLE db.sample ADD COLUMN age int FIRST"

        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is AlterTable) {
            Assert.assertEquals(StatementType.ALTER_TABLE, statementData.type)
            Assert.assertEquals("sample", statement.tableId.tableName)
            val action = statement.firstAction() as AlterColumnAction
            Assert.assertEquals("first", action.position)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun renameColumnTest() {
        val sql = "ALTER TABLE db.sample RENAME COLUMN data TO payload"

        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is AlterTable) {
            Assert.assertEquals(StatementType.ALTER_TABLE, statementData.type)
            Assert.assertEquals("sample", statement.tableId.tableName)
            val action = statement.firstAction() as AlterColumnAction
            Assert.assertEquals("payload", action.newColumName)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun changeColumnTest() {
        var sql = "ALTER TABLE db.sample ALTER COLUMN location.lat TYPE double"
        var statementData = SparkSqlHelper.getStatementData(sql)
        var statement = statementData.statement
        if (statement is AlterTable) {
            Assert.assertEquals(StatementType.ALTER_TABLE, statementData.type)
            Assert.assertEquals("sample", statement.tableId.tableName)
            val action = statement.firstAction() as AlterColumnAction
            Assert.assertEquals("double", action.dataType)
        } else {
            Assert.fail()
        }

        sql = "ALTER TABLE db.sample ALTER COLUMN id DROP NOT NULL"
        statementData = SparkSqlHelper.getStatementData(sql)
        statement = statementData.statement
        if (statement is AlterTable) {
            Assert.assertEquals(StatementType.ALTER_TABLE, statementData.type)
            Assert.assertEquals("sample", statement.tableId.tableName)
            val action = statement.firstAction() as AlterColumnAction
            Assert.assertEquals("id", action.columName)
        } else {
            Assert.fail()
        }

        sql = "ALTER TABLE db.sample ALTER COLUMN point.z AFTER y"
        statementData = SparkSqlHelper.getStatementData(sql)
        statement = statementData.statement
        if (statement is AlterTable) {
            Assert.assertEquals(StatementType.ALTER_TABLE, statementData.type)
            Assert.assertEquals("sample", statement.tableId.tableName)

            val action = statement.firstAction() as AlterColumnAction
            Assert.assertEquals("after", action.position)
            Assert.assertEquals("y", action.afterCol)
        } else {
            Assert.fail()
        }

        sql = "ALTER TABLE db.sample ALTER COLUMN id COMMENT 'unique id'"
        statementData = SparkSqlHelper.getStatementData(sql)
        statement = statementData.statement
        if (statement is AlterTable) {
            Assert.assertEquals(StatementType.ALTER_TABLE, statementData.type)
            Assert.assertEquals("sample", statement.tableId.tableName)

            val action = statement.firstAction() as AlterColumnAction
            Assert.assertEquals("unique id", action.comment)
        } else {
            Assert.fail()
        }

        sql = "ALTER TABLE demo CHANGE COLUMN price Type float COMMENT '价格'"
        statementData = SparkSqlHelper.getStatementData(sql)
        statement = statementData.statement
        if (statement is AlterTable) {
            Assert.assertEquals(StatementType.ALTER_TABLE, statementData.type)
            Assert.assertEquals("demo", statement.tableId.tableName)

            val action = statement.firstAction() as AlterColumnAction
            Assert.assertEquals("float", action.dataType)
            Assert.assertEquals("价格", action.comment)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun changeColumnTest1() {
        val sql = "ALTER TABLE test_user11_dt ALTER COLUMN ds comment 'ddd'"
        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is AlterTable) {
            Assert.assertEquals(StatementType.ALTER_TABLE, statementData.type)
            Assert.assertEquals("test_user11_dt", statement.tableId.tableName)

            val action = statement.firstAction() as AlterColumnAction
            Assert.assertEquals("ds", action.columName)
            Assert.assertNull(action.newColumName)
            Assert.assertNull(action.dataType)
            Assert.assertEquals("ddd", action.comment)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun dropColumnTest() {
        val sql = "ALTER TABLE db.sample DROP COLUMN id"

        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is AlterTable) {
            Assert.assertEquals(StatementType.ALTER_TABLE, statementData.type)
            Assert.assertEquals("sample", statement.tableId.tableName)

            val action = statement.firstAction() as DropColumnAction
            Assert.assertEquals("id", action.columNames.get(0))
        } else {
            Assert.fail()
        }
    }

    @Test
    fun setTableLocationTest() {
        val sql = "alter table demo partition(ds='20180317') set location '/user/hive'"

        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is AlterTable) {
            Assert.assertEquals(StatementType.ALTER_TABLE, statementData.type)
            Assert.assertEquals("demo", statement.tableId.tableName)
            val action = statement.firstAction() as AlterTableAction
            Assert.assertEquals("/user/hive", action.location)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun updateColumnTest() {
        val sql = "ALTER TABLE sale_detail CHANGE COLUMN old_col_name new_col_name string comment 'sdsd'"

        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is AlterTable) {
            Assert.assertEquals("sale_detail", statement.tableId.tableName)

            val action = statement.firstAction() as AlterColumnAction
            Assert.assertEquals("new_col_name", action.newColumName)
            Assert.assertEquals("sdsd", action.comment)
        } else {
            Assert.fail()
        }

        val sql1 = "ALTER TABLE test_users_dt CHANGE age2 age3 int"

        val statementData1 = SparkSqlHelper.getStatementData(sql1)
        val statement1 = statementData1.statement
        if (statement1 is AlterTable) {
            Assert.assertEquals("test_users_dt", statement1.tableId.tableName)

            val action = statement1.firstAction() as AlterColumnAction
            Assert.assertEquals("age3", action.newColumName)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun dropPartitionTest0() {
        val sql = "ALTER TABLE page_view DROP IF EXISTS PARTITION (dt='2008-08-08', country='us'), PARTITION (dt='2008-08-09', country='us')"

        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        Assert.assertEquals(StatementType.ALTER_TABLE, statementData.type)
        if (statement is AlterTable) {
            Assert.assertEquals("page_view", statement.tableId.tableName)
            val action = statement.firstAction() as DropPartitionAction
            Assert.assertTrue(action.ifExists)
            Assert.assertEquals(AlterType.DROP_PARTITION, statement.alterType)
            Assert.assertEquals(2, action.partitions.size)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun dropPartitionTest1() {
        val sql = "ALTER TABLE page_view DROP PARTITION (dt='2008-08-08', country='us'), PARTITION (dt='2008-08-09', country='us')"

        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        Assert.assertEquals(StatementType.ALTER_TABLE, statementData.type)
        if (statement is AlterTable) {
            Assert.assertEquals("page_view", statement.tableId.tableName)
            val action = statement.firstAction() as DropPartitionAction
            Assert.assertFalse(action.ifExists)
            Assert.assertEquals(AlterType.DROP_PARTITION, statement.alterType)
            Assert.assertEquals(2, action.partitions.size)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun addPartitionTest0() {
        val sql = "ALTER TABLE page_view ADD PARTITION (partCol = 'value1') "

        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        Assert.assertEquals(StatementType.ALTER_TABLE, statementData.type)
        if (statement is AlterTable) {
            Assert.assertEquals("page_view", statement.tableId.tableName)
            val action = statement.firstAction() as AddPartitionAction
            Assert.assertFalse(action.ifNotExists)
            Assert.assertEquals(AlterType.ADD_PARTITION, statement.alterType)
            Assert.assertEquals(1, action.partitions.size)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun addPartitionTest1() {
        val sql = "ALTER TABLE page_view add IF NOT EXISTS PARTITION (dt='2008-08-08', country='us')"

        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        Assert.assertEquals(StatementType.ALTER_TABLE, statementData.type)
        if (statement is AlterTable) {
            Assert.assertEquals("page_view", statement.tableId.tableName)
            val action = statement.firstAction() as AddPartitionAction
            Assert.assertTrue(action.ifNotExists)
            Assert.assertEquals(AlterType.ADD_PARTITION, statement.alterType)
            Assert.assertEquals(1, action.partitions.size)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun renamePartitionTest() {
        val sql = "ALTER TABLE page_view PARTITION (dt='2008-08-08')  RENAME TO PARTITION (dt='20080808')"

        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        Assert.assertEquals(StatementType.ALTER_TABLE, statementData.type)
        if (statement is AlterTable) {
            Assert.assertEquals("page_view", statement.tableId.tableName)
            val action = statement.firstAction() as RenamePartitionAction
            Assert.assertEquals(AlterType.RENAME_PARTITION, statement.alterType)
            Assert.assertEquals(1, action.fromPartitionVals.size)
            Assert.assertEquals(1, action.toPartitionVals.size)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun createFuncTest() {
        val sql = "CREATE FUNCTION test.train_perceptron AS 'hivemall.classifier.PerceptronUDTF' " +
                "using jar 'hdfs://tdhdfs/user/datacompute/platformtool/resources/132/latest/hivemall-spark.jar'"

        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is CreateFunction) {
            Assert.assertEquals("test", statement.schemaName)
            Assert.assertEquals("train_perceptron", statement.funcName)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun createFuncTest1() {
        val sql = "CREATE TEMPORARY FUNCTION IF NOT EXISTS stream_json_extract_value " +
                "AS 'com.dataworker.spark.jobserver.driver.udf.GenericUDTFJsonExtractValue'"

        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is CreateFunction) {
            Assert.assertEquals("stream_json_extract_value", statement.funcName)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun dropFuncTest() {
        val sql = "drop FUNCTION train_perceptron"

        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is DropFunction) {
            Assert.assertEquals("train_perceptron", statement.funcName)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun queryTest0() {
        val sql = "select * from `demo_rp`.bigdata.users a join address b on a.addr_id=b.id limit 101"
        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is QueryStmt) {
            Assert.assertEquals(StatementType.SELECT, statementData.type)
            Assert.assertEquals(2, statement.inputTables.size)
            Assert.assertEquals("users", statement.inputTables.get(0).tableName)
            Assert.assertEquals("demo_rp.bigdata.users", statement.inputTables.get(0).getFullTableName())
            Assert.assertEquals("address", statement.inputTables.get(1).tableName)
            Assert.assertEquals(101, statement.limit)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun queryTest1() {
        val sql = "select * from (select * from users where name='melin') a limit 1001"
        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is QueryStmt) {
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
        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is QueryStmt) {
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

        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is QueryStmt) {
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

        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is QueryStmt) {
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

        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is QueryStmt) {
            Assert.assertEquals(StatementType.SELECT, statementData.type)
            Assert.assertEquals(3, statement.inputTables.size)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun queryTest6() {
        val sql = "select * from test"

        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is QueryStmt) {
            Assert.assertEquals(StatementType.SELECT, statementData.type)
            Assert.assertEquals(1, statement.inputTables.size)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun queryTest7() {
        val sql = "select true is false"

        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is QueryStmt) {
            Assert.assertEquals(StatementType.SELECT, statementData.type)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun queryTest8() {
        val sql = "select 'test' as name"

        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is QueryStmt) {
            Assert.assertEquals(StatementType.SELECT, statementData.type)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun insertIntoTest0() {
        val sql = "insert into TABLE users PARTITION(ds='20170220') values('libinsong', 12, 'test'), ('libinsong', 13, 'test')"
        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is InsertStmt) {
            Assert.assertEquals(StatementType.INSERT_VALUES, statementData.type)
            Assert.assertEquals(InsertMode.INTO, statement.mode)
            Assert.assertEquals("users", statement.tableId?.tableName)
            Assert.assertEquals(2, statement.rows?.size)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun insertIntoTest1() {
        val sql = "insert into bigdata.delta_lsw_test values('lsw'),('lsw1')"
        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is InsertStmt) {
            Assert.assertEquals(StatementType.INSERT_VALUES, statementData.type)
            Assert.assertEquals(InsertMode.INTO, statement.mode)
            Assert.assertEquals("delta_lsw_test", statement.tableId?.tableName)
            Assert.assertEquals(2, statement.rows?.size)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun insertTableCustomColumn() {
        val sql = "INSERT INTO test_demo_test (name) VALUES('lisi')"
        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is InsertStmt) {
            Assert.assertEquals(StatementType.INSERT_VALUES, statementData.type)
            Assert.assertEquals(InsertMode.INTO, statement.mode)
            Assert.assertEquals("test_demo_test", statement.tableId?.tableName)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun insertOverwriteTest0() {
        val sql = "insert OVERWRITE TABLE users PARTITION(ds='20170220') values('libinsong')"
        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is InsertStmt) {
            Assert.assertEquals(StatementType.INSERT_VALUES, statementData.type)
            Assert.assertEquals(InsertMode.OVERWRITE, statement.mode)
            Assert.assertEquals(1, statement.partitionVals?.size)
            Assert.assertEquals("users", statement.tableId?.tableName)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun insertOverwriteTest1() {
        val sql = "insert OVERWRITE TABLE users PARTITION(ds) values('libinsong', '20170220')"
        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is InsertStmt) {
            Assert.assertEquals(StatementType.INSERT_VALUES, statementData.type)
            Assert.assertEquals(InsertMode.OVERWRITE, statement.mode)
            Assert.assertEquals(1, statement.partitionVals?.size)
            Assert.assertEquals("users", statement.tableId?.tableName)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun insertOverwriteQueryTest2() {
        val sql = "insert INTO users PARTITION(ds='20170220') select * from account a join address b on a.addr_id=b.id"
        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is InsertStmt) {
            Assert.assertEquals(StatementType.INSERT_SELECT, statementData.type)
            Assert.assertEquals("users", statement.tableId?.tableName)
            Assert.assertEquals(InsertMode.INTO, statement.mode)
            Assert.assertEquals(1, statement.partitionVals?.size)
            Assert.assertEquals("select * from account a join address b on a.addr_id=b.id", statement.querySql)

            Assert.assertEquals(2, statement.inputTables.size)
            Assert.assertEquals("account", statement.inputTables.get(0).tableName)
            Assert.assertEquals("address", statement.inputTables.get(1).tableName)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun insertOverwriteQueryTest3() {
        val sql = "insert INTO users select *, bigdata.Test(id) from account a join address b on a.addr_id=b.id"
        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is InsertStmt) {
            Assert.assertEquals(StatementType.INSERT_SELECT, statementData.type)
            Assert.assertEquals("users", statement.tableId?.tableName)
            Assert.assertEquals(InsertMode.INTO, statement.mode)
            Assert.assertEquals(0, statement.partitionVals?.size)
            Assert.assertEquals(statement.querySql, "select *, bigdata.Test(id) from account a join address b on a.addr_id=b.id")

            Assert.assertEquals(2, statement.inputTables.size)
            Assert.assertEquals("account", statement.inputTables.get(0).tableName)
            Assert.assertEquals("address", statement.inputTables.get(1).tableName)

            Assert.assertEquals("bigdata.test", statement.functionNames.first())
        } else {
            Assert.fail()
        }
    }

    @Test
    fun insertOverwriteQueryTest4() {
        val sql = "insert OVERWRITE TABLE users PARTITION(ds='20170220') select * from account1 union all " +
                "select * from account2"
        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is InsertStmt) {
            Assert.assertEquals(StatementType.INSERT_SELECT, statementData.type)
            Assert.assertEquals("users", statement.tableId?.tableName)
            Assert.assertEquals(InsertMode.OVERWRITE, statement.mode)
            Assert.assertEquals(1, statement.partitionVals?.size)
            Assert.assertEquals(statement.querySql, "select * from account1 union all select * from account2");

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

        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is InsertStmt) {
            Assert.assertEquals(StatementType.MULTI_INSERT, statementData.type)
            Assert.assertEquals("sample_07", statement.inputTables.get(0).tableName)
            Assert.assertEquals(3, statement.outputTables.size)
            Assert.assertEquals("toodey3", statement.outputTables.get(2).tableName)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun useTest() {
        val sql = "use bigdata"

        val statementData = SparkSqlHelper.getStatementData(sql)
        Assert.assertEquals(StatementType.USE, statementData.type)
        val statement = statementData.statement
        if (statement is UseNamespace) {
            Assert.assertEquals("bigdata", statement.namespaceId.schemaName)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun setTest() {
        val sql = "set spark.executor.memory=30g"

        val statementData = SparkSqlHelper.getStatementData(sql)
        Assert.assertEquals(StatementType.SET, statementData.type)
    }

    @Test
    fun mergeTest() {
        val sql = "merge table test OPTIONS (mergefile=2)"

        SparkSqlHelper.getStatementData(sql)
    }

    @Test
    fun substrFile() {
        val sql = "SELECT substring('Spark SQL' from 5)"

        val statementData = SparkSqlHelper.getStatementData(sql)
        Assert.assertEquals(StatementType.SELECT, statementData.type)
    }

    @Test
    fun druidSql() {
        val sql = "SELECT * from druid.`select * from test`"

        val statementData = SparkSqlHelper.getStatementData(sql)
        Assert.assertEquals(StatementType.SELECT, statementData.type)
        val statement = statementData.statement
        if (statement is QueryStmt) {
            Assert.assertEquals("druid", statement.inputTables.get(0).schemaName)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun druidSql1() {
        val sql = "SELECT * from tdl_xdsd_sd"

        val statementData = SparkSqlHelper.getStatementData(sql)
        Assert.assertEquals(StatementType.SELECT, statementData.type)
        val statement = statementData.statement
        if (statement is QueryStmt) {
            Assert.assertNull(statement.inputTables.get(0).schemaName)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun deleteTest() {
        val sql = "delete from aa.user where name='xc'"

        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is DeleteTable) {
            Assert.assertEquals(StatementType.DELETE, statementData.type)
            Assert.assertEquals("user", statement.tableId.tableName)
            Assert.assertEquals("name='xc'", statement.where)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun updateTest0() {
        val sql = "update user set name='xxx', age=20 where id=2"

        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is UpdateTable) {
            Assert.assertEquals(StatementType.UPDATE, statementData.type)
            Assert.assertEquals("user", statement.tableId.tableName)
            Assert.assertEquals("id=2", statement.where)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun updateTest1() {
        val sql = "update user set name='xxx'"

        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is UpdateTable) {
            Assert.assertEquals(StatementType.UPDATE, statementData.type)
            Assert.assertEquals("user", statement.tableId.tableName)
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

        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is MergeIntoTable) {
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

        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is MergeIntoTable) {
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

        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is MergeIntoTable) {
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

        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is MergeIntoTable) {
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

        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is MergeIntoTable) {
            Assert.assertEquals(StatementType.MERGE_INTO_TABLE, statementData.type)
            Assert.assertEquals("merge_test", statement.targetTable.tableName)
            Assert.assertEquals(1, statement.sourceTables.size)
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

        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is QueryStmt) {
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

        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is InsertStmt) {
            Assert.assertEquals(3, statement.inputTables.size)
            Assert.assertEquals(StatementType.INSERT_SELECT, statementData.type)
            Assert.assertEquals(5, statement.cteTempTables.size)
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

        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is ExportData) {
            Assert.assertEquals(1, statement.inputTables.size)
            Assert.assertEquals(StatementType.EXPORT_TABLE, statementData.type)
            Assert.assertEquals("druid_result", statement.tableId.tableName)
            Assert.assertEquals("a", statement.cteTempTables.get(0))
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

        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is CreateTable) {
            val schemaName = statement.tableId.schemaName
            Assert.assertEquals(statement.location,"LOCATION's3a://hive/test/'");
            Assert.assertEquals("s3Db", schemaName)
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

        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is CreateTable) {
            val prop = statement.properties
            Assert.assertEquals("ZSTD", prop?.get("compression"))
        } else {
            Assert.fail()
        }
    }

    @Test
    fun countCondTest() {
        val sql = "select count(type='mac' or null) From test_table where a=2"

        val statementData = SparkSqlHelper.getStatementData(sql)
        Assert.assertEquals(StatementType.SELECT, statementData.type)
        val statement = statementData.statement
        if (statement is QueryStmt) {
            Assert.assertEquals(StatementType.SELECT, statementData.type)
            Assert.assertEquals("test_table", statement.inputTables.get(0).tableName)
        } else {
            Assert.fail()
        }
    }

    //@Test
    fun queryLakeTableMetaTest0() {
        val sql = "select * from dc.user.history limit 101"
        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is QueryStmt) {
            Assert.assertEquals(StatementType.SELECT, statementData.type)
            Assert.assertEquals(1, statement.inputTables.size)
            Assert.assertEquals("user", statement.inputTables.get(0).tableName)
            //Assert.assertEquals("history", statement.inputTables.get(0).metaAction)
            Assert.assertEquals(101, statement.limit)
        } else {
            Assert.fail()
        }
    }

    //@Test
    fun queryLakeTableMetaTest1() {
        val sql = """
            select h.made_current_at, s.operation, h.snapshot_id, h.is_current_ancestor, s.summary['spark.app.id']
            from db.table.history h
            join db.table.snapshots s on h.snapshot_id = s.snapshot_id
            order by made_current_at
        """.trimIndent()

        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is QueryStmt) {
            Assert.assertEquals(StatementType.SELECT, statementData.type)
            Assert.assertEquals(2, statement.inputTables.size)
            Assert.assertEquals("table", statement.inputTables.get(0).tableName)
            //Assert.assertEquals("history", statement.inputTables.get(0).metaAction)

            Assert.assertEquals("table", statement.inputTables.get(1).tableName)
            //Assert.assertEquals("snapshots", statement.inputTables.get(1).metaAction)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun dtunnelTest0() {
        val sql = "datatunnel source('sftp') options(host='x.x.x.x') sink('hive') options(table='demo', columns=['id', 'name'])"
        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is DataTunnelExpr) {
            Assert.assertEquals(StatementType.DATATUNNEL, statementData.type)
            Assert.assertEquals("sftp", statement.srcType)
            Assert.assertEquals("x.x.x.x", statement.srcOptions.get("host"))

            Assert.assertEquals("hive", statement.distType)
            Assert.assertEquals("demo", statement.distOptions.get("table"))

            val list = statement.distOptions.get("columns") as List<String>
            Assert.assertEquals(2, list.size)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun dtunnelTest1() {
        val sql = """
            datatunnel source('sftp') options(host='x.x.x.x') 
            transform = "select * from result where type='sql'"
            sink('hive') options(table='demo', columns=['id', 'name'])
        """.trimIndent()
        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is DataTunnelExpr) {
            Assert.assertEquals(StatementType.DATATUNNEL, statementData.type)
            Assert.assertEquals("sftp", statement.srcType)
            Assert.assertEquals("x.x.x.x", statement.srcOptions.get("host"))

            Assert.assertEquals("select * from result where type='sql'", statement.transformSql)

            Assert.assertEquals("hive", statement.distType)
            Assert.assertEquals("demo", statement.distOptions.get("table"))

            val list = statement.distOptions.get("columns") as List<String>
            Assert.assertEquals(2, list.size)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun dtunnelTest2() {
        val sql = "datatunnel source('sftp') options(host='x.x.x.x') sink('log')"
        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is DataTunnelExpr) {
            Assert.assertEquals(StatementType.DATATUNNEL, statementData.type)
            Assert.assertEquals("sftp", statement.srcType)
            Assert.assertEquals("x.x.x.x", statement.srcOptions.get("host"))

            Assert.assertEquals("log", statement.distType)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun dtunnelTest3() {
        val sql = """
            WITH tmp_demo_test2 AS (SELECT *, test(id) FROM bigdata.test_demo_test2 where name is not null) 
                datatunnel SOURCE('hive') OPTIONS(
                databaseName='bigdata',
                tableName='tmp_demo_test2',
                columns=['*'])
            SINK('log') OPTIONS(numRows = 10)
        """.trimIndent()
        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is DataTunnelExpr) {
            Assert.assertEquals(StatementType.DATATUNNEL, statementData.type)
            Assert.assertEquals("hive", statement.srcType)

            Assert.assertTrue(statement.cte)
            Assert.assertEquals("log", statement.distType)
            Assert.assertEquals(1, statement.inputTables.size)
            Assert.assertEquals(1, statement.functionNames.size)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun dtunnelTest4() {
        val sql = """
            DATATUNNEL SOURCE('oracle') OPTIONS(
                username='flinkuser',
                password='flinkpw',
                host='172.18.1.56',
                port=1521,
                serviceName='XE',
                databaseName='FLINKUSER',    tableName='ORDERS', 
                columns=[{'name' : "pk", "type" : "id"},
                          { "name" : "col_ip","type" : "ip" },
                          { "name" : "col_double","type" : "double" },
                          { "name" : "col_long","type" : "long" },
                          { "name" : "col_keyword", "type" : "keyword" },
                          { "name" : "col_text", "type" : "text", "analyzer" : "ik_max_word"},
                          { "name" : "col_geo_point", "type" : "geo_point" },
                          { "name" : "col_date", "type" : "date", "format" : "yyyy-MM-dd HH:mm:ss"},
                          { "name" : "col_nested1", "type" : "nested" },
                          { "name" : "col_object1", "type" : "object" },
                          { "name" : "col_integer_array", "type" : "integer", "array" : TRUE},
                          { "name" : "col_geo_shape", "type" : "geo_shape", "tree" : "quadtree", "precision" : "10m"}
                        ])
                SINK('log') OPTIONS(numRows = 10)
        """.trimIndent()
        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is DataTunnelExpr) {
            Assert.assertEquals(StatementType.DATATUNNEL, statementData.type)
            Assert.assertEquals("oracle", statement.srcType)

            Assert.assertFalse(statement.cte)
            Assert.assertEquals("log", statement.distType)
            val list = statement.srcOptions.get("columns") as List<HashMap<String, String>>
            Assert.assertEquals(12, list.size )
        } else {
            Assert.fail()
        }
    }

    @Test
    fun callTest() {
        val sql = "CALL catalog_name.system.rollback_to_snapshot('db.sample', 1)"
        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is CallExpr) {
            Assert.assertEquals(StatementType.CALL, statementData.type)
            Assert.assertEquals("catalog_name", statement.schema.catalogName)
            Assert.assertEquals("system", statement.schema.schemaName)
            Assert.assertEquals("rollback_to_snapshot", statement.procedureName)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun syncSchemaTest() {
        val sql = "SYNC SCHEMA my_db_uc FROM hive_metastore.my_db SET OWNER wangwu"
        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is SyncSchemaExpr) {
            Assert.assertEquals(StatementType.SYNC, statementData.type)
            Assert.assertNull(statement.targetNamespaceId.catalogName)
            Assert.assertEquals("my_db_uc", statement.targetNamespaceId.schemaName)
            Assert.assertEquals("hive_metastore", statement.sourceNamespaceId.catalogName)
            Assert.assertEquals("my_db", statement.sourceNamespaceId.schemaName)
            Assert.assertEquals("wangwu", statement.owner)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun syncTableTest() {
        val sql = "SYNC TABLE main.default.my_tbl FROM hive_metastore.default.my_tbl"
        val statementData = SparkSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is SyncTableExpr) {
            Assert.assertEquals(StatementType.SYNC, statementData.type)
            Assert.assertEquals("main", statement.targetTableId.catalogName)
            Assert.assertEquals("default", statement.targetTableId.schemaName)
            Assert.assertEquals("my_tbl", statement.targetTableId.tableName)
            Assert.assertEquals("hive_metastore", statement.sourceTableId.catalogName)
            Assert.assertEquals("default", statement.sourceTableId.schemaName)
            Assert.assertEquals("my_tbl", statement.sourceTableId.tableName)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun notSupportSql() {
        val sql = "insert overwrite directory '/user/ahao' ROW FORMAT DELIMITED FIELDS TERMINATED BY '\\t' select * from nlp_dev.all_category_sample"
        try {
            SparkSqlHelper.getStatementData(sql)
            Assert.fail()
        } catch (e: SQLParserException) {
            Assert.assertTrue(true)
        }
    }

    @Test
    fun typeConstructor() {
        var sql = "select date '20220-02-13' as demo";
        SparkSqlHelper.getStatementData(sql)

        sql = "select timestamp '20220-02-13' as demo";
        SparkSqlHelper.getStatementData(sql)

        sql = "select time '20220-02-13' as demo";
        SparkSqlHelper.getStatementData(sql)
    }

    @Test
    fun createIndexTest() {
        val sql = "CREATE INDEX test_index ON demo.orders (column_name)"

        val statementData = SparkSqlHelper.getStatementData(sql)
        Assert.assertEquals(StatementType.ALTER_TABLE, statementData.type)

        val statement = statementData.statement
        if (statement is AlterTable) {
            Assert.assertEquals(TableId("demo", "orders"), statement.tableId)
            val createIndex = statement.firstAction() as CreateIndex
            Assert.assertEquals("test_index", createIndex.indexName)
        }
    }

    @Test
    fun dropIndexTest() {
        val sql = "DROP INDEX test_index ON demo.orders"

        val statementData = SparkSqlHelper.getStatementData(sql)
        Assert.assertEquals(StatementType.ALTER_TABLE, statementData.type)

        val statement = statementData.statement
        if (statement is AlterTable) {
            Assert.assertEquals(TableId("demo", "orders"), statement.tableId)
            val dropIndex = statement.firstAction() as DropIndex
            Assert.assertEquals("test_index", dropIndex.indexName)
        }
    }
}
