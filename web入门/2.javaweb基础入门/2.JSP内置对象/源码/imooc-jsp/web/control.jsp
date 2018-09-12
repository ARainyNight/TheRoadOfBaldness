<%@ page import="com.imooc.bean.Emp" %>
<%@ page import="com.imooc.db.DButil" %>
<%@ page import="java.util.Map" %><%--
  Created by IntelliJ IDEA.
  User: lin
  Date: 2018/9/3
  Time: 9:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" errorPage="error.jsp" %>
<html>
<head>
    <title>control.jsp</title>
</head>
<!--
         request:获取请求信息，包括请求细节
         request.getParameter(String name ):可以通过一个控件的name来获取控件的值
         out:输出流对象，输出指定的内容
-->
<body>


<h3>响应的字符编码集:<%=response.getCharacterEncoding()%></h3>
<%
    String account = request.getParameter("account");
    String password = request.getParameter("password");

    Emp emp = new Emp(account, null, password, null);
    boolean flag = DButil.seletEmpByAccountAndPassword(emp);
    Map<String, Emp> map = DButil.map;
    if (flag) {
        Object o =application.getAttribute("count");
        if (o==null){
            application.setAttribute("count",1);
        }else {
            int count = Integer.parseInt(o.toString());
            application.setAttribute("count",count+1);
        }
        session.setAttribute("account",account);
%>
<h3 align="right">访问量：<%=application.getAttribute("count")%></h3>
<h3 align="right">登录账户：<%= session.getAttribute("account")%></h3>
<h3 align="center">欢迎来到人事管理系统的首页</h3>
<hr>
<h2>
    <table align="center" border="1" width="500px">
        <tr>
            <td>
                账号
            </td>
            <td>
                姓名
            </td>
            <td>
                邮箱
            </td>
            <td>
                修改
            </td>
        </tr>
        <%
            for (String key : map.keySet()) {
                Emp e = map.get(key);
        %>
        <tr>
            <td>
                <%= e.getAccount()%>
            </td>
            <td>
                <%= e.getName()%>
            </td>
            <td>
                <%= e.getEmail()%>
            </td>
            <td>
                <!--
                相邻两个JSP页面传递数据的时候，通过URL参数的方式来传递数据
                规则
                资源?key=value&key=value
                -->
                <a href="update.jsp?account=<%= e.getAccount()%>&name=<%= e.getName()%>&email=<%= e.getEmail()%>">修改</a>
            </td>
        </tr>
        <%
            }
        %>
    </table>
</h2>
<%
    } else {
        throw new Exception("账号和密码错误");
    }
%>
</body>
</html>
