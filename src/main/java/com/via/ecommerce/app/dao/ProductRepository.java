package com.via.ecommerce.app.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.via.ecommerce.app.entity.Product;

/**
 * @author albertv
 * 
 */

@Repository
public interface ProductRepository {
	
	List<Product> getAllProducts();
}
