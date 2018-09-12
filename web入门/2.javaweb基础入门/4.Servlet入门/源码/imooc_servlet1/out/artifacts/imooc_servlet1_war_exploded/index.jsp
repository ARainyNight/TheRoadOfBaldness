<%--
  Created by IntelliJ IDEA.
  User: lin
  Date: 2018/9/7
  Time: 9:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    String basePath =request.getScheme()+":"+"//"+request.getServerName()+":"+request.getServerPort()+"/"
            +request.getServletContext().getContextPath();
%>
<html>
  <head>
    <title>登录</title>
  </head>
  <body>
      <center>
        <form action="<%=basePath%>LoginServlet" method="post">
            <p>
              用户名：<input type="text" name="username"/>
            </p>
          <p>
            密&nbsp;码：<input type="password" name="password"/>
          </p>
          <p>
            <input type="submit" value="登录"/>
            <input type="reset" value="重置"/>
          </p>
        </form>
      </center>
  </body>
</html>
