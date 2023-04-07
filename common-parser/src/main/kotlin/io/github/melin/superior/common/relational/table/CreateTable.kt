package io.github.melin.superior.common.relational.table

import io.github.melin.superior.common.Column
import io.github.melin.superior.common.Statement
import io.github.melin.superior.common.relational.TableId
import io.github.melin.superior.common.relational.TableLineage

data class CreateTable(
    val tableId: TableId,
    val comment: String?,
    var lifeCycle: Int?,
    var partitionColumns: List<Column>?,
    var columns: List<Column>?,
    var properties: Map<String, String>?,
    var fileFormat: String? = null,
    var ifNotExists: Boolean = false, //是否存在 if not exists 关键字
    var external: Boolean = false,
    var temporary: Boolean = false,
    var location: String? = null,
    var querySql: String? = null,
    var tableLineage: TableLineage? = null,
    var partitionColumnNames: List<String>? = null) : Statement() { //是否存在 if exists 关键字

    // 建表方式：hive & spark. https://spark.apache.org/docs/3.2.0/sql-ref-syntax-ddl-create-table.html
    var replace = false
    var createTableType: String = "hive"

    constructor(tableId: TableId, comment: String?, columns: List<Column>?):
            this(tableId, comment, null, null, columns, null, null, false)
}