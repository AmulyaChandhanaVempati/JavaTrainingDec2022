package inClassDay08_12_2022;

import java.util.Scanner;

public class HandlingException {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int x = sc.nextInt();
		System.out.println("Enter the second number:");
		int y = sc.nextInt();
		int[] b = { 1, 2 };
		// System.out.println("End");
		try {
			System.out.println(x / y);
			try {
				System.out.println(b[3]);
			} catch ( ArithmeticException e) {
				e.printStackTrace();
			}
		} catch (Exception e4) {
			e4.printStackTrace();

		} 

		finally {
			System.out.println("end");
		}
		System.out.println("end------------");

	}

}
