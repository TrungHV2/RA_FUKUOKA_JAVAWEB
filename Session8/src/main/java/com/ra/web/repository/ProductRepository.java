package com.ra.web.repository;

import com.ra.web.entity.ProductsEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<ProductsEntity, String> {
    Page<ProductsEntity> findByProductNameContains(String productName, Pageable pageable);
    ProductsEntity findFirstByProductNameContains(String name);
}
