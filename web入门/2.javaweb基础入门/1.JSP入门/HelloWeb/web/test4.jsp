<%--
  Created by IntelliJ IDEA.
  User: lin
  Date: 2018/8/30
  Time: 10:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>求1-100数字的和</title>
</head>
<body>
    <% int sum = 0 ;%>
<% for (int i= 0 ;i<=100 ;i++){
        sum +=i;
    }%>
<% out.println("1-100的和是："+sum);%>
</body>
</html>
