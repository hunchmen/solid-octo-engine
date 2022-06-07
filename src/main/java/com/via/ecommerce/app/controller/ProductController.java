package com.via.ecommerce.app.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.via.ecommerce.app.dao.ProductRepository;
import com.via.ecommerce.app.entity.Product;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @RequestMapping(value = "/getAllProducts", method = RequestMethod.GET)
    @ApiOperation(value = "Get all products")
    @ApiResponses({@ApiResponse(code = 404, message = "API Get All Student not found")})
    public ResponseEntity<List<Product>> getAllProductList() {

        List<Product> productList = productRepository.findAll();

        return new ResponseEntity<>(productList, HttpStatus.OK);

    }

}
