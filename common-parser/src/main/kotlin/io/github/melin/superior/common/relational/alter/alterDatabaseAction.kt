package io.github.melin.superior.common.relational.alter

import com.google.common.collect.Maps
import io.github.melin.superior.common.AlterType
import java.util.HashMap

data class AlterDbPropsAction(
    var location: String? = null,
    var properties: HashMap<String, String> = Maps.newHashMap()
): AlterAction() {
    override var alterType: AlterType = AlterType.SET_DATABASE_PROPS
}

data class RenameDbAction(
    var newDatabaseName: String
): AlterAction() {
    override var alterType: AlterType = AlterType.RENAME_DATABASE
}