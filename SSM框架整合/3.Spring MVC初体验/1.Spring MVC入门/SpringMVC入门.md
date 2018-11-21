### 什么是MVC设计模式？

+ Controller:负责接收并处理请求，响应客户端
+ Model:模型数据，业务逻辑
+ View:呈现模型，与用户进行交互

### SpringMVC核心组件

+ DispatcherServlet:前置控制器
+ Handler:处理器，完成具体业务逻辑
+ HandlerMapping:将请求映射到Handler
+ HandlerInterceptor:处理器拦截器
+ HandlerExecutionChain:处理器执行链
+ HandlerAdapter:处理器适配器
+ ModelAndView:装载模型数据和视图信息
+ ViewResolver:视图解析器

### SpringMVC实现流程

1. 客户端请求被DispatcherServlet接收
2. DispatcherServlet将请求映射到Handler
3. 生成Handler以及HandlerInterceptor
4. 返回HandlerExecutionChain(Handler+HandlerInterceptor)
5. DispatcherServlet通过HandlerAdapter执行Handler
6. 返回一个ModelAndView
7. DispatcherServlet通过ViewResolver进行解析
8. 返回填充了模型数据的View，返回给客户端

### SpringMVC的使用

1. 大部分组件由框架提供，开发者只需通过配置进行关联
2. 开发者只需手动编写Handler，View

### 基于XML配置的使用

1. SpringMVC基础配置
2. XML配置Controller,HandlerMapping组件映射
3. XML配置ViewResolver组件映射

### 基于注解方式的使用

1. SpringMVC基础配置
2. Controller,HandlerMapping通过注解进行映射
3. XML配置ViewResolver组件映射



