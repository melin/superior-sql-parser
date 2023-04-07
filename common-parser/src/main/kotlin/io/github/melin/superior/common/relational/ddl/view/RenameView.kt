package io.github.melin.superior.common.relational.ddl.view

import com.github.melin.superior.sql.parser.util.StringUtil
import io.github.melin.superior.common.Statement

data class RenameView(
    val catalogName: String?,
    val databaseName: String?,
    val oldName: String,
    val newName: String) : Statement() {

    fun getFullTableName(): String {
        return StringUtil.innerFullTableName(catalogName, databaseName, oldName)
    }
}