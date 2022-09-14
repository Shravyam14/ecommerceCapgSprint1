package com.ecommerce.entities;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties({"hibernateLazyInitializer"})
@Entity
@Table(name="orders")
public class Orders {
	@Id
	private int orderid;
	@Column(nullable = false)
	private int invoicenumber;
	@Column(nullable = false)
	private int totalprice;
	@Column(nullable = false)
	private boolean status;
	@Column(nullable = false)
	private LocalDate orderdate;
	
	@ManyToOne(targetEntity = Customers.class)
	@JoinColumn(name = "customerid",nullable = false)
    private Customers customer;
	
	public Customers getCustomer() {
		return customer;
	}
	public void setCustomer(Customers customer) {
		this.customer = customer;
	}
	
	public Orders() {
		super();
	}
	public Orders(int orderid, int invoicenumber, int totalprice, boolean status, LocalDate orderdate) {
		super();
		this.orderid = orderid;
		this.invoicenumber = invoicenumber;
		this.totalprice = totalprice;
		this.status = status;
		this.orderdate = orderdate;
	}
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	public int getInvoicenumber() {
		return invoicenumber;
	}
	public void setInvoicenumber(int invoicenumber) {
		this.invoicenumber = invoicenumber;
	}
	public int getTotalprice() {
		return totalprice;
	}
	public void setTotalprice(int totalprice) {
		this.totalprice = totalprice;
	}
	public boolean getStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public LocalDate getOrderdate() {
		return orderdate;
	}
	public void setOrderdate(LocalDate orderdate) {
		this.orderdate = orderdate;
	}
	@Override
	public String toString() {
		return "Orders [orderid=" + orderid + ", invoicenumber=" + invoicenumber + ", totalprice=" + totalprice
				+ ", status=" + status + ", orderdate=" + orderdate + "]";
	}
	
	
}


