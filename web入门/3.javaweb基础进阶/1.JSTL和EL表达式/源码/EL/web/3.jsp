<%--
  Created by IntelliJ IDEA.
  User: lin
  Date: 2018/9/17
  Time: 20:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>JSTL常用标签</title>
</head>
<body>

<%--set标签主要是往指定的域中存放数据--%>
<c:set var="user" value="张三" scope="request"></c:set>
<%--将数据打印显示--%>
<hr>
<c:out value="${user}"></c:out>
<br>
<c:remove var="user" scope="request"></c:remove>
<hr>
<c:out value="${user}"></c:out>
</body>
</html>
