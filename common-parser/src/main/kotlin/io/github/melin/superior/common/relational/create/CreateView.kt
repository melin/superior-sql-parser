package io.github.melin.superior.common.relational.create

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.relational.Statement
import io.github.melin.superior.common.relational.TableId

data class CreateView(
    val tableId: TableId,
    var querySql: String? = null,
    val comment: String? = null,
    var ifNotExists: Boolean = false //是否存在 if not exists 关键字
) : Statement() {
    override val privilegeType: PrivilegeType = PrivilegeType.CREATE

    var replace: Boolean = false
    var temporary: Boolean = false
    var global: Boolean = false

    var tableProvider: String? = null
    var properties: Map<String, String> = mapOf()

    var functionNames: HashSet<String> = hashSetOf()

    var inputTables: List<TableId> = listOf()
}
