package com.ecommerce.entities;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="product")
public class Product {
	@Id
	private int productid;
	@Column(nullable = false)
	private String productname;
	@Column(nullable = false)
	private String productdiscription;
	@Column(nullable = false)
	private int price;
	@Column(nullable = false)
	private int quantity;
	@Column(nullable = false)
	private boolean productavailable;

	@ManyToOne(targetEntity = Category.class)
	@JoinColumn(name = "categoryid",nullable = false)
    private Category category;
	
	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public int getProductid() {
		return productid;
	}
	
	public void setProductid(int productid) {
		this.productid = productid;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getProductdiscription() {
		return productdiscription;
	}
	public void setProductdiscription(String productdiscription) {
		this.productdiscription = productdiscription;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public boolean getProductavailable() {
		return productavailable;
	}
	public void setProductavailable(boolean productavailable) {
		this.productavailable = productavailable;
	}
	public Product(int productid, String productname, String productdiscription, int price, int quantity,
			boolean productavailable) {
		super();
		this.productid = productid;
		this.productname = productname;
		this.productdiscription = productdiscription;
		this.price = price;
		this.quantity = quantity;
		this.productavailable = productavailable;
	}
	public Product() {
		super();
	}
	@Override
	public String toString() {
		return "Product [productid=" + productid + ", productname=" + productname + ", productdiscription="
				+ productdiscription + ", price=" + price + ", quantity=" + quantity + ", productavailable="
				+ productavailable + "]";
	}
}