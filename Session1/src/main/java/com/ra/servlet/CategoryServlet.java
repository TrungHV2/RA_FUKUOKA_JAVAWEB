package com.ra.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "CategoryServlet", value = "/CategoryServlet")
public class CategoryServlet extends HttpServlet {
    /**
     * Viết ứng dụng web cho phép thêm và hiển thị danh sách category. Sử dụng lại CSDL trong module 3 hoặc tạo mới.
     * Sử dụng hệ quản trị CSDL MySQL
     */


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
