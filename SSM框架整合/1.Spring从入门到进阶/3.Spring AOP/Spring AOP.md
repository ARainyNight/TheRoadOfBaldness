### 什么是AOP

+ 在软件业，AOP为Aspect Oriented Programming的缩写，意为：[面向切面编程](https://baike.baidu.com/item/%E9%9D%A2%E5%90%91%E5%88%87%E9%9D%A2%E7%BC%96%E7%A8%8B/6016335)，通过[预编译](https://baike.baidu.com/item/%E9%A2%84%E7%BC%96%E8%AF%91/3191547)方式和运行期动态代理实现程序功能的统一维护的一种技术。AOP是[OOP](https://baike.baidu.com/item/OOP)的延续，是软件开发中的一个热点，也是[Spring](https://baike.baidu.com/item/Spring)框架中的一个重要内容，是[函数式编程](https://baike.baidu.com/item/%E5%87%BD%E6%95%B0%E5%BC%8F%E7%BC%96%E7%A8%8B/4035031)的一种衍生范型。利用AOP可以对业务逻辑的各个部分进行隔离，从而使得业务逻辑各部分之间的[耦合度](https://baike.baidu.com/item/%E8%80%A6%E5%90%88%E5%BA%A6/2603938)降低，提高程序的可重用性，同时提高了开发的效率。 
+ AOP采取横向抽取机制，取代了传统纵向继承体系重复性代码（性能监视、事务管理、安全检查、缓存）
+ Spring AOP使用纯java实现，不需要专门的编译过程和类加载器，在运行期通过代理方式向目标类织入增强代码

----

### AOP相关术语

+ Joinpoint(连接点)：所谓连接点是指那些被拦截到的点。在Spring中，这些点指的是方法，因为Spring只支持方法类型的连接点
+ Pointcut(切入点)：所谓切入点是指我们要对哪些Joinpoint进行拦截的定义
+ Advice(通知/增强)：所谓通知是指拦截到Joinpoint之后所要做的事情就是通知。通知分为前置通知，后置通知，异常通知，最终通知，环绕通知(切面要完成的功能)
+ Introduction(引介):引介是一种特殊的通知，在不修改类代码的前提下，Introduction可以在运行期为类动态地添加一些方法或Field
+ Target(目标对象)：代理的目标对象
+ Weaving(织入)：是指把增强应用到目标对象来创建新的代理对象的过程。spring采用动态代理织入，而AspectJ采用编译器织入和类装载期织入
+ Proxy(代理)：一个类被AOP织入增强后，就产生一个结果代理类
+ Aspect(切面)：是切入点和通知(引介)的结合

---

### JDK动态代理

+ [demo1](https://github.com/ARainyNight/TheRoadOfBaldness/tree/master/SSM%E6%A1%86%E6%9E%B6%E6%95%B4%E5%90%88/1.Spring%E4%BB%8E%E5%85%A5%E9%97%A8%E5%88%B0%E8%BF%9B%E9%98%B6/3.Spring%20AOP/%E6%BA%90%E7%A0%81/spring_aop/src/main/java/com/hn/aop/demo1)

```java
/***
 *  ClassName : MyJdkProxy
 *  Author    : lin
 *  Date      : 2018/11/10 11:16    
 *  Remark    : 我的JDK动态代理
 */

public class MyJdkProxy implements InvocationHandler {

    private UserDao userDao;

    public MyJdkProxy(UserDao userDao){
        this.userDao = userDao;
    }

    public Object createProxy(){

        Object proxy = Proxy.newProxyInstance(userDao.getClass().getClassLoader(),userDao.getClass().getInterfaces(),this);
        return proxy;
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        if ("save".equals(method.getName())){
            System.out.println("权限校验============");
            return method.invoke(userDao,args);
        }

        return method.invoke(userDao,args);
    }
}

```

---

### 使用CGLIB生成代理

+ 对于不使用接口的业务类，无法使用JDK动态代理

+ CGlib采用非常底层字节码技术，可以为一个类创建子类，解决无接口代理问题

+ [demo2](https://github.com/ARainyNight/TheRoadOfBaldness/tree/master/SSM%E6%A1%86%E6%9E%B6%E6%95%B4%E5%90%88/1.Spring%E4%BB%8E%E5%85%A5%E9%97%A8%E5%88%B0%E8%BF%9B%E9%98%B6/3.Spring%20AOP/%E6%BA%90%E7%A0%81/spring_aop/src/main/java/com/hn/aop/demo2)

+ ```java
  /***
   *  ClassName : MyCglibProxy
   *  Author    : lin
   *  Date      : 2018/11/10 11:28    
   *  Remark    : CGLIB生成代理
   */
  
  public class MyCglibProxy implements MethodInterceptor {
  
      private ProductDao productDao ;
  
      public MyCglibProxy(ProductDao productDao){
          this.productDao = productDao;
      }
  
      public Object createProxy(){
          //1.创建核心类
          Enhancer enhancer = new Enhancer();
  
          //2.设置父类
  
          enhancer.setSuperclass(productDao.getClass());
  
          //3.设置回调
          enhancer.setCallback(this);
  
          //4.生成代理
          Object proxy = enhancer.create();
  
          return proxy;
      }
  
      public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
  
          if ("save".equals(method.getName())){
              System.out.println("权限校验=====");
              return methodProxy.invokeSuper(o,objects);
          }
  
          return methodProxy.invokeSuper(o,objects);
      }
  }
  
  ```

---

### 代理知识总结

+ Spring在运行期，生成动态代理对象，不需要特殊的编译器
+ Spring AOP的底层就是通过JDK动态代理或CGLib动态代理技术，为目标Bean执行横向织入
  - 若目标对象实现了若干接口，spring使用JDK的`java.lang.reflect.Proxy`类代理
  - 若目标对象没有实现任何接口，spring使用CGLIB库生成目标对象的子类。
+ 程序中应优先对接口创建代理，便于程序解耦维护
+ 标记为final的方法，不能被代理，因为无法进行覆盖
  - JDK动态代理，是针对接口生成子类，接口中方法**不能使用final修饰**
  - CGLib是针对目标类生产子类，因此类或方法**不能使用final修饰**
+ Spring只支持方法连接点，不提供属性连接

---

### Spring AOP增强类型

+ AOP联盟为通知Advice定义了`org.aopalliance.aop.Interface.Advice`
+ Spring按照通知Advice在目标类方法的连接点位置，可以分为5类
  - 前置通知 `org.springframework.aop.MethodBeforeAdvice`
    - 在目标方法执行前实施增强
    - [demo3](https://github.com/ARainyNight/TheRoadOfBaldness/tree/master/SSM%E6%A1%86%E6%9E%B6%E6%95%B4%E5%90%88/1.Spring%E4%BB%8E%E5%85%A5%E9%97%A8%E5%88%B0%E8%BF%9B%E9%98%B6/3.Spring%20AOP/%E6%BA%90%E7%A0%81/spring_aop/src/main/java/com/hn/aop/demo3)
  - 后置通知 `org.springframework.aop.AfterReturningAdvice`
    - 在目标方法执行后实施增强
  - 环绕通知 `org.aopalliance.intercept.MethodInterceptor`
    - 在目标方法执行前后实施增强
    - [demo4](https://github.com/ARainyNight/TheRoadOfBaldness/tree/master/SSM%E6%A1%86%E6%9E%B6%E6%95%B4%E5%90%88/1.Spring%E4%BB%8E%E5%85%A5%E9%97%A8%E5%88%B0%E8%BF%9B%E9%98%B6/3.Spring%20AOP/%E6%BA%90%E7%A0%81/spring_aop/src/main/java/com/hn/aop/demo4)
  - 异常抛出通知 `org.springframework.aop.ThrowsAdvice`
    - 在方法抛出异常后实施增强
  - <font color=#dc143c>引介通知 `org.springframework.aop.IntroductionInterceptor`</font>
    - <font color=#dc143c>在目标类中添加一些新的方法和属性</font>

----

### Spring AOP切面类型

+ Advisor:代表一般切面，Advice本身就是一个切面，对目标类所有方法进行拦截
+ PointcutAdvisor:代表具有切点的切面，可以指定拦截目标类哪些方法
+ IntroductionAdvisor:代表引介切面，针对引介通知而使用切面（不要求掌握）

---

### Advisor切面案例

+ `ProxyFactoryBean`常用可配置属性

  - `target`:代理的目标对象

  - `proxyInterfaces`:代理要实现的接口

    - 如果多个接口可以使用以下格式赋值

      - ```xml
        <list>
        		<value></value>
                 .......
        </list>
        ```

  - `proxyTargetClass`:是否对类代理而不是接口，设置为ture时，使用CGLib代理

  - `interceptorNames`:需要织入目标的Advice

  - `singleton`:返回代理是否为单实例，默认为单例

  - `optimize`:当设置为true时，强制使用CGLib

---

### PointcutAdvisor切点切面

+ 使用普通Advice作为切面，将对目标类所有方法进行拦截，不够灵活，在实际开发中常采用**带有切点的切面**

+ 常用`PointcutAdvisor`实现类

  - `DefaultPointcutAdvisor`最常用的切面类型，它可以通过任意Pointcut和Advice组合定义切面

  - `JdkRegexpMethodPointcut`构造正则表达式切点

----

### 自动创建代理

+ 每个代理都是通过ProxyFactoryBean织入前面代理，在实际开发中，非常多的Bean每个都配置ProxyFactoryBean开发维护量巨大
+ 解决方案：自动创建代理
  - `BeanNameAutoProxyCreator`:根据Bean名称创建代理
    - [demo5](https://github.com/ARainyNight/TheRoadOfBaldness/tree/master/SSM%E6%A1%86%E6%9E%B6%E6%95%B4%E5%90%88/1.Spring%E4%BB%8E%E5%85%A5%E9%97%A8%E5%88%B0%E8%BF%9B%E9%98%B6/3.Spring%20AOP/%E6%BA%90%E7%A0%81/spring_aop/src/main/java/com/hn/aop/demo5)
  - `DefaultAdvisorAtuoPeoxyCreator`：根据Advisor本身包含的信息创建代理
    - [demo6](https://github.com/ARainyNight/TheRoadOfBaldness/tree/master/SSM%E6%A1%86%E6%9E%B6%E6%95%B4%E5%90%88/1.Spring%E4%BB%8E%E5%85%A5%E9%97%A8%E5%88%B0%E8%BF%9B%E9%98%B6/3.Spring%20AOP/%E6%BA%90%E7%A0%81/spring_aop/src/main/java/com/hn/aop/demo6)
  - `AnnotationAwareAspectJAutoProxyCreator`:基于Bean中的AspectJ注解进行自动代理

  



