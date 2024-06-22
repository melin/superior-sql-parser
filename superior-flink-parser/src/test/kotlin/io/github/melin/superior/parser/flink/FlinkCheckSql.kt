package io.github.melin.superior.parser.flink

import org.junit.Test

class FlinkCheckSql {

    @Test
    fun selectSqlTest() {
        val sql =
            """
            create TABLE test (
              name VARCHAR(12)
            ) 
        """
                .trimIndent()

        FlinkSqlHelper.checkSqlSyntax(sql)
    }
}
