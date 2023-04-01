package io.github.melin.superior.common.relational

import com.github.melin.superior.sql.parser.util.StringUtil
import io.github.melin.superior.common.Statement

data class ViewDescriptor(
    val catalogName: String?,
    val schemaName: String?,
    val tableName: String,
    var querySql: String? = null,
    val comment: String? = null,
    var ifNotExists: Boolean = false, //是否存在 if not exists 关键字
    var ifExists: Boolean = false) : Statement() { //是否存在 if exists 关键字

    var functionNames: HashSet<String> = HashSet()

    fun getFullTableName(): String {
        return StringUtil.innerFullTableName(catalogName, schemaName, tableName)
    }
}
