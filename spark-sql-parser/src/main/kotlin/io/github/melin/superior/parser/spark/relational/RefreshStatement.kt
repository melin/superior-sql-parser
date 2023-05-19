package io.github.melin.superior.parser.spark.relational

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.relational.AbsTableStatement
import io.github.melin.superior.common.relational.TableId

data class RefreshStatement(
    override val tableId: TableId
) : AbsTableStatement() {
    override val privilegeType: PrivilegeType = PrivilegeType.OTHER
    override val sqlType: SqlType = SqlType.TCL
}