package io.github.melin.superior.common.relational.alter

import io.github.melin.superior.common.AlterActionType
import io.github.melin.superior.common.PrivilegeType

abstract class AlterAction(val privilegeType: PrivilegeType = PrivilegeType.ALTER) {
    abstract val alterType: AlterActionType
}