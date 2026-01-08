package com.customer;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Details")
public class Customer {
	
	@Id
	private int Customer_id;
	private String name;
	private String Product_id;
	public Customer(int customer_id, String name, String product_id) {
		super();
		Customer_id = customer_id;
		this.name = name;
		Product_id = product_id;
	}
	public Customer() {
		super();
	}
	public int getCustomer_id() {
		return Customer_id;
	}
	public void setCustomer_id(int customer_id) {
		Customer_id = customer_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getProduct_id() {
		return Product_id;
	}
	public void setProduct_id(String product_id) {
		Product_id = product_id;
	}
	@Override
	public String toString() {
		return "Customer [Customer_id=" + Customer_id + ", name=" + name + ", Product_id=" + Product_id + "]";
	}
	
	

}
