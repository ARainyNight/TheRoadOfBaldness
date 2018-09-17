<%--
  Created by IntelliJ IDEA.
  User: lin
  Date: 2018/9/17
  Time: 19:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>表单提交</title>
</head>
<body>
    <form action="/ELServlet" method="post">
        用户名：<input type="text" name="username">
        <br>
        年龄： <input type="text" name="age">
        <br>
        <input type="submit" value="提交">
    </form>
</body>
</html>
