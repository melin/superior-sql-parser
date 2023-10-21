package io.github.melin.superior.common.relational.common

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.Statement
import io.github.melin.superior.common.relational.TableId

data class RefreshMaterializedView (
    val tableId: TableId,
    val force: Boolean = false,
    val mode: String = "Async",
    val partitionStart: String? = null,
    val partitionEnd: String? = null,
): Statement() {
    override val statementType = StatementType.REFRESH_MV
    override val privilegeType = PrivilegeType.ADMIN
    override val sqlType = SqlType.DML
}