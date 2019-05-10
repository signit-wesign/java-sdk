
# 欢迎使用易企签 Java SDK

易企签Java sdk包括：

- token授权获取
- 快捷签署
- 提交企业实名认证（即：开通在线电子签约服务接口（企业））
- 提交个人实名认证（即：开通在线电子签约服务接口（个人））
- 启动信封签署流程

了解更多易企签详情请访问  [https://www.signit.cn](https://www.signit.cn)

# 版本更新日志：

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
