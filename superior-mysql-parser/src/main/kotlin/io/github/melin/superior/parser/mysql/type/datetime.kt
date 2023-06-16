package io.github.melin.superior.parser.mysql.type

import io.github.melin.superior.common.type.AbsDataTimeType

class DateType : AbsDataTimeType() {
    override val name: String = "date"
}

data class TimeType(val precision: Int = 0) : AbsDataTimeType() {
    override val name: String = "time"
}

data class TimeStampType(val precision: Int = 0) : AbsDataTimeType() {
    override val name: String = "timestamp"
}

data class DateTimeType(val precision: Int = 0) : AbsDataTimeType() {
    override val name: String = "datetime"
}

class YearType : AbsDataTimeType() {
    override val name: String = "year"
}
