package com.ecommerce.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ecommerce.dao.CategoryDao;
import com.ecommerce.entities.Category;
import com.ecommerce.entities.Product;

@Service
public class CategoryServiceImpl implements ICategoryService{
	
	@Autowired
	private CategoryDao categoryDao;
	@Override
	public Category createCategory(Category category) {
		categoryDao.save(category);
		return category;
	}
	@Override
	public List<Category> getCategories() {
		return categoryDao.findAll();
	}
	@Override
	public Category getCategoryByID(int categoryid) {
		return categoryDao.getOne(categoryid);
	}
	
	@Override
	public void deleteCategory(int categoryid) {
		Category cat= categoryDao.getOne(categoryid);
		categoryDao.delete(cat);
	}
	@Override
	public Category updateCategory(Category category) {
		categoryDao.save(category);
		return category;
	}
}
