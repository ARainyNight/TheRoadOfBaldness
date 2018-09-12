<%--
  Created by IntelliJ IDEA.
  User: lin
  Date: 2018/9/3
  Time: 12:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>员工更新页面</title>
</head>
<body>
    <h3 align="center">员工更新界面</h3>
    <hr>
    <h3 align="right">登录账号：<%=session.getAttribute("account")%></h3>
    <form action="update_control.jsp">
        <table align="center" border="1" width="500px">
            <tr>
                <td>
                    账号
                </td>
                <td>
                    <input type="text" name="account" value="<%=request.getParameter("account")%>"/>
                </td>
            </tr>
            <tr>
                <td>
                    名字
                </td>
                <td>
                    <input type="text" name="name" value="<%=request.getParameter("name")%>"/>
                </td>
            </tr>
            <tr>
                <td>
                    邮箱
                </td>
                <td>
                    <input type="text" name="email" value="<%=request.getParameter("email")%>"/>
                </td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="修改" />
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
