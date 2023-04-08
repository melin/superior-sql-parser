package io.github.melin.superior.common

import java.io.Serializable

enum class AlterType : Serializable {
    RENAME_TABLE,
    ALTER_VIEW_QUERY,
    SET_TABLE_LOCATION,
    SET_TABLE_PROPERTIES,
    TOUCH_TABLE,

    RENAME_COLUMN,
    ADD_COLUMN,
    ALTER_COLUMN,
    DROP_COLUMN,

    DROP_PARTITION,
    ADD_PARTITION,
    RENAME_PARTITION,

    ADD_INDEX, //mysql
    DROP_INDEX, //mysql
    ADD_UNIQUE_KEY, //mysql
    ADD_PRIMARY_KEY, //mysql

    UNKOWN
}