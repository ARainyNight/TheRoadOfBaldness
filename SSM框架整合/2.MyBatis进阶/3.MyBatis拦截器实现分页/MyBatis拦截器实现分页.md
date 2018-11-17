### MyBatis四大对象

+ Mybatis核心对象
  - ParameterHandler:处理SQL的参数对象
  - ResultSetHandler:处理SQL的返回结果集
  - StatementHandler：数据库的处理对象，用于执行SQL语句
  - Executor:MyBatis的执行器，用于执行增删改查操作

### MyBatis插件开发

+ Mybatis插件接口-Interceptor
  - Intercept方法，插件的核心方法
  - 使plugin方法，生成target的代理对象
  - setProperties方法，配置所需参数
+ 插件开发过程
  - 确定拦截的签名
  - 实现拦截方法
  - 配置和运行
  - 插件实例
+ 多插件开发过程
  - 创建代理对象时，按照插件配置的顺序进行包装
  - 执行目标方法后，是按照代理的逆向进行执行

### 使用拦截器PageHelper进行分页

+ 插件进行分页
  - 分页的分类：内存分页和物理分页
  - MySQL中实现分页的关键字`limit`
+ 分页原理-规律
  - 开始记录索引的规律(当前页-)*每页的条数
  - 一共有多少页：总记录%条数==?总记录%条数：+1
+ 分页原理-三个参数
  - 当前页
  - 每页的条数
  - 总记录数