package io.github.melin.superior.common.relational.table

data class ColumnRel(
    val columnName: String,
    val typeName: String? = null,
    val comment: String? = null,
    var nullable: Boolean = true,
    var defaultExpr: String? = null,
    var primaryKey: Boolean = false,
    val columnDefType: ColumnDefType = ColumnDefType.COMPUTED,
) {
    var columnLength = 0
    var precision = 0
    var scale = 0

    var expression: String? = null // 计算表达式
    var position: String? = null
    var afterCol: String? = null
    var jsonPath: String? = null // spark streaming sql json path

    var computedExpr: String? = null // 计算列
    var metadataKey: String? = null // 元数据列

    constructor(
        columnName: String,
        typeName: String?,
        comment: String?,
    ) : this(columnName, typeName, comment, true, null)

    constructor(
        columnName: String,
        typeName: String?,
        comment: String?,
        primaryKey: Boolean = false,
        columnDefType: ColumnDefType,
    ) : this(columnName, typeName, comment, true, null, primaryKey, columnDefType)

    constructor(
        columnName: String,
        typeName: String?,
        comment: String?,
        columnDefType: ColumnDefType,
    ) : this(columnName, typeName, comment, true, null, false, columnDefType)
}

enum class ColumnDefType {
    PHYSICAL,
    METADATA,
    COMPUTED,
}
