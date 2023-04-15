package io.github.melin.superior.common.relational.dml

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.relational.Statement
import io.github.melin.superior.common.relational.TableId

data class MergeIntoTable(
    var sourceTables: java.util.HashSet<TableId> = HashSet(),
    var targetTable: TableId
): Statement() {
    override val privilegeType: PrivilegeType = PrivilegeType.WRITE
}