package com.training.bankingProject;

import java.util.Scanner;

public class Bank {
	
	public static void main(String[] args) {
		//Scanner scanner=new Scanner(System.in);
		
	SavingsAccount savings=new SavingsAccount();
    System.out.println("Savings Account Details");
	
	
	savings.accountHolderName=":SRINIVAS ";
	savings.accountType="Savings";
	savings.deposit(5000);
	savings.balance=5000;
	savings.branch="Chennai";
	savings.aadharNumber="1234";
	savings.accountHolderDetails();
	
	
	
	AccountDetails current=new CurrentAccount();
    System.out.println("Current Account Details");
	
	
	current.accountHolderName=": Naveen";
	current.accountType="Current";
	current.deposit(0);
	current.balance=0;
	current.branch="Coimbatore";
	current.aadharNumber="";
	
	current.accountHolderDetails();
	
	
	
	
	
//	System.out.println("Account Holder Name :");
//	savings.accountHolderName=scanner.nextLine();
//	
//	System.out.println("Account Type :") ;
//	savings.accountType=scanner.nextLine();
//	
//	System.out.println("Branch :");
//	savings.branch=scanner.nextLine();
//	
//	System.out.println("Balance amount :");
//	savings.balance=scanner.nextDouble();
//	savings.deposit(3000);
//	savings.aadharNumber="";
	
//	
//	System.out.println("Savings Account Details");
//	savings.deposit(3000);
//	savings.aadharNumber=" ";
//	savings.accountHolderDetails();
	
//	
//	
		
		
	}

}
