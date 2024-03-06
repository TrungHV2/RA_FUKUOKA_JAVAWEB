<%--
  Created by IntelliJ IDEA.
  User: light
  Date: 3/6/2024
  Time: 9:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Đăng nhập</title>
</head>
<body>
    <h1>Đăng nhập</h1>
    <form action="/login" method="post">
        <p>Tài khoản: <input type="text" name="username"></p>
        <p>Mật khẩu: <input type="password" name="password"></p>
        <button>Đăng nhập</button>
    </form>
</body>
</html>
