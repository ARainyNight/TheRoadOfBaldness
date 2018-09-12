<%--
  Created by IntelliJ IDEA.
  User: lin
  Date: 2018/9/3
  Time: 9:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>人事管理系统</title>
</head>
<body>

    <%--<% request.setAttribute("name","imooc");--%>
    <%--request.getRequestDispatcher("result.jsp").forward(request,response);--%>
    <%--%>--%>
    config对象：<%=config.getServletName()%>
    <br>
    config获取初始化参数：<%= config.getInitParameter("age")%>

    <h3 align="center">人事管理系统登录界面</h3>
    <hr>
    <form action="control.jsp">
        <table align="center">
            <tr>
                <td>
                    账号：
                </td>
                <td>
                    <input type="text" name="account"/>
                </td>
            </tr>
            <tr>
                <td>
                    密码：
                </td>
                <td>
                    <input type="password" name="password"/>
                </td>
            </tr>
            <tr>
                <td>
                    <input type="submit" value="登录"/>
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
