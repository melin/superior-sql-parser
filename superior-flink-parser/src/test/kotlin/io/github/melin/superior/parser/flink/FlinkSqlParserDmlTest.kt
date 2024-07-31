package io.github.melin.superior.parser.flink

import io.github.melin.superior.common.relational.common.AddResourceStatement
import io.github.melin.superior.common.relational.common.SetStatement
import io.github.melin.superior.common.relational.create.CreateCatalog
import io.github.melin.superior.common.relational.dml.InsertMultiTable
import io.github.melin.superior.common.relational.dml.QueryStmt
import org.junit.Assert
import org.junit.Test

/** Created by libinsong on 2018/1/10. */
class FlinkSqlParserDmlTest {

    @Test
    fun selectSqlTest() {
        val sql =
            """
            WITH orders_with_total AS (
                SELECT order_id, price + tax AS total
                FROM Orders
            )
            SELECT order_id, SUM(total)
            FROM orders_with_total
            GROUP BY order_id
            limit 10;
            
            SELECT order_id, price FROM (VALUES (1, 2.0), (2, 3.1))  AS t (order_id, price);
            
            SELECT * FROM TABLE(TUMBLE(TABLE Bid, DESCRIPTOR(bidtime), INTERVAL '10' MINUTES));
            
            SELECT * FROM TABLE(
               TUMBLE(
                 DATA => TABLE Bid,
                 TIMECOL => DESCRIPTOR(bidtime),
                 SIZE => INTERVAL '10' MINUTES));
                 
            SELECT * FROM TABLE(
                HOP(
                  DATA => TABLE Bid,
                  TIMECOL => DESCRIPTOR(bidtime),
                  SLIDE => INTERVAL '5' MINUTES,
                  SIZE => INTERVAL '10' MINUTES));
                  
            SELECT * FROM TABLE(
            CUMULATE(
              DATA => TABLE Bid,
              TIMECOL => DESCRIPTOR(bidtime),
              STEP => INTERVAL '2' MINUTES,
              SIZE => INTERVAL '10' MINUTES));
              
            SELECT window_start, window_end, SUM(price)
              FROM TABLE(
                TUMBLE(TABLE Bid, DESCRIPTOR(bidtime), INTERVAL '10' MINUTES, INTERVAL '1' MINUTES))
              GROUP BY window_start, window_end;  
              
            SELECT *
            FROM (
              SELECT *,
                ROW_NUMBER() OVER (PARTITION BY category ORDER BY sales DESC) AS row_num
              FROM ShopSales)
            WHERE row_num <= 5;
            
            SELECT *
            FROM Ticker
                MATCH_RECOGNIZE (
                    PARTITION BY symbol
                    ORDER BY rowtime
                    MEASURES
                        START_ROW.rowtime AS start_tstamp,
                        LAST(PRICE_DOWN.rowtime) AS bottom_tstamp,
                        LAST(PRICE_UP.rowtime) AS end_tstamp
                    ONE ROW PER MATCH
                    AFTER MATCH SKIP TO LAST PRICE_UP
                    PATTERN (START_ROW PRICE_DOWN+ PRICE_UP)
                    DEFINE
                        PRICE_DOWN AS
                            (LAST(PRICE_DOWN.price, 1) IS NULL AND PRICE_DOWN.price < START_ROW.price) OR
                                PRICE_DOWN.price < LAST(PRICE_DOWN.price, 1),
                        PRICE_UP AS
                            PRICE_UP.price > LAST(PRICE_DOWN.price, 1)
                ) MR;
                
                set sfdf_1 = 'adf';
                set sfdf_2 = true;
        """
                .trimIndent()

        val statements = FlinkSqlHelper.parseMultiStatement(sql)
        var queryStmt = statements.get(0)
        if (queryStmt is QueryStmt) {
            Assert.assertEquals("Orders", queryStmt.inputTables.get(0).tableName)
            Assert.assertEquals(10, queryStmt.limit)
        } else {
            Assert.fail()
        }

        queryStmt = statements.get(1)
        if (queryStmt is QueryStmt) {
            Assert.assertEquals(0, queryStmt.inputTables.size)
        } else {
            Assert.fail()
        }

        queryStmt = statements.get(2)
        if (queryStmt is QueryStmt) {
            Assert.assertEquals(1, queryStmt.inputTables.size)
            Assert.assertEquals("Bid", queryStmt.inputTables.get(0).tableName)
        } else {
            Assert.fail()
        }

        queryStmt = statements.get(3)
        if (queryStmt is QueryStmt) {
            Assert.assertEquals(1, queryStmt.inputTables.size)
            Assert.assertEquals("Bid", queryStmt.inputTables.get(0).tableName)
        } else {
            Assert.fail()
        }

        queryStmt = statements.get(4)
        if (queryStmt is QueryStmt) {
            Assert.assertEquals(1, queryStmt.inputTables.size)
            Assert.assertEquals("Bid", queryStmt.inputTables.get(0).tableName)
        } else {
            Assert.fail()
        }

        queryStmt = statements.get(5)
        if (queryStmt is QueryStmt) {
            Assert.assertEquals(1, queryStmt.inputTables.size)
            Assert.assertEquals("Bid", queryStmt.inputTables.get(0).tableName)
        } else {
            Assert.fail()
        }

        queryStmt = statements.get(6)
        if (queryStmt is QueryStmt) {
            Assert.assertEquals(1, queryStmt.inputTables.size)
            Assert.assertEquals("Bid", queryStmt.inputTables.get(0).tableName)
        } else {
            Assert.fail()
        }

        queryStmt = statements.get(7)
        if (queryStmt is QueryStmt) {
            Assert.assertEquals(1, queryStmt.inputTables.size)
            Assert.assertEquals("ShopSales", queryStmt.inputTables.get(0).tableName)
        } else {
            Assert.fail()
        }

        queryStmt = statements.get(8)
        if (queryStmt is QueryStmt) {
            Assert.assertEquals(1, queryStmt.inputTables.size)
            Assert.assertEquals("Ticker", queryStmt.inputTables.get(0).tableName)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun selectSqlTest1() {
        val sql =
            """
            add jar "flink-connector-jdbc-3.1.1-1.17.jar";

            CREATE TABLE flink_meta_role (
              id INT,
              name STRING,
              code STRING,
              PRIMARY KEY (id) NOT ENFORCED
            ) WITH (
                'connector' = 'jdbc',
                'url' = 'jdbc:mysql://172.18.5.44:3306/superior',
                'table-name' = 'meta_role',
                'username' = 'root',
                'password' = 'root2023'
            );

            set 'execution.checkpointing.checkpoints-after-tasks-finish.enabled' = false;
            SELECT * FROM flink_meta_role;
        """
                .trimIndent()

        val statements = FlinkSqlHelper.parseMultiStatement(sql)
        Assert.assertEquals(4, statements.size)
        val addStmt = statements.get(0)

        if (addStmt is AddResourceStatement) {
            Assert.assertEquals("flink-connector-jdbc-3.1.1-1.17.jar", addStmt.first())
        } else {
            Assert.fail()
        }

        val setStmt = statements.get(2)
        if (setStmt is SetStatement) {
            Assert.assertEquals("execution.checkpointing.checkpoints-after-tasks-finish.enabled", setStmt.key)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun selectSqlTest2() {
        val sql =
            """
            CREATE CATALOG my_catalog WITH (
                'type' = 'jdbc',
                'default-database' = 'demos',
                'username' = 'root',
                'password' = 'root2023',
                'base-url' = 'jdbc:mysql://172.18.5.44:3306'
            );
            
            USE CATALOG my_catalog;
            
            DROP CATALOG IF EXISTS my_catalog
            
            EXPLAIN PLAN FOR select * from my_catalog.demos.orders;
            EXPLAIN ESTIMATED_COST, CHANGELOG_MODE, PLAN_ADVICE, JSON_EXECUTION_PLAN
             select * from my_catalog.demos.orders;
        """
                .trimIndent()

        val statements = FlinkSqlHelper.parseMultiStatement(sql)
        Assert.assertEquals(5, statements.size)

        val createCatalog = statements.get(0)
        if (createCatalog is CreateCatalog) {
            Assert.assertEquals("my_catalog", createCatalog.catalogName)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun multiInsertTest() {
        val sql =
            """
            CREATE TABLE pageviews (
              user_id BIGINT,
              page_id BIGINT,
              viewtime TIMESTAMP,
              proctime AS PROCTIME()
            ) WITH (
              'connector' = 'kafka',
              'topic' = 'pageviews',
              'properties.bootstrap.servers' = '...',
              'format' = 'avro'
            );
            
            CREATE TABLE pageview (
              page_id BIGINT,
              cnt BIGINT
            ) WITH (
              'connector' = 'jdbc',
              'url' = 'jdbc:mysql://localhost:3306/mydatabase',
              'table-name' = 'pageview'
            );
            
            CREATE TABLE uniqueview (
              page_id BIGINT,
              cnt BIGINT
            ) WITH (
              'connector' = 'jdbc',
              'url' = 'jdbc:mysql://localhost:3306/mydatabase',
              'table-name' = 'uniqueview'
            );
            
            EXECUTE STATEMENT SET
            BEGIN
            
            INSERT INTO pageview
            SELECT page_id, count(1)
            FROM pageviews
            GROUP BY page_id;
            
            INSERT INTO uniqueview
            SELECT page_id, count(distinct user_id)
            FROM pageviews
            GROUP BY page_id;
            
           END;
        """
                .trimIndent()

        val statements = FlinkSqlHelper.parseMultiStatement(sql)
        Assert.assertEquals(4, statements.size)

        val statement = statements.get(3)
        if (statement is InsertMultiTable) {
            Assert.assertEquals(2, statement.insertTables.size)
            val insertTable = statement.insertTables.get(0)

            Assert.assertEquals(
                "INSERT INTO pageview\n" + " SELECT page_id, count(1)\n" + " FROM pageviews\n" + " GROUP BY page_id",
                insertTable.getSql()
            )
        } else {
            Assert.fail()
        }
    }
}
