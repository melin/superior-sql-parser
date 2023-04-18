package io.github.melin.superior.common

import java.io.Serializable

enum class AlterType : Serializable {
    RENAME_TABLE,
    ALTER_VIEW_QUERY,
    SET_TABLE_LOCATION,
    SET_TABLE_PROPERTIES,
    TOUCH_TABLE,

    RENAME_COLUMN,
    ALTER_COLUMN,

    ADD_PARTITION,
    ADD_COLUMN,
    ADD_INDEX,
    ADD_UNIQUE_KEY,
    ADD_PRIMARY_KEY,

    DROP_PARTITION,
    DROP_COLUMN,
    DROP_INDEX,

    DETACH_PARTITION,
    ATTACH_PARTITION,
    RENAME_PARTITION,
    TRUNCATE_PARTITION,

    UNKOWN
}