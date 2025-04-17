package com.cdgn.model;

public class SavingsAccount extends Account{
	private static final double MINIMUM_BALANCE=1000;

	public SavingsAccount(String acc_id, Customer customer, double balance) {
		super(acc_id, customer, balance);
	}

	@Override
	public boolean withdraw(double amount) {
		if(balance-amount>=MINIMUM_BALANCE) {
			balance=balance-amount;
			System.out.println("WITHDRAW Successful");
			return true;
		}
		else {
			System.out.println("Transaction Failed due to insufficient Balance");
			return false;
		}
	}
	
}
