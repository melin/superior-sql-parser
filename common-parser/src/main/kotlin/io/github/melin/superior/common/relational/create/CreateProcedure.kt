package io.github.melin.superior.common.relational.create

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.relational.Statement

data class CreateProcedure(
    val procedureName: String? = null, override val privilegeType: PrivilegeType
): Statement()