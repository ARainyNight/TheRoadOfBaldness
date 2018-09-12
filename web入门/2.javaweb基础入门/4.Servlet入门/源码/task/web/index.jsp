<%--
  Created by IntelliJ IDEA.
  User: lin
  Date: 2018/9/10
  Time: 9:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    String basePath = request.getScheme() + ":" + "//" + request.getServerName() + ":" + request.getServerPort() + "/"
            + request.getServletContext().getContextPath();
%>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<h3>加法计算器</h3>
<hr>
<form action="<%=basePath%>AddServlet" method="post">
    <table width="300">
        <tr>
            <td>
                加数1：
            </td>
            <td>
                <input type="text" name="num1">
            </td>
        </tr>
        <tr>
            <td>
                加数2：
            </td>
            <td>
                <input type="text" name="num2">
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="计算">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
