### AspectJ简介

+ AspectJ是一个基于Java语言的AOP框架

+ Spring2.0以后新增了对AspectJ切点表达式支持

+ @AspectJ是AspectJ1.5新增功能，通过JDK5注解技术，允许直接在Bean类中定义切面

+ 新版本Spring框架，建议使用AspectJ方式来开发AOP

+ 使用AspectJ需要导入Spring AOP和AspectJ相关jar包

  - `spring-aop-4.2.4.RELEASE.jar`

  - `com.springsource.org.aopalliance-1.0.0.jar`

  - `spring-aspects-4.2.4.RELEASE.jar`

  - `com.springsource.org.aspectj.weaver-1.6.8.RELEASE.jar`

  - ```xml
    <dependency>
          <groupId>org.springframework</groupId>
          <artifactId>spring-beans</artifactId>
          <version>4.2.4.RELEASE</version>
        </dependency>
        <dependency>
          <groupId>org.springframework</groupId>
          <artifactId>spring-expression</artifactId>
          <version>4.2.4.RELEASE</version>
        </dependency>
        <dependency>
          <groupId>org.springframework</groupId>
          <artifactId>spring-core</artifactId>
          <version>4.2.4.RELEASE</version>
        </dependency>
        <dependency>
          <groupId>org.springframework</groupId>
          <artifactId>spring-context</artifactId>
          <version>4.2.4.RELEASE</version>
        </dependency>
        <dependency>
          <groupId>aopalliance</groupId>
          <artifactId>aopalliance</artifactId>
          <version>1.0</version>
        </dependency>
        <dependency>
          <groupId>org.springframework</groupId>
          <artifactId>spring-aop</artifactId>
          <version>4.2.4.RELEASE</version>
        </dependency>
        <!-- https://mvnrepository.com/artifact/org.aspectj/aspectjweaver -->
        <dependency>
          <groupId>org.aspectj</groupId>
          <artifactId>aspectjweaver</artifactId>
          <version>1.8.9</version>
        </dependency>
        <!-- https://mvnrepository.com/artifact/org.springframework/spring-aspects -->
        <dependency>
          <groupId>org.springframework</groupId>
          <artifactId>spring-aspects</artifactId>
          <version>4.2.4.RELEASE</version>
        </dependency>
    
        <dependency>
          <groupId>org.springframework</groupId>
          <artifactId>spring-test</artifactId>
          <version>4.2.4.RELEASE</version>
        </dependency>
    ```

----

### @AspectJ提供不同的通知类型(基于注解方式)

+ [MyAspectAnno类]()

+ `@Before`：前置通知，相当于BeforeAdvice

  - 可以再方法中传入JoinPoint对象，用来获得切点信息

  - ```java
     @Before(value = "execution(* com.hn.aspectJ.demo1.ProductDao.save(..))")
        public void before(JoinPoint joinPoint){
            System.out.println("前置通知============="+ joinPoint);
        }
    ```

+ `@AfterReturning`：后置通知，相当于AfterReturningAdvice

  - 通过returning属性，可以定义方法返回值，作为参数

  - ```java
     @AfterReturning(value = "execution(* com.hn.aspectJ.demo1.ProductDao.update(..))",returning = "result")
        public void afterReturing(Object result){
            System.out.println("后置通知==============="+result);
        }
    ```

+ `@Around`：环绕通知，相当于MethodInterceptor

  - around方法的返回值就是目标代理方法执行返回值

  - 参数为`ProceedingJoinPoint`可以调用拦截目标方法执行

  - ```java
     @Around(value = "execution(* com.hn.aspectJ.demo1.ProductDao.delete(..))")
        public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
    
            System.out.println("环绕前通知==========");
            Object object = joinPoint.proceed();//执行目标方法
            System.out.println("环绕后通知==========");
    
            return object;
        }
    ```

  - 如果不调用`ProceedingJoinPoint`的`proceed`方法，那么目标方法就被拦截了

+ `@AfterThrowing`：异常抛出通知，相当于ThrowAdvice

  - 通过设置throwing属性，可以设置发生异常对象参数

  - ```java
    @AfterThrowing(value = "execution(* com.hn.aspectJ.demo1.ProductDao.findOne(..))",throwing = "e")
        public void afterThrowing(Throwable e){
            System.out.println("异常抛出通知==========="+e.getMessage());
        }
    ```

  - 不发生异常不会抛出通知

+ `@After`：最终final通知，不管是否异常，该通知都会执行

  - 无论是否出现异常，最终通知总是会被执行的

  - ```java
    @After(value = "execution(* com.hn.aspectJ.demo1.ProductDao.findAll(..))")
        public void after(){
            System.out.println("最终通知=======");
        }
    ```

+ `@DeclareParents`：引介通知，相当于IntroductionInterceptor(不要求掌握)

### 在通知中通过value属性定义切点

+ 通过execution函数，可以定义切点的方法切入
+ 语法：
  - execution(<访问修饰符>?<返 回类型><方法名>(<参数>)<异常>)
+ 例如![](http://a4.qpic.cn/psb?/V11ree7s3wel2Y/yWzQ2vuX16Pe41Qc42.HuOxoOA0ZnWslIJMv5yUXvZM!/c/dFMBAAAAAAAA&ek=1&kp=1&pt=0&bo=FgWgAQAAAAADJ7A!&tl=1&vuin=3481376519&tm=1541840400&sce=60-2-2&rf=0-0)

### 通过@Pointcut为切点命名

+ 在每个通知内定义切点，会造成工作量大，不易维护，对于重复的切点，可以使用@Pointcut进行定义
+ 切点方法:`private void  无参数方法`，方法名为切点名
+ 当通知多个切点时，可以使用`||`进行连接

-----

### 基于AspectJ的XML方式的AOP开发

[demo2]()

```xml
<?xml version="1.0" encoding="UTF-8"?>
<beans xmlns="http://www.springframework.org/schema/beans"
       xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
       xmlns:aop="http://www.springframework.org/schema/aop"
       xsi:schemaLocation="http://www.springframework.org/schema/beans
      http://www.springframework.org/schema/beans/spring-beans.xsd
      http://www.springframework.org/schema/aop
      http://www.springframework.org/schema/aop/spring-aop.xsd">

    <!--XML的配置方式完成AOP的开发===========-->
    <!--配置目标类-->
    <bean id="customerDao" class="com.hn.aspectJ.demo2.CustomerDaoImpl"/>

    <!--配置切面类-->
    <bean id="myAspectXml" class="com.hn.aspectJ.demo2.MyAspectXml"/>

    <!--AOP的相关配置-->
    <aop:config>
        <!--配置切入点-->
        <aop:pointcut id="pointcut1" expression="execution(* com.hn.aspectJ.demo2.CustomerDao.save(..))"/>
        <aop:pointcut id="pointcut2" expression="execution(* com.hn.aspectJ.demo2.CustomerDao.update(..))"/>
        <aop:pointcut id="pointcut3" expression="execution(* com.hn.aspectJ.demo2.CustomerDao.delete(..))"/>
        <aop:pointcut id="pointcut4" expression="execution(* com.hn.aspectJ.demo2.CustomerDao.findOne(..))"/>
        <aop:pointcut id="pointcut5" expression="execution(* com.hn.aspectJ.demo2.CustomerDao.findAll(..))"/>
        <!--配置AOP的切面-->
        <aop:aspect ref="myAspectXml">
            <!--配置前置通知-->
            <aop:before method="before" pointcut-ref="pointcut1"/>
            <!--配置后置通知-->
            <aop:after-returning method="afterReturing" pointcut-ref="pointcut2" returning="result"/>
            <!--配置环绕通知-->
            <aop:around method="around" pointcut-ref="pointcut3" />
            <!--异常抛出通知-->
            <aop:after-throwing method="afterThrowing" pointcut-ref="pointcut4" throwing="e"/>
            <!--最终通知-->
            <aop:after method="after" pointcut-ref="pointcut5"/>
        </aop:aspect>
    </aop:config>

</beans>
```



