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
    <title>修改</title>
</head>
<body>
<h3>修改公告信息：</h3>
<hr>

<%
    String tiaccount = request.getParameter("tiaccount");
    Map<String, Notice> map = DBUtil.noticeMap;
    Notice notice = map.get(tiaccount);
%>
<form action="update_success.jsp">
    <table width="500" border="1">
        <tr>
            <td>
                编号：
            </td>
            <td>
                <input type="text" name="tiaccount" value="<%=notice.getTiaccount()%>"/>
            </td>
        </tr>
        <tr>
            <td>
                标题：
            </td>
            <td>
                <input type="text" name="title" value="<%=notice.getTitle()%>"/>
            </td>
        </tr>
        <tr>
            <td>
                内容：
            </td>
            <td>
                <input type="text" name="context" value="<%=notice.getContext()%>"/>
            </td>
        </tr>
        <tr>
            <td>
                <input type="submit" value="修改">
            </td>
        </tr>
    </table>
</form>
</body>
</html>
