package com.ecommerce.dao;

//import org.springframework.transaction.annotation.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Modifying;
//import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.ecommerce.entities.Category;

@Repository
//@Transactional
public interface CategoryDao extends JpaRepository<Category,Integer> {

//	@Modifying
//	@Query(value="delete from Category category where category.categoryid=?1")
//	public void deleteCategory(int categoryid);


}
