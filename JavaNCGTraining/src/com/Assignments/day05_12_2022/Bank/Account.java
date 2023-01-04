package com.Assignments.day05_12_2022.Bank;

public class Account {
	private String accountHolderName;
	private int accountNumber;
	private int accountBalance;

	Account() {
	}

	Account(String accountHolderName, int accountNumber, int accountBalance) {
		this.accountHolderName = accountHolderName;
		this.accountNumber = accountNumber;
		this.accountBalance = accountBalance;
	}

	public int getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}

	public String getAccountHolderName() {
		return accountHolderName;
	}

	public void setAccountHolderName(String accountHolderName) {
		this.accountHolderName = accountHolderName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	void displayAccount() {
		System.out.println("Account Holder Name:" + accountHolderName);
		System.out.println("Account Number:" + accountNumber);
		System.out.println("the balance in the account" + accountBalance);
	}

}
