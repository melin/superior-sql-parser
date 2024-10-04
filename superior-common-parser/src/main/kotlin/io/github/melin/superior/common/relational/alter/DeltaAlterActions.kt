package io.github.melin.superior.common.relational.alter

import io.github.melin.superior.common.AlterActionType

class AlterAddConstraintAction() : AlterAction() {
    override var alterType: AlterActionType = AlterActionType.ADD_CONSTRAINT
}

class AlterDropConstraintAction() : AlterAction() {
    override var alterType: AlterActionType = AlterActionType.DROP_CONSTRAINT
}

class AlterDropFeatureAction() : AlterAction() {
    override var alterType: AlterActionType = AlterActionType.DROP_FEATURE
}

class AlterClusterByAction() : AlterAction() {
    override var alterType: AlterActionType = AlterActionType.CLUSTER_BY
}

class AlterSyncIdentityAction() : AlterAction() {
    override var alterType: AlterActionType = AlterActionType.SYNC_IDENTITY
}
