<%--
  Created by IntelliJ IDEA.
  User: lin
  Date: 2018/9/1
  Time: 9:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

    <style>
        .div{
            text-align: center;
        }
    </style>
</head>
<body>
    <div class="div">
        <%int x= 0 ;
        int y =0;%>
        <% if (x<0){%>
            当x<0时，输出<br>
            x=<%=x%><br>
            y=-1;
        <%}else if(x==0){%>
        当x=0时，输出<br>
        x=<%=x%><br>
        y=0;
        <%}else{%>
        当x>0时，输出<br>
        x=<%=x%><br>
        y=1;
        <%}%>
    </div>
</body>
</html>
