package com.cdgn.controller;

import java.util.Scanner;

import com.cdgn.service.BankService;

public class BankManagementSystem {

	public static void main(String[] args) {
		BankService service = new BankService();
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("*******************\n"
				+ "Enter your Choice \n"
				+ "1.Create Customer\n"
				+ "2.Create Account\n"
				+ "3.withdraw\n"
				+ "4.deposit\n"
				+ "5.Check Balance\n"
				+ "6.View All Accounts\n"
				+ "7.Delete account\n"
				+ "8.exit"
				+ "9. view  account By Id");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:{ 
			System.out.println("Enter Customer_id");
			String c_id = sc.next();
			System.out.println("Enter Customer_name");
			String c_name = sc.next();
			service.createCustomer(c_id,c_name);
			break;
		}
		case 2:{
			System.out.println("Enter customer id");
			String c_id = sc.next();
			System.out.println("Enter account type");
			String type = sc.next();
			System.out.println("Account id");
			String acc_id = sc.next();
			System.out.println("Enter Balance ");
			double balance = sc.nextDouble();
			service.createAccount(c_id,type,acc_id,balance);
			break;
		}
		case 3:{
			System.out.println("Enter account id");
			String acc_id = sc.next();
			System.out.println("Enter amount to withdraw");
			double amount = sc.nextDouble();
			service.withdraw(acc_id,amount);
			break;
		}
		case 4:{
			System.out.println("Enter account id");
			String acc_id = sc.next();
			System.out.println("Enter amount to deposit");
			double amount = sc.nextDouble();
			service.deposit(acc_id,amount);
			break;
		}
		case 5:{
			System.out.println("Enter account id");
			String acc_id = sc.next();
			service.checkBalance(acc_id);
			break;
		}
		case 6:{
			service.viewAllAccounts();
			break;
		}
		case 9:{
			System.out.println("Enter account id");
			String acc_id = sc.next();
			service.viewAccountById(acc_id);
			break;
		}
		case 7:{
			System.out.println("Enter account id");
			String acc_id = sc.next();
			service.deleteAccountById(acc_id);
			break;
		}
		case 8:{
			System.out.println("Thank you for using bank servives bye....");
			System.exit(8);
		}
		default :{
			System.out.println("Invalid choice...");
		}
		}
		}
	}
}
