<%@page contentType="text/html; charset=utf-8" language="java" %>
<!doctype html>
<html>
<head>
    <title>Document</title>
</head>
<body>
    <h1>登录</h1>
    <form action="login" method="post">
        <div>
            <label for="username">用户名</label>
            <input type="text" id="username" name="username" placeholder="请输入用户名">
        </div>
        <div>
            <label for="password">用户名</label>
            <input type="text" id="password" name="password" placeholder="请输入密码">
        </div>
        <div>
            <input type="submit" value="登录">
        </div>
    </form>
</body>
</html>

