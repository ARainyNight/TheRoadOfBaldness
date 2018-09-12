<%--
  Created by IntelliJ IDEA.
  User: lin
  Date: 2018/9/1
  Time: 9:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <% List list = new ArrayList();
        list.add("第一条： JSP基础入门");
        list.add("第二条： Servlet视频详解");
        list.add("第三条： EL表达式初识");
        list.add("第四条： JSTL标签库初识");
        for (Object li :list){
            out.println(li);
     %>
    <br>
    <%
        }
    %>

</body>
</html>
