package com.ecommerce.service;

import java.util.List;

import com.ecommerce.entities.Customers;
import com.ecommerce.exception.CustomerNotFoundException;

public interface ICustomersService {

	public Customers createCustomers(Customers customers);
	public List<Customers> getCustomers();
	
	public Customers getCustomersByID(int customersid) throws CustomerNotFoundException;
	public void deleteCustomers(int customersid);
	Customers updateCustomers(Customers customers);
}
