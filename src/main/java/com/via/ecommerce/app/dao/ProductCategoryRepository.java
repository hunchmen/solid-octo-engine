package com.via.ecommerce.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.via.ecommerce.app.entity.ProductCategory;

@RepositoryRestResource(collectionResourceRel = "productCategory", path = "product-category")
@CrossOrigin
public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Long>{
	
}
