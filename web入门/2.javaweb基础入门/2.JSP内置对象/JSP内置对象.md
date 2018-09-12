[TOC]

##HTTP协议

###HTTP协议简介

- HTTP协议----超文本传输协议



+ 请求与相应模式

+ JSP内置对象
  - 内置对象（又叫隐含对象，有9个）：不需要预先声明就可以在脚本代码和表达式中随意使用
+ 作用域
  - `pageContext、request、session、application`
  - ![](http://a4.qpic.cn/psb?/V11ree7s3wel2Y/TU9zQJ0ill1QC0MNrIs8Vix0KIjLu1GTUDnF2G0W5vA!/c/dGcBAAAAAAAA&ek=1&kp=1&pt=0&bo=IAUjAgAAAAADNxY!&tl=1&vuin=3481376519&tm=1535932800&sce=60-2-2&rf=0-0)
  - request作用域：用户的请求周期

### session

session:主要用于跟踪会话	

session声明周期：整个会话期间



### config

config:获取配置信息

### exception

exception：异常对象

+ 在抛出异常的JSP界面包引入`errorPage="error.jsp"`
+ 在`error.jsp`界面包引入`isErrorPage="true"`,就可以用`<%= exception.getMessage()%>`接受异常了

### application对象应用

+ application:提供了关于服务器的版本，应用级初始化参数和应用内资源绝对路径方式
+ application作用域：web容器的生命周期