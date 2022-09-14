package com.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.dto.productDto;
import com.ecommerce.entities.Product;
import com.ecommerce.exception.ProductNotFoundException;
import com.ecommerce.service.IProductService;

@RestController
@RequestMapping("/product")
public class ProductController {
	@Autowired
	IProductService productService;

	@GetMapping("/product")
	public List<Product> getProduct() {
		return this.productService.getAllProduct();
	}
	@PostMapping("/create")
	public  Product addProduct(@RequestBody productDto product) {
		return this.productService.addProduct(product);
	}
	@DeleteMapping("/{product_id}")
	public void deleteProduct(@PathVariable int product_id) {
		this.productService.deleteProduct(product_id);
	}
	@PutMapping("/update")
	public Product updateProduct(@RequestBody productDto product) {
		return this.productService.updateProduct(product);
	}
	@GetMapping("/{product_id}")
    public ResponseEntity getProductByID(@PathVariable("product_id") int product_id) throws ProductNotFoundException {
        return new ResponseEntity(productService.getProductByID(product_id), HttpStatus.OK);
    }
}