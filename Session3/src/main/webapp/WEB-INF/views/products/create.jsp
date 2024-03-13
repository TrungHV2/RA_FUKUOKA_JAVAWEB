<%--
  Created by IntelliJ IDEA.
  User: light
  Date: 3/13/2024
  Time: 6:43 PM
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
    <f:form action="/products/create" method="post" modelAttribute="product">
        <table>
            <tr>
                <th>Mã sp</th>
                <td>
                    <f:input path="id" />
                    <f:errors path="id" />
                </td>
            </tr>
            <tr>
                <th>Tên sp</th>
                <td>
                    <f:input path="name" />
                    <f:errors path="name" />
                </td>
            </tr>
            <tr>
                <th>Giá sp</th>
                <td><f:input path="price" /></td>
            </tr>
            <tr>
                <th>Ngày tạo</th>
                <td><f:input path="created" type="date" /></td>
            </tr>
<%--            <tr>--%>
<%--                <th>Ảnh sp</th>--%>
<%--                <td><input type="file" name="fImage"></td>--%>
<%--            </tr>--%>
            <tr>
                <th>Trạng thái sp</th>
                <td><f:input path="status" /></td>
            </tr>
        </table>
        <button>Lưu</button>
    </f:form>
</body>
</html>
