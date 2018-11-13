

### 事务简介

+ 事务是要正确执行的一系列的操作(或动作)，使得数据库从一种状态转换成另一种状态，且保证操作全部成功，或者全部失败
+ 事务原则是什么
  - 事务必须服从ISO/IEC所制定的ACID原则
  - ACID原则的具体内涵如下
    - 原子性(Atomicity):即不可分割性，事务要么全部被执行，要么就全部不被执行
    - 一致性(Consistency):事务的执行使得数据库从一种正确状态转换成另一种正确状态
    - 隔离性(Isolation):在事务正确提交之前，它可能的结果不应显示给任何其他事务
    - 持久性(Durability):事务正确提交后，其结果将永久保存在数据库中

### Java事务

+ Java事务的产生
  - 程序操作数据库的需要。在Java编写的程序或系统中，实现的ACID的操作
+ Java事务的范围
  - 通过JDBC相应方法简介来实现对数据库的增删改查，把事务转移到java程序代码中进行控制
  - 确保事务要么全部执行成功，要么撤销不执行
+ 总结
  - Java事务机制和原理就是确保数据库操作的ACID特性

### Java事务实现模式

+ Java事务的实现
  - 通过java代码来实现对数据库的事务性操作
+ java事务类型
  - JDBC事务：用Connection对象控制，包括手动模式和自动模式
  - JTA(Java Transacation API)事务：与实现无关的，与协议无关的API
  - 容器事务：应用服务器提供的，且大多是基于JTA完成(通常基于JNDI的，相当复杂的API实现)

### 三种事务的差异

+ JDBC事务：控制的局限性在一个数据库连接内，但是其使用简单
+ JTA事务：功能强大，可跨越多个数据库或多DAO，使用比较复杂
+ 容器事务：主要指的是J2EE应用服务器提供的事务管理，局限于EJB

### Spring事务核心接口

- ![事务接口架构](http://a3.qpic.cn/psb?/V11ree7s3wel2Y/mXQeD0ySSnjsvaUP4tXoKD5pU2FbpOzbcp.b14zqsk0!/m/dEYBAAAAAAAAnull&bo=WgbCAgAAAAADB74!&rf=photolist&t=5)

### Spring事务管理器

+ JDBC事务管理器(DataSourceTransactionManager)
  - 本事务管理器是通过调用java.sql.Connection来管理事务
  - Spring配置示例
+ Hibernate事务管理器(HibernateTransacationManager)
  - 本管理器将事务管理的职责委托给`org.hibernate.Transacation`对象来管理事务，而后者是从`Hibernate Session`中获取到的。
  - Spring配置方式
+ JPA事务管理器(JpaTransactionManager)
  - 通过一个JPA实体管理工厂(`javax.persistence.EntityManagerFactory`接口的任意实现)将与由工厂所产生的JPA EntityManager合体来构建事务
+ JTA事务管理器(JtaTransactionManager)
  - 本管理器将事务管理的责任委托给`javax.transaction.UserTransaction`和`javax.transaction.TransactionManager`对象进行事务管理

### 数据读取类型说明

+ 脏读
  - 事务没提交，提前读取
+ 不可重复读
  - 两次读取的数据不一致
+ 幻读
  - 事务不是独立执行时发生的一种非预期现象

### 事务隔离级别

+ 隔离级别定义了一个事务可能受其他并发事务影响的程度
+ ![](http://a1.qpic.cn/psb?/V11ree7s3wel2Y/x9q4P4uroWcEN2b3RZdubytcvJ6pX13Lh4GbA7fbRco!/c/dFQBAAAAAAAA&ek=1&kp=1&pt=0&bo=JAW8AQAAAAADJ54!&tl=1&vuin=3481376519&tm=1542070800&sce=60-2-2&rf=0-0)

### 事务传播行为

+ 当事务方法被另一个事务方法调用时，必须指定事务应该如何传播
+ Spring的7中传播行为:
  - ![](http://a3.qpic.cn/psb?/V11ree7s3wel2Y/S0WLjdJwAWNSnh98aId7kKXLP3V1JLAhmTMYxn*RNxg!/c/dDYBAAAAAAAA&ek=1&kp=1&pt=0&bo=SQVJAgAAAAADR2U!&tl=1&vuin=3481376519&tm=1542074400&sce=60-2-2&rf=0-0)

### 事务是否只读

+ 事务是否只读
  - 利用数据库事务的“只读”属性，进行特定优化处理
+ 设置“只读”注意：
  - 事务的是否“只读”属性，不同的数据库厂商支持不同
  - 通常而言：只读属性的应用要参考厂商的具体支持说明

### 事务超时

+ 事务超时
  - 事务超时就是事务的一个定时器，在特定时间内事务如果没有执行完毕，那么就会自动回滚，而不是一直等待其结束
+ 设计事务时注意点
  - 为了使应用程序很好地运行，事务不能运行太长的时间。因为事务可能设计对后端数据库的锁定，所以长时间的事务会不必要的占用数据库资源

### 事务回滚

+ 事务回滚
  - 默认情况下，事务只有遇到运行期异常时才会回滚，而在遇到检查型异常时不会回滚
+ 自定义回滚策略
  - 声明事务在遇到特定的检查型异常时像遇到运行期异常那样回滚
  - 声明事务遇到特定的异常不回滚，即使这些异常是运行期异常

### Spring事务状态

+ 事务接口

  - 通过事务管理器获取TransationStatus实例

  - 控制事务在回滚或提交的时候需要应用相应的事务状态

  - Spring事务接口

    - ```java
      public interface TransactonStatus{
          boolean isNewwTransaction(): //是否是新的事务
          boolean hasSavepoint(); //是否有恢复点
          void setRollbackOnly(); //设置为只回滚
          boolean isRollbackOnly(); //是否为只回滚
          boolean isCompleted ; //是否已完成
      }
      ```

----

### 编程式事务管理

#### 编程式事务实现方式

+ 事务管理器(PlatformTransactionManager)方式
  - 类似应用JTA UserTransaction API方式，但异常处理更简洁;
  - 核心类为：Spring事务管理的三个接口类以及JdbcTemplate类
+ 模板事务(TransactionTemplate)的方式
  - 此为Spring官方团队推荐的编程式事务管理的方式
  - 主要工具为JdbcTemplate类

