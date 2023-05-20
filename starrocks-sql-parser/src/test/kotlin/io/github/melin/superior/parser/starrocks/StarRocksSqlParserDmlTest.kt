package io.github.melin.superior.parser.starrocks

import io.github.melin.superior.common.relational.TableId
import io.github.melin.superior.common.relational.create.CreateTable
import io.github.melin.superior.common.relational.dml.QueryStmt
import org.junit.Assert
import org.junit.Test

class StarRocksSqlParserDmlTest {

    @Test
    fun selectTest0() {
        val sql = """
            SELECT * FROM hive1.hive_db.hive_table limit 1 
        """.trimIndent()

        val statement = StarRocksHelper.getStatementData(sql)
        
        if (statement is QueryStmt) {
            Assert.assertEquals(1, statement.inputTables.size)
            Assert.assertEquals(TableId("hive1", "hive_db", "hive_table"),
                statement.inputTables.get(0))
        } else {
            Assert.fail()
        }
    }

    @Test
    fun selectTest1() {
        val sql = """
            with t1 as (select * from bigdata.users),
                t2 as (select 2)
            select * from t1 union all select * from t2;
        """.trimIndent()

        val statement = StarRocksHelper.getStatementData(sql)

        if (statement is QueryStmt) {
            Assert.assertEquals(1, statement.inputTables.size)
            Assert.assertEquals(TableId("bigdata", "users"),
                statement.inputTables.get(0))
        } else {
            Assert.fail()
        }
    }
}