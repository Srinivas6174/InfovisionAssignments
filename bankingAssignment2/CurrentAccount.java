package com.training.bankingAssignment2;

public class CurrentAccount extends AccountDetails implements AccountService {

	public CurrentAccount(String accountHolderName, String accountType, String accountNumber, String branch,
			double balance, String aadharNumber) {
		super(accountHolderName, accountType, accountNumber, branch, balance, aadharNumber);
		
	}
	
	public CurrentAccount shallowCopy() {
		return this;
	}
	
boolean accountCreated=true;
	
	@Override
	public void accountCreation() {
		
			if(aadharNumber!=null && !aadharNumber.trim().isEmpty()) {
				System.out.println(" Current account created successfully");
				accountCreated=true;
			}
		else {
			System.out.println("You can't create an account provide valid aadhar number");
               accountCreated=false;
		}
		
		
	}

	@Override
	public void deposit(double amount) {
		if(accountCreated== true) {
			//System.out.println("Account not created");
			return;
		}
		if(amount>0) {
			if(accountNumber.matches("\\d{10}")) {
				balance +=amount;
	      	System.out.println("Amount Deposited Successfully"+" "+amount);	
			}else {
				System.out.println("Provide valid account number");
			}
		}
		else {
			System.out.println("Enter Valid amount");
		}
	}
	
	public void deposit(double amount,String modeOfPayment) {
		
		setBalance(getBalance()+amount);
		System.out.println("Deposited amount via cash");
	}


	@Override
	public void accountHolderDetails() {
		if(accountCreated==true ) {
			
		System.out.println("---------Display Current Account Holder Details--------");
		
		System.out.println("Account Holder Name"+" "+accountHolderName);
		System.out.println("Account Type"+" "+accountType);
		System.out.println("AccountNumber "+" "+accountNumber);
		System.out.println("Branch"+" "+ branch);
		System.out.println("Balance"+" "+balance);
		System.out.println("AADHAR NUMBER"+" "+aadharNumber);
		}else {

		}
	}
	
}
