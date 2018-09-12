<%--
  Created by IntelliJ IDEA.
  User: lin
  Date: 2018/9/1
  Time: 9:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*" %>
<%@ page import="java.text.*" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%!
            public String getNow()
        {
            SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss");
            Date currentTime = new Date();
            return formatter.format(currentTime);
        }
    %>
<%=getNow()%>
</body>
</html>
