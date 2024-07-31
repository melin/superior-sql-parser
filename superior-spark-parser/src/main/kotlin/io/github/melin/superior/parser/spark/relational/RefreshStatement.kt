package io.github.melin.superior.parser.spark.relational

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.TableId
import io.github.melin.superior.common.relational.abs.AbsTableStatement

data class RefreshStatement(override val tableId: TableId) : AbsTableStatement() {
    override val statementType = StatementType.REFRESH_TABLE
    override val privilegeType = PrivilegeType.OTHER
    override val sqlType = SqlType.TCL
}
