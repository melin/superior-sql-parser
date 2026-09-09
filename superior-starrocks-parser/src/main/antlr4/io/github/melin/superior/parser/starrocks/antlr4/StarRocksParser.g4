// Copyright 2021-present StarRocks, Inc. All rights reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//     https://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

parser grammar StarRocksParser;
options { tokenVocab = StarRocksLexer; }

sqlStatements
    : singleStatement* EOF
    ;

singleStatement
    : statement SEMICOLON?
    ;

statement
    // Query Statement
    : queryStatement

    // Database Statement
    | useDatabaseStatement
    | useCatalogStatement
    | setCatalogStatement
    | showDatabasesStatement
    | alterDbQuotaStatement
    | alterDatabaseSetStatement
    | createDbStatement
    | dropDbStatement
    | showCreateDbStatement
    | alterDatabaseRenameStatement
    | recoverDbStmt
    | showDataStmt
    | showDataDistributionStmt

    // Table Statement
    | createTableStatement
    | createTableAsSelectStatement
    | createTableLikeStatement
    | showCreateTableStatement
    | dropTableStatement
    | cleanTemporaryTableStatement
    | recoverTableStatement
    | truncateTableStatement
    | showTableStatement
    | descTableStatement
    | showTableStatusStatement
    | showColumnStatement
    | refreshTableStatement
    | alterTableStatement
    | cancelAlterTableStatement
    | showAlterStatement
    | showTemporaryTablesStatement

    // View Statement
    | createViewStatement
    | alterViewStatement
    | dropViewStatement

    // Partition Statement
    | showPartitionsStatement
    | recoverPartitionStatement

    // Index Statement
    | createIndexStatement
    | dropIndexStatement
    | showIndexStatement

    // Task Statement
    | submitTaskStatement
    | alterTaskStatement
    | dropTaskStatement

    // Materialized View Statement
    | createMaterializedViewStatement
    | showMaterializedViewsStatement
    | dropMaterializedViewStatement
    | alterMaterializedViewStatement
    | refreshMaterializedViewStatement
    | cancelRefreshMaterializedViewStatement

    // Catalog Statement
    | createExternalCatalogStatement
    | dropExternalCatalogStatement
    | showCatalogsStatement
    | showCreateExternalCatalogStatement
    | alterCatalogStatement

    // DML Statement
    | insertStatement
    | updateStatement
    | deleteStatement
    | mergeIntoStatement

    // Routine Statement
    | createRoutineLoadStatement
    | alterRoutineLoadStatement
    | stopRoutineLoadStatement
    | resumeRoutineLoadStatement
    | pauseRoutineLoadStatement
    | showRoutineLoadStatement
    | showRoutineLoadTaskStatement
    | showCreateRoutineLoadStatement

    // StreamLoad Statement
    | showStreamLoadStatement

    // Admin Statement
    | adminSetConfigStatement
    | adminSetReplicaStatusStatement
    | adminShowConfigStatement
    | adminShowAutomatedSnapshotStatement
    | adminShowReplicaDistributionStatement
    | adminShowReplicaStatusStatement
    | adminShowTabletStatusStatement
    | adminRepairTableStatement
    | adminCancelRepairTableStatement
    | adminCheckTabletsStatement
    | adminSetPartitionVersion
    | killStatement
    | syncStatement
    | executeScriptStatement
    | adminSetAutomatedSnapshotOnStatement
    | adminSetAutomatedSnapshotOffStatement
    | adminAlterAutomatedSnapshotIntervalStatement
    | adminSkipCommittedTransactionStatement

    // Cluster Management Statement
    | alterSystemStatement
    | cancelAlterSystemStatement
    | showComputeNodesStatement

    // Analyze Statement
    | analyzeStatement
    | dropStatsStatement
    | createAnalyzeStatement
    | dropAnalyzeJobStatement
    | analyzeHistogramStatement
    | dropHistogramStatement
    | showAnalyzeStatement
    | showStatsMetaStatement
    | showHistogramMetaStatement
    | killAnalyzeStatement

    // Profile Statement
    | analyzeProfileStatement

    // Resource Group Statement
    | createResourceGroupStatement
    | dropResourceGroupStatement
    | alterResourceGroupStatement
    | showResourceGroupStatement
    | showResourceGroupUsageStatement

    // External Resource Statement
    | createResourceStatement
    | alterResourceStatement
    | dropResourceStatement
    | showResourceStatement

    // UDF Statement
    | showFunctionsStatement
    | showCreateFunctionStatement
    | dropFunctionStatement
    | createFunctionStatement

    // Load Statement
    | loadStatement
    | showLoadStatement
    | showLoadWarningsStatement
    | cancelLoadStatement
    | alterLoadStatement

    // Show Statement
    | showAuthorStatement
    | showBackendsStatement
    | showBrokerStatement
    | showCharsetStatement
    | showCollationStatement
    | showDeleteStatement
    | showDynamicPartitionStatement
    | showEventsStatement
    | showEnginesStatement
    | showFrontendsStatement
    | showPluginsStatement
    | showRepositoriesStatement
    | showOpenTableStatement
    | showPrivilegesStatement
    | showProcedureStatement
    | showProcStatement
    | showProcesslistStatement
    | showProfilelistStatement
    | showRunningQueriesStatement
    | showStatusStatement
    | showTabletStatement
    | showTransactionStatement
    | showTriggersStatement
    | showUserPropertyStatement
    | showVariablesStatement
    | showWarningStatement
    | helpStatement

    // authz Statement
    | createUserStatement
    | dropUserStatement
    | alterUserStatement
    | showUserStatement
    | showAuthenticationStatement
    | executeAsStatement
    | createRoleStatement
    | alterRoleStatement
    | dropRoleStatement
    | showRolesStatement
    | grantRoleStatement
    | revokeRoleStatement
    | setRoleStatement
    | setDefaultRoleStatement
    | grantPrivilegeStatement
    | revokePrivilegeStatement
    | showGrantsStatement

    // Security Integration Statement
    | createSecurityIntegrationStatement
    | alterSecurityIntegrationStatement
    | dropSecurityIntegrationStatement
    | showSecurityIntegrationStatement
    | showCreateSecurityIntegrationStatement

    // Group Provider Statement
    | createGroupProviderStatement
    | dropGroupProviderStatement
    | showGroupProvidersStatement
    | showCreateGroupProviderStatement

    // Backup Restore Statement
    | backupStatement
    | cancelBackupStatement
    | showBackupStatement
    | restoreStatement
    | cancelRestoreStatement
    | showRestoreStatement
    | showSnapshotStatement
    | dropSnapshotStatement
    | createRepositoryStatement
    | dropRepositoryStatement

    // Sql BlackList And WhiteList Statement
    | addSqlBlackListStatement
    | delSqlBlackListStatement
    | showSqlBlackListStatement
    | showWhiteListStatement

    // Sql Digest BlackList Statement
    | addSqlDigestBlackListStatement
    | delSqlDigestBlackListStatement
    | showSqlDigestBlackListStatement

    // Backend BlackList
    | addBackendBlackListStatement
    | delBackendBlackListStatement
    | showBackendBlackListStatement

    // Compute Node BlackList
    | addComputeNodeBlackListStatement
    | delComputeNodeBlackListStatement
    | showComputeNodeBlackListStatement

    // Data Cache management statement
    | createDataCacheRuleStatement
    | showDataCacheRulesStatement
    | dropDataCacheRuleStatement
    | clearDataCacheRulesStatement
    | dataCacheSelectStatement

    // Export Statement
    | exportStatement
    | cancelExportStatement
    | showExportStatement

    // Plugin Statement
    | installPluginStatement
    | uninstallPluginStatement

    // File Statement
    | createFileStatement
    | dropFileStatement
    | showSmallFilesStatement

    // Warehouse Statement
    | createWarehouseStatement
    | dropWarehouseStatement
    | suspendWarehouseStatement
    | resumeWarehouseStatement
    | setWarehouseStatement
    | showWarehousesStatement
    | showClustersStatement
    | showNodesStatement
    | alterWarehouseStatement

    // Set Statement
    | setStatement
    | setUserPropertyStatement
    | refreshConnectionsStatement

    // Storage Volume Statement
    | createStorageVolumeStatement
    | alterStorageVolumeStatement
    | dropStorageVolumeStatement
    | showStorageVolumesStatement
    | descStorageVolumeStatement
    | setDefaultStorageVolumeStatement

    // Pipe Statement
    | createPipeStatement
    | dropPipeStatement
    | alterPipeStatement
    | showPipeStatement
    | descPipeStatement

    // Compaction Statement
    | cancelCompactionStatement

    // FailPoint Statement
    | updateFailPointStatusStatement
    | showFailPointStatement

    // prepare_stmt
    | prepareStatement
    | executeStatement
    | deallocateStatement

    // Dictionary Statement
    | createDictionaryStatement
    | dropDictionaryStatement
    | refreshDictionaryStatement
    | showDictionaryStatement
    | cancelRefreshDictionaryStatement

    // Plan advisor statement
    | alterPlanAdvisorAddStatement
    | truncatePlanAdvisorStatement
    | alterPlanAdvisorDropStatement
    | showPlanAdvisorStatement

    // CNGroup Statement
    | createCNGroupStatement
    | dropCNGroupStatement
    | enableCNGroupStatement
    | disableCNGroupStatement
    | alterCNGroupStatement

    // Transaction Statement
    | beginStatement
    | commitStatement
    | rollbackStatement

    // Translate Statement
    | translateStatement

    // SQL Plan Management Statement
    | createBaselinePlanStatement
    | dropBaselinePlanStatement
    | showBaselinePlanStatement
    | disableBaselinePlanStatement
    | enableBaselinePlanStatement

    // Procedure Statement
    | callProcedureStatement

    // Unsupported Statement
    | unsupportedStatement
    ;


// show-predicate-clauses
showPredicateClauses
    : (WHERE expression)? (ORDER BY sortItem (COMMA sortItem)*)? limitElement?
    ;

// ---------------------------------------- DataBase Statement ---------------------------------------------------------

useDatabaseStatement
    : USE qualifiedName
    ;

useCatalogStatement
    : USE string
    ;

setCatalogStatement
    : SET CATALOG identifierOrString
    ;

showDatabasesStatement
    : SHOW DATABASES ((FROM | IN) catalog=qualifiedName)? (LIKE pattern=string)? showPredicateClauses
    | SHOW SCHEMAS (LIKE pattern=string)? showPredicateClauses
    ;

alterDbQuotaStatement
    : ALTER DATABASE identifier SET DATA QUOTA identifier
    | ALTER DATABASE identifier SET REPLICA QUOTA INTEGER_VALUE
    ;

alterDatabaseSetStatement
    : ALTER DATABASE identifier SET propertyList
    ;

createDbStatement
    : CREATE (DATABASE | SCHEMA) (IF NOT EXISTS)? (catalog=identifier DOT)? database=qualifiedName charsetDesc? collateDesc? properties?
    ;

dropDbStatement
    : DROP (DATABASE | SCHEMA) (IF EXISTS)? (catalog=identifier DOT)? database=qualifiedName FORCE?
    ;

showCreateDbStatement
    : SHOW CREATE (DATABASE | SCHEMA) identifier
    ;

alterDatabaseRenameStatement
    : ALTER DATABASE identifier RENAME identifier
    ;

recoverDbStmt
    : RECOVER (DATABASE | SCHEMA) identifier
    ;

showDataStmt
    : SHOW DATA showPredicateClauses
    | SHOW DATA FROM qualifiedName showPredicateClauses
    ;

showDataDistributionStmt
    : SHOW DATA DISTRIBUTION FROM qualifiedName partitionNames? showPredicateClauses
    ;

// ------------------------------------------- Table Statement ---------------------------------------------------------

createTableStatement
    : CREATE (TEMPORARY | EXTERNAL)? TABLE (IF NOT EXISTS)? qualifiedName
          LEFT_PAREN columnDesc (COMMA columnDesc)* (COMMA indexDesc)* RIGHT_PAREN
          engineDesc?
          charsetDesc?
          keyDesc?
          comment?
          partitionDesc?
          distributionDesc?
          orderByDesc?
          rollupDesc?
          properties?
          extProperties?
     ;


columnDesc
    : identifier type? charsetName? KEY? aggDesc? columnNullable?
    (defaultDesc | AUTO_INCREMENT | generatedColumnDesc)?
    comment?
    ;

charsetName
    : CHAR SET identifier
    | CHARSET identifier
    | CHARACTER SET identifier
    ;

defaultDesc
    : DEFAULT (string | NULL | CURRENT_TIMESTAMP (LEFT_PAREN (INTEGER_VALUE)? RIGHT_PAREN)? | LEFT_PAREN qualifiedName LEFT_PAREN RIGHT_PAREN RIGHT_PAREN | expression)
    ;

generatedColumnDesc
    : AS expression
    ;

indexDesc
    : INDEX indexName=identifier identifierList (indexType propertyList?)? comment?
    ;

engineDesc
    : ENGINE EQ identifier
    ;

charsetDesc
    : DEFAULT? (CHAR SET | CHARSET | CHARACTER SET) EQ? identifierOrString
    ;

collateDesc
    : DEFAULT? COLLATE EQ? identifierOrString
    ;

keyDesc
    : (AGGREGATE | UNIQUE | PRIMARY | DUPLICATE) KEY identifierList
    ;

orderByDesc
    : ORDER BY LEFT_PAREN sortItem (COMMA sortItem)* RIGHT_PAREN
    ;

columnNullable
    : NULL
    | NOT NULL
    ;

typeWithNullable
    : type columnNullable?
    ;

aggStateDesc
    : identifier LEFT_PAREN typeWithNullable (COMMA typeWithNullable)* RIGHT_PAREN
    ;

aggDesc
    : SUM
    | MAX
    | MIN
    | REPLACE
    | HLL_UNION
    | BITMAP_UNION
    | PERCENTILE_UNION
    | REPLACE_IF_NOT_NULL
    | aggStateDesc
    ;

rollupDesc
    : ROLLUP LEFT_PAREN rollupItem (COMMA rollupItem)* RIGHT_PAREN
    ;

rollupItem
    : rollupName=identifier identifierList (dupKeys)? (rollupOrderByDesc)? (fromRollup)? properties?
    ;

rollupOrderByDesc
    : ORDER BY identifierList
    ;

dupKeys
    : DUPLICATE KEY identifierList
    ;

fromRollup
    : FROM identifier
    ;

orReplace:
    (OR REPLACE)?
    ;
ifNotExists:
    (IF NOT EXISTS)?
    ;

createTableAsSelectStatement
    : CREATE TEMPORARY? TABLE (IF NOT EXISTS)? qualifiedName
        (LEFT_PAREN (identifier (COMMA identifier)*  (COMMA indexDesc)* | indexDesc (COMMA indexDesc)*) RIGHT_PAREN)?
        engineDesc?
        keyDesc?
        comment?
        partitionDesc?
        distributionDesc?
        orderByDesc?
        properties?
        AS queryStatement
    ;


dropTableStatement
    : DROP TEMPORARY? TABLE (IF EXISTS)? qualifiedName FORCE?
    ;

cleanTemporaryTableStatement
    : CLEAN TEMPORARY TABLE ON SESSION string
    ;

alterTableStatement
    : ALTER TABLE qualifiedName alterClause (COMMA alterClause)*
    | ALTER TABLE qualifiedName ADD ROLLUP rollupItem (COMMA rollupItem)*
    | ALTER TABLE qualifiedName DROP ROLLUP identifier (COMMA identifier)*
    ;

createIndexStatement
    : CREATE INDEX indexName=identifier
        ON qualifiedName identifierList (indexType propertyList?)?
        comment?
    ;

dropIndexStatement
    : DROP INDEX indexName=identifier ON qualifiedName
    ;

indexType
    : USING (BITMAP | GIN | NGRAMBF | VECTOR)
    ;

showTableStatement
    : SHOW FULL? TABLES ((FROM | IN) db=qualifiedName)? (LIKE pattern=string)? showPredicateClauses
    ;

showTemporaryTablesStatement
    : SHOW TEMPORARY TABLES ((FROM | IN) db=qualifiedName)? (LIKE pattern=string)? showPredicateClauses
    ;

showCreateTableStatement
    : SHOW CREATE (TABLE | VIEW | MATERIALIZED VIEW) table=qualifiedName
    ;

showColumnStatement
    : SHOW FULL? (COLUMNS | FIELDS) ((FROM | IN) table=qualifiedName) ((FROM | IN) db=qualifiedName)?
        (LIKE pattern=string)? showPredicateClauses
    ;

showTableStatusStatement
    : SHOW TABLE STATUS ((FROM | IN) db=qualifiedName)? (LIKE pattern=string)? showPredicateClauses
    ;

refreshTableStatement
    : REFRESH EXTERNAL TABLE qualifiedName (PARTITION LEFT_PAREN string (COMMA string)* RIGHT_PAREN)?
    ;

showAlterStatement
    : SHOW ALTER TABLE (COLUMN | ROLLUP | OPTIMIZE) ((FROM | IN) db=qualifiedName)? showPredicateClauses
    | SHOW ALTER MATERIALIZED VIEW ((FROM | IN) db=qualifiedName)? showPredicateClauses
    ;

descTableStatement
    : (DESC | DESCRIBE) ((table=qualifiedName ALL?) | (FILES propertyList))
    ;

createTableLikeStatement
    : CREATE (TEMPORARY | EXTERNAL)? TABLE (IF NOT EXISTS)? qualifiedName
        partitionDesc?
        distributionDesc?
        properties?
        LIKE qualifiedName
    ;

showIndexStatement
    : SHOW (INDEX | INDEXES | KEY | KEYS) ((FROM | IN) table=qualifiedName) ((FROM | IN) db=qualifiedName)? showPredicateClauses
    ;

recoverTableStatement
    : RECOVER TABLE qualifiedName
    ;

truncateTableStatement
    : TRUNCATE TABLE qualifiedName partitionNames?
    ;

cancelAlterTableStatement
    : CANCEL ALTER TABLE (COLUMN | ROLLUP | OPTIMIZE)? FROM qualifiedName (LEFT_PAREN INTEGER_VALUE (COMMA INTEGER_VALUE)* RIGHT_PAREN)? FORCE?
    | CANCEL ALTER MATERIALIZED VIEW FROM qualifiedName
    ;

showPartitionsStatement
    : SHOW TEMPORARY? PARTITIONS FROM table=qualifiedName showPredicateClauses
    ;

recoverPartitionStatement
    : RECOVER PARTITION identifier FROM table=qualifiedName
    ;

// ------------------------------------------- View Statement ----------------------------------------------------------

createViewStatement
    : CREATE (OR REPLACE)? VIEW (IF NOT EXISTS)? qualifiedName
    (LEFT_PAREN columnNameWithComment (COMMA columnNameWithComment)* RIGHT_PAREN)?
    comment?
    (SECURITY (NONE | INVOKER))?
    properties?
    AS queryStatement
    ;

alterViewStatement
    : ALTER VIEW qualifiedName (LEFT_PAREN columnNameWithComment (COMMA columnNameWithComment)* RIGHT_PAREN)? AS queryStatement
    | ALTER VIEW qualifiedName SET SECURITY (NONE | INVOKER)
    | ALTER VIEW qualifiedName SET properties
    | ALTER VIEW qualifiedName (ADD | MODIFY) DIALECT (STARROCKS)?  queryStatement
    ;

dropViewStatement
    : DROP VIEW (IF EXISTS)? qualifiedName
    ;

columnNameWithComment
    : columnName=identifier comment?
    ;

// ------------------------------------------- Task Statement ----------------------------------------------------------

submitTaskStatement
    : SUBMIT TASK qualifiedName?
        taskClause*
        AS (createTableAsSelectStatement | insertStatement | dataCacheSelectStatement)
    ;

alterTaskStatement
    : ALTER TASK (IF EXISTS)? qualifiedName (RESUME | SUSPEND | SET propertyList)
    ;

taskClause
    : properties
    | taskScheduleDesc
    ;

dropTaskStatement
    : DROP TASK (IF EXISTS)? qualifiedName FORCE?
    ;

taskScheduleDesc
    : SCHEDULE (START LEFT_PAREN string RIGHT_PAREN)? EVERY LEFT_PAREN taskInterval RIGHT_PAREN
    ;

// ------------------------------------------- Materialized View Statement ---------------------------------------------

createMaterializedViewStatement
    : CREATE MATERIALIZED VIEW (IF NOT EXISTS)? mvName=qualifiedName
    (LEFT_PAREN columnNameWithComment (COMMA columnNameWithComment)* (COMMA indexDesc)* RIGHT_PAREN)?
    comment?
    materializedViewDesc*
    AS queryStatement
    ;

mvPartitionExprs:
    primaryExpression
    | LEFT_PAREN primaryExpression (COMMA primaryExpression)* RIGHT_PAREN
    ;

materializedViewDesc
    : (PARTITION BY mvPartitionExprs)
    | distributionDesc
    | orderByDesc
    | refreshSchemeDesc
    | properties
    ;

showMaterializedViewsStatement
    : SHOW MATERIALIZED VIEWS ((FROM | IN) db=qualifiedName)? (LIKE pattern=string)? showPredicateClauses
    ;

dropMaterializedViewStatement
    : DROP MATERIALIZED VIEW (IF EXISTS)? mvName=qualifiedName FORCE?
    ;

alterMaterializedViewStatement
    : ALTER MATERIALIZED VIEW mvName=qualifiedName (
        refreshSchemeDesc |
        tableRenameClause |
        modifyPropertiesClause |
        swapTableClause |
        addMVColumnClause |
        dropMVColumnClause |
        reorderColumnsClause )
    | ALTER MATERIALIZED VIEW mvName=qualifiedName statusDesc
    ;

addMVColumnClause
    : ADD COLUMN columnName=identifier AS aggregateExpression=expression defaultDesc? (COMMENT string)?
    ;

dropMVColumnClause
    : DROP COLUMN columnName=identifier
    ;

refreshMaterializedViewStatement
    : (explainDesc | optimizerTrace) ? REFRESH MATERIALIZED VIEW mvName=qualifiedName (PARTITION (partitionRangeDesc | listPartitionValues))? FORCE? (WITH (SYNC | ASYNC) MODE)? (WITH PRIORITY priority=INTEGER_VALUE)?
    ;

cancelRefreshMaterializedViewStatement
    : CANCEL REFRESH MATERIALIZED VIEW mvName=qualifiedName FORCE?
    ;

// ------------------------------------------- Admin Statement ---------------------------------------------------------

adminSetConfigStatement
    : ADMIN SET FRONTEND CONFIG LEFT_PAREN property RIGHT_PAREN (WITH PERSISTENT)?
    ;
adminSetReplicaStatusStatement
    : ADMIN SET REPLICA STATUS properties
    ;
adminShowConfigStatement
    : ADMIN SHOW FRONTEND CONFIG (LIKE pattern=string)? showPredicateClauses
    ;

adminShowAutomatedSnapshotStatement
    : ADMIN SHOW AUTOMATED CLUSTER SNAPSHOT
    ;

adminShowReplicaDistributionStatement
    : ADMIN SHOW REPLICA DISTRIBUTION FROM qualifiedName partitionNames? showPredicateClauses
    ;

adminShowReplicaStatusStatement
    : ADMIN SHOW REPLICA STATUS FROM qualifiedName partitionNames? showPredicateClauses
    ;

adminShowTabletStatusStatement
    : ADMIN SHOW TABLET STATUS FROM qualifiedName partitionNames? showPredicateClauses properties?
    ;

adminRepairTableStatement
    : ADMIN REPAIR TABLE qualifiedName partitionNames? properties?
    ;

adminCancelRepairTableStatement
    : ADMIN CANCEL REPAIR TABLE qualifiedName partitionNames?
    ;

adminCheckTabletsStatement
    : ADMIN CHECK tabletList PROPERTIES LEFT_PARENpropertyRIGHT_PAREN
    ;

adminSetPartitionVersion
    : ADMIN SET TABLE qualifiedName PARTITION LEFT_PAREN(partitionName=identifierOrString | partitionId=INTEGER_VALUE)RIGHT_PAREN VERSION TO version=INTEGER_VALUE
    ;

killStatement
    : KILL (CONNECTION? | QUERY) (connId=INTEGER_VALUE | queryId=string)
    ;

syncStatement
    : SYNC
    ;

adminSetAutomatedSnapshotOnStatement
    : ADMIN SET AUTOMATED CLUSTER SNAPSHOT ON (interval)? (STORAGE VOLUME svName=identifier)?
    ;

adminSetAutomatedSnapshotOffStatement
    : ADMIN SET AUTOMATED CLUSTER SNAPSHOT OFF
    ;

adminAlterAutomatedSnapshotIntervalStatement
    : ADMIN ALTER AUTOMATED CLUSTER SNAPSHOT SET interval
    ;

adminSkipCommittedTransactionStatement
    : ADMIN SKIP_KW COMMITTED TRANSACTION txnId=INTEGER_VALUE (REASON reason=string)?
    ;

// ------------------------------------------- Cluster Management Statement ---------------------------------------------

alterSystemStatement
    : ALTER SYSTEM alterClause
    ;

cancelAlterSystemStatement
    : CANCEL DECOMMISSION BACKEND string (COMMA string)*
    ;

showComputeNodesStatement
    : SHOW COMPUTE NODES showPredicateClauses
    ;

// ------------------------------------------- Catalog Statement -------------------------------------------------------

createExternalCatalogStatement
    : CREATE EXTERNAL CATALOG (IF NOT EXISTS)? catalogName=identifierOrString comment? properties
    ;

showCreateExternalCatalogStatement
    : SHOW CREATE CATALOG catalogName=identifierOrString
    ;

dropExternalCatalogStatement
    : DROP CATALOG (IF EXISTS)? catalogName=identifierOrString
    ;

showCatalogsStatement
    : SHOW CATALOGS (LIKE pattern=string)? showPredicateClauses
    ;

alterCatalogStatement
    : ALTER CATALOG catalogName=identifierOrString modifyPropertiesClause
    ;

// ---------------------------------------- Storage Volume Statement ---------------------------------------------------

createStorageVolumeStatement
    : CREATE STORAGE VOLUME (IF NOT EXISTS)? storageVolumeName=identifierOrString typeDesc locationsDesc
          comment? properties?
    ;

typeDesc
    : TYPE EQ identifier
    ;

locationsDesc
    : LOCATIONS EQ stringList
    ;

showStorageVolumesStatement
    : SHOW STORAGE VOLUMES (LIKE pattern=string)? showPredicateClauses
    ;

dropStorageVolumeStatement
    : DROP STORAGE VOLUME (IF EXISTS)? storageVolumeName=identifierOrString
    ;

alterStorageVolumeStatement
    : ALTER STORAGE VOLUME (IF EXISTS)? identifierOrString alterStorageVolumeClause (COMMA alterStorageVolumeClause)*
    ;

alterStorageVolumeClause
    : modifyStorageVolumeCommentClause
    | modifyStorageVolumePropertiesClause
    ;

modifyStorageVolumePropertiesClause
    : SET propertyList
    ;

modifyStorageVolumeCommentClause
    : COMMENT '=' string
    ;

descStorageVolumeStatement
    : (DESC | DESCRIBE) STORAGE VOLUME identifierOrString
    ;

setDefaultStorageVolumeStatement
    : SET identifierOrString AS DEFAULT STORAGE VOLUME
    ;

// ------------------------------------------- FailPoint Statement -----------------------------------------------------

updateFailPointStatusStatement
    : ADMIN (DISABLE | ENABLE) FAILPOINT string
      (WITH (times=INTEGER_VALUE TIMES | prob=DECIMAL_VALUE PROBABILITY | PAUSE))?
      (ON (BACKEND string | FRONTEND))?
    ;

showFailPointStatement
    : SHOW FAILPOINTS (LIKE pattern=string)? (ON BACKEND string)? showPredicateClauses
    ;

// ------------------------------------------- Dictionary Statement -----------------------------------------------------

createDictionaryStatement
    : CREATE DICTIONARY dictionaryName USING qualifiedName
        LEFT_PAREN dictionaryColumnDesc (COMMA dictionaryColumnDesc)* RIGHT_PAREN
        properties?
    ;

dropDictionaryStatement
    : DROP DICTIONARY qualifiedName CACHE?
    ;

refreshDictionaryStatement
    : REFRESH DICTIONARY qualifiedName
    ;

showDictionaryStatement
    : SHOW DICTIONARY qualifiedName? showPredicateClauses
    ;

cancelRefreshDictionaryStatement
    : CANCEL REFRESH DICTIONARY qualifiedName;

dictionaryColumnDesc
    : qualifiedName KEY
    | qualifiedName VALUE
    ;

dictionaryName
    : qualifiedName
    ;

// ------------------------------------------- Alter Clause ------------------------------------------------------------

alterClause
    //Alter system clause
    : addFrontendClause
    | dropFrontendClause
    | modifyFrontendHostClause
    | transferLeaderClause
    | addBackendClause
    | dropBackendClause
    | decommissionBackendClause
    | modifyBackendClause
    | addComputeNodeClause
    | dropComputeNodeClause
    | modifyBrokerClause
    | alterLoadErrorUrlClause
    | createImageClause
    | cleanTabletSchedQClause
    | decommissionDiskClause
    | cancelDecommissionDiskClause
    | disableDiskClause
    | cancelDisableDiskClause

    //Alter table clause
    | createIndexClause
    | dropIndexClause
    | tableRenameClause
    | swapTableClause
    | modifyPropertiesClause
    | addColumnClause
    | addColumnsClause
    | dropColumnClause
    | alterTableDictColumnsClause
    | addPartitionColumnClause
    | dropPartitionColumnClause
    | replacePartitionColumnClause
    | modifyColumnCommentClause
    | modifyColumnClause
    | columnRenameClause
    | reorderColumnsClause
    | rollupRenameClause
    | compactionClause
    | modifyCommentClause
    | optimizeClause
    | addFieldClause
    | dropFieldClause
    | createOrReplaceBranchClause
    | createOrReplaceTagClause
    | dropBranchClause
    | dropTagClause
    | tableOperationClause
    | dropPersistentIndexClause
    | splitTabletClause
    | mergeTabletClause
    | alterTableAutoIncrementClause

    //Alter partition clause
    | addPartitionClause
    | dropPartitionClause
    | distributionClause
    | alterModifyDefaultBuckets
    | truncatePartitionClause
    | modifyPartitionClause
    | replacePartitionClause
    | partitionRenameClause
    ;

// ---------Alter system clause---------

addFrontendClause
   : ADD (FOLLOWER | OBSERVER) string
   ;

dropFrontendClause
   : DROP (FOLLOWER | OBSERVER) string
   ;

modifyFrontendHostClause
  : MODIFY FRONTEND HOST string TO string
  ;

transferLeaderClause
  : TRANSFER LEADER TO string (FORCE)?
  ;

addBackendClause
   : ADD BACKEND string (COMMA string)* (INTO WAREHOUSE warehouseName=identifierOrString (CNGROUP cngroupName=identifierOrString)?)?
   ;

dropBackendClause
   : DROP BACKEND string (COMMA string)* (FROM WAREHOUSE warehouseName=identifierOrString (CNGROUP cngroupName=identifierOrString)?)? FORCE?
   ;

decommissionBackendClause
   : DECOMMISSION BACKEND string (COMMA string)*
   ;

modifyBackendClause
   : MODIFY BACKEND HOST string TO string
   | MODIFY BACKEND string SET propertyList
   ;

addComputeNodeClause
   : ADD COMPUTE NODE string (COMMA string)* (INTO WAREHOUSE warehouseName=identifierOrString (CNGROUP cngroupName=identifierOrString)?)?
   ;

dropComputeNodeClause
   : DROP COMPUTE NODE string (COMMA string)* (FROM WAREHOUSE warehouseName=identifierOrString (CNGROUP cngroupName=identifierOrString)?)?
   ;

modifyBrokerClause
    : ADD BROKER identifierOrString string (COMMA string)*
    | DROP BROKER identifierOrString string (COMMA string)*
    | DROP ALL BROKER identifierOrString
    ;

alterLoadErrorUrlClause
    : SET LOAD ERRORS HUB properties?
    ;

createImageClause
    : CREATE IMAGE
    ;

cleanTabletSchedQClause
    : CLEAN TABLET SCHEDULER QUEUE
    ;

decommissionDiskClause
    : DECOMMISSION DISK string (COMMA string)* ON BACKEND string
    ;

cancelDecommissionDiskClause
    : CANCEL DECOMMISSION DISK string (COMMA string)* ON BACKEND string
    ;

disableDiskClause
    : DISABLE DISK string (COMMA string)* ON BACKEND string
    ;

cancelDisableDiskClause
    : CANCEL DISABLE DISK string (COMMA string)* ON BACKEND string
    ;

// ---------Alter table clause---------

createIndexClause
    : ADD INDEX indexName=identifier identifierList (indexType propertyList?)? comment?
    ;

dropIndexClause
    : DROP INDEX indexName=identifier
    ;

tableRenameClause
    : RENAME identifier
    ;

swapTableClause
    : SWAP WITH identifier
    ;

modifyPropertiesClause
    : SET propertyList
    ;

modifyCommentClause
    : COMMENT '=' string
    ;

optimizeRange
    : BETWEEN start=string AND end=string
    ;

optimizeClause
    : partitionNames?
      keyDesc?
      partitionDesc?
      orderByDesc?
      distributionDesc?
      optimizeRange?
     ;

addColumnClause
    : ADD COLUMN columnDesc (FIRST | AFTER identifier)? ((TO | IN) rollupName=identifier)? properties?
    ;

addPartitionColumnClause
    : ADD PARTITION COLUMN expressionList
    ;

addColumnsClause
    : ADD COLUMN LEFT_PAREN columnDesc (COMMA columnDesc)* RIGHT_PAREN ((TO | IN) rollupName=identifier)? properties?
    ;

dropColumnClause
    : DROP COLUMN identifier (FROM rollupName=identifier)? properties?
    ;

alterTableDictColumnsClause
    : (ENABLE | DISABLE) DICTIONARY LEFT_PAREN identifier (COMMA identifier)* RIGHT_PAREN
    ;

dropPartitionColumnClause
    : DROP PARTITION COLUMN expressionList
    ;

replacePartitionColumnClause
    : REPLACE PARTITION COLUMN oldPartitionExpr=expression WITH newPartitionExpr=expression
    ;

modifyColumnClause
    : MODIFY COLUMN columnDesc (FIRST | AFTER identifier)? (FROM rollupName=identifier)? properties?
    ;

modifyColumnCommentClause
    : MODIFY COLUMN identifier comment
    ;

columnRenameClause
    : RENAME COLUMN oldColumn=identifier TO newColumn=identifier
    ;

reorderColumnsClause
    : ORDER BY identifierList (FROM rollupName=identifier)? properties?
    ;

rollupRenameClause
    : RENAME ROLLUP rollupName=identifier newRollupName=identifier
    ;

compactionClause
    : (BASE | CUMULATIVE)? COMPACT (identifier | identifierList)?
    ;

subfieldName
    : identifier | ARRAY_ELEMENT
    ;

nestedFieldName
    : subfieldName (DOT_IDENTIFIER | DOT subfieldName)*
    ;

addFieldClause
    : MODIFY COLUMN identifier ADD FIELD subfieldDesc (FIRST | AFTER identifier)? properties?
    ;

dropFieldClause
    : MODIFY COLUMN identifier DROP FIELD nestedFieldName properties?
    ;

createOrReplaceTagClause
    : (CREATE OR)? REPLACE TAG identifier tagOptions
    | CREATE TAG (IF NOT EXISTS)? identifier tagOptions
    ;

createOrReplaceBranchClause
    : (CREATE OR)? REPLACE BRANCH identifier branchOptions
    | CREATE BRANCH (IF NOT EXISTS)? identifier branchOptions
    ;

dropBranchClause
    : DROP BRANCH (IF EXISTS)? identifier
    ;

dropTagClause
    : DROP TAG (IF EXISTS)? identifier
    ;

tableOperationClause
    : EXECUTE tableOperationArg
    ;

tableOperationArg
    : identifier LEFT_PAREN (argumentList)? RIGHT_PAREN (WHERE expression)?
    ;

tagOptions
    : (AS OF VERSION snapshotId)? (refRetain)?
    ;

branchOptions
    : (AS OF VERSION snapshotId)? (refRetain)? (snapshotRetention)?
    ;

snapshotRetention
    : WITH SNAPSHOT RETENTION minSnapshotsToKeep
    | WITH SNAPSHOT RETENTION maxSnapshotAge
    | WITH SNAPSHOT RETENTION minSnapshotsToKeep maxSnapshotAge
    ;

refRetain
    : RETAIN number timeUnit
    ;

maxSnapshotAge
    : number timeUnit
    ;

minSnapshotsToKeep
    : number SNAPSHOTS
    ;

snapshotId
    : number
    ;

timeUnit
    : DAYS
    | HOURS
    | MINUTES
    ;

integer_list
    : LEFT_PAREN INTEGER_VALUE (COMMA INTEGER_VALUE)* RIGHT_PAREN
    ;

dropPersistentIndexClause
    : DROP PERSISTENT INDEX ON TABLETS integer_list
    ;

splitTabletClause
    : SPLIT
      (((TABLET | TABLETS) partitionNames?) | tabletList)
      properties?
    ;

mergeTabletClause
    : MERGE
      (((TABLET | TABLETS) partitionNames?) | tabletGroupList)
      properties?
    ;

tabletGroupList
    : (TABLET | TABLETS) integer_list+
    ;

alterTableAutoIncrementClause
    : AUTO_INCREMENT '=' INTEGER_VALUE
    ;

// ---------Alter partition clause---------

addPartitionClause
    : ADD TEMPORARY? (singleRangePartition | PARTITIONS multiRangePartition) distributionDesc? properties?
    | ADD TEMPORARY? (singleItemListPartitionDesc | multiItemListPartitionDesc) distributionDesc? properties?
    ;

dropPartitionClause
    : DROP TEMPORARY? (PARTITION (IF EXISTS)? identifier | PARTITIONS (IF EXISTS)? identifierList) FORCE?
    | DROP TEMPORARY? PARTITIONS (IF EXISTS)? multiRangePartition FORCE?
    | DROP TEMPORARY? PARTITIONS (IF EXISTS)? WHERE where=expression FORCE?
    | DROP ALL TEMPORARY PARTITIONS FORCE?
    ;

truncatePartitionClause
    : TRUNCATE partitionNames
    ;

modifyPartitionClause
    : MODIFY PARTITION (identifier | identifierList | LEFT_PAREN ASTERISK_SYMBOL RIGHT_PAREN) SET propertyList
    | MODIFY PARTITION distributionDesc
    ;

replacePartitionClause
    : REPLACE parName=partitionNames WITH tempParName=partitionNames properties?
    ;

partitionRenameClause
    : RENAME PARTITION parName=identifier newParName=identifier
    ;

// ------------------------------------------- DML Statement -----------------------------------------------------------

insertStatement
    : explainDesc? INSERT (INTO | OVERWRITE) (qualifiedName writeBranch? partitionNames? | (FILES propertyList) | (BLACKHOLE LEFT_PAREN RIGHT_PAREN))
        insertLabelOrColumnAliases* properties?
        (queryStatement | (VALUES expressionsWithDefault (COMMA expressionsWithDefault)*))
    ;

// for compatibility with the case 'LABEL before columnAliases'
insertLabelOrColumnAliases
    : columnAliasesOrByName
    | WITH LABEL label=identifier
    ;

columnAliasesOrByName
    : columnAliases
    | BY NAME
    ;

updateStatement
    : explainDesc? withClause? UPDATE qualifiedName SET assignmentList fromClause (WHERE where=expression)?
    ;

deleteStatement
    : explainDesc? withClause? DELETE FROM qualifiedName partitionNames? (USING using=relations)? (WHERE where=expression)?
    ;

mergeIntoStatement
    : explainDesc? MERGE INTO qualifiedName (AS? targetAlias=identifier)?
      USING relation (AS? sourceAlias=identifier)?
      ON mergeCondition=expression
      mergeWhenClause+
    ;

mergeWhenClause
    : WHEN MATCHED (AND matchedCondition=expression)? THEN mergeMatchedAction       #mergeWhenMatched
    | WHEN NOT MATCHED (AND notMatchedCondition=expression)? THEN mergeNotMatchedAction   #mergeWhenNotMatched
    ;

mergeMatchedAction
    : UPDATE SET assignmentList      #mergeMatchedUpdate
    | DELETE                         #mergeMatchedDelete
    ;

mergeNotMatchedAction
    : INSERT ASTERISK_SYMBOL                                                                    #mergeNotMatchedInsertStar
    | INSERT (LEFT_PAREN cols+=identifier (COMMA cols+=identifier)* RIGHT_PAREN)? VALUES LEFT_PAREN expressionList RIGHT_PAREN   #mergeNotMatchedInsertValues
    ;

// ------------------------------------------- Routine Statement -----------------------------------------------------------
createRoutineLoadStatement
    : CREATE ROUTINE LOAD (db=qualifiedName DOT)? name=identifier ON table=qualifiedName
        loadPropertiesExpr
        jobProperties?
        FROM source=identifier
        dataSourceProperties?
    ;

alterRoutineLoadStatement
    : ALTER ROUTINE LOAD FOR (db=qualifiedName DOT)? name=identifier
        loadPropertiesExpr
        jobProperties?
        dataSource?
    ;

loadPropertiesExpr
    : (loadProperties (COMMA loadProperties)*)?
    ;

dataSource
    : FROM source=identifier dataSourceProperties
    ;

loadProperties
    : colSeparatorProperty
    | rowDelimiterProperty
    | importColumns
    | includeMetadata
    | WHERE expression
    | partitionNames
    ;

colSeparatorProperty
    : COLUMNS TERMINATED BY string
    ;

rowDelimiterProperty
    : ROWS TERMINATED BY string
    ;

importColumns
    : COLUMNS columnProperties
    ;

columnProperties
    : LEFT_PAREN
        (qualifiedName | assignment) (COMMA (qualifiedName | assignment))*
      RIGHT_PAREN
    ;

includeMetadata
    : INCLUDE METADATA LEFT_PAREN metadataItem (COMMA metadataItem)* RIGHT_PAREN
    ;

metadataItem
    : metaKey (AS alias=identifier)?
    ;

metaKey
    : KEY | PARTITION | identifier
    ;

jobProperties
    : properties
    ;

dataSourceProperties
    : propertyList
    ;

stopRoutineLoadStatement
    : STOP ROUTINE LOAD FOR (db=qualifiedName DOT)? name=identifier
    ;

resumeRoutineLoadStatement
    : RESUME ROUTINE LOAD FOR (db=qualifiedName DOT)? name=identifier
    ;

pauseRoutineLoadStatement
    : PAUSE ROUTINE LOAD FOR (db=qualifiedName DOT)? name=identifier
    ;

showRoutineLoadStatement
    : SHOW ALL? ROUTINE LOAD (FOR (db=qualifiedName DOT)? name=identifier)?
        (FROM db=qualifiedName)? showPredicateClauses
    ;

showRoutineLoadTaskStatement
    : SHOW ROUTINE LOAD TASK
        (FROM db=qualifiedName)? showPredicateClauses
    ;

showCreateRoutineLoadStatement
    : SHOW CREATE ROUTINE LOAD (db=qualifiedName DOT)? name=identifier showPredicateClauses
    ;

showStreamLoadStatement
    : SHOW ALL? STREAM LOAD (FOR (db=qualifiedName DOT)? name=identifier)?
        (FROM db=qualifiedName)? showPredicateClauses
    ;
// ------------------------------------------- Analyze Statement -------------------------------------------------------

analyzeStatement
    : ANALYZE (FULL | SAMPLE)? TABLE tableName analyzeColumnClause? partitionNames?
        (WITH (SYNC | ASYNC) MODE)?
        properties?
    ;

analyzeColumnClause
    : LEFT_PAREN qualifiedName  (COMMA qualifiedName)* RIGHT_PAREN               #regularColumns
    | qualifiedName  (COMMA qualifiedName)*                       #regularColumns
    | ALL COLUMNS                                               #allColumns
    | PREDICATE COLUMNS                                         #predicateColumns
    | MULTIPLE COLUMNS LEFT_PAREN qualifiedName  (COMMA qualifiedName)* RIGHT_PAREN #multiColumnSet
    ;

dropStatsStatement
    : DROP (MULTIPLE COLUMNS)? STATS qualifiedName
    ;

histogramStatement:
    ANALYZE TABLE tableName UPDATE HISTOGRAM ON analyzeColumnClause
        (WITH bucket=INTEGER_VALUE BUCKETS)?
        properties?
    ;

analyzeHistogramStatement
    : histogramStatement
        (WITH (SYNC | ASYNC) MODE)?
    ;

dropHistogramStatement
    : ANALYZE TABLE qualifiedName DROP HISTOGRAM ON qualifiedName (COMMA qualifiedName)*
    ;

createAnalyzeStatement
    : CREATE ANALYZE (FULL | SAMPLE)? ALL properties?
    | CREATE ANALYZE (FULL | SAMPLE)? DATABASE db=identifier properties?
    | CREATE ANALYZE (FULL | SAMPLE)? (IF NOT EXISTS)? TABLE qualifiedName (LEFT_PAREN qualifiedName (COMMA qualifiedName)* RIGHT_PAREN)? properties?
    | CREATE histogramStatement
    ;

dropAnalyzeJobStatement
    : DROP ANALYZE INTEGER_VALUE
    | DROP ALL ANALYZE JOB
    ;

showAnalyzeStatement
    : SHOW ANALYZE (JOB | STATUS)? showPredicateClauses
    ;

showStatsMetaStatement
    : SHOW (MULTIPLE COLUMNS)? STATS META showPredicateClauses
    ;

showHistogramMetaStatement
    : SHOW HISTOGRAM META showPredicateClauses
    ;

killAnalyzeStatement
    : KILL ANALYZE (INTEGER_VALUE | userVariable)
    | KILL ALL PENDING ANALYZE
    ;

// ----------------------------------------- Analyze Profile Statement -------------------------------------------------

analyzeProfileStatement
    : ANALYZE PROFILE FROM string
    | ANALYZE PROFILE FROM string COMMA INTEGER_VALUE (COMMA INTEGER_VALUE)*
    | ANALYZE PROFILE FROM LAST_QUERY_ID LEFT_PAREN RIGHT_PAREN
    | ANALYZE PROFILE FROM LAST_QUERY_ID LEFT_PAREN RIGHT_PAREN COMMA INTEGER_VALUE (COMMA INTEGER_VALUE)*
    ;


// ----------------------------------------- SQL Plan Manager Statement -------------------------------------------------
createBaselinePlanStatement
    : CREATE GLOBAL? BASELINE (ON queryRelation)? USING queryRelation properties?
    ;

dropBaselinePlanStatement
    : DROP BASELINE INTEGER_VALUE (COMMA INTEGER_VALUE)*
    ;

showBaselinePlanStatement
    : SHOW BASELINE showPredicateClauses
    | SHOW BASELINE ON queryRelation
    ;

disableBaselinePlanStatement
    : DISABLE BASELINE INTEGER_VALUE (COMMA INTEGER_VALUE)*
    ;

enableBaselinePlanStatement
    : ENABLE BASELINE INTEGER_VALUE (COMMA INTEGER_VALUE)*
    ;

// ------------------------------------------- Work Group Statement ----------------------------------------------------

createResourceGroupStatement
    : CREATE RESOURCE GROUP (IF NOT EXISTS)? (OR REPLACE)? identifier
        (TO classifier (COMMA classifier)*)?  WITH LEFT_PAREN property (COMMA property)* RIGHT_PAREN
    ;

dropResourceGroupStatement
    : DROP RESOURCE GROUP (IF EXISTS)? identifier
    ;

alterResourceGroupStatement
    : ALTER RESOURCE GROUP identifier ADD classifier (COMMA classifier)*
    | ALTER RESOURCE GROUP identifier DROP LEFT_PAREN INTEGER_VALUE (COMMA INTEGER_VALUE)* RIGHT_PAREN
    | ALTER RESOURCE GROUP identifier DROP ALL
    | ALTER RESOURCE GROUP identifier WITH LEFT_PAREN property (COMMA property)* RIGHT_PAREN
    ;

showResourceGroupStatement
    : SHOW VERBOSE? RESOURCE GROUP identifier showPredicateClauses
    | SHOW VERBOSE? RESOURCE GROUPS ALL? showPredicateClauses
    ;

showResourceGroupUsageStatement
    : SHOW USAGE RESOURCE GROUP identifier showPredicateClauses
    | SHOW USAGE RESOURCE GROUPS showPredicateClauses
    ;

createResourceStatement
    : CREATE EXTERNAL? RESOURCE resourceName=identifierOrString properties?
    ;

alterResourceStatement
    : ALTER RESOURCE resourceName=identifierOrString SET properties
    ;

dropResourceStatement
    : DROP RESOURCE resourceName=identifierOrString
    ;

showResourceStatement
    : SHOW RESOURCES showPredicateClauses
    ;

classifier
    : LEFT_PAREN expressionList RIGHT_PAREN
    ;

// ------------------------------------------- UDF Statement ----------------------------------------------------

showFunctionsStatement
    : SHOW FULL? (BUILTIN|GLOBAL)? FUNCTIONS ((FROM | IN) db=qualifiedName)? (LIKE pattern=string)? showPredicateClauses
    ;

showCreateFunctionStatement
    : SHOW CREATE GLOBAL? FUNCTION qualifiedName LEFT_PAREN typeList RIGHT_PAREN
    ;

dropFunctionStatement
    : DROP GLOBAL? FUNCTION (IF EXISTS)?  qualifiedName LEFT_PAREN typeList RIGHT_PAREN
    ;

createFunctionStatement
    : CREATE orReplace GLOBAL? functionType=(TABLE | AGGREGATE)? FUNCTION ifNotExists qualifiedName LEFT_PAREN typeList RIGHT_PAREN RETURNS returnType=type (properties|inlineProperties)?? inlineFunction? #createUdfFunctionStmt
    | CREATE orReplace GLOBAL? FUNCTION ifNotExists qualifiedName LEFT_PAREN functionArgsList RIGHT_PAREN RETURNS expression #createInternalFunctionStmt
    ;
inlineFunction
    : AS ATTACHMENT
    ;

typeList
    : type?  ( COMMA type)* (COMMA DOTDOTDOT) ?
    ;

functionArgsList
    : (identifier type)? (COMMA identifier type)*
    ;

// ------------------------------------------- Load Statement ----------------------------------------------------------

loadStatement
    : LOAD LABEL label=labelName
        data=dataDescList?
        broker=brokerDesc?
        (BY system=identifierOrString)?
        (PROPERTIES props=propertyList)?
    | LOAD LABEL label=labelName
        data=dataDescList?
        resource=resourceDesc
        (PROPERTIES props=propertyList)?
    ;

labelName
    : (db=identifier DOT)? label=identifier
    ;

dataDescList
    : LEFT_PAREN dataDesc (COMMA dataDesc)* RIGHT_PAREN
    ;

dataDesc
    : DATA INFILE srcFiles=stringList
        NEGATIVE?
        INTO TABLE dstTableName=identifier
        partitions=partitionNames?
        (COLUMNS TERMINATED BY colSep=string)?
        (ROWS TERMINATED BY rowSep=string)?
        format=fileFormat?
        (formatPropsField=formatProps)?
        colList=columnAliases?
        (COLUMNS FROM PATH AS colFromPath=identifierList)?
        (SET colMappingList=classifier)?
        (WHERE where=expression)?
    | DATA FROM TABLE srcTableName=identifier
        NEGATIVE?
        INTO TABLE dstTableName=identifier
        partitions=partitionNames?
        (SET colMappingList=classifier)?
        (WHERE where=expression)?
    ;

formatProps
    :  LEFT_PAREN
            (SKIP_HEADER '=' INTEGER_VALUE)?
            (TRIM_SPACE '=' booleanValue)?
            (ENCLOSE '=' encloseCharacter=string)?
            (ESCAPE '=' escapeCharacter=string)?
        RIGHT_PAREN
    ;

brokerDesc
    : WITH BROKER props=propertyList?
    | WITH BROKER name=identifierOrString props=propertyList?
    ;

resourceDesc
    : WITH RESOURCE name=identifierOrString props=propertyList?
    ;

showLoadStatement
    : SHOW LOAD (ALL)? (FROM identifier)? showPredicateClauses
    ;

showLoadWarningsStatement
    : SHOW LOAD WARNINGS (FROM identifier)? showPredicateClauses
    | SHOW LOAD WARNINGS ON string showPredicateClauses
    ;

cancelLoadStatement
    : CANCEL LOAD (FROM identifier)? (WHERE expression)?
    ;

alterLoadStatement
    : ALTER LOAD FOR (db=qualifiedName DOT)? name=identifier
        jobProperties?
    ;

// ------------------------------------------- Compaction Statement ----------------------------------------------------------

cancelCompactionStatement
    : CANCEL COMPACTION WHERE expression
    ;

// ------------------------------------------- Show Statement ----------------------------------------------------------

showAuthorStatement
    : SHOW AUTHORS showPredicateClauses
    ;

showBackendsStatement
    : SHOW BACKENDS showPredicateClauses
    ;

showBrokerStatement
    : SHOW BROKER showPredicateClauses
    ;

showCharsetStatement
    : SHOW (CHAR SET | CHARSET | CHARACTER SET) (LIKE pattern=string)? showPredicateClauses
    ;

showCollationStatement
    : SHOW COLLATION (LIKE pattern=string)? showPredicateClauses
    ;

showDeleteStatement
    : SHOW DELETE ((FROM | IN) db=qualifiedName)? showPredicateClauses
    ;

showDynamicPartitionStatement
    : SHOW DYNAMIC PARTITION TABLES ((FROM | IN) db=qualifiedName)? showPredicateClauses
    ;

showEventsStatement
    : SHOW EVENTS ((FROM | IN) catalog=qualifiedName)? (LIKE pattern=string)? showPredicateClauses
    ;

showEnginesStatement
    : SHOW ENGINES showPredicateClauses
    ;

showFrontendsStatement
    : SHOW FRONTENDS showPredicateClauses
    ;

showPluginsStatement
    : SHOW PLUGINS showPredicateClauses
    ;

showRepositoriesStatement
    : SHOW REPOSITORIES showPredicateClauses
    ;

showOpenTableStatement
    : SHOW OPEN TABLES showPredicateClauses
    ;
showPrivilegesStatement
    : SHOW PRIVILEGES showPredicateClauses
    ;

showProcedureStatement
    : SHOW (PROCEDURE | FUNCTION) STATUS (LIKE pattern=string)? showPredicateClauses
    ;

showProcStatement
    : SHOW PROC path=string
    ;

showProcesslistStatement
    : SHOW FULL? PROCESSLIST (FOR string)? showPredicateClauses
    ;

showProfilelistStatement
    : SHOW PROFILELIST showPredicateClauses
    ;

showRunningQueriesStatement
    : SHOW RUNNING QUERIES showPredicateClauses
    ;

showStatusStatement
    : SHOW varType? STATUS (LIKE pattern=string)? showPredicateClauses
    ;

showTabletStatement
    : SHOW TABLET INTEGER_VALUE
    | SHOW (TABLET | TABLETS) FROM qualifiedName partitionNames? showPredicateClauses
    ;

showTransactionStatement
    : SHOW TRANSACTION ((FROM | IN) db=qualifiedName)? showPredicateClauses
    ;

showTriggersStatement
    : SHOW FULL? TRIGGERS ((FROM | IN) catalog=qualifiedName)? (LIKE pattern=string)? showPredicateClauses
    ;

showUserPropertyStatement
    : SHOW PROPERTY (FOR string)? (LIKE string)? showPredicateClauses
    | SHOW PROPERTIES (FOR string)? (LIKE string)? showPredicateClauses
    ;

showVariablesStatement
    : SHOW varType? VARIABLES (LIKE pattern=string)? showPredicateClauses
    ;

showWarningStatement
    : SHOW (WARNINGS | ERRORS) showPredicateClauses
    ;

helpStatement
    : HELP identifierOrString
    ;

// ------------------------------------------- Authz Statement -----------------------------------------------------

createUserStatement
    : CREATE USER (IF NOT EXISTS)? user authOption? (DEFAULT ROLE roleList)? properties?
    ;

dropUserStatement
    : DROP USER (IF EXISTS)? user
    ;

alterUserStatement
    : ALTER USER (IF EXISTS)? user authOption
    | ALTER USER (IF EXISTS)? user DEFAULT ROLE (NONE| ALL | roleList)
    | ALTER USER (IF EXISTS)? user SET properties
    ;

showUserStatement
    : SHOW (USER | USERS) showPredicateClauses
    ;

showAuthenticationStatement
    : SHOW ALL AUTHENTICATION                                                                           #showAllAuthentication
    | SHOW AUTHENTICATION (FOR user)?                                                                   #showAuthenticationForUser
    ;

executeAsStatement
    : EXECUTE AS user (WITH NO REVERT)?
    ;

createRoleStatement
    : CREATE ROLE (IF NOT EXISTS)? roleList comment?
    ;

alterRoleStatement
    : ALTER ROLE (IF EXISTS)? roleList SET COMMENT '=' string
    ;

dropRoleStatement
    : DROP ROLE (IF EXISTS)? roleList
    ;

showRolesStatement
    : SHOW ROLES showPredicateClauses
    ;

grantRoleStatement
    : GRANT identifierOrStringList TO USER? user                                                        #grantRoleToUser
    | GRANT identifierOrStringList TO ROLE identifierOrString                                           #grantRoleToRole
    | GRANT identifierOrStringList TO EXTERNAL GROUP identifierOrString                                 #grantRoleToGroup
    ;

revokeRoleStatement
    : REVOKE identifierOrStringList FROM USER? user                                                     #revokeRoleFromUser
    | REVOKE identifierOrStringList FROM ROLE identifierOrString                                        #revokeRoleFromRole
    | REVOKE identifierOrStringList FROM EXTERNAL GROUP identifierOrString                              #revokeRoleFromGroup
    ;

setRoleStatement
    : SET ROLE DEFAULT
    | SET ROLE NONE
    | SET ROLE ALL (EXCEPT roleList)?
    | SET ROLE roleList
    ;

setDefaultRoleStatement
    : SET DEFAULT ROLE (NONE | ALL | roleList) TO user;

grantRevokeClause
    : (USER? user | ROLE identifierOrString)
    ;

grantPrivilegeStatement
    : GRANT IMPERSONATE ON USER user (COMMA user)* TO grantRevokeClause (WITH GRANT OPTION)?              #grantOnUser
    | GRANT privilegeTypeList ON SYSTEM TO grantRevokeClause (WITH GRANT OPTION)?                       #grantOnSystem
    | GRANT privilegeTypeList ON privObjectNameList TO grantRevokeClause (WITH GRANT OPTION)?           #grantOnTableBrief

    | GRANT privilegeTypeList ON GLOBAL? FUNCTION privFunctionObjectNameList
        TO grantRevokeClause (WITH GRANT OPTION)?                                                       #grantOnFunc
    | GRANT privilegeTypeList ON privObjectType privObjectNameList
        TO grantRevokeClause (WITH GRANT OPTION)?                                                       #grantOnPrimaryObj
    | GRANT privilegeTypeList ON ALL privObjectTypePlural
        (IN isAll=ALL DATABASES| IN DATABASE identifierOrString)? TO grantRevokeClause
        (WITH GRANT OPTION)?                                                                            #grantOnAll
    ;

revokePrivilegeStatement
    : REVOKE IMPERSONATE ON USER user (COMMA user)* FROM grantRevokeClause                                #revokeOnUser
    | REVOKE privilegeTypeList ON SYSTEM FROM grantRevokeClause                                         #revokeOnSystem
    | REVOKE privilegeTypeList ON privObjectNameList FROM grantRevokeClause                             #revokeOnTableBrief
    | REVOKE privilegeTypeList ON GLOBAL? FUNCTION privFunctionObjectNameList
        FROM grantRevokeClause                                                                          #revokeOnFunc
    | REVOKE privilegeTypeList ON privObjectType privObjectNameList
        FROM grantRevokeClause                                                                          #revokeOnPrimaryObj
    | REVOKE privilegeTypeList ON ALL privObjectTypePlural
        (IN isAll=ALL DATABASES| IN DATABASE identifierOrString)? FROM grantRevokeClause                #revokeOnAll
    ;

showGrantsStatement
    : SHOW GRANTS showPredicateClauses
    | SHOW GRANTS FOR USER? user showPredicateClauses
    | SHOW GRANTS FOR CURRENT_USER (LEFT_PAREN RIGHT_PAREN)? showPredicateClauses
    | SHOW GRANTS FOR EXTERNAL GROUP identifierOrString showPredicateClauses
    | SHOW GRANTS FOR ROLE identifierOrString showPredicateClauses
    ;

authOption
    : IDENTIFIED BY PASSWORD? string                                                                    #authWithoutPlugin
    | IDENTIFIED WITH identifierOrString ((BY | AS) string)?                                            #authWithPlugin
    ;

privObjectName
    : identifierOrStringOrStar (DOT identifierOrStringOrStar)?
    ;

privObjectNameList
    : privObjectName (COMMA privObjectName)*
    ;

privFunctionObjectNameList
    : qualifiedName LEFT_PAREN typeList RIGHT_PAREN (COMMA qualifiedName LEFT_PAREN typeList RIGHT_PAREN)*
    ;

privilegeTypeList
    :  privilegeType (COMMA privilegeType)*
    ;

privilegeType
    : ALL PRIVILEGES?
    | ALTER | APPLY | BLACKLIST
    | CREATE (
        DATABASE| TABLE| VIEW| FUNCTION| GLOBAL FUNCTION| MATERIALIZED VIEW|
        RESOURCE| RESOURCE GROUP| EXTERNAL CATALOG | STORAGE VOLUME | WAREHOUSE | CNGROUP | PIPE )
    | DELETE | DROP | EXPORT | FILE | IMPERSONATE | INSERT | GRANT | NODE | OPERATE | SECURITY
    | PLUGIN | REPOSITORY| REFRESH | SELECT | UPDATE | USAGE
    ;

privObjectType
    : CATALOG | DATABASE | MATERIALIZED VIEW | RESOURCE | RESOURCE GROUP | STORAGE VOLUME | SYSTEM | TABLE | VIEW | WAREHOUSE
    | PIPE
    ;

privObjectTypePlural
    : CATALOGS | DATABASES | FUNCTIONS | GLOBAL FUNCTIONS | MATERIALIZED VIEWS | POLICIES | RESOURCES | RESOURCE GROUPS
    | STORAGE VOLUMES | TABLES | USERS | VIEWS | WAREHOUSES | PIPES
    ;

// ------------------------------------------- Security Integration Statement ----------------------------------------------------

createSecurityIntegrationStatement
    : CREATE SECURITY INTEGRATION identifier properties
    ;

alterSecurityIntegrationStatement
    : ALTER SECURITY INTEGRATION identifier SET propertyList
    ;

dropSecurityIntegrationStatement
    : DROP SECURITY INTEGRATION identifier
    ;

showSecurityIntegrationStatement
    : SHOW SECURITY INTEGRATIONS showPredicateClauses
    ;

showCreateSecurityIntegrationStatement
    : SHOW CREATE SECURITY INTEGRATION identifier showPredicateClauses
    ;

// ------------------------------------------- Group Provider Statement ------------------------------------------

createGroupProviderStatement
    : CREATE GROUP PROVIDER (IF NOT EXISTS)? identifier properties
    ;

dropGroupProviderStatement
    : DROP GROUP PROVIDER (IF EXISTS)? identifier
    ;

showGroupProvidersStatement
    : SHOW GROUP PROVIDERS showPredicateClauses
    ;

showCreateGroupProviderStatement
    : SHOW CREATE GROUP PROVIDER identifier showPredicateClauses
    ;

// ---------------------------------------- Backup Restore Statement ---------------------------------------------------

backupStatement
    : BACKUP (ALL EXTERNAL CATALOGS | EXTERNAL (CATALOG | CATALOGS) identifierList)? (DATABASE dbName=identifier)?
    SNAPSHOT qualifiedName TO repoName=identifier
    (ON LEFT_PAREN backupRestoreObjectDesc (COMMA backupRestoreObjectDesc) * RIGHT_PAREN)?
    properties?
    ;

cancelBackupStatement
    : CANCEL BACKUP ((FROM | IN) identifier | FOR EXTERNAL CATALOG)?
    ;

showBackupStatement
    : SHOW BACKUP ((FROM | IN) identifier)? showPredicateClauses
    ;

restoreStatement
    : RESTORE SNAPSHOT qualifiedName
    FROM repoName=identifier
    (ALL EXTERNAL CATALOGS | EXTERNAL (CATALOG | CATALOGS) identifierWithAliasList)?
    (DATABASE dbName=identifier (AS dbAlias=identifier)?)?
    (ON LEFT_PAREN backupRestoreObjectDesc (COMMA backupRestoreObjectDesc) * RIGHT_PAREN)?
    properties?
    ;

cancelRestoreStatement
    : CANCEL RESTORE ((FROM | IN) identifier | FOR EXTERNAL CATALOG)?
    ;

showRestoreStatement
    : SHOW RESTORE ((FROM | IN) identifier)? showPredicateClauses
    ;

showSnapshotStatement
    : SHOW SNAPSHOT ON identifier showPredicateClauses
    ;

createRepositoryStatement
    : CREATE (READ ONLY)? REPOSITORY repoName=identifier
    WITH BROKER brokerName=identifierOrString?
    ON LOCATION location=string
    properties?
    ;

dropRepositoryStatement
    : DROP REPOSITORY identifier
    ;

dropSnapshotStatement
    : DROP SNAPSHOT snapshotName=identifier ON repoName=identifier FORCE?
    ;

// ------------------------------------ Sql BlackList And WhiteList Statement ------------------------------------------

addSqlBlackListStatement
    : ADD SQLBLACKLIST string
    ;

delSqlBlackListStatement
    : DELETE SQLBLACKLIST INTEGER_VALUE (COMMA INTEGER_VALUE)*
    ;

showSqlBlackListStatement
    : SHOW SQLBLACKLIST showPredicateClauses
    ;

showWhiteListStatement
    : SHOW WHITELIST showPredicateClauses
    ;

// ------------------------------------------- Sql Digest BlackList Statement ------------------------------------------

addSqlDigestBlackListStatement
    : ADD SQL DIGEST BLACKLIST identifier
    ;

delSqlDigestBlackListStatement
    : DELETE SQL DIGEST BLACKLIST identifier (COMMA identifier)*
    ;

showSqlDigestBlackListStatement
    : SHOW SQL DIGEST BLACKLIST showPredicateClauses
    ;


// ------------------------------------ backend BlackList Statement ---------------------------------------------------

addBackendBlackListStatement
    : ADD BACKEND BLACKLIST INTEGER_VALUE (COMMA INTEGER_VALUE)*
    ;

delBackendBlackListStatement
    : DELETE BACKEND BLACKLIST INTEGER_VALUE (COMMA INTEGER_VALUE)*
    ;

showBackendBlackListStatement
    : SHOW BACKEND BLACKLIST showPredicateClauses
    ;

// ------------------------------------ Compute Node BlackList Statement ---------------------------------------------------

addComputeNodeBlackListStatement
    : ADD COMPUTE NODE BLACKLIST INTEGER_VALUE (COMMA INTEGER_VALUE)*
    ;

delComputeNodeBlackListStatement
    : DELETE COMPUTE NODE BLACKLIST INTEGER_VALUE (COMMA INTEGER_VALUE)*
    ;

showComputeNodeBlackListStatement
    : SHOW COMPUTE NODE BLACKLIST showPredicateClauses
    ;

// -------------------------------------- DataCache Management Statement --------------------------------------------

dataCacheTarget
    : identifierOrStringOrStar DOT identifierOrStringOrStar DOT identifierOrStringOrStar
    ;

createDataCacheRuleStatement
    : CREATE DATACACHE RULE dataCacheTarget (WHERE expression)? PRIORITY '=' MINUS_SYMBOL? INTEGER_VALUE properties?
    ;

showDataCacheRulesStatement
    : SHOW DATACACHE RULES showPredicateClauses
    ;

dropDataCacheRuleStatement
    : DROP DATACACHE RULE INTEGER_VALUE
    ;

clearDataCacheRulesStatement
    : CLEAR DATACACHE RULES
    ;

dataCacheSelectStatement
    : CACHE SELECT selectItem (COMMA selectItem)* FROM qualifiedName (WHERE where=expression)? properties?
    ;

// ------------------------------------------- Export Statement --------------------------------------------------------

exportStatement
    : EXPORT TABLE tableDesc columnAliases? TO string (WITH (SYNC | ASYNC) MODE)? properties? brokerDesc?
    ;

cancelExportStatement
    : CANCEL EXPORT ((FROM | IN) catalog=qualifiedName)? ((LIKE pattern=string) | (WHERE expression))?
    ;

showExportStatement
    : SHOW EXPORT ((FROM | IN) catalog=qualifiedName)? (LIKE pattern=string)? showPredicateClauses
    ;

// ------------------------------------------- Plugin Statement --------------------------------------------------------

installPluginStatement
    : INSTALL PLUGIN (IF NOT EXISTS)? FROM identifierOrString properties?
    ;

uninstallPluginStatement
    : UNINSTALL PLUGIN (IF EXISTS)? identifierOrString
    ;

// ------------------------------------------- File Statement ----------------------------------------------------------

createFileStatement
    : CREATE FILE string ((FROM | IN) catalog=qualifiedName)? properties
    ;

dropFileStatement
    : DROP FILE string ((FROM | IN) catalog=qualifiedName)? properties
    ;

showSmallFilesStatement
    : SHOW FILE ((FROM | IN) catalog=qualifiedName)? showPredicateClauses
    ;

// -------------------------------------------- Pipe Statement ---------------------------------------------------------

createPipeStatement
    : CREATE orReplace PIPE ifNotExists qualifiedName
        properties?
        AS insertStatement
    ;

dropPipeStatement
    : DROP PIPE (IF EXISTS)? qualifiedName
    ;

alterPipeClause
    : SUSPEND |
        RESUME |
        RETRY ALL |
        RETRY FILE fileName=string |
        SET propertyList
    ;

alterPipeStatement
    : ALTER PIPE qualifiedName alterPipeClause
    ;

descPipeStatement
    : (DESC | DESCRIBE) PIPE qualifiedName
    ;

showPipeStatement
    : SHOW PIPES ((LIKE pattern=string) | (FROM qualifiedName))? showPredicateClauses
    ;


// ------------------------------------------- Set Statement -----------------------------------------------------------

setStatement
    : SET setVar (COMMA setVar)*
    ;

setVar
    : (CHAR SET | CHARSET | CHARACTER SET) (identifierOrString | DEFAULT)                       #setNames
    | NAMES (charset = identifierOrString | DEFAULT)
        (COLLATE (collate = identifierOrString | DEFAULT))?                                     #setNames
    | PASSWORD '=' (string | PASSWORD LEFT_PAREN string RIGHT_PAREN)                                           #setPassword
    | PASSWORD FOR user '=' (string | PASSWORD LEFT_PAREN string RIGHT_PAREN)                                  #setPassword
    | userVariable '=' expression                                                               #setUserVar
    | varType? identifier '=' setExprOrDefault                                                  #setSystemVar
    | systemVariable '=' setExprOrDefault                                                       #setSystemVar
    | varType? TRANSACTION transaction_characteristics                                          #setTransaction
    ;

transaction_characteristics
    : transaction_access_mode
    | isolation_level
    | transaction_access_mode COMMA isolation_level
    | isolation_level COMMA transaction_access_mode
    ;

transaction_access_mode
    : READ ONLY
    | READ WRITE
    ;

isolation_level
    : ISOLATION LEVEL isolation_types
    ;

isolation_types
    : READ UNCOMMITTED
    | READ COMMITTED
    | REPEATABLE READ
    | SERIALIZABLE
    ;

setExprOrDefault
    : DEFAULT
    | ON
    | ALL
    | expression
    ;

refreshConnectionsStatement
    : REFRESH CONNECTIONS (FORCE)?
    ;

setUserPropertyStatement
    : SET PROPERTY (FOR string)? userPropertyList
    ;

roleList
    : identifierOrString (COMMA identifierOrString)*
    ;

executeScriptStatement
    : ADMIN EXECUTE ON executeScriptTarget string
    ;

executeScriptTarget
    : FRONTEND
    | INTEGER_VALUE (COMMA INTEGER_VALUE)*
    | ALL BACKENDS
    | ALL COMPUTE NODES
    ;

unsupportedStatement
    : LOCK TABLES lock_item (COMMA lock_item)*
    | UNLOCK TABLES
    ;

lock_item
    : identifier (AS? alias=identifier)? lock_type
    ;

lock_type
    : READ LOCAL?
    | LOW_PRIORITY? WRITE
    ;

// ------------------------------------------- Plan Tuning Statement ---------------------------------------------------
alterPlanAdvisorAddStatement
    : ALTER PLAN ADVISOR ADD queryStatement;

truncatePlanAdvisorStatement
    : TRUNCATE PLAN ADVISOR;

alterPlanAdvisorDropStatement
    : ALTER PLAN ADVISOR DROP string;

showPlanAdvisorStatement
    : SHOW PLAN ADVISOR;

// ---------------------------------------- Warehouse Statement ---------------------------------------------------------

createWarehouseStatement
    : CREATE (WAREHOUSE) (IF NOT EXISTS)? warehouseName=identifierOrString
    comment? properties?
    ;

dropWarehouseStatement
    : DROP WAREHOUSE (IF EXISTS)? warehouseName=identifierOrString
    ;

suspendWarehouseStatement
    : SUSPEND WAREHOUSE (IF EXISTS)? identifier
    ;

resumeWarehouseStatement
    : RESUME WAREHOUSE (IF EXISTS)? identifier
    ;

setWarehouseStatement
    : SET SESSION? WAREHOUSE EQ? identifierOrString
    ;

showWarehousesStatement
    : SHOW WAREHOUSES (LIKE pattern=string)? showPredicateClauses
    ;

showClustersStatement
    : SHOW (CLUSTERS | CNGROUPS) FROM WAREHOUSE identifier showPredicateClauses
    ;

showNodesStatement
    : SHOW NODES FROM WAREHOUSES (LIKE pattern=string)? showPredicateClauses
    | SHOW NODES FROM WAREHOUSE identifier (CNGROUP cngroupName=identifierOrString)? showPredicateClauses
    ;

alterWarehouseStatement
    : ALTER WAREHOUSE warehouseName=identifierOrString modifyPropertiesClause
    ;

createCNGroupStatement
    : ALTER WAREHOUSE warehouseName=identifierOrString ADD CNGROUP (IF NOT EXISTS)? cngroupName=identifierOrString
    comment? properties?
    ;

dropCNGroupStatement
    : ALTER WAREHOUSE warehouseName=identifierOrString DROP CNGROUP (IF EXISTS)? cngroupName=identifierOrString FORCE?
    ;

enableCNGroupStatement
    : ALTER WAREHOUSE warehouseName=identifierOrString ENABLE CNGROUP cngroupName=identifierOrString
    ;

disableCNGroupStatement
    : ALTER WAREHOUSE warehouseName=identifierOrString DISABLE CNGROUP cngroupName=identifierOrString
    ;

alterCNGroupStatement
    : ALTER WAREHOUSE warehouseName=identifierOrString MODIFY CNGROUP cngroupName=identifierOrString modifyPropertiesClause
    ;

// ------------------------------------------- Transaction Statement ---------------------------------------------------

beginStatement
    : START TRANSACTION (WITH CONSISTENT SNAPSHOT)? (WITH LABEL label=identifier)?
    | BEGIN WORK? (WITH LABEL label=identifier)?
    ;

commitStatement
    : COMMIT WORK? (AND NO? CHAIN)? (NO? RELEASE)?
    ;

rollbackStatement
    : ROLLBACK WORK? (AND NO? CHAIN)? (NO? RELEASE)?
    ;


// ------------------------------------------- Translate Statement -----------------------------------------------------
translateStatement
    : TRANSLATE dialect translateSQL
    ;

dialect
    : identifier
    ;

translateSQL
    : .+
    ;

// ------------------------------------------- Call Procedure Statement ------------------------------------------------
callProcedureStatement
    : CALL qualifiedName LEFT_PAREN (argumentList)? RIGHT_PAREN
    ;

// ------------------------------------------- Query Statement ---------------------------------------------------------

queryStatement
    : (explainDesc | optimizerTrace) ? queryRelation outfile?;

queryRelation
    : withClause? queryNoWith
    ;

withClause
    : WITH RECURSIVE? commonTableExpression (COMMA commonTableExpression)*
    ;

queryNoWith
    : queryPrimary (ORDER BY sortItem (COMMA sortItem)*)? (limitElement)?
    ;

queryPeriod
    : FOR? periodType BETWEEN expression AND expression
    | FOR? periodType FROM expression TO expression
    | FOR? periodType ALL
    | FOR? periodType AS OF end=expression
    ;

periodType
    : SYSTEM_TIME
    | TIMESTAMP
    | VERSION
    ;

queryPrimary
    : querySpecification                                                                    #queryPrimaryDefault
    | subquery                                                                              #queryWithParentheses
    | left=queryPrimary operator=INTERSECT setQuantifier? right=queryPrimary                #setOperation
    | left=queryPrimary operator=(UNION | EXCEPT | MINUS)
        setQuantifier? right=queryPrimary                                                   #setOperation
    ;

subquery
    : LEFT_PAREN queryRelation RIGHT_PAREN
    ;

rowConstructor
     :LEFT_PAREN expressionList RIGHT_PAREN
     ;

sortItem
    : expression ordering = (ASC | DESC)? (NULLS nullOrdering=(FIRST | LAST))?
    | ALL ordering = (ASC | DESC)? (NULLS nullOrdering=(FIRST | LAST))?
    ;

limitConstExpr
    : INTEGER_VALUE
    | PARAMETER
    | userVariable
    ;

limitElement
    : LIMIT limit=limitConstExpr (OFFSET offset=limitConstExpr)?
    | LIMIT offset=limitConstExpr COMMA limit=limitConstExpr
    ;

querySpecification
    : SELECT setQuantifier? selectItem (COMMA selectItem)*
      fromClause
      ((WHERE where=expression)? (GROUP BY (groupByAll=ALL | groupingElement))? (HAVING having=expression)?
       (QUALIFY qualifyFunction=selectItem comparisonOperator limit=INTEGER_VALUE)?)
    ;

fromClause
    : (FROM relations pivotClause?)?                                                    #from
    | FROM DUAL                                                                         #dual
    ;

groupingElement
    : ROLLUP LEFT_PAREN (expressionList)? RIGHT_PAREN                                                  #rollup
    | CUBE LEFT_PAREN (expressionList)? RIGHT_PAREN                                                    #cube
    | GROUPING SETS LEFT_PAREN groupingSet (COMMA groupingSet)* RIGHT_PAREN                              #multipleGroupingSets
    | expressionList                                                                    #singleGroupingSet
    ;

groupingSet
    : LEFT_PAREN expression? (COMMA expression)* RIGHT_PAREN
    ;

commonTableExpression
    : name=identifier (columnAliases)? AS LEFT_PAREN queryRelation RIGHT_PAREN bracketHint?
    ;

setQuantifier
    : DISTINCT
    | ALL
    ;

selectItem
    : expression (AS? (identifier | string))?                                            #selectSingle
    | qualifiedName DOT ASTERISK_SYMBOL excludeClause?                                   #selectAll
    | ASTERISK_SYMBOL excludeClause?                                                     #selectAll
    ;

excludeClause
    : ( EXCEPT | EXCLUDE ) LEFT_PAREN identifier (COMMA identifier)* RIGHT_PAREN
    ;

relations
    : relation (COMMA LATERAL? relation)*
    ;

relation
    : relationPrimary joinRelation*
    | LEFT_PAREN relationPrimary joinRelation* RIGHT_PAREN
    ;

relationPrimary
    : qualifiedName queryPeriod? partitionNames? tabletList? replicaList? sampleClause? (
        AS? alias=identifier)? bracketHint? (BEFORE ts=string)?                          #tableAtom
    | LEFT_PAREN VALUES rowConstructor (COMMA rowConstructor)* RIGHT_PAREN
        (AS? alias=identifier columnAliases?)?                                          #inlineTable
    | ASSERT_ROWS? subquery (AS? alias=identifier columnAliases?)?                      #subqueryWithAlias
    | qualifiedName LEFT_PAREN expressionList RIGHT_PAREN
        (AS? alias=identifier columnAliases?)?                                          #tableFunction
    | TABLE LEFT_PAREN qualifiedName LEFT_PAREN argumentList RIGHT_PAREN RIGHT_PAREN
        (AS? alias=identifier columnAliases?)?                                          #normalizedTableFunction
    | FILES propertyList
        (AS? alias=identifier columnAliases?)?                                          #fileTableFunction
    | LEFT_PAREN relations RIGHT_PAREN                                                                 #parenthesizedRelation
    ;

pivotClause
    : PIVOT LEFT_PAREN pivotAggregationExpression (COMMA pivotAggregationExpression)*
        FOR (identifier | identifierList) IN LEFT_PAREN pivotValue (COMMA pivotValue)* RIGHT_PAREN RIGHT_PAREN
    ;

pivotAggregationExpression
    : functionCall (AS? (identifier | string))?
    ;


pivotValue
    : (literalExpression | literalExpressionList) (AS? (identifier | string))?
    ;

sampleClause
    : SAMPLE propertyList?
    ;

argumentList
    : namedArgumentList
    | expressionList
    ;

namedArgumentList
    : namedArgument (COMMA namedArgument)*
    ;

namedArgument
    : identifier FAT_ARROW expression                                                        #namedArguments
    | identifier '=' expression                                                         #namedArguments
    ;

functionNamedArgumentList
    : functionNamedArgument (COMMA functionNamedArgument)*
    ;

functionNamedArgument
    : identifier FAT_ARROW expression
    ;

joinRelation
    : asofJoinType bracketHint?
            rightRelation=relationPrimary joinCriteria
    | crossOrInnerJoinType bracketHint?
            LATERAL? rightRelation=relationPrimary joinCriteria?
    | outerAndSemiJoinType bracketHint?
            LATERAL? rightRelation=relationPrimary joinCriteria
    ;

asofJoinType
    : ASOF JOIN
    | ASOF INNER JOIN
    | ASOF LEFT JOIN
    | ASOF LEFT OUTER JOIN
    ;

crossOrInnerJoinType
    : JOIN | INNER JOIN
    | CROSS | CROSS JOIN
    ;

outerAndSemiJoinType
    : LEFT JOIN | RIGHT JOIN | FULL JOIN
    | LEFT OUTER JOIN | RIGHT OUTER JOIN
    | FULL OUTER JOIN
    | LEFT SEMI JOIN | RIGHT SEMI JOIN
    | LEFT ANTI JOIN | RIGHT ANTI JOIN
    | NULL AWARE LEFT ANTI JOIN
    ;

bracketHint
    : LEFT_BRACKET identifier (COMMA identifier)* RIGHT_BRACKET
    | LEFT_BRACKET identifier '|' primaryExpression generalLiteralExpressionList
    ;

hintMap
    : k=identifierOrString EQ v=literalExpression
    ;

joinCriteria
    : ON expression
    | USING LEFT_PAREN identifier (COMMA identifier)* RIGHT_PAREN
    ;

columnAliases
    : LEFT_PAREN identifier (COMMA identifier)* RIGHT_PAREN
    ;

// partitionNames should not support string, it should be identifier here only for compatibility with historical bugs
partitionNames
    : TEMPORARY? (PARTITION | PARTITIONS) LEFT_PAREN identifierOrString (COMMA identifierOrString)* RIGHT_PAREN
    | TEMPORARY? (PARTITION | PARTITIONS) identifierOrString (COMMA identifierOrString)*
    | keyPartitions
    ;

keyPartitions
    : PARTITION LEFT_PAREN keyPartition (COMMA keyPartition)* RIGHT_PAREN                              #keyPartitionList
    ;

tabletList
    : (TABLET | TABLETS) LEFT_PAREN INTEGER_VALUE (COMMA INTEGER_VALUE)* RIGHT_PAREN
    | (TABLET | TABLETS) INTEGER_VALUE (COMMA INTEGER_VALUE)*
    ;

prepareStatement
    : PREPARE identifier FROM prepareSql
    ;

prepareSql
    : statement
    | SINGLE_QUOTED_TEXT
    ;

executeStatement
    : EXECUTE identifier (USING  '@'identifierOrString (COMMA '@'identifierOrString)*)?
    ;

deallocateStatement
    : (DEALLOCATE | DROP) PREPARE identifier
    ;

replicaList
    : REPLICA LEFT_PAREN INTEGER_VALUE (COMMA INTEGER_VALUE)* RIGHT_PAREN
    ;

// ------------------------------------------- Expression --------------------------------------------------------------

/**
 * Operator precedences are shown in the following list, from highest precedence to the lowest.
 *
 * !
 * - (unary minus), ~ (unary bit inversion)
 * ^
 * *, /, DIV, %, MOD
 * -, +
 * &
 * |
 * = (comparison), <=>, >=, >, <=, <, <>, !=, IS, LIKE, REGEXP
 * BETWEEN, CASE WHEN
 * NOT
 * AND, &&
 * XOR
 * OR, ||
 * = (assignment)
 */

expressionsWithDefault
    : LEFT_PAREN expressionOrDefault (COMMA expressionOrDefault)* RIGHT_PAREN
    ;

expressionOrDefault
    : expression | DEFAULT
    ;

mapExpressionList
    : mapExpression (COMMA mapExpression)*
    ;

mapExpression
    : key=expression ':' value=expression
    ;

expressionSingleton
    : expression EOF
    ;

expression
    : (BINARY)? booleanExpression                                                         #expressionDefault
    | NOT expression                                                                      #logicalNot
    | left=expression operator=(AND|LOGICAL_AND) right=expression                         #logicalBinary
    | left=expression operator=(OR|LOGICAL_OR) right=expression                           #logicalBinary
    ;

expressionList
    : expression (COMMA expression)*
    ;

booleanExpression
    : predicate                                                                           #booleanExpressionDefault
    | booleanExpression IS NOT? NULL                                                      #isNull
    | left = booleanExpression comparisonOperator right = predicate                       #comparison
    | booleanExpression comparisonOperator LEFT_PAREN queryRelation RIGHT_PAREN                          #scalarSubquery
    ;

predicate
    : valueExpression (predicateOperations[$valueExpression.ctx])?
    | tupleInSubquery
    ;

tupleInSubquery
    : LEFT_PAREN expression (COMMA expression)+ RIGHT_PAREN NOT? IN LEFT_PAREN queryRelation RIGHT_PAREN
    ;

predicateOperations [ParserRuleContext value]
    : NOT? IN integerList                                                                 #inIntegerList
    | NOT? IN stringList                                                                  #inStringList
    | NOT? IN LEFT_PAREN queryRelation RIGHT_PAREN                                                       #inSubquery
    | NOT? IN LEFT_PAREN expressionList RIGHT_PAREN                                                      #inList
    | NOT? BETWEEN lower = valueExpression AND upper = predicate                          #between
    | NOT? (LIKE | RLIKE | REGEXP) pattern=valueExpression                                #like
    ;

valueExpression
    : primaryExpression                                                                   #valueExpressionDefault
    | left = valueExpression operator = BITXOR right = valueExpression                    #arithmeticBinary
    | left = valueExpression operator = (
              ASTERISK_SYMBOL
            | SLASH_SYMBOL
            | PERCENT_SYMBOL
            | INT_DIV
            | MOD)
      right = valueExpression                                                             #arithmeticBinary
    | left = valueExpression operator = (PLUS_SYMBOL | MINUS_SYMBOL)
        right = valueExpression                                                           #arithmeticBinary
    | left = valueExpression operator = BITAND right = valueExpression                    #arithmeticBinary
    | left = valueExpression operator = BITOR right = valueExpression                     #arithmeticBinary
    | left = valueExpression operator = BIT_SHIFT_LEFT right = valueExpression              #arithmeticBinary
    | left = valueExpression operator = BIT_SHIFT_RIGHT right = valueExpression             #arithmeticBinary
    | left = valueExpression operator = BIT_SHIFT_RIGHT_LOGICAL right = valueExpression     #arithmeticBinary
    ;

primaryExpression
    : userVariable                                                                        #userVariableExpression
    | systemVariable                                                                      #systemVariableExpression
    | DICTIONARY_GET LEFT_PAREN expressionList RIGHT_PAREN                                               #dictionaryGetExpr
    | functionCall                                                                        #functionCallExpression
    | LEFT_BRACE FN functionCall RIGHT_BRACE                                                             #odbcFunctionCallExpression
    | primaryExpression COLLATE (identifier | string)                                     #collate
    | literalExpression                                                                   #literal
    | columnReference                                                                     #columnRef
    | base = primaryExpression (DOT_IDENTIFIER | DOT fieldName = identifier )             #dereference
    | primaryExpression DOUBLE_COLON type                                                 #typeCast
    | left = primaryExpression CONCAT right = primaryExpression                           #concat
    | operator = (MINUS_SYMBOL | PLUS_SYMBOL | BITNOT) primaryExpression                  #arithmeticUnary
    | operator = LOGICAL_NOT primaryExpression                                            #arithmeticUnary
    | LEFT_PAREN expression RIGHT_PAREN                                                                  #parenthesizedExpression
    | EXISTS LEFT_PAREN queryRelation RIGHT_PAREN                                                        #exists
    | subquery                                                                            #subqueryExpression
    | CAST LEFT_PAREN expression AS type RIGHT_PAREN                                                     #cast
    | CONVERT LEFT_PAREN expression COMMA type RIGHT_PAREN                                                 #convert
    | CASE caseExpr=expression whenClause+ (ELSE elseExpression=expression)? END          #simpleCase
    | CASE whenClause+ (ELSE elseExpression=expression)? END                              #searchedCase
    | arrayType? LEFT_BRACKET (expressionList)? RIGHT_BRACKET                                                #arrayConstructor
    | mapType LEFT_BRACE (mapExpressionList)? RIGHT_BRACE                                                #mapConstructor
    | MAP LEFT_BRACE (mapExpressionList)? RIGHT_BRACE                                                    #mapConstructor
    | value=primaryExpression LEFT_BRACKET index=valueExpression RIGHT_BRACKET                               #collectionSubscript
    | primaryExpression LEFT_BRACKET start=INTEGER_VALUE? ':' end=INTEGER_VALUE? RIGHT_BRACKET               #arraySlice
    | primaryExpression ARROW string                                                      #arrowExpression
    | (identifier | identifierList) ARROW expression                                       #lambdaFunctionExpr
    | identifierList ARROW LEFT_PAREN(expressionList)?RIGHT_PAREN                                         #lambdaFunctionExpr
    | left = primaryExpression NOT? matchOperator right = primaryExpression               #matchExpr
    ;

literalExpression
    : number                                                                              #numericLiteral
    | NULL                                                                                #nullLiteral
    | booleanValue                                                                        #booleanLiteral
    | (DATE | DATETIME) string                                                            #dateLiteral
    | string                                                                              #stringLiteral
    | interval                                                                            #intervalLiteral
    | binary                                                                              #binaryLiteral
    | PARAMETER                                                                           #Parameter
    ;

// can represents negative number along with other literal expression
generalLiteralExpression
    : literalExpression
    | MINUS_SYMBOL number
    ;

functionCall
    : EXTRACT LEFT_PAREN identifier FROM valueExpression RIGHT_PAREN                                     #extract
    | GROUPING LEFT_PAREN (expression (COMMA expression)*)? RIGHT_PAREN                                    #groupingOperation
    | GROUPING_ID LEFT_PAREN (expression (COMMA expression)*)? RIGHT_PAREN                                 #groupingOperation
    | informationFunctionExpression                                                       #informationFunction
    | specialDateTimeExpression                                                           #specialDateTime
    | specialFunctionExpression                                                           #specialFunction
    | aggregationFunction filter? over?                                                   #aggregationFunctionCall
    | windowFunction over                                                                 #windowFunctionCall
    | TRANSLATE LEFT_PAREN (expression (COMMA expression)*)? RIGHT_PAREN                                   #translateFunctionCall
    | TRIM LEFT_PAREN (trimType=(BOTH | LEADING | TRAILING))? (remstr=string)? FROM str=expression RIGHT_PAREN   #trimFunction
    | qualifiedName LEFT_PAREN functionNamedArgumentList RIGHT_PAREN                                     #namedArgsFunctionCall
    | qualifiedName LEFT_PAREN (expression (COMMA expression)*)? RIGHT_PAREN  over?                        #simpleFunctionCall
    ;

aggregationFunction
    : AVG LEFT_PAREN setQuantifier? expression RIGHT_PAREN
    | COUNT LEFT_PAREN ASTERISK_SYMBOL? RIGHT_PAREN
    | COUNT LEFT_PAREN (setQuantifier bracketHint?)? (expression (COMMA expression)*)? RIGHT_PAREN
    | MAX LEFT_PAREN setQuantifier? expression RIGHT_PAREN
    | MIN LEFT_PAREN setQuantifier? expression RIGHT_PAREN
    | SUM LEFT_PAREN setQuantifier? expression RIGHT_PAREN
    | ARRAY_AGG LEFT_PAREN setQuantifier? expression (ORDER BY sortItem (COMMA sortItem)*)? RIGHT_PAREN
    | ARRAY_AGG_DISTINCT LEFT_PAREN expression (ORDER BY sortItem (COMMA sortItem)*)? RIGHT_PAREN
    | GROUP_CONCAT LEFT_PAREN setQuantifier? expression (COMMA expression)* (ORDER BY sortItem (COMMA sortItem)*)? (SEPARATOR expression)? RIGHT_PAREN
    | STRING_AGG LEFT_PAREN setQuantifier? expression COMMA expression (ORDER BY sortItem (COMMA sortItem)*)? RIGHT_PAREN
    ;

userVariable
    : AT identifierOrString
    ;

systemVariable
    : AT AT (varType DOT)? identifier
    ;

columnReference
    : identifier
    ;

informationFunctionExpression
    : name = CATALOG LEFT_PAREN RIGHT_PAREN
    | name = DATABASE LEFT_PAREN RIGHT_PAREN
    | name = SCHEMA LEFT_PAREN RIGHT_PAREN
    | name = USER LEFT_PAREN RIGHT_PAREN
    | name = CURRENT_USER (LEFT_PAREN RIGHT_PAREN)?
    | name = CURRENT_ROLE (LEFT_PAREN RIGHT_PAREN)?
    | name = CURRENT_GROUP (LEFT_PAREN RIGHT_PAREN)?
    | name = CURRENT_WAREHOUSE (LEFT_PAREN RIGHT_PAREN)?
    ;

specialDateTimeExpression
    : name = CURRENT_DATE (LEFT_PAREN RIGHT_PAREN)?
    | name = CURRENT_TIME (LEFT_PAREN RIGHT_PAREN)?
    | name = CURRENT_TIMESTAMP (LEFT_PAREN (INTEGER_VALUE)? RIGHT_PAREN)?
    | name = LOCALTIME (LEFT_PAREN RIGHT_PAREN)?
    | name = LOCALTIMESTAMP (LEFT_PAREN RIGHT_PAREN)?
    ;

specialFunctionExpression
    : CHAR LEFT_PAREN expression RIGHT_PAREN
    | DAY LEFT_PAREN expression RIGHT_PAREN
    | HOUR LEFT_PAREN expression RIGHT_PAREN
    | IF LEFT_PAREN (expression (COMMA expression)*)? RIGHT_PAREN
    | LEFT LEFT_PAREN expression COMMA expression RIGHT_PAREN
    | LIKE LEFT_PAREN expression COMMA expression RIGHT_PAREN
    | MINUTE LEFT_PAREN expression RIGHT_PAREN
    | MOD LEFT_PAREN expression COMMA expression RIGHT_PAREN
    | MONTH LEFT_PAREN expression RIGHT_PAREN
    | QUARTER LEFT_PAREN expression RIGHT_PAREN
    | REGEXP LEFT_PAREN expression COMMA expression RIGHT_PAREN
    | REPLACE LEFT_PAREN (expression (COMMA expression)*)? RIGHT_PAREN
    | RIGHT LEFT_PAREN expression COMMA expression RIGHT_PAREN
    | RLIKE LEFT_PAREN expression COMMA expression RIGHT_PAREN
    | SECOND LEFT_PAREN expression RIGHT_PAREN
    | TIMESTAMPADD LEFT_PAREN unitIdentifier COMMA expression COMMA expression RIGHT_PAREN
    | TIMESTAMPDIFF LEFT_PAREN unitIdentifier COMMA expression COMMA expression RIGHT_PAREN
    //| WEEK LEFT_PAREN expression RIGHT_PAREN TODO: Support week(expr) function
    | YEAR LEFT_PAREN expression RIGHT_PAREN
    | PASSWORD LEFT_PAREN string RIGHT_PAREN
    | FLOOR LEFT_PAREN expression RIGHT_PAREN
    | CEIL LEFT_PAREN expression RIGHT_PAREN
    | LAST_QUERY_ID LEFT_PAREN RIGHT_PAREN
    ;

windowFunction
    : name = ROW_NUMBER LEFT_PAREN RIGHT_PAREN
    | name = RANK LEFT_PAREN RIGHT_PAREN
    | name = DENSE_RANK LEFT_PAREN RIGHT_PAREN
    | name = CUME_DIST LEFT_PAREN RIGHT_PAREN
    | name = PERCENT_RANK LEFT_PAREN RIGHT_PAREN
    | name = NTILE  LEFT_PAREN expression? RIGHT_PAREN
    | name = LEAD  LEFT_PAREN (expression ignoreNulls? (COMMA expression)*)? RIGHT_PAREN ignoreNulls?
    | name = LAG LEFT_PAREN (expression ignoreNulls? (COMMA expression)*)? RIGHT_PAREN ignoreNulls?
    | name = FIRST_VALUE LEFT_PAREN (expression ignoreNulls? (COMMA expression)*)? RIGHT_PAREN ignoreNulls?
    | name = LAST_VALUE LEFT_PAREN (expression ignoreNulls? (COMMA expression)*)? RIGHT_PAREN ignoreNulls?
    ;

whenClause
    : WHEN condition=expression THEN result=expression
    ;

filter
    : FILTER LEFT_PAREN WHERE expression RIGHT_PAREN
    ;

over
    : OVER LEFT_PAREN
        (bracketHint? PARTITION BY partition+=expression (COMMA partition+=expression)*)?
        (ORDER BY sortItem (COMMA sortItem)*)?
        windowFrame?
      RIGHT_PAREN
    ;

ignoreNulls
    : IGNORE NULLS
    ;

windowFrame
    : frameType=RANGE start=frameBound
    | frameType=ROWS start=frameBound
    | frameType=RANGE BETWEEN start=frameBound AND end=frameBound
    | frameType=ROWS BETWEEN start=frameBound AND end=frameBound
    ;

frameBound
    : UNBOUNDED boundType=PRECEDING                 #unboundedFrame
    | UNBOUNDED boundType=FOLLOWING                 #unboundedFrame
    | CURRENT ROW                                   #currentRowBound
    | expression boundType=(PRECEDING | FOLLOWING)  #boundedFrame
    ;

// ------------------------------------------- COMMON AST --------------------------------------------------------------

backupRestoreObjectDesc
    : backupRestoreTableDesc
    | (ALL (FUNCTION | FUNCTIONS) | (FUNCTION | FUNCTIONS) qualifiedName (AS identifier)?)
    | (ALL (TABLE | TABLES) | (TABLE | TABLES) backupRestoreTableDesc)
    | (ALL MATERIALIZED (VIEW | VIEWS) | MATERIALIZED (VIEW | VIEWS) qualifiedName (AS identifier)?)
    | (ALL (VIEW | VIEWS) | (VIEW | VIEWS) qualifiedName (AS identifier)?)
    ;

tableDesc
    : qualifiedName partitionNames?
    ;

backupRestoreTableDesc
    : qualifiedName partitionNames? (AS identifier)?
    ;

explainDesc
    : (DESC | DESCRIBE | EXPLAIN) (LOGICAL | ANALYZE | VERBOSE | COSTS | SCHEDULER)?
    ;

optimizerTrace
    : TRACE (ALL | LOGS | TIMES | VALUES | REASON) identifier?
    ;

partitionExpr
    : identifier
    | functionCall
    ;

partitionDesc
    : PARTITION BY RANGE identifierList LEFT_PAREN (rangePartitionDesc (COMMA rangePartitionDesc)*)? RIGHT_PAREN
    | PARTITION BY RANGE primaryExpression LEFT_PAREN (rangePartitionDesc (COMMA rangePartitionDesc)*)? RIGHT_PAREN
    | PARTITION BY LIST? identifierList LEFT_PAREN (listPartitionDesc (COMMA listPartitionDesc)*)? RIGHT_PAREN
    | PARTITION BY LIST? identifierList
    | PARTITION BY functionCall LEFT_PAREN (rangePartitionDesc (COMMA rangePartitionDesc)*)? RIGHT_PAREN
    | PARTITION BY functionCall
    | PARTITION BY partitionExpr (COMMA partitionExpr)*
    | PARTITION BY LEFT_PAREN partitionExpr (COMMA partitionExpr)* RIGHT_PAREN
    ;

listPartitionDesc
    : singleItemListPartitionDesc
    | multiItemListPartitionDesc
    ;

singleItemListPartitionDesc
    : PARTITION (IF NOT EXISTS)? identifier VALUES IN singleListPartitionValues propertyList?
    ;

multiItemListPartitionDesc
    : PARTITION (IF NOT EXISTS)? identifier VALUES IN  multiListPartitionValues propertyList?
    ;

multiListPartitionValues
    :LEFT_PAREN singleListPartitionValues (COMMA singleListPartitionValues)* RIGHT_PAREN // list partition values with multi partition columns: ('a, 'b', 'c'), ('d', 'e', 'f')
    ;

singleListPartitionValues
    : LEFT_PAREN listPartitionValue (COMMA listPartitionValue)* RIGHT_PAREN // list partition value: ('a, 'b', 'c')
    ;

listPartitionValues // list partition values which can be with single or multi partition columns
    : singleListPartitionValues
    | multiListPartitionValues
    ;

listPartitionValue
    : NULL | string
    ;

stringList
    : LEFT_PAREN string (COMMA string)* RIGHT_PAREN
    ;

integerList
    : LEFT_PAREN INTEGER_VALUE (COMMA INTEGER_VALUE)* RIGHT_PAREN
    ;

literalExpressionList
    : LEFT_PAREN literalExpression (COMMA literalExpression)* RIGHT_PAREN
    ;

generalLiteralExpressionList
    : LEFT_PAREN generalLiteralExpression (COMMA generalLiteralExpression)* RIGHT_PAREN
    ;

rangePartitionDesc
    : singleRangePartition
    | multiRangePartition
    ;

singleRangePartition
    : PARTITION (IF NOT EXISTS)? identifier VALUES partitionKeyDesc propertyList?
    ;

multiRangePartition
    : START LEFT_PAREN string RIGHT_PAREN END LEFT_PAREN string RIGHT_PAREN EVERY LEFT_PAREN interval RIGHT_PAREN
    | START LEFT_PAREN string RIGHT_PAREN END LEFT_PAREN string RIGHT_PAREN EVERY LEFT_PAREN INTEGER_VALUE RIGHT_PAREN
    ;

partitionRangeDesc
    : START LEFT_PAREN string RIGHT_PAREN END LEFT_PAREN string RIGHT_PAREN
    ;

partitionKeyDesc
    : LESS THAN (MAXVALUE | partitionValueList)
    | LEFT_BRACKET partitionValueList COMMA partitionValueList RIGHT_PAREN
    ;

partitionValueList
    : LEFT_PAREN partitionValue (COMMA partitionValue)* RIGHT_PAREN
    ;

keyPartition
    : partitionColName=identifier EQ partitionColValue=literalExpression
    ;

partitionValue
    : MAXVALUE | string
    ;

distributionClause
    : DISTRIBUTED BY HASH identifierList (BUCKETS INTEGER_VALUE)?
    | DISTRIBUTED BY HASH identifierList
    ;

distributionDesc
    : DISTRIBUTED BY HASH identifierList (BUCKETS INTEGER_VALUE)?
    | DISTRIBUTED BY HASH identifierList
    | DISTRIBUTED BY RANDOM (BUCKETS INTEGER_VALUE)?
    ;

alterModifyDefaultBuckets
    : DISTRIBUTED BY HASH identifierList DEFAULT BUCKETS INTEGER_VALUE
    ;

refreshSchemeDesc
    : REFRESH (IMMEDIATE | DEFERRED)? (ASYNC
    | (ASYNC | SCHEDULE) (START LEFT_PAREN string RIGHT_PAREN)? EVERY LEFT_PAREN interval RIGHT_PAREN
    | MANUAL)
    ;

statusDesc
    : ACTIVE
    | INACTIVE
    ;

properties
    : PROPERTIES propertyList
    ;

extProperties
    : BROKER properties
    ;

propertyList
    : LEFT_PAREN property (COMMA property)* RIGHT_PAREN
    ;

userPropertyList
    : property (COMMA property)*
    ;

property
    : key=string EQ value=string
    ;

inlineProperties
    : inlineProperty ( inlineProperty)*
    ;

inlineProperty
    : key=identifier EQ value=string
    ;

varType
    : GLOBAL
    | LOCAL
    | SESSION
    | VERBOSE
    ;

comment
    : COMMENT string
    ;

outfile
    : INTO OUTFILE file=string fileFormat? properties?
    ;

fileFormat
    : FORMAT AS (identifier | string)
    ;

string
    : SINGLE_QUOTED_TEXT
    | DOUBLE_QUOTED_TEXT
    ;

binary
    : BINARY_SINGLE_QUOTED_TEXT
    | BINARY_DOUBLE_QUOTED_TEXT
    ;

comparisonOperator
    : EQ | NEQ | LT | LTE | GT | GTE | EQ_FOR_NULL
    ;

matchOperator
    : MATCH
    | MATCH_ANY
    | MATCH_ALL
    ;

booleanValue
    : TRUE | FALSE
    ;

interval
    : INTERVAL value=expression from=unitIdentifier
    ;

taskInterval
    : INTERVAL value=expression from=taskUnitIdentifier
    ;

taskUnitIdentifier
    : DAY | HOUR | MINUTE | SECOND
    ;

unitIdentifier
    : YEAR | MONTH | WEEK | DAY | HOUR | MINUTE | SECOND | QUARTER | MILLISECOND | MICROSECOND
    ;

filesSchema
    : filesSchemaColumn (COMMA filesSchemaColumn)* EOF
    ;

filesSchemaColumn
    : identifier type
    ;

type
    : baseType
    | decimalType
    | arrayType
    | structType
    | mapType
    ;

arrayType
    : ARRAY '<' type '>'
    ;

mapType
    : MAP '<' type COMMA type '>'
    ;

subfieldDesc
    : (identifier | nestedFieldName) type
    ;

subfieldDescs
    : subfieldDesc (COMMA subfieldDesc)*
    ;

structType
    : STRUCT '<' subfieldDescs '>'
    ;

typeParameter
    : LEFT_PAREN INTEGER_VALUE RIGHT_PAREN
    ;

baseType
    : BOOLEAN
    | TINYINT typeParameter?
    | SMALLINT typeParameter?
    | SIGNED INT?
    | SIGNED INTEGER?
    | UNSIGNED INT?
    | UNSIGNED INTEGER?
    | INT typeParameter?
    | INTEGER typeParameter?
    | BIGINT typeParameter?
    | LARGEINT typeParameter?
    | FLOAT
    | DOUBLE
    | DATE
    | DATETIME
    | TIME
    | CHAR typeParameter?
    | VARCHAR typeParameter?
    | STRING
    | TEXT
    | BITMAP
    | HLL
    | PERCENTILE
    | JSON
    | VARIANT
    | VARBINARY typeParameter?
    | BINARY typeParameter?
    ;

decimalType
    : (DECIMAL | DECIMALV2 | DECIMAL32 | DECIMAL64 | DECIMAL128 | DECIMAL256 | NUMERIC | NUMBER )
        (LEFT_PAREN precision=INTEGER_VALUE (COMMA scale=INTEGER_VALUE)? RIGHT_PAREN)?
    ;

qualifiedName
    : identifier (DOT_IDENTIFIER | DOT identifier)*
    ;

tableName
    : qualifiedName
    ;

writeBranch
    : FOR? VERSION AS OF identifier
    ;

identifier
    : LETTER_IDENTIFIER      #unquotedIdentifier
    | nonReserved            #unquotedIdentifier
    | DIGIT_IDENTIFIER       #digitIdentifier
    | BACKQUOTED_IDENTIFIER  #backQuotedIdentifier
    ;

identifierWithAlias
    : originalName=identifier (AS alias=identifier)?
    ;

identifierWithAliasList
    : LEFT_PAREN identifierWithAlias (COMMA identifierWithAlias)* RIGHT_PAREN
    ;

identifierList
    : LEFT_PAREN identifier (COMMA identifier)* RIGHT_PAREN
    ;

identifierOrString
    : identifier
    | string
    ;

identifierOrStringList
    : identifierOrString (COMMA identifierOrString)*
    ;

identifierOrStringOrStar
    : ASTERISK_SYMBOL
    | identifier
    | string
    ;

user
    : identifierOrString                                     # userWithoutHost
    | identifierOrString '@' identifierOrString              # userWithHost
    | identifierOrString '@' LEFT_BRACKET identifierOrString RIGHT_BRACKET      # userWithHostAndBlanket
    ;

assignment
    : identifier EQ expressionOrDefault
    ;

assignmentList
    : assignment (COMMA assignment)*
    ;

number
    : INTEGER_VALUE  #integerValue
    | DECIMAL_VALUE  #decimalValue
    | DOUBLE_VALUE   #doubleValue
    ;

nonReserved
    : ACCESS | ACTIVE | ADVISOR | AFTER | AGGREGATE | APPLY | ASYNC | AUTHORS | AVG | ADMIN | ANTI | AUTHENTICATION | AUTO_INCREMENT | AUTOMATED
    | ARRAY_AGG | ARRAY_AGG_DISTINCT | ASSERT_ROWS | AWARE
    | BACKEND | BACKENDS | BACKUP | BEGIN | BITMAP_UNION | BLACKLIST | BLACKHOLE | BINARY | BODY | BOOLEAN | BRANCH | BROKER | BUCKETS | BOTH
    | BUILTIN | BASE | BEFORE | BASELINE
    | CACHE | CALL | CAST | CANCEL | CATALOG | CATALOGS | CEIL | CHAIN | CHARSET | CLEAN | CLEAR | CLUSTER | CLUSTERS | CNGROUP | CNGROUPS | CURRENT | COLLATION | COLUMNS
    | CUME_DIST | CUMULATIVE | COMMENT | COMMIT | COMMITTED | COMPUTE | CONNECTION | CONNECTIONS | CONSISTENT | COSTS | COUNT
    | CONFIG | COMPACT
    | DATA | DATE | DATACACHE | DATETIME | DAY | DAYS | DECOMMISSION | DIALECT | DIGEST | DISABLE | DISK | DISTRIBUTION | DUPLICATE | DYNAMIC | DISTRIBUTED | DICTIONARY | DICTIONARY_GET | DEALLOCATE
    | ENABLE | END | ENGINE | ENGINES | ERRORS | EVENTS | EXECUTE | EXTERNAL | EXTRACT | EVERY | ENCLOSE | ESCAPE | EXPORT
    | FAILPOINT | FAILPOINTS | FIELDS | FILE | FILTER | FIRST | FLOOR | FOLLOWING | FORMAT | FN | FRONTEND | FRONTENDS | FOLLOWER | FREE
    | FUNCTIONS
    | GLOBAL | GRANTS | GROUP_CONCAT
    | HASH | HISTOGRAM | HELP | HLL_UNION | HOST | HOUR | HOURS | HUB
    | IDENTIFIED | IMAGE | IMPERSONATE | INACTIVE | INCLUDE | INCREMENTAL | INDEXES | INSTALL | INTEGRATION | INTEGRATIONS | INTERMEDIATE
    | INTERVAL | ISOLATION
    | JOB
    | LABEL | LAST | LEADER | LESS | LEVEL | LIST | LOCAL | LOCATION | LOGS | LOGICAL | LOW_PRIORITY | LOCK | LOCATIONS | LEADING
    | MANUAL | MAP | MAPPING | MAPPINGS | MASKING | MATCH | MATCHED | MATCH_ANY | MATCH_ALL | MAPPINGS | MATERIALIZED | MAX | META | METADATA | MIN | MINUTE | MINUTES | MODE | MODIFY | MONTH | MERGE | MINUS | MULTIPLE
    | NAME | NAMES | NEGATIVE | NO | NODE | NODES | NONE | NULLS | NUMBER | NUMERIC
    | OBSERVER | OF | OFFSET | ONLY | OPTIMIZER | OPEN | OPERATE | OPTION | OVERWRITE | OFF
    | PARTITIONS | PASSWORD | PATH | PAUSE | PENDING | PERCENTILE_UNION | PIVOT | PLAN | PLUGIN | PLUGINS | POLICY | POLICIES
    | PERCENT_RANK | PREDICATE | PRECEDING | PRIORITY | PROC | PROCESSLIST | PROFILE | PROFILELIST | PROVIDER | PROVIDERS | PRIVILEGES | PROBABILITY | PROPERTIES | PROPERTY | PIPE | PIPES
    | QUARTER | QUERY | QUERIES | QUEUE | QUOTA | QUALIFY
    | REASON | REMOVE | REWRITE | RANDOM | RANK | RECOVER | REFRESH | REPAIR | REPEATABLE | REPLACE_IF_NOT_NULL | REPLICA | REPOSITORY
    | REPOSITORIES | RECURSIVE
    | RESOURCE | RESOURCES | RESTORE | RESUME | RETAIN | RETENTION | RETURNS | RETRY | REVERT | ROLE | ROLES | ROLLUP | ROLLBACK | ROUTINE | ROW | RUNNING | RULE | RULES
    | SAMPLE | SCHEDULE | SCHEDULER | SECOND | SECURITY | SEPARATOR | SERIALIZABLE |SEMI | SESSION | SETS | SIGNED | SNAPSHOT | SNAPSHOTS | SPLIT | SQL | SQLBLACKLIST | START | STARROCKS
    | STREAM | SUM | STATUS | STOP | SKIP_KW | SKIP_HEADER | SWAP
    | STORAGE| STRING | STRING_AGG | STRUCT | STATS | SUBMIT | SUSPEND | SYNC | SYSTEM | SYSTEM_TIME
    | TABLES | TABLET | TABLETS | TAG | TASK | TEMPORARY | TIMESTAMP | TIMESTAMPADD | TIMESTAMPDIFF | THAN | TIME | TIMES | TRANSACTION | TRANSFER | TRACE | TRANSLATE
    | TRIM_SPACE | TRAILING | TRIM
    | TRIGGERS | TRUNCATE | TYPE | TYPES
    | UNBOUNDED | UNCOMMITTED | UNSET | UNINSTALL | USAGE | USER | USERS | UNLOCK
    | VALUE | VARBINARY | VARIABLES | VARIANT | VIEW | VIEWS | VERBOSE | VERSION | VOLUME | VOLUMES
    | WARNINGS | WEEK | WHITELIST | WORK | WRITE  | WAREHOUSE | WAREHOUSES
    | YEAR
    | DOTDOTDOT | NGRAMBF | VECTOR
    | FIELD
    | ARRAY_ELEMENT
    | PERSISTENT
    | EXCLUDE | EXCEPT
    ;
