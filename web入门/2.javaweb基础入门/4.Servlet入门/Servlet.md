[TOC]





# Servlet入门



### 什么是Servlet

#### Servlet简介

- Servlet(Server Applet)是Java Servlet的简称，称为小服务程序或服务连接器，用Java编写的服务器端程序，主要功能在于交互式地浏览和修改数据，生成动态web内容



### Servlet生命周期

![](http://a3.qpic.cn/psb?/V11ree7s3wel2Y/krwqlNaAxPPvjl*L85NIjo3jCKM6aRsRmlm3qn2Aq9U!/c/dEYBAAAAAAAA&ek=1&kp=1&pt=0&bo=8QIPAQAAAAADF88!&tl=1&vuin=3481376519&tm=1536282000&sce=60-2-2&rf=0-0)

`@WebServlet("/LoginServlet")`注解servlet，和在web.xml里面声明servlet是一样的功能



### 请求与响应

+ 浏览器对服务器的一次访问称之为一次`请求`，请求用`HttpServletRequest`对象来表示
+ 服务器给浏览器的一次反馈称之为一次`响应`，响应用`HttpServletResponse`对象来表示



### ServletContext与ServletConfig

![](http://a4.qpic.cn/psb?/V11ree7s3wel2Y/QZxz1aCrscLu39Uy2VJdAT6C0BoMvtzyUfnLJjbkM*w!/c/dDcBAAAAAAAA&ek=1&kp=1&pt=0&bo=VAXPAQAAAAADN40!&tl=1&vuin=3481376519&tm=1536285600&sce=60-2-2&rf=0-0)



### 转发与重定向

![](http://a3.qpic.cn/psb?/V11ree7s3wel2Y/Fxj9N3TTE13SNE.yMJv2HKKIrKvSSoLFrP*GXXbqAJY!/m/dFIBAAAAAAAAnull&bo=MAXsAQAAAAADB*o!&rf=photolist&t=5)



