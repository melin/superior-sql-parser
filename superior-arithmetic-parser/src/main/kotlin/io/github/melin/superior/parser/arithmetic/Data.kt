package io.github.melin.superior.parser.arithmetic

import io.github.melin.superior.common.PrivilegeType
import io.github.melin.superior.common.SqlType
import io.github.melin.superior.common.StatementType
import io.github.melin.superior.common.relational.Statement

data class ArithmeticData(
    val variables: java.util.HashSet<String> = HashSet(),
    val functions: java.util.HashSet<String> = HashSet()
) : Statement() {
    override val statementType = StatementType.ARITHMETIC
    override val privilegeType = PrivilegeType.OTHER
    override val sqlType = SqlType.DML
}
