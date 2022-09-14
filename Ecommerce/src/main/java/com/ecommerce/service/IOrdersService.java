package com.ecommerce.service;

import java.util.List;

import com.ecommerce.dto.ordersDto;
import com.ecommerce.entities.Orders;


public interface IOrdersService {

	

	public List<Orders> getOrders();

	public Orders getOrderByID(int order_id);

	public Orders addOrders(ordersDto orders);

	public Orders updateOrders(ordersDto orders);

	public void deleteOrders(int order_id);
}

