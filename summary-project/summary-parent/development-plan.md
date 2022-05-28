# summary-project

整体期望：整体网站做一个分布式网站，进站需验证（鉴权模块）

## 2022.5.17

第一步：确定各组件的兼容版本springboot--springcloud

| Release Train                                                | Boot Version                          |
| ------------------------------------------------------------ | ------------------------------------- |
| [2021.0.x](https://github.com/spring-cloud/spring-cloud-release/wiki/Spring-Cloud-2021.0-Release-Notes) aka Jubilee | 2.6.x                                 |
| [2020.0.x](https://github.com/spring-cloud/spring-cloud-release/wiki/Spring-Cloud-2020.0-Release-Notes) aka Ilford | 2.4.x, 2.5.x (Starting with 2020.0.3) |
| [Hoxton](https://github.com/spring-cloud/spring-cloud-release/wiki/Spring-Cloud-Hoxton-Release-Notes) | 2.2.x, 2.3.x (Starting with SR5)      |
| [Greenwich](https://github.com/spring-projects/spring-cloud/wiki/Spring-Cloud-Greenwich-Release-Notes) | 2.1.x                                 |
| [Finchley](https://github.com/spring-projects/spring-cloud/wiki/Spring-Cloud-Finchley-Release-Notes) | 2.0.x                                 |
| [Edgware](https://github.com/spring-projects/spring-cloud/wiki/Spring-Cloud-Edgware-Release-Notes) | 1.5.x                                 |
| [Dalston](https://github.com/spring-projects/spring-cloud/wiki/Spring-Cloud-Dalston-Release-Notes) | 1.5.x                                 |

注：GA 😗*一般可用性（发布）; 应该非常稳定，功能齐全GA = General Availability,通用版本

RC 😗*候选发布者; 可能功能完整，应该非常稳定 - 问题应该是相对罕见和次要的，但值得报告，试图修复它们以便发布。

候选版本(Release Candidate)

M 😗*里程碑构建 - 可能不完整; 应该是模糊的稳定（即它不仅仅是一个夜间快照），但可能仍然有问题。

milestones：里程碑

SR 😗*服务版本（主要版本之后的后续维护版本-RELEASE）



### **版本选择：**

springboot--->springcloud

2.3.4.RELEASE--->Hoxton.SR8



### 今日进度：

[add] eureka server

[add] gateway

​	暂时只实现黑名单功能



------------一阶段---------------- 

1、手机号码注册

2、账号密码登录

--------------二阶段--------------

3、微信登录

4、qq登录

5、邮箱登录



二、总结资料上传

## 2022.05.28

### 实现InitializingBean作用

InitializingBean的作用是Bean注入到Spring容器且初始化后，执行特定业务化的操作。

Spring允许容器中的Bean，在Bean初始化完成后或者Bean销毁前，执行特定业务化的操作，

常用的实现方式有以下三种：

- 通过实现InitializingBean/DisposableBean接口来处理初始化后/销毁前的操作；

- 通过标签的init-method/destroy-method属性处理初始化后/销毁前的操作；

- 在指定方法上加上@PostConstruct或@PreDestroy注解来处理初始化后/销毁前的操作。

  

```
实现InitializingBean作用

InitializingBean的作用是Bean注入到Spring容器且初始化后，执行特定业务化的操作。

Spring允许容器中的Bean，在Bean初始化完成后或者Bean销毁前，执行特定业务化的操作，

常用的实现方式有以下三种：

- 通过实现InitializingBean/DisposableBean接口来处理初始化后/销毁前的操作；
- 通过标签的init-method/destroy-method属性处理初始化后/销毁前的操作；
- 在指定方法上加上@PostConstruct或@PreDestroy注解来处理初始化后/销毁前的操作。

@RequestMapping()可选参数

1、 value， method；
value： 指定请求的实际地址，指定的地址可以是URI Template 模式（后面将会说明）；
method： 指定请求的method类型， GET、POST、PUT、DELETE等；

2、 consumes，produces；
consumes： 指定处理请求的提交内容类型（Content-Type），例如application/json, text/html;
produces: 指定返回的内容类型，仅当request请求头中的(Accept)类型中包含该指定类型才返回；

3、 params，headers；
params： 指定request中必须包含某些参数值是，才让该方法处理。
headers： 指定request中必须包含某些指定的header值，才能让该方法处理请求。
```

