JDBC的全称为:Java DataBase Connectivity(java数据库连接)

-----

+ 搭建开发环境

+ 编写程序，在程序中加载数据库驱动

+ 建立连接

+ 创建用于向数据库发送SQL的Statement对象

+ 从代表结果集的ResultSet中取出数据

+ 断开与数据库的连接，并释放相关资源

----

### JDBC的API

+ `DriverManager`:驱动管理类

  - 主要作用：

    - 注册驱动

      - 实际开发中注册驱动会使用如下的方式

      - ```java
           Class.forName("com.mysql.jdbc.Driver");
           ```
        ```
      
      - 因为之前的方式会导致驱动注册两次
        ```

    - 获得连接

      - ```java
          Connection conn = DriverManager.getConnection(String url,String username,String password);
          ```
        ```
      
      - `url`:`jdbc:mysql://localhost:3306/databaseName`
      
      - `username`:数据库用户名
      
      - `password`：密码
        ```

+ `Connection`:连接对象

  - 主要作用

    - 创建执行SQL语句的对象

      - ```java
          Statement createStatement()   //执行SQL语句,有SQL注入的漏洞存在
          ```

      - ```java
          PreparedStatement prepareStatement(String sql)   //预编译SQL语句，解决SQL注入的漏洞
          ```

      - ```java
          CallableStatement prepareCall(String sql)          //执行SQL中存储过程
          ```

    - 进行事务的管理

      - ```sql
          setAutoCommit(boolean autoCommit)          //设置事务是否自动提交
          ```

      - ```java
          commit()                 //事务提交
          ```

      - ```java
          rollback()              //事务回滚
          ```

+ `Statement`:执行SQL

   - 主要作用

     - 执行SQL语句

       - ```java
         boolean execute(String sql)          //执行SQL
         ```

       - ```java
         ResultSet executeQuery(String sql)     //执行SQL中的select语句
         ```

       - ```java
         int executeUpdate(String sql)          //执行SQL中的insert/update/delete语句
         ```

     - 执行批处理操作

       - ```java
         addBatch(String sql)               //添加到批处理
         ```

       - ```java
         executeBatch()                    //执行批处理
         ```

       - ```java
         clearBatch()                   //清空批处理
         ```

+ `ResultSet`:结果集

   - 结果集：其实就是查询语句(select)结果的封装

   - 结果集获取查询到的结果

   - 主要作用：

     - ```java
       next()                 
       ```

     - 针对不同类型的数据，可以使用getXX()获取数据，通用的获取数据方法`getObject()`

--------

### JDBC的资源释放

+ JDBC程序运行完后，切记要释放程序在运行过程中，创建的那些与数据库进行交互的对象，这些对象通常是ResultSet,Statement和Connection对象
+ 特别是Connection对象，它是非常稀有的资源，用完后必须马上释放，如果Connection不能及时、正确的关闭，极易导致系统宕(dang)机，Connection的使用原则是尽量晚创建，早释放

----

### JDBC的CRUD操作

+ 向数据库中保存记录

  - ```java
         String sql = "insert into goods(name,price,desp) values('耳机',200.0,'蓝牙耳机')";
                  int i = stmt.executeUpdate(sql);
                  if (i >0 ){
                      System.out.println("插入成功");
                  }
     ```
    ```
  
    ```

+ 修改数据库中的记录

  - ```java
       String sql = "update goods set desp='冷暖空调' where id =4";
                  int i = stmt.executeUpdate(sql);
                  if (i >0 ){
                      System.out.println("修改成功");
                  }
       ```
    ```
  
    ```

+ 删除数据库中的记录

  - ```java
      String sql = "delete from user where uid =4 ";
                int i = stmt.executeUpdate(sql);
                if (i>0){
                    System.out.println("删除成功");
                }
      ```

+ 查询数据库中的记录

  

------

### JDBC的工具类的抽取

+ 为了简化JDBC的开发，可以将一些重复的代码进行抽取
  - [JDBCUtils]()
  - [jdbc.properties]()

-----

### JDBC的SQL注入漏洞

