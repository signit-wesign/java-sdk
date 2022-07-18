

# 欢迎使用易企签 Java SDK

易企签Java sdk包括：

- token授权获取
- 快捷签署
- 快捷会签
- 提交企业实名认证（即：开通在线电子签约服务接口（企业））
- 提交个人实名认证（即：开通在线电子签约服务接口（个人））
- 标准签署流程-自动模式-启动信封签署流程
- 标准签署流程-手动模式（即：自由签）  
    - 创建签署流程
    - 托管签署流程到易企签
    - 签署流程中追加新的签署方
    - 撤销指定签署流程
    - 结束整个签署流程

了解更多易企签详情请访问  [https://www.signit.cn](https://www.signit.cn)

# 安装方式

### Maven

    <dependency>
        <groupId>cn.signit.sdk</groupId>
        <artifactId>signit-java-sdk</artifactId>
        <version>2.7.3</version>
    </dependency>

# 版本更新日志：

#### V2.7.3 2022.07
1. 新增ENVELOPE_STARTED_SUCCEED/ENVELOPE_STARTED_FAILED/PARTICIPANT_INVALIDATED/PARTICIPANT_NOT_PASS_CHECKED/ENVELOPE_COMPLETED_SUCCEED/ENVELOPE_COMPLETED_INVALIDATED/ENVELOPE_COMPLETED_REJECTED/ENVELOPE_COMPLETED_NOT_PASS_CHECKED/ENVELOPE_COMPLETED_REVOKED/ENVELOPE_COMPLETED_EXPIRED
2. 新增个人/企业实名认证相关事件类型

#### V2.7.2 2022.07
1. 标准签添加是否允许参与者添加表单和关键字定位索引是否逆向搜索参数

#### V2.7.1 2022.05
1. 发起https请求时忽略服务器证书的验证

#### V2.6.0 2020.04
1. 提交标准签署流程-手动模式（即：自由签）

#### V2.5.3 2020.01
1. 更新信封完成webhook事件中返回senderName发起者名字

#### V2.5.2 2019.12
1. 提交企业实名认证，法人和经办人个人实名认证支持支付宝认证，手机三网认证，人脸认证，手机三网+人脸双重认证

#### V2.5.1 2019.11
1. 提交企业实名认证支持指定嵌入模式功能。嵌入模式：企业实名整个流程中不再向用户发送短信，用户和易企签系统的交互依赖返回的webhook事件中返回actionUrl，使得用户操作起来没有跨越系统的体验

#### V2.5.0 2019.09
1. 新增一种快捷签署方式-快捷会签：多个人在一个文档上签字，开发人员只需指定签字区域，无需计算每个签署位置坐标即可实现签字自动排版，并增加快捷会签完成事件

#### V2.4.1 2019.07
1. SignitClient客户端对象支持单例方式的使用

#### V2.4.0 2019.07
1. 支持自定义信封逾期时间

2. webhook事件通知中， 新增“参与者逾期未签署信封事件”

#### V2.3.0 2019.07
1. 关键字定位完成后，支持删除关键字，支持替换关键字

#### V2.2.0 2019.06
1. 实名认证身份证类型新增港澳台身份证
2. 新增时间戳表单

#### V2.1.0 2019.05
1.新增提交个人实名认证request以及相关事件，并支持嵌入模式选择

2."快捷签署完成"事件中新增参数url和base64，以便用于解析webhook响应数据

3.去除codec依赖

4.修复fastjon低于版本1.2.15时的NamingStyle设置会报null的问题

5.启动信封签署流程支持嵌入模式选择，以及调用方可以为每位参与者设置唯一标识符：clientId

6.实名认证图片新增枚举：手持证件人像面

7.启动信封签署流程新增签署认证类型选择

8.webhook响应中新增参与者处理事件

9.启动信封签署流程新增二维码表单和骑缝章表单

#### V2.0.0 2019.02
1.新增提交企业实名认证request

2.新增启动信封签署流程request

3.扩展SignitClient初始化方式

4.SignitClient新增HMAC验证功能

5.关键字定位新增xOffset以及yOffset，使定位更灵活

6.新增token本地缓存，在token有效期内将不再重复生成token

7.新增表单类型：文本表单

8.新增参与者表单处理模式（静默签署）

#### V1.0.2 2018.08
1.支持快捷签署完成后，将多页的文档合并为单页的文档

#### V1.0.1 2018.08
1.environmentUrl添加容错处理

2.快捷签署矩形坐标参数String pages改为Integer page，避免歧义

#### V1.0.0 2018.08
1.token授权获取

2.快捷签署

# [Demo示例](https://github.com/signit-wesign/java-sdk-sample)
