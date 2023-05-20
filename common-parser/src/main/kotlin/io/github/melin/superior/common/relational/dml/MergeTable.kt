package io.github.melin.superior.common.relational.dml

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.Statement
import io.github.melin.superior.common.relational.TableId

data class MergeTable(
    var targetTable: TableId,
    var inputTables: List<TableId> = listOf()
): Statement() {
    override val statementType = StatementType.MERGE
    override val privilegeType = PrivilegeType.WRITE
    override val sqlType = SqlType.DML
}