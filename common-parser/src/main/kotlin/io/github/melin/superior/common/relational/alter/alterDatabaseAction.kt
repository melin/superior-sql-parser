package io.github.melin.superior.common.relational.alter

import com.google.common.collect.Maps
import io.github.melin.superior.common.relational.TableId
import java.util.HashMap

data class AlterDatabasePropsAction(
    var newTableId: TableId? = null, // 修改表，新列名称
): AlterAction() {
    var location: String? = null
    var properties: HashMap<String, String> = Maps.newHashMap()
}
