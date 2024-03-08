<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
    <title>Danh sách</title>
</head>
<body>
    <h1>Danh sách sản phẩm</h1>
    <div>
        <form action="/products">
            <input type="hidden" name="action" value="index">
            <b>Tìm kiếm: </b><input type="text" name="key" value="${key}" placeholder="Từ khóa tìm kiếm...">
            <button>Tìm</button>
        </form>
    </div>
    <p><a href="/products?action=create">Thêm mới</a></p>
    <table border="1" cellpadding="5" cellspacing="0" width="100%">
        <tr>
            <th>Mã sp</th>
            <th>Tên sp</th>
            <th>NSX</th>
            <th>Số lô</th>
            <th>Số lượng</th>
            <th>Trạng thái</th>
            <th>Ngày tạo</th>
            <th>Hành động</th>
        </tr>
        <c:forEach var="p" items="${data}">
            <tr>
                <td>${p.id}</td>
                <td>${p.name}</td>
                <td>${p.manufacturer}</td>
                <td>${p.batch}</td>
                <td>${p.quantity}</td>
                <td>
                    <c:if test="${p.status == true}">
                        <span>Hoạt động</span>
                    </c:if>
                    <c:if test="${p.status == false}">
                        <span>Không hoạt động</span>
                    </c:if>
                </td>
                <td><fmt:formatDate value="${p.created}" pattern="dd/MM/yyyy HH:mm:ss" /></td>
                <td>
                    <a href="/products?action=edit&id=${p.id}">Sửa</a> |
                    <a href="/products?action=delete&id=${p.id}">Xóa</a>
                </td>
            </tr>
        </c:forEach>
    </table>
    <c:forEach begin="1" end="${total}" varStatus="loop">
        <c:if test="${page == loop.index}">
<%--            <button type="button" disabled>${loop.index}</button>--%>
            <a href="/products?action=index&key=${key}&page=${loop.index}">${loop.index}</a>
        </c:if>
        <c:if test="${page != loop.index}">
<%--            <button type="button">${loop.index}</button>--%>
            <a href="/products?action=index&key=${key}&page=${loop.index}">${loop.index}</a>
        </c:if>
    </c:forEach>
</body>
</html>
