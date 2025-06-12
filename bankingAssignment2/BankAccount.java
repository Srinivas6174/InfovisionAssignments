package com.training.bankingAssignment2;

import java.util.Scanner;

public class BankAccount {
	public static void main(String[] args) {
		

		SavingsAccount savingsOriginal=new SavingsAccount("Srinivas", "Savings", 
				"4561190876", "chennai", 1000, "764124579955");
		savingsOriginal.accountCreation(); 
		savingsOriginal.deposit(0);
		savingsOriginal.accountHolderDetails();
		
		SavingsAccount shallow=savingsOriginal.shallowCopy();
		savingsOriginal.setAccountHolderName("Jeevan");
		
		System.out.println("Original Savings Account value: " + savingsOriginal);
        System.out.println("Shallow:  " + shallow);
        
        
        CurrentAccount originalCurrentAccount=new CurrentAccount("Naveen", "", 
				"784456211", "Coimbatore", 2000, "994124579988");
       
        originalCurrentAccount.accountCreation(); 
        originalCurrentAccount.deposit(0);
        originalCurrentAccount.accountHolderDetails();
        
        CurrentAccount shallow1=originalCurrentAccount.shallowCopy();
        originalCurrentAccount.setAccountHolderName("Vignesh");
        
        
        System.out.println("Original Curent Account value: " + originalCurrentAccount);
        System.out.println("Shallow:  " + shallow1);
        

		
	}

}
