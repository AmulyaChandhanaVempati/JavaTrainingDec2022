package com.Assignments.day05_12_2022.Loan;

import java.util.Date;

public class VehicleLoan extends Loan {
	private String vehicleNumber;
	private String vehicleType;
	private String vehicleOwner;

	public VehicleLoan() {
		super();
	}

	public VehicleLoan(double loanAmount, int numberOfYears, double annualInterestRate, Date loanDate,
			String vehicleNumber, String vehicleType, String vehicleOwner) {
		super(loanAmount, numberOfYears, annualInterestRate, loanDate);
		this.vehicleNumber = vehicleNumber;
		this.vehicleType = vehicleType;
		this.vehicleOwner = vehicleOwner;
	}

	public String getVehicleNumber() {
		return vehicleNumber;
	}

	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getVehicleOwner() {
		return vehicleOwner;
	}

	public void setVehicleOwner(String vehicleOwner) {
		this.vehicleOwner = vehicleOwner;
	}
	public void displayAllDetails() {
		displayDetails();
		System.out.println("Vehicle Number:"+vehicleNumber);
		System.out.println("Vehicle Type:"+vehicleType);
		System.out.println("Vehicle Owner:"+vehicleOwner);
	}

}
