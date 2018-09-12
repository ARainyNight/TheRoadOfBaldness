<%@ page import="com.bean.User" %>
<%@ page import="com.db.DBUtil" %>
<%@ page import="java.util.Map" %>
<%@ page import="com.bean.Notice" %><%--
  Created by IntelliJ IDEA.
  User: lin
  Date: 2018/9/6
  Time: 10:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" errorPage="error.jsp" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    String account = request.getParameter("account");
    String password = request.getParameter("password");

    User user = new User(account, null, password);
    boolean flag = DBUtil.seleUseByAccountAndPassword(user);
    Map<String, Notice> noticeMap = DBUtil.noticeMap;
    if (flag) {
        //登录成功
%>
<h3>公告列表为</h3>
<hr>
<form action="select.jsp">
    <table border="1" width="500">
        <tr>
            <td>
                公告编号：
            </td>
            <td>
                <input type="text" value="" name="notice-number"/>
            </td>
            <td>
                <input type="submit" value="Select"/>
            </td>
        </tr>
    </table>
</form>
<br>

<table border="1" width="500">
    <tr>
        <th>编号</th>
        <th>名称</th>
        <th>内容</th>
        <th>删除</th>
        <th>修改</th>
    </tr>
    <% for (String key : noticeMap.keySet()) {
        Notice u = noticeMap.get(key);
    %>
    <tr>
        <td>
            <%= u.getTiaccount()%>
        </td>
        <td>
            <%= u.getTitle()%>
        </td>
        <td>
            <%= u.getContext()%>
        </td>
        <td>
            <a href="delete.jsp?tiaccount=<%=u.getTiaccount()%>">删除</a>
        </td>
        <td>
            <a href="update.jsp?tiaccount=<%=u.getTiaccount()%>">修改</a>
        </td>
    </tr>
    <%
        }
    %>
</table>
<%
    } else {
        //登录失败
        throw new Exception("账号密码错误");
    }
%>
</body>
</html>
