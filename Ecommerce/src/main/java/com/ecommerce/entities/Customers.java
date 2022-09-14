package com.ecommerce.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
@Table(name="customer")
public class Customers {
	@Id
	private int customerid;
	@Column(nullable = false)
	private String customername;
	@Column(nullable = false)
	private String emailID;
	@Column(nullable = false)
	private String password;
	@Column(nullable = false)
	private String address;
	
	
	public Customers(int customerid, String customername, String emailID, String password, String address) {
		super();
		this.customerid = customerid;
		this.customername = customername;
		this.emailID = emailID;
		this.password = password;
		this.address = address;
	}
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	
	public String getEmailID() {
		return emailID;
	}
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Customers() {
		super();
	}
	@Override
	public String toString() {
		return "Customers [customerid=" + customerid + ", customername=" + customername + ", emailID=" + emailID
				+ ", password=" + password + ", address=" + address + "]";
	}
	
	
}
