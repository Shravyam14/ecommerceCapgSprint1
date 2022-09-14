package com.ecommerce.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.ecommerce.dao.CategoryDao;
import com.ecommerce.dao.ProductDao;
import com.ecommerce.dto.productDto;
import com.ecommerce.entities.Category;
import com.ecommerce.entities.Customers;
import com.ecommerce.entities.Product;
import com.ecommerce.exception.ProductNotFoundException;

@Service
public class ProductServiceImpl implements IProductService{
	
	@Autowired
	private ProductDao productDao;
	
	@Autowired
	private CategoryDao catdao;

	@Override
	public Product addProduct(productDto product) {

		Product pro = new Product();
		pro.setProductid(product.getProductid());
		pro.setProductname(product.getProductname());
		pro.setProductdiscription(product.getProductdiscription());
		pro.setPrice(product.getPrice());
		pro.setQuantity(product.getQuantity());
		if(product.getQuantity() > 0) {
			pro.setProductavailable(true);			
		} else {
			pro.setProductavailable(false);		
		}
		
		Optional<Category> cat =catdao.findById(product.getCategoryid());
		Category catId = cat.get();
		pro.setCategory(catId);
		productDao.save(pro);
		return pro;
	}
	
	@Override
	public void deleteProduct(int product_id) {
		Product prod= productDao.getOne(product_id);
		productDao.delete(prod);
	}

	@Override
	public Product updateProduct(productDto product) {
		Product pro = new Product();
		pro.setProductid(product.getProductid());
		pro.setProductname(product.getProductname());
		pro.setProductdiscription(product.getProductdiscription());
		pro.setPrice(product.getPrice());
		pro.setQuantity(product.getQuantity());
		if(product.getQuantity() > 0) {
			pro.setProductavailable(true);			
		} else {
			pro.setProductavailable(false);		
		}
		
		Optional<Category> cat =catdao.findById(product.getCategoryid());
		Category catId = cat.get();
		pro.setCategory(catId);
		productDao.save(pro);
		return pro;
	}

	@Override
	public List<Product> getAllProduct() throws ProductNotFoundException {
		return productDao.findAll();
	}
	
   @Override
    public Product getProductByID(int product_id) throws ProductNotFoundException {
        Product product;
        if (productDao.findById(product_id).isEmpty()) {
            throw new ProductNotFoundException();
        } else {
            product = productDao.findById(product_id).get();
        }
        return productDao.getOne(product_id);
    }
}