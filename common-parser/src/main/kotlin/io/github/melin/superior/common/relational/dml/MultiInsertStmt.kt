package io.github.melin.superior.common.relational.dml

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.relational.Statement
import io.github.melin.superior.common.relational.TableId

data class MultiInsertStmt(
    var inputTables: List<TableId>,
    val outputTables: List<TableId>,
    var functionNames: HashSet<String>
): Statement() {
    override val privilegeType: PrivilegeType = PrivilegeType.WRITE
}