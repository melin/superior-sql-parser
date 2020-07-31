package com.dataworker.sql.parser.util

import java.time.DateTimeException
import java.time.LocalDateTime
import java.time.ZoneId
import java.time.format.DateTimeFormatter
import java.util.*

object DateUtils {
    fun getCurrentDateTime(): String {
        try {
            val ldt = LocalDateTime.ofInstant(Date().toInstant(), ZoneId.systemDefault())
            val format = DateTimeFormatter.ofPattern("yyyyMMddHHmmssSSS")
            return ldt.format(format)
        } catch (ex: DateTimeException) {
            throw RuntimeException(ex.message, ex)
        }
    }
}