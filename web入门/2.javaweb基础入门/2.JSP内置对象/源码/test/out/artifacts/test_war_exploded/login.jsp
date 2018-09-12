<%--
  Created by IntelliJ IDEA.
  User: lin
  Date: 2018/9/6
  Time: 10:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>公告系统</title>
</head>
<body>
    <h3>登录页面</h3>
    <hr>
    <form action="contorl.jsp">
        <table>
            <tr>
                <td>
                    用户名:
                </td>
                <td>
                    <input type="text" name="account"/>
                </td>
            </tr>
            <tr>
                <td>
                    密码:
                </td>
                <td>
                    <input type="password" name="password"/>
                </td>
            </tr>
            <tr>
                <td>
                    <input type="submit" value="登录" />
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
