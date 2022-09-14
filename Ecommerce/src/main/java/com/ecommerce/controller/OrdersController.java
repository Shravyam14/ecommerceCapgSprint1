package com.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.dto.ordersDto;
import com.ecommerce.entities.Orders;
import com.ecommerce.service.IOrdersService;

@RestController
@RequestMapping("/orders")
public class OrdersController {
	@Autowired
	IOrdersService ordersService;
	
	@PostMapping("/create")
	public  Orders addOrders(@RequestBody ordersDto orders) {
		return this.ordersService.addOrders(orders);
	}
	@GetMapping("/orders")
	public List<Orders> getOrders() {
		return this.ordersService.getOrders();
	}
	@GetMapping("/{order_id}")
	public Orders getOrdersByID(@PathVariable int order_id) {
		return this.ordersService.getOrderByID(order_id);
	}
	
	@DeleteMapping("/{order_id}")
	public void deleteOrders(@PathVariable int order_id) {
		this.ordersService.deleteOrders(order_id);
		
	}
	@PutMapping("/update")
	public Orders updateOrders(@RequestBody ordersDto orders) {
		return this.ordersService.updateOrders(orders);
	}
}