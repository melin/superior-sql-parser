## 介绍

基于 antlr4 的多种数据库SQL解析器，获取SQL中元数据，可用于数据平台产品中的多个场景：ddl语句提取元数据、sql 权限校验、表级血缘、sql语法校验等场景。支持spark、flink、gauss、starrocks、Oracle、MYSQL、Postgresql，sqlserver,、db2等
```
<dependency>
    <groupId>io.github.melin.superior</groupId>
    <artifactId>superior-[spark|presto|mysql|oracle|...]-parser</artifactId>
    <version>4.1.0-SNAPSHOT</version>
</dependency>
```

> 4.0.x 支持jdk8, antlr 4.9.3, 4.1.x 支持 jdk11, antlr 4.13.1

## Build
```
mvn clean deploy
```

### API

每个数据库SQL 提供 Helper 类，Helper 方法提供四个方法：
```agsl
1. parseStatement(String sql) // 解析单个完整sql
    a. ddl: 获取ddl 详细信息。例如：数据库执行完ddl以后，解析ddl，获取到相关信息，同步到元数据信息。
    b. dml: 获取sql中使用到的表，用于构建表级血缘，或者校验表权限。
2. parseMultiStatement(String sql) // 解析多个完整sql，支持空格、换行、分号分隔
3. splitSql(String sql) // sql 文本包含多个完整sql，方法用于分隔sql语句，支持空格、换行、分号分隔
4. checkSqlSyntax(String sql) // 验证单个完整sql语法是否正确
5. sqlKeywords() // 获取sql 关键字，主要用于sql editor 关键字提示
```

## Example

```kotlin
// Spark SQL
val sql = "select bzdys, bzhyyh, bzdy, week, round((bzdy-bzdys)*100/bzdys, 2) " +
        "from (select lag(bzdy) over (order by week) bzdys, bzhyyh, bzdy, week " +
        "from (select count(distinct partner_code) bzhyyh, count(1) bzdy, week from tdl_dt2x_table)) limit 111"

val statement = SparkSQLHelper.parseStatement(sql)
if (statement is QueryStmt) {
    Assert.assertEquals(StatementType.SELECT, statement.statementType)
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

val statementDatas = JobTaskHelper.parseStatement(sql)
Assert.assertEquals(8, statementDatas.size)
var statementData = statementDatas.get(7)
var statement = statementData.statement
if (statement is JobData) {
    Assert.assertEquals(StatementType.JOB, statement.statementType)
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
val statement = MySQLHelper.parseStatement(sql)
if(statement is QueryStmt) {
    Assert.assertEquals(StatementType.INSERT_SELECT, statement.statementType)
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

val statement = PostgreSQLHelper.parseStatement(sql)
if (statement is QueryStmt) {
    Assert.assertEquals(StatementType.SELECT, statement.statementType)
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
5. [Sql Server](https://github.com/antlr/grammars-v4/tree/master/sql/tsql) 
6. [StarRocks](https://github.com/StarRocks/starrocks/tree/main/fe/fe-core/src/main/java/com/starrocks/sql/parser)
7. [Oracle](https://github.com/antlr/grammars-v4/tree/master/sql/plsql)
8. [OceanBase](https://github.com/oceanbase/odc/tree/main/libs/ob-sql-parser)
9. [Flink SQL / Flink CDC SQL](https://github.com/DTStack/dt-sql-parser/tree/main/src/grammar/flinksql)

## 相关项目
1. https://gitee.com/melin/bee
2. https://github.com/melin/sqlflow/ 字段血缘解析
3. https://github.com/melin/superior-sql-formatter spark sql 代码格式化
4. https://github.com/melin/datatunnel spark 数据同步工具
5. https://github.com/melin/flink-jobserver 
6. https://github.com/melin/spark-jobserver

