package io.github.melin.superior.parser.starrocks

import io.github.melin.superior.common.StatementType.*
import io.github.melin.superior.common.relational.FunctionId
import io.github.melin.superior.common.relational.TableId
import io.github.melin.superior.common.relational.alter.*
import io.github.melin.superior.common.relational.create.*
import io.github.melin.superior.common.relational.drop.*
import io.github.melin.superior.parser.starrocks.relational.CancelRefreshMaterializedView
import io.github.melin.superior.parser.starrocks.relational.RefreshMaterializedView
import org.junit.Assert
import org.junit.Test

class StarRocksSqlParserDdlTest {

    @Test
    fun createCatalogTest() {
        val sql = """
            CREATE EXTERNAL CATALOG iceberg_metastore_catalog
            PROPERTIES(
                "type"="iceberg",
                "iceberg.catalog.type"="hive",
                "iceberg.catalog.hive.metastore.uris"="thrift://x.x.x.x:9083"
            );
        """.trimIndent()

        val statement = StarRocksHelper.parseStatement(sql)
        if (statement is CreateCatalog) {
            Assert.assertEquals(CREATE_CATALOG, statement.statementType)
            Assert.assertEquals("iceberg_metastore_catalog", statement.catalogName)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun dropCatalogTest() {
        val sql = """
            DROP CATALOG iceberg_metastore_catalog;
        """.trimIndent()

        val statement = StarRocksHelper.parseStatement(sql)
        if (statement is DropCatalog) {
            Assert.assertEquals(DROP_CATALOG, statement.statementType)
            Assert.assertEquals("iceberg_metastore_catalog", statement.catalogName)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun createDatabaseTest() {
        val sql = """
            CREATE DATABASE IF Not EXISTS db_test;
            Drop DATABASE IF EXISTS db_test1;
        """.trimIndent()

        val statements = StarRocksHelper.parseMultiStatement(sql)

        val createDatabse = statements.get(0)
        val dropDatabase = statements.get(1)
        if (createDatabse is CreateDatabase) {
            Assert.assertEquals("db_test", createDatabse.databaseName)
        }
        if (dropDatabase is CreateDatabase) {
            Assert.assertEquals("db_test1", dropDatabase.databaseName)
        }
    }

    @Test
    fun dropDatabaseTest() {
        val sql = """
            DROP DATABASE IF EXISTS db_test;
        """.trimIndent()

        val statement = StarRocksHelper.parseStatement(sql)
        if (statement is DropDatabase) {
            Assert.assertEquals(DROP_DATABASE, statement.statementType)
            Assert.assertEquals("db_test", statement.databaseName)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun alterDatabaseTest() {
        val sql = """
            ALTER DATABASE example_db SET DATA QUOTA 100G;
        """.trimIndent()
        val statement = StarRocksHelper.parseStatement(sql)
        if (statement is AlterDatabase) {
            Assert.assertEquals(ALTER_DATABASE, statement.statementType)
            Assert.assertEquals("example_db", statement.databaseName)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun renameDatabaseTest() {
        val sql = """
            ALTER DATABASE example_db RENAME example_db2;
        """.trimIndent()
        val statement = StarRocksHelper.parseStatement(sql)
        if (statement is AlterDatabase) {
            Assert.assertEquals(ALTER_DATABASE, statement.statementType)
            Assert.assertEquals("example_db", statement.databaseName)
            val action = statement.firstAction() as RenameDbAction
            Assert.assertEquals("example_db2", action.newDatabaseName)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun createTableTest() {
        val sql = """
            create table meta_role (
                id           int          not null,
                tenant_id    int          null comment '租户ID',
                code         varchar(255) null comment '角色code, 字母数字和下划线',
                name         varchar(255) null comment '角色名称，一般为中文',
                type         varchar(32)  not null comment '角色类型：superadmin、workspaceadmin、dataadmin、custom',
                order_index  int          null,
                creater      varchar(45)  null,
                modifier     varchar(45)  null,
                gmt_created  datetime     null,
                gmt_modified datetime     null
            ) ENGINE = olap PRIMARY KEY(id)
            DISTRIBUTED BY HASH (id) BUCKETS 10;
        """.trimIndent()

        val statement = StarRocksHelper.parseStatement(sql)
        if (statement is CreateTable) {
            Assert.assertEquals(CREATE_TABLE, statement.statementType)
            Assert.assertEquals("meta_role", statement.tableId.tableName)
            Assert.assertEquals("primary", statement.modelType)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun dropTableTest() {
        val sql = """
           DROP TABLE IF EXISTS example_db.My_table force;
        """.trimIndent()

        val statement = StarRocksHelper.parseStatement(sql)
        if (statement is DropTable) {
            Assert.assertEquals(DROP_TABLE, statement.statementType)
            Assert.assertEquals(TableId("example_db", "My_table"), statement.tableId)
            Assert.assertTrue(statement.force)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun createViewTest() {
        val sql = """
            CREATE VIEW example_db.example_view (
                k1 COMMENT "first key",
                k2 COMMENT "second key",
                k3 COMMENT "third key",
                v1 COMMENT "first value"
            )
            COMMENT "my first view"
            AS SELECT c1 as k1, k2, k3, SUM(v1) FROM example_table
            WHERE k1 = 20160112
            GROUP BY k1,k2,k3;
        """.trimIndent()

        val statement = StarRocksHelper.parseStatement(sql)
        if (statement is CreateView) {
            Assert.assertEquals(CREATE_VIEW, statement.statementType)
            Assert.assertEquals("my first view", statement.comment)
            Assert.assertEquals(4, statement.columnRels?.size)
            Assert.assertEquals(TableId("example_db", "example_view"), statement.tableId)
            Assert.assertEquals(TableId("example_table"), statement.queryStmt.inputTables.get(0))
        } else {
            Assert.fail()
        }
    }

    @Test
    fun dropViewTest() {
        val sql = """
           DROP VIEW IF EXISTS example_db.example_view;
        """.trimIndent()

        val statement = StarRocksHelper.parseStatement(sql)
        if (statement is DropView) {
            Assert.assertEquals(DROP_VIEW, statement.statementType)
            Assert.assertEquals(TableId("example_db", "example_view"), statement.tableId)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun createMaterializedViewTest() {
        val sql = """
            CREATE MATERIALIZED VIEW example_db.lo_mv1
            DISTRIBUTED BY HASH(`lo_orderkey`) BUCKETS 10
            REFRESH ASYNC
            AS
            select
                lo_orderkey, 
                lo_custkey, 
                sum(lo_quantity) as total_quantity, 
                sum(lo_revenue) as total_revenue, 
                count(lo_shipmode) as shipmode_count
            from lineorder 
            group by lo_orderkey, lo_custkey 
            order by lo_orderkey;
        """.trimIndent()

        val statement = StarRocksHelper.parseStatement(sql)
        if (statement is CreateMaterializedView) {
            Assert.assertEquals(CREATE_MATERIALIZED_VIEW, statement.statementType)
            Assert.assertEquals(TableId("example_db", "lo_mv1"), statement.tableId)
            Assert.assertEquals(TableId("lineorder"), statement.queryStmt.inputTables.get(0))
        } else {
            Assert.fail()
        }
    }

    @Test
    fun dropMaterializedViewTest() {
        val sql = """
           DROP MATERIALIZED VIEW IF EXISTS k1_k2;
        """.trimIndent()

        val statement = StarRocksHelper.parseStatement(sql)
        if (statement is DropMaterializedView) {
            Assert.assertEquals(DROP_MATERIALIZED_VIEW, statement.statementType)
            Assert.assertEquals(TableId("k1_k2"), statement.tableId)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun alterMaterializedViewTest() {
        val sql = """
           ALTER MATERIALIZED VIEW lo_mv1 RENAME lo_mv1_new_name;
           ALTER MATERIALIZED VIEW lo_mv2 REFRESH ASYNC EVERY(INTERVAL 1 DAY);
           ALTER MATERIALIZED VIEW mv1 SET ("session.query_timeout" = "40000");
        """.trimIndent()

        val statements = StarRocksHelper.parseMultiStatement(sql)
        Assert.assertEquals(3, statements.size)
    }

    @Test
    fun refreshMaterializedViewTest() {
        val sql = """
           REFRESH MATERIALIZED VIEW lo_mv1 PARTITION START ("2020-02-01") END ("2020-03-01") FORCE;
        """.trimIndent()

        val statement = StarRocksHelper.parseStatement(sql)
        if (statement is RefreshMaterializedView) {
            Assert.assertEquals(REFRESH_MV, statement.statementType)

            Assert.assertEquals("lo_mv1", statement.tableId.tableName)
            Assert.assertEquals("2020-02-01", statement.partitionStart)
            Assert.assertEquals("2020-03-01", statement.partitionEnd)
            Assert.assertTrue(statement.force)
            Assert.assertEquals("Async", statement.mode)
        }
    }

    @Test
    fun cancelRefreshMaterializedViewTest() {
        val sql = """
           CANCEL REFRESH MATERIALIZED VIEW lo_mv1;
        """.trimIndent()

        val statement = StarRocksHelper.parseStatement(sql)
        if (statement is CancelRefreshMaterializedView) {
            Assert.assertEquals(CANCEL_REFRESH_MV, statement.statementType)
            Assert.assertEquals("lo_mv1", statement.tableId.tableName)
        }
    }

    @Test
    fun createIndexTest() {
        val sql = """
            CREATE INDEX index3 ON sales_records (item_id) USING BITMAP COMMENT '';

        """.trimIndent()

        val statement = StarRocksHelper.parseStatement(sql)
        if (statement is AlterTable) {
            Assert.assertEquals(ALTER_TABLE, statement.statementType)
            val createIndex = statement.firstAction() as CreateIndex
            Assert.assertEquals("index3", createIndex.indexName)
            Assert.assertEquals("sales_records", statement.tableId.tableName)
            Assert.assertEquals(1, createIndex.indexColumnNames.size)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun dropIndexTest() {
        val sql = """
            DROP INDEX index3 ON sales_records;
        """.trimIndent()

        val statement = StarRocksHelper.parseStatement(sql)
        if (statement is AlterTable) {
            Assert.assertEquals(ALTER_TABLE, statement.statementType)
            val dropIndex = statement.firstAction() as DropIndex
            Assert.assertEquals("index3", dropIndex.indexName)
            Assert.assertEquals("sales_records", statement.tableId.tableName)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun createFuncTest() {
        val sql = """
            CREATE GLOBAL FUNCTION MY_UDF_JSON_GET(string, string) 
            RETURNS string
            properties (
                "symbol" = "com.starrocks.udf.sample.UDFJsonGet", 
                "type" = "StarrocksJar",
                "file" = "http://http_host:http_port/udf-1.0-SNAPSHOT-jar-with-dependencies.jar"
            );
        """.trimIndent()

        val statement = StarRocksHelper.parseStatement(sql)
        if (statement is CreateFunction) {
            Assert.assertEquals(CREATE_FUNCTION, statement.statementType)
            Assert.assertEquals(FunctionId("MY_UDF_JSON_GET"), statement.functionId)
            Assert.assertEquals("string", statement.returnType)
            Assert.assertEquals(2, statement.argumentTypes?.size)
            Assert.assertEquals(3, statement.properties?.size)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun dropFuncTest() {
        val sql = """
            DROP GLOBAL FUNCTION MY_UDF_JSON_GET(string, string) 
        """.trimIndent()

        val statement = StarRocksHelper.parseStatement(sql)
        if (statement is DropFunction) {
            Assert.assertEquals(DROP_FUNCTION, statement.statementType)
            Assert.assertEquals(FunctionId("MY_UDF_JSON_GET"), statement.functionId)
            Assert.assertEquals(2, statement.argumentTypes?.size)
        } else {
            Assert.fail()
        }
    }
}