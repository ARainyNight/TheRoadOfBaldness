<%--
  Created by IntelliJ IDEA.
  User: lin
  Date: 2018/9/24
  Time: 10:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
String flag = request.getParameter("flag");
%>
<html>

  <head>
    <link href="form.css" rel="stylesheet" type="text/css" />
    <title>Login</title>
    <script type="text/javascript">
      var flag ='<%=flag%>';
      if ('1'==flag){
          alert("你尚未登录，或者账号在异地登录，请重新登录！")
      }
    </script>
  </head>
  <body>
    <form action="login.jsp" method="post" class="smart-green">
      <h1>系统登录</h1>

      <label>
        <span>用户名:</span>
        <input type="text" id="username" name="username">
      </label>

      <label>
        <span>密码:</span>
        <input type="password" id="password" name="password">
      </label>

      <span>&nbsp;</span>

      <label>
        <input type="submit" class="button" value="登录"/>
      </label>

    </form>
  </body>
</html>
