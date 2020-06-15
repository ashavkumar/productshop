package com.barclays.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.barclays.product.beans.Product;
import com.barclays.product.service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	ProductService productService;
	
	@PostMapping(value="/registerProduct")
	ResponseEntity<Product> registerProduct(@RequestBody Product product) {
		System.out.println("Product-controller");
		product=productService.registerProduct(product);
		return new ResponseEntity<Product>(product,HttpStatus.OK);
	}
}
