package io.github.melin.superior.parser.sqlserver

import io.github.melin.superior.common.relational.create.CreateDatabase
import io.github.melin.superior.common.relational.drop.DropDatabase
import org.junit.Assert
import org.junit.Test

/**
 * Created by libinsong on 2020/6/30 11:05 上午
 */
class SqlServerParserDdlTest {
    @Test
    fun createDatabaseTest() {
        val sql = """
            USE master;
            GO
                CREATE DATABASE Sales
                ON
                ( NAME = Sales_dat,
                    FILENAME = 'C:\Program Files\Microsoft SQL Server\MSSQL13.MSSQLSERVER\MSSQL\DATA\saledat.mdf',
                    SIZE = 10,
                    MAXSIZE = 50,
                    FILEGROWTH = 5 )
                LOG ON
                ( NAME = Sales_log,
                    FILENAME = 'C:\Program Files\Microsoft SQL Server\MSSQL13.MSSQLSERVER\MSSQL\DATA\salelog.ldf',
                    SIZE = 5MB,
                    MAXSIZE = 25MB,
                    FILEGROWTH = 5MB ) ;
            GO
                DROP DATABASE Sales, demos;  
            GO 
        """.trimIndent()

        val statements = SqlServerHelper.parseMultiStatement(sql)

        val createDatabse = statements.get(1)
        val dropDatabase = statements.get(2)
        if (createDatabse is CreateDatabase) {
            Assert.assertEquals("Sales", createDatabse.databaseName)
        } else {
            Assert.fail()
        }

        if (dropDatabase is DropDatabase) {
            Assert.assertEquals("Sales", dropDatabase.databaseNames.get(0))
            Assert.assertEquals(2, dropDatabase.databaseNames.size)
        } else {
            Assert.fail()
        }
    }
}
