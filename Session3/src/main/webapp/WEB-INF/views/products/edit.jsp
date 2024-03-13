<%--
  Created by IntelliJ IDEA.
  User: light
  Date: 3/13/2024
  Time: 8:39 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Thêm mới sản phẩm</title>
</head>
<body>
<h1>Thông tin sản phẩm</h1>
<f:form action="/products/edit" method="post" enctype="multipart/form-data">
    <table>
        <tr>
            <th>Ảnh sp</th>
            <td><input name="image" type="file" /></td>
        </tr>
    </table>
    <button>Upload</button>
</f:form>
</body>
</html>
