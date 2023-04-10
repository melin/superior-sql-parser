package io.github.melin.superior.common.relational.table

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.relational.Statement
import io.github.melin.superior.common.relational.TableId

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
    var partitionColumnNames: List<String>? = null
) : Statement() { //是否存在 if exists 关键字
    override val privilegeType: PrivilegeType = PrivilegeType.CREATE

    // 建表方式：hive & spark. https://spark.apache.org/docs/3.2.0/sql-ref-syntax-ddl-create-table.html
    var replace = false
    var createTableType: String = "hive"

    constructor(tableId: TableId, comment: String?, columns: List<Column>?):
            this(tableId, comment, null, null, columns, null, null, false)
}