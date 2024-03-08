package com.ra.web.controller;

import com.ra.web.model.entity.Product;
import com.ra.web.repository.Repository;
import com.ra.web.repository.impl.RepositoryImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

@WebServlet(name = "products", value = "/products")
public class ProductsController extends Controller {
    private Repository<Product> productRepository;

    @Override
    public void init() throws ServletException {
        this.productRepository = new RepositoryImpl<>();
    }

    public void index(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int pageSize = 5;
        int page = Integer.parseInt(req.getParameter("page") == null ? "1" : req.getParameter("page"));

        final String key = req.getParameter("key");
        List<Product> data = productRepository.findAll(Product.class);
        // Tìm kiếm
        if (key != null) {
            data = data.stream()
                    .filter(x -> x.getId().contains(key) || x.getName().contains(key) || x.getManufacturer().contains(key))
                    .collect(Collectors.toList());
        }
        // Phân trang
        int total = (int) Math.ceil(data.size() / (double)pageSize);
        data = data.stream().skip((page - 1) * pageSize).limit(pageSize).collect(Collectors.toList());
        // Truyền dữ liệu ra JSP
        req.setAttribute("data", data);
        req.setAttribute("total", total);
        req.setAttribute("page", page);
        req.setAttribute("key", key);

        req.getRequestDispatcher("views/products/index.jsp").forward(req, resp);
    }

    public void create(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("views/products/create.jsp").forward(req, resp);
    }

    public void postCreate(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("views/products/create.jsp").forward(req, resp);
    }
}
