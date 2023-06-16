package io.github.melin.superior.parser.postgre.type

import io.github.melin.superior.common.type.AbsType

class BooleanType: AbsType() {
    override val name: String = "boolean"
    override val alias: String = "bool"
}