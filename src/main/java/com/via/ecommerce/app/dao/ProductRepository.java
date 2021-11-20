package com.via.ecommerce.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.via.ecommerce.app.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{

}
