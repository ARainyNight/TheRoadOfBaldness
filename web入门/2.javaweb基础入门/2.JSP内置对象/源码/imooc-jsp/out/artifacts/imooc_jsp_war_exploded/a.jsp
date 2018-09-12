<%--
  Created by IntelliJ IDEA.
  User: lin
  Date: 2018/9/3
  Time: 11:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--<%= request.getParameter("name")%>--%>
<%=pageContext.getRequest().getParameter("name")%>
</body>
</html>
