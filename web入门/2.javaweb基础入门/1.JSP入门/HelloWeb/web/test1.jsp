<%--
  Created by IntelliJ IDEA.
  User: lin
  Date: 2018/8/30
  Time: 10:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%!
    String str = "helloWorld";

    String getStr() {
        return "helloWold2";
    }
%>
<hr>
<% out.println(this.str);%>
<hr>
<%= this.getStr()%>
</body>
</html>
