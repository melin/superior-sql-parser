package io.github.melin.superior.common.relational.ddl.view

import com.github.melin.superior.sql.parser.util.StringUtil
import io.github.melin.superior.common.Statement

data class CreateView(
    val catalogName: String?,
    val schemaName: String?,
    val tableName: String,
    var querySql: String? = null,
    val comment: String? = null,
    var ifNotExists: Boolean = false //是否存在 if not exists 关键字
) : Statement() {

    var replace: Boolean = false
    var temporary: Boolean = false
    var global: Boolean = false

    var tableProvider: String? = null
    var properties: Map<String, String> = mapOf()

    var functionNames: HashSet<String> = HashSet()

    fun getFullTableName(): String {
        return StringUtil.innerFullTableName(catalogName, schemaName, tableName)
    }
}
