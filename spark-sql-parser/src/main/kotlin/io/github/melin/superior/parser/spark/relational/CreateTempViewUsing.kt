package io.github.melin.superior.parser.spark.relational

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.AbsTableStatement
import io.github.melin.superior.common.relational.TableId

data class CreateTempViewUsing(
    override val tableId: TableId,
    var fileFormat: String,
    var properties: Map<String, String>,
) : AbsTableStatement() {
    override val statementType = StatementType.CREATE_TEMP_VIEW_USING
    override val privilegeType = PrivilegeType.CREATE
    override val sqlType = SqlType.DDL

    var replace: Boolean = false
    var global: Boolean = false
}