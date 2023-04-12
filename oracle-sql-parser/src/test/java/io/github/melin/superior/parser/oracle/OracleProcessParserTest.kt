package io.github.melin.superior.parser.oracle

import io.github.melin.superior.common.relational.create.CreateNamespace
import io.github.melin.superior.common.relational.namespace.Namespace
import org.junit.Assert
import org.junit.Test

class OracleProcessParserTest {
    @Test
    fun processTest0() {
        val sql = """
            DECLARE
                CURSOR C_ORDERS IS
                    SELECT CUSTOMER_NAME, PRICE FROM ORDERS;
            BEGIN
                FOR ORD IN C_ORDERS
                    LOOP
                        dbms_output.put_line( ORD.CUSTOMER_NAME || ': ${'$'}' ||  ORD.PRICE );
                    END LOOP;
            END;
        """.trimIndent()

        val statementData = OracleSqlHelper.getStatementData(sql)
        val statement = statementData.statement
        if (statement is CreateNamespace) {
            Assert.assertEquals("bigdata", statement.namespaceId.schemaName)
            Assert.assertEquals(Namespace.DATABASE, statement.namespace)
        } else {
            Assert.fail()
        }
    }
}