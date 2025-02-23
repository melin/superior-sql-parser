package io.github.melin.superior.common.relational

enum class SortType {
    ASC,
    DESC,
    UNKOWN,
}

enum class PartitionType {
    RANGE,
    LIST,
    HASH,
    KEY,
    VALUES,
    NORMAL,
    EXPRESSION,
}
