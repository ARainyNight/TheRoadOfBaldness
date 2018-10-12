<%--
  Created by IntelliJ IDEA.
  User: lin
  Date: 2018/10/12
  Time: 20:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>慕课网用户管理中心</title>
    <link rel="stylesheet" href="lib/bootstrap-3.3.7-dist/css/bootstrap.min.css">
    <script src="lib/2.2.4/jquery-1.12.4.min.js"></script>
    <script src="lib/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
    <div class="row">
        <h1>慕课网后台管理系统
            <small>用户数据管理中心</small>
        </h1>
    </div>
    <div class="row">
        <div class="jumbotron">
            <h1>MyBatis基础入门课程</h1>
            <p>...</p>
            <p><a class="btn btn-primary btn-lg" href="#" role="button">查看更多,请去慕课网</a></p>
        </div>
    </div>
    <div class="row">
        <table class="table table-hover table-striped">
            <tr>
                <th>用户编号</th>
                <th>登录账号</th>
                <th>用户昵称</th>
                <th>邮箱</th>
                <th>联系方式</th>
                <th>账号创建时间</th>
                <th>用户状态</th>
                <th>操作</th>
            </tr>

            <c:forEach var="user" items="${usersList}">
                <tr>
                    <td>${user.id}</td>
                    <td>${user.username}</td>
                    <td>${user.nickname}</td>
                    <td>${user.email}</td>
                    <td>${user.phone}</td>
                    <td>${user.createTime}</td>
                    <td>正常</td>
                    <td>
                        <a href="">查看</a>
                        <a href="">修改</a>
                        <a href="">删除</a>
                    </td>
                </tr>
            </c:forEach>
        </table>
    </div>
</div>

</body>
</html>
