package io.github.melin.superior.common.relational.alter

import io.github.melin.superior.common.AlterActionType

data class AlterCreateTagAction(val tagName: String) : AlterAction() {
    override var alterType: AlterActionType = AlterActionType.CREATE_TAG
}

data class AlterDropTagAction(val tagName: String) : AlterAction() {
    override var alterType: AlterActionType = AlterActionType.DROP_TAG
}

data class AlterCreateBranchAction(val branchName: String) : AlterAction() {
    override var alterType: AlterActionType = AlterActionType.CREATE_BRANCH
}

data class AlterDropBranchAction(val branchName: String) : AlterAction() {
    override var alterType: AlterActionType = AlterActionType.DROP_BRANCH
}

data class AlterSetIdentifierFieldsAction(val fields: List<String>) : AlterAction() {
    override var alterType: AlterActionType = AlterActionType.SET_IDENTIFIER_FIELDS
}

data class AlterDropIdentifierFieldsAction(val fields: List<String>) : AlterAction() {
    override var alterType: AlterActionType = AlterActionType.DROP_IDENTIFIER_FIELDS
}
