package com.ecommerce.service;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ecommerce.dao.CustomersDao;
import com.ecommerce.entities.Customers;
import com.ecommerce.exception.CustomerNotFoundException;

@Service
public class CustomersServiceImpl implements ICustomersService{
	
	@Autowired
	private CustomersDao customersDao;

	@Override
	public Customers createCustomers(Customers customers) {
		// TODO Auto-generated method stub
		customersDao.save(customers);
		return customers;
	}

	@Override
	public List<Customers> getCustomers(){
		// TODO Auto-generated method stub
		List<Customers> lst = customersDao.findAll();
		for(Customers a : lst) {
			a.setPassword("*****");
		}
		return lst;
	}

	@Override
	public Customers getCustomersByID(int customerid) throws CustomerNotFoundException{
		Customers customer;
		if(customersDao.findById(customerid).isEmpty()) {
			throw new CustomerNotFoundException();
		}
		else {
			customer=customersDao.findById(customerid).get();
			customer.setPassword("*****");
		}
		return customersDao.getOne(customerid);
	}
	
	

	@Override
	public void deleteCustomers(int customerid) {
		// TODO Auto-generated method stub
		Customers cus=customersDao.getOne(customerid);
		customersDao.delete(cus);
	}

	@Override
	public Customers updateCustomers(Customers customers) {
		// TODO Auto-generated method stub
		customersDao.save(customers);
		return customers;
	}

	

	


	
}
