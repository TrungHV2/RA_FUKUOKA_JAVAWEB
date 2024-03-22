package com.ra.web.service.impl;

import com.ra.web.entity.ProductsEntity;
import com.ra.web.repository.ProductRepository;
import com.ra.web.service.ProductService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public List<ProductsEntity> findAll() {
        return productRepository.findAll();
    }

    @Override
    public Page<ProductsEntity> findByName(String name, int page, int pageSize, String sortBy, String direction) {

        ProductsEntity entity = productRepository.findFirstByProductNameContains("Tivi");

        // Sắp xếp
        Sort sort = Sort.by(direction.equalsIgnoreCase("asc") ? Sort.Direction.ASC : Sort.Direction.DESC, sortBy);
        // Phân trang
        Pageable pageable = PageRequest.of(page, pageSize, sort);
        Page<ProductsEntity> data = productRepository.findByProductNameContains(name, pageable);
        return data;
    }
}
