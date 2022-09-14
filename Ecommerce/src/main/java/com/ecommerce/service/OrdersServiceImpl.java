
package com.ecommerce.service;


import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
//import org.springframework.web.bind.annotation.RequestBody;

import com.ecommerce.dao.CustomersDao;
import com.ecommerce.dao.OrdersDao;
import com.ecommerce.dto.ordersDto;
import com.ecommerce.entities.Category;
import com.ecommerce.entities.Customers;
import com.ecommerce.entities.Orders;
import com.ecommerce.entities.Product;

@Service
public class OrdersServiceImpl implements IOrdersService{
	
	@Autowired
	private OrdersDao ordersDao;
	
	@Autowired
	private CustomersDao custDao;


	@Override
	public List<Orders> getOrders() {
		return ordersDao.findAll();
	}


	@Override
	public void deleteOrders(int order_id) {
		Orders ord=ordersDao.getOne(order_id);
		ordersDao.delete(ord);
	}

	@Override
	public Orders updateOrders(ordersDto orders) {
		Orders ord = new Orders();
		ord.setOrderid(orders.getOrderid());
		ord.setInvoicenumber(orders.getInvoicenumber());
		ord.setTotalprice(orders.getTotalprice());
		ord.setStatus(true);
		LocalDate date = LocalDate.now(); 
		ord.setOrderdate(date);
		Optional<Customers> cust =custDao.findById(orders.getCustomerid());
		Customers custId = cust.get();
		ord.setCustomer(custId);
		ordersDao.save(ord);
		return ord;
	}

	@Override
	public Orders getOrderByID(int order_id) {
		return ordersDao.getOne(order_id);
	}

	@Override
	public Orders addOrders(ordersDto orders) {
		
		Orders ord = new Orders();
		ord.setOrderid(orders.getOrderid());
		ord.setInvoicenumber(orders.getInvoicenumber());
		ord.setTotalprice(orders.getTotalprice());
		ord.setStatus(true);
		LocalDate date = LocalDate.now(); 
		ord.setOrderdate(date);
		
		Optional<Customers> cust =custDao.findById(orders.getCustomerid());
		Customers custId = cust.get();
		ord.setCustomer(custId);
		ordersDao.save(ord);
		return ord;
	}


	
}
