<%--
  Created by IntelliJ IDEA.
  User: lin
  Date: 2018/9/10
  Time: 10:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>结果</title>
</head>
<body>
        <%
//                Object in3s = request.getAttribute("in3s");
            Object in3s = application.getAttribute("in3s");
        %>
        <h4>加法计算器</h4>
<br>
<h4>运算结果为：<%=in3s%></h4>
</body>
</html>
