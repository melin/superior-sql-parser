package io.github.melin.superior.parser.postgre.type

import io.github.melin.superior.common.type.AbsDataTimeType

class DateType : AbsDataTimeType() {
    override val name: String = "date"
}

data class TimeType(val precision: Int = 0, val timezone: Boolean = false) : AbsDataTimeType() {
    override val name: String = "time"
    override val alias: String = "timez"
}

data class TimeStampType(val precision: Int = 0, val timezone: Boolean = false) : AbsDataTimeType() {
    override val name: String = "timestamp"
    override val alias: String = "timestampz"
}

class IntervalType : AbsDataTimeType() {
    override val name: String = "interval"
}
