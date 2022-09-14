package com.ecommerce.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
@Table(name="category")
public class Category {
	@Id
	private int categoryid;
	@Column(nullable = false)
	private String categoryname;
	@Column(nullable = false)
	private String description;

	public Category(int categoryid, String categoryname, String description) {
		super();
		this.categoryid = categoryid;
		this.categoryname = categoryname;
		this.description = description;
	}

	public Category() {
		super();
	}
	public int getCategoryid() {
		return categoryid;
	}
	public void setCategoryid(int categoryid) {
		this.categoryid = categoryid;
	}
	public String getCategoryname() {
		return categoryname;
	}
	public void setCategoryname(String categoryname) {
		this.categoryname = categoryname;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	@Override
	public String toString() {
		return "category [categoryid=" + categoryid + ", categoryname=" + categoryname + ", description=" + description
				+ "]";
	}
	
	
}
