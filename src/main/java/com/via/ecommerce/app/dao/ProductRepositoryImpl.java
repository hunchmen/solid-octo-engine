package com.via.ecommerce.app.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;

import com.via.ecommerce.app.entity.Product;

public class ProductRepositoryImpl implements ProductRepository{
	
	@Autowired
	private EntityManager entityManager;
	
	@SuppressWarnings("unchecked")
	@Override
	public List<Product> getAllProducts() {
		
		final String queryString = "SELECT * FROM product";
		
		Query products = entityManager.createNamedQuery(queryString);
		
		return products.getResultList();
	}

}
