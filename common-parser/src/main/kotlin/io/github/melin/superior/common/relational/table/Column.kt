package io.github.melin.superior.common.relational.table

data class Column(
    val name: String,
    val type: String? = null,
    val comment: String? = null,
    val nullable: Boolean = false,
    var defaultExpr: String? = null // 默认值表达式
) {
    var expression: String? = null // 计算表达式
    var isPk: Boolean = false
    var position: String? = null
    var afterCol: String? = null
}
