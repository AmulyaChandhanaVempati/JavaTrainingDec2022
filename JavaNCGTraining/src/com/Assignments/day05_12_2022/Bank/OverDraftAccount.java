package com.Assignments.day05_12_2022.Bank;

public class OverDraftAccount extends Account {

	int years;
	public OverDraftAccount() {
		super();

	}

	public OverDraftAccount(String accountHolderName, int accountNumber, int accountBalance, int years) {
		super(accountHolderName, accountNumber, accountBalance);
		this.years = years;
	}

	public int getYears() {
		return years;
	}

	public void setYears(int years) {
		this.years = years;
	}

	void displayODAccountDetails() {
		displayAccount();
		System.out.println("Number of years: " + years);
	}

}
