package com.github.bigdata.sql.parser.util

import org.apache.commons.lang.StringUtils

/**
 * Created by libinsong on 2017/4/10.
 */
object StringUtil {

    fun cleanSingleQuote(value: String) : String {
        if(StringUtils.startsWith(value, "'") && StringUtils.endsWith(value, "'")) {
            return StringUtils.substringBetween(value, "'", "'")
        } else {
            return value
        }
    }

    fun cleanDoubleQuote(value: String) : String {
        if(StringUtils.startsWith(value, "\"") && StringUtils.endsWith(value, "\"")) {
            return StringUtils.substringBetween(value, "\"", "\"")
        } else {
            return value
        }
    }

    fun cleanQuote(value: String?) : String {
        if(value == null)
            return ""

        if(StringUtils.startsWith(value, "`") && StringUtils.endsWith(value, "`")) {
            return StringUtils.substringBetween(value, "`", "`")
        } else {
            return value
        }
    }

    fun parseDataType(type: String): String {
        val value = if(StringUtils.startsWith(type, "TOK_")) StringUtils.substringAfter(type, "TOK_") else type
        return StringUtils.lowerCase(value)
    }
}