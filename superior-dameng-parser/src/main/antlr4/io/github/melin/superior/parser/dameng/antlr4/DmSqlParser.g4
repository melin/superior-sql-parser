parser grammar DmSqlParser;

options { tokenVocab=DmSqlLexer; }


dmprogram :
    sql_clauses (SEMI sql_clauses)* SEMI? EOF
    ;

sql_clauses :
    ddlsql
    | dmlsql
    | privsql
    | othersql
    | utilsql
    | explainsql
    | declare_block
    ;

ddlsql :
    alter_proc_stmt
    | alter_func_stmt
    | alter_package_stmt
    | alter_table_stmt
    | alter_index_stmt
    | comment_stmt
    | alter_trigger_stmt
    | alter_view_stmt
    | alter_materialized_view_stmt
    | refresh_materialized_view_stmt
    | create_tablespace_stmt
    | create_func_stmt
    | create_proc_stmt
    | create_trigger_stmt
    | create_view_stmt
    | create_materialized_view_stmt
    | create_materialized_view_log_stmt
    | alter_database_stmt
    | alter_tablespace_stmt
    | create_user_stmt
    | alter_user_stmt
    | create_profile_stmt
    | alter_profile_stmt
    | create_role_stmt
    | create_sequence_stmt
    | create_contextindex_stmt
    | drop_contextindex_stmt
    | alter_contextindex_stmt
    | create_audit_rule_stmt
    | create_dblink_stmt
    | create_package_stmt
    | create_package_body_stmt
    | create_type_stmt
    | create_type_body_stmt
    | create_synonym_stmt
    | create_crypto_stmt
    | alter_crypto_stmt
    | alter_session_stmt
    | create_domain_stmt
    | create_character_set_stmt
    | create_collation_stmt
    | alter_system_set_stmt
    | create_context_stmt
    | create_directory_stmt
    | create_tablespace_set_stmt
    | alter_tablespace_set_stmt
    | create_operator_stmt
    | drop_operator_stmt
    | flashback_tab_stmt
    ;

dmlsql :
    call_proc_stmt
    | delete_stmt
    | insert_stmt
    | select_stmt ur_option?
    | update_stmt
    | merge_into_stmt
    | trunc_table_stmt
    | create_table_stmt
    | drop_stmt
    | begin_trans_stmt
    | commit_trans_stmt
    | rollback_stmt
    | savepoint_stmt
    | create_index_stmt
    | set_trans_stmt
    | lock_table_stmt
    | set_identins_stmt
    | set_session_stmt
    | stat_on_org_stmt
    | create_partition_group_stmt
    | fetch_stmt
    | open_stmt
    | close_cursor_stmt
    ;

privsql :
    grant_stmt
    | revoke_stmt
    ;

othersql :
    connect_stmt
    | disconnect_stmt
    | set_schema_stmt
    | backup_stmt
    | restore_stmt
    ;

utilsql :
    alter_diskgroup_stmt
    | shutdown_stmt
    | repeat_interval_stmt
    | create_schema_stmt
    | assign_stmt
;

explainsql :
    EXPLAIN (dmlsql | assign_stmt) (COMMA (dmlsql | assign_stmt))*
    | EXPLAIN (AS raw_id)? FOR (dmlsql | ddlsql | privsql |othersql) 
;
   

shutdown_stmt :
    SHUTDOWN ABORT
    | SHUTDOWN IMMEDIATE
    | SHUTDOWN NORMAL
    | SHUTDOWN TRANSACTIONAL local?
    | STOP INSTANCE
    ;

alter_diskgroup_stmt :
    alter_tag DISKGROUP LT_STRING pathname CORRUPT
    ;

local :
    LOCAL
    ;

dmsubprogram :
    label_list_options? decl_var_cur_list_options? BEGIN plbody except_option? blk_end_option
    ;

declare_block :
    label_list_options? decl_var_cur_list_1? BEGIN plbody except_option? blk_end_option
    ;

decl_var_cur_list_options :
    DECLARE
    | DECLARE decl_var_cur_list
    | decl_var_cur_list
    ;

decl_var_cur_list_1 :
    DECLARE
    | DECLARE decl_var_cur_list
    ;

decl_var_cur_list :
    ( decl_variable | decl_except | pragma_def | (decl_cursor SEMI) | decl_plsql_type | package_body_def | subpg_decl_stmt )+
    ;

decl_plsql_type :
    TYPE variable_name IS plsql_type_def SEMI
    | SUBTYPE variable_name IS sub_plsql_datatype not_null? SEMI
    ;

plsql_type_def :
    RECORD '(' rec_item_def_list ')'
    | REF CURSOR
    | REF CURSOR RETURN plsql_datatype
    | ARRAY plsql_datatype rank_specifiers
    | REF CURSOR '(' param_def_list ')'
    | REF CURSOR '(' param_def_list ')' RETURN plsql_datatype
    | ARRAY plsql_datatype '[' lt_int_lst ']'
    | plsql_datatype
    | TABLE OF plsql_datatype not_null?
    | TABLE OF plsql_datatype not_null? INDEX BY plsql_datatype
    | VARRAY '(' LT_INTEGER ')' OF plsql_datatype not_null?
    ;

lt_int_lst :
    LT_INTEGER
    | lt_int_lst COMMA LT_INTEGER
    ;

rec_item_def_list :
    rec_item_def (COMMA rec_item_def)*
    ;

rec_item_def :
    id plsql_datatype opt_rank_specifier2 not_null? default_clause_option?
    ;

decl_variable :
    variable_name_list plsql_datatype not_null? default_clause_option? SEMI
    | variable_name_list AS plsql_datatype not_null? default_clause_option? SEMI
    | variable_name_list CONSTANT plsql_datatype not_null? default_clause_option? SEMI
    ;

not_null :
    NOT NULL
    ;

plsql_datatype :
    datatype
    | qualified_name dblink_clause? '%' TYPE
    | qualified_name dblink_clause? '%' ROWTYPE
    | REF qualified_name
    | CURSOR
    ;

default_clause_option :
    DEFAULT default_exp
    | assign_op default_exp
    ;

variable_name_list :
    variable_name (COMMA variable_name)*
    ;

decl_except :
    variable_name_list EXCEPTION FOR '-' LT_INTEGER SEMI
    | variable_name_list EXCEPTION FOR '-' LT_INTEGER COMMA LT_STRING SEMI
    ;

pragma_def :
    PRAGMA pragma SEMI
    ;

pragma :
    EXCEPTION_INIT '(' except_name COMMA '-' LT_INTEGER ')'
    | AUTONOMOUS_TRANSACTION
    ;

plbody :
    (plsql SEMI)+
    ;

ss_plbody :
    plblock
    ;

label :
    label_demiliter_l label_name label_demiliter_r
    ;

label_list :
    label+
    ;

label_list_options :
    label_list
    ;

label_demiliter_l :
    OP_SHIFT_LEFT
    ;

label_demiliter_r :
    OP_SHIFT_RIGHT
    ;

plsql :
    dmlsql
    | if_stmt
    | assign_stmt
    | goto_stmt
    | while_stmt
    | loop_stmt
    | repeat_stmt
    | for_stmt
    | return_stmt
    | plblock
    | raise_stmt
    | exit_stmt
    | print_stmt
    | execute_stmt
    | continue_stmt
    | case_stmt
    | null_stmt
    | label plsql
    | forall_stmt
    | pipe_row_stmt
    ;

ur_option :
    WITH id
    ;

flashback_trig_enable :
    ENABLE TRIGGERS
    | DISABLE TRIGGERS
    ;

scn_or_lsn :
    SCN
    | LSN
    ;

full_table_name_list :
    full_table_name (COMMA full_table_name)*
    ;

flashback_tab_stmt :
    FLASHBACK TABLE full_table_name_list TO BEFORE DROP rename?
    | FLASHBACK TABLE full_table_name_list TO BEFORE TRUNCATE
    | FLASHBACK TABLE full_table_name_list TO TIMESTAMP exp flashback_trig_enable?
    | FLASHBACK TABLE full_table_name_list TO scn_or_lsn trxid flashback_trig_enable?
    ;

rename :
    RENAME TO id
    ;

alter_system_set_stmt :
    alter_tag SYSTEM SET LT_STRING '=' raw_exp defer? scope?
    ;

defer :
    DEFERRED
    ;

scope :
    MEMORY
    | BOTH
    | SPFILE
    ;

alter_session_stmt :
    alter_tag SESSION sess_id? SET QUERY_REWRITE_INTEGRITY assign_op exp
    | alter_tag SESSION sess_id? SET EVENTS LT_STRING
    | alter_tag SESSION sess_id? SET TIME_ZONE assign_op set_time_zone_string
    | alter_tag SESSION sess_id? SET LT_STRING '=' raw_exp purge?
    | alter_tag SESSION sess_id? SET CASE_SENSITIVE assign_op exp
    | alter_tag SESSION sess_id? SET CASE_SENSITIVE assign_op DEFAULT
    | alter_tag SESSION sess_id? SET CURRENT_SCHEMA '=' qualified_name
    | alter_tag SESSION sess_id? SET sess_attr '=' sess_attr_val
    | alter_tag SESSION sess_id? ENABLE PARALLEL parallel_mode
    | alter_tag SESSION sess_id? DISABLE PARALLEL parallel_mode
    | alter_tag SESSION sess_id? FORCE PARALLEL parallel_mode parallel_degree?
    ;

parallel_mode :
    DML
    | QUERY
    | DDL
    ;

parallel_degree :
    PARALLEL LT_INTEGER
    ;

purge :
    PURGE
    ;

sess_id :
    LT_INTEGER
    | LT_DECIMAL
    ;

set_time_zone_string :
    LOCAL
    | LT_STRING
    ;

sess_attr :
    raw_id
    ;

sess_attr_val :
    raw_id
    | LT_STRING
    ;

set_schema_stmt :
    SET SCHEMA qualified_name
    ;

plblock :
    decl_var_cur_list_1? BEGIN plbody except_option? blk_end_option
    ;

except_option :
    EXCEPTION except_handler_list finally_option?
    | FINALLY finally_tail
    ;

finally_option :
    FINALLY finally_tail
    ;

finally_tail :
    plbody
    ;

except_handler_list :
    except_handler+
    ;

except_handler :
    WHEN except_list THEN plbody
    ;

except_name :
    variable_name
    ;

except_list :
    qualified_name (OR qualified_name)*
    ;

if_stmt :
    if_stmt_clause elseif_lst_option? else_option? END IF
    | ss_if_stmt_clause ss_elseif_lst_option? ss_else_option?
    ;

if_stmt_clause :
    if_condition_clause if_then_clause
    ;

if_condition_clause :
    IF bool_exp
    ;

if_then_clause :
    THEN plbody
    ;

elseif_lst_option :
    elseif_clause elseif_lst_option?
    ;

elseif_clause :
    ELSEIF bool_exp THEN plbody
    ;

else_option :
    ELSE plbody
    ;

ss_if_stmt_clause :
    if_condition_clause ss_plbody
    ;

ss_elseif_lst_option :
    ss_elseif_clause ss_elseif_lst_option?
    ;

ss_elseif_clause :
    ELSEIF bool_exp ss_plbody
    ;

ss_else_option :
    ELSE ss_plbody
    ;

case_stmt :
    CASE plsearched_when_list else_option? END case_option? label_name_options?
    | CASE bool_exp plsearched_when_list else_option? END case_option? label_name_options?
    ;

plsearched_when_clause :
    WHEN bool_exp THEN plbody
    ;

plsearched_when_list :
    plsearched_when_clause+
    ;

case_option :
    CASE
    ;

assign_stmt :
    assign_obj2 assign_op bool_exp
    | SET assign_obj assign_op bool_exp
    ;

assign_obj :
    assignment_obj
    ;

assign_obj2 :
    pexp_pfx2
    | stm_param_name
    ;

assign_op :
    ASSIGN
    | OP_ASSIGN
    | '='
    ;

goto_stmt :
    GOTO id
    ;

while_stmt :
    WHILE bool_exp LOOP plbody end_loop_label_null
    ;

loop_stmt :
    LOOP plbody end_loop_label_null
    ;

repeat_stmt :
    REPEAT plbody UNTIL bool_exp
    ;

for_stmt :
    FOR id in_option for_condition LOOP plbody end_loop_label_null
    ;

forall_stmt :
    forall_start for_condition forall_save_exception_option? forall_dml_stmt
    | forall_start forall_index_values OF pexp forall_between_option? forall_save_exception_option? forall_dml_stmt
    ;

forall_between_option :
    BETWEEN exp AND exp
    ;

forall_save_exception_option :
    SAVE EXCEPTIONS
    ;

forall_index_values :
    INDICES
    | VALUES
    ;

forall_start :
    FORALL id IN
    ;

forall_dml_stmt :
    delete_stmt
    | insert_stmt
    | update_stmt
    | merge_into_stmt
    | query_exp
    | execute_stmt
    ;

in_option :
    IN REVERSE?
    ;

for_condition :
    exp '..' exp
    | exp
    ;

pipe_row_stmt :
    PIPE ROW '(' exp ')'
    ;

exit_stmt :
    EXIT
    | EXIT WHEN bool_exp
    | EXIT id
    | EXIT id WHEN bool_exp
    ;

continue_stmt :
    CONTINUE
    | CONTINUE WHEN bool_exp
    | CONTINUE id
    | CONTINUE id WHEN bool_exp
    ;

null_stmt :
    NULL
    ;

print_stmt :
    PRINT exp
    ;

execute_stmt :
    EXECUTE IMMEDIATE exp bulk_or_single_into? using_clause? dyn_return?
    ;

dyn_return :
    return_option bulk_or_single_into?
    ;

using_clause :
    USING using_exp_list
    ;

using_exp_list :
    using_exp (COMMA using_exp)*
    ;

using_exp :
    param_in_out_option? exp
    ;

alter_proc_stmt :
    alter_tag PROCEDURE full_proc_name COMPILE cascade_opt? debug_tag?
    ;

alter_func_stmt :
    alter_tag FUNCTION full_fun_name COMPILE cascade_opt? debug_tag?
    ;

alter_package_stmt :
    alter_tag pkg_type full_proc_name COMPILE declare_opt? cascade_opt? debug_tag?
    ;

pkg_type :
    PACKAGE
    | TYPE
    | CLASS
    ;

declare_opt :
    DECLARE
    ;

alter_table_stmt :
    alter_tag TABLE full_table_name alter_table_action
    ;

alter_tag :
    ALTER
    ;

alter_index_stmt :
    alter_tag INDEX full_index_name alter_index_action
    ;

full_index_name :
    qualified_name
    ;

alter_index_action :
    RENAME TO index_name
    | visible_clause
    | rebuild_clause
    | UNUSABLE
    | MONITORING USAGE
    | NOMONITORING USAGE
    ;

rebuild_clause :
    REBUILD storage_tag? index_no_sort? online_options? exclusive_options? asynchronous_options?
    ;

exclusive_options :
    SHARE
    | EXCLUSIVE
    ;

asynchronous_options :
    ASYNCHRONOUS
    | ASYNCHRONOUS LT_INTEGER
    ;

visible_clause :
    VISIBLE
    | INVISIBLE
    ;

column_def_list :
    column_def (COMMA column_def_list)*
    ;

lock :
    NO LOCK
    ;

alter_table_partition_action :
    ADD range_partition lock?
    | ADD list_partition
    | ADD hash_partition
    | DROP PARTITION exist? full_partition_name
    | DROP PARTITION exist? FOR '(' exp_list ')'
    | EXCHANGE PARTITION full_partition_name WITH TABLE full_table_name including_indexes?
    | EXCHANGE SUBPARTITION full_partition_name WITH TABLE full_table_name including_indexes?
    | SPLIT PARTITION full_partition_name AT_KEYWORD '(' range_partition_exp_list ')' INTO '(' split_partition_list ')'
    | SPLIT PARTITION full_partition_name VALUES '(' list_partition_exp_list ')' INTO '(' split_partition_list ')'
    | SPLIT PARTITION full_partition_name INTO '(' list_partition_list COMMA hash_partition ')'
    | SPLIT PARTITION full_partition_name INTO '(' range_partition_list COMMA hash_partition ')'
    | MERGE PARTITIONS partition_no? COMMA partition_no? INTO PARTITION full_partition_name
    | MERGE PARTITIONS full_partition_name COMMA full_partition_name INTO PARTITION full_partition_name
    | SET SUBPARTITION TEMPLATE template_info
    | DROP SUBPARTITION exist? full_partition_name
    | DROP SUBPARTITION exist? FOR '(' exp_list ')'
    | MODIFY PARTITION full_partition_name ADD add_subpartition_desc
    | MODIFY SUBPARTITION full_partition_name ADD add_subpartition_desc
    | MODIFY PARTITION full_partition_name ADD VALUES '(' list_partition_value_list ')'
    | MODIFY PARTITION full_partition_name DROP VALUES '(' list_partition_value_list ')'
    | RENAME PARTITION full_partition_name TO full_partition_name
    | RENAME SUBPARTITION full_partition_name TO full_partition_name
    | MODIFY SUBPARTITION full_partition_name ADD VALUES '(' list_partition_value_list ')'
    | MODIFY SUBPARTITION full_partition_name DROP VALUES '(' list_partition_value_list ')'
    | MOVE PARTITION full_partition_name TABLESPACE tablespace_name
    | MOVE SUBPARTITION full_partition_name TABLESPACE tablespace_name
    | MOVE TABLESPACE tablespace_name
    | LOCK PARTITIONS
    | LOCK ROOT
    ;

template_info :
    '(' template_item_1? ')'
    | template_item_2
    ;

template_item_2 :
    SUBPARTITIONS LT_INTEGER storage_hash_tag?
    | LT_INTEGER storage_hash_tag?
    ;

template_item_1 :
    range_subpartition_list
    | hash_subpartition_list
    | list_subpartition_list
    ;

including_indexes :
    INCLUDING INDEXES
    | EXCLUDING INDEXES
    ;

truncate_partition_name :
    full_partition_name
    | '(' full_partition_name ')'
    ;

cons_enable :
    ENABLE
    | DISABLE
    ;

reuse_storage_option :
    REUSE STORAGE
    | DROP STORAGE
    ;

alter_table_action :
    ADD column_tag? not_exist? '(' column_def_list ')'
    | ALTER column_tag? column_name SET DEFAULT default_exp
    | ALTER column_tag? column_name SET DEFAULT ON NULL default_exp
    | ALTER column_tag? column_name DROP DEFAULT
    | ADD CONSTRAINT constraint_name_options? table_constraint_clause check_option_def_true? cons_enable?
    | ADD table_constraint_clause check_option_def_true? cons_enable?
    | DROP constraint_name_def restrict_cascade?
    | ALTER column_tag? column_name RENAME TO column_name
    | RENAME COLUMN column_name TO column_name
    | RENAME TO table_name
    | MODIFY mdf_column_def
    | MODIFY CONSTRAINT constraint_name ENABLE
    | MODIFY CONSTRAINT constraint_name DISABLE restrict_cascade?
    | REBUILD MODIFY mdf_column_def
    | MODIFY '(' mdf_column_def_list ')'
    | ADD column_tag? not_exist? column_def
    | DROP column_tag? exist? '(' drop_column_list ')'
    | DROP column_tag? exist? column_name restrict_cascade?
    | ENABLE ALL TRIGGERS
    | DISABLE ALL TRIGGERS
    | MODIFY constraint_name_def TO table_constraint_clause check_option_def_true? restrict_cascade?
    | MODIFY space_limit_1
    | alter_table_partition_action
    | DROP IDENTITY
    | DROP AUTO_INCREMENT
    | ADD column_tag? not_exist? column_name identity_clause
    | ENABLE ata_lock_option
    | DISABLE ata_lock_option
    | ENABLE CONSTRAINT constraint_name check_option_def_true?
    | DISABLE CONSTRAINT constraint_name restrict_cascade?
    | ALTER column_tag? column_name SET not_null_spec
    | MODIFY ERROR TO ctab_error_option
    | MODIFY LOG TO ctab_log_option
    | ALTER column_tag? '(' column_list ')' SET STAT
    | ALTER column_tag? '(' column_list ')' SET STAT NONE
    | ALTER column_tag? column_name SET STAT NONE
    | WITH COUNTER
    | WITHOUT COUNTER
    | LOGGING
    | NOLOGGING
    | REBUILD COLUMNS
    | TRUNCATE PARTITION truncate_partition_name reuse_storage_option?
    | TRUNCATE PARTITION FOR '(' exp_list ')' reuse_storage_option?
    | TRUNCATE SUBPARTITION truncate_partition_name reuse_storage_option?
    | TRUNCATE SUBPARTITION FOR '(' exp_list ')' reuse_storage_option?
    | ALTER column_tag? column_name SET not_tag? VISIBLE
    | ENABLE ROW MOVEMENT
    | DISABLE ROW MOVEMENT
    | MODIFY PATH pathname
    | LOCATION '(' pathname ')'
    | DEFAULT DIRECTORY id
    | DEFAULT DIRECTORY id LOCATION '(' pathname ')'
    | ENABLE USING LONG ROW
    | WITH DELTA
    | WITHOUT DELTA
    | FORCE COLUMN STORAGE
    | REBUILD hfs_rebuild_level
    | REFRESH STAT
    | SET STAT storage_stat_flag? storage_stat_cols?
    | WITH ADVANCED LOG
    | WITHOUT ADVANCED LOG
    | TRUNCATE ADVANCED LOG
    | ADD LOGIC LOG
    | DROP LOGIC LOG
    | DROP PRIMARY KEY restrict_cascade?
    | DROP PARTITION GROUP full_table_name
    | read_only_flag_not_null
    | MOVE PARTITION full_partition_name TO raft_name fast_flag?
    | MOVE TO full_grp_name fast_flag?
    | increment_set
    | ALTER column_tag? column_name ADD user_clause
    | ALTER column_tag? column_name DROP user_clause
    | RENAME constraint_name_def TO constraint_name
    | PARALLEL LT_INTEGER
    ;

fast_flag :
    FAST
    ;

storage_stat_flag :
    NONE
    | ASYNCHRONOUS
    | SYNCHRONOUS
    ;

storage_stat_cols :
    ON '(' column_list ')'
    | EXCEPT '(' column_list ')'
    ;

hfs_rebuild_level :
    SECTION
    | TABLE
    ;

ata_lock_option :
    PAGE LOCK
    | ROW LOCK
    | PAGE ROW LOCK
    | ROW PAGE LOCK
    ;

mdf_column_def_list :
    mdf_column_def (COMMA mdf_column_def)*
    ;

mdf_column_def :
    column_def_low
    | virtual_column_def
    | column_name column_def_4_option?
    ;

column_def :
    column_def_low
    | virtual_column_def
    ;

column_def_ex :
    column_def comment_clause?
    ;

column_def_low :
    column_name datatype charset_option? collate_clause_option? column_def_4_option? storage_tag? encrypt_clause_options? compress_clause_opt?
    ;

virtual_column_datatype :
    datatype
    ;

virtual_column_generated :
    GENERATED ALWAYS
    ;

virtual_column_virtual :
    VIRTUAL
    ;

virtual_column_visible :
    VISIBLE
    ;

virtual_column_def :
    column_name virtual_column_datatype? virtual_column_generated? AS '(' exp ')' virtual_column_virtual? charset_option? collate_clause_option? column_def_4_option? storage_tag? encrypt_clause_options? virtual_column_visible?
    ;

charset_option :
    CHARACTER SET qualified_name
    ;

column_def_4_option :
    identity_clause
    | column_constraint_def
    | auto_update_clause
    | default_clause_with_on_null_opt (identity_clause | column_constraint_def | auto_update_clause)?
    | identity_clause default_clause_with_on_null_opt
    | identity_clause column_constraint_def
    | identity_clause auto_update_clause
    | column_constraint_def default_clause_with_on_null_opt
    | column_constraint_def auto_update_clause
    | column_constraint_def identity_clause
    | auto_update_clause default_clause_with_on_null_opt
    | auto_update_clause column_constraint_def
    | auto_update_clause identity_clause
    | default_clause_with_on_null_opt auto_update_clause column_constraint_def
    | default_clause_with_on_null_opt column_constraint_def auto_update_clause
    | default_clause_with_on_null_opt identity_clause column_constraint_def
    | default_clause_with_on_null_opt column_constraint_def identity_clause
    | default_clause_with_on_null_opt identity_clause auto_update_clause
    | default_clause_with_on_null_opt auto_update_clause identity_clause
    | identity_clause auto_update_clause column_constraint_def
    | identity_clause column_constraint_def auto_update_clause
    | identity_clause auto_update_clause default_clause_with_on_null_opt
    | identity_clause default_clause_with_on_null_opt auto_update_clause
    | identity_clause default_clause_with_on_null_opt column_constraint_def
    | identity_clause column_constraint_def default_clause_with_on_null_opt
    | column_constraint_def default_clause_with_on_null_opt auto_update_clause
    | column_constraint_def auto_update_clause default_clause_with_on_null_opt
    | column_constraint_def default_clause_with_on_null_opt identity_clause
    | column_constraint_def identity_clause default_clause_with_on_null_opt
    | column_constraint_def identity_clause auto_update_clause
    | column_constraint_def auto_update_clause identity_clause
    | auto_update_clause column_constraint_def default_clause_with_on_null_opt
    | auto_update_clause default_clause_with_on_null_opt column_constraint_def
    | auto_update_clause identity_clause column_constraint_def
    | auto_update_clause column_constraint_def identity_clause
    | auto_update_clause identity_clause default_clause_with_on_null_opt
    | auto_update_clause default_clause_with_on_null_opt identity_clause
    | default_clause_with_on_null_opt identity_clause auto_update_clause column_constraint_def
    | default_clause_with_on_null_opt identity_clause column_constraint_def auto_update_clause
    | default_clause_with_on_null_opt auto_update_clause identity_clause column_constraint_def
    | default_clause_with_on_null_opt auto_update_clause column_constraint_def identity_clause
    | default_clause_with_on_null_opt column_constraint_def identity_clause auto_update_clause
    | default_clause_with_on_null_opt column_constraint_def auto_update_clause identity_clause
    | identity_clause default_clause_with_on_null_opt auto_update_clause column_constraint_def
    | identity_clause default_clause_with_on_null_opt column_constraint_def auto_update_clause
    | identity_clause auto_update_clause default_clause_with_on_null_opt column_constraint_def
    | identity_clause auto_update_clause column_constraint_def default_clause_with_on_null_opt
    | identity_clause column_constraint_def default_clause_with_on_null_opt auto_update_clause
    | identity_clause column_constraint_def auto_update_clause default_clause_with_on_null_opt
    | auto_update_clause default_clause_with_on_null_opt identity_clause column_constraint_def
    | auto_update_clause default_clause_with_on_null_opt column_constraint_def identity_clause
    | auto_update_clause identity_clause default_clause_with_on_null_opt column_constraint_def
    | auto_update_clause identity_clause column_constraint_def default_clause_with_on_null_opt
    | auto_update_clause column_constraint_def identity_clause default_clause_with_on_null_opt
    | auto_update_clause column_constraint_def default_clause_with_on_null_opt identity_clause
    | column_constraint_def default_clause_with_on_null_opt identity_clause auto_update_clause
    | column_constraint_def default_clause_with_on_null_opt auto_update_clause identity_clause
    | column_constraint_def identity_clause default_clause_with_on_null_opt auto_update_clause
    | column_constraint_def identity_clause auto_update_clause default_clause_with_on_null_opt
    | column_constraint_def auto_update_clause identity_clause default_clause_with_on_null_opt
    | column_constraint_def auto_update_clause default_clause_with_on_null_opt identity_clause
    ;

auto_update_clause :
    ON UPDATE update_exp
    ;

update_exp :
    exp
    ;

identity_clause :
    IDENTITY '(' exp COMMA exp ')'
    | IDENTITY
    | AUTO_INCREMENT
    ;

default_clause_with_on_null_opt :
    default_clause
    | DEFAULT ON NULL default_exp
    ;

default_clause :
    DEFAULT default_exp
    ;

default_exp :
    exp
    ;

column_constraint_def :
    column_constraints constraint_attributes_options?
    ;

constraint_name_def_options :
    constraint_name_def
    ;

constraint_name_def :
    CONSTRAINT constraint_name
    ;

column_constraints :
    column_constraint+
    ;

column_constraint :
    constraint_name_def_options? column_constraint_action cons_enable?
    ;

column_constraint_action :
    not_null_spec
    | NOT VISIBLE
    | unique_spec using_index_clause?
    | refs_spec
    | check_constraint_def
    ;

not_null_spec :
    not_tag? NULL
    ;

unique_spec :
    UNIQUE
    | PRIMARY KEY
    | CLUSTER PRIMARY KEY
    | NOT CLUSTER PRIMARY KEY
    | CLUSTER KEY
    | CLUSTER UNIQUE KEY
    ;

refs_spec :
    refs_spec_action (WITH INDEX)?
    ;

refs_spec_action :
    foreign_key? REFERENCES pendant_tag? refd_table_and_columns match_option? ref_triggered_action?
    ;

foreign_key :
    FOREIGN KEY
    ;

refd_table_and_columns :
    full_table_name
    | full_table_name '(' ref_column_list ')'
    ;

ref_column_list :
    column_list
    ;

column_list :
    column_name compress_level? compress_type? (COMMA column_name compress_level? compress_type?)*
    ;

column_list2 :
    exp compress_level? compress_type? (COMMA exp compress_level? compress_type?)*
    ;

full_column_list :
    full_column_name (COMMA full_column_name)*
    ;

column_list_list :
    '(' column_list ')' as_alias? storage_tag?
    | '(' column_list ')' as_alias? storage_tag? COMMA column_list_list
    ;

drop_column_list :
    column_name restrict_cascade? (COMMA column_name restrict_cascade?)*
    ;

match_option :
    MATCH match_type
    ;

match_type :
    FULL
    | PARTIAL
    | SIMPLE
    ;

ref_triggered_action :
    update_rule
    | delete_rule
    | update_rule delete_rule
    | delete_rule update_rule
    ;

update_rule :
    ON UPDATE ref_action
    ;

delete_rule :
    ON DELETE ref_action
    ;

ref_action :
    CASCADE
    | SET NULL
    | SET DEFAULT
    | NO ACTION
    | RESTRICT
    ;

check_constraint_def :
    CHECK '(' check_condition ')'
    ;

check_condition :
    bool_exp
    ;

restrict_cascade :
    RESTRICT
    | CASCADE CONSTRAINTS?
    ;

cascade_opt :
    CASCADE
    ;

constraint_name_options :
    constraint_name
    ;

check_option_def_true :
    NOT? CHECK
    ;

constraint_attributes_options :
    constraint_attributes
    ;

constraint_attributes :
    constraint_check_time
    | deferrable_option
    | constraint_check_time deferrable_option
    | deferrable_option constraint_check_time
    ;

deferrable_option :
    DEFERRABLE
    ;

constraint_check_time :
    INITIALLY DEFERRED
    | INITIALLY IMMEDIATE
    ;

table_constraint_clause :
    table_constraint constraint_attributes_options?
    ;

table_constraint :
    unique_spec '(' column_list ')' using_index_clause?
    | foreign_key_clause
    | check_constraint_def
    ;

using_index_clause :
    USING INDEX TABLESPACE (id | DEFAULT)
    ;

foreign_key_clause :
    FOREIGN KEY '(' ref_column_list ')' refs_spec
    ;

alter_trigger_stmt :
    alter_tag TRIGGER full_trigger_name (alter_trigger_option | RENAME TO trigger_name)
    ;

alter_trigger_option :
    ENABLE
    | DISABLE
    | COMPILE debug_tag?
    | COMPILE AUTO
    ;

alter_table_partition_action_options :
    alter_table_partition_action
    ;

refresh_materialized_view_stmt :
    REFRESH MATERIALIZED VIEW full_view_name force? refresh_complete_del?
    | REFRESH MATERIALIZED VIEW full_view_name COMPLETE refresh_complete_del?
    | REFRESH MATERIALIZED VIEW full_view_name FAST
    ;

complete_del_null :
    USING DEFAULT
    | USING TRUNCATE
    | USING DELETE
    ;

refresh_complete_del :
    complete_del_null
    ;

alter_materialized_view_stmt :
    alter_tag MATERIALIZED VIEW full_view_name alter_table_partition_action_options? mv_refresh_clause? query_rewrite?
    ;

alter_view_stmt :
    alter_tag VIEW full_view_name alter_view_action
    ;

alter_view_action :
    COMPILE
    | ADD CONSTRAINT constraint_name_options? view_constraint_clause DISABLE cons_novalidate?
    | ADD view_constraint_clause DISABLE cons_novalidate?
    | DROP constraint_name_def
    ;

cons_novalidate :
    NOVALIDATE
    ;

view_constraint_clause :
    view_constraint
    ;

view_constraint :
    view_unique_spec '(' column_list ')'
    | FOREIGN KEY '(' ref_column_list ')' view_refs_spec
    ;

view_unique_spec :
    UNIQUE
    | PRIMARY KEY
    ;

view_refs_spec :
    view_refs_spec_action
    ;

view_refs_spec_action :
    foreign_key? REFERENCES refd_table_and_columns
    ;

call_proc_stmt :
    raw_call_proc_stmt
    | call_proc_stmt_2
    ;

raw_call_proc_stmt :
    member_access2
    | member2
    | invocation_expression2
    ;

call_proc_stmt_2 :
    CALL raw_call_proc_stmt
    | exec_proc_stmt
    ;

exec_proc_stmt :
    EXECUTE full_proc_name dblink_clause?
    | EXECUTE full_proc_name dblink_clause? raw_exp_list
    | EXECUTE full_proc_name dblink_clause? param_list
    ;

dblink_clause :
    '@' id
    ;

dblink_clause2 :
    '@' qualified_name
    ;

param_list :
    param (COMMA param)*
    ;

param :
    param_name OPR_AEQ bool_exp
    ;

raw_exp_list :
    raw_exp (COMMA raw_exp)*
    ;

exp_list_2 :
    exp (COMMA exp)+
    ;

exp_list :
    exp
    | exp_list_2
    ;

ins_exp_list :
    (exp | DEFAULT) (COMMA(exp | DEFAULT))*
    ;

lt_exp :
    op=('-' | '+') lt_exp
    | LT_INTEGER
    | LT_DECIMAL
    | LT_REAL
    | LT_STRING
    | member_access LT_STRING
    | member LT_STRING
    | LT_BITSTRING
    | INTERVAL '+' LT_STRING interval_qualifier
    | INTERVAL '-' LT_STRING interval_qualifier
    | INTERVAL LT_STRING interval_qualifier
    ;

range_partition_exp :
    lt_exp
    | MAXVALUE
    | null_value
    | invocation_expression
    ;

range_partition_exp_list :
    range_partition_exp (COMMA range_partition_exp)*
    ;

list_partition_exp :
    lt_exp
    | null_value
    | invocation_expression
    ;

list_partition_exp_list :
    list_partition_exp (COMMA list_partition_exp)*
    ;

list_partition_value_list :
    list_partition_exp_list
    | DEFAULT
    ;

close_cursor_stmt :
    CLOSE assign_obj2
    ;

close_cursor_statement :
    CLOSE CURSOR assign_obj
    ;

begin_trans_stmt :
    BEGIN TRANSACTION
    ;

commit_trans_stmt :
    commit_head commit_tail?
    ;

commit_head :
    COMMIT work_tag?
    | COMMITWORK
    ;

commit_tail :
    AND CHAIN
    | AND NO CHAIN
    | WRITE
    | WRITE commit_wait_immed_option
    | commit_wait_immed_option
    ;

commit_wait_immed_option :
    WAIT
    | NOWAIT
    | IMMEDIATE
    | WAIT IMMEDIATE
    | NOWAIT IMMEDIATE
    | IMMEDIATE WAIT
    | BATCH WAIT
    | IMMEDIATE NOWAIT
    | BATCH NOWAIT
    | AUTO
    ;

connect_stmt :
    CONNECT user_name password
    ;

password :
    id
    | LT_BINTEGER
    | LT_DECIMAL
    | LT_INTEGER
    | LT_REAL
    ;

ts_storage :
    ON id
    | ON LT_INTEGER
    | ON LT_INTEGER FOR RESTORE
    ;

ts_storage_clause :
    STORAGE '(' ts_storage ')'
    ;

create_tablespace_stmt :
    CREATE TABLESPACE not_exist? tablespace_name DATAFILE file_list cache? copy_num? region_size? striping_clause? redundancy_clause? with_huge_clause? ts_storage_clause?
    | CREATE TABLESPACE not_exist? tablespace_name DATAFILE file_list cache? ENCRYPT WITH cipher_name copy_num? region_size? striping_clause? redundancy_clause? with_huge_clause? ts_storage_clause?
    | CREATE TABLESPACE not_exist? tablespace_name DATAFILE file_list cache? ENCRYPT WITH cipher_name BY password copy_num? region_size? striping_clause? redundancy_clause? with_huge_clause? ts_storage_clause?
    | CREATE HUGE TABLESPACE not_exist? tablespace_name PATH pathname copy_num? region_size? striping_clause? redundancy_clause? ts_storage_clause?
    ;

ctss_with_clause :
    WITH '(' id_list ')'
    ;

create_tablespace_set_stmt :
    CREATE TABLESPACE SET id ctss_with_clause?
    ;

alter_tablespace_set_stmt :
    alter_tag TABLESPACE SET id ADD '(' id_list ')'
    | alter_tag TABLESPACE SET id DELETE '(' id_list ')'
    ;

cache :
    CACHE '=' id
    ;

alter_tablespace_stmt :
    alter_tag TABLESPACE tablespace_name alter_tablespace_action
    | alter_tag HUGE TABLESPACE tablespace_name ADD PATH pathname
    ;

keep :
    KEEP
    ;

alter_tablespace_action :
    RENAME TO tablespace_name
    | RENAME DATAFILE pathname_list TO pathname_list
    | ADD DATAFILE file_list
    | DROP DATAFILE pathname
    | ONLINE
    | OFFLINE
    | CACHE '=' id
    | RESIZE DATAFILE pathname TO LT_INTEGER on_raft?
    | DATAFILE pathname_list autoextend?
    | CORRUPT
    | OPTIMIZE LT_INTEGER
    | MOVE TO raft_name read_only_flag? keep?
    | ADD HUGE PATH pathname region_size?
    ;

file_list :
    file (COMMA file)*
    ;

pathname_list :
    pathname (COMMA pathname)*
    ;

integer_list :
    LT_INTEGER (COMMA LT_INTEGER)*
    ;

file :
    pathname mirror? SIZE LT_INTEGER autoextend?
    ;

mirror :
    MIRROR pathname
    ;

autoextend_nextsize :
    NEXT LT_INTEGER
    ;

autoextend_maxsize :
    MAXSIZE LT_INTEGER
    | MAXSIZE UNLIMITED
    ;

autoextend :
    AUTOEXTEND OFF
    | AUTOEXTEND ON autoextend_nextsize? autoextend_maxsize?
    ;

on_raft :
    ON id
    ;

archfile :
    archflag? archstyle_options? archdir?
    ;

archflag :
    ARCHIVELOG
    | NOARCHIVELOG
    ;

archstyle_options :
    ARCHIVESTYLE archstyle
    ;

archstyle :
    LT_STRING
    ;

archdir :
    ARCHIVEDIR pathname
    ;

bakfile :
    BACKUPDIR pathname
    ;

parameters_option_list :
    PARMS '(' parameter_option_list ')'
    ;

parameter_option_list :
    parameter_option (COMMA parameter_option)*
    ;

parameter_option :
    id DELIMITED BY exp
    | id exp
    ;

pathname :
    LT_STRING
    ;

pathname_options :
    pathname
    ;

backup_stmt :
    BACKUP back_range_option with_bak_dir_list? backup_to_options? backup_path_null backup_desc_options? backup_maxsize? backup_limit? backup_identified? backup_compressed? backup_without? backup_trace_file_level? backup_tsk_thread_num_null backup_parallel_dir?
    ;

back_range_option :
    DATABASE backup_options?
    | TABLESPACE tablespace_name backup_options?
    | TABLE full_table_name
    | ARCHIVE LOG back_archive_spec_null
    | ARCHIVELOG back_archive_spec_null
    ;

back_archive_spec_null :
    archive_spec? not_backed_up? backup_delete_archive?
    ;

not_backed_up :
    NOT BACKED UP
    | NOT BACKED UP LT_INTEGER TIMES
    | NOT BACKED UP SINCE TIME LT_STRING
    ;

archive_spec :
    ALL
    | FROM LSN spec_lsn
    | UNTIL LSN spec_lsn
    | LSN BETWEEN spec_lsn AND spec_lsn
    | FROM TIME LT_STRING
    | UNTIL TIME LT_STRING
    | TIME BETWEEN LT_STRING AND LT_STRING
    ;

spec_lsn :
    LT_INTEGER
    ;

backup_delete_archive :
    DELETE INPUT
    ;

backup_options :
    FULL
    | FULL DDL_CLONE
    | DDL_CLONE
    | FULL SHADOW
    | SHADOW
    | INCREMENT FROM LSN LT_INTEGER
    | INCREMENT cumulative? base_on_backup?
    ;

cumulative :
    CUMULATIVE
    ;

with_bak_dir_list :
    WITH BACKUPDIR pathname_list
    ;

base_on_backup :
    BASE ON BACKUPSET pathname
    ;

backup_to_options :
    TO backup_name
    ;

backup_path_null :
    device_type? parms_command?
    | BAKFILE pathname
    | BACKUPSET pathname_options? device_type? parms_command?
    ;

device_type :
    DEVICE TYPE media_name
    ;

parms_command :
    PARMS LT_STRING
    ;

media_name :
    id
    ;

backup_desc_options :
    BACKUPINFO backup_desc
    ;

backup_desc :
    LT_STRING
    ;

backup_maxsize :
    MAXSIZE LT_INTEGER
    | MAXPIECESIZE LT_INTEGER
    ;

backup_limit :
    LIMIT READ SPEED LT_INTEGER
    | LIMIT WRITE SPEED LT_INTEGER
    | LIMIT READ SPEED LT_INTEGER WRITE SPEED LT_INTEGER
    ;

backup_identified :
    IDENTIFIED BY password
    | IDENTIFIED BY password ENCRYPT WITH cipher_name
    | IDENTIFIED BY password WITH ENCRYPTION LT_INTEGER
    | IDENTIFIED BY password WITH ENCRYPTION LT_INTEGER ENCRYPT WITH cipher_name
    ;

backup_compressed :
    COMPRESSED
    | COMPRESSED LEVEL LT_INTEGER
    ;

backup_without :
    WITHOUT LOG
    | WITHOUT MIRROR
    | WITHOUT LOG WITHOUT MIRROR
    ;

backup_tsk_thread_num_null :
    tsk_thread_num?
    ;

backup_parallel_dir :
    PARALLEL pathname
    | PARALLEL
    | PARALLEL LT_INTEGER
    | PARALLEL READ SIZE LT_INTEGER
    | PARALLEL LT_INTEGER READ SIZE LT_INTEGER
    ;

backup_trace_file_level :
    TRACE FILE pathname
    | TRACE LEVEL LT_INTEGER
    | TRACE FILE pathname TRACE LEVEL LT_INTEGER
    | TRACE LEVEL LT_INTEGER TRACE FILE pathname
    ;

restore_stmt :
    RESTORE DATABASE FROM restore_from restore_identified? with_bak_arch_dir_list? res_until? restore_file_list_options? mirror_file_list_options? archfile bakfile? restore_parallel?
    | RESTORE TABLE full_table_name_options? res_struct? res_without_index_constraint? FROM restore_from restore_identified? restore_trace_file_level?
    | RESTORE TABLESPACE tablespace_name restore_datafile_lst FROM restore_from restore_identified? with_bak_arch_dir_list? restore_file_list_options? mirror_file_list_options? restore_mapped_file? restore_trace_file_level? restore_tsk_thread_num_null restore_parallel?
    | RESTORE TABLESPACE tablespace_name FROM restore_from restore_identified? with_bak_arch_dir_list? restore_file_list_options? mirror_file_list_options? restore_mapped_file? restore_trace_file_level? restore_tsk_thread_num_null restore_parallel? res_until?
    ;

restore_datafile_lst :
    DATAFILE pathname_list
    | DATAFILE integer_list
    ;

restore_mapped_file :
    mapped_file
    ;

mapped_file :
    MAPPED FILE LT_STRING
    ;

res_struct :
    STRUCT
    ;

tsk_thread_num :
    TASK THREAD LT_INTEGER
    ;

restore_tsk_thread_num_null :
    tsk_thread_num?
    ;

restore_parallel :
    NOT PARALLEL
    ;

full_table_name_options :
    full_table_name
    ;

res_without_index_constraint :
    WITH INDEX
    | WITH INDEX WITH CONSTRAINT
    | WITH INDEX WITHOUT CONSTRAINT
    | WITHOUT INDEX
    | WITHOUT INDEX WITH CONSTRAINT
    | WITHOUT INDEX WITHOUT CONSTRAINT
    | WITH CONSTRAINT
    | WITHOUT CONSTRAINT
    ;

restore_from :
    pathname
    | BACKUP backup_name
    | BACKUPSET pathname device_type? parms_command?
    ;

res_until :
    UNTIL TIME LT_STRING
    | UNTIL LSN LT_INTEGER
    | UNTIL TIME LT_STRING UNTIL LSN LT_INTEGER
    | UNTIL LSN LT_INTEGER UNTIL TIME LT_STRING
    ;

restore_file_list_options :
    restore_file_list
    ;

mirror_file_list_options :
    mirror_file_list
    ;

restore_trace_file_level :
    TRACE FILE pathname
    | TRACE LEVEL LT_INTEGER
    | TRACE FILE pathname TRACE LEVEL LT_INTEGER
    | TRACE LEVEL LT_INTEGER TRACE FILE pathname
    ;

restore_file_list :
    restore_file (COMMA restore_file)*
    ;

restore_file :
    DBFILE LT_INTEGER TO pathname
    ;

mirror_file_list :
    mirror_file (COMMA mirror_file)*
    ;

mirror_file :
    MIRROR LT_INTEGER TO pathname
    ;

with_bak_arch_dir_list :
    WITH BACKUPDIR pathname_list
    | WITH ARCHIVEDIR pathname_list
    | WITH BACKUPDIR pathname_list WITH ARCHIVEDIR pathname_list
    ;

restore_identified :
    IDENTIFIED BY password
    | IDENTIFIED BY password ENCRYPT WITH cipher_name
    ;

create_func_stmt :
    CREATE replace_option? FUNCTION not_exist? full_func_name (func_def_inner | (WRAPPED LT_STRING))
    ;

func_aggr_clause :
    AGGREGATE USING plsql_datatype
    ;

pipelined_options :
    PIPELINED
    ;

replace_option :
    OR REPLACE
    ;

edit_options :
    EDITIONABLE
    | NONEDITIONABLE
    ;

encryption_option :
    WITH ENCRYPTION
    ;

calc_option :
    FOR CALCULATE
    ;

func_action :
    is_as dmsubprogram
    | EXTERNAL pathname inner_fun_name? USING platform_type
    | func_aggr_clause
    | PIPELINED is_as dmsubprogram
    | PIPELINED USING plsql_datatype
    ;

func_call_options :
    func_call_option_list
    ;

func_call_option_list :
    func_call_option+
    ;

func_call_option :
    invoker_rights_clause
    | deterministic_clause
    | PARALLEL_ENABLE
    | result_cache_clause
    ;

invoker_rights_clause_options :
    invoker_rights_clause
    ;

invoker_rights_clause :
    AUTHID DEFINER
    | AUTHID CURRENT_USER
    ;

deterministic_clause_options :
    deterministic_clause
    ;

deterministic_clause :
    DETERMINISTIC
    ;

func_call_option2_options :
    func_call_option_list2
    ;

func_call_option_list2 :
    func_call_option2+
    ;

func_call_option2 :
    deterministic_clause
    | result_cache_clause
    | PARALLEL_ENABLE
    ;

result_cache_clause :
    RESULT_CACHE
    ;

inner_fun_name :
    qualified_name
    ;

platform_type :
    id
    ;

param_def_list_option :
    '(' ')'
    | '(' param_def_list ')'
    ;

param_def_list :
    param_def
    | param_def COMMA param_def_list
    ;

param_def :
    param_name param_in_out_option? plsql_datatype default_clause_option?
    ;

param_in_out_option :
    IN
    | OUT
    | IN OUT
    | OUT IN
    | OUT NOCOPY
    | IN OUT NOCOPY
    | OUT IN NOCOPY
    ;

is_as :
    IS
    | AS
    ;



stat_on_org_stmt :
    STAT stat_para stat_size? ON qualified_name '(' column_list ')' global_tag?
    | STAT stat_para stat_size? ON INDEX qualified_name global_tag?
    | STAT ON qualified_name global_tag?
    ;

stat_size :
    SIZE LT_INTEGER
    ;

stat_para :
    LT_INTEGER
    | LT_DECIMAL
    | LT_REAL
    ;

stat_summarize :
    COLUMN LT_INTEGER LT_REAL LT_INTEGER LT_REAL
    | COLUMN stm_param stm_param stm_param stm_param
    ;


mstat_ex :
    BY without_into_select
    ;

indexid :
    LT_INTEGER
    ;

global_tag :
    GLOBAL
    ;

bm_join_index_clause :
    from_clause WHERE search_condition
    ;

parallel_stmt :
    NOPARALLEL
    | PARALLEL
    | PARALLEL LT_INTEGER
    ;

create_index_stmt :
    CREATE replace_option? partition_tag? unique_tag? INDEX not_exist? index_name with_inner? ON full_table_name '(' index_column_list ')' bm_join_index_clause? global_tag? partition_clause? storage_tag? index_no_sort? online_options? reverse_options? unusable_options? parallel_stmt?
    ;

with_inner :
    WITH INNER
    ;

index_no_sort :
    NOSORT
    ;

online_options :
    ONLINE
    ;

unusable_options :
    UNUSABLE
    ;

reverse_options :
    REVERSE
    ;

index_column_list :
    index_column_name (COMMA index_column_name)*
    ;

index_column_name :
    exp asc_desc_option?
    ;

storage_hash_tag :
    STORE IN storage_hash
    ;

storage_hash :
    '(' id_list ')'
    ;

storage_tag :
    storage_tag_nn
    | tablespace_clause
    | tablespace_clause storage_tag_nn
    | storage_tag_nn tablespace_clause
    ;

storage_tag_nn :
    STORAGE '(' storage_list ')'
    ;

tablespace_clause :
    TABLESPACE id local_option?
    ;

object_table_substitution_clause :
    object_table_substitution
    ;

object_table_substitution :
    SUBSTITUTABLE AT_KEYWORD ALL LEVELS
    | NOT SUBSTITUTABLE AT_KEYWORD ALL LEVELS
    ;

oid_clause :
    OBJECT IDENTIFIER_KEYWORD IS oid_gen_type
    ;

oid_gen_type :
    SYSTEM GENERATED
    | PRIMARY KEY
    ;

oid_index_clause :
    OIDINDEX id
    | OIDINDEX id oid_tablespace_clause
    | OIDINDEX oid_tablespace_clause
    ;

oid_tablespace_clause :
    '(' oid_tablespace_name? ')'
    ;

oid_tablespace_name :
    TABLESPACE id
    
    ;

local_option :
    LOCAL
    ;

storage_list :
    storage (COMMA storage)*
    ;

storage_hashpartmap :
    HASHPARTMAP '(' LT_INTEGER ')'
    ;

storage :
    INITIAL LT_INTEGER
    | NEXT LT_INTEGER
    | MINEXTENTS LT_INTEGER
    | ON PRIMARY
    | ON id
    | FILLFACTOR LT_INTEGER
    | CACHE '=' id
    | BRANCH LT_INTEGER
    | BRANCH '(' LT_INTEGER COMMA LT_INTEGER ')'
    | NOBRANCH
    | CLUSTERBTR
    | SECTION '(' LT_INTEGER ')'
    | STAT storage_stat_flag? storage_stat_cols?
    | FILESIZE '(' LT_INTEGER ')'
    | WITH COUNTER
    | WITHOUT COUNTER
    | WITH DELTA
    | WITHOUT DELTA
    | USING LONG ROW
    | storage_hashpartmap
    ;

id_list :
    PRIMARY
    | id
    | id COMMA id_list
    | PRIMARY COMMA id_list
    ;

create_proc_stmt :
    CREATE replace_option? PROCEDURE not_exist? full_proc_name2 (WITH ENCRYPTION)? param_def_list_option? invoker_rights_clause_options? func_action
    | CREATE replace_option? PROCEDURE not_exist? full_proc_name2 WRAPPED LT_STRING
    ;

create_package_stmt :
    CREATE replace_option? edit_options? pkg_cls_flag not_exist? full_proc_name2 encryption_option? under_option? final_inst_list_options? invoker_rights_clause_options? is_as package_def_list_options? blk_end_option
    | CREATE replace_option? edit_options? pkg_cls_flag not_exist? full_proc_name2 WRAPPED LT_STRING
    ;

pkg_cls_flag :
    PACKAGE
    | CLASS
    ;

blk_end_option :
    blk_end_option_low
    ;

blk_end_option_low :
    END
    | END id
    ;

package_def_list_options :
    package_def_list
    ;

package_def_list :
    package_def+
    ;

package_def :
    decl_variable
    | decl_cursor SEMI
    | decl_except
    | pragma_def
    | PRAGMA RESTRICT_REFERENCES '(' restrict_param_lst ')' SEMI
    | decl_plsql_type
    | method_inherit_options? method_attr_options? member_static? PROCEDURE id param_def_list_option? SEMI
    | method_inherit_options? method_attr_options? member_static? FUNCTION id param_def_list_option? RETURN plsql_datatype func_call_option2_options? pipelined_options? SEMI
    | method_inherit_options? method_attr_options? member_static? FUNCTION id param_def_list_option? RETURN plsql_datatype func_call_option2_options? PIPELINED USING plsql_datatype SEMI
    ;

restrict_param_lst :
    id_list
    | DEFAULT COMMA id_list
    ;

create_package_body_stmt :
    create_pkg_body_header encryption_option? is_as package_body_def_list package_body_init_option? blk_end_option
    | create_pkg_body_header encryption_option? is_as package_body_init_option? blk_end_option
    | create_pkg_body_header WRAPPED LT_STRING
    ;

create_pkg_body_header :
    CREATE replace_option? edit_options? pkg_cls_body_flag full_proc_name2
    ;

pkg_cls_body_flag :
    PACKAGE BODY
    | CLASS BODY
    ;

package_body_init_option :
    decl_var_cur_list_1? BEGIN plbody except_option?
    ;

package_body_def_list :
    package_def
    | package_body_def
    | package_def package_body_def_list
    | package_body_def package_body_def_list
    ;

package_body_def :
    method_inherit_options? method_attr_options? member_static? PROCEDURE id param_def_list_option? check_exec_options? is_as dmsubprogram SEMI
    | method_inherit_options? method_attr_options? member_static? FUNCTION id param_def_list_option? RETURN plsql_datatype func_call_option2_options? pipelined_options? check_exec_options? is_as dmsubprogram SEMI
    ;

package_body_def2 :
    PROCEDURE id param_def_list_option? check_exec_options? is_as dmsubprogram SEMI
    | FUNCTION id param_def_list_option? RETURN plsql_datatype deterministic_clause_options? pipelined_options? check_exec_options? is_as dmsubprogram SEMI
    ;

check_exec_options :
    EXECUTE CHECK
    | EXECUTE NOT CHECK
    ;

subpg_decl_stmt :
    method_inherit_options? method_attr_options? member_static? PROCEDURE id param_def_list_option? SEMI
    | method_inherit_options? method_attr_options? member_static? FUNCTION id param_def_list_option? RETURN plsql_datatype SEMI
    ;

create_type_stmt :
    CREATE replace_option? TYPE full_proc_name2 encryption_option? invoker_rights_clause_options? force_option? object_option '(' object_def_list_options? ')' final_inst_list_options?
    | CREATE replace_option? TYPE full_proc_name2 encryption_option? invoker_rights_clause_options? force_option? is_as plsql_type_def
    | CREATE replace_option? TYPE full_proc_name2 WRAPPED LT_STRING
    ;

force_option :
    FORCE
    ;

object_option :
    is_as OBJECT
    | UNDER full_proc_name
    ;

under_option :
    UNDER full_proc_name
    ;

object_def_list_options :
    object_def_list
    ;

object_def_list :
    object_def (COMMA object_def)*
    ;

object_def :
    variable_name_list plsql_datatype
    | method_inherit_options? method_attr_options? member_static? PROCEDURE id param_def_list_option?
    | method_inherit_options? method_attr_options? member_static? FUNCTION id param_def_list_option? RETURN plsql_datatype deterministic_clause_options? pipelined_options?
    | method_inherit_options? method_attr_options? member_static? FUNCTION id param_def_list_option? RETURN plsql_datatype deterministic_clause_options? PIPELINED USING plsql_datatype
    | method_inherit_options? CONSTRUCTOR FUNCTION id param_def_list_option? RETURN SELF AS RESULT
    | PRAGMA RESTRICT_REFERENCES '(' restrict_param_lst ')'
    ;

member_static :
    MEMBER
    | STATIC
    ;

method_inherit_options :
    method_inherit_option
    ;

method_inherit_option :
    overriding_option
    | final_inst_list
    | overriding_option final_inst_list
    ;

final_inst_list_options :
    final_inst_list
    ;

final_inst_list :
    final_inst
    | final_inst final_inst_list
    ;

final_inst :
    FINAL
    | INSTANTIABLE
    | NOT FINAL
    | NOT INSTANTIABLE
    ;

overriding_option :
    OVERRIDING
    | NOT OVERRIDING
    ;

method_attr_options :
    method_attr
    ;

method_attr :
    MAP
    | ORDER
    ;

create_type_body_stmt :
    CREATE replace_option? TYPE BODY full_proc_name2 encryption_option? is_as object_body_def_list END
    | CREATE replace_option? TYPE BODY full_proc_name2 WRAPPED LT_STRING
    ;

object_body_def_list :
    object_body_def
    | object_body_def object_body_def_list
    ;

object_body_def :
    method_inherit_options? method_attr_options? member_static? PROCEDURE id param_def_list_option? is_as dmsubprogram SEMI
    | method_inherit_options? method_attr_options? member_static? FUNCTION id param_def_list_option? RETURN plsql_datatype deterministic_clause_options? pipelined_options? is_as dmsubprogram SEMI
    | method_inherit_options? CONSTRUCTOR FUNCTION id param_def_list_option? RETURN SELF AS RESULT is_as dmsubprogram SEMI
    ;

create_context_stmt :
    CREATE replace_option? CONTEXT not_exist? namespace USING full_object_name initialized?
    ;

namespace :
    id
    ;

initialized :
    ACCESSED LOCALLY
    | ACCESSED GLOBALLY
    | INITIALIZED EXTERNALLY
    | INITIALIZED GLOBALLY
    ;

create_directory_stmt :
    CREATE replace_option? DIRECTORY not_exist? id AS LT_STRING
    ;

create_crypto_stmt :
    CREATE CRYPTO crypto_name pathname
    ;

alter_crypto_stmt :
    alter_tag CRYPTO crypto_name alter_crypto_action
    ;

alter_crypto_action :
    RENAME TO crypto_name
    | ADD BLOCK ENCRYPT CIPHER cipher_name INNERID LT_INTEGER BLOCK SIZE LT_INTEGER KEY SIZE LT_INTEGER
    | ADD ENCRYPT CIPHER cipher_name INNERID LT_INTEGER KEY SIZE LT_INTEGER
    | ADD HASH CIPHER cipher_name INNERID LT_INTEGER HASH SIZE LT_INTEGER
    | MODIFY CIPHER cipher_name RENAME TO cipher_name
    | DROP CIPHER cipher_name
    | ADD CRYPTO HASH LT_STRING
    | DROP CRYPTO HASH LT_STRING
    ;

comment_stmt :
    comment_tag ON TABLE full_table_name IS LT_STRING
    | comment_tag ON COLUMN full_column_name IS LT_STRING
    | comment_tag ON VIEW full_view_name IS LT_STRING
    ;

comment_tag :
    COMMENT
    ;

create_partition_group_stmt :
    CREATE PARTITION GROUP full_table_name PARTITION BY horizon_partition_act_datatype storage_act_datatype?
    ;

storage_act_datatype :
    STORAGE '(' pg_storage_lst ')'
    | STORAGE '(' ON full_column_list ')'
    ;

pg_storage_lst :
    pg_storage (COMMA pg_storage)*
    ;

pg_storage :
    ON '(' full_column_list ')'
    | storage_hashpartmap
    ;

create_table_stmt :
    CREATE table_temp_option? table_type_option? TABLE not_exist? create_table_action
    | CREATE HUGE TABLE not_exist? create_table_action
    | CREATE SNAPSHOT TABLE not_exist? full_table_name FROM full_table_name
    ;

ctab_append_attr_clause :
    ctab_append_attr_list
    ;

ctab_append_attr_list :
    ctab_append_attr+
    ;

cobjtab_append_attr_clause :
    cobjtab_append_attr_list
    ;

cobjtab_append_attr_list :
    cobjtab_append_attr
    | cobjtab_append_attr cobjtab_append_attr_list
    ;

ctab_append_attr :
    on_commit_option_nn
    | logging_option_nn
    | partition_clause_nn
    | space_limit_nn
    | storage_tag_nn
    | tablespace_clause
    ;

cobjtab_append_attr :
    oid_clause
    | oid_index_clause
    ;

create_table_action :
    full_table_name '(' table_element_list ')' ctab_append_attr_clause? compress_tag? rowdependencies_clause? ctab_row_movement_clause? ctab_log_options? advance_log_clause? add_log_clause? ctab_error_options? distribute_by? increment?
    | full_table_name '(' table_element_list ')' FROM DEFAULT DIRECTORY id LOCATION '(' pathname ')'
    | full_table_name '(' table_element_list ')' FROM DATAFILE? pathname parameters_option_list?
    | full_table_name '(' table_element_list ')' FROM DATAFILE DEFAULT DIRECTORY id LOCATION '(' pathname ')' parameters_option_list?
    | full_table_name on_commit_option? logging_option? (PARTITION BY horizon_partition_act)? space_limit? storage_tag? compress_tag? rowdependencies_clause? ctab_log_options? advance_log_clause? add_log_clause? ctab_error_options? AS without_into_select2 distribute_by? increment?
    | full_table_name on_commit_option? logging_option? space_limit? storage_tag? compress_tag? rowdependencies_clause? ctab_log_options? advance_log_clause? add_log_clause? ctab_error_options? LIKE normal_tv increment?
    | full_table_name '(' table_element_list ')' USING PARTITION GROUP full_table_name BY '(' column_list ')' pg_sub_partition? lock_partitions_clause? storage_tag? compress_tag? rowdependencies_clause? ctab_row_movement_clause? ctab_log_options? advance_log_clause? add_log_clause? ctab_error_options?
    | full_table_name OF qualified_name object_table_substitution_clause? objtab_elem_constraint? cobjtab_append_attr_clause? ctab_append_attr_clause? compress_tag? rowdependencies_clause? ctab_row_movement_clause? ctab_log_options? advance_log_clause? add_log_clause? ctab_error_options? distribute_by? increment?
    ;

ctab_log_options :
    LOG ctab_log_option
    ;

ctab_log_option :
    ALL
    | NONE
    | LOB NONE
    | LAST
    ;

ctab_error_options :
    WHEN ERROR ctab_error_option
    ;

advance_log_clause :
    WITH ADVANCED LOG
    ;

add_log_clause :
    ADD LOGIC LOG
    ;

ctab_error_option :
    TRUNCATE
    | DISABLE
    ;

ctab_row_movement_clause :
    ENABLE ROW MOVEMENT
    | DISABLE ROW MOVEMENT
    ;

range_distribute_act :
    VALUES LESS THAN '(' range_partition_exp_list ')' ON id
    | VALUES EQU OR LESS THAN '(' range_partition_exp_list ')' ON id
    ;

range_distribute_act_lst :
    range_distribute_act
    | range_distribute_act_lst COMMA range_distribute_act
    ;

list_distribute_act :
    VALUES '(' list_partition_value_list ')' ON id
    ;

list_distribute_act_list :
    list_distribute_act (COMMA list_distribute_act)*
    ;

distribute_by_option :
    DISTRIBUTED
    | DISTRIBUTED FULLY
    | DISTRIBUTED RANDOMLY
    | DISTRIBUTED BY '(' column_list ')'
    | DISTRIBUTED BY HASH '(' column_list ')'
    | DISTRIBUTED BY RANGE '(' column_list ')' '(' range_distribute_act_lst ')'
    | DISTRIBUTED BY LIST '(' column_list ')' '(' list_distribute_act_list ')'
    ;

distribute_by :
    distribute_by_option
    ;

increment_set :
    AUTO_INCREMENT '=' LT_INTEGER
    | AUTO_INCREMENT LT_INTEGER
    ;

increment :
    increment_set
    ;

rowdependencies_clause :
    ROWDEPENDENCIES
    | NOROWDEPENDENCIES
    ;

pg_sub_partition :
    SUBPARTITION BY '(' column_list ')'
    ;

table_type_option :
    VERTICAL
    | EXTERNAL
    ;

table_temp_option :
    GLOBAL TEMPORARY
    | LOCAL TEMPORARY
    | TEMPORARY
    | SHARE TEMPORARY
    ;

objtab_elem_constraint :
    '(' objtab_element_cons_list ')'
    ;

objtab_element_cons_list :
    objtab_element_cons (COMMA objtab_element_cons_list)*
    ;

objtab_element_cons :
    objcol_constraint
    | table_constraint_def
    ;

objcol_constraint :
    column_name charset_option? collate_clause_option? column_def_4_option? storage_tag? encrypt_clause_options? compress_clause_opt?
    ;

table_element_list :
    table_element (COMMA table_element)*
    ;

table_element :
    column_def_ex
    | table_constraint_def
    ;

table_constraint_def :
    constraint_name_def_options? table_constraint_clause cons_enable?
    ;

on_commit_option :
    on_commit_option_nn
    ;

on_commit_option_nn :
    ON COMMIT del_res ROWS
    ;

logging_option :
    logging_option_nn
    ;

logging_option_nn :
    LOGGING
    | NOLOGGING
    ;

partition_clause :
    partition_clause_nn
    ;

partition_clause_nn :
    PARTITION BY partition_act
    ;

horizon_partition_clause :
    PARTITION BY horizon_partition_act
    ;

compress_tag_hdr :
    COMPRESS compress_level? compress_type?
    ;

compress_clause_opt :
    compress_tag_hdr
    ;

compress_tag :
    compress_tag_hdr
    | compress_tag_hdr '(' column_list ')'
    | compress_tag_hdr EXCEPT '(' column_list ')'
    ;

compress_level :
    LEVEL LT_INTEGER
    ;

compress_type :
    FOR LT_STRING
    ;

range_partition :
    PARTITION full_partition_name VALUES LESS THAN '(' range_partition_exp_list ')' storage_tag? subpartition_desc_option?
    | PARTITION full_partition_name VALUES EQU OR LESS THAN '(' range_partition_exp_list ')' storage_tag? subpartition_desc_option?
    ;

range_partition_list :
    range_partition (COMMA range_partition)*
    ;

hash_partition :
    PARTITION full_partition_name storage_tag? subpartition_desc_option?
    ;

hash_partition_list :
    hash_partition (COMMA hash_partition)*
    ;

list_partition :
    PARTITION full_partition_name VALUES '(' list_partition_value_list ')' storage_tag? subpartition_desc_option?
    ;

list_partition_list :
    list_partition (COMMA list_partition)*
    ;

split_partition_list :
    hash_partition (COMMA hash_partition)*
    ;

partition_act :
    horizon_partition_act
    | vertical_partition_act
    ;

vertical_partition_act :
    COLUMN '(' column_list ')' as_alias?
    | COLUMN '(' column_list_list ')'
    ;

interval_item :
    INTERVAL '(' exp ')'
    ;

horizon_partition_act_datatype :
    RANGE '(' datatype_list ')' subpartion_template_list_datatype_options? '(' range_partition_list ')'
    | HASH '(' datatype_list ')' subpartion_template_list_datatype_options? PARTITIONS (LT_INTEGER | DEFAULT) storage_hash_tag?
    | HASH '(' datatype_list ')' subpartion_template_list_datatype_options? '(' hash_partition_list ')'
    | LIST '(' datatype_list ')' subpartion_template_list_datatype_options? '(' list_partition_list ')'
    ;

horizon_partition_act :
    RANGE '(' column_list ')' interval_item? subpartion_template_list_options? '(' range_partition_list ')' lock_partitions_clause?
    | HASH '(' column_list ')' subpartion_template_list_options? PARTITIONS (LT_INTEGER | DEFAULT) storage_hash_tag? lock_partitions_clause?
    | HASH '(' column_list ')' subpartion_template_list_options? '(' hash_partition_list ')' lock_partitions_clause?
    | LIST '(' column_list ')' subpartion_template_list_options? '(' list_partition_list ')' lock_partitions_clause?
    | REFERENCE '(' constraint_name ')'
    ;

lock_partitions_clause :
    LOCK ROOT
    | LOCK PARTITIONS
    ;

subpartion_template_list_datatype_options :
    subpartion_template_list_datatype
    ;

subpartion_template_list_datatype :
    subpartion_template_datatype (COMMA subpartion_template_datatype)*
    ;

subpartion_template_list_options :
    subpartion_template_list
    ;

subpartion_template_list :
    subpartion_template (COMMA subpartion_template)*
    ;

subpartion_template_datatype :
    range_subpartion_template_datatype
    | hash_subpartion_template_datatype
    | list_subpartion_template_datatype
    ;

range_subpartion_template_datatype :
    SUBPARTITION BY RANGE '(' datatype_list ')'
    | SUBPARTITION BY RANGE '(' datatype_list ')' SUBPARTITION TEMPLATE '(' range_subpartition_list ')'
    ;

hash_subpartion_template_datatype :
    SUBPARTITION BY HASH '(' datatype_list ')' ((SUBPARTITION TEMPLATE)? hash_subpartions_template_datatype_option)?
    | SUBPARTITION BY HASH '(' datatype_list ')' SUBPARTITION TEMPLATE '(' hash_subpartition_list ')'
    ;

hash_subpartions_template_datatype_option :
    SUBPARTITIONS (LT_INTEGER | DEFAULT) storage_hash_tag?
    ;

list_subpartion_template_datatype :
    SUBPARTITION BY LIST '(' datatype_list ')'
    | SUBPARTITION BY LIST '(' datatype_list ')' SUBPARTITION TEMPLATE '(' list_subpartition_list ')'
    ;

subpartion_template :
    range_subpartion_template
    | hash_subpartion_template
    | list_subpartion_template
    ;

range_subpartion_template :
    SUBPARTITION BY RANGE '(' column_list ')'
    | SUBPARTITION BY RANGE '(' column_list ')' SUBPARTITION TEMPLATE '(' range_subpartition_list ')'
    ;

hash_subpartion_template :
    SUBPARTITION BY HASH '(' column_list ')' ((SUBPARTITION TEMPLATE)? hash_subpartions_template_option)?
    | SUBPARTITION BY HASH '(' column_list ')' SUBPARTITION TEMPLATE '(' hash_subpartition_list ')'
    ;

hash_subpartions_template_option :
    SUBPARTITIONS (LT_INTEGER | DEFAULT) storage_hash_tag?
    ;

list_subpartion_template :
    SUBPARTITION BY LIST '(' column_list ')' (SUBPARTITION TEMPLATE '(' list_subpartition_list ')')?
    ;

range_subpartition :
    SUBPARTITION full_partition_name VALUES LESS THAN '(' range_partition_exp_list ')' storage_tag?
    | SUBPARTITION full_partition_name VALUES EQU OR LESS THAN '(' range_partition_exp_list ')' storage_tag?
    ;

hash_subpartition :
    SUBPARTITION full_partition_name storage_tag?
    ;

list_subpartition :
    SUBPARTITION full_partition_name VALUES '(' list_partition_value_list ')' storage_tag?
    ;

range_subpartition_list :
    range_subpartition (COMMA range_subpartition)*
    ;

hash_subpartition_list :
    hash_subpartition (COMMA hash_subpartition)*
    ;

list_subpartition_list :
    list_subpartition (COMMA list_subpartition)*
    ;

subpartition_hash_desc :
    hash_subpartition subpartition_desc_option?
    ;

subpartition_range_desc :
    range_subpartition subpartition_desc_option?
    ;

subpartition_list_desc :
    list_subpartition subpartition_desc_option?
    ;

subpartition_hash_desc_list :
    subpartition_hash_desc (COMMA subpartition_hash_desc)*
    ;

subpartition_range_desc_list :
    subpartition_range_desc (COMMA subpartition_range_desc)*
    ;

subpartition_list_desc_list :
    subpartition_list_desc (COMMA subpartition_list_desc)*
    ;

subpartition_desc :
    '(' subpartition_range_desc_list ')'
    | '(' subpartition_hash_desc_list ')'
    | '(' subpartition_list_desc_list ')'
    | SUBPARTITIONS LT_INTEGER storage_hash_tag?
    ;

subpartition_desc_option :
    subpartition_desc
    ;

add_subpartition_desc :
    subpartition_range_desc_list
    | subpartition_hash_desc_list
    | subpartition_list_desc_list
    ;

partition_no :
    RANGE LT_INTEGER
    | LT_INTEGER
    ;

comment_clause :
    COMMENT LT_STRING
    ;

encrypt_clause_options :
    encrypt_clause
    ;

encrypt_clause :
    NO ENCRYPT
    | ENCRYPT
    | ENCRYPT encrypt_cipher
    | ENCRYPT encrypt_cipher hash_cipher
    | FULL ENCRYPT WITH full_cipher_name
    ;

encrypt_cipher :
    WITH full_cipher_name
    | WITH full_cipher_name encrypt_type
    | encrypt_type
    ;

crypto_name :
    id
    ;

cipher_name :
    id
    ;

full_cipher_name :
    id
    ;

encrypt_type :
    MANUAL
    | MANUAL manual_clause
    | AUTO
    | AUTO BY password
    | AUTO BY WRAPPED LT_STRING
    ;

manual_clause :
    user_clause
    | BY password user_clause_options?
    | BY WRAPPED LT_STRING user_clause_options?
    ;

user_clause_options :
    user_clause
    ;

user_clause :
    USER '(' user_list_option? ')'
    ;

user_list_option :
    user_list
    ;

user_list :
    user_name (COMMA user_list)*
    ;

hash_cipher :
    HASH WITH full_cipher_name
    | HASH WITH full_cipher_name hash_type
    ;

hash_type :
    SALT
    | NO SALT
    ;

space_limit :
    space_limit_nn
    ;

space_limit_nn :
    DISKSPACE LIMIT LT_INTEGER
    | DISKSPACE UNLIMITED
    ;

space_limit_1 :
    DISKSPACE LIMIT LT_INTEGER
    | DISKSPACE UNLIMITED
    ;

space_limit2 :
    DISKSPACE LIMIT LT_INTEGER
    | DISKSPACE UNLIMITED
    ;

del_res :
    DELETE
    | PRESERVE
    ;

trig_enable :
    ENABLE
    | DISABLE
    ;

at_raft :
    EXECUTE AT_KEYWORD id
    | EXECUTE AT_KEYWORD LT_INTEGER
    ;

create_trigger_stmt :
    CREATE replace_option? TRIGGER full_trigger_name2 (WITH ENCRYPTION)?  before_after
    ((trig_del_ins_upd_list local? ON full_table_name2) | (trig_event_list local? ON event_object at_raft?))
    trig_referencing_def_options? trig_for_each_option? trig_when_option? trig_enable? dmsubprogram
    | CREATE replace_option? TRIGGER full_trigger_name2 WRAPPED LT_STRING
    ;

before_after :
    BEFORE
    | AFTER
    | INSTEAD OF
    ;

trig_del_ins_upd_list :
    (trig_del_ins_upd (OF column_list)?) (OR (trig_del_ins_upd (OF column_list)?))*
    ;

trig_del_ins_upd :
    DELETE
    | INSERT
    | UPDATE
    ;

update_of_option :
    UPDATE nowait?
    | UPDATE OF full_column_list nowait?
    ;

nowait :
    NOWAIT
    | WAIT LT_INTEGER
    | SKIP_KEYWORD LOCKED
    | LT_INTEGER SKIP_KEYWORD LOCKED
    ;

trig_event_list :
    trig_event (OR trig_event)*
    ;

trig_event :
    CREATE
    | ALTER
    | DROP
    | AUDIT
    | NOAUDIT
    | GRANT
    | REVOKE
    | TRUNCATE
    | ANALYZE
    | LOGIN
    | LOGON
    | LOGOUT
    | LOGOFF
    | SERERR
    | BACKUP DATABASE
    | RESTORE DATABASE
    | TIMER
    | STARTUP
    | SHUTDOWN
    | COMMENT
    | DDL
    | CHECKPOINT
    ;

event_object :
    qualified_name '.' SCHEMA
    | SCHEMA
    | DATABASE
    ;

trig_referencing_def_options :
    trig_referencing_def
    ;

trig_referencing_def :
    REFERENCING trig_referencing_list
    ;

trig_referencing_list :
    trig_referencing_old
    | trig_referencing_new
    | trig_referencing_old trig_referencing_new
    ;

trig_referencing_old :
    OLD row_tag? as_tag? trig_old_name
    ;

trig_referencing_new :
    NEW row_tag? as_tag? trig_new_name
    ;

trig_for_each_option :
    FOR EACH ROW
    | FOR EACH STATEMENT
    | trig_timer_rate
    ;

trig_timer_rate :
    FOR ONCE AT_KEYWORD DATETIME LT_STRING max_run_duration? exec_ep_seqno?
    | rate_over_day rate_in_day duaring_date? max_run_duration? exec_ep_seqno?
    | repeat_interval duaring_date? max_run_duration? exec_ep_seqno?
    ;

exec_ep_seqno :
    EXECUTE AT_KEYWORD LT_INTEGER
    ;

rate_over_day :
    month_rate
    | week_rate
    | day_rate
    ;

month_rate :
    FOR EACH LT_INTEGER MONTH day_in_month
    | FOR EACH LT_INTEGER MONTH day_in_month_week
    ;

day_in_month :
    DAY LT_INTEGER
    ;

day_in_month_week :
    DAY LT_INTEGER OF WEEK LT_INTEGER
    | DAY LT_INTEGER OF WEEK LAST
    ;

week_rate :
    FOR EACH LT_INTEGER WEEK day_of_week_list
    ;

day_of_week_list :
    LT_INTEGER (COMMA LT_INTEGER)*
    ;

day_rate :
    FOR EACH LT_INTEGER DAY
    ;

rate_in_day :
    once_in_day
    | times_in_day
    ;

once_in_day :
    AT_KEYWORD TIME LT_STRING
    ;

times_in_day :
    duaring_time? FOR EACH LT_INTEGER MINUTE
    | duaring_time? FOR EACH LT_INTEGER SECOND
    ;

duaring_time :
    FROM TIME LT_STRING
    | FROM TIME LT_STRING TO TIME LT_STRING
    ;

duaring_date :
    FROM DATETIME LT_STRING
    | FROM DATETIME LT_STRING TO DATETIME LT_STRING
    ;

trig_when_option :
    WHEN '(' trig_when_condition ')'
    ;

trig_when_condition :
    bool_exp
    ;

repeat_interval_stmt :
    repeat_interval
    ;

max_run_duration :
    MAX_RUN_DURATION LT_INTEGER
    ;

repeat_interval :
    frequency_clause (SEMI interval_clause_single*)?
    ;

frequency_clause :
    FREQ '=' frequency_define
    ;

frequency_define :
    predefined_frequency
    ;

predefined_frequency :
    YEARLY
    | MONTHLY
    | WEEKLY
    | DAILY
    | HOURLY
    | MINUTELY
    | SECONDLY
    ;

interval_clause_list :
    interval_clause_single (SEMI interval_clause_single)*
    ;

interval_clause_single :
    interval_clause
    | bymonth_clause
    | byweekno_clause
    | byyearday_clause
    | bymonthday_clause
    | byday_clause
    | byhour_clause
    | byminute_clause
    | bysecond_clause
    ;

interval_clause :
    INTERVAL '=' intervalnum
    ;

intervalnum :
    LT_INTEGER
    ;

bymonth_clause :
    BYMONTH '=' monthlist
    ;

monthlist :
    month
    | monthlist COMMA month
    ;

month :
    numeric_month
    | char_month
    ;

numeric_month :
    LT_INTEGER
    ;

char_month :
    JAN
    | FEB
    | MAR
    | APR
    | MAY
    | JUN
    | JUL
    | AUG
    | SEP
    | OCT
    | NOV
    | DEC
    ;

byweekno_clause :
    BYWEEKNO '=' weekno_list
    ;

weekno_list :
    weekno (COMMA weekno)*
    ;

weekno :
    lt_integer_negative
    ;

byyearday_clause :
    BYYEARDAY '=' yearday_list
    ;

yearday_list :
    yearday (COMMA yearday)*
    ;

yearday :
    lt_integer_negative
    ;

bymonthday_clause :
    BYMONTHDAY '=' monthday_list
    ;

monthday_list :
    monthday (COMMA monthday)*
    ;

monthday :
    lt_integer_negative
    ;

byday_clause :
    BYDAY '=' byday_list
    ;

byday_list :
    byday (COMMA byday)*
    ;

byday :
    weekdaynum_options? day
    ;

weekdaynum_options :
    weekdaynum
    ;

weekdaynum :
    lt_integer_negative
    ;

day :
    MON
    | TUE
    | WED
    | THU
    | FRI
    | SAT
    | SUN
    ;

byhour_clause :
    BYHOUR '=' hour_list
    ;

hour_list :
    hour (COMMA hour)*
    ;

hour :
    LT_INTEGER
    ;

byminute_clause :
    BYMINUTE '=' minute_list
    ;

minute_list :
    minute (COMMA minute)*
    ;

minute :
    LT_INTEGER
    ;

bysecond_clause :
    BYSECOND '=' second_list
    ;

second_list :
    second (COMMA second)*
    ;

second :
    LT_INTEGER
    ;

query_rewrite :
    ENABLE QUERY REWRITE
    | DISABLE QUERY REWRITE
    ;

build_clause :
    BUILD IMMEDIATE
    | BUILD DEFERRED
    ;

mv_refresh_option :
    ON DEMAND
    | ON COMMIT
    | WITH PRIMARY KEY
    | WITH ROWID
    | START WITH exp
    | NEXT exp
    | FAST
    | COMPLETE
    | FORCE
    | complete_del_null
    ;

mv_refresh_option_list :
    mv_refresh_option+
    ;

mv_refresh_clause :
    REFRESH mv_refresh_option_list
    | NEVER REFRESH
    ;

mv_log_purge_syn_asyn_clause :
    SYNCHRONOUS
    | ASYNCHRONOUS
    ;

mv_log_purge_clause :
    PURGE REPEAT exp
    | PURGE START WITH exp REPEAT exp
    | PURGE IMMEDIATE mv_log_purge_syn_asyn_clause?
    | PURGE START WITH exp NEXT exp
    | PURGE START WITH exp
    | PURGE NEXT exp
    ;

mv_log_with_syntax_item :
    PRIMARY KEY
    | ROWID
    | SEQUENCE
    ;

mv_log_with_syntax_item_list :
    mv_log_with_syntax_item
    | mv_log_with_syntax_item COMMA mv_log_with_syntax_item
    | mv_log_with_syntax_item COMMA mv_log_with_syntax_item COMMA mv_log_with_syntax_item
    ;

mv_log_including_new_values :
    INCLUDING NEW VALUES
    | EXCLUDING NEW VALUES
    ;

mv_log_with_clause_null :
    mv_log_including_new_values?
    | WITH mv_log_with_syntax_item_list? column_list_options? mv_log_including_new_values?
    ;

create_materialized_view_log_stmt :
    CREATE MATERIALIZED VIEW LOG ON full_table_name horizon_partition_clause? space_limit? storage_tag? compress_tag? ctab_log_options? mv_log_with_clause_null mv_log_purge_clause?
    ;

prebuilt_table_clause_null :
    ON PREBUILT TABLE
    | ON PREBUILT TABLE WITHOUT REDUCED PRECISION
    | ON PREBUILT TABLE WITH REDUCED PRECISION
    ;

create_materialized_view_stmt :
    CREATE MATERIALIZED VIEW full_view_name2 column_list_options? build_clause? horizon_partition_clause? storage_tag? compress_tag? ctab_log_options? mv_refresh_clause? query_rewrite? AS select_stmt
    | CREATE MATERIALIZED VERTICAL VIEW full_view_name2 column_list_options? build_clause? horizon_partition_clause? storage_tag? compress_tag? ctab_log_options? mv_refresh_clause? query_rewrite? AS select_stmt
    | CREATE MATERIALIZED VIEW FOR full_table_name mv_refresh_clause? AS select_stmt
    | CREATE MATERIALIZED VIEW full_view_name2 FOR full_table_name prebuilt_table_clause_null mv_refresh_clause? query_rewrite? AS select_stmt
    ;

create_view_stmt :
    CREATE replace_option? force? VIEW not_exist? create_view_stmt_body
    ;

create_view_stmt_body :
    full_view_name2 column_list3_options? with_schemabinding? AS (without_into_select2 with_check_or_readonly_option? | joined_table | TABLE full_tv_name)
    ;

column_list3_options :
    '(' column_list3 ')'
    ;

column_list3 :
    column_name compress_level? compress_type?
    | column_list3 COMMA column_name compress_level? compress_type?
    | column_list3 COMMA view_constraint_def
    | column_name view_column_constraint_def
    | column_list3 COMMA column_name view_column_constraint_def
    ;

view_column_constraint_def :
    view_column_constraints constraint_attributes_options?
    ;

view_column_constraints :
    view_column_constraint
    ;

view_column_constraint :
    constraint_name_def_options? view_column_constraint_action DISABLE cons_novalidate?
    ;

view_column_constraint_action :
    view_unique_spec
    | view_refs_spec
    ;

view_constraint_def :
    constraint_name_def_options? view_constraint_clause DISABLE cons_novalidate?
    ;

with_schemabinding :
    WITH SCHEMABINDING
    ;

column_list_options :
    '(' column_list ')'
    ;

with_check_or_readonly_option :
    WITH check_level_option? CHECK OPTION
    | WITH READ ONLY
    ;

check_level_option :
    LOCAL
    | CASCADED
    ;

decl_cursor :
    cursor_declaration_2
    ;

delete_stmt :
    with_option? DELETE delete_stmt_body
    ;

delete_stmt_body :
    from_tag? from_tv where_current_option return_into_obj? limit_option? check_limit_option? log_errors?
    | from_tag? full_tv_name delete_multi_tv_option where_current_option return_into_obj? limit_option? check_limit_option? log_errors?
    ;

delete_multi_tv_option :
    FROM from_tv_list
    | USING from_tv_list
    ;

check_limit_option :
    CHECK LIMIT LT_INTEGER
    ;

where_current_option :
    where_clause?
    | WHERE CURRENT OF qualified_name
    | WHERE CURRENT OF CURSOR
    ;

where_clause :
    WHERE search_condition
    ;

start_with_clause_null :
    START WITH search_condition
    ;

connect_by_item :
    CONNECT BY nocycle_flag? search_condition
    ;

connect_by_clause :
    connect_by_item+
    ;

hierarchical_query_clause :
    connect_by_clause start_with_clause_null?
    | start_with_clause_null connect_by_clause
    ;

nocycle_flag :
    NOCYCLE
    ;

search_condition :
    bool_exp
    ;

disconnect_stmt :
    DISCONNECT disconnect_option
    ;

disconnect_option :
    CURRENT
    | ALL
    ;

drop_stmt :
    DROP drop_db_object drop_stmt_body_1
    | drop_stmt_2
    ;

drop_stmt_body_1 :
    full_object_name restrict_cascade? purge_option? is_detach?
    | LOG ON full_table_name
    ;

drop_stmt_2 :
    DROP drop_id_db_object full_object_name restrict_cascade? is_detach?
    | DROP PUBLIC drop_db_object full_object_name restrict_cascade? is_detach?
    | DROP PUBLIC drop_id_db_object full_object_name restrict_cascade? is_detach?
    | DROP TABLESPACE exist? tablespace_name
    | DROP HUGE TABLESPACE exist? full_object_name
    | DROP PARTITION GROUP full_object_name force_option?
    ;

drop_id_db_object :
    id_db_object exist?
    ;

id_db_object :
    ROLE
    | TYPE
    | SEQUENCE
    | DIRECTORY
    | PACKAGE
    | LINK
    | PROFILE
    ;

drop_db_object :
    db_object exist?
    ;

exist :
    IF EXISTS
    ;

not_exist :
    IF NOT EXISTS
    ;

db_object :
    FUNCTION
    | INDEX
    | PROCEDURE
    | TABLE
    | TRIGGER
    | VIEW
    | MATERIALIZED VIEW
    | USER
    | SCHEMA
    | LOGIN
    | AUDIT RULE
    | CRYPTO
    | PACKAGE BODY
    | TYPE BODY
    | SYNONYM
    | CLASS
    | CLASS BODY
    | DOMAIN
    | CHARACTER SET
    | COLLATION
    | CONTEXT
    | TABLESPACE SET
    ;

is_detach :
    DETACH
    ;

purge_option :
    PURGE
    ;

alter_database_stmt :
    alter_tag DATABASE alter_database_action
    | alter_tag DATABASE ADD NODE LOGFILE file_list
    | alter_tag DATABASE ADD NODE
    | alter_tag SYSTEM alter_system_action
    ;

alter_system_action :
    ARCHIVE LOG CURRENT
    | SWITCH LOGFILE
    ;

alter_database_action :
    ADD LOGFILE file_list
    | RENAME LOGFILE pathname_list TO pathname_list
    | RESIZE LOGFILE pathname TO LT_INTEGER
    | MOUNT
    | OPEN force?
    | SUSPEND
    | NORMAL force?
    | PRIMARY force?
    | STANDBY force?
    | ADD ARCHIVELOG LT_STRING
    | DELETE ARCHIVELOG LT_STRING
    | MODIFY ARCHIVELOG LT_STRING
    | ARCHIVELOG
    | NOARCHIVELOG
    | ARCHIVELOG CURRENT
    | ENABLE BLOCK CHANGE TRACKING
    | DISABLE BLOCK CHANGE TRACKING
    ;

force :
    NO FORCE
    | FORCE
    ;

tablespace_name :
    id
    ;

raft_name :
    id
    ;

fetch_into :
    INTO assignment_obj_list
    ;

bulk_or_single_into :
    fetch_into
    | BULK COLLECT INTO assignment_obj_list
    ;

fetch_stmt :
    FETCH fetch_tail
    ;

fetch_statement :
    FETCH CURSOR fetch_tail
    ;

fetch_tail :
    fetch_option? assign_obj bulk_or_single_into? fetch_limit_option?
    ;

fetch_limit_option :
    LIMIT exp
    ;

fetch_option :
    fetch_direct_option from_tag?
    ;

fetch_direct_option :
    NEXT
    | PRIOR
    | FIRST
    | LAST2
    | ABSOLUTE top_exp
    | RELATIVE top_exp
    ;

log_errors_into :
    INTO full_tv_name
    ;

log_errors_expression :
    '(' exp ')'
    ;

log_errors_unlimited :
    REJECT LIMIT UNLIMITED
    | REJECT LIMIT LT_INTEGER
    ;

log_errors :
    LOG ERRORS log_errors_into? log_errors_expression? log_errors_unlimited
    ;

insert_stmt :
    INSERT insert_stmt_body
    ;

insert_stmt_body :
    into_tag? full_tv_name alias_option? insert_tail return_into_obj? log_errors?
    | into_tag? select_with_paran alias_option? insert_tail return_into_obj? log_errors?
    | multi_insert_stmt_body
    ;

full_column_list_options :
    '(' full_column_list ')'
    ;

ins_value_options :
    VALUES ins_value
    ;

insert_into_single :
    INTO full_tv_name alias_option? full_column_list_options? ins_value_options?
    ;

multi_insert_into_list :
    insert_into_single+
    ;

multi_insert_tag :
    ALL
    | FIRST
    ;

insert_into_single_condition :
    WHEN bool_exp THEN multi_insert_into_list
    ;

multi_insert_into_condition_list :
    insert_into_single_condition+
    ;

multi_insert_into_else :
    ELSE multi_insert_into_list
    ;

multi_insert_stmt_body :
    ALL multi_insert_into_list without_into_select2 log_errors?
    | multi_insert_tag? multi_insert_into_condition_list multi_insert_into_else? without_into_select2 log_errors?
    ;

insert_tail :
    insert_action
    | '(' full_column_list ')' insert_action
    ;

insert_action :
    VALUES ins_value
    | without_into_select2
    | DEFAULT VALUES
    | call_proc_stmt_2
    | VALUES record_var_values
    | TABLE full_tv_name
    ;

record_var_values :
    record_var_value (COMMA record_var_value)*
    ;

record_var_value :
    member
    | invocation_expression
    | element_access
    | member_access
    ;

ins_value :
    '(' ')'
    | '(' ins_value_list ')'
    | ins_value COMMA '(' ins_value_list ')'
    ;

open_stmt :
    OPEN open_tail
    ;

open_statement :
    OPEN CURSOR open_tail
    ;

open_tail :
    assign_obj2
    | assign_obj2 FOR without_into_select
    | assign_obj2 FOR exp using_clause?
    ;

return_stmt :
    RETURN
    | RETURN bool_exp
    ;

raise_stmt :
    RAISE exp
    | RAISE
    ;

rollback_stmt :
    ROLLBACK work_tag? commit_tail? to_savepoint?
    ;

to_savepoint :
    TO SAVEPOINT savepoint_name
    | TO savepoint_name
    ;

savepoint_stmt :
    SAVEPOINT savepoint_name
    ;

select_stmt :
    without_into_select2
    ;

all_distinct_option :
    ALL
    | DISTINCT
    | UNIQUE
    ;

all_distinct_option_2 :
    ALL
    | DISTINCT
    | UNIQUE
    ;

corresponding_clause :
    CORRESPONDING
    | CORRESPONDING BY '(' column_list ')'
    ;

top_option :
    TOP top_exp PERCENT? (WITH TIES)?
    | TOP top_exp COMMA top_exp
    ;

limit_option :
    limit_clause
    | row_limiting_clause
    ;

limit_clause :
    LIMIT top_exp ((OFFSET | COMMA) top_exp)?
    | OFFSET top_exp LIMIT top_exp
    ;

limit_not_empty :
    limit_clause
    | row_limiting_clause
    ;

row_limiting_clause :
    FETCH first_next_desc row_num_desc ONLY
    | FETCH first_next_desc top_exp row_num_desc ONLY
    | FETCH first_next_desc row_num_desc WITH TIES
    | FETCH first_next_desc top_exp row_num_desc WITH TIES
    | FETCH first_next_desc top_exp PERCENT row_num_desc ONLY
    | FETCH first_next_desc top_exp PERCENT row_num_desc WITH TIES
    | OFFSET top_exp row_num_desc
    | OFFSET top_exp row_num_desc FETCH first_next_desc row_num_desc ONLY
    | OFFSET top_exp row_num_desc FETCH first_next_desc top_exp row_num_desc ONLY
    | OFFSET top_exp row_num_desc FETCH first_next_desc row_num_desc WITH TIES
    | OFFSET top_exp row_num_desc FETCH first_next_desc top_exp row_num_desc WITH TIES
    | OFFSET top_exp row_num_desc FETCH first_next_desc top_exp PERCENT row_num_desc ONLY
    | OFFSET top_exp row_num_desc FETCH first_next_desc top_exp PERCENT row_num_desc WITH TIES
    ;

row_num_desc :
    ROW
    | ROWS
    ;

first_next_desc :
    FIRST
    | NEXT
    ;

select_item_list :
    select_item (COMMA select_item)*
    ;

select_item :
    exp (alias | AS alias_2)
    | bool_exp
    | '*'
    ;

as_alias :
    AS alias_2
    ;

select_tail :
    from_clause? where_clause? hierarchical_query_clause? (group_by_clause having_clause? | having_clause group_by_clause?)?
    ;

from_clause :
    FROM from_tv_list
    ;

from_tv_list :
    from_tv (COMMA from_tv)*
    ;

from_tv :
    normal_tv joined_table_element*
    | '(' normal_tv joined_table_element+ ')'
    ;

joined_table :
    normal_tv joined_table_element+
    | '(' normal_tv joined_table_element+ ')'
    ;

trxid :
    LT_INTEGER
    ;

flashback_query_low :
    WHEN TIMESTAMP exp
    | WHEN TRXID trxid
    | AS OF TIMESTAMP exp
    | AS OF scn_or_lsn trxid
    | VERSIONS BETWEEN TIMESTAMP exp AND exp
    | VERSIONS BETWEEN TRXID trxid AND trxid
    | VERSIONS BETWEEN scn_or_lsn trxid_option AND trxid_option
    | AFTER OF TIMESTAMP exp
    | AFTER OF scn_or_lsn trxid
    ;

trxid_option :
    trxid
    | MINVALUE
    | MAXVALUE
    ;

range_from_to :
    TOP LT_INTEGER
    | FROM LT_INTEGER TO LT_INTEGER
    ;

sample_exp :
    LT_DECIMAL
    | LT_INTEGER
    | LT_REAL
    ;

pivot_sfun :
    invocation_expression as_alias?
    | invocation_expression alias
    ;

pivot_sfun_lst :
    pivot_sfun (COMMA pivot_sfun)*
    ;

pivot_for_clause :
    FOR '(' exp_list_2 ')'
    | FOR exp
    ;

pivot_in_clause1_expr :
    exp as_alias?
    | exp alias
    | '(' exp_list_2 ')' as_alias?
    | '(' exp_list_2 ')' alias
    | ANY
    ;

pivot_in_clause_low_1 :
    pivot_in_clause1_expr
    | pivot_in_clause_low_1 COMMA pivot_in_clause1_expr
    ;

pivot_in_clause_low_2 :
    without_into_select
    ;

pivot_in_clause_low :
    pivot_in_clause_low_1
    | pivot_in_clause_low_2
    ;

pivot_xml :
    XML
    ;

pivot_clause_low :
    PIVOT pivot_xml? '(' pivot_sfun_lst pivot_for_clause IN '(' pivot_in_clause_low? ')' ')'
    ;

unpivot_val_col_lst :
    exp
    | '(' exp_list_2 ')'
    ;

include_clause :
    INCLUDE NULLS
    | EXCLUDE NULLS
    ;

unpivot_in_clause_expr :
    exp AS exp
    | exp
    | '(' exp_list_2 ')' AS '(' exp_list_2 ')'
    | '(' exp_list_2 ')' AS exp
    | '(' exp_list_2 ')'
    ;

unpivot_in_clause_low :
    unpivot_in_clause_expr (COMMA unpivot_in_clause_expr)*
    ;

unpivot_clause_low :
    UNPIVOT include_clause? '(' unpivot_val_col_lst pivot_for_clause IN '(' unpivot_in_clause_low ')' ')'
    ;

sample_clause_low :
    SAMPLE '(' sample_exp ')'
    | SAMPLE '(' sample_exp ')' SEED '(' sample_exp ')'
    | SAMPLE BLOCK '(' sample_exp ')'
    | SAMPLE BLOCK '(' sample_exp ')' SEED '(' sample_exp ')'
    ;

normal_tv_name :
    full_tv_name
    | '(' full_tv_name ')'
    ;

normal_tv_tail :
    normal_tv_tail_low (WITH '(' NOLOCK ')')?
    | WITH '(' NOLOCK ')' normal_tv_tail_low?
    ;

normal_tv_tail_low :
    normal_tv_tail_low2 normal_alias?
    | normal_alias
    ;

normal_alias :
    AS alias_2
    | alias
    ;

normal_tv_tail_low2 :
    normal_tv_tail_low3+
    ;

normal_tv_tail_low3 :
    normal_alias? (pivot_clause_low | unpivot_clause_low)
    | flashback_query_low
    | sample_clause_low
    ;

normal_tv_derived_table_options :
    normal_tv_derived_table_low
    ;

normal_tv_derived_table_low :
    normal_tv_tail_low2 (normal_alias column_list_options?)?
    | normal_alias column_list_options?
    ;

normal_tv_derived_table :
    select_with_paran
    | select_with_paran_with_alias
    ;

select_with_paran_with_alias :
    select_with_paran normal_tv_derived_table_low
    | '(' select_with_paran_with_alias ')' normal_alias ?
    ;

from_table_exp :
    TABLE '(' exp ')'
    | '(' from_table_exp ')'
    ;

from_table_select_with_paran :
    TABLE select_with_paran
    | '(' from_table_select_with_paran ')'
    ;

normal_tv :
    normal_tv_name normal_tv_tail?
    | ARRAY pexp_pfx range_from_to? (as_alias | alias)?
    | from_table_exp range_from_to? alias
    | from_table_select_with_paran range_from_to? (as_alias | alias)?
    | XMLTABLE '(' exp xml_passing? xmlcoldef_lst_options? ')' alias_option?
    | JSON_TABLE '(' argument COMMA LT_STRING on_error? jsoncol_lst ')' (as_alias | alias)?
    | normal_tv_derived_table
    | full_tv_name '(' column_list2 ')' normal_tv_derived_table_options?
    ;

xml_passing :
    PASSING exp
    ;

xmlcoldef_lst_options :
    COLUMNS xmlcoldef_lst
    ;

xmlcoldef_lst :
    xmlcoldef (COMMA xmlcoldef)*
    ;

xmlcoldef :
    column_name datatype PATH exp
    ;

on_error :
    NULL ON ERROR
    | ERROR ON ERROR
    | DEFAULT exp ON ERROR
    ;

jsoncol_lst :
    COLUMNS '(' jsoncoldef_lst ')'
    ;

jsoncoldef_lst :
    jsoncoldef (COMMA jsoncoldef)*
    ;

jsoncoldef :
    json_exists_col
    | json_qurey_col
    | json_value_col
    | json_nested_col
    | ordinality_col
    ;

json_exists_col :
    column_name datatype EXISTS PATH LT_STRING on_error?
    ;

json_qurey_col :
    column_name datatype FORMAT JSON PATH LT_STRING on_error?
    ;

json_value_col :
    column_name datatype PATH LT_STRING on_error?
    ;

json_nested_col :
    NESTED_PATH LT_STRING jsoncol_lst
    ;

ordinality_col :
    column_name FOR ORDINALITY
    ;

joined_table_element :
    cross_join
    | qualified_join
    | cross_outer_apply_join
    ;

cross_outer_apply_clause :
    CROSS APPLY
    | OUTER APPLY
    ;

cross_outer_apply_join :
    cross_outer_apply_clause normal_tv
    | cross_outer_apply_clause '(' joined_table ')'
    ;

cross_join :
    CROSS JOIN normal_tv
    | CROSS JOIN '(' joined_table ')'
    ;

partition_out_join :
    PARTITION BY '(' exp_list ')'
    ;

qualified_join :
    NATURAL JOIN normal_tv
    | NATURAL JOIN '(' joined_table ')'
    | NATURAL join_type JOIN normal_tv
    | NATURAL join_type JOIN '(' joined_table ')'
    | JOIN from_tv qualified_joinspec
    | partition_out_join? join_type join_hint? JOIN from_tv partition_out_join? qualified_joinspec
    ;

qualified_joinspec :
    ON join_condition
    | named_columns_join
    ;

named_columns_join :
    USING '(' column_list ')'
    ;

join_hint :
    HASH
    | MERGE
    ;

join_type :
    INNER
    | outer_join_type (INNER | OUTER)?
    ;

outer_join_type :
    LEFT
    | RIGHT
    | FULL
    ;

join_condition :
    bool_exp
    ;

group_by_clause :
    GROUP BY group_item
    ;

group_item :
    exp_rollup_cube_item
    | exp_rollup_cube_item2
    ;

exp_rollup_cube_item2 :
    exp_rollup_cube_item COMMA exp_rollup_cube_item
    | exp_rollup_cube_item2 COMMA exp_rollup_cube_item
    ;

exp_rollup_cube_item :
    exp
    | '(' ')'
    | '(' exp_list_2 ')'
    | ROLLUP '(' grouping_set_items ')'
    | CUBE '(' grouping_set_items ')'
    | GROUPING SETS '(' grouping_set_items ')'
    ;

grouping_set_items :
    grouping_set_item
    | grouping_set_items COMMA grouping_set_item
    ;

grouping_set_item :
    exp
    | '(' ')'
    | '(' exp_list_2 ')'
    ;

having_clause :
    HAVING search_condition
    ;

without_into_select :
    (simple_select | select_with_paran) (sel_clause_app for_xml_path?)?
    ;

sel_clause_app :
    order_by ((for_update limit_option?) | (limit_not_empty for_update_options?))?
    | for_update order_by? limit_option?
    | limit_not_empty order_by? for_update_options?
    ;

select_clause :
    query_exp
    | select_with_paran
    ;

simple_select :
    select_clause ( (UNION | EXCEPT | MINUS | INTERSECT) all_distinct_option? corresponding_clause? select_clause)*
    ;

select_with_paran :
    '(' without_into_select ')'
    | '(' select_with_paran ')'
    ;

query_exp :
    with_option? SELECT all_distinct_option? top_option? select_item_list bulk_or_single_into? select_tail for_xml_path?
    ;

for_xml_path :
    FOR XML PATH '(' LT_STRING ')'
    ;

with_tag :
    WITH
    | WITH RECURSIVE
    ;

with_option :
    with_tag with_clause
    ;

with_clause :
    with_function_list
    | with_view_list
    | with_function_list with_view_list
    ;

with_function_list :
    with_function_list_element+
    ;

func_def_inner :
    encryption_option? calc_option? param_def_list_option? RETURN plsql_datatype func_call_options? func_action
    ;

with_function_list_element :
    FUNCTION id func_def_inner SEMI
    ;

with_view_list :
    with_view_list_element (COMMA with_view_list_element)*
    ;

depth_type_option :
    DEPTH FIRST BY
    | BREADTH FIRST BY
    ;

search_clause :
    SEARCH depth_type_option order_by_list SET full_column_name
    ;

cycle_clause :
    CYCLE full_column_list SET full_column_name TO default_exp DEFAULT default_exp
    ;

with_view_list_element :
    id column_list_options? AS select_with_paran search_clause? cycle_clause?
    ;

assignment_obj_list :
    assignment_obj (COMMA assignment_obj)*
    ;

assignment_obj :
    pexp_pfx
    | stm_param_name
    ;

order_by_options :
    order_by
    ;

order_by :
    ORDER BY order_by_list
    | ORDER SIBLINGS BY order_by_list
    ;

asc_desc_option :
    ASC
    | DESC
    ;

nulls_last_option :
    NULLS FIRST
    | NULLS LAST
    ;

collate_option :
    COLLATE id
    ;

order_by_list :
    order_by_item (COMMA order_by_item)*
    ;

order_by_item :
    bool_exp collate_option? asc_desc_option? nulls_last_option?
    ;

for_update_options :
    for_update
    ;

for_update :
    FOR READ ONLY
    | FOR update_of_option
    ;

set_session_stmt :
    SET SESSION CHARACTERISTICS AS trans_mode_lst
    ;

set_trans_stmt :
    SET TRANSACTION trans_mode_lst
    | SET TIME ZONE exp
    | START TRANSACTION trans_mode_lstl?
    ;

trans_mode_lstl :
    trans_mode_lst
    ;

trans_mode_lst :
    trans_mode (COMMA trans_mode)*
    ;

trans_mode :
    trans_rw_option
    | ISOLATION LEVEL trans_level_option
    | DIAGNOSTICS SIZE LT_INTEGER
    ;

time_zone_exp_new :
    AT LOCAL
    | AT TIME ZONE exp
    ;

trans_rw_option :
    READ ONLY
    | READ WRITE
    ;

trans_level_option :
    READ COMMITTED
    | SERIALIZABLE
    | REPEATABLE READ
    | READ UNCOMMITTED
    ;

lock_table_stmt :
    LOCK TABLE full_tv_name IN lock_mode_option MODE
    | LOCK TABLE full_tv_name IN lock_mode_option MODE NOWAIT
    ;

lock_mode_option :
    SHARE
    | EXCLUSIVE
    | INTENT SHARE
    | INTENT EXCLUSIVE
    | SHARE INTENT EXCLUSIVE
    | ROW SHARE
    | SHARE UPDATE
    | ROW EXCLUSIVE
    | SHARE ROW EXCLUSIVE
    ;

set_identins_stmt :
    SET IDENTITY_INSERT full_table_name set_identins_option
    ;

set_identins_option :
    OFF
    | ON
    | ON WITH REPLACE NULL
    ;

trunc_table_stmt :
    TRUNCATE TABLE full_table_name reuse_storage_option? cascade_opt?
    | TRUNCATE TABLE full_table_name PARTITION truncate_partition_name reuse_storage_option? cascade_opt?
    ;

update_stmt :
    with_option? UPDATE update_stmt_body
    ;

update_stmt_body :
    update_tv_list SET set_value_list update_from_clause? where_current_option collect_into_rset? return_into_obj? limit_option? check_limit_option? log_errors?
    ;

update_tv_list :
    from_tv_list
    ;

return_item :
    exp
    ;

return_item_list :
    return_item (COMMA return_item)*
    ;

return_option :
    RETURN
    | RETURNING
    ;

return_into_obj :
    return_option return_item_list INTO assignment_obj_list
    | return_option return_item_list BULK COLLECT INTO assignment_obj_list
    ;

collect_into_rset :
    INTO assignment_obj
    ;

alias_option :
    alias
    | AS alias_2
    ;

set_value_list :
    set_value_node (COMMA set_value_node)*
    ;

set_value_node :
    full_column_name assign_op DEFAULT
    | full_column_name assign_op exp
    | '(' set_col_list ')' assign_op select_with_paran
    | '(' set_col_list ')' assign_op record_var_value
    | ROW assign_op record_var_value
    ;

set_col_list :
    full_column_name (COMMA full_column_name)*
    ;

update_from_clause :
    from_clause
    ;

merge_into_stmt :
    MERGE merge_into_stmt_body
    ;

merge_into_stmt_body :
    INTO full_tv_name alias_option? USING from_tv ON bool_exp merge_into_sub_clause log_errors?
    | INTO select_with_paran alias_option? USING from_tv ON bool_exp merge_into_sub_clause log_errors?
    ;

merge_into_sub_clause :
    merge_update_clause merge_insert_clause
    | merge_insert_clause merge_update_clause
    | merge_update_clause
    | merge_insert_clause
    ;

merge_update_clause :
    WHEN MATCHED THEN UPDATE SET set_value_list where_clause?
    | WHEN MATCHED THEN UPDATE SET set_value_list where_clause? DELETE where_clause?
    ;

merge_insert_clause :
    WHEN NOT MATCHED THEN INSERT full_column_list_options? VALUES '(' ins_value_list ')' where_clause?
    ;

create_profile_stmt :
    CREATE PROFILE not_exist? profile_name resource_limit_options?
    ;

alter_profile_stmt :
    alter_tag PROFILE profile_name resource_limit_options?
    ;

create_user_stmt :
    CREATE USER not_exist? user_name
    | CREATE USER not_exist? user_name IDENTIFIED authent_type pwd_policy? account_lock? user_encrypt_options? space_limit? read_only_flag? resource? expire? allow_ip_list? not_allow_ip_list? allow_dt_list? not_allow_dt_list? default_ts_name? quota_ts?
    ;

default_ts_name :
    default_ts_name_lst
    ;

default_ts_name_lst :
    default_ts_name_node+
    ;

default_ts_name_node :
    default_ts_name_low
    | temp_ts_name
    | default_idx_ts_name
    | default_ts_group_name_low
    ;

default_idx_ts_name :
    DEFAULT INDEX TABLESPACE tablespace_name
    ;

default_ts_name_low :
    DEFAULT TABLESPACE tablespace_name
    | DEFAULT TABLESPACE NULL
    ;

temp_ts_name :
    TEMPORARY TABLESPACE tablespace_name
    ;

default_ts_group_name_low :
    DEFAULT TABLESPACE GROUP tablespace_name
    | DEFAULT TABLESPACE GROUP NULL
    ;

on_schema :
    ON SCHEMA id
    ;

replace_old_pwd :
    REPLACE password
    ;

alter_user_stmt :
    alter_tag USER user_name authent_type_options? replace_old_pwd? pwd_policy? account_lock? user_encrypt_options? space_limit2? read_only_flag? resource? expire? allow_ip_list? not_allow_ip_list? allow_dt_list? not_allow_dt_list? default_ts_name? on_schema? quota_ts?
    | alter_tag USER user_name GRANT CONNECT THROUGH user_name
    | alter_tag USER user_name REVOKE CONNECT THROUGH user_name
    ;

user_encrypt_options :
    user_encrypt_option
    ;

user_encrypt_option :
    ENCRYPT BY password
    | ENCRYPT BY WRAPPED LT_STRING
    ;

authent_type_options :
    IDENTIFIED authent_type
    ;

hash_cipher_option :
    hash_cipher
    ;

authent_type :
    BY password hash_cipher_option? force_format?
    | EXTERNALLY as?
    | BY WRAPPED LT_STRING hash_cipher_option?
    ;

force_format :
    FORCE FORMAT
    ;

as :
    AS LT_STRING
    ;

pwd_policy :
    PASSWORD_POLICY LT_INTEGER
    ;

account_lock :
    ACCOUNT LOCK
    | ACCOUNT UNLOCK
    ;

read_only_flag :
    READ ONLY
    | NOT READ ONLY
    ;

read_only_flag_not_null :
    READ ONLY
    | READ WRITE
    ;

resource :
    LIMIT resource_limit_list
    | PROFILE profile_name
    | DROP PROFILE
    ;

expire :
    PASSWORD EXPIRE
    ;

resource_limit_options :
    LIMIT resource_limit_list
    ;

resource_limit_list :
    resource_limit_list_with_comma
    | resource_limit_list_with_empty
    ;

resource_limit_list_with_comma :
    resource_limit
    | resource_limit COMMA resource_limit_list_with_comma
    ;

resource_limit_list_with_empty :
    resource_limit resource_limit
    | resource_limit resource_limit_list_with_empty
    ;

resource_limit :
    SESSION_PER_USER resource_limit_value
    | CONNECT_IDLE_TIME resource_limit_value
    | FAILED_LOGIN_ATTEMPS resource_limit_value
    | FAILED_LOGIN_ATTEMPTS resource_limit_value
    | PASSWORD_LIFE_TIME resource_limit_value
    | PASSWORD_REUSE_TIME resource_limit_value
    | PASSWORD_REUSE_MAX resource_limit_value
    | PASSWORD_LOCK_TIME resource_limit_value
    | PASSWORD_GRACE_TIME resource_limit_value
    | CPU_PER_CALL resource_limit_value
    | CPU_PER_SESSION resource_limit_value
    | MEM_SPACE resource_limit_value
    | READ_PER_CALL resource_limit_value
    | READ_PER_SESSION resource_limit_value
    | CONNECT_TIME resource_limit_value
    ;

resource_limit_value :
    UNLIMITED
    | DEFAULT
    | LT_INTEGER
    ;

create_audit_rule_stmt :
    CREATE AUDIT RULE rule_name audit_rule_action by_login_or_all whenever_stmt_options? allow_ip_list? allow_dt_list? op_freq?
    ;

rule_name :
    id
    ;

audit_rule_action :
    STARTUP
    | SHUTDOWN
    | DATABASE
    | LOGIN
    | CONNECT
    | ROLLBACK
    | COMMIT
    | USER
    | ROLE
    | SCHEMA
    | TABLE
    | VIEW
    | INDEX
    | PROCEDURE
    | TRIGGER
    | SEQUENCE
    | CONTEXT
    | GRANT
    | REVOKE
    | AUDIT
    | NOAUDIT
    | INSERT TABLE
    | UPDATE TABLE
    | DELETE TABLE
    | SELECT TABLE
    | LOCK TABLE
    | EXECUTE PROCEDURE
    | SELECT ON full_object_name
    | INSERT ON full_object_name
    | UPDATE ON full_object_name
    | DELETE ON full_object_name
    | EXECUTE ON full_object_name
    | PACKAGE
    | PACKAGE BODY
    | SYNONYM
    | TYPE
    | TYPE BODY
    | PROFILE
    ;

by_login_or_all :
    BY login_name
    | BY ALL
    ;

allow_ip_list :
    ALLOW_IP NULL
    | ALLOW_IP ip_list
    ;

not_allow_ip_list :
    NOT_ALLOW_IP NULL
    | NOT_ALLOW_IP ip_list
    ;

ip_list :
    id
    | id COMMA ip_list
    ;

allow_dt_list :
    ALLOW_DATETIME NULL
    | ALLOW_DATETIME dt_list
    ;

not_allow_dt_list :
    NOT_ALLOW_DATETIME NULL
    | NOT_ALLOW_DATETIME dt_list
    ;

dt_list :
    dt
    | dt COMMA dt_list
    ;

dt :
    id id TO id id
    ;

op_freq :
    INTERVAL LT_INTEGER TIMES LT_INTEGER
    ;

quota_val :
    LT_INTEGER
    | LT_INTEGER LT_IDENTIFIER
    ;

quota_ts_node :
    QUOTA quota_val ON tablespace_name
    | QUOTA UNLIMITED ON tablespace_name
    ;

quota_ts_lst :
    quota_ts_node
    | quota_ts_lst quota_ts_node
    ;

quota_ts :
    quota_ts_lst
    | QUOTA UNLIMITED
    | QUOTA LT_INTEGER
    ;

create_role_stmt :
    CREATE ROLE not_exist? role_name
    ;

create_dblink_stmt :
    CREATE replace_option? LINK not_exist? qualified_name CONNECT db_type_str? WITH login_name IDENTIFIED BY password USING LT_STRING dblink_option_lst_options?
    | CREATE replace_option? LINK not_exist? qualified_name CONNECT db_type_str? WITH login_name IDENTIFIED BY WRAPPED LT_STRING USING LT_STRING dblink_option_lst_options?
    | CREATE replace_option? PUBLIC LINK not_exist? qualified_name CONNECT db_type_str? WITH login_name IDENTIFIED BY password USING LT_STRING dblink_option_lst_options?
    | CREATE replace_option? PUBLIC LINK not_exist? qualified_name CONNECT db_type_str? WITH login_name IDENTIFIED BY WRAPPED LT_STRING USING LT_STRING dblink_option_lst_options?
    ;

db_type_str :
    LT_STRING
    ;

dblink_option_lst_options :
    OPTION '(' dblink_option_lst ')'
    ;

dblink_option_lst :
    dblink_option (COMMA dblink_option)*
    ;

dblink_option :
    id '=' exp
    ;

create_synonym_stmt :
    CREATE replace_option? PUBLIC SYNONYM not_exist? full_synonym_name FOR full_obj_name
    | CREATE replace_option? SYNONYM not_exist? full_synonym_name FOR full_obj_name
    ;

full_synonym_name :
    qualified_name
    ;

full_obj_name :
    qualified_name dblink_clause?
    ;

create_domain_stmt :
    CREATE DOMAIN not_exist? qualified_name as_tag? datatype charset_option? domain_default_option? domain_constraints_option?
    ;

domain_default_option :
    default_clause
    ;

domain_constraints_option :
    domain_constraints_def
    ;

domain_constraints_def :
    domain_constraints constraint_attributes_options?
    ;

domain_constraints :
    domain_constraint+
    ;

domain_constraint :
    domain_constraint_name_def_options? column_constraint_action
    ;

domain_constraint_name_def_options :
    domain_constraint_name_def
    ;

domain_constraint_name_def :
    CONSTRAINT domain_constraint_name
    ;

domain_constraint_name :
    qualified_name
    ;

create_character_set_stmt :
    CREATE CHARACTER SET not_exist? character_set_name as_tag? character_set_source collate_clause_option?
    ;

character_set_source :
    GET existing_character_set_name
    ;

existing_character_set_name :
    character_set_name
    ;

character_set_name :
    qualified_name
    ;

collate_clause_option :
    COLLATE collation_name
    | COLLATION FROM DEFAULT
    ;

collation_name :
    qualified_name
    ;

create_collation_stmt :
    CREATE COLLATION not_exist? collation_name FOR existing_character_set_name FROM existing_collation_name pad_option?
    ;

existing_collation_name :
    collation_name
    ;

pad_option :
    NO PAD
    | PAD SPACE_KEYWORD
    ;

create_sequence_stmt :
    CREATE SEQUENCE not_exist? sequence_name sequence_option_list_options?
    | alter_tag SEQUENCE sequence_name sequence_option_list_options?
    ;

sequence_option_list_options :
    sequence_option_list
    ;

sequence_option_list :
    sequence_option
    | sequence_option sequence_option_list
    ;

sequence_option :
    increment_option
    | start_option
    | current_option
    | maxvalue_option
    | minvalue_option
    | cycle_option
    | cache_option
    | order_option
    | seq_local_option
    ;

sequence_name :
    qualified_name
    ;

increment_option :
    INCREMENT BY exp
    ;

start_option :
    START WITH exp
    ;

current_option :
    CURRENT VALUE exp
    ;

maxvalue_option :
    MAXVALUE exp
    | NOMAXVALUE
    ;

minvalue_option :
    MINVALUE exp
    | NOMINVALUE
    ;

cycle_option :
    CYCLE
    | NOCYCLE
    ;

cache_option :
    CACHE exp
    | NOCACHE
    ;

order_option :
    ORDER
    | NOORDER
    ;

seq_local_option :
    GLOBAL
    | LOCAL
    ;

whenever_stmt_options :
    WHENEVER whenever_stmt
    ;

whenever_stmt :
    SUCCESSFUL
    | NOT SUCCESSFUL
    ;

grant_stmt :
    grant_tag grant_stmt_body
    ;

grant_tag :
    GRANT
    ;

grant_stmt_body :
    grant_privs ON full_object_name TO grantees with_grant_option? by_grantor?
    | grant_privs ON db_object full_object_name TO grantees with_grant_option? by_grantor?
    | grant_privs ON qualified_name full_object_name TO grantees with_grant_option? by_grantor?
    | db_priv_list TO grantees with_admin_option? by_grantor?
    | grant_privs TO grantees with_admin_option? by_grantor?
    ;

revoke_stmt :
    REVOKE revoke_stmt_body
    ;

revoke_stmt_body :
    grant_privs ON full_object_name FROM grantees revoke_action? by_grantor?
    | GRANT OPTION FOR grant_privs ON full_object_name FROM grantees revoke_action? by_grantor?
    | grant_privs ON db_object full_object_name FROM grantees revoke_action? by_grantor?
    | GRANT OPTION FOR grant_privs ON db_object full_object_name FROM grantees revoke_action? by_grantor?
    | grant_privs ON qualified_name qualified_name FROM grantees revoke_action? by_grantor?
    | GRANT OPTION FOR grant_privs ON qualified_name qualified_name FROM grantees revoke_action? by_grantor?
    | db_priv_list FROM grantees by_grantor?
    | ADMIN OPTION FOR db_priv_list FROM grantees by_grantor?
    | grant_privs FROM grantees by_grantor?
    | ADMIN OPTION FOR role_name_list FROM grantees by_grantor?
    ;

grant_privs :
    ALL
    | ALL PRIVILEGES
    | grant_priv_list
    ;

grant_priv_list :
    grant_priv
    | grant_priv COMMA grant_priv_list
    ;

grant_priv_off :
    OFF
    ;

grant_priv :
    SELECT grant_priv_off?
    | INSERT grant_priv_off?
    | DELETE grant_priv_off?
    | UPDATE grant_priv_off?
    | REFERENCES grant_priv_off?
    | EXECUTE grant_priv_off?
    | SELECT FOR DUMP grant_priv_off?
    | SELECT '(' column_list ')'
    | UPDATE '(' column_list ')'
    | INSERT '(' column_list ')'
    | REFERENCES '(' column_list ')'
    | ALTER grant_priv_off?
    | INDEX grant_priv_off?
    | role_name
    | FLASHBACK grant_priv_off?
    ;

revoke_action :
    RESTRICT
    | CASCADE
    ;

db_priv_list :
    db_priv
    | db_priv COMMA db_priv_list
    ;

db_priv :
    ALTER DATABASE
    | BACKUP DATABASE
    | RESTORE DATABASE
    | CREATE USER
    | ALTER USER
    | DROP USER
    | CREATE ROLE
    | DROP ROLE
    | ADMIN ANY ROLE
    | ADMIN ANY DATABASE PRIVILEGE
    | GRANT ANY OBJECT PRIVILEGE
    | CREATE SCHEMA
    | DROP SCHEMA
    | CREATE ANY SCHEMA
    | DROP ANY SCHEMA
    | CREATE TABLE
    | DROP TABLE
    | CREATE ANY TABLE
    | ALTER ANY TABLE
    | ALTER TABLE
    | DROP ANY TABLE
    | INSERT TABLE
    | INSERT ANY TABLE
    | UPDATE TABLE
    | UPDATE ANY TABLE
    | DELETE TABLE
    | DELETE ANY TABLE
    | SELECT TABLE
    | SELECT ANY TABLE
    | REFERENCES TABLE
    | REFERENCES ANY TABLE
    | GRANT TABLE
    | GRANT ANY TABLE
    | CREATE VIEW
    | DROP VIEW
    | CREATE ANY VIEW
    | ALTER ANY VIEW
    | ALTER VIEW
    | DROP ANY VIEW
    | INSERT VIEW
    | INSERT ANY VIEW
    | UPDATE VIEW
    | UPDATE ANY VIEW
    | DELETE VIEW
    | DELETE ANY VIEW
    | SELECT VIEW
    | SELECT ANY VIEW
    | GRANT VIEW
    | GRANT ANY VIEW
    | CREATE PROCEDURE
    | DROP PROCEDURE
    | CREATE ANY PROCEDURE
    | DROP ANY PROCEDURE
    | EXECUTE PROCEDURE
    | EXECUTE ANY PROCEDURE
    | GRANT PROCEDURE
    | GRANT ANY PROCEDURE
    | CREATE SEQUENCE
    | DROP SEQUENCE
    | ALTER ANY SEQUENCE
    | ALTER SEQUENCE
    | CREATE ANY SEQUENCE
    | DROP ANY SEQUENCE
    | SELECT SEQUENCE
    | SELECT ANY SEQUENCE
    | GRANT SEQUENCE
    | GRANT ANY SEQUENCE
    | DROP TRIGGER
    | CREATE TRIGGER
    | CREATE ANY TRIGGER
    | DROP ANY TRIGGER
    | ALTER ANY TRIGGER
    | ALTER TRIGGER
    | CREATE INDEX
    | DROP INDEX
    | CREATE ANY INDEX
    | ALTER ANY INDEX
    | ALTER INDEX
    | DROP ANY INDEX
    | CREATE CONTEXT INDEX
    | DROP CONTEXT INDEX
    | CREATE ANY CONTEXT INDEX
    | ALTER ANY CONTEXT INDEX
    | ALTER CONTEXT INDEX
    | DROP ANY CONTEXT INDEX
    | CREATE PACKAGE
    | DROP PACKAGE
    | CREATE ANY PACKAGE
    | DROP ANY PACKAGE
    | EXECUTE PACKAGE
    | EXECUTE ANY PACKAGE
    | GRANT PACKAGE
    | GRANT ANY PACKAGE
    | CREATE LINK
    | DROP LINK
    | CREATE ANY LINK
    | DROP ANY LINK
    | CREATE SYNONYM
    | DROP SYNONYM
    | CREATE ANY SYNONYM
    | DROP ANY SYNONYM
    | CREATE PUBLIC SYNONYM
    | DROP PUBLIC SYNONYM
    | CREATE REPLICATE
    | ALTER REPLICATE
    | DROP REPLICATE
    | AUDIT DATABASE
    | LABEL DATABASE
    | VERIFY DATABASE
    | CREATE TABLESPACE
    | DROP TABLESPACE
    | ALTER TABLESPACE
    | CREATE MATERIALIZED VIEW
    | DROP MATERIALIZED VIEW
    | CREATE ANY MATERIALIZED VIEW
    | DROP ANY MATERIALIZED VIEW
    | ALTER ANY MATERIALIZED VIEW
    | ALTER MATERIALIZED VIEW
    | SELECT MATERIALIZED VIEW
    | SELECT ANY MATERIALIZED VIEW
    | CREATE ANY DOMAIN
    | DROP ANY DOMAIN
    | CREATE DOMAIN
    | DROP DOMAIN
    | GRANT ANY DOMAIN
    | GRANT DOMAIN
    | USAGE ANY DOMAIN
    | USAGE DOMAIN
    | CREATE ANY CHARACTER SET
    | DROP ANY CHARACTER SET
    | CREATE CHARACTER SET
    | DROP CHARACTER SET
    | GRANT ANY CHARACTER SET
    | GRANT CHARACTER SET
    | USAGE ANY CHARACTER SET
    | USAGE CHARACTER SET
    | CREATE ANY COLLATION
    | DROP ANY COLLATION
    | CREATE COLLATION
    | DROP COLLATION
    | GRANT ANY COLLATION
    | GRANT COLLATION
    | USAGE ANY COLLATION
    | USAGE COLLATION
    | CREATE ANY CONTEXT
    | DROP ANY CONTEXT
    | GRANT ANY CONTEXT
    | SELECT ANY DICTIONARY
    | ADMIN REPLAY
    | ADMIN BUFFER
    | COMMENT ANY TABLE
    | DUMP ANY TABLE
    | DUMP TABLE
    | ADMIN JOB
    | CREATE ANY DIRECTORY
    | DROP ANY DIRECTORY
    | CREATE SESSION
    | CREATE PROFILE
    | ALTER PROFILE
    | DROP PROFILE
    | CREATE PARTITION GROUP
    | DROP PARTITION GROUP
    | CREATE ANY PARTITION GROUP
    | DROP ANY PARTITION GROUP
    | USAGE PARTITION GROUP
    | USAGE ANY PARTITION GROUP
    | CREATE OPERATOR
    | DROP OPERATOR
    | CREATE ANY OPERATOR
    | DROP ANY OPERATOR
    | FLASHBACK TABLE
    | FLASHBACK ANY TABLE
    | UNLIMITED TABLESPACE
    | SUBSCRIBE
    ;

by_grantor :
    BY user_name
    ;

grantees :
    user_role_name
    | user_role_name COMMA grantees
    ;

create_schema_stmt :
    CREATE SCHEMA full_schema_name? (AUTHORIZATION user_name)? SEMI? (grant_and_ddl SEMI?)*
    ;

oprt_arg :
    LEFTARG opr_dtype
    | RIGHTARG opr_dtype
    ;

oprt_arg_lst :
    oprt_arg (COMMA oprt_arg)*
    ;

create_operator_stmt :
    CREATE OPERATOR qualified_u_oprt '(' FUNCTION full_func_name COMMA oprt_arg_lst ')'
    ;

drop_operator_stmt :
    DROP OPERATOR exist? qualified_u_oprt '(' opr_datatype_lst ')'
    ;

grant_and_ddl :
    grant_stmt
    | create_func_stmt
    | create_index_stmt
    | create_proc_stmt
    | create_table_stmt
    | create_trigger_stmt
    | create_view_stmt
    | create_materialized_view_stmt
    | create_materialized_view_log_stmt
    | alter_table_stmt
    | create_sequence_stmt
    | create_contextindex_stmt
    | create_synonym_stmt
    | create_package_stmt
    | create_package_body_stmt
    | create_dblink_stmt
    | create_type_stmt
    | create_type_body_stmt
    | create_domain_stmt
    | create_character_set_stmt
    | create_collation_stmt
    | create_context_stmt
    | comment_stmt
    | create_partition_group_stmt
    | create_operator_stmt
    | drop_operator_stmt
    ;

top_exp :
    LT_INTEGER
    | stm_param
    | member
    | '(' exp ')'
    | null_value
    ;

u_oprt :
    OP_U_OPRT
    ;

qualified_u_oprt :
    u_oprt
    | qualified_name ('.' u_oprt)?
    ;

exp_u_oprt :
    u_oprt
    | OPERATOR '(' qualified_u_oprt ')'
    ;

raw_exp :
    '-' raw_exp
    | LT_INTEGER
    | LT_BINTEGER
    | LT_DECIMAL
    | LT_REAL
    | LT_STRING
    | member_access LT_STRING
    | member LT_STRING
    | LT_BITSTRING
    | member_access
    | member
    | null_value
    | stm_param
    | INTERVAL ('+' | '-') LT_STRING interval_qualifier
    | INTERVAL LT_STRING interval_qualifier
    | global_var
    ;

exp :
    op=('~'|'+'|'-') exp
    | exp_u_oprt exp
    | BINARY_KEYWORD exp
    | PRIOR exp
    | select_with_paran
    | '(' exp '-' exp ')' interval_qualifier?
    | exp op=('*' | '/' | '%' | MOD) exp
    | exp op=('+' | '-' | '|' |'^' | '&') exp
    | exp exp_u_oprt exp
    | '(' exp exp_u_oprt ')'
    | exp op=(OP_CONSTR | OP_SHIFT_LEFT | OP_SHIFT_RIGHT) exp
    | boolean_case
    | if_exp
    | null_value
    | stm_param
    | USER
    | USER '(' ')'
    | INTERVAL ('+'| '-')? LT_STRING interval_qualifier
    | DATEPART '(' datepart_op COMMA exp ')'
    | IFNULL '(' bool_exp COMMA bool_exp ')'
    | datead_fun '(' datepart_op COMMA exp COMMA exp ')'
    | REPEAT '(' exp COMMA exp ')'
    | REPLICATE '(' exp COMMA exp ')'
    | OVERLAY '(' exp PLACING exp FROM exp (FOR exp)? ')'
    | decode_case
    | pexp_pfx '%' (ROWCOUNT | ROWCOUNT2 | IS OPEN | FOUND | NOT FOUND)
    | global_var
    | NEXT VALUE FOR pexp_pfx
    | CONNECT_BY_ROOT (qualified_name | '(' exp ')')
    | ARRAYLEN '(' exp ')'
    | CHAR '(' exp ')'
    | REVERSE '(' exp ')'
    | ROWNUM
    | sizeof_expression
    | pexp
    | TRUE
    | FALSE
    | invocation_expression OVER '(' afun_partition_by? order_by_options? afun_windowing? ')'
    | exp ignore_nulls_clause OVER '(' afun_partition_by? order_by_options? afun_windowing? ')'
    | invocation_expression from_first_last_option '(' afun_partition_by? order_by_options? afun_windowing? ')'
    | pexp_pfx '(' afun_arg_lst ')' OVER '(' afun_partition_by? order_by_options? afun_windowing? ')'
    | pexp time_zone_exp_new
    | CURSOR FAST? select_with_paran
    | exp MULTISET (UNION | INTERSECT | EXCEPT) all_distinct_option? exp
    | SET '(' exp ')'
    | contains_exp
    ;

from_first_last_option :
    FROM FIRST OVER
    | FROM LAST OVER
    | FROM FIRST IGNORE NULLS OVER
    | FROM LAST IGNORE NULLS OVER
    | FROM FIRST RESPECT NULLS OVER
    | FROM LAST RESPECT NULLS OVER
    ;

afun_arg_lst :
    afun_arg_lst_low
    ;

afun_arg_lst_low :
    exp ignore_nulls_clause (COMMA exp)*
    ;

in_value_exp :
    op=('~'| '+'| '-') in_value_exp
    | PRIOR in_value_exp
    | in_value_exp op=('*'|'/'| '%'| MOD ) in_value_exp
    | in_value_exp op=('+'|'-'| '|'| '^' ) in_value_exp
    | in_value_exp op=(OP_CONSTR | OP_SHIFT_LEFT | OP_SHIFT_RIGHT) in_value_exp
    | boolean_case
    | if_exp
    | null_value
    | stm_param
    | USER
    | USER '(' ')'
    | INTERVAL '+' LT_STRING interval_qualifier
    | INTERVAL '-' LT_STRING interval_qualifier
    | INTERVAL LT_STRING interval_qualifier
    | DATEPART '(' datepart_op COMMA in_value_exp ')'
    | datead_fun '(' datepart_op COMMA in_value_exp COMMA in_value_exp ')'
    | REPEAT '(' in_value_exp COMMA in_value_exp ')'
    | REPLICATE '(' in_value_exp COMMA in_value_exp ')'
    | OVERLAY '(' in_value_exp PLACING in_value_exp FROM in_value_exp ')'
    | OVERLAY '(' in_value_exp PLACING in_value_exp FROM in_value_exp FOR in_value_exp ')'
    | decode_case
    | pexp_pfx '%' ROWCOUNT
    | pexp_pfx '%' ROWCOUNT2
    | global_var
    | NEXT VALUE FOR pexp_pfx
    | ARRAYLEN '(' in_value_exp ')'
    | CHAR '(' in_value_exp ')'
    | REVERSE '(' in_value_exp ')'
    | ROWNUM
    | sizeof_expression
    | pexp_a
    | pexp_b
    | pexp_c
    | TRUE
    | FALSE
    | pexp_a time_zone_exp_new
    ;

afun_partition_by :
    PARTITION BY exp_list
    ;

afun_windowing :
    afun_windowing_type afun_range_clause
    | afun_windowing_type BETWEEN afun_range_clause AND afun_range_clause
    ;

afun_windowing_type :
    ROWS
    | RANGE
    ;

afun_range_clause :
    exp PRECEDING
    | exp FOLLOWING
    | CURRENT ROW
    ;

pexp :
    pexp_a
    | pexp_b
    | pexp_c
    | pexp_d
    | pexp_e
    ;

pexp_pfx : 
    pexp_pfx DOT (id dblink_clause? | key | '*')  (('[' exp_list ']')+)?
    | pexp_pfx '(' opt_argument_list ')' ( keep_clause |  within_clause )?  (('[' exp_list ']')+)?
    | pexp_pfx '.' ( EXECUTE | EXTRACT  )'(' opt_argument_list ')' (('[' exp_list ']')+)?
    | XMLPARSE '(' raw_id exp raw_id? ')' (('[' exp_list ']')+)?
    | XMLELEMENT '(' xmlele_name xmlele_sub_lst? ')' (('[' exp_list ']')+)?
    | XMLAGG '(' exp order_by_options? ')' (('[' exp_list ']')+)?
    | pexp_c_insert  (('[' exp_list ']')+)?
    | new_arr_expression
    | pexp_cast
    | stm_param_normal
;


pexp_cast :
    '(' exp AS datatype ')'
    | CAST '(' exp AS datatype ')'
    | CAST '(' COLLECT '(' all_distinct_option? exp order_by_options? ')' AS datatype ')'
    ;

pexp_b :
    element_access
    | new_arr_expression
    ;

pexp_a :
    typeof_expression
    | LT_INTEGER
    | LT_BINTEGER
    | LT_DECIMAL
    | LT_REAL
    | LT_STRING
    | LT_BITSTRING
    ;

pexp_c :
    member ('%' BULK (EXCEPTION | ROWCOUNT))?
    | member_access
    | new_obj_expression
    | invocation_expression
    | ':' trig_new_name '.' column_name
    | NEW '.' column_name
    ;

pexp_c_insert :
    member
    | new_obj_expression
    | ':' trig_new_name '.' column_name
    | NEW '.' column_name
    | member '%' BULK EXCEPTION
    | member '%' BULK ROWCOUNT
;

pexp_d :
    member LT_STRING
    | CAST '(' exp AS datatype ')'
    | CAST '(' COLLECT '(' all_distinct_option? exp order_by_options? ')' AS datatype ')'
    | CONVERT '(' datatype COMMA exp ')'
    | CONVERT '(' datatype COMMA exp COMMA exp ')'
    | TRIM '(' exp ')'
    | TRIM '(' orient_option FROM exp ')'
    | TRIM '(' exp FROM exp ')'
    | TRIM '(' orient_option exp FROM exp ')'
    | TRUNCATE '(' value_list ')'
    | INSERT '(' value_list ')'
    | EXTRACT '(' datepart FROM exp ')'
    | EXTRACT '(' exp COMMA exp ')'
    | GROUPING '(' exp ')'
    ;

pexp_e :
    '(' exp ')'
    ;


pexp_pfx2 :
    pexp_pfx2 DOT (id dblink_clause? | key) (('[' exp_list ']')+)?
    | pexp_pfx2 '(' opt_argument_list ')' ( keep_clause |  within_clause )?  (('[' exp_list ']')+)?
    | pexp_pfx2 '.' ( EXECUTE | EXTRACT  )'(' opt_argument_list ')' (('[' exp_list ']')+)?
    | pexp_c2_insert  (('[' exp_list ']')+)?
    | XMLPARSE '(' raw_id exp raw_id? ')' (('[' exp_list ']')+)?
    | XMLELEMENT '(' xmlele_name xmlele_sub_lst? ')' (('[' exp_list ']')+)?
    | XMLAGG '(' exp order_by_options? ')' (('[' exp_list ']')+)?
    | new_arr_expression
    | pexp_cast
    | stm_param_normal
;


member2 :
    variable_name dblink_clause?
    ;

pexp_c2_insert :
    member2
    | new_obj_expression
    | ':' trig_new_name '.' column_name
    | NEW '.' column_name
    | member2 '%' BULK EXCEPTION
    | member2 '%' BULK ROWCOUNT
;


member_access2 :
    pexp_pfx2 (DOT id dblink_clause?)+
    | pexp_pfx2 (DOT key)+
    ;

invocation_expression2 :
    pexp_pfx2  invocation_expression_low
    ;

member :
    id dblink_clause?
    ;

key :
    FIRST
    | NEXT
    | PRIOR
    | DELETE
    | GET
    | SET
    | EXISTS
    | TRIM
    | ROWNUM
    | ROWS
    ;

member_access :
    pexp_pfx ((DOT id dblink_clause?)+ | (DOT key)+ | (DOT '*')+)
    ;

invocation_expression :
    pexp_pfx invocation_expression_low
    | xmlfun_inv_expression
    | xmlagg_inv_expression
    ;

invocation_expression_low :
    ('.' EXECUTE LR_BRACKET opt_argument_list? RR_BRACKET)+
    | (LR_BRACKET opt_argument_list? RR_BRACKET (keep_clause | within_clause)? )+
    ;

xmlagg_inv_expression :
    XMLAGG '(' exp order_by_options? ')'
    ;

xmlfun_inv_expression :
    XMLPARSE '(' raw_id exp raw_id ')'
    | XMLPARSE '(' raw_id exp ')'
    | XMLELEMENT '(' xmlele_name xmlele_sub_lst? ')'
    | pexp_pfx (DOT EXTRACT '(' opt_argument_list? ')')+
    ;

xmlele_name :
    id
    | EVALNAME exp
    ;

xmlele_sub_lst :
    COMMA xmlval_lst
    | COMMA XMLATTRIBUTES '(' xmlattr_lst ')'
    | COMMA XMLATTRIBUTES '(' xmlattr_lst ')' COMMA xmlval_lst
    ;

xmlattr_lst :
    xmlattr (COMMA xmlattr)*
    ;

xmlattr :
    exp
    | exp id
    | exp AS id
    | exp AS EVALNAME exp
    ;

xmlval_lst :
    exp (COMMA exp)*
    ;

keep_clause :
    KEEP '(' DENSE_RANK FIRST order_by_options? ')'
    | KEEP '(' DENSE_RANK LAST order_by_options? ')'
    ;

within_clause :
    WITHIN GROUP '(' order_by_options? ')'
    ;

typeof_expression :
    TYPEOF '(' sizeof_type ')'
    ;

new_obj_expression :
    NEW qualified_name '(' opt_argument_list? ')'
    ;

new_arr_expression :
    array_creation_expression
    ;

array_creation_expression :
    NEW new_array_type '[' exp_list ']' opt_rank_specifier? opt_array_initializer?
    | NEW STRUCT new_array_type '[' exp_list ']' opt_rank_specifier? opt_array_initializer?
    ;

plsql_datatype_ex :
    INTERVAL interval_qualifier
    | qualified_name '%' TYPE
    | qualified_name '%' ROWTYPE
    | REF qualified_name
    | CURSOR
    ;

new_array_type :
    plsql_datatype_ex
    | dtype
    | REF CURSOR
    ;

opt_array_initializer :
    array_initializer
    ;

array_initializer :
    '{' '}'
    | '{' variable_initializer_list opt_comma? '}'
    ;

variable_initializer_list :
    variable_initializer (COMMA variable_initializer)*
    ;

variable_initializer :
    exp
    ;

opt_comma :
    COMMA
    ;

sizeof_expression :
    SIZEOF '(' type_name ')'
    ;

element_access :
    pexp_c ('[' exp_list ']')+
    ;

decode_case :
    DECODE '(' exp_list ')'
    ;

else_exp :
    ELSE exp
    ;

boolean_case :
    CASE bool_exp? bool_when_list else_exp? END case_option?
    ;

if_exp :
    IF '(' bool_exp COMMA bool_exp COMMA bool_exp ')'
    ;

bool_when_list :
    (WHEN bool_exp THEN exp)+
    ;

ops :
    '='
    | '=='
    | '>'
    | '<'
    | '<' '>'
    | '>' '='
    | '<' '='
    | OPR_NE
    | OPR_GE
    | OPR_LE
    | OP_MULT_ASSIGN
    ;

value_list :
    exp_list
    ;

in_value_list :
    in_value_exp
    ;

value_list_set :
    '(' value_list ')' (COMMA '(' value_list ')')*
    ;

comma_list :
    COMMA+
    ;

ins_value_list :
    ins_exp_list
    | comma_list ins_exp_list
    ;

null_value :
    NULL
    ;

id_and_rsvd_word_others :
    new_none_reserved_word
    | alias_resvd_word
    | variable_resvd_word
    | schname_resvd_word
    ;

id_and_rsvd_word :
    raw_id
    | reserved_word
    | id_and_rsvd_word_others
    ;

stm_param :
    stm_param_normal
    | stm_param_name
    ;

stm_param_normal :
    '?'
    | ':' LT_INTEGER
    | ':' '<' LT_INTEGER param_name_options? '>'
    | '^' '?' '^'
    ;

stm_param_name :
    ':' id_and_rsvd_word
    ;

param_name_options :
    id
    ;

contains_query_exp :
    exp
    | contains_query_exp (AND | OR | AND NOT) contains_query_exp
    ;

contains_query_exp_lst :
    contains_query_exp (COMMA contains_query_exp)*
    ;

contains_exp :
    CONTAINS '(' exp COMMA contains_query_exp ')'
    | CONTAINS '(' exp COMMA contains_query_exp COMMA contains_query_exp ')'
    | CONTAINS '(' exp COMMA contains_query_exp COMMA SYSTEM LABEL COMMA LT_INTEGER COMMA LT_INTEGER ')'
    | CONTAINS '(' exp COMMA contains_query_exp COMMA contains_query_exp COMMA contains_query_exp_lst ')'
    ;

strict_option :
    '(' LAX ')'
    | LAX
    | '(' STRICT ')'
    | STRICT
    ;

with_unique_option :
    WITHOUT UNIQUE KEYS
    | WITH UNIQUE KEYS
    ;

type_option :
    TYPE
    ;

type_element :
    qualified_name
    ;

type_element_list :
    type_element (COMMA type_element)*
    ;

bool_exp :
    exp
    | bool_exp_element
    ;

bool_exp_element :
    exp IS not_tag? JSON strict_option? with_unique_option?
    | exp IS not_tag? OF type_option? '(' type_element_list ')'
    | NOT (bool_exp_element | exp)
    //| (bool_exp_element | exp) (AND | OR) (bool_exp_element | exp)
    | bool_exp_element (AND | OR) (bool_exp_element | exp)
    | exp (AND | OR) (bool_exp_element | exp)
    | exp not_tag? IN (select_with_paran | in_value_list | ('(' value_list ')'))
    | '(' exp_list_2 ')' not_tag? IN (select_with_paran |  ('(' value_list_set ')'))
    | '(' exp_list_2 ')' ops query_any_options? (select_with_paran | ('(' value_list_set ')'))
    | exp ops query_any_options (select_with_paran |  ('(' value_list_set ')'))
    | EXISTS select_with_paran
    | exp ops exp
    | exp IS not_tag? NULL
    | exp NOT? BETWEEN exp AND exp
    | exp NOT? LIKE exp (ESCAPE exp)?
    | pexp_pfx '.' ROW NOT? LIKE exp (ESCAPE exp)?
    | BINARY_KEYWORD pexp_pfx '.' ROW NOT? LIKE exp (ESCAPE exp)?
    | '(' exp_list_2 ')' OVERLAPS '(' exp_list_2 ')'
    | LNNVL '(' (bool_exp_element | exp) ')'
    | exp not_tag? MEMBER OF exp
    | '(' bool_exp_element ')'
    ;

query_any_options :
    ALL
    | SOME
    | ANY
    | EVERY
    ;

global_var :
    LT_GLOBAL_VAR
    ;

reserved_word :
    IFNULL
    | ABSOLUTE
    | ADD
    | ALL
    | ALTER
    | AND
    | ANY
    | ARRAYLEN
    | AS
    | ASC
    | ASSIGN
    | AUDIT
    | BEGIN
    | BETWEEN
    | BIGDATEDIFF
    | BOOL
    | BOTH
    | BSTRING
    | BY
    | BYTE
    | CALL
    | CASE
    | CAST
    | CHAR
    | CHECK
    | CLUSTER
    | COLUMN
    | COMMIT
    | COMMITWORK
    | COMMENT
    | CONNECT
    | CONNECT_BY_ROOT
    | CONSTRAINT
    | CONTAINS
    | CONTEXT
    | CONVERT
    | CORRESPONDING
    | CREATE
    | CRYPTO
    | CURRENT
    | CURSOR
    | DATEADD
    | DATEDIFF
    | DATEPART
    | DECIMAL
    | DECLARE
    | DECODE
    | DEFAULT
    | DELETE
    | DESC
    | DISTINCT
    | DISTRIBUTED
    | DOUBLE
    | DROP
    | ELSE
    | ELSEIF
    | END
    | EXECUTE
    | EXISTS
    | EXIT
    | EXPLAIN
    | EXTRACT
    | FETCH
    | FINAL
    | FIRST
    | FLOAT
    | FOR
    | FOREIGN
    | FROM
    | FULLY
    | FUNCTION
    | GOTO
    | GRANT
    | GROUP
    | HAVING
    | IDENTITY
    | IF
    | IMMEDIATE
    | IN
    | INDEX
    | INSERT
    | INT
    | INTERVAL
    | INTO
    | IS
    | LEAD
    | LIKE
    | LOGIN
    | LOOP
    | MEMBER
    | NEW
    | NEXT
    | NOT
    | NULL
    | OBJECT
    | OF
    | ON
    | OR
    | ORDER
    | OUT
    | PARTITION
    | PENDANT
    | PERCENT
    | PRIMARY
    | PRINT
    | PRIOR
    | PRIVILEGES
    | PROCEDURE
    | PUBLIC
    | RAISE
    | RECORD
    | REF
    | REFERENCES
    | REFERENCE
    | REFERENCING
    | RELATIVE
    | REPEAT
    | RETURN
    | REVERSE
    | REVOKE
    | ROLLBACK
    | ROW
    | ROWNUM
    | ROWS
    | SAVEPOINT
    | SCHEMA
    | SELECT
    | SET
    | SOME
    | SUBPARTITION
    | SWITCH
    | SYNONYM
    | TABLE
    | TIMESTAMPADD
    | TIMESTAMPDIFF
    | TO
    | TOP
    | TRAIL
    | TRIGGER
    | TRIM
    | TRUNCATE
    | UNION
    | UNIQUE
    | UNTIL
    | UPDATE
    | USER
    | USING
    | VALUES
    | VARRAY
    | VIEW
    | WHEN
    | WHENEVER
    | WHILE
    | WITH
    | DISKSPACE
    | RETURNING
    | SBYTE
    | SHORT
    | USHORT
    | UINT
    | ULONG
    | VOID
    | CONST
    | DO
    | BREAK
    | CONTINUE
    | THROW
    | FINALLY
    | TRY
    | CATCH
    | PROTECTED
    | PRIVATE
    | ABSTRACT
    | SEALED
    | STATIC
    | VIRTUAL
    | OVERRIDE
    | EXTERN
    | CLASS
    | STRUCT
    | GET
    | SIZEOF
    | TYPEOF
    | ADMIN
    | REPLICATE
    | VERIFY
    | EQU
    | EXCHANGE
    | CLUSTERBTR
    | LIST
    | ARRAY
    | ROLLUP
    | CUBE
    | GROUPING
    | OVER
    | SECTION
    | SETS
    | DOMAIN
    | COLLATION
    | OVERLAY
    | EVERY
    | KEEP
    | WITHIN
    | LNNVL
    | NOCOPY
    | INLINE
    | TYPEDEF
    | XMLTABLE
    | XMLPARSE
    | XMLAGG
    | AUTO_INCREMENT
    | BINARY_KEYWORD
    | XMLELEMENT
    | XMLATTRIBUTES
    | EVALNAME
    | LEXER
    | FLASHBACK
    | NOCYCLE
    | NOSORT
    | OPTIMIZE
    | VERSIONS
    | LARGE
    | WITHOUT
    | PIPE
    | XML
    | JSON_TABLE
    | SUBSCRIBE
    | LESS
    | THAN
    ;

new_none_reserved_word :
    ACROSS
    | ABORT
    | ROWID
    | ACTION
    | AFTER
    | ALLOW_DATETIME
    | ALLOW_IP
    | ANALYZE
    | ARCHIVEDIR
    | ARCHIVELOG
    | ARCHIVESTYLE
    | AT_KEYWORD
    | ATTACH
    | AUTO
    | AVG
    | BACKUP
    | BACKUPDIR
    | BACKUPINFO
    | BAKFILE
    | BEFORE
    | BIGINT
    | DEVICE
    | PARMS
    | TRACE
    | FILE
    | BIT
    | BITMAP
    | BLOB
    | BLOCK
    | BOOLEAN
    | CACHE
    | CASCADE
    | CASCADED
    | CATALOG
    | CHAIN
    | CALCULATE
    | CHARACTER
    | CIPHER
    | CLOB
    | COMMITTED
    | COMPILE
    | DUMP
    | JOB
    | COMPRESS
    | COMPRESSED
    | CONNECT_BY_IS_CYCLE
    | CONNECT_BY_IS_LEAF
    | CONNECT_IDLE_TIME
    | COUNT
    | COUNTER
    | CTLFILE
    | CYCLE
    | SEARCH
    | DEPTH
    | BREADTH
    | DANGLING
    | DATAFILE
    | DATE
    | DATETIME
    | DBFILE
    | DEBUG
    | DEC
    | DEFERRABLE
    | DEFERRED
    | DELETING
    | DELTA
    | DEREF
    | DETACH
    | DISCONNECT
    | DOWN
    | EACH
    | ENCRYPT
    | ENCRYPTION
    | ESCAPE
    | EVENTINFO
    | EXCLUSIVE
    | EXTERNAL
    | EXTERNALLY
    | FAILED_LOGIN_ATTEMPS
    | FAILED_LOGIN_ATTEMPTS
    | FILEGROUP
    | FILLFACTOR
    | FORCE
    | FREQUENCE
    | GLOBAL
    | GLOBALLY
    | HASH
    | HEXTORAW
    | IDENTIFIED
    | IDENTITY_INSERT
    | IMAGE
    | INCREASE
    | INCREMENT
    | INITIAL
    | INITIALLY
    | INNERID
    | INSERTING
    | INSTEAD
    | INTEGER
    | INTENT
    | ISOLATION
    | KEY
    | LABEL
    | LOCAL
    | LOCALLY
    | LOGFILE
    | LOGOUT
    | LONG
    | LONGVARBINARY
    | LONGVARCHAR
    | MANUAL
    | MATCH
    | MATCHED
    | MAX
    | MAXSIZE
    | MAXVALUE
    | MERGE
    | MIN
    | MINEXTENTS
    | MINVALUE
    | MODE
    | MODIFY
    | MONEY
    | MOUNT
    | NO
    | NOARCHIVELOG
    | NOAUDIT
    | NOCACHE
    | NOMAXVALUE
    | NOMINVALUE
    | NOORDER
    | NOT_ALLOW_DATETIME
    | NOT_ALLOW_IP
    | NOWAIT
    | NUMBER
    | NUMERIC
    | OFF
    | OFFLINE
    | CORRUPT
    | ONLY
    | OPTION
    | OUTER
    | OVERLAPS
    | CONSTANT
    | PAGE
    | PARTIAL
    | PARTITIONS
    | PASSWORD_GRACE_TIME
    | PASSWORD_LIFE_TIME
    | PARALLEL
    | CPU_PER_CALL
    | CPU_PER_SESSION
    | MEM_SPACE
    | READ_PER_CALL
    | READ_PER_SESSION
    | PASSWORD_LOCK_TIME
    | PASSWORD_POLICY
    | PASSWORD_REUSE_MAX
    | PASSWORD_REUSE_TIME
    | PRECISION
    | PRESERVE
    | RAWTOHEX
    | READ
    | REAL
    | REBUILD
    | RELATED
    | RENAME
    | REPEATABLE
    | REPLACE
    | RESTORE
    | RESTRICT
    | PLACING
    | ROLE
    | ROLLFILE
    | ROOT
    | ROWCOUNT
    | RULE
    | SALT
    | SCOPE
    | SERERR
    | SERIALIZABLE
    | SESSION_PER_USER
    | SHARE
    | SHUTDOWN
    | SIBLINGS
    | SMALLINT
    | SNAPSHOT
    | SOUND
    | SPATIAL
    | SPLIT
    | SQL
    | STARTUP
    | STATEMENT
    | STORAGE
    | STRING
    | STYLE
    | SUBSTRING
    | SUCCESSFUL
    | SUM
    | SUSPEND
    | SYNC
    | SYS_CONNECT_BY_PATH
    | TEMPORARY
    | TEXT
    | THEN
    | TIES
    | TIME
    | TIMES
    | TIMESTAMP
    | TINYINT
    | TRANSACTION
    | TRIGGERS
    | TRUNCSIZE
    | UNCOMMITTED
    | UNDER
    | UNLIMITED
    | UP
    | UPDATING
    | VALUE
    | VARBINARY_KEYWORD
    | VARCHAR
    | VARCHAR2
    | STDDEV
    | VARIANCE
    | VARYING
    | VSIZE
    | WORK
    | WRITE
    | SEQUENCE
    | SERVER
    | TIMER
    | WEEK
    | ONCE
    | ZONE
    | VERTICAL
    | QUOTA
    | LOG
    | NONE
    | LOB
    | ERROR
    | PASSWORD
    | EXPIRE
    | BACKUPSET
    | MAXPIECESIZE
    | BACKED
    | SINCE
    | DDL_CLONE
    | CUMULATIVE
    | NORMAL
    | STANDBY
    | TRANSACTIONAL
    | STORE
    | BRANCH
    | NOBRANCH
    | READONLY
    | UNBOUNDED
    | PRECEDING
    | FOLLOWING
    | AUTOEXTEND
    | WRAPPED
    | BTREE
    | CONNECT_TIME
    | TRXID
    | THROUGH
    | SCN
    | VERSIONS_STARTTIME
    | VERSIONS_ENDTIME
    | VERSIONS_STARTTRXID
    | VERSIONS_ENDTRXID
    | VERSIONS_OPERATION
    | RANDOMLY
    | COPY
    | PATH
    | HUGE
    | FILESIZE
    | SESSION
    | QUERY_REWRITE_INTEGRITY
    | REFRESH
    | MATERIALIZED
    | FAST
    | COMPLETE
    | DEMAND
    | MIRROR
    | NEVER
    | BUILD
    | PURGE
    | SYNCHRONOUS
    | ASYNCHRONOUS
    | PREBUILT
    | REDUCED
    | BASE
    | SELF
    | INDEXES
    | EXCEPTION_INIT
    | AUTONOMOUS_TRANSACTION
    | INDICES
    | EXCEPTIONS
    | SAVE
    | RESULT
    | COLLATE
    | PAD
    | SPACE_KEYWORD
    | EVENTS
    | NCHAR
    | NCHARACTER
    | NATIONAL
    | USE_HASH
    | USE_MERGE
    | USE_NL
    | USE_NL_WITH_INDEX
    | TIME_ZONE
    | DIAGNOSTICS
    | SIMPLE
    | CHARACTERISTICS
    | INSENSITIVE
    | ASENSITIVE
    | SENSITIVE
    | SCROLL
    | HOLD
    | SUBPARTITIONS
    | TEMPLATE
    | NULLS
    | DENSE_RANK
    | SYSTEM
    | MEMORY
    | SPFILE
    | AUTHID
    | CURRENT_USER
    | CURRENT_SCHEMA
    | DEFINER
    | ACCESSED
    | INITIALIZED
    | LOGGING
    | NOLOGGING
    | DETERMINISTIC
    | TABLESPACE
    | COLUMNS
    | WAIT
    | SKIP_KEYWORD
    | LOCKED
    | PARALLEL_ENABLE
    | AGGREGATE
    | SIZE
    | LEVEL
    | REPLAY
    | DICTIONARY
    | PRIVILEGE
    | BUFFER
    | MOVE
    | MOVEMENT
    | ACCOUNT
    | UNLOCK
    | INCLUDING
    | EXCLUDING
    | JAVA
    | INVISIBLE
    | VISIBLE
    | UNUSABLE
    | DATA
    | CONSTRAINTS
    | OLD
    | MAPPED
    | LOGON
    | LOGOFF
    | RANGE
    | ARCHIVE
    | FIELDS
    | DELIMITED
    | RECORDS
    | ERRORS
    | LSN
    | INPUT
    | INCLUDE
    | EXCLUDE
    | DDL
    | DIRECTORY
    | LOCATION
    | RESULT_CACHE
    | PIPELINED
    | MONITORING
    | NOMONITORING
    | EXTENDS
    | NODE
    | STRICT
    | LAX
    | FORMAT
    | JSON
    | KEYS
    | ASCII
    | PRETTY
    | WRAPPER
    | EMPTY
    | CONDITIONAL
    | UNCONDITIONAL
    | TASK
    | THREAD
    | BADFILE
    | ADVANCED
    | ROWDEPENDENCIES
    | NOROWDEPENDENCIES
    | SPAN
    | MON
    | TUE
    | WED
    | THU
    | FRI
    | SAT
    | SUN
    | JAN
    | FEB
    | MAR
    | APR
    | MAY
    | JUN
    | JUL
    | AUG
    | SEP
    | OCT
    | NOV
    | YEARLY
    | MONTHLY
    | WEEKLY
    | DAILY
    | HOURLY
    | MINUTELY
    | SECONDLY
    | BYMONTH
    | BYWEEKNO
    | BYYEARDAY
    | BYMONTHDAY
    | BYDAY
    | BYHOUR
    | BYMINUTE
    | BYSECOND
    | USAGE
    | EXCEPTION
    | DATABASE
    | LAST
    | PACKAGE
    | PASSING
    | GREAT
    | MICRO
    | LOCAL_OBJECT
    | LINK
    | RESTRICT_REFERENCES
    | REJECT
    | PROFILE
    | HASHPARTMAP
    | SPEED
    | STOP
    | INSTANCE
    | IGNORE_ROW_ON_DUPKEY_INDEX
    | EDITIONABLE
    | NONEDITIONABLE
    | BATCH
    | ORDINALITY
    | STRIPING
    | HIGH
    | DISKGROUP
    | SHADOW
    | CASE_SENSITIVE
    | LEFTARG
    | RIGHTARG
    | OPERATOR
    | RESIZE
    | SCHEMABINDING
    | CHANGE
    | TRACKING
    | SUBSTITUTABLE
    | LEVELS
    | IDENTIFIER_KEYWORD
    | GENERATED
    | OIDINDEX
    | NOPARALLEL
    | COLLECT
    | DML
    | APPLY
    | CHECKPOINT
    | NOVALIDATE
    | QUERY
    ;

interval_nresvd_word :
    YEAR
    | MONTH
    | DAY
    | HOUR
    | MINUTE
    | SECOND
    ;

variable_resvd_word :
    TYPE
    | SUBTYPE
    | MAP
    | INSTANTIABLE
    | CONSTRUCTOR
    | OVERRIDING
    | PRAGMA
    | CLOSE
    | OPEN
    | LOCK
    | STAT
    | FORALL
    | DISABLE
    | ENABLE
    ;

alias_resvd_word :
    interval_nresvd_word
    | LEFT
    | RIGHT
    | EXCEPT
    | MINUS
    | INTERSECT
    | CROSS
    | FULL
    | INNER
    | JOIN
    | NATURAL
    | WHERE
    | BULK
    | OFFSET
    | MOD
    | SEED
    | SAMPLE
    | PIVOT
    | ONLINE
    | UNPIVOT
    | LIMIT
    | MULTISET
    ;

schname_resvd_word :
    AUTHORIZATION
    ;

raw_id :
    LT_IDENTIFIER
    ;

id :
    raw_id
    | new_none_reserved_word
    | schname_resvd_word
    | alias_resvd_word
    | variable_resvd_word
    ;

qualified_name :
    id ('.' id)*
    ;

qualified_name2 :
    id ('.' id)*
    ;

variable_name :
    raw_id
    | new_none_reserved_word
    | schname_resvd_word
    | alias_resvd_word
    ;

end_loop_label_null :
    END LOOP label_name_options?
    ;

label_name_options :
    label_name
    ;

label_name :
    id
    ;

database_name :
    id
    ;

backup_name :
    id
    ;

full_proc_name :
    qualified_name
    ;

full_proc_name2 :
    qualified_name2
    ;

full_fun_name :
    qualified_name
    ;

full_table_name :
    qualified_name
    ;

full_grp_name :
    qualified_name
    ;

full_table_name2 :
    qualified_name2
    ;

full_partition_name :
    raw_id
    ;

full_schema_name :
    schema_name
    | database_name '.' schema_name
    ;

table_name :
    id
    ;

column_name :
    id
    ;

constraint_name :
    id
    ;

full_trigger_name :
    qualified_name
    ;

full_trigger_name2 :
    qualified_name2
    ;

full_view_name :
    qualified_name
    ;

full_view_name2 :
    qualified_name2
    ;

cursor_name :
    raw_id
    ;

trigger_name :
    id
    ;

login_name :
    id
    ;

profile_name :
    DEFAULT
    | id
    ;

user_name :
    id
    ;

role_name :
    id
    | PUBLIC
    ;

user_role_name :
    role_name
    ;

role_name_list :
    role_name
    | role_name COMMA role_name_list
    ;

full_func_name :
    qualified_name2
    ;

param_name :
    id
    ;

index_name :
    id
    | id '.' id
    ;

index_name2 :
    id
    | id '.' id
    | id '.' id '.' id
    ;

trig_old_name :
    variable_name
    | NEW
    ;

trig_new_name :
    variable_name
    | variable_resvd_word
    | NEW
    ;

full_tv_name :
    qualified_name dblink_clause2? ((PARTITION | SUBPARTITION) ('(' full_partition_name ')' | FOR '(' value_list ')'))?
    | qualified_name INDEX (id | LT_INTEGER)
    ;

full_object_name :
    qualified_name
    ;

orient_option :
    LEAD
    | TRAIL
    | BOTH
    ;

datepart :
    raw_id
    | YEAR
    | MONTH
    | WEEK
    | DAY
    | HOUR
    | MINUTE
    | SECOND
    ;

datepart_op :
    datepart
    ;

datead_fun :
    DATEADD
    | DATEDIFF
    | BIGDATEDIFF
    | TIMESTAMPADD
    | TIMESTAMPDIFF
    ;

returning :
    RETURNING dtype double_length_option?
    ;

pretty :
    ASCII
    | PRETTY
    | PRETTY ASCII
    ;

wrapper_flag :
    WRAPPER
    | ARRAY WRAPPER
    ;

array_wrapper :
    WITHOUT wrapper_flag
    | WITH wrapper_flag
    | WITH UNCONDITIONAL wrapper_flag
    | WITH CONDITIONAL wrapper_flag
    ;

json_tail_on_empty :
    empty_handle
    | DEFAULT exp ON EMPTY
    ;

empty_handle :
    NULL ON EMPTY
    | ERROR ON EMPTY
    ;

json_tail_on_error_null :
    error_handle?
    | DEFAULT exp ON ERROR
    ;

error_handle :
    NULL ON ERROR
    | ERROR ON ERROR
    | EMPTY ON ERROR
    | TRUE ON ERROR
    | FALSE ON ERROR
    ;

savepoint_name :
    id
    ;

alias :
    raw_id
    | new_none_reserved_word
    | schname_resvd_word
    | '*'
    | variable_resvd_word
    | interval_nresvd_word
    ;

alias_2 :
    id
    ;

full_column_name :
    qualified_name
    ;

schema_name :
    raw_id
    | new_none_reserved_word
    | variable_resvd_word
    ;

not_tag :
    NOT
    ;

debug_tag :
    DEBUG
    ;

column_tag :
    COLUMN
    ;

pendant_tag :
    PENDANT
    ;

unique_tag :
    UNIQUE
    | BITMAP
    | SPATIAL
    | ARRAY
    ;

partition_tag :
    CLUSTER
    | NOT PARTIAL
    ;

row_tag :
    ROW
    ;

as_tag :
    AS
    ;

from_tag :
    FROM
    ;

into_tag :
    INTO
    ;

work_tag :
    WORK
    ;

with_grant_option :
    WITH GRANT OPTION
    ;

with_admin_option :
    WITH ADMIN OPTION
    ;

time_zone_or_local :
    TIME ZONE
    | LOCAL TIME ZONE
    ;

sub_plsql_datatype :
    datatype
    | qualified_name dblink_clause? '%' TYPE
    | qualified_name dblink_clause? '%' ROWTYPE
    ;

datatype_list :
    datatype (COMMA datatype)*
    ;

datatype :
    dtype double_length_option? (WITH time_zone_or_local | WITHOUT TIME ZONE)?
    | INTERVAL interval_qualifier
    | dtype LARGE OBJECT double_length_option?
    ;

datatype2 :
    dtype1 double_length_option?
    | INTERVAL interval_qualifier
    ;

opr_dtype :
    dtype
    | NULL
    ;

opr_datatype_lst :
    opr_dtype COMMA opr_dtype
    ;

interval_qualifier :
    interval_nresvd_word double_length_option? (TO interval_nresvd_word double_length_option?)?
    ;

dtype :
    dtype1
    | dtype2
    ;

dtype1 :
    qualified_name
    | BINARY_KEYWORD
    | sql_builtin_types
    ;

dtype2 :
    CHAR VARYING
    | CHARACTER VARYING
    | NCHAR VARYING
    | NATIONAL CHAR VARYING
    | NATIONAL CHAR
    | NCHARACTER VARYING
    | NATIONAL CHARACTER VARYING
    | NATIONAL CHARACTER
    | DOUBLE PRECISION
    | REF '(' qualified_name ')'
    ;

double_length_option :
    '(' LT_INTEGER size_unit_caluse? ')'
    | '(' LT_INTEGER COMMA LT_INTEGER ')'
    | '(' '*' COMMA LT_INTEGER ')'
    ;

size_unit_caluse :
    CHAR
    | BYTE
    ;

lt_integer_negative :
    LT_INTEGER
    | '-' LT_INTEGER
    ;

create_contextindex_stmt :
    CREATE replace_option? CONTEXT INDEX not_exist? index_name ON full_table_name '(' index_column_list ')' storage_tag? lexer_clause? sync?
    ;

lexer_name :
    id
    ;

lexer_clause :
    LEXER lexer_name
    ;

lexer_clause2 :
    LEXER lexer_name
    ;

sync :
    SYNC
    | SYNC TRANSACTION
    ;

drop_contextindex_stmt :
    DROP CONTEXT INDEX exist? index_name ON full_table_name
    ;

alter_contextindex_stmt :
    alter_tag CONTEXT INDEX index_name ON full_table_name cti_sync_option online_options? lexer_clause2?
    ;

cti_sync_option :
    REBUILD
    | INCREMENT
    | OPTIMIZE
    ;

type_name :
    qualified_name
    | BINARY_KEYWORD
    ;

sizeof_type :
    type_name
    | builtin_types
    ;

type :
    sizeof_type
    | array_type
    ;

array_type :
    sizeof_type rank_specifiers
    ;

builtin_types :
    OBJECT
    | BSTRING
    | BOOL
    | DECIMAL
    | FLOAT
    | DOUBLE
    | integral_type
    ;

integral_type :
    SBYTE
    | BYTE
    | SHORT
    | USHORT
    | INT
    | UINT
    | ULONG
    | CHAR
    | VOID
    ;

sql_builtin_types :
    BOOL
    | DECIMAL
    | FLOAT
    | DOUBLE
    | INT
    | CHAR
    | BYTE
    ;


cursor_declaration :
    CURSOR cursor_name cursor_attrs_options? cursor_option?
    ;

cursor_declaration_2 :
    cursor_declaration
    | variable_name_list CURSOR cursor_attrs_options? cursor_option_2
    ;

cursor_attrs_options :
    cursor_attrs
    ;

cursor_attrs :
    cursor_attr
    | cursor_attrs cursor_attr
    ;

cursor_attr :
    INSENSITIVE
    | SENSITIVE
    | ASENSITIVE
    | NO SCROLL
    | SCROLL
    | WITHOUT HOLD
    | WITH HOLD
    | WITHOUT RETURN
    | WITH RETURN
    | FAST
    | NO FAST
    ;

opt_rank_specifier :
    rank_specifiers
    ;

rank_specifiers :
    rank_specifier
    ;

rank_specifier :
    '[' opt_dim_separators? ']'
    ;

opt_dim_separators :
    dim_separators
    ;

opt_rank_specifier2 :
    opt_rank_specifier?
    | '[' lt_int_lst ']'
    ;

dim_separators :
    COMMA+
    ;

opt_argument_list :
    mixed_param_list json_fun_tail
    | bool_exp FROM exp (FOR exp)?
    | all_distinct_option_2 exp
    | all_distinct_option_2 exp_list_2
    | '*'
    | '+'
    | without_into_select
    ;

json_fun_tail :
    returning? pretty? array_wrapper? json_tail_on_error_null
    | returning? pretty? array_wrapper? json_tail_on_empty json_tail_on_error_null
    ;

ignore_nulls_clause :
    IGNORE NULLS
    | RESPECT NULLS
    ;

mixed_param_list :
    mixed_param (COMMA mixed_param)*
    ;

mixed_param :
    argument as_alias?
    | param
    ;

argument :
    bool_exp (FORMAT JSON)?
    ;

cursor_option :
    cursor_option_2
    ;

without_into_select2 :
    without_into_select
    | select_with_paran
    ;

cursor_option_2 :
    IS without_into_select2
    | IS joined_table
    | IS TABLE full_tv_name
    | FOR without_into_select2
    | FOR joined_table
    | FOR TABLE full_tv_name
    | '(' param_def_list ')' IS without_into_select2
    | '(' param_def_list ')' RETURN plsql_datatype IS without_into_select2
    | RETURN plsql_datatype IS without_into_select2
    ;

region_size :
    GREAT
    | MICRO
    ;

copy_num :
    COPY LT_INTEGER
    ;

redundancy_clause :
    EXTERNAL
    | NORMAL
    | HIGH
    ;

striping_clause :
    STRIPING LT_INTEGER
    ;

with_huge_clause :
    WITH HUGE PATH pathname region_size?
    ;

