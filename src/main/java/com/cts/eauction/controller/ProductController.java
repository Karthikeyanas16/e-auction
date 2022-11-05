package com.cts.eauction.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.eauction.model.Product;
import com.cts.eaution.impl.ProductServiceImpl;

@CrossOrigin(origins = "*", maxAge = 4800)
@RestController
@RequestMapping("/e-auction/api/v1/seller/")
public class ProductController {
	
	@Autowired
	public ProductServiceImpl productServiceImpl;
	
	@GetMapping("/show-bids")
	public List<Product> getAllProducts() {
		System.out.println("Hello Product...");
		return productServiceImpl.findAll();
	}
	
	
}
