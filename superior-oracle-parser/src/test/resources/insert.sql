insert into dwd.dwd_d03_contract_det_s
select to_date('${yyyy-mm-dd}', 'yyyy-mm-dd')                                    stt_date
     ,to_date('${yyyy-mm-dd}', 'yyyy-mm-dd')                                    end_date
     ,'01'        cont_source_cd                                                 -- 合同来源编码: 01-通用核心； 02-商用车
     ,'通用核心'  cont_source_nm                                                 -- 合同来源：通用核心/商用车
     ,cc.pk_contract                                                             -- 合同主键
     ,cc.cont_code                                                               -- 合同编码
     ,cc.cont_name                                                               -- 合同名称
     ,cc.cont_type                                         cont_type_cd          -- 合同类型编码
     ,pt2.param_name                                       cont_type_nm          -- 合同类型名称
     ,cc.cont_status                                       cont_status_cd        -- 合同状态编码
     ,pt1.param_name                                       cont_status_nm        -- 合同状态名称
     ,pt3.param_value                                      economic_style_cd     -- 控股类型编码
     ,replace(replace(pt3.param_name ,'绝对',''),'相对','') economic_style_nm     -- 控股类型
     ,cc.cont_amount                                                             -- 合同金额
     ,cc.lease_date_fact                                                         -- 起租日
     ,cc.cont_end_date                                                           -- 到期日
     ,lc.lease_times                                        lease_times          -- 租赁期（月数）
     ,round(lc.lease_times/12,2)                            lease_year           -- 租赁期（年数）
     ,case when cc.cont_amount >= 100000000 then '大型'
           when cc.cont_amount >= 10000000 and cc.cont_amount < 100000000
               then '中型'
           else '小型'
    end cont_scala                                                            -- 合同规模
     ,case when cc.if_adjust = 0 then '是'
           when cc.if_adjust = 1 then '否'
           else null
    end if_adjust                                                             -- 是否调息
     ,sjtf.fact_cash_loan                                                        -- 已投放金额
     ,sjtf.pay_date                                                              -- 首次投放日期
     ,ba1.name                                             pay_province          -- 投放地区省
     ,ba2.name                                             pay_city              -- 投放地区市
     ,ba3.name                                             pay_area              -- 客户所属区
     ,coalesce(nn.assets_classify, cc.assets_classify, 0)     assets_classify_cd    -- 五级分类代码
     ,case coalesce(nn.assets_classify, cc.assets_classify, 0)
          when 0 then '正常'
          when 1 then '关注'
          when 2 then '次级'
          when 3 then '可疑'
          when 4 then '损失'
          else '正常'
    end                                                 assets_classify_nm    -- 五级分类名称

     ,pi.pk_project_info                                                         -- 项目编号

     ,pi.project_name                                                            -- 项目名称

     ,pi.lease_categry                                     lease_categry_cd      -- 租赁类型代码

     ,case when pi.lease_categry = 0 then '融资租赁'

           when pi.lease_categry = 1 then '经营性租赁'

           else null

    end                                                 lease_categry_nm      -- 租赁类型名称

     ,case when pbl.if_group_company = 0 then '是'

           else '否'

    end                                                 if_group_company      -- 是否集团客户

     ,pbl.vesting_group                                                          -- 集团客户名称

     ,lc.lease_method                                      lease_method_cd       -- 业务类型代码

     ,case when lc.lease_method = 0 then '直租'

           when lc.lease_method = 1 then '回租'

           when lc.lease_method = 4 then '转租赁'

           else null

    end                                                 lease_method_nm       -- 业务类型名称

     ,main_thing.fixed_assets                                                    -- 固定资产门类

     ,main_thing.fixed_assets_lag                                                -- 固定资产门类-大类

     ,main_thing.fixed_assets_mid                                                -- 固定资产门类--中类

     ,main_thing.fixed_assets_sml                                                -- 固定资产门类--小类

     ,main_thing.thing_name                                                      -- 租赁物名称

     -- 主办人相关信息

     ,su.user_code               main_user_code                                  -- 主办项目经理编号

     ,su.user_name               main_user_name                                  -- 主办项目经理

     ,su.dept_code               main_dept_code                                  -- 主办业务部门编号

     ,su.dept_name               main_dept_name                                  -- 主办业务部门名称



     -- 协办人相关信息

     ,su2.user_code              help_user_code                                  -- 协办项目经理编号

     ,su2.user_name              help_user_name                                  -- 协办项目经理

     ,su2.dept_code              help_dept_code                                  -- 协办业务部门编号

     ,su2.dept_name              help_dept_name                                  -- 协办业务部门名称



     ,coalesce(pa.sponsor_performance, pa.sponsor_performance_sh * 100) sponsor_performance    -- 主办分成比例（两位整数）

     ,coalesce(pa.help_performance, pa.help_performance_one * 100)      help_performance       -- 协办分成比例（两位整数）

     ,pn.investment                                        investment_cd         -- 城建类分类

     ,case when coalesce(pn.investment, cu.investment) = 0

               then '是'

           else '否'

    end investment_nm                                                         -- 是否城建类

     ,vc.customer_name                                                           -- 承租人名称

     ,case when vc.identity_type = 4 then vc.identity_no

           else null

    end                                                 identity_no           -- 统一社会信用代码

     ,vc.risk_level                                        risk_level_cd         -- 客户洗钱风险评级代码

     ,case when vc.risk_level = '1001' then '低风险'

           when vc.risk_level = '1002' then '较低风险'

           when vc.risk_level = '1003' then '中风险'

           when vc.risk_level = '1004' then '较高风险'

           when vc.risk_level = '1005' then '高风险'

           when vc.risk_level = '1006' then '无结果'

           when vc.risk_level = '1007' then '查询失败'

           else null

    end                                                 risk_level_nm         -- 客户洗钱风险评级名称

     ,cu.organization_code                                 organization_code     -- 组织机构代码



     ,hy.param_name                                        industry              -- 国标行业门类

     ,hy1.param_name                                       industry_lag          -- 国标行业大类

     ,hy2.param_name                                       industry_mid          -- 国标行业中类

     ,hy3.param_name                                       industry_sml          -- 国标行业小类

     ,coalesce(cc.business_module, dm1.business_mode_nm, '其他')                                  industry_mod          -- 业务板块——9大分类



     ,case when cc.cont_status = 8 or

                (cc.cont_status = 2 and '${yyyy-mm-dd}' <= cc.lease_date_fact) or

                (cc.cont_status = 2 and '${yyyy-mm-dd}' >= cc.lease_date_fact and coalesce(sjtf.fact_cash_loan,0) < coalesce(ipc.lease_corpus,0) and planc.plan_count >= 2 )

               then coalesce(sjtf.fact_cash_loan,0) - coalesce(gather.gather_corpus,0) - coalesce(sfk.inner_deduct_cash,0)

           else coalesce(ipc.lease_corpus,0) - coalesce(gather.gather_corpus,0) - coalesce(sfk.inner_deduct_cash,0)

    end                                                                                     corpus_balance   -- 剩余本金

     ,coalesce(history.lease_interest,ipc.lease_interest) - coalesce(gather.gather_interest,0) interest_balance -- 剩余利息

     ,case when yoc.pk_contract is not null then coalesce(lpb.deposit_balance,0)

           else 0

    end                                                                                     deposit_balance  -- 剩余保证金

     -- 调整剩余保证金逻辑， 保持和源端取值一样 11.22(剩余风险抵押金 按照逻辑把字段衍生出来)

     -- ,coalesce(lpb.deposit_balance,0)                                                          deposit_balance  -- 剩余保证金

     ,case when yoc.pk_contract is null then coalesce(lpb.deposit_balance,0)

           else 0

    end                                                                                     mortgage_balance -- 剩余风险抵押金

     ,COALESCE(adj.INTERRATE_FACT_AFTER,lc.FINAL_RATE, 0)                                      contract_rate    -- 合同利率

     ,COALESCE(adj.PROJECT_IRR,lc.PROJECT_IRR, 0) * 100.0                                      PROJECT_IRR      -- IRR（现行）

     ,COALESCE(adj.CONTRACT_XIRR,lc.CONTRACT_XIRR, 0)  * 100.0                                 CONTRACT_XIRR    -- XIRR（含税）

     -- 增加字段

     ,case when yoc.pk_contract is null then '是'

           else '否'

    end                                                                                     is_mortgage      -- 是否风险抵押金

     ,case when cc.cont_status = 8 and coalesce(ipo.overdue_days_zqx, 0) >= 1

               then '是'

           when cc.cont_status <> 8 and coalesce(ipo.overdue_days, 0) >= 1

               then '是'

           else '否'

    end                                                                                     if_overdue       -- 是否逾期

     ,yq.OVERDUE_DATE                                                                          overdue_days     -- 最大逾期天数（含历史）

     ,magum.param_name                                                                         pledge_name      -- 担保方式

     ,case when lc.interrate_type = 0

               then '浮动利率' else '固定利率'

    end                                                                                      interrate_type   -- 利率类型

     ,ipc.lease_cash1      handling_fee       -- 手续费/咨询费

     ,ipc.lease_cash11     fixed_rent         -- 固定租金

     ,ipc.lease_cash2      deposit_amt        -- 保证金金额

     ,ipc.lease_cash22     margin_bal         -- 保证金余额

     ,ipc.lease_cash3      margin_off_amt     -- 保证金冲抵金额

     ,ipc.lease_cash33     refund_deposit     -- 退还保证金

     ,nn.accrue_cash                          -- 拨备余额

     ,vc.customer_code                        -- 承租人编号

from dwd.dg1_yls_contract_c_c cc    -- 合同表



-- 补全9大分类

         left join dim.dim_d99_business_mode_cd dm1

                   on cc.industry3 = dm1.pk_parameter

                       and to_date('${yyyy-mm-dd}', 'yyyy-mm-dd') between dm1.stt_date and dm1.end_date



    -- 合同状态

         left join dwd.dg1_yls_parameter_c pt1

                   on cc.cont_status = pt1.param_value

                       and pt1.pk_param_type = upper('0001AA1000000001RC3C')

                       and to_date('${yyyy-mm-dd}', 'yyyy-mm-dd') between pt1.stt_date and pt1.end_date

    -- 合同类型

         left join dwd.dg1_yls_parameter_c pt2

                   on cc.cont_type = pt2.param_value

                       and pt2.pk_param_type = upper('0001AA1000000001VJBS')

                       and to_date('${yyyy-mm-dd}', 'yyyy-mm-dd') between pt2.stt_date and pt2.end_date

    -- 控股类型

         left join dwd.dg1_yls_parameter_c pt3

                   on cc.economic_style1 = pt3.pk_parameter

                       and pt3.pk_param_type = upper('0001AA10000000041633')

                       and to_date('${yyyy-mm-dd}', 'yyyy-mm-dd') between pt3.stt_date and pt3.end_date

    -- 担保方式

         left join dwd.dg1_yls_parameter_c magum

                   on cc.major_guarantee_method = magum.pk_parameter

                       and magum.pk_param_type = upper('0001AA1000000002K3MQ')

                       and to_date('${yyyy-mm-dd}', 'yyyy-mm-dd') between pt3.stt_date and pt3.end_date

    -- 逾期情况

         left join (

    select ipc.pk_contract

         ,coalesce(max(case

                           when ipc.trans_type = upper('0001AA100000000AUBPA') and

                                ipc.charge_off_status = 2 and

                                gab.check_date > '${yyyy-mm-dd}' then

                               to_date(gab.check_date, 'yyyy-mm-dd') - to_date(ipc.plan_date, 'yyyy-mm-dd')

                           when ipc.trans_type = upper('0001AA100000000AUBPA') and

                                ipc.charge_off_status <> 2 and

                                ipc.plan_date <= '${yyyy-mm-dd}' then

                               to_date('${yyyy-mm-dd}', 'yyyy-mm-dd') - to_date(ipc.plan_date, 'yyyy-mm-dd')

        end),

                   0) as overdue_days_zqx

         ,coalesce(max(case

                           when ipc.charge_off_status = 2 and

                                gab.check_date > '${yyyy-mm-dd}' then

                               to_date(gab.check_date, 'yyyy-mm-dd') - to_date(ipc.plan_date, 'yyyy-mm-dd')

                           when ipc.charge_off_status <> 2 and

                                ipc.plan_date <= '${yyyy-mm-dd}' then

                               to_date('${yyyy-mm-dd}', 'yyyy-mm-dd') - to_date(ipc.plan_date, 'yyyy-mm-dd')

        end),

                   0) as overdue_days /*租金逾期天数*/

    from dwd.dg1_yls_inout_plan_c_c ipc

             left join (select gab.pk_inout_plan

                             ,coalesce(max(gap.trade_date), '${yyyy-mm-dd}') as check_date

                        from dwd.dg1_yls_gather_account_b_c gab

                                 inner join dwd.dg1_yls_gather_account_c ga

                                            on ga.pk_gather_account = gab.pk_gather_account

                                                and to_date('${yyyy-mm-dd}', 'yyyy-mm-dd') between ga.stt_date and ga.end_date

                                 inner join dwd.dg1_yls_gather_audit_plan_c gap

                                            on gap.pk_gather_account_b = gab.pk_gather_account_b

                                                and to_date('${yyyy-mm-dd}', 'yyyy-mm-dd') between gap.stt_date and gap.end_date

                        where ga.billstatus = 9

                          and to_date('${yyyy-mm-dd}', 'yyyy-mm-dd') between gab.stt_date and gab.end_date

                        group by gab.pk_inout_plan) gab

                       on gab.pk_inout_plan = ipc.pk_inout_plan

    where ipc.trans_type in (upper('0001AA10000000007NGV'),

                             upper('0001AA100000000AUBPA'),

                             upper('0001AA10000000007NH3')) /* 现金流类型 租金 收租（租前息） 首付款*/

      and ipc.rent_type = 1 /* 租金表类型 会计表*/

      and ipc.plan_date <= '${yyyy-mm-dd}'

      and ipc.lease_cash >= 0.01

      and to_date('${yyyy-mm-dd}', 'yyyy-mm-dd') between ipc.stt_date and ipc.end_date

    group by ipc.pk_contract

) ipo

                   on cc.pk_contract = ipo.pk_contract

         left join (

    select plan.PK_CONTRACT,max(rec.OVERDUE_DATE) OVERDUE_DATE

    from dwd.dg1_yls_overdue_record_c rec

             join dwd.dg1_yls_inout_plan_c_c plan on plan.PK_INOUT_PLAN = rec.PK_INOUT_PLAN

        and to_date('${yyyy-mm-dd}', 'yyyy-mm-dd') between plan.stt_date and plan.end_date

    where to_date('${yyyy-mm-dd}', 'yyyy-mm-dd') between rec.stt_date and rec.end_date

    group by plan.PK_CONTRACT

) yq on yq.PK_CONTRACT = cc.PK_CONTRACT

    -- 实际投放金额

         left join (

    select ipc.pk_contract  -- 主键

         ,sum(coalesce(lp.real_pay_cash, 0.00))              fact_cash_loan      -- 已投放金额

         ,min(coalesce(ld.real_pay_date, '${yyyy-mm-dd}'))      pay_date            -- 首次投放日

    from dwd.dg1_yls_inout_plan_c_c ipc

             left join dwd.dg1_yls_loan_plan_c lp

                       on ipc.pk_inout_plan = lp.pk_inout_plan

                           and to_date('${yyyy-mm-dd}', 'yyyy-mm-dd') between lp.stt_date and lp.end_date

             left join dwd.dg1_yls_loan_deal_c ld

                       on lp.pk_loan_deal = ld.pk_loan_deal

                           and to_date('${yyyy-mm-dd}', 'yyyy-mm-dd') between ld.stt_date and ld.end_date

    where to_date('${yyyy-mm-dd}', 'yyyy-mm-dd') between ipc.stt_date and ipc.end_date

      and ipc.trans_type in (upper('0001AA10000000005GRC'), upper('0001AA10000000007NGO'), upper('0001AA1000000005AB31'), upper('0001AA1000000005AB32'))

      and ipc.rent_type = 1          -- 租金表类型-会计表

      and lp.if_account = 0          -- 是否核销为是

      and lp.if_approve_cancel = 1   -- 是否审核撤销为否时

      and lp.if_cancel = 1           -- 是否核销撤销为否时

      and ld.billstatus = 9

      and ld.real_pay_date <= '${yyyy-mm-dd}'

    group by ipc.pk_contract

) sjtf

                   on cc.pk_contract = sjtf.pk_contract



    -- 首付款

         left join (

    select ipc.pk_contract

         ,sum(coalesce(ipc.lease_cash, 0.00)) as inner_deduct_cash

         ,min(coalesce(ld.real_pay_date, '${yyyy-mm-dd}')) as pay_date

    from dwd.dg1_yls_inout_plan_c_c ipc

             left join dwd.dg1_yls_loan_plan_c lp

                       on lp.pk_inout_plan = ipc.pk_inout_plan

                           and to_date('${yyyy-mm-dd}', 'yyyy-mm-dd') between lp.stt_date and lp.end_date

             left join dwd.dg1_yls_loan_deal_c ld

                       on ld.pk_loan_deal = lp.pk_loan_deal

                           and to_date('${yyyy-mm-dd}', 'yyyy-mm-dd') between ld.stt_date and ld.end_date

    where ipc.trans_type = '0001AA10000000007NH3' /* 现金流类型 设备款*/

      and ipc.rent_type = 1 /* 租金表类型 会计表*/

      and lp.if_inner_deduct = 2 /* 是否内扣为是 */

      and lp.if_cancel = 1 /* 是否核销撤销为否时 */

      and ld.billstatus = 9

      and ld.real_pay_date <= '${yyyy-mm-dd}'

      and to_date('${yyyy-mm-dd}', 'yyyy-mm-dd') between ipc.stt_date and ipc.end_date

    group by ipc.pk_contract

) sfk

                   on cc.pk_contract = sfk.pk_contract



    -- 五级分类

         left join (

    select i1.pk_contract             -- 合同PK

         ,i1.assets_classify         -- 五级分类

         ,i1.accrue_cash

    from dwd.dg1_assets_classify_history_c i1                -- yls_assets_classify_history

             join (

        select ic.pk_contract

             ,max(ic.pk_assets_classify_history) pk_assets_classify_history

        from dwd.dg1_assets_classify_history_c ic

        where to_date('${yyyy-mm-dd}', 'yyyy-mm-dd') between ic.stt_date and ic.end_date

          and (

                  case when ic.if_new = 0 then ic.period

                       else coalesce(substr(replace(ic.change_date, '-', ''), 1, 6), ic.period)

                      end

                  )  <= substr(replace('${yyyy-mm-dd}', '-', ''), 1, 6)

        group by ic.pk_contract

    ) i2

                  on i1.pk_assets_classify_history = i2.pk_assets_classify_history

    where to_date('${yyyy-mm-dd}', 'yyyy-mm-dd') between i1.stt_date and i1.end_date

) nn

                   on cc.pk_contract = nn.pk_contract



    -- 项目信息

         left join dwd.dg1_yls_project_info_c pi

                   on cc.pk_project = pi.pk_project_info

                       and to_date('${yyyy-mm-dd}', 'yyyy-mm-dd') between pi.stt_date and pi.end_date

    -- 集团客户

         left join (

    select distinct source_bill, if_group_company, vesting_group

    from dwd.dg1_yls_project_both_lessee_c

    where lessee_type = 0

      and to_date('${yyyy-mm-dd}', 'yyyy-mm-dd') between stt_date and end_date

) pbl

                   on pi.pk_project_info = pbl.source_bill

    -- 主办/协办信息

         left join dwd.dg1_yls_project_approval_c pa

                   on pi.pk_project_approval = pa.pk_project_approval

                       and to_date('${yyyy-mm-dd}', 'yyyy-mm-dd') between pa.stt_date and pa.end_date

    -- 城建类

         left join (

    select row_number() over(partition by pk_project_info order by ts) rcnt

          ,i3.pk_project_info

         ,i3.investment                  -- 城建类判断

    from dwd.dg1_yls_prj_nodecollect_c i3

    where to_date('${yyyy-mm-dd}', 'yyyy-mm-dd') between i3.stt_date and i3.end_date

) pn

                   on pi.pk_project_info = pn.pk_project_info

                       and pn.rcnt = 1



    -- 用户信息相关

         left join dwd.dg1_yls_customer_c vc

                   on cc.pk_customer_lessee = vc.pk_customer

                       and to_date('${yyyy-mm-dd}', 'yyyy-mm-dd') between vc.stt_date and vc.end_date

    -- 企业客户基本信息

         left join dwd.dg1_yls_customer_corp_c cu

                   on vc.pk_customer = cu.pk_customer

                       and to_date('${yyyy-mm-dd}', 'yyyy-mm-dd') between cu.stt_date and cu.end_date

    -- 投放地区

         left join dwd.dg1_bd_areacl_c ba1 on ba1.pk_areacl = cu.PROVINCE

    and to_date('${yyyy-mm-dd}', 'yyyy-mm-dd') between ba1.stt_date and ba1.end_date

         left join dwd.dg1_bd_areacl_c ba2 on ba2.pk_areacl = cu.CITY

    and to_date('${yyyy-mm-dd}', 'yyyy-mm-dd') between ba2.stt_date and ba2.end_date

         left join dwd.dg1_bd_areacl_c ba3 on ba3.pk_areacl = cu.DISTRICT

    and to_date('${yyyy-mm-dd}', 'yyyy-mm-dd') between ba3.stt_date and ba3.end_date

    -- 行业分类

         left join dwd.dg1_yls_parameter_c hy

                   on cc.industry = hy.pk_parameter

                       and hy.pk_param_type  = upper('0001AA1000000000OY5C')

                       and to_date('${yyyy-mm-dd}', 'yyyy-mm-dd') between hy.stt_date and hy.end_date

         left join dwd.dg1_yls_parameter_c hy1

                   on cc.industry1 = hy1.pk_parameter

                       and hy1.pk_param_type = upper('0001AA1000000000OY5C')

                       and to_date('${yyyy-mm-dd}', 'yyyy-mm-dd') between hy1.stt_date and hy1.end_date

         left join dwd.dg1_yls_parameter_c hy2

                   on cc.industry2 = hy2.pk_parameter

                       and hy2.pk_param_type = upper('0001AA1000000000OY5C')

                       and to_date('${yyyy-mm-dd}', 'yyyy-mm-dd') between hy2.stt_date and hy2.end_date

         left join dwd.dg1_yls_parameter_c hy3

                   on cc.industry3 = hy3.pk_parameter

                       and hy3.pk_param_type = upper('0001AA1000000000OY5C')

                       and to_date('${yyyy-mm-dd}', 'yyyy-mm-dd') between hy3.stt_date and hy3.end_date



    -- 剩余保证金计算

         left join (

    select ipc.pk_contract

         ,sum(case

                  when ipc.trans_type = '0001AA10000000007NHR' then

                      (case when lp.pay_cash > ipc.lease_cash then coalesce(ipc.lease_cash, 0.00)

                            else coalesce(lp.pay_cash, 0.00)

                          end) + coalesce(gac.gather_cash, 0)

                  when ipc.trans_type = '0001AA10000000007NHT' then

                      -coalesce(gab.gather_cash, 0)

                  when ipc.trans_type = '0001AA10000000007NI5' then

                      coalesce(gac.gather_cash, 0)

                  when ipc.trans_type = '0001AA10000000007NHX' then

                      -coalesce(lp.pay_cash, 0)

                  else 0

        end) as deposit_balance

    from dwd.dg1_yls_inout_plan_c_c ipc

             left join (select ipc.pk_inout_plan

                             ,coalesce(ga.charge_off_cash, 0) as gather_cash

                        from dwd.dg1_yls_inout_plan_c_c ipc

                                 inner join dwd.dg1_yls_gather_account_c ga

                                            on ipc.pk_inout_plan = ga.pk_account_bill

                                                and to_date('${yyyy-mm-dd}', 'yyyy-mm-dd') between ga.stt_date and ga.end_date

                        where ga.billstatus = 9 /*单据状态 审核通过*/

                          and ga.check_date <= '${yyyy-mm-dd}'

                          and ipc.trans_type = '0001AA10000000007NHT'

                          and to_date('${yyyy-mm-dd}', 'yyyy-mm-dd') between ipc.stt_date and ipc.end_date

    ) gab

                       on gab.pk_inout_plan = ipc.pk_inout_plan

             left join (select ipc.pk_inout_plan

                             ,coalesce(gab.gather_cash, 0) as gather_cash

                        from dwd.dg1_yls_inout_plan_c_c ipc

                                 inner join dwd.dg1_yls_gather_account_b_c gab

                                            on ipc.pk_inout_plan = gab.pk_inout_plan

                                                and to_date('${yyyy-mm-dd}', 'yyyy-mm-dd') between gab.stt_date and gab.end_date

                                 inner join dwd.dg1_yls_gather_account_c ga

                                            on ga.pk_gather_account = gab.pk_gather_account

                                                and to_date('${yyyy-mm-dd}', 'yyyy-mm-dd') between ga.stt_date and ga.end_date

                        where ga.billstatus = 9 /*单据状态 审核通过*/

                          and ga.check_date <= '${yyyy-mm-dd}'

                          and ipc.trans_type in

                              ('0001AA10000000007NHR', '0001AA10000000007NI5')

                          and to_date('${yyyy-mm-dd}', 'yyyy-mm-dd') between ipc.stt_date and ipc.end_date

    ) gac

                       on gac.pk_inout_plan = ipc.pk_inout_plan

             left join (select lp.pk_inout_plan

                             ,(case when coalesce(ld.real_pay_cash, 0.00) = 0

                                        then coalesce(ld.inner_deduct_cash, 0.00)

                                    else coalesce(ld.real_pay_cash, 0.00)

            end) as pay_cash

                        from dwd.dg1_yls_loan_plan_c lp

                                 inner join dwd.dg1_yls_loan_deal_c ld

                                            on ld.pk_loan_deal = lp.pk_loan_deal

                                                and to_date('${yyyy-mm-dd}', 'yyyy-mm-dd') between ld.stt_date and ld.end_date

                        where lp.if_approve_cancel = 1 /* 是否审核撤销为否时 */

                          and lp.if_cancel = 1         /* 是否核销撤销为否时 */

                          and ld.billstatus = 9

                          and ld.real_pay_date <= '${yyyy-mm-dd}'

                          and to_date('${yyyy-mm-dd}', 'yyyy-mm-dd') between lp.stt_date and lp.end_date

    ) lp

                       on lp.pk_inout_plan = ipc.pk_inout_plan

    where ipc.trans_type in ('0001AA10000000007NHR',

                             '0001AA10000000007NHT',

                             '0001AA10000000007NI5',

                             '0001AA10000000007NHX') /* 现金流类型 收取保证金,保证金冲抵,补足保证金,退还保证金*/

      and ipc.rent_type = 1 /* 租金表类型 会计表*/

      and to_date('${yyyy-mm-dd}', 'yyyy-mm-dd') between ipc.stt_date and ipc.end_date

    group by ipc.pk_contract

) lpb

                   on cc.pk_contract = lpb.pk_contract



         left join dwd.dg1_yls_old_contract_c yoc

                   on cc.pk_contract = yoc.pk_contract

                       and to_date('${yyyy-mm-dd}', 'yyyy-mm-dd') between yoc.stt_date and yoc.end_date



    -- 实收数据

         left join (

    select sum(case when et.event_code in ('10201', '10203', '10216') and gab.trade_date <= '${yyyy-mm-dd}'

                        then coalesce(gab.gather_cash, 0)

                    else 0

        end) gather_cash

         ,sum(case when et.event_code in ('10201', '10203') and gab.trade_date <= '${yyyy-mm-dd}'

                       then coalesce(gab.gather_corpus, 0)

                   else 0

        end) gather_corpus

         ,sum(case when et.event_code in ('10201', '10216') and gab.trade_date <= '${yyyy-mm-dd}'

                       then coalesce(gab.gather_interest, 0)

                   else 0

        end) gather_interest

         ,sum(case when et.event_code in ('10213') and gab.trade_date <= '${yyyy-mm-dd}'

                       then coalesce(gab.gather_cash, 0)

                   else 0

        end) gather_penal_cash

         ,sum(case when et.event_code in ('10201', '10203') and gab.trade_date >= concat(substr('${yyyy-mm-dd}', 1, 4), '-01-01') and

                        gab.trade_date <= concat(substr('${yyyy-mm-dd}', 1, 4), '-12-31')

                       then coalesce(gab.gather_cash, 0)

                   else 0

        end) gather_cash1

         ,sum(case when et.event_code in ('10201', '10203') and

                        gab.trade_date >= concat(substr('${yyyy-mm-dd}', 1, 4), '-01-01') and

                        gab.trade_date <= concat(substr('${yyyy-mm-dd}', 1, 4), '-12-31')

                       then coalesce(gab.gather_corpus, 0)

                   else 0

        end) gather_corpus1

         ,sum(case when et.event_code in ('10201', '10203', '10216') and

                        gab.trade_date >= concat(substr('${yyyy-mm-dd}', 1, 4), '-01-01') and

                        gab.trade_date <= concat(substr('${yyyy-mm-dd}', 1, 4), '-12-31')

                       then coalesce(gab.gather_interest, 0)

                   else 0

        end) gather_interest1

         ,sum(case when et.event_code in ('10213') and

                        gab.trade_date >= concat(substr('${yyyy-mm-dd}', 1, 4), '-01-01') and

                        gab.trade_date <= concat(substr('${yyyy-mm-dd}', 1, 4), '-12-31')

                       then coalesce(gab.gather_cash, 0)

                   else 0

        end) gather_penal_cash1

         ,sum(case when gab.trade_date >= concat(substr('${yyyy-mm-dd}', 1, 4), '-01-01') and

                        gab.trade_date <= concat(substr('${yyyy-mm-dd}', 1, 4), '-12-31')

                       then

                       1

                   else

                       0

        end) cur_year_time

         ,sum(case when gab.trade_date >= '${yyyy-mm-dd}' and

                        gab.trade_date <= to_char(add_months(date'${yyyy-mm-dd}', 12), 'yyyy-mm-dd') then

                       1

                   else

                       0

        end) future_time

         ,ipc.pk_contract

    from dwd.dg1_yls_gather_account_b_c gab

             join dwd.dg1_yls_gather_account_c ga

                  on ga.pk_gather_account = gab.pk_gather_account

                      and to_date('${yyyy-mm-dd}', 'yyyy-mm-dd') between ga.stt_date and ga.end_date

             join dwd.dg1_yls_inout_plan_c_c ipc

                  on ipc.pk_inout_plan = gab.pk_inout_plan

                      and to_date('${yyyy-mm-dd}', 'yyyy-mm-dd') between ipc.stt_date and ipc.end_date

             join dwd.dg1_yls_event_type_c et

                  on et.pk_event_type = ipc.trans_type

                      and to_date('${yyyy-mm-dd}', 'yyyy-mm-dd') between et.stt_date and et.end_date

    where ga.billstatus = 9

      and to_date('${yyyy-mm-dd}', 'yyyy-mm-dd') between gab.stt_date and gab.end_date

    group by ipc.pk_contract

) gather

                   on cc.pk_contract = gather.pk_contract



         left join dwd.dg1_yls_lease_calculator_c_c lc

                   on cc.pk_lease_calculator = lc.pk_lease_calculator

                       and to_date('${yyyy-mm-dd}', 'yyyy-mm-dd') between lc.stt_date and lc.end_date

    -- 实时数据

         left join (

    select sum(case when et.event_code in ('10201','10202','10203','10216') then coalesce(ipc.lease_cash,0) else 0 end) lease_cash, /* 总租金 */

           sum(case when et.event_code in ('10401'/*,'10402','10403'*/,'10606') then coalesce(ipc.lease_cash,0) else 0 end) lease_cash1,/* 手续费/咨询费 */

           sum(case when et.event_code in ('10405') then coalesce(ipc.lease_cash,0) else 0 end) lease_cash11,/* 固定租金 */

           sum(case when et.event_code in ('10301') then coalesce(ipc.lease_cash,0) else 0 end) lease_cash2, /* 保证金收取 */

           sum(case when et.event_code in ('10308') then coalesce(ipc.lease_cash,0) else 0 end) lease_cash22, /* 补住保证金 */

           sum(case when et.event_code in ('10302') then coalesce(ipc.fact_cash,0) else 0 end) lease_cash3, /* 保证金冲抵 */

           sum(case when et.event_code in ('10304') then coalesce(ipc.lease_cash,0) else 0 end) lease_cash33, /* 退还保证金 */

           sum(case when et.event_code in ('10201','10203') then coalesce(ipc.lease_cash,0) else 0 end) lease_cash4, /* 收取总租金 */

           sum(case when et.event_code in ('10201','10202','10216') then coalesce(ipc.lease_interest,0) else 0 end) lease_interest, /* 收取总利息 */

           sum(case when et.event_code in ('10101','10102') and ycc.cont_status = 8 then coalesce(ipc.fact_cash,0)

                    when et.event_code in ('10201','10203') and ycc.cont_status != 8 then coalesce(ipc.lease_corpus,0) else 0 end) lease_corpus, /* 总本金 */

           sum(case when et.event_code in ('10301','10308') then coalesce(ipc.fact_cash,0) else 0 end) fact_cash2, /* 实收:保证金收取、补足 */

           sum(case when et.event_code in ('10302','10304') then coalesce(ipc.fact_cash,0) else 0 end) fact_cash3, /* 实际：保证金冲抵、退还保证金 */

           ipc.source_bill

    from dwd.dg1_yls_inout_plan_c_c ipc

             join dwd.dg1_yls_event_type_c et on et.pk_event_type = ipc.trans_type

        and to_date('${yyyy-mm-dd}', 'yyyy-mm-dd') between et.stt_date and et.end_date

             join dwd.dg1_yls_contract_c_c ycc on ycc.pk_contract = ipc.pk_contract

        and to_date('${yyyy-mm-dd}', 'yyyy-mm-dd') between ycc.stt_date and ycc.end_date

    where to_date('${yyyy-mm-dd}', 'yyyy-mm-dd') between ipc.stt_date and ipc.end_date

    group by ipc.source_bill

) ipc on lc.pk_lease_calculator = ipc.source_bill

    -- 历史数据

         left join (



    select ch.CONT_CODE,rc.interrate,rc.new_final_rate ,rc.NEW_PROJECT_IRR,rc.NEW_CONTRACT_XIRR,h.lease_cash,h.lease_cash1,h.lease_cash2,

           h.lease_cash3,lease_cash22,h.lease_cash33,h.LEASE_INTEREST,

           h.fact_cash2,h.fact_cash3

    from dwd.dg1_yls_contract_h_c ch

             join dwd.dg1_yls_rent_calculator_c rc on rc.PK_CONTRACT = ch.PK_CONTRACT

        and to_date('${yyyy-mm-dd}', 'yyyy-mm-dd') between rc.stt_date and rc.end_date

             join (

        select iph.SOURCE_BILL,

               sum(case when et.EVENT_CODE in ('10201','10202','10203','10216') then coalesce(iph.LEASE_CASH,0) else 0 end) lease_cash, /* 收租总租金 */

               sum(case when et.EVENT_CODE in ('10401'/*,'10402','10403'*/,'10405','10606') then coalesce(iph.LEASE_CASH,0) else 0 end) lease_cash1, /* 手续费/咨询费/固定租金 */

               sum(case when et.EVENT_CODE in ('10201','10202','10216') then coalesce(iph.LEASE_INTEREST,0) else 0 end) LEASE_INTEREST, /* 收租总租息 */

               sum(case when et.EVENT_CODE in ('10301') then coalesce(iph.LEASE_CASH,0) else 0 end) lease_cash2, /* 保证金收取 */

               sum(case when et.EVENT_CODE in ('10308') then coalesce(iph.LEASE_CASH,0) else 0 end) lease_cash22, /* 保证金补住 */

               sum(case when et.EVENT_CODE in ('10302') then coalesce(iph.LEASE_CASH,0) else 0 end) lease_cash3, /* 保证金冲抵*/

               sum(case when et.EVENT_CODE in ('10304') then coalesce(iph.LEASE_CASH,0) else 0 end) lease_cash33, /* 保证金退还 */

               sum(case when et.EVENT_CODE in ('10301','10308') then coalesce(iph.FACT_CASH,0) else 0 end) fact_cash2, /* 实收:保证金收取、补足 */

               sum(case when et.EVENT_CODE in ('10302','10304') then coalesce(iph.FACT_CASH,0) else 0 end) fact_cash3 /* 实际：保证金冲抵、退还保证金 */

        from dwd.dg1_yls_inout_plan_h_c iph

                 join dwd.dg1_yls_event_type_c et on et.PK_EVENT_TYPE = iph.TRANS_TYPE

            and to_date('${yyyy-mm-dd}', 'yyyy-mm-dd') between et.stt_date and et.end_date

        where to_date('${yyyy-mm-dd}', 'yyyy-mm-dd') between iph.stt_date and iph.end_date

        group by iph.SOURCE_BILL

    ) h on h.SOURCE_BILL = rc.PK_RENT_CALCULATOR

    where ch.SOURCE_BILL_VERSIONPK in (

        select chh.PK_CONTRACT

        from dwd.dg1_yls_contract_h_c chh

                 join (

            select max(CHECK_DATE)CHECK_DATE,ch.cont_code

            from dwd.dg1_yls_contract_h_c ch

            where upper(ch.SOURCE_BILLTYPE) = upper('lease/ContractChange')

              and ch.SOURCE_BILL_VERSIONPK is null

              and ch.CHECK_DATE > '${yyyy-mm-dd}'

              and to_date('${yyyy-mm-dd}', 'yyyy-mm-dd') between ch.stt_date and ch.end_date

            group by ch.CONT_CODE

        )zj_change on zj_change.CHECK_DATE = chh.check_date and zj_change.cont_code = chh.cont_code

            and upper(chh.SOURCE_BILLTYPE) = upper('lease/ContractChange')

            and chh.SOURCE_BILL_VERSIONPK is null

        where to_date('${yyyy-mm-dd}', 'yyyy-mm-dd') between chh.stt_date and chh.end_date



    )

      and to_date('${yyyy-mm-dd}', 'yyyy-mm-dd') between ch.stt_date and ch.end_date

) history

                   on history.cont_code = cc.cont_code

    -- 计划投放数量

         left join (

    select i5.pk_contract

         ,count(*) plan_count

    from dwd.dg1_yls_inout_plan_c_c i5

    where i5.trans_type in ('0001AA10000000005GRC','0001AA10000000007NGO','0001AA1000000005AB31', '0001AA1000000005AB32')

      and i5.rent_type = 1

    group by i5.pk_contract

) planc

                   on cc.pk_contract = planc.pk_contract



    -- 租赁物信息

         left join (

    select ypfa1.param_name fixed_assets

         ,ypfa2.param_name fixed_assets_lag

         ,ypfa3.param_name fixed_assets_mid

         ,ypfa4.param_name fixed_assets_sml

         ,prtc.thing_name

         ,prtc.source_bill

    from dwd.dg1_yls_project_rent_thing_c_c prtc

             left join dwd.dg1_yls_parameter_c ypfa1 on ypfa1.pk_parameter = prtc.fixed_assets        and  ypfa1.is_enable = upper('Y') and ypfa1.param_type = 293

        and to_date('${yyyy-mm-dd}', 'yyyy-mm-dd') between ypfa1.stt_date and ypfa1.end_date

             left join dwd.dg1_yls_parameter_c ypfa2 on ypfa2.pk_parameter = prtc.fixed_assets_large  and  ypfa2.is_enable = upper('Y') and ypfa2.param_type = 293

        and to_date('${yyyy-mm-dd}', 'yyyy-mm-dd') between ypfa2.stt_date and ypfa2.end_date

             left join dwd.dg1_yls_parameter_c ypfa3 on ypfa3.pk_parameter = prtc.fixed_assets_middle and  ypfa3.is_enable = upper('Y') and ypfa3.param_type = 293

        and to_date('${yyyy-mm-dd}', 'yyyy-mm-dd') between ypfa3.stt_date and ypfa3.end_date

             left join dwd.dg1_yls_parameter_c ypfa4 on ypfa4.pk_parameter = prtc.fixed_assets_small  and  ypfa4.is_enable = upper('Y') and ypfa4.param_type = 293

        and to_date('${yyyy-mm-dd}', 'yyyy-mm-dd') between ypfa4.stt_date and ypfa4.end_date

    where prtc.is_ref_main = 0

      and to_date('${yyyy-mm-dd}', 'yyyy-mm-dd') between prtc.stt_date and prtc.end_date

) main_thing

                   on cc.pk_contract = main_thing.source_bill

    -- 主办

         left join dwd.dwd_d01_party_c su

                   on cc.pk_prj_manager = su.cuserid

                       and to_date('${yyyy-mm-dd}', 'yyyy-mm-dd') between su.stt_date and su.end_date

    -- 协办

         left join dwd.dwd_d01_party_c su2

                   on cc.pk_cust_help = su2.cuserid

                       and to_date('${yyyy-mm-dd}', 'yyyy-mm-dd') between su2.stt_date and su2.end_date

         left join (

    select adj3.cont_code,

           max(case when (adj3.response_day <= '${yyyy-mm-dd}' and  '${yyyy-mm-dd}' < adj3.response_day_end) or '${yyyy-mm-dd}' <= adj3.response_day then adj3.interrate_after end) as interrate_after,

           max(case when (adj3.response_day <= '${yyyy-mm-dd}' and  '${yyyy-mm-dd}' < adj3.response_day_end) or '${yyyy-mm-dd}' <= adj3.response_day then adj3.interrate_fact_after end) as interrate_fact_after,

           max(case when (adj3.response_day <= '${yyyy-mm-dd}' and  '${yyyy-mm-dd}' < adj3.response_day_end) or '${yyyy-mm-dd}' <= adj3.response_day then adj3.project_irr end) as project_irr,

           max(case when (adj3.response_day <= '${yyyy-mm-dd}' and  '${yyyy-mm-dd}' < adj3.response_day_end) or '${yyyy-mm-dd}' <= adj3.response_day then adj3.contract_xirr end) as contract_xirr

    from(

            select adj.cont_code,

                   adj.response_day,

                   coalesce(min(case when adj.response_day < adj2.response_day then adj2.response_day end),'${yyyy-mm-dd}') response_day_end,

                   min(adj.interrate_after) interrate_after, -- /*调息后基准利率*/

                   min(adj.interrate_fact_after) interrate_fact_after, -- /*调息后实际利率*/

                   min(adj.project_irr) project_irr, -- /*调息后合同irr*/

                   min(adj.contract_xirr) contract_xirr -- /*合同收益xirr*/

            from (select ch.cont_code,

                         ch.check_date as response_day,

                         rc.interrate as interrate_after,

                         rc.new_final_rate as interrate_fact_after,

                         rc.new_project_irr as project_irr,

                         rc.new_contract_xirr as contract_xirr

                  from dwd.dg1_yls_contract_h_c ch

                           join dwd.dg1_yls_rent_calculator_c rc on rc.pk_contract = ch.pk_contract

                  where upper(ch.source_billtype) = upper('lease/contractchange')

                    and ch.source_bill_versionpk is null

                    and ch.billstatus = 9

                    and date'${yyyy-mm-dd}' between ch.stt_date and ch.end_date

                    and date'${yyyy-mm-dd}' between rc.stt_date and rc.end_date

                  union all  -- /*实际调息*/

                  select distinct cc.cont_code,aa.response_day,

                                  aa.interrate_after, -- /*调息后基准利率*/

                                  aa.interrate_fact_after, -- /*调息后实际利率*/

                                  aa.project_irr, -- /*调息后合同irr*/

                                  aa.contract_xirr -- /*合同收益xirr*/

                  from dwd.dg1_yls_adjust_apply_c aa

                           left join dwd.dg1_yls_contract_c_c cc on cc.pk_contract = aa.pk_contract

                      and date'${yyyy-mm-dd}' between cc.stt_date and cc.end_date

                  where aa.billstatus = 9

                    and date'${yyyy-mm-dd}' between aa.stt_date and aa.end_date

                  union all    -- /*首次调息时，调息前信息*/

                  select distinct cc.cont_code,to_char(to_date(aa.response_day, 'yyyy-mm-dd') - 1, 'yyyy-mm-dd') as response_day,

                                  aa.interrate_before as interrate_after, -- /*调息前基准利率*/

                                  aa.interrate_fact_before as interrate_fact_after, -- /*调息前实际利率*/

                                  aa.cont_irr_befor as project_irr, -- /*调息前合同irr*/

                                  aa.contract_xirr_before as contract_xirr -- /*调息前合同收益xirr*/

                  from dwd.dg1_yls_adjust_apply_c aa

                           join (select min(a.response_day) as response_day,a.pk_contract

                                 from dwd.dg1_yls_adjust_apply_c a

                                 where a.billstatus = 9

                                   and date'${yyyy-mm-dd}' between a.stt_date and a.end_date

                                 group by a.pk_contract) minday

                                on minday.pk_contract = aa.pk_contract and minday.response_day = aa.response_day

                                    and date'${yyyy-mm-dd}' between aa.stt_date and aa.end_date

                           left join dwd.dg1_yls_contract_c_c cc

                                     on cc.pk_contract = aa.pk_contract

                                         and date'${yyyy-mm-dd}' between cc.stt_date and cc.end_date) adj

                     left join (

                select ch.cont_code,

                       ch.check_date as response_day,

                       rc.interrate as interrate_after,

                       rc.new_final_rate as interrate_fact_after,

                       rc.new_project_irr as project_irr,

                       rc.new_contract_xirr as contract_xirr

                from dwd.dg1_yls_contract_h_c ch

                         join dwd.dg1_yls_rent_calculator_c rc on rc.pk_contract = ch.pk_contract

                where upper(ch.source_billtype) = upper('lease/contractchange')

                  and ch.source_bill_versionpk is null

                  and ch.billstatus = 9

                  and date'${yyyy-mm-dd}' between ch.stt_date and ch.end_date

                  and date'${yyyy-mm-dd}' between rc.stt_date and rc.end_date

                union all

                select distinct cc.cont_code,aa.response_day,

                                aa.interrate_after, -- /*调息后基准利率*/

                                aa.interrate_fact_after, -- /*调息后实际利率*/

                                aa.project_irr, -- /*调息后合同irr*/

                                aa.contract_xirr -- /*合同收益xirr*/

                from dwd.dg1_yls_adjust_apply_c aa

                         left join dwd.dg1_yls_contract_c_c cc on cc.pk_contract = aa.pk_contract

                where aa.billstatus = 9

                  and date'${yyyy-mm-dd}' between aa.stt_date and aa.end_date

                  and date'${yyyy-mm-dd}' between cc.stt_date and cc.end_date

                union all

                select distinct cc.cont_code,to_char(to_date(aa.response_day, 'yyyy-mm-dd') - 1, 'yyyy-mm-dd') as response_day,

                                aa.interrate_before as interrate_after, -- /*调息前基准利率*/

                                aa.interrate_fact_before as interrate_fact_after, -- /*调息前实际利率*/

                                aa.cont_irr_befor as project_irr, -- /*调息前合同irr*/

                                aa.contract_xirr_before as contract_xirr -- /*调息前合同收益xirr*/

                from dwd.dg1_yls_adjust_apply_c aa

                         join (select min(a.response_day) as response_day,a.pk_contract

                               from dwd.dg1_yls_adjust_apply_c a

                               where a.billstatus = 9

                                 and date'${yyyy-mm-dd}' between a.stt_date and a.end_date

                               group by a.pk_contract) minday

                              on minday.pk_contract = aa.pk_contract and minday.response_day = aa.response_day

                         left join dwd.dg1_yls_contract_c_c cc

                                   on cc.pk_contract = aa.pk_contract

                                       and date'${yyyy-mm-dd}' between cc.stt_date and cc.end_date

                where date'${yyyy-mm-dd}' between aa.stt_date and aa.end_date

            ) adj2  on adj2.cont_code = adj.cont_code

            group by adj.cont_code,adj.response_day

        ) adj3

    group by adj3.cont_code

) adj on adj.cont_code = cc.cont_code

where to_date('${yyyy-mm-dd}', 'yyyy-mm-dd') between cc.stt_date and cc.end_date

  -- PK_PARAM_TYPE = '0001AA1000000001RC3C' 合同状态

  and cc.cont_status > '1'

  and cc.cont_status not in ('5' ,'7')
