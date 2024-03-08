<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html>
<head>
    <meta charset="UTF-8">
    <title>Thêm mới</title>
</head>
<body>
    <h1>Thêm mới sản phẩm</h1>
    <form action="/products" method="post">
        <input type="hidden" name="action" value="postCreate">
        <table border="0">
            <tr>
                <th>Mã sản phẩm</th>
                <td><input type="text" name="id"></td>
            </tr>
            <tr>
                <th>Tên sản phẩm</th>
                <td><input type="text" name="name"></td>
            </tr>
            <tr>
                <th>Nhà sản xuất</th>
                <td><input type="text" name="manufacturer"></td>
            </tr>
            <tr>
                <th>Số lô</th>
                <td><input type="number" name="batch"></td>
            </tr>
            <tr>
                <th>Số lượng</th>
                <td><input type="number" min="1" name="quantity"></td>
            </tr>
            <tr>
                <th>Trạng thái</th>
                <td>
                    <label for="sttTrue">
                        <input type="radio" id="sttTrue" name="status" value="true"> Hoạt động
                    </label> <br>
                    <label for="sttFalse">
                        <input type="radio" id="sttFalse" name="status" value="false"> Không hoạt động
                    </label> <br>
                </td>
            </tr>
            <tr>
                <th>&nbsp;</th>
                <td>
                    <button>Thêm mới</button> |
                    <a href="/products?action=index">Trở lại</a>
                </td>
            </tr>
        </table>
    </form>
</body>
</html>
