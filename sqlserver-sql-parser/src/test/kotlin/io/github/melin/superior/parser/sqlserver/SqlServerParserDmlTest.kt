package io.github.melin.superior.parser.sqlserver

import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.dml.QueryStmt
import org.junit.Assert
import org.junit.Test

/**
 * Created by libinsong on 2020/6/30 11:05 上午
 */
class SqlServerParserDmlTest {

    @Test
    fun queryTest0() {
        val sql = """
            SELECT product_name, list_price
            FROM production.products
            ORDER BY list_price, product_name 
            OFFSET 20 ROWS 
            FETCH NEXT 10 ROWS ONLY;
        """.trimIndent()

        val statement = SqlServerHelper.getStatementData(sql)
        if (statement is QueryStmt) {
            Assert.assertEquals(StatementType.SELECT, statement.statementType)
            Assert.assertEquals(1, statement.inputTables.size)
            Assert.assertEquals(20, statement.offset)
            Assert.assertEquals(10, statement.limit)
        } else {
            Assert.fail()
        }
    }

    @Test
    fun queryTest1() {
        val sql = """
            WITH Sales_CTE (SalesPersonID, TotalSales, SalesYear)
            AS (
                SELECT SalesPersonID, SUM(TotalDue) AS TotalSales, YEAR(OrderDate) AS SalesYear
                FROM Sales.SalesOrderHeader
                WHERE SalesPersonID IS NOT NULL
                   GROUP BY SalesPersonID, YEAR(OrderDate)
            ),
            Sales_Quota_CTE (BusinessEntityID, SalesQuota, SalesQuotaYear)
            AS (
               SELECT BusinessEntityID, SUM(SalesQuota)AS SalesQuota, YEAR(QuotaDate) AS SalesQuotaYear
               FROM Sales.SalesPersonQuotaHistory
               GROUP BY BusinessEntityID, YEAR(QuotaDate)
            )
            SELECT SalesPersonID
              , SalesYear
              , FORMAT(TotalSales,'C','en-us') AS TotalSales
              , SalesQuotaYear
              , FORMAT (SalesQuota,'C','en-us') AS SalesQuota
              , FORMAT (TotalSales -SalesQuota, 'C','en-us') AS Amt_Above_or_Below_Quota
            FROM Sales_CTE
            JOIN Sales_Quota_CTE ON Sales_Quota_CTE.BusinessEntityID = Sales_CTE.SalesPersonID
                AND Sales_CTE.SalesYear = Sales_Quota_CTE.SalesQuotaYear
            ORDER BY SalesPersonID, SalesYear
        """.trimIndent()

        val statement = SqlServerHelper.getStatementData(sql)
        if (statement is QueryStmt) {
            Assert.assertEquals(StatementType.SELECT, statement.statementType)
            Assert.assertEquals(2, statement.inputTables.size)
        } else {
            Assert.fail()
        }
    }
}
