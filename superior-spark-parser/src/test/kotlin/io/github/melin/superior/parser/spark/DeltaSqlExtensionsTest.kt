package io.github.melin.superior.parser.spark

import io.github.melin.superior.common.*
import io.github.melin.superior.common.relational.common.DescDeltaDetail
import io.github.melin.superior.common.relational.common.DescDeltaHistory
import io.github.melin.superior.common.relational.delta.OptimizeTable
import io.github.melin.superior.common.relational.delta.VacuumTable
import org.junit.Assert
import org.junit.Test

/** Created by libinsong on 2018/1/10. */
class DeltaSqlExtensionsTest {

    @Test
    fun vacuumTableTest() {
        val sql =
            """
            VACUUM eventsTable DRY RUN;
            VACUUM eventsTable USING INVENTORY inventoryTable
            VACUUM eventsTable USING INVENTORY (select * from inventoryTable);
        """
                .trimIndent()

        val statements = SparkSqlHelper.parseMultiStatement(sql)
        var vacuumTable = statements.first() as VacuumTable
        Assert.assertEquals(StatementType.VACUUM_TABLE, vacuumTable.statementType)
        Assert.assertEquals("eventsTable", vacuumTable.tableId.tableName)

        vacuumTable = statements.get(1) as VacuumTable
        Assert.assertEquals("eventsTable", vacuumTable.tableId.tableName)

        vacuumTable = statements.last() as VacuumTable
        Assert.assertEquals("eventsTable", vacuumTable.tableId.tableName)
    }

    @Test
    fun optimizeTableTest() {
        val sql =
            """
            OPTIMIZE delta_table_name WHERE date >= '2017-01-01'
            OPTIMIZE delta_table_name ZORDER BY (eventType)
        """
                .trimIndent()

        val statements = SparkSqlHelper.parseMultiStatement(sql)
        var optimizeTable = statements.first() as OptimizeTable
        Assert.assertEquals(StatementType.OPTIMIZE_TABLE, optimizeTable.statementType)
        Assert.assertEquals("delta_table_name", optimizeTable.tableId.tableName)

        optimizeTable = statements.last() as OptimizeTable
        Assert.assertEquals("delta_table_name", optimizeTable.tableId.tableName)
    }

    @Test
    fun descDeltaDetailTest() {
        val sql =
            """
            DESCRIBE DETAIL eventsTable
        """
                .trimIndent()

        val statement = SparkSqlHelper.parseStatement(sql)
        if (statement is DescDeltaDetail) {
            Assert.assertEquals(StatementType.DESC_DELTA_DETAIL, statement.statementType)
            Assert.assertEquals("eventsTable", statement.tableId.tableName)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun descDeltaHistoryTest() {
        val sql =
            """
            DESCRIBE HISTORY eventsTable
        """
                .trimIndent()

        val statement = SparkSqlHelper.parseStatement(sql)
        if (statement is DescDeltaHistory) {
            Assert.assertEquals(StatementType.DESC_DELTA_HISTORY, statement.statementType)
            Assert.assertEquals("eventsTable", statement.tableId.tableName)
        } else {
            Assert.fail()
        }
    }
}
