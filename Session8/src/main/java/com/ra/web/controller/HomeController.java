package com.ra.web.controller;

import com.ra.web.entity.BillDetailsEntity;
import com.ra.web.entity.BillsEntity;
import com.ra.web.entity.ProductsEntity;
import com.ra.web.repository.BillDetailsRepository;
import com.ra.web.service.ProductService;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("home")
public class HomeController {
    private ProductService productService;
    private BillDetailsRepository billDetailsRepository;

    public HomeController(ProductService productService, BillDetailsRepository billDetailsRepository) {
        this.productService = productService;
        this.billDetailsRepository = billDetailsRepository;
    }

    @GetMapping(value = {"", "/index"})
    public String index(Model model) {
//        BillDetailsEntity entity = new BillDetailsEntity();
//        entity.setProducts(new ProductsEntity("SP001"));
//        entity.setBills(new BillsEntity(1));
//        entity.setQuantity(10);
//        entity.setPrice(1500);
//        billDetailsRepository.save(entity);

//        List<ProductsEntity> data = productService.findAll();
//        for (ProductsEntity p : data) {
//            System.out.println(p.getProductId());
//            for (BillDetailsEntity b : p.getBillDetails()) {
//                System.out.println("\t" + b.getBillDetailId());
//            }
//        }
        Page<ProductsEntity> page = productService.findByName("i", 0, 2, "productName", "desc");
        List<ProductsEntity> sorted = page.getContent();
        //model.addAttribute("data", data);
        return "home/index";
    }
}
