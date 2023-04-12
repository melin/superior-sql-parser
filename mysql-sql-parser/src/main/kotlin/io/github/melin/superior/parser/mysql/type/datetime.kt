package io.github.melin.superior.parser.mysql.type

import io.github.melin.superior.common.type.AbsDataTimeType

class DateType : AbsDataTimeType()

data class TimeType(val precision: Int = 0) : AbsDataTimeType()

data class TimeStampType(val precision: Int = 0) : AbsDataTimeType()

data class DateTimeType(val precision: Int = 0) : AbsDataTimeType()

class YearType : AbsDataTimeType()
