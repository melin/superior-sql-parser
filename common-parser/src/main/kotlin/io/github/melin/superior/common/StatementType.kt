package io.github.melin.superior.common

import java.io.Serializable

/**
 * Created by libinsong on 2017/3/6.
 */

enum class StatementType: Serializable {
    CREATE_NAMESPACE,
    DROP_NAMESPACE,

    CREATE_TABLE,
    CREATE_TABLE_AS_SELECT,
    CREATE_TABLE_AS_LIKE,
    DROP_TABLE,
    TRUNCATE_TABLE,
    MERGE_TABLE,
    REFRESH_TABLE,
    LOAD_TEMP_TABLE,
    EXPORT_TABLE,
    ANALYZE_TABLE,

    ALTER_TABLE,

    REPAIR_TABLE,

    //DML
    QUERY,
    SELECT,
    DELETE,
    UPDATE,
    INSERT_VALUES,
    INSERT_SELECT,
    MULTI_INSERT,
    MERGE_INTO_TABLE,

    CREATE_VIEW,
    CREATE_TEMPORARY_VIEW,
    DROP_VIEW,

    CREATE_FUNCTION,
    DROP_FUNCTION,

    SHOW,
    DESC,

    CACHE,
    UNCACHE,
    CLEAR_CACHE,

    EXPLAIN,
    SET,
    UNSET,
    JOB,
    USE,

    DATATUNNEL,
    CALL,
    SYNC,

    ARITHMETIC,

    FLINK_CDC_BEGIN,
    FLINK_CDC_END,
    FLINK_CDC_CTAS,
    FLINK_CDC_CDAS,

    UNKOWN;
}
