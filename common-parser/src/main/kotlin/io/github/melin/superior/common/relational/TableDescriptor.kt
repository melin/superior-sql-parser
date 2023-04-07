package io.github.melin.superior.common.relational

import com.github.melin.superior.sql.parser.util.StringUtil.innerFullTableName
import io.github.melin.superior.common.*

data class TableDescriptor(
    val catalogName: String?,
    val schemaName: String?,
    val tableName: String,
    val comment: String?,
    var lifeCycle: Int?,
    var partitionColumns: List<Column>?,
    var columns: List<Column>?,
    var properties: Map<String, String>?,
    var fileFormat: String? = null,
    var ifNotExists: Boolean = false, //是否存在 if not exists 关键字
    var ifExists: Boolean = false,
    var external: Boolean = false,
    var temporary: Boolean = false,
    var location: Boolean = false,
    var locationPath: String? = null,
    var querySql: String? = null,
    var tableLineage: TableLineage? = null,
    var partitionColumnNames: List<String>? = null) : Statement() { //是否存在 if exists 关键字

    constructor(catalogName: String?,
                databaseName: String?,
                tableName: String,
                comment: String?,
                lifeCycle: Int?,
                partitionColumns: List<Column>?,
                columns: List<Column>?):
            this(catalogName, databaseName, tableName, comment, lifeCycle, partitionColumns, columns, null, null, false, false, false)

    constructor(catalogName: String?, databaseName: String?, tableName: String):
            this(catalogName, databaseName, tableName, null, null, null, null, null, null, false, false, false)

    constructor(databaseName: String?, tableName: String, comment: String?, columns: List<Column>):
            this(null, databaseName, tableName, comment, null, null, columns, null, null, false, false, false)

    // 建表方式：hive & spark. https://spark.apache.org/docs/3.2.0/sql-ref-syntax-ddl-create-table.html
    var createTableType: String = "hive"
    var token: CommonToken? = null
    var hudiPrimaryKeys: List<String> = listOf()
    var hudiType: String = "COW"
    var preCombineField: String = ""

    fun getFullTableName(): String {
        return innerFullTableName(catalogName, schemaName, tableName)
    }
}