<%--
  Created by IntelliJ IDEA.
  User: lin
  Date: 2018/9/3
  Time: 8:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
      <!--
        pageContext作用：
        1. 通过forwward方法来完成请求转发
        2. 通过include方法来完成页面之间的包含关系
        3. pageContext可以来获取其他的内置对象
      -->
      <%
//        pageContext.include("header.jsp");
        pageContext.forward("a.jsp?name=imooc");
      %>
  </body>
</html>
