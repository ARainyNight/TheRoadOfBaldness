<%@ page import="java.util.Map" %>
<%@ page import="com.bean.Notice" %>
<%@ page import="com.db.DBUtil" %><%--
  Created by IntelliJ IDEA.
  User: lin
  Date: 2018/9/6
  Time: 11:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>查询结果</title>
</head>
<body>
        <table border="1" width="500">
            <tr>
                <td>
                    公告编号：
                </td>
                <td>
                    <input type="text" value="<%=request.getParameter("notice-number")%>"/>
                </td>
                <td>
                    <input type="button" value="Back" />
                </td>
            </tr>
        </table>

    <table border="1" width="500">
        <tr>
            <th>编号</th>
            <th>标题</th>
            <th>内容</th>
            <th>删除</th>
            <th>修改</th>
        </tr>
        <tr>
            <%
                String tiaccount = request.getParameter("notice-number");
                Map<String , Notice> noticeMap = DBUtil.noticeMap;
                Notice notice = noticeMap.get(tiaccount);
            %>
            <td><%=tiaccount %></td>
            <td><%=notice.getTitle()%></td>
            <td><%=notice.getContext()%></td>
            <td>
                <a href="delete.jsp?tiaccount=<%=tiaccount%>">Delete</a>
            </td>
            <td>
                <a href="update.jsp?tiaccount=<%=tiaccount%>">Update</a>
            </td>
        </tr>
    </table>
</body>
</html>
