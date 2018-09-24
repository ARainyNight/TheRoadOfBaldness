<%--
  Created by IntelliJ IDEA.
  User: lin
  Date: 2018/9/24
  Time: 10:47
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
        String username =request.getParameter("username");
        String password =request.getParameter("password");

        session.setAttribute("loginUser",username);

        response.sendRedirect(request.getContextPath()+"/main.jsp");
%>
