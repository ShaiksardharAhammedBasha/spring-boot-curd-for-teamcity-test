package com.spring;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/product")
public class ProductController {
	
	private static final org.slf4j.Logger logger = LoggerFactory.getLogger(ProductController.class);
	
	@Autowired
	private ProductRepository repo;
	
	@PostMapping(value="/saveProduct")
	public void saveProduct(@RequestBody Product product) {
		logger.info("saving product into db");
		repo.save(product);
	}
	
	@GetMapping("/")
	public String tryProduct() {
		return "product done";
	}
}
