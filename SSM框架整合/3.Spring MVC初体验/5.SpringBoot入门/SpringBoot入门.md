### 什么是Spring Boot

让Spring应用开发变得“简单粗暴”

### Spring Boot核心特性

+ 极低的学习成本
+ 可独立运行的Spring项目
+ "习惯优于配置"，极大的提高了开发效率
+ 极简的组件依赖，自动发现和自动装配
+ 提供运行时的应用监控
+ 与分布式架构和云计算的天然集成 

### Spring Boot入口类

+ 入口类命名通常以*Application结尾。
+ 入口类上添加@SpringBootApplication注解
+ 利用SpringApplication.run()方法启动应用

### SpringBoot中的常用配置

![](http://a4.qpic.cn/psb?/V11ree7s3wel2Y/8iF9Dxs9R2kTagHuA5sgU*RIst3TO8nfYyEAvdKz71g!/c/dDcBAAAAAAAA&ek=1&kp=1&pt=0&bo=eQQxAgAAAAADF3w!&tl=1&vuin=3481376519&tm=1543197600&sce=60-2-2&rf=0-0)

### SpringBoot支持两种配置文件

+ 属性文件:application.properties
+ YAML格式：application.yml

### YML的语法

+ YAML是一种简洁的非标记语言。YAML以数据为中心，使用空白，缩进，分行组织数据，从而使得表示更加简洁易读
+ YAML语法格式
  - 标准格式：key:(空格)value
  - 使用空格表示层级关系，以`:`结束

### SpringBoot自定义配置项

+ SpringBoot允许我们自定义应用配置项，在程序运行时允许动态加载，这为程序提供了良好的可维护性
+ 在实际项目开发中，我们通常将项目的自定义信息放在配置文件中

### 环境配置文件

+ SpringBoot可针对不同的环境提供不同的Profile文件
+ Profile文件的默认命名格式为`application-{env}.yml`
+ 使用`spring.profiles.active`选项来指定不同的profile

### 打包和运行

+ 利用Maven的package命令，生成可独立运行的jar包
+ 利用java -jar xxx.jar命令启动Spring Boot应用
+ Jar包可自动加载同目录的application配置文件