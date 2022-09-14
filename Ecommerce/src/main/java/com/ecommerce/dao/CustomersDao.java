package com.ecommerce.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.entities.Customers;

@Repository
public interface CustomersDao extends JpaRepository<Customers,Integer> {



}
