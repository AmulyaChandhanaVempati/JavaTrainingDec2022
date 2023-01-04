package com.Assignments.day30_11_2022;

import java.util.Scanner;

public class PrimeNumberInRange {
	Scanner sc = new Scanner(System.in);
	public static void main(String args[]) {
		System.out.println("The following are the prime numbers in the range 1 to 1000");
		for (int i = 1; i <= 1000; i++) {
			if (isPrime(i)) {
				System.out.print(i + " ");
			}
		}
	}
	public static boolean isPrime(int value) {
		int count = 0;
		for (int i = 2; i <= (value / 2); i++) {
			if (value % i == 0) {
				count++;
				if (count > 1) {
					break;
				}
			}
		}
		if (count > 0) {
			return false;
		} else {
			return true;
		}

	}
}
