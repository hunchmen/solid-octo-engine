package com.via.ecommerce.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.via.ecommerce.app.entity.Product;

@CrossOrigin
public interface ProductRepository extends JpaRepository<Product, Long>{

}
