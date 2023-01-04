package com.Assignments.day05_12_2022.Loan;

import java.util.Date;

public class HomeLoan extends Loan {
	private String houseOwnerName;
	private String houseAddress;
	private String houseOwerJob;
	private double propertyValue;
	private String ownerPanNumber;

	public HomeLoan() {
		super();
	}

	public HomeLoan(double loanAmount, int numberOfYears, double annualInterestRate, Date loanDate,
			String houseOwnerName, String houseAddress, String houseOwerJob, double propertyValue,
			String ownerPanNumber) {
		super(loanAmount, numberOfYears, annualInterestRate, loanDate);
		this.houseOwnerName = houseOwnerName;
		this.houseAddress = houseAddress;
		this.houseOwerJob = houseOwerJob;
		this.propertyValue = propertyValue;
		this.ownerPanNumber = ownerPanNumber;
	}

	public String getHouseOwnerName() {
		return houseOwnerName;
	}

	public void setHouseOwnerName(String houseOwnerName) {
		this.houseOwnerName = houseOwnerName;
	}

	public String getHouseAddress() {
		return houseAddress;
	}

	public void setHouseAddress(String houseAddress) {
		this.houseAddress = houseAddress;
	}

	public String getHouseOwerJob() {
		return houseOwerJob;
	}

	public void setHouseOwerJob(String houseOwerJob) {
		this.houseOwerJob = houseOwerJob;
	}

	public double getOwnerProperty() {
		return propertyValue;
	}

	public void setOwnerProperty(double propertyValue) {
		this.propertyValue = propertyValue;
	}

	public String getOwnerPanNumber() {
		return ownerPanNumber;
	}

	public void setOwnerPanNumber(String ownerPanNumber) {
		this.ownerPanNumber = ownerPanNumber;
	}
	
	public void displayAllDetails() {
		displayDetails();
		System.out.println("House Owner Name:"+houseOwnerName);
		System.out.println("House Address:"+houseAddress);
		System.out.println("House Owner Job:"+houseOwerJob);
		System.out.println("House Owner Property:"+propertyValue);
		System.out.println("House Owner PanNumber:"+ownerPanNumber);
	}

}
