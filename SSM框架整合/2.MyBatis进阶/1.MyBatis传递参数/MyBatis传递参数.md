### MyBatis的概述

+ ORM(Object Relational Mapping)持久层框架的佼佼者
+ 真正实现了SQL语句与Java代码的分离
+ 优秀的功能：动态SQL、缓存、插件-pageHelper等

### 以数组为传递参数进行查询

+ 重要知识点
  - Mybatis的入参的处理
  - Mybatis的动态SQL(foreach标签)

### Mybatis入参处理

+ 参数处理
  - 传递单个参数的形式(mybatis会自动进行参数的赋值)
  - 传递多个参数(mybatis会自动封装在Map集合中)
  - Collection、List、Array作为参数，封装为Map，但是有一定的规则
+ 参数处理详解
  - 单参数Mybatis会直接取出参数值给Mapper文件赋值如：#{id}
  - 多参数的处理方式有三种
    - JavaBean传递参数
    - Map接口
    - 注解@param
  - 多参数处理-封装POJO类
    - 如果多个参数是我们业务逻辑的数据模型，我们就可以直接传入pojo
    - XML文件中：#{属性名}取出传入的pojo的属性值
  - 多参数处理-Map
    - 如果参数个数比较少，而且没有对应的JavaBean，可以封装成Map
    - XML文件中：#{key}取出map中对应的值
  - 多参数处理-@param
    - 由于以上两种方式需要手动创建Map及对象，不简洁，可以使用@param注解，它可以明确指定封装参数时map的key
  - 集合类型参数处理
    - 当参数为Collection的接口，转换为Map，Map的Key为collection
    - 如果参数的类型为List接口时，除了collection的值外，list作为key
    - 如果参数为数组，也会转换为Map，Map的key为array
+ 参数处理总结
  - 使用map传递参数，业务可读性差
  - @param，受到参数个数（n）的影响，n<5时，为最佳的传参方式
  - 以上参数的处理各有利弊，参数>5,建议用JavaBean方法

### Mybatis动态SQL之foreach

+ foreach元素：

  - 特点：循环遍历集合，支持数组和List、Set接口，对其提供遍历功能

  - 应用：数据库中数据字典的内容，经常使用foreach元素确定查找

  - 常用配置

    - ```xml
      <select id="getPersonsByIds" resultType="person">
              select * from person where id in
              <foreach collection="array" item="id" index="i" open="(" close=")" separator=",">
                  #{id}
              </foreach>
          </select>
      ```

    

