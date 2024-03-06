<%--
  Created by IntelliJ IDEA.
  User: light
  Date: 3/6/2024
  Time: 7:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Trang chủ</title>
</head>
<body>
    <h1>Email: ${txtEmail}</h1>
    <h1>Name: ${txtName}</h1>
    <h1>Tài khoản <%= session.getAttribute("user") %></h1>
    <h1>Giới tính:
        <c:if test="${txtGender == true}"><span>Nam</span></c:if>
        <c:if test="${txtGender == false}"><span>Nữ</span></c:if>
    </h1>
    <h1>Ngày sinh: <fmt:formatDate value="${txtBirthday}" pattern="dd-MM-yyyy" /></h1>
    <h1>Số dư: <fmt:formatNumber value="${balance}" type="number" /></h1>
    <h1>Sở thích: </h1>
    <ul>
        <c:forEach var="str" items="${lstFav}">
            <li>${str}</li>
        </c:forEach>
    </ul>
</body>
</html>
