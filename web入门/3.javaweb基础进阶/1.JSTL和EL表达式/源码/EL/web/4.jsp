<%--
  Created by IntelliJ IDEA.
  User: lin
  Date: 2018/9/17
  Time: 20:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>JSTL中的if标签和choose标签</title>
</head>
<body>
    <c:set var="age" value="12" scope="request"></c:set>
    <%--test接判断的条件，如果为true，则执行标签体中的内容--%>
    <c:if test="${age==12}">
        你的年龄为12岁
    </c:if>
......
    <hr>
    <c:choose>
        <%--when类似于if，otherwise类似为else--%>
        <c:when test="${age ==12}">
            你的年龄为12岁when
        </c:when>
        <c:otherwise>
            你的年龄不是12岁otherwise
        </c:otherwise>
    </c:choose>
</body>
</html>
