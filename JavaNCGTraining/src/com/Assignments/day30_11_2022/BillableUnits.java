package com.Assignments.day30_11_2022;
import java.util.Scanner;
public class BillableUnits {
	static Scanner sc = new Scanner(System.in);
	public static void main(String args[]) {
		char category;
		int currentMeterReader;
		int previousMeterReader;
		int BillableUnits;
		int BillableAmount = 0;
		boolean flag = true;
		System.out.println("Enter the category (Enter D for Domestic,C for commercial and I for Industrial): ");
		category = sc.next().charAt(0);
		System.out.println("Enter Current Meter Reader: ");
		currentMeterReader = sc.nextInt();
		System.out.println("Enter Previous Meter Reader: ");
		previousMeterReader = sc.nextInt();
		if (currentMeterReader < previousMeterReader) {
			flag = false;
			System.out.println(
					"Entered previous meter readings are invalid,"
					+ "the previous meter readings should always be less than the current meter readings");
		}
		BillableUnits = currentMeterReader - previousMeterReader;
		if (flag) {
			switch (category) {
			case 'D':
				if (BillableUnits <= 100) {
					BillableAmount = BillableUnits * 1;
					break;
				} else if (BillableUnits <= 200) {
					BillableAmount = 100 + (BillableUnits-100) * 2;
					break;
				} else {
					BillableAmount = 100 + 200 +(BillableUnits-200) * 3;
					break;
				}
			case 'C':
				if (BillableUnits <= 100) {
					BillableAmount = BillableUnits * 2;
					break;
				} else if (BillableUnits <= 200) {
					BillableAmount = 200+ ( BillableUnits-100) * 4;
					break;
				} else {
					BillableAmount = 200 + 800 + (BillableUnits-200) * 6;
					break;
				}
			case 'I':
				if (BillableUnits <= 100) {
					BillableAmount = BillableUnits * 3;
					break;
				} else if (BillableUnits <= 200) {
					BillableAmount = 300 + (BillableUnits-100) * 6;
					break;
				} else {
					BillableAmount = 300 + 1200 + (BillableUnits-200) * 9;
					break;
				}
			}
			System.out.println("Total Billable Amount = " + BillableAmount);
		}
		else {
			System.out.println("Total Billable Amount can not be calculated");
		}
	}
}
