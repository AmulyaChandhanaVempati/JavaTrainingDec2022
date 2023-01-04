package com.Assignments.day05_12_2022.Bank;

public class SavingsAccount extends Account {

	int numberOfTransactions;

	public SavingsAccount() {
	}

	SavingsAccount(String accountHolderName, int accountNumber, int balance, int numberOfTransactions) {
		super(accountHolderName, accountNumber, balance);
		this.numberOfTransactions = numberOfTransactions;
	}

	public int getNumberOfTransactions() {
		return numberOfTransactions;
	}

	public void setNumberOfTransactions(int numberOfTransactions) {
		this.numberOfTransactions = numberOfTransactions;
	}

	void displaySavingsAccount() {
		displayAccount();
		System.out.println("Number of transactions:" + numberOfTransactions);
	}

}
