package com.ecommerce.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.ecommerce.entities.Orders;

@Repository
public interface OrdersDao extends JpaRepository<Orders,Integer> {

}
