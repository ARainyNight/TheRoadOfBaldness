<%@ page import="java.util.Map" %>
<%@ page import="com.imooc.bean.Emp" %>
<%@ page import="com.imooc.db.DButil" %><%--
  Created by IntelliJ IDEA.
  User: lin
  Date: 2018/9/6
  Time: 10:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <%
        Map<String , Emp> map = DButil.map;
        Emp emp = map.get(request.getParameter("account"));
        emp.setName(request.getParameter("name"));
        emp.setEmail(request.getParameter("email"));
    %>
    <h3 align="center">修改员工信息成功</h3>
</body>
</html>
