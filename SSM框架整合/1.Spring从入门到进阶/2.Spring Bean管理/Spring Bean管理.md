##Spring的Bean管理（XML方式）

- 三种实例化Bean的方式
  - 使用类构造器实例化(默认无参数)
  - 使用静态工厂方法实例化(简单工厂模式)
  - 使用实例工厂方法实例化(工厂方法模式)

### Bean的配置

+ id和name
  - 一般情况下，装配一个Bean时，通过指定一个id属性作为Bean的名称
  - id属性在IOC容器中必须是唯一的
  - 如果Bean的名称中含有特殊字符，就必须使用name属性
  - id不能带有特殊字符
+ class
  - class用于设置一个类的完全路径名称，主要作用是IOC容器生成类的实例
+ scope属性
  - ![](http://a4.qpic.cn/psb?/V11ree7s3wel2Y/zm4XRqERsVJLGgITB3v8C9GOsv8nhUtrof.aqy0o53Y!/c/dFMBAAAAAAAA&ek=1&kp=1&pt=0&bo=OAV5AgAAAAADN1Q!&tl=1&vuin=3481376519&tm=1541743200&sce=60-2-2&rf=0-0)

### Spring容器中Bean的生命周期

Spring初始化bean或销毁bean时，有时需要做一些处理工作，因此spring可以在创建和销毁bean的时候调用bean的两个生命周期方法。

+ 当bean被载入到容器的时候调用init
+ 当bean从容器中删除的时候调用destroy(scope=singletion有效)
+ 完整的生命周期

1. instantiate bean对象实例化
2. propulate properties 封装属性
3. 如果Bean实现BeanNameAware 执行setBeanName
4. 如果Bean实现BeanFactoryAware 或者ApplicationContextAware 设置工厂setBeanFactroy 或者上下文对象setApplicationContext
5. 如果存在类实现BeanPostProcessor(后处理Bean)，执行postProcessBeforeInitialization
6. 如果Bean实现InitializingBean执行afterPropertiesSet
7. 调用`<bean init-method="init">` 指定初始化方法init
8. 如果存在类实现BeanPostProcessor(处理Bean)，执行postProcessAfterInitialization
9. 执行业务处理
10. 如果Bean实现DisposableBean执行destroy
11. 调用`<bean destroy-method ="customerDestroy">`指定销毁方法customerDestroy

### Spring的属性注入

+ 对于类成员变量，注入方式有三种

  - **构造函数注入**

    - 通过构造方法注入Bean的属性值或依赖的对象，它保证了Bean实例在实例化后就可以使用

    - 构造器注入在`<constructor-arg>`元素里声明的属性

    - ```xml
      <bean id="user" class="com.hn.ioc.demo4.User">
              <constructor-arg name="name" value="张三"/>
              <constructor-arg name="age" value="23"/>
          </bean>
      ```

  - **属性setter方法注入**

    - 使用set方法注入，在Spring配置文件中，通过`<property>`设置注入的属性

  - 接口注入

+ Spring支持前两种

+ p名称空间

  - 使用p命名空间

  - 为了简化XML文件配置，Spring从2.5开始引入一个新的p名称空间

  - `p:<属性名>=“xxx”`引入常量值

  - `p:<属性名>-ref="xxx"`引用其它Bean对象

  - ```xml
    <beans xmlns="http://www.springframework.org/schema/beans"
           xmlns:p="http://www.springframework.org/schema/p"
           xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
           xsi:schemaLocation="http://www.springframework.org/schema/beans http://www.springframework.org/schema/beans/spring-beans.xsd"> 
    <bean id="person" class="com.hn.ioc.demo4.Person" p:name="大黄" p:age="50" p:cat-ref="cat"/>
    
        <bean id="cat" class="com.hn.ioc.demo4.Cat" p:name="Tomcat233"/>
    ```

+ SpEL注入

  - SpEL:spring expression language , spring表达式语言，对依赖注入进行简化

  - 语法：`#{表达式}`

  - `<bean id="" value="#{表达式}">`

  - SpEL表达式语言

    - 语法:`#{}`

    - `#{ 'hello'}`:使用字符串

    - `#{beanId}`:使用另一个bean

    - `#{beanId.content.toUpperCase()}`：使用指定名属性，并使用方法

    - `#{T(java.lang.Math).PI}`:使用静态字段或方法

    - ```xml
       <bean id="category" class="com.hn.ioc.demo4.Category">
              <property name="name" value="#{'服装'}"/>
          </bean>
         
          <bean id="produceInfo" class="com.hn.ioc.demo4.ProdictInfo"/>
         
          <bean id="product" class="com.hn.ioc.demo4.Product">
              <property name="name" value="#{'男装'}"/>
              <property name="price" value="#{produceInfo.calculatePrice()}"/>
              <property name="category" value="#{category}"/>
          </bean>
       ```
      ```
    
      ```

+ 复杂类型的属性注入

  - 数组类型的属性注入

    - ```xml
      <property name="ars">
                  <list>
                      <value>aaa</value>
                      <value>bbb</value>
                      <value>ccc</value>
                      <value>ddd</value>
                  </list>
              </property>
      ```

  - List集合类型的属性注入

    - ```xml
      <property name="list">
                  <list>
                      <value>11</value>
                      <value>22</value>
                      <value>33</value>
                  </list>
              </property>
      ```

  - Set集合类型的属性注入

    - ```xml
      <property name="set">
                  <set>
                      <value>ddd</value>
                      <value>eee</value>
                      <value>fff</value>
                  </set>
              </property>
      ```

  - Map集合类型的属性注入

    - ```xml
      <property name="map">
                  <map>
                      <entry key="a" value="1111"></entry>
                      <entry key="b" value="222"></entry>
                      <entry key="c" value="333"></entry>
                  </map>
              </property>
      ```

  - Properties类型的属性注入

    - ```xml
       <property name="properties">
                  <props>
                      <prop key="username">root</prop>
                      <prop key="password">123456</prop>
                  </props>
              </property>
       ```

##Spring的Bean管理(注解方式)

### 使用注解定义Bean

+ Spring2.5引入使用注解定义Bean
  - @Component 描述Spring框架中的Bean
+ 除了@Component外，Spring提供了3个功能基本和@Component等效的注解
  - @Repository用于对DAO实现类进行标注
  - @Service用于对Service实现类进行标注
  - @Controller用于对Controller实现类进行标注
+ **这三个注解是为了让标注类本身的用途清晰，Spring在后续版本会对其增强**

### Spring的属性注入---注解方式

+ 普通属性值:@Value

+ 使用@Autowired进行自动注入

+ @Autowired默认按照类型进行注入

  - 如果存在两个相同Bean类型相同，则按照名称注入

+ @Autowired注入时可以针对成员变量或者set方法

+ 通过@Autowired的required属性，设置一定要找到匹配的Bean

+ 通过@Qualifier指定注入Bean的名称

+ 使用@Qualifier指定Bean名称后，注解Bean必须指定相同名称

+ Spring提供对JSR-250中定义@Resource标准注解的支持

+ @Resource和@Autowired注解功能相似

    ### Spring的其他注解

Spring初始化Bean或销毁Bean时，有时需要作一些处理工作，因此spring可以在创建和拆卸bean的时候调用bean的两个生命周期方法。

![](http://a4.qpic.cn/psb?/V11ree7s3wel2Y/i2jc4J06ExPiDJU6Q0fwi4fHTLNgBZQVh2wiEKNenaA!/c/dFMBAAAAAAAA&ek=1&kp=1&pt=0&bo=DwUlAgAAAAADJy8!&tl=1&vuin=3481376519&tm=1541764800&sce=60-2-2&rf=0-0)

### Bean的作用范围注解

+ 使用注解配置的Bean和`<bean>`配置的一样，默认作用范围都是singleton
+ @Scope注解用于指定Bean的作用范围

## 传统XML配置和注解配置混合使用

+ XML方式的优势
  - 结构清晰，易于阅读
+ 注解方式的优势
  - 开发便捷，属性注入方便，无须set方法
+ XML与注解的整合开发
  - 1.引入context命名空间
  - 2.在配置文件中添加context:annotation-cofig标签
  - `<context:annotation-config>`

