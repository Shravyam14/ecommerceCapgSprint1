package com.ecommerce.dto;

public class productDto {
	private int productid;
	private String productname;
	private String productdiscription;
	private int price;
	private int quantity;
	private int categoryid;
	
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
	public int getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}
}
