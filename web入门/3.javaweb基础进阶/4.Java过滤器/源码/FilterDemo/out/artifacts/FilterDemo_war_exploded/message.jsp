<%@ page import="java.util.List" %>
<%@ page import="model.Message" %><%--
  Created by IntelliJ IDEA.
  User: lin
  Date: 2018/9/20
  Time: 15:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    String user = (String) session.getAttribute("loginUser");

    String subFlag = request.getParameter("subFlag");

    List<Message> messages = (List<Message>) session.getAttribute("messages");
%>
<html>
<head>
    <title>留言板</title>
    <link href="form.css" type="text/css" rel="stylesheet">
    <link href="table.css" type="text/css" rel="stylesheet">
    <script type="text/javascript">

        var subFlag = '<%=subFlag%>';
        if ('1' == subFlag) {
            alert("留言成功!")
        }
    </script>
</head>
<body>
<form action="messageSub.jsp" method="post" class="smart-green">
    <h1>留言板</h1>

    <label>
        <span>留言人</span>
        <input id="user" type="text" name="user" value="<%=user%>" readonly>
    </label>

    <label>
        <span>标题</span>
        <input id="title" type="text" name="title" value="">
    </label>

    <label>
        <span>内容</span>
        <textarea id="content" name="content"></textarea>
    </label>

    <span>&nbsp;</span>

    <label>
        <input type="submit" class="button" value="提交"/>
    </label>
</form>
<br>
<table id="table-3" width="85%" align="center">
    <tr>
        <th width="15%">留言人</th>
        <th width="15%">标题</th>
        <th width="70%">内容</th>
    </tr>
    <%
        if (messages != null) {
            for (Message message : messages) {
    %>
    <tr>
        <td><%=user%></td>
        <td><%=message.getTitle()%></td>
        <td><%=message.getContent()%></td>
    </tr>
    <%
            }
        }
    %>
</table>
</body>
</html>
