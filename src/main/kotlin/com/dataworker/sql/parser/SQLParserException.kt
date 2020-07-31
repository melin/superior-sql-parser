package com.dataworker.sql.parser

/**
 * Created by libinsong on 2017/3/16.
 */

class SQLParserException(message: String?) : RuntimeException(message) {

    constructor(message: String?, exception: Exception?) : this(message)
}