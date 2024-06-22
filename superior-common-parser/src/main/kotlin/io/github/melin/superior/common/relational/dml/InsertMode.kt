package io.github.melin.superior.common.relational.dml

import java.io.Serializable

enum class InsertMode : Serializable {
    INTO,
    INTO_REPLACE,
    OVERWRITE,
    OVERWRITE_HIVE_DIR,
    OVERWRITE_DIR,
}
