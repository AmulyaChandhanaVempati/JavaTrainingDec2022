package inClassDay08_12_2022.ExceptionHandling;

import java.util.Scanner;

public class CustomException {
	static Scanner sc = new Scanner(System.in);
	static final int minValue = 100;
	static final int maxValue = 1000;
	static boolean flag = false;
	static int count = 0;

	public static void main(String[] arg) {
		System.out.println("Enter the number of attempts you want to try : ");
		int NumberOfAttempts = sc.nextInt();
		count = 0;
		int realVal = NumberOfAttempts;
		while (NumberOfAttempts-- > 0) {
			System.out.println("Enter the value to validate : ");
			String ActualValue = sc.next();
			count++;
			try {
				validate(ActualValue);
				flag = true;
				break;
			} catch (NotANumberException ex) {
				System.out.println(ex);
			} catch (NotInRangeException ex) {
				System.out.println(ex);
			}
		}
		if (flag == false) {
			System.out.println("Not Success in " + realVal + " number of attempts");
		}
	}

	private static void validate(String actualValue) throws NotInRangeException, NotANumberException {
		int x = 0;
		try {
			int value = Integer.valueOf(actualValue);
		} catch (NumberFormatException e) {
			x = 1;
		}

		if (x == 1) {
			throw new NotANumberException("Given input is not a number");
		} else if (Integer.valueOf(actualValue) > maxValue || Integer.valueOf(actualValue) < minValue) {
			throw new NotInRangeException(
					"Given number is not in range, valid input is between " + minValue + " and " + maxValue);
		} else {
			System.out.println("Success in " + count + " number of attemps");
		}
	}
}

class NotANumberException extends Exception {

	public NotANumberException(String str) {
		super(str);
	}

}

class NotInRangeException extends Exception {

	public NotInRangeException(String str) {
		super(str);
	}

}