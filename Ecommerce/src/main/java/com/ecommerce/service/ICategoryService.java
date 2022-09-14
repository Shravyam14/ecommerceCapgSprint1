package com.ecommerce.service;

import java.util.List;

import com.ecommerce.entities.Category;
import com.ecommerce.exception.CustomerNotFoundException;

public interface ICategoryService {

	public Category createCategory(Category category);
	public List<Category> getCategories();
	
	public Category getCategoryByID(int categoryid);
	public void deleteCategory(int categoryid);
	Category updateCategory(Category category);
}