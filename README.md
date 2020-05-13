### 介绍

基于antlr4 statement 解析器，支持spark sql, tidb sql, flink sql, Spark/flink jar 运行命令解析，主要目的: 
1. 解析Hive、tidb、clickHouse的ddl sql，获取元数据信息统一管理，方便平台层查询表信息
2. 解析各种sql引擎，获取表，列信息，统一权限管理
3. 扩展Spark，Flink SQL语法

##### build

mvn antlr4:antlr4
mvn clean package

