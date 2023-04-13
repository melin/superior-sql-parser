package io.github.melin.superior.common.type

interface Type {
    val name: String
    val alias: String?
    val alias2: String? // 有些有多个别名，例如mysql integer有int 和 int4 两种
}