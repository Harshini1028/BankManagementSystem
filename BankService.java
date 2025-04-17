package com.cdgn.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.cdgn.model.Account;
import com.cdgn.model.CurrentAccount;
import com.cdgn.model.Customer;
import com.cdgn.model.SavingsAccount;

public class BankService {
	HashMap<String, Customer> customers = new HashMap<String, Customer>();
	HashMap<String, Account> accounts = new HashMap<String, Account>();
	
	public void createCustomer(String c_id, String c_name) {
		Customer customer = new Customer(c_id, c_name);
		customers.put(c_id,customer);
		System.out.println("Customer Created Succssfully...");
	}
	public void createAccount(String c_id, String type, String acc_id, double balance) {
	if(customers.containsKey(c_id)) {
		if(type.equalsIgnoreCase("savings")) {
			accounts.put(acc_id,new SavingsAccount(acc_id,customers.get(c_id), balance));
			System.out.println("Savings Account creatd successfully....");
		}
		else if(type.equalsIgnoreCase("current")) {
			accounts.put(acc_id,new CurrentAccount(acc_id,customers.get(c_id), balance));
			System.out.println("Account creatd successfully....");
		}
		else {
			System.out.println("Invalid Account Type");
		}
	}
	else {
		System.out.println("Invalid customer id");
	}
		
	}
	public void withdraw(String acc_id, double amount) {
		if(accounts.containsKey(acc_id)) {
			 Account account = accounts.get(acc_id);
		 if(account.withdraw(amount)) {
				 //account.withdraw(amount);
				 System.out.println("withdraw successfull..." + account.getBalance());
			 }
			 else {
				 System.out.println("Insufficient balance..");
			 }
		}
		else {
			System.out.println("Invalid account id...");
		}
		
	}
	public void deposit(String acc_id, double amount) {
		if(accounts.containsKey(acc_id)) {
			 Account account = accounts.get(acc_id);
			 account.deposit(amount);
				 System.out.println("withdraw successfull... Reamaining balance" + account.getBalance());
		}
		else {
			System.out.println("Invalid account id...");
		}
		
	}
	public void checkBalance(String acc_id) {
		if(accounts.containsKey(acc_id)) {
			 Account account = accounts.get(acc_id);
		System.out.println("Available Balance  : " + account.getBalance());
		}
		else {
			System.out.println("Invalid account id...");
		}
		
	}
	public void viewAccountById(String acc_id) {
		if(accounts.containsKey(acc_id)) {
			 Account account = accounts.get(acc_id);
		System.out.println(account);
		}
		else {
			System.out.println("Invalid account id...");
		}
		
	}
	public void deleteAccountById(String acc_id) {
		if(accounts.containsKey(acc_id)) {
		accounts.remove(acc_id);
		System.out.println("account id deleted successfully....");
		}
		else {
			System.out.println("Invalid account id...");
		}
	}
	public void viewAllAccounts() {
		for(Entry<String, Account> account : accounts.entrySet()) {
			System.out.println(account);
		}
		
	}
	
}
