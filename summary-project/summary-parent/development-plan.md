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



## 2022.06.01

```
1. 什么是SMTP？ 
	SMTP全称为Simple Mail Transfer Protocol（简单邮件传输协议），它是一组用于从源地址到目的地址传输邮件的规范，通过它来控制邮件的中转方式。SMTP认证要求必须提供账号和密码才能登陆服务器，其设计目的在于避免用户受到垃圾邮件的侵扰。
2. 什么是IMAP？ 
	IMAP全称为Internet Message Access Protocol（互联网邮件访问协议），IMAP允许从邮件服务器上获取邮件的信息、下载邮件等。IMAP与POP类似，都是一种邮件获取协议。
3. 什么是POP3？ 
	POP3全称为Post Office Protocol 3（邮局协议），POP3支持客户端远程管理服务器端的邮件。POP3常用于“离线”邮件处理，即允许客户端下载服务器邮件，然后服务器上的邮件将会被删除。目前很多POP3的邮件服务器只提供下载邮件功能，服务器本身并不删除邮件，这种属于改进版的POP3协议。
4. IMAP和POP3协议有什么不同呢？ 
	两者最大的区别在于，IMAP允许双向通信，即在客户端的操作会反馈到服务器上，例如在客户端收取邮件、标记已读等操作，服务器会跟着同步这些操作。而对于POP协议虽然也允许客户端下载服务器邮件，但是在客户端的操作并不会同步到服务器上面的，例如在客户端收取或标记已读邮件，服务器不会同步这些操作。
	
5. 邮件服务器就好像是互联网世界的邮局。按照功能划分，邮件服务器可以划分为两种类型：
	SMTP邮件服务器：用户替用户发送邮件和接收外面发送给本地用户的邮件。 POP3/IMAP邮件服务器：用户帮助用户读取SMTP邮件服务器接收进来的邮件。
```



