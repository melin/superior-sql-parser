package io.github.melin.superior.parser.starrocks.relational

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.Statement
import io.github.melin.superior.common.relational.TableId

data class CancelRefreshMaterializedView(val tableId: TableId) : Statement() {
    override val statementType = StatementType.CANCEL_REFRESH_MV
    override val privilegeType = PrivilegeType.ADMIN
    override val sqlType = SqlType.DML
}
