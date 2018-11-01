[TOC]

##Spring的概述

### 什么是Spring

+ Spring是一个开发源代码的设计层面框架，他解决的是业务逻辑层和其他各层的松耦合问题，因此它将面向借口的编程思想贯穿整个系统应用。
+ Spring为简化企业级应用开发而生，使用Spring可以使简单的JavaBean实现以前只有EJB才能实现的功能。
+ Spring是一个分层的JavaSE/EE**full-stack(一站式)**[轻量级](https://baike.baidu.com/item/%E8%BD%BB%E9%87%8F%E7%BA%A7/10002835)开源框架。

### Spring的优点

+ 方便解耦，简化开发
  - Spring就是一个大工厂，可以将所有对象创建和依赖关系维护，交给Spring管理
+ AOP编程的支持
  - Spring提供面向切面编程，可以方便的实现对程序进行权限拦截、运行监控等功能
+ 声明式事物的支持
  - 只需要通过配置就可以完成对事务的管理，而无需手动编程
+ 方便程序的测试
  - Spring对Junit4支持，可以通过注解方便的测试Spring程序
+ 方便集成各种优秀框架
  - Spring不排斥各种优秀的开源框架，其内部提供了对各种优秀框架（如:Struts、Hibernate、Mybatis等）的直接支持
+ 降低JavaEE API的使用难度
  - Spring对JavaEE开发中非常难用的一些API（JDBC、JavaMail、远程调用等），都提供了封装，使这些API应用难度大大降低

----

### Spring IOC的快速入门案例

+ [下载](https://repo.spring.io/libs-release-local/org/springframework/spring/)Spring开发包
+ 复制Spring开发jar包到工程
+ 理解IOC控制反转和DI依赖注入
+ 编写Spring核心配置文件
+ 在程序中读取Spring配置文件，通过Spring框架获得Bean，完成相应操作

---

### IOC和DI的概念

+ **IOC** Inverse of Control 反转控制的概念，就是将原本在程序中手动创建的UserService对象的控制权，交由Spring框架管理

+ 简单说，就是创建UserService对象控制权被反转到了Spring框架

+ **DI** Dependency Injection 依赖注入的概念，就是在Spring创建这个对象的过程中，将这个对象所依赖的属性注入进去

  