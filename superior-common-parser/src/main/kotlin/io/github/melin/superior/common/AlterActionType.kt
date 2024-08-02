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
    ADD_PARTITION,
    DROP_INDEX,
    ADD_COLUMN,
    SET_COLUMN_DEFAULT,
    DROP_COLUMN,
    DROP_COLUMN_DRFAULT,
    DROP_PARTITION,
    DROP_PRIMARY_KEY,
    RENAME,
    RENAME_PARTITION,
    DETACH_PARTITION,
    ATTACH_PARTITION,
    TRUNCATE_PARTITION,
    REFRESH_MV,
    UNKOWN
}
