package com.cts.eauction.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cts.eauction.model.Product;


public interface ProductService {
	
	List<Product> findAll();

}
