package com.Assignments.day05_12_2022.Bank;

public class CurrentAccount extends Account {
	int overDraftFacilityLimit;

	public CurrentAccount() {

	}

	public CurrentAccount(String accountHolderName, int accountNumber, int balance, int overDraftFacilityLimit) {
		super(accountHolderName, accountNumber, balance);
		this.overDraftFacilityLimit = overDraftFacilityLimit;
	}

	public int getoverDraftFacilityLimit() {
		return overDraftFacilityLimit;
	}

	public void setoverDraftFacilityLimit(int overDraftFacilityLimit) {
		this.overDraftFacilityLimit = overDraftFacilityLimit;
	}

	void displayCurrentAccount() {
		displayAccount();
		System.out.println("OverDraft Facility Limit:" + overDraftFacilityLimit);
	}

}
