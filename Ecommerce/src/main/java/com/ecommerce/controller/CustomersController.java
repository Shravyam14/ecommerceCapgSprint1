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


import com.ecommerce.entities.Customers;
import com.ecommerce.exception.CustomerNotFoundException;
import com.ecommerce.exception.ProductNotFoundException;
import com.ecommerce.service.ICustomersService;

@RestController
@RequestMapping("/customers")
public class CustomersController {
	@Autowired
	ICustomersService customersService;
	
	@PostMapping("/create")
	public Customers createCustomer(@RequestBody Customers customers) {
		 this.customersService.createCustomers(customers);
		return customers;		
	}
	@GetMapping("/customers")
	public List<Customers> getCustomers() {
		return this.customersService.getCustomers();
	}
	
	@DeleteMapping("/{customerid}")
	public void deleteCustomers(@PathVariable int customerid) {
		this.customersService.deleteCustomers(customerid);
		
	}
	@PutMapping("/update")
	public Customers updateCustomers(@RequestBody Customers customers) {
		return this.customersService.updateCustomers(customers);
	}
	
	@GetMapping("/{customerid}")
	public ResponseEntity getCustomersByID(@PathVariable("customerid") int customerid) throws CustomerNotFoundException {
		return new ResponseEntity(customersService.getCustomersByID(customerid),HttpStatus.OK);
	}
}