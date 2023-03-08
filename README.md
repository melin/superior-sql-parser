## 介绍

基于antlr4 statement 解析器，支持spark sql, tidb sql, flink sql, Spark/flink jar 运行命令解析

```
<dependency>
    <groupId>io.github.melin</groupId>
    <artifactId>superior-sql-parser</artifactId>
    <version>3.3.0.7</version>
</dependency>
```

## Build

> mvn clean deploy -Prelease

## Example

```kotlin
// Spark SQL
val sql = "select bzdys, bzhyyh, bzdy, week, round((bzdy-bzdys)*100/bzdys, 2) " +
        "from (select lag(bzdy) over (order by week) bzdys, bzhyyh, bzdy, week " +
        "from (select count(distinct partner_code) bzhyyh, count(1) bzdy, week from tdl_dt2x_table)) limit 111"

val statementData = SparkSQLHelper.getStatementData(sql)
val statement = statementData.statement
if (statement is TableData) {
    Assert.assertEquals(StatementType.SELECT, statementData.type)
    Assert.assertEquals(1, statement.inputTables.size)
    Assert.assertEquals("tdl_dt2x_table", statement.inputTables.get(0).tableName)
    Assert.assertEquals(111, statement.limit)
} else {
    Assert.fail()
}

// MySQL
val sql = "insert into bigdata.user select * from users a left outer join address b on a.address_id = b.id"
val statementData = MySQLHelper.getStatementData(sql)
val statement = statementData.statement
if(statement is TableData) {
    Assert.assertEquals(StatementType.INSERT_SELECT, statementData.type)
    Assert.assertEquals("bigdata", statement.outpuTables.get(0).databaseName)
    Assert.assertEquals("user", statement.outpuTables.get(0).tableName)
    Assert.assertEquals(2, statement.inputTables.size)
} else {
    Assert.fail()
}
```

## 支持数据库
1. [MySQL](https://github.com/antlr/grammars-v4/tree/master/sql/mysql)
2. [PrestoSQL](https://github.com/prestosql/presto/tree/master/presto-parser/src/main/antlr4/io/prestosql/sql/parser)
3. [PostgreSQL](https://github.com/pgcodekeeper/pgcodekeeper/tree/master/apgdiff/antlr-src)
4. [Spark 3.0](https://github.com/apache/spark/tree/master/sql/catalyst/src/main/antlr4/org/apache/spark/sql/catalyst/parser)
5. [T-SQL](https://github.com/antlr/grammars-v4/tree/master/sql/tsql) 未开发
6. [StarRocks](https://github.com/StarRocks/starrocks/tree/main/fe/fe-core/src/main/java/com/starrocks/sql/parser) 未开发
7. [Doris](https://github.com/apache/doris/tree/master/fe/fe-core/src/main/antlr4/org/apache/doris) 未开发
8. [ClickHouse](https://github.com/ClickHouse/ClickHouse/tree/master/utils/antlr) 未开发
9. [Oracle](https://github.com/antlr/grammars-v4/tree/master/sql/plsql) 未开发

## 相关项目
1. https://gitee.com/melin/bee
2. https://github.com/melin/superior-sql-parser
3. https://github.com/melin/superior-sql-formatter
4. https://github.com/melin/superior-sql-autocomplete
5. https://github.com/melin/datatunnel
6. https://github.com/melin/flink-jobserver
6. https://github.com/melin/spark-jobserver

