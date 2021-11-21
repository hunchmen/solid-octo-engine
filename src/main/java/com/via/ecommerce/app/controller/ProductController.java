package com.via.ecommerce.app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
public class ProductController {
	
	 	@RequestMapping(value = "/custom", method = RequestMethod.POST)
	 	@ApiOperation(value = "Get all student")
		@ApiResponses({@ApiResponse(code = 404, message = "API Get All Student not found")})
	    public String custom() {
	        return "custom";
	    }
	
}
