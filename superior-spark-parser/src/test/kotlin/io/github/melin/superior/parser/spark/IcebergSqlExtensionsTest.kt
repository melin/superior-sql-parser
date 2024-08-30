package io.github.melin.superior.parser.spark

import io.github.melin.superior.common.*
import io.github.melin.superior.common.relational.alter.*
import org.junit.Assert
import org.junit.Test

/** Created by libinsong on 2018/1/10. */
class IcebergSqlExtensionsTest {

    @Test
    fun createTagTest() {
        val sql = "ALTER TABLE prod.db.sample CREATE TAG `historical-tag`"

        val statement = SparkSqlHelper.parseStatement(sql)
        if (statement is AlterTable) {
            Assert.assertEquals("sample", statement.tableId.tableName)
            Assert.assertEquals(AlterActionType.CREATE_TAG, statement.firstAction().alterType)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun dropTagTest() {
        val sql = "ALTER TABLE prod.db.sample DROP TAG `historical-tag`"

        val statement = SparkSqlHelper.parseStatement(sql)
        if (statement is AlterTable) {
            Assert.assertEquals("sample", statement.tableId.tableName)
            Assert.assertEquals(AlterActionType.DROP_TAG, statement.firstAction().alterType)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun setIdentifierTest() {
        val sql = "ALTER TABLE prod.db.sample SET IDENTIFIER FIELDS id, data"

        val statement = SparkSqlHelper.parseStatement(sql)
        if (statement is AlterTable) {
            Assert.assertEquals("sample", statement.tableId.tableName)
            val action = statement.firstAction() as AlterSetIdentifierFieldsAction
            Assert.assertEquals(2, action.fields.size)
            Assert.assertEquals(AlterActionType.SET_IDENTIFIER_FIELDS, statement.firstAction().alterType)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun writeSpecTest() {
        val sql = "ALTER TABLE prod.db.sample WRITE DISTRIBUTED BY PARTITION LOCALLY ORDERED BY category, id"

        val statement = SparkSqlHelper.parseStatement(sql)
        if (statement is AlterTable) {
            Assert.assertEquals("sample", statement.tableId.tableName)
            Assert.assertEquals(AlterActionType.SET_WRITE_DISTRIBUTION_AND_ORDERING, statement.firstAction().alterType)
        } else {
            Assert.fail()
        }
    }
}
