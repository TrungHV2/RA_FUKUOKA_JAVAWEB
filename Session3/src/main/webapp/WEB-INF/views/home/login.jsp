<%--
  Created by IntelliJ IDEA.
  User: light
  Date: 3/11/2024
  Time: 8:48 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Đăng nhập</title>
</head>
<body>
    <h1>Đăng nhập</h1>
    <p style="color: red">${msg}</p>
    <form action="/home/login" method="post">
      <p><b>Tài khoản: </b> <input type="text" name="user"></p>
      <p><b>Mật khẩu: </b> <input type="password" name="pass"></p>
      <button>Đăng nhập</button>
    </form>
</body>
</html>
