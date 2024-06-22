package io.github.melin.superior.common.relational.create

import com.google.common.collect.Lists
import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.TableType
import io.github.melin.superior.common.relational.PartitionType
import io.github.melin.superior.common.relational.TableId
import io.github.melin.superior.common.relational.abs.AbsTableStatement
import io.github.melin.superior.common.relational.table.ColumnRel

data class CreateTable(
    override val tableId: TableId,
    val tableType: TableType,
    val comment: String? = null,
    var lifeCycle: Int? = null,
    var partitionColumnRels: List<ColumnRel>? = null,
    var columnRels: List<ColumnRel>? = null,
    var properties: Map<String, String>? = null,
    var fileFormat: String? = null,
    var ifNotExists: Boolean = false, // 是否存在 if not exists 关键字
    var external: Boolean = false,
    var temporary: Boolean = false,
    var location: String? = null,
    var querySql: String? = null,
    val partitionColumnNames: ArrayList<String> = arrayListOf()
) : AbsTableStatement() { // 是否存在 if exists 关键字
    override val statementType = StatementType.CREATE_TABLE
    override val privilegeType = PrivilegeType.CREATE
    override val sqlType = SqlType.DDL

    // 建表方式：hive & spark. https://spark.apache.org/docs/3.2.0/sql-ref-syntax-ddl-create-table.html
    var replace = false
    var modelType: String = "hive" // 表模型类型
    var partitionType: PartitionType? = null // 分区类型
    var options: Map<String, String>? = null
    var clusteredColumns: List<String> = Lists.newArrayList() // 分桶表分桶列
    var sortedColumns: List<String> = Lists.newArrayList() // 分桶表排序列

    constructor(
        tableId: TableId,
        tableType: TableType,
        comment: String?,
        columnRels: List<ColumnRel>?
    ) : this(
        tableId,
        tableType,
        comment,
        null,
        null,
        columnRels,
        null,
        null,
        false
    )

    constructor(
        tableId: TableId,
        tableType: TableType,
        comment: String?,
        lifeCycle: Int?,
        columnRels: List<ColumnRel>?
    ) : this(
        tableId,
        tableType,
        comment,
        lifeCycle,
        null,
        columnRels,
        null,
        null,
        false
    )

    constructor(
        tableId: TableId,
        tableType: TableType,
        comment: String? = null,
        columnRels: List<ColumnRel>? = null,
        ifNotExists: Boolean,
        properties: Map<String, String>? = null
    ) : this(
        tableId,
        tableType,
        comment,
        null,
        null,
        columnRels,
        properties,
        null,
        ifNotExists
    )
}
