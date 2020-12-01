### 介绍

基于antlr4 statement 解析器，支持spark sql, tidb sql, flink sql, Spark/flink jar 运行命令解析

###
1. [MySQL](https://github.com/antlr/grammars-v4/tree/master/sql/mysql)
2. [PrestoSQL](https://github.com/prestosql/presto/tree/master/presto-parser/src/main/antlr4/io/prestosql/sql/parser)
3. [PostgreSQL](https://github.com/pgcodekeeper/pgcodekeeper/tree/master/apgdiff/antlr-src)
4. [Spark 3.0](https://github.com/apache/spark/tree/master/sql/catalyst/src/main/antlr4/org/apache/spark/sql/catalyst/parser)
5. [T-SQL](https://github.com/antlr/grammars-v4/tree/master/sql/tsql)
6. [ClickHouse](https://github.com/abyss7/ClickHouse/blob/antlr-grammar/src/Parsers/New)


### Spark Structed Streaming sql
```sql
create stream TABLE tdl_kafka_users (
    user_name "/name" string,
    age	    int,
    email   string
) WITH (
    kafka.bootstrap.servers = 'xxx.xxx.xxx.xxx:9092',
    kafka.group.id = 'dataworker-stream',
    subscribe = 'users',
    includeHeaders = true,
    startingOffsets = 'latest',
    failOnDataLoss = true,
    format='json'
);

insert into bigdata.test_delta_dt select * from tdl_kafka_users;

-- {name:'zhangsan', age: 28, email:'zhangsan@gmail.com'}
```
