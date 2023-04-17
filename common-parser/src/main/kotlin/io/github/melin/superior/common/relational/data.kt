package io.github.melin.superior.common.relational

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.StatementType
import java.io.Serializable

@Target(AnnotationTarget.CLASS)
annotation class DefaultConstructor

data class StatementData(
    val type: StatementType,
    val statement: Statement?
): Serializable {
    constructor(type: StatementType): this(type, null)
}

abstract class Statement: Serializable {
    open val tableId: TableId? = null
    abstract val privilegeType: PrivilegeType
    abstract val sqlType: SqlType

    var functionNames: HashSet<String> = hashSetOf()
    var cteTempTables: List<String> = listOf()
}
