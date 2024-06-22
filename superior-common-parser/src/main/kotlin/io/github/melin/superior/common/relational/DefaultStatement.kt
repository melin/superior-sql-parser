package io.github.melin.superior.common.relational

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.StatementType

class DefaultStatement(override val statementType: StatementType) :
    Statement() {
    override val privilegeType = PrivilegeType.OTHER
    override val sqlType = SqlType.DML
}
