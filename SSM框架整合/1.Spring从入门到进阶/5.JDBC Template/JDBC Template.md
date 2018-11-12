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
  - [配置](https://github.com/ARainyNight/TheRoadOfBaldness/blob/master/SSM%E6%A1%86%E6%9E%B6%E6%95%B4%E5%90%88/1.Spring%E4%BB%8E%E5%85%A5%E9%97%A8%E5%88%B0%E8%BF%9B%E9%98%B6/5.JDBC%20Template/%E6%BA%90%E7%A0%81/sc/src/main/resources/spring.xml)

### JDBC Template基本使用

+ [Test.java](https://github.com/ARainyNight/TheRoadOfBaldness/blob/master/SSM%E6%A1%86%E6%9E%B6%E6%95%B4%E5%90%88/1.Spring%E4%BB%8E%E5%85%A5%E9%97%A8%E5%88%B0%E8%BF%9B%E9%98%B6/5.JDBC%20Template/%E6%BA%90%E7%A0%81/sc/src/test/java/Test.java)

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

+ 查询复杂对象(封装为实体对象)

  - RowMapper接口

  - 获取一个

    - ```java
      T queryForObject(String sql ,RowMapper<T> mapper)
      T queryForObject(String sql ,Object[] args ,RowMapper<T> mapper)
      T queryForObject(String sql ,RowMapper<T> mapper,Object...arg)
      ```

  - 获取多个

    - ```java
      List<T> query(String sql ,RowMapper<T> mapper)
      List<T> query(String sql ,Object[] args,RowMapper<T> mapper)
      List<T> query(String sql ,RowMapper<T> mapper,Object..arg)
      ```

### JDBC Template持久层示例

+ 实体类
+ DAO
  - 注入JdbcTemplate
  - 声明RowMapper
+ 优缺点分析
  - 优点
    - 简单
    - 灵活
  - 缺点
    - SQL与Java代码复杂
    - 功能不丰富

### 总结

+ 持久化操作特点
  - 必须
  - 机械性
+ ORM
  - 对象-关系映射
+ JDBC Template是Spring框架对JDBC操作的封装，简单、灵活但不够强大
+ 实际应用中还需要和其它ORM框架混合使用