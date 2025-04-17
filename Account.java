package com.cdgn.model;

public abstract class Account {
	private String acc_id;
	private Customer customer;
	double balance;
	public Account(String acc_id, Customer customer, double balance) {
		super();
		this.acc_id = acc_id;
		this.customer = customer;
		this.balance = balance;
	}
	public String getAcc_id() {
		return acc_id;
	}
	public void setAcc_id(String acc_id) {
		this.acc_id = acc_id;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [acc_id=" + acc_id + ", customer=" + customer + ", balance=" + balance + "]";
	}
	public void deposit(double amount) {
		balance+=amount;
	}
	public abstract boolean withdraw(double amount);

}
