## 介绍

基于antlr4 statement 解析器，获取相关表元数据，主要用于sql 权限校验等场景。支持spark sql, tidb sql, flink sql, Oracle, MYSQL，Postgresql，sqlserver, db2
```
<dependency>
    <groupId>io.github.melin</groupId>
    <artifactId>superior-[spark|presto|mysql|oracle|...]-parser</artifactId>
    <version>4.0.4</version>
</dependency>
```

## Build

> export GPG_TTY=$(tty)

> mvn clean deploy -Prelease

### API

每个数据库SQL 提供 Helper 类，Helper 方法提供四个方法：
```agsl
1. parseStatement(String sql) // 解析单个完整sql
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
if (statement is TableData) {
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
if(statement is TableData) {
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
if (statement is TableData) {
    Assert.assertEquals(StatementType.SELECT, statement.statementType)
    Assert.assertEquals(2, statement.inputTables.size)
} else {
    Assert.fail()
}

// flink 整库同步paimon
CREATE TABLE IF NOT EXISTS bigdata.paimon_account_01
WITH (
    'primary-keys' = 'id',
    'paimon.bucket' = 2,
    'paimon.changelog-producer' = 'input',
    'paimon.sink.parallelism' = 2
) 
AS TABLE demos.users
OPTIONS(
    'connector' = 'mysql-cdc',
    'hostname' = '172.18.5.44',
    'port' = '3306',
    'username' = 'root',
    'password' = 'root2023',
    'scan.startup.mode' = 'initial'
)

// flink 整库同步starrocks
CREATE DATABASE IF NOT EXISTS bigdata
WITH (
   'connector' = 'starrocks',
   'auto.create' = 'false',
   'url' = 'jdbc:mysql://172.18.5.44:9030',
   'fe-nodes' = '172.18.5.44:18030;172.18.5.45:18030;172.18.5.46:18030',
   'username' = 'root',
   'password' = 'root2023',
   'sink.buffer-flush.interval' = '2s',
   'sink.max-retries' = '5'
) 
AS DATABASE demos INCLUDING table 'orders|users'            
OPTIONS(
   'connector' = 'mysql-cdc',
   'hostname' = '172.18.5.44',
   'port' = '3306',
   'username' = 'root',
   'password' = 'root2023',
   'checkpoint' = '10000',
   'scan.startup.mode' = 'initial'
)
```

## 支持数据库
1. [MySQL](https://github.com/antlr/grammars-v4/tree/master/sql/mysql)
2. [PrestoSQL](https://github.com/prestosql/presto/tree/master/presto-parser/src/main/antlr4/io/prestosql/sql/parser)
3. [PostgreSQL](https://github.com/pgcodekeeper/pgcodekeeper/tree/master/apgdiff/antlr-src)
4. [Spark 3.x](https://github.com/apache/spark/tree/master/sql/catalyst/src/main/antlr4/org/apache/spark/sql/catalyst/parser)
5. [Sql Server](https://github.com/antlr/grammars-v4/tree/master/sql/tsql) 
6. [StarRocks](https://github.com/StarRocks/starrocks/tree/main/fe/fe-core/src/main/java/com/starrocks/sql/parser)
7. [Oracle](https://github.com/antlr/grammars-v4/tree/master/sql/plsql)
8. [Flink SQL / Flink CDC SQL](https://github.com/DTStack/dt-sql-parser/tree/main/src/grammar/flinksql)

## 相关项目
1. https://gitee.com/melin/bee
2. https://github.com/melin/superior-sql-parser
3. https://github.com/melin/superior-sql-formatter
4. https://github.com/melin/superior-sql-autocomplete
5. https://github.com/melin/datatunnel
6. https://github.com/melin/flink-jobserver
6. https://github.com/melin/spark-jobserver

