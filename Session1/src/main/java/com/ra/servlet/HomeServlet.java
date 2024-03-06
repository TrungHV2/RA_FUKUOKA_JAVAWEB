package com.ra.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@WebServlet(name = "homeServlet", value = "/trang-chu")
public class HomeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        if (session.getAttribute("user") == null) {
            // Chuyển tiếp request, response đến JSP để xử lý giao diện
            request.getRequestDispatcher("views/login.jsp").forward(request, response);
        }
        response.setCharacterEncoding("UTF-8");
        request.setCharacterEncoding("UTF-8");
        // Lấy giá trị từ request
        String name = request.getParameter("name");
        String email = "trunghv@gmail.com";
        boolean gender = true;
        Date birthday = new Date();
        double balance = 123176124L;
        List<String> fav = Arrays.asList("Game", "Đá bóng", "Chạy", "Du lịch");
        // Truyền giá trị ra đến nơi xử lý view (JSP)
        request.setAttribute("txtEmail", email);
        request.setAttribute("txtName", name);
        request.setAttribute("txtGender", gender);
        request.setAttribute("lstFav", fav);
        request.setAttribute("txtBirthday", birthday);
        request.setAttribute("balance", balance);

        // Chuyển tiếp request, response đến JSP để xử lý giao diện
        request.getRequestDispatcher("views/home.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
