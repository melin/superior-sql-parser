package io.github.melin.superior.common.relational.io

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.Statement

data class LoadTable(
    val schemaName: String?,
    val labelName: String,
    val tableNames: List<String>,
) : Statement() {
    override val statementType = StatementType.LOAD_TABLE
    override val privilegeType = PrivilegeType.CREATE
    override val sqlType = SqlType.DML
}
