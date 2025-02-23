package io.github.melin.superior.common.relational.dml

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.Statement

data class InsertMultiTable(val insertTables: List<InsertTable>) : Statement() {
    override val statementType = StatementType.UNKOWN
    override val privilegeType = PrivilegeType.OTHER
    override val sqlType = SqlType.DML
}
