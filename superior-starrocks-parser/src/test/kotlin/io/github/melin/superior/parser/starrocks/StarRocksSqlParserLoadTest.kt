package io.github.melin.superior.parser.starrocks

import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.TableId
import io.github.melin.superior.common.relational.dml.QueryStmt
import io.github.melin.superior.parser.starrocks.relational.*
import org.junit.Assert
import org.junit.Test

class StarRocksSqlParserLoadTest {

    @Test
    fun createRoutineLoadTest() {
        val sql = """
            CREATE ROUTINE LOAD example_db.example_tbl1_ordertest1 ON example_tbl1
            COLUMNS TERMINATED BY ",",
            COLUMNS (order_id, pay_dt, customer_name, nationality, temp_gender, price)
            PROPERTIES (
                "desired_concurrent_number" = "5"
            )
            FROM KAFKA (
                "kafka_broker_list" = "172.18.5.44:9092",
                "kafka_topic" = "ordertest1",
                "property.kafka_default_offsets" = "OFFSET_BEGINNING"
            );
        """.trimIndent()

        val statement = StarRocksHelper.parseStatement(sql)

        if (statement is CreateRoutineLoad) {
            Assert.assertEquals(StatementType.SR_CREATE_ROUTINE_LOAD, statement.statementType)
            Assert.assertNull(statement.catalogName)
            Assert.assertEquals("example_db", statement.schemaName)
            Assert.assertEquals("example_tbl1_ordertest1", statement.jobName)
            Assert.assertEquals(TableId("example_tbl1"), statement.tableId)
            Assert.assertEquals("KAFKA", statement.source)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun alterRoutineLoadTest() {
        val sql = """
            ALTER ROUTINE LOAD FOR example_tbl2_ordertest2
            PROPERTIES (
                "desired_concurrent_number" = "6"
            )
            FROM kafka (
                "kafka_partitions" = "0,1,2,3,4,5,6,7",
                "kafka_offsets" = "OFFSET_BEGINNING,OFFSET_BEGINNING,OFFSET_BEGINNING,OFFSET_BEGINNING,OFFSET_END,OFFSET_END,OFFSET_END,OFFSET_END"
            );
        """.trimIndent()

        val statement = StarRocksHelper.parseStatement(sql)

        if (statement is AlterRoutineLoad) {
            Assert.assertEquals(StatementType.SR_ALTER_ROUTINE_LOAD, statement.statementType)
            Assert.assertNull(statement.catalogName)
            Assert.assertNull(statement.schemaName)
            Assert.assertEquals("example_tbl2_ordertest2", statement.jobName)
            Assert.assertEquals("kafka", statement.source)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun pauseRoutineLoadTest() {
        val sql = """
            PAUSE ROUTINE LOAD FOR example_tbl2_ordertest2;
        """.trimIndent()

        val statement = StarRocksHelper.parseStatement(sql)

        if (statement is PauseRoutineLoad) {
            Assert.assertEquals(StatementType.SR_PAUSE_ROUTINE_LOAD, statement.statementType)
            Assert.assertNull(statement.catalogName)
            Assert.assertNull(statement.schemaName)
            Assert.assertEquals("example_tbl2_ordertest2", statement.jobName)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun resumeRoutineLoadTest() {
        val sql = """
            RESUME ROUTINE LOAD FOR example_tbl2_ordertest2;
        """.trimIndent()

        val statement = StarRocksHelper.parseStatement(sql)

        if (statement is ResumeRoutineLoad) {
            Assert.assertEquals(StatementType.SR_RESUME_ROUTINE_LOAD, statement.statementType)
            Assert.assertNull(statement.catalogName)
            Assert.assertNull(statement.schemaName)
            Assert.assertEquals("example_tbl2_ordertest2", statement.jobName)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun stopRoutineLoadTest() {
        val sql = """
            STOP ROUTINE LOAD FOR example_tbl2_ordertest2;
        """.trimIndent()

        val statement = StarRocksHelper.parseStatement(sql)

        if (statement is StopRoutineLoad) {
            Assert.assertEquals(StatementType.SR_STOP_ROUTINE_LOAD, statement.statementType)
            Assert.assertNull(statement.catalogName)
            Assert.assertNull(statement.schemaName)
            Assert.assertEquals("example_tbl2_ordertest2", statement.jobName)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun createLoadTest() {
        val sql = """
            LOAD LABEL test_db.label_brokerload_multiplefile_multipletable (
                DATA INFILE("hdfs://<hdfs_host>:<hdfs_port>/user/starrocks/file1.csv")
                INTO TABLE table1
                COLUMNS TERMINATED BY ","
                (id, name, score),
                DATA INFILE("hdfs://<hdfs_host>:<hdfs_port>/user/starrocks/file2.csv")
                INTO TABLE table2
                COLUMNS TERMINATED BY ","
                (id, name, score)
            ) 
            PROPERTIES (
                "timeout" = "3600"
            );
        """.trimIndent()

        val statement = StarRocksHelper.parseStatement(sql)

        if (statement is LoadFiles) {
            Assert.assertEquals(StatementType.SR_LOAD_FILES, statement.statementType)
            Assert.assertEquals("test_db", statement.schemaName)
            Assert.assertEquals("label_brokerload_multiplefile_multipletable", statement.labelName)
            Assert.assertEquals(2, statement.tableNames.size)
            Assert.assertEquals("table1", statement.tableNames.get(0))
        } else {
            Assert.fail()
        }
    }

    @Test
    fun cancelLoadTest() {
        val sql = """
            CANCEL LOAD FROM db1 WHERE LABEL = "label";
        """.trimIndent()

        val statement = StarRocksHelper.parseStatement(sql)

        if (statement is CancelLoadFiles) {
            Assert.assertEquals(StatementType.SR_CANCEL_LOAD_FILES, statement.statementType)
            Assert.assertEquals("db1", statement.schemaName)
            Assert.assertEquals("label", statement.labelName)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun alterLoadTest() {
        val sql = """
            ALTER LOAD FOR test_db.label1 properties (
                'priority'='HIGHEST'
            );
        """.trimIndent()

        val statement = StarRocksHelper.parseStatement(sql)

        if (statement is AlterLoadFiles) {
            Assert.assertEquals(StatementType.SR_ALTER_LOAD_FILES, statement.statementType)
            Assert.assertEquals("test_db", statement.schemaName)
            Assert.assertEquals("label1", statement.labelName)
        } else {
            Assert.fail()
        }
    }
}