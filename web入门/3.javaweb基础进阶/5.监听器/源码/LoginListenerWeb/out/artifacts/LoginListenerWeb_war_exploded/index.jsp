<%--
  Created by IntelliJ IDEA.
  User: lin
  Date: 2018/9/24
  Time: 10:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <link href="form.css" rel="stylesheet" type="text/css" />
    <title>Login</title>
  </head>
  <body>
    <form action="login.jsp" method="post" class="smart-green">
      <h1>系统登录</h1>

      <label>
        <span>用户名:</span>
        <input type="text" id="username" name="username">
      </label>

      <label>
        <span>密码:</span>
        <input type="password" id="password" name="password">
      </label>

      <span>&nbsp;</span>

      <label>
        <input type="submit" class="button" value="登录"/>
      </label>

    </form>
  </body>
</html>
