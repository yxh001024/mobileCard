# 一、功能需求：
- 用户注册
- 用户登录
- 话费充值
- 资费说明
- 本月账单查询
- 套餐余量查询
- 套餐变更
- 办理退网

## 1.用户注册：
 用户购买手机卡后进行注册，需提供的信息有：
 （**手机号、用户名、服务密码、办理的套餐**），用户名可为空。
## 2.用户登录：
 用户使用**手机号**和**密码**登录，登录后才可查看号码信息。游客状态可查看套餐信息。
## 3.话费充值：
  用户登录后进入话费充值页进行充值，充值金额为<span style="color:red">10</span>的倍数，
  最多<span style="color:red">100</span>元
## 4.资费说明：
  用户可查看套餐的资费说明，包含（<span style="color:green">套餐名、套餐价格、通话时间、短信数量、流量</span>)
## 5.本月账单查询：
  用户可查询账单，包含（电话号码、套餐名、通话时长、发送短信数量、已用流量、月租扣费、套餐外通话扣费、
  套餐外短信扣费、套餐外流量扣费、总扣话费、总充值）
## 6.套餐余量查询：
用户可查询套餐剩余，包含（剩余时长、剩余短信数量、剩余流量、套餐名、剩余话费、电话号码、月租）
## 7.套餐变更：
用户可变更套餐，下个月结日生效
## 8.办理退网：
用户可注销号码，号码不可使用

# 二、数据库设计
## 1.卡号信息表：
 | 字段 | 类型 | 注释 |
 |-----|------|-----|
  | id| bigint | 主键、卡id|
 |number|char(11)|卡号|
 |username|varchar|用户名|
|password|varchar|密码|
|money|double|余额|
|talk|int|剩余通话时长|
|sms|int|剩余短信数量|
|flow|int|剩余流量|
|create_time|datetime|创建时间|
|state|varchar|状态|
|package|bigint|套餐id|
|rent|int|月租|
|salt|int|盐值|

## 2.套餐信息表：
|字段|类型|注释|
|---|---|---|
|id|bigint|套餐id、主键|
|package_name|varchar|套餐名|
|package_talk|int|套餐包含通话时长|
|package_sms|int|套餐包含短信数量|
|package_flow|int|套餐包含流量|
|package_price|double|套餐价格|
|over_talk|double|超出套餐通话价格|
|over_sms|double|超出套餐短信价格|
|over_flow|double|超出套餐流量价格|

## 3.消费信息表：
|字段|类型|注释|
|---|---|---|
|id|bigint|主键|
|time|datetime|消费时间|
|brief|varchar|业务描述|
|money|double|业务金额|
|card_id|bigint|卡id|

## 4.账单报表：
|字段|类型|注释|
|---|---|---|
|id|bigint|主键|
|card_id|bigint|卡id|
|month|int|月份|
|talk|int|通话时长|
|sms|int|发送短信数量|
|flow|int|使用流量|
|talk_cost|double|套餐外通话扣费|
|sms_cost|double|套餐外短信扣费|
|flow_cost|double|套餐外流量扣费|
|total_cost|double|总消费|
|total_recharge|double|总充值|

