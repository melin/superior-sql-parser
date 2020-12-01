package com.dataworker.sql.parser.util

import org.apache.commons.lang3.StringUtils

/**
 * Created by libinsong on 2017/4/10.
 */
object StringUtil {

    fun cleanQuote(value: String) : String {
        var result = value;
        if (StringUtils.startsWith(result, "'") && StringUtils.endsWith(result, "'")) {
            result = StringUtils.substringBetween(result, "'", "'")
        }

        if (StringUtils.startsWith(result, "\"") && StringUtils.endsWith(result, "\"")) {
            result = StringUtils.substringBetween(result, "\"", "\"")
        }
        return result
    }

    fun cleanBackQuote(value: String?) : String {
        if (value == null)
            return ""

        if (StringUtils.startsWith(value, "`") && StringUtils.endsWith(value, "`")) {
            return StringUtils.substringBetween(value, "`", "`")
        } else {
            return value
        }
    }

    fun parseDataType(type: String): String {
        val value = if (StringUtils.startsWith(type, "TOK_")) StringUtils.substringAfter(type, "TOK_") else type
        return StringUtils.lowerCase(value)
    }
}
