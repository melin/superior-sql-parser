## 介绍

基于antlr4 statement 解析器，支持spark sql, tidb sql, flink sql, Spark/flink jar 运行命令解析

```
<dependency>
    <groupId>io.github.melin</groupId>
    <artifactId>superior-sql-parser</artifactId>
    <version>3.3.1</version>
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

// Spark Jar
val sql = """
    set spark.shuffle.compress=true;set spark.rdd.compress=true;
    set spark.driver.maxResultSize=3g;
    set spark.serializer=org.apache.spark.serializer.KryoSerializer;
    set spark.kryoserializer.buffer.max=1024m;
    set spark.kryoserializer.buffer=256m;
    set spark.network.timeout=300s;
    examples-jar-with-dependencies.jar imei_test.euSaveHBase gaea_offline:account_mobile sh md shda.interest_radar_mobile_score_dt 20180318 /xiaoyong.fu/sh/mobile/loan 400 '%7B%22job_type%22=' --jar
    """;

val statementDatas = JobTaskHelper.getStatementData(sql)
Assert.assertEquals(8, statementDatas.size)

var statementData = statementDatas.get(7)
var statement = statementData.statement
if (statement is JobData) {
    Assert.assertEquals(StatementType.JOB, statementData.type)
    Assert.assertEquals("createHfile-1.2-SNAPSHOT-jar-with-dependencies.jar", statement.resourceName)
    Assert.assertEquals("imei_test.euSaveHBase", statement.className)
    Assert.assertEquals("/xiaoyong.fu/sh/mobile/loan", statement.params?.get(5))
    Assert.assertEquals("400", statement.params?.get(6))
    Assert.assertEquals("%7B%22job_type%22=", statement.params?.get(7))
    Assert.assertEquals("--jar", statement.params?.get(8))
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

// Postgres
val sql = """
    select a.* from datacompute1.datacompute.dc_job a left join datacompute1.datacompute.dc_job_scheduler b on a.id=b.job_id
""".trimIndent()

val statementData = PostgreSQLHelper.getStatementData(sql)
val statement = statementData.statement
if (statement is TableData) {
    Assert.assertEquals(StatementType.SELECT, statementData.type)
    Assert.assertEquals(2, statement.inputTables.size)
} else {
    Assert.fail()
}
```

## 支持数据库
1. [MySQL](https://github.com/antlr/grammars-v4/tree/master/sql/mysql)
2. [PrestoSQL](https://github.com/prestosql/presto/tree/master/presto-parser/src/main/antlr4/io/prestosql/sql/parser)
3. [PostgreSQL](https://github.com/pgcodekeeper/pgcodekeeper/tree/master/apgdiff/antlr-src)
4. [Spark 3.x](https://github.com/apache/spark/tree/master/sql/catalyst/src/main/antlr4/org/apache/spark/sql/catalyst/parser)
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

