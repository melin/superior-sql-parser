package io.github.melin.superior.common

import java.io.Serializable

enum class AlterActionType : Serializable {
    SET_PROPS,
    SET_SERDE,
    TOUCH_TABLE,

    ALTER_COLUMN,
    ALTER_VIEW_QUERY,

    ADD_UNIQUE_KEY,
    ADD_PRIMARY_KEY,
    ADD_INDEX,
    DROP_INDEX,

    ADD_COLUMN,
    SET_COLUMN_DEFAULT,
    DROP_COLUMN,
    DROP_COLUMN_DRFAULT,

    RENAME,
    REFRESH_MV,

    RENAME_PARTITION,
    DROP_PARTITION,
    ADD_PARTITION,
    DETACH_PARTITION,
    ATTACH_PARTITION,
    TRUNCATE_PARTITION,

    UNKOWN
}