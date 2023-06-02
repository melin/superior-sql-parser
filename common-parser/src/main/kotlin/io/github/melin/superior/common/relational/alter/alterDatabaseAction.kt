package io.github.melin.superior.common.relational.alter

import com.google.common.collect.Maps
import java.util.HashMap

data class AlterDbPropsAction(
    var location: String? = null,
    var properties: HashMap<String, String> = Maps.newHashMap()
): AlterAction()

data class RenameDbAction(
    var newDatabaseName: String
): AlterAction()