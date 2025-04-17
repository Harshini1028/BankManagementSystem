package com.cdgn.model;

public class CurrentAccount extends Account  {
	private static final double OVERDRAFT_AMOUNT=5000;
	public CurrentAccount(String acc_id, Customer customer, double balance) {
		super(acc_id, customer, balance);
		// TODO Auto-generated constructor stub
	}
	@Override
	public boolean withdraw(double amount) {
		if(balance-amount>=-OVERDRAFT_AMOUNT) {
			balance=balance-amount;
			System.out.println("Transaction Successfull....");
			return true;
		}
		else {
			System.out.println("Transaction failed due to insufficient overdraft limit");
			return false;
		}
	}
}
