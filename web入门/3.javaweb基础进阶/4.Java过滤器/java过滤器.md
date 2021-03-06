### 过滤器的作用

+ 实现对web资源请求的拦截，完成特殊的操作，尤其是对请求的预处理
+ web资源的范围
  - JSP
  - Servlet
  - 图片
  - 文件



----

### 过滤器常见的应用场景

+ Web资源权限访问控制
  - 比如点击某些功能时，检测到用户未登陆，会自动跳转到登陆界面
+ 请求字符集编码处理
+ 内容敏感字符词汇过滤
+ 响应信息压缩

----

### 过滤器常见概念

  #### 过滤器的工作流程

1. 进行请求预处理
2. 调用servlet.service()对请求进行处理
3. 对响应后的请求做后处理
4. 将响应结果返回客户端

#### 过滤器生命周期

+ `init()`web应用程序启动时，web服务器创建Filter的实例对象，以及对象的初始化
+ `dofilter()`当请求访问与过滤器关联的web资源时，过滤器拦截请求，完成指定功能
+ `destroy()`Filter对象创建后会驻留在内存，在web应用移除或服务器停止时才销毁
+ **在web应用运行期间，过滤器实例对象只有一个，并且会长期的驻留在我们的内存之间**
+ 过滤器的创建和销毁工作由WEB服务器负责

#### 过滤器的实现步骤

1. 编写Java类实现Filter接口，并实现其doFilter方法
2. 在web.xml文件对filter类进行注册，并设置所拦截的资源

#### 过滤器链

+ 在一个web应用中，多个过滤器组合起来称之为一个过滤器链

+ 过滤器的调用顺序取决于过滤器在web.xml文件中的**注册顺序**




#### filter-mapping子元素dispatcher

+ 当过滤器发现被访问映射资源时，需要强调资源被调用方式。
+ 当用户直接访问页面时，过滤器会认为是直接请求REQUEST方式。
+ 若通过INCLUDE方式时，过滤器会认为是INCLUDE方式。
+ 若通过request.forward()方式时，过滤器会认为是FORWARD方式。
+ 若目标资源通过声明时异常处理机制调用的，过滤器会认为是ERROR方式

   具体看[FilterDemo2](https://github.com/ARainyNight/TheRoadOfBaldness/tree/master/web%E5%85%A5%E9%97%A8/3.javaweb%E5%9F%BA%E7%A1%80%E8%BF%9B%E9%98%B6/4.Java%E8%BF%87%E6%BB%A4%E5%99%A8/%E6%BA%90%E7%A0%81/FilterDemo2)

