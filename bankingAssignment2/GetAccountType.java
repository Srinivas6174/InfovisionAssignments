package com.training.bankingAssignment2;

public class GetAccountType extends AccountDetails  implements AccountType{

	public GetAccountType(String branch, String accountHolderName, String accountType, String accountNumber,
			double balance, String aadharNumber) {
		super(branch, accountHolderName, accountType, accountNumber, balance, aadharNumber);
	}

	@Override
	public AccountDetails getAccountByType() {
		if("Savings".equals(accountType)) {
			
		return new SavingsAccount(accountHolderName, accountNumber, accountType, branch, balance, aadharNumber);
	} else if ("Current".equals(accountType)) {
		
		return new CurrentAccount(accountHolderName, accountNumber, accountType, branch, balance, aadharNumber);

		
		
	}
		return null;

	

}

}
