package com.ra.web.service;

import com.ra.web.entity.ProductsEntity;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ProductService {
    List<ProductsEntity> findAll();
    Page<ProductsEntity> findByName(String name, int page, int pageSize, String sortBy, String direction);
}
