<%@ page import="java.util.Map" %>
<%@ page import="com.bean.Notice" %>
<%@ page import="com.db.DBUtil" %><%--
  Created by IntelliJ IDEA.
  User: lin
  Date: 2018/9/6
  Time: 11:21
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>删除</title>
</head>
<body>
        <%
            String tiaccount = request.getParameter("tiaccount");
            Map<String ,Notice> map = DBUtil.noticeMap;
            map.remove(tiaccount);
        %>
        编号:<%=tiaccount%>
</body>
</html>
