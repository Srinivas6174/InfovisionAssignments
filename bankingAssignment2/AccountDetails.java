package com.training.bankingAssignment2;

public abstract class AccountDetails {
	String accountHolderName;
	String accountType;
	String accountNumber;
	String branch;
	double balance;
	String aadharNumber;
	
	
public AccountDetails(String branch,String accountHolderName, String accountType,String accountNumber,
double balance,String aadharNumber) {
	this.accountHolderName=accountHolderName;
	this.accountType=accountType;
	this.accountNumber=accountNumber;
	this.branch=branch;
	this.balance=balance;
	this.aadharNumber=aadharNumber;
	
		
	}
		
	public String getAccountHolderName() {
		return accountHolderName;
	}
	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}
	public String getAccountType() {
		return accountType;
	}
	public void setAccountType(String accountType) {
		this.accountType = accountType;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getAadharNumber() {
		return aadharNumber;
	}
	public void setAadharNumber(String aadharNumber) {
		this.aadharNumber = aadharNumber;
	}

	
public String toString() {
	return "AccountHolder Name"+" "+accountHolderName;
}
	
	
}
