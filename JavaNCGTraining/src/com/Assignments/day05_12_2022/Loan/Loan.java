package com.Assignments.day05_12_2022.Loan;

import java.util.Date;

public class Loan {
	private double loanAmount;
	private int numberOfYears;
	private double annualInterestRate;
	private Date LoanDate;

	public Loan() {
		super();
	}

	public Loan(double loanAmount, int numberOfYears, double annualInterestRate, Date loanDate) {
		super();
		this.loanAmount = loanAmount;
		this.numberOfYears = numberOfYears;
		this.annualInterestRate = annualInterestRate;
		LoanDate = loanDate;
	}

	public double getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}

	public int getNumberOfYears() {
		return numberOfYears;
	}

	public void setNumberOfYears(int numberOfYears) {
		this.numberOfYears = numberOfYears;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public Date getLoanDate() {
		return LoanDate;
	}

	public void setLoanDate(Date loanDate) {
		LoanDate = loanDate;
	}

	public double getMonthlyPayment() {
		double monthlyInterestRate = annualInterestRate / 1200;
		double monthlyPayment = loanAmount * monthlyInterestRate
				/ (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
		return monthlyPayment;
	}

	public double getTotalPayment() {
		double totalPayment = getMonthlyPayment() * numberOfYears * 12;
		return totalPayment;
	}
	
	public void displayDetails() {
		System.out.println("Loan Amount: "+loanAmount);
		System.out.println("Number Of Years: "+numberOfYears);
		System.out.println("Annual Interest Rate: "+annualInterestRate);
		System.out.println("Loan Date: "+LoanDate);
		getAnnualInterestRate();
		getTotalPayment();
		
	}
}
