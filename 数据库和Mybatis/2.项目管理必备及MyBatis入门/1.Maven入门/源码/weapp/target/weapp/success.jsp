<%--
  Created by IntelliJ IDEA.
  User: lin
  Date: 2018/10/9
  Time: 11:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String username = (String) request.getAttribute("username");
%>
<html>
<head>
    <title>登录成功</title>
</head>
<body>
        <h1><%=username%></h1>
</body>
</html>
