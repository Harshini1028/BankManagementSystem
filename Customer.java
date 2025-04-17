package com.cdgn.model;

public class Customer {
	private String cus_id;
	private String name;
	public Customer(String cus_id, String name) {
		super();
		this.cus_id = cus_id;
		this.name = name;
	}
	public String getCus_id() {
		return cus_id;
	}
	public void setCus_id(String cus_id) {
		this.cus_id = cus_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Customer [cus_id=" + cus_id + ", name=" + name + "]";
	}
	
}
