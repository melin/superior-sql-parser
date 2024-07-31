package io.github.melin.superior.parser.postgre.relational

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.TableId
import io.github.melin.superior.common.relational.abs.AbsTableStatement

data class CreatePartitionTable(override val tableId: TableId, val partitionTableId: TableId) :
    AbsTableStatement() { // 是否存在 if exists 关键字
    override val statementType = StatementType.CREATE_TABLE
    override val privilegeType = PrivilegeType.CREATE
    override val sqlType = SqlType.DDL
}
