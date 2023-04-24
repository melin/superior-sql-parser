package io.github.melin.superior.common

import java.io.Serializable

/**
 * Created by libinsong on 2017/3/6.
 */

enum class StatementType: Serializable {
    CREATE_NAMESPACE,
    CREATE_TABLE,
    CREATE_TABLE_AS_SELECT,
    CREATE_TABLE_AS_LIKE,
    CREATE_MATERIALIZED_VIEW,
    CREATE_VIEW,
    CREATE_TEMPORARY_VIEW,
    CREATE_FUNCTION,
    CREATE_PROCEDURE,

    DROP_NAMESPACE,
    DROP_TABLE,
    DROP_VIEW,
    DROP_FUNCTION,
    DROP_PROCEDURE,

    TRUNCATE_TABLE,
    REFRESH_TABLE,
    LOAD_TEMP_TABLE,
    EXPORT_TABLE,
    ANALYZE_TABLE,

    ALTER_TABLE,
    REPAIR_TABLE,
    COMMENT,

    //DML
    QUERY,
    SELECT,
    DELETE,
    UPDATE,
    MERGE,
    INSERT_VALUES,
    INSERT_SELECT,
    MULTI_INSERT,

    SHOW,
    DESC,

    CACHE,
    UNCACHE,
    CLEAR_CACHE,

    EXPLAIN,
    SET,
    UNSET,
    USE,

    DATATUNNEL, // spark
    MERGE_FILE, // spark
    APP_JAR, // spark
    CALL,
    SYNC,

    ARITHMETIC,

    FLINK_CDC_BEGIN,
    FLINK_CDC_END,
    FLINK_CDC_CTAS,
    FLINK_CDC_CDAS,

    UNKOWN;
}
