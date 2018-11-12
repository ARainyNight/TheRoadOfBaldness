### Spring JDBC Template 

+ 为了简化持久化操作，Spring在JDBC API之上提供了JDBC Template组件
+ JDBC Template提供统一的模板方法，在保留代码灵活性的基础上，尽量减少持久化代码

### 创建项目

+ Maven

  - Mysql驱动

  - Spring组件(core、beans、context、aop)

  - JDBC Template(jdbc、tx)

  - ```xml
    <dependencies>
            <!-- https://mvnrepository.com/artifact/mysql/mysql-connector-java -->
            <dependency>
                <groupId>mysql</groupId>
                <artifactId>mysql-connector-java</artifactId>
                <version>5.1.46</version>
            </dependency>
            <dependency>
                <groupId>org.springframework</groupId>
                <artifactId>spring-core</artifactId>
                <version>4.2.4.RELEASE</version>
            </dependency>
            <dependency>
                <groupId>org.springframework</groupId>
                <artifactId>spring-beans</artifactId>
                <version>4.2.4.RELEASE</version>
            </dependency>
            <dependency>
                <groupId>org.springframework</groupId>
                <artifactId>spring-context</artifactId>
                <version>4.2.4.RELEASE</version>
            </dependency>
            <dependency>
                <groupId>org.springframework</groupId>
                <artifactId>spring-aop</artifactId>
                <version>4.2.4.RELEASE</version>
            </dependency>
            <dependency>
                <groupId>org.springframework</groupId>
                <artifactId>spring-jdbc</artifactId>
                <version>4.2.4.RELEASE</version>
            </dependency>
            <dependency>
                <groupId>org.springframework</groupId>
                <artifactId>spring-tx</artifactId>
                <version>4.2.4.RELEASE</version>
            </dependency>
        </dependencies>
    ```

+ Spring配置

  - 数据源
  - JDBC Template
  - [配置]()

### JDBC Template基本使用

+ update方法

  - 对数据进行增删改操作

  - ```java
    int update(String sql , Object[] args)
    int update(String sql , Object.. agrs)
    ```

+ batachUpdate方法

  - 批量增删改操作

  - ```java
    int [] batchUpdate(String[] sql)
    int [] batchUpdate(String sql , List<Object[]> args)
    ```

+ 查询简单数据项

  - 获取一个

    - ```java
      T queryForObject(String sql ,Class<T> type)
      T queryForObject(String sql ,Object[] args ,Class<T> type)
      T queryForObject(String sql ,Class<T> type ,Object...arg)
      ```

  - 获取多个

    - ```java
      List<T> queryForList(String sql, Class<T> type)
      List<T> queryForList(String sql , Object[] args ,Class<T> type)
      List<T> queryForList(String sql , Class<T> type ,Object... arg)
      ```

+ 查询复杂对象(封装为Map)

  - 获取一个

    - ```java
      Map queryForMap(String sql)
      Map queryForMap(String sql , Object[] args)
      Map queryForMap(String sql , Object...args)
      ```

  - 获取多个

    - ```java
      List<Map<String ,Object>> queryForList(String sql)
      List<Map<String ,Object>> queryForList(String sql , Object[] args)
      List<Map<String ,Object>> queryForList(String sql , Object...arg)
      ```

  