package io.github.melin.superior.common.relational.table

data class ColumnRel(
    val name: String,
    val type: String? = null,
    val comment: String? = null,
    val nullable: Boolean = true,
    var defaultExpr: String? = null // 默认值表达式
) {
    var expression: String? = null // 计算表达式
    var isPk: Boolean = false
    var position: String? = null
    var afterCol: String? = null
    var jsonPath: String? = null

    constructor(name: String, type: String?, comment: String?): this(name, type, comment, true, null)
}
