package com.ecommerce.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.entities.Product;

@Repository
public interface ProductDao extends JpaRepository<Product,Integer> {

}