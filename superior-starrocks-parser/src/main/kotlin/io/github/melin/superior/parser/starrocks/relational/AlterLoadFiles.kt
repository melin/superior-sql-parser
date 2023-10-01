package io.github.melin.superior.parser.starrocks.relational

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.Statement
import io.github.melin.superior.common.relational.TableId

data class AlterLoadFiles(
    val schemaName: String?,
    val labelName: String
) : Statement() {
    override val statementType = StatementType.SR_ALTER_LOAD_FILES
    override val privilegeType = PrivilegeType.CREATE
    override val sqlType = SqlType.DML
}