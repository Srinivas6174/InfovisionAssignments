package com.training.bankingProject;

 abstract class AccountDetails implements BankAccountOperation {
	
	String accountHolderName;
	String accountType;
	String branch;
	double balance;
	String aadharNumber;
	
	
	
}
	class SavingsAccount extends AccountDetails{
		
		public void accountHolderDetails() {
			if (aadharNumber == null) {
				System.out.println("You can't create an account provide aadhar number");
			}else {	
			
			System.out.println("Account Holder Name"+" "+accountHolderName);
			System.out.println("Account Type"+" "+accountType);
			System.out.println("Branch"+" "+ branch);
			System.out.println("Balance"+" "+balance);
			System.out.println("AADHAR NUMBER"+" "+aadharNumber);
			
		}
		}
		
		public void deposit(double amount) {
			if(amount>0) {
				balance +=amount;
				System.out.println("Amount Deposited Successfully"+" "+amount);
				
			}else {
				System.out.println("Please deposit the amount");
		}	
		}
		}

		
	
	 class CurrentAccount extends AccountDetails{
		
		 
		 public void accountHolderDetails() {
			 if (aadharNumber == null || aadharNumber.trim().isEmpty()) {
					System.out.println("You can't create an account provide aadhar number");
				}else {	
				
				System.out.println("Account Holder Name"+" "+accountHolderName);
				System.out.println("Account Type"+" "+accountType);
				System.out.println("Branch"+" "+ branch);
				System.out.println("Balance"+" "+balance);
				System.out.println("AADHAR NUMBER"+" "+aadharNumber);
				
			}
			}
		 public void deposit(double amount) {
				if(amount>0) {
					balance +=amount;
					System.out.println("Amount Deposited Successfully"+" "+amount);
					
				}else {
					System.out.println("Please deposit the amount");
			}	
			}
	        }
	 
	 
	 
	

	
	
	


