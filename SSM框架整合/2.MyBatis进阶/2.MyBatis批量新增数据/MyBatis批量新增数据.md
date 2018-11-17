### 使用传统JDBC进行数据的插入

+ JDBC批量插入方法
  - Java代码中使用For循环直接插入SQL数据
  - 借助Statement、Prestatement对象的批处理方法addBatch
+ 总结
  - 传统的利用for循环进行插入，这种方式存在严重效率问题，需要频繁获取session，获取连接
  - 使用批处理，代码和SQL的耦合，代码量较大

### MyBatis对于批量插入的支持

+ 借助foreach标签使用 `insert into table values()`

+ 借助MySQL数据库连接属性`allowMultiQueries=true`

+ ```xml
   <insert id="addPersons">
          insert into person(username,email,gender) values
          <foreach collection="persons" item="person" separator=",">
              (#{person.username},#{person.email},#{person.gender})
          </foreach>
      </insert>
  ```

###基于SqlSession的ExecutorType进行批量添加

+ Executor：

  - ```java
    public void testBatchForExecutor(){
            //使当前sqlsession有批处理的能力
            SqlSession sqlSession = this.getSqlSessionFactory().openSession(ExecutorType.BATCH);
    
            PersonMapper personMapper =sqlSession.getMapper(PersonMapper.class);
    
            for (int i = 0; i <1000 ; i++) {
                personMapper.addPerson(new Person("tom"+i,i+"@imooc.com","f"));
            }
    
            sqlSession.commit();
            sqlSession.close();
        }
    ```

  - ```xml
      <insert id="addPerson" parameterType="person">
            insert into person (username,email,gender) values (#{username},#{email},#{gender});
        </insert>
    ```

### 批量插入总结

+ 理论及代码总结
  - MySQL下批量保存的两种方式，建议使用第一种
  - 可借助Executor的Batch批量添加，可与Spring框架整合

