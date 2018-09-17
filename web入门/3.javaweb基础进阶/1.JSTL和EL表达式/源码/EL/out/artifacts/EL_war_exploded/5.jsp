<%--
  Created by IntelliJ IDEA.
  User: lin
  Date: 2018/9/17
  Time: 20:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>通过jstl+el表达式迭代LIST集合</title>
</head>
<body>
<table border="1" width="500">
    <tr align="center">
        <th>名称</th>
        <th>产地</th>
        <th>价格</th>
    </tr>
    <c:forEach items="${lists}" var="Map">
        <tr>
            <td>${Map.shopName}</td>
            <td>${Map.address}</td>
            <td>${Map.price}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
