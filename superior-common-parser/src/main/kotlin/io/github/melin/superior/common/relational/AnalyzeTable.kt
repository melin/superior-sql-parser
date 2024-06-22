package io.github.melin.superior.common.relational

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.StatementType

data class AnalyzeTable(val tableIds: List<TableId>) : Statement() {
    override val statementType = StatementType.ANALYZE_TABLE
    override val privilegeType = PrivilegeType.READ
    override val sqlType = SqlType.DML
}
