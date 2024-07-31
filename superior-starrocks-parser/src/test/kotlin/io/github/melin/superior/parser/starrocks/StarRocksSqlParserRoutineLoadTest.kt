package io.github.melin.superior.parser.starrocks

import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.TableId
import io.github.melin.superior.parser.starrocks.relational.*
import org.junit.Assert
import org.junit.Test

class StarRocksSqlParserRoutineLoadTest {

    @Test
    fun createRoutineLoadTest() {
        val sql =
            """
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
        """
                .trimIndent()

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
        val sql =
            """
            ALTER ROUTINE LOAD FOR example_tbl2_ordertest2
            PROPERTIES (
                "desired_concurrent_number" = "6"
            )
            FROM kafka (
                "kafka_partitions" = "0,1,2,3,4,5,6,7",
                "kafka_offsets" = "OFFSET_BEGINNING,OFFSET_BEGINNING,OFFSET_BEGINNING,OFFSET_BEGINNING,OFFSET_END,OFFSET_END,OFFSET_END,OFFSET_END"
            );
        """
                .trimIndent()

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
        val sql =
            """
            PAUSE ROUTINE LOAD FOR example_tbl2_ordertest2;
        """
                .trimIndent()

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
        val sql =
            """
            RESUME ROUTINE LOAD FOR example_tbl2_ordertest2;
        """
                .trimIndent()

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
        val sql =
            """
            STOP ROUTINE LOAD FOR example_tbl2_ordertest2;
        """
                .trimIndent()

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
}
