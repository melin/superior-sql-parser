package io.github.melin.superior.common.relational.create

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.TableId
import io.github.melin.superior.common.relational.abs.AbsTableStatement

data class CreateTableLike(
    val oldTableId: TableId,
    override val tableId: TableId,
    var ifNotExists: Boolean = false,
    var external: Boolean = false,
    var temporary: Boolean = false
) : AbsTableStatement() {
    override val statementType = StatementType.CREATE_TABLE_AS_LIKE
    override val privilegeType = PrivilegeType.CREATE
    override val sqlType = SqlType.DDL
}
