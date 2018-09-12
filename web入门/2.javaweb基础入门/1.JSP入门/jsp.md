[TOC]

### JSP简介

+ JSP全名为Java Server Pages, 中文名叫Java服务器页面，其根本是一个简化的Servlet设计
+ JSP是在传统的网页HTML文件中插入java程序段(Scriptlet)和JSP标记(tag)，从而形成JSP文件，后缀名为(*.jsp)
+ 用JSP开发的web应用是跨平台的，既能在Linux下运行，也能在其他操作系统上运行。
+ ![](http://a4.qpic.cn/psb?/V11ree7s3wel2Y/*2A2KnJtt4I6JNcfZ9NgxbWsZFd9QvcJawHovLuXP6s!/b/dDMBAAAAAAAA&ek=1&kp=1&pt=0&bo=SQWzAgAAAAADN.8!&tl=1&vuin=3481376519&tm=1535680800&sce=60-4-3&rf=viewer_4)





#### JSP基本语法

+ JSP声明语法

  - 语法格式

  - ```jsp
    <%! String str ="helloWorld"; %>
    ```

  - 定义成员变量，以及成员方法

  - 不能直接包含程序语句

+ JSP程序脚本

  - 包括变量的声明、表达式和程序逻辑

  - 声明的变量转换为_service方法中的变量，因而是局部变量

  - 语句块可以自由地与页面代码组合使用

  - ```jsp
    <% int i =100; %>
    <% if(i>10) {  %>
    	<h1>这里是页面脚本 i >10 </h1>
    <% }else{ %>
    	<h1>这里是页面脚本 i <=10</h1>
            <%}%>
    ```

+ JSP内容输出表达式

  + ![](http://m.qpic.cn/psb?/V11ree7s3wel2Y/aqj5lpOxJx7ZFkzsk.pSp5XI6DpdMihfbwNKQELwaA8!/b/dDQBAAAAAAAA&bo=VgSaAgAAAAADJ8g!&rf=viewer_4)

+ JSP包引入

  + ![](http://a2.qpic.cn/psb?/V11ree7s3wel2Y/ohZDx6rMnJ7XKcx6wHCYR87a6d6vhHvc.oA9upyQ.kM!/c/dDUBAAAAAAAA&ek=1&kp=1&pt=0&bo=UAWhAgAAAAADN.Q!&tl=1&vuin=3481376519&tm=1535763600&sce=60-2-2&rf=0-0)

