package com.Assignments.day05_12_2022.Loan;

import java.util.Date;

public class Main {

	public static void main(String[] args) {
		HomeLoan hl = new HomeLoan(200000.0,8,6.5,new Date(),"Amulya","Hyderabad","Software Employee",657658.00,"BY23454D");
		hl.displayAllDetails();
		System.out.println(".............................");
		PersonalLoan pl = new PersonalLoan(200000.0,8,6.5,new Date(),"Amulya",45437287425l,410000.0,7564538856l,"amulya@gmail.com");
		hl.displayAllDetails();
		System.out.println(".............................");
		VehicleLoan vl = new VehicleLoan(200000.0,8,6.5,new Date(),"abc-0069","xyz","Amulya");
		hl.displayAllDetails();
	}

}
