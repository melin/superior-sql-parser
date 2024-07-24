package io.github.melin.superior.common.relational.dml

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.Statement

data class InsertFiles(
    val mode: InsertMode,
    val queryStmt: QueryStmt,
    var properties: Map<String, String>,
) : Statement() {
    override val statementType = StatementType.INSERT
    override val privilegeType = PrivilegeType.WRITE
    override val sqlType = SqlType.DML
}
