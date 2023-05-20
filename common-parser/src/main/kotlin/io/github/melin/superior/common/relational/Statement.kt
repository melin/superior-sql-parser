package io.github.melin.superior.common.relational

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.StatementType
import java.io.Serializable

abstract class Statement: Serializable {
    abstract val statementType: StatementType
    abstract val privilegeType: PrivilegeType
    abstract val sqlType: SqlType
}