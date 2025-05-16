package io.github.melin.superior.parser.flink

import org.junit.Test

class FlinkCheckSql {

    @Test
    fun selectSqlTest() {
        val sql =
            """
            CREATE TABLE test (
              name VARCHAR(12)
            ) with(key = 'name')
        """
                .trimIndent()

        FlinkSqlHelper.checkSqlSyntax(sql)
    }
}
