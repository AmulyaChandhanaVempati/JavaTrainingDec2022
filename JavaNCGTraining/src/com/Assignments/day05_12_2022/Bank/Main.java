package com.Assignments.day05_12_2022.Bank;

public class Main {

	public static void main(String[] args) {
		CurrentAccount ca=new CurrentAccount("Amulya Chandhana Vempati",12324645,4565670,20000);
		ca.displayCurrentAccount();
		System.out.println("................");
		SavingsAccount sa=new SavingsAccount("Nikhitha Vegi",153244557,35528876,3);
		sa.displaySavingsAccount();
		System.out.println("................");
		OverDraftAccount oda=new OverDraftAccount("Jashwanthi Konakalla",82248887,3556786,7);
		oda.displayODAccountDetails();;

	}

}
