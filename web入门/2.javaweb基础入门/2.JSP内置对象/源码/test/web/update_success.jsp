<%@ page import="java.util.Map" %>
<%@ page import="com.bean.Notice" %>
<%@ page import="com.db.DBUtil" %><%--
  Created by IntelliJ IDEA.
  User: lin
  Date: 2018/9/6
  Time: 18:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
        <%
            Map<String , Notice> map  = DBUtil.noticeMap;
            Notice notice = map.get(request.getParameter("tiaccount"));
            notice.setTitle(request.getParameter("title"));
            notice.setContext(request.getParameter("context"));
        %>
        <h3>修改成功!</h3>
</body>
</html>
