package com.Assignments.day05_12_2022.Loan;

import java.util.Date;

public class PersonalLoan extends Loan {
	private String personName;
	private long personAadharNumber;
	private double personIncome;
	private double personMobileNo;
	private String personEmailId;

	public PersonalLoan() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PersonalLoan(double loanAmount, int numberOfYears, double annualInterestRate, Date loanDate,
			String personName, long personAadharNumber, double personIncome, double personMobileNo,
			String personEmailId) {
		super(loanAmount, numberOfYears, annualInterestRate, loanDate);
		this.personName = personName;
		this.personAadharNumber = personAadharNumber;
		this.personIncome = personIncome;
		this.personMobileNo = personMobileNo;
		this.personEmailId = personEmailId;
	}

	public String getPersonName() {
		return personName;
	}

	public void setPersonName(String personName) {
		this.personName = personName;
	}

	public long getPersonAadharNumber() {
		return personAadharNumber;
	}

	public void setPersonAadharNumber(long personAadharNumber) {
		this.personAadharNumber = personAadharNumber;
	}

	public double getPersonIncome() {
		return personIncome;
	}

	public void setPersonIncome(double personIncome) {
		this.personIncome = personIncome;
	}

	public double getPersonMobileNo() {
		return personMobileNo;
	}

	public void setPersonMobileNo(double personMobileNo) {
		this.personMobileNo = personMobileNo;
	}

	public String getPersonEmailId() {
		return personEmailId;
	}

	public void setPersonEmailId(String personEmailId) {
		this.personEmailId = personEmailId;
	}
	public void displayAllDetails() {
		displayDetails();
		System.out.println("Person Name:"+personName);
		System.out.println("Person AadharNumber:"+personAadharNumber);
		System.out.println("Person Income:"+personIncome);
		System.out.println("Person Mobile Number:"+personMobileNo);
		System.out.println("Person EmailID:"+personEmailId);
	}
}
