package inClassDay15_12_2022;

import java.io.IOException;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;

class EmployeeNotExist extends Exception {

	EmployeeNotExist(String str) {
		super(str);
	}
}

public class Employee {

	public static void employeeDetails() throws IOException {
		FileReader f1 = new FileReader("C:\\Users\\salaparthi\\OneDrive - MODEL N, INC\\Desktop\\Employee.txt");
		BufferedReader b1 = new BufferedReader(f1);

		System.out.println("Enter Employee Name:");
		Scanner sc = new Scanner(System.in);
		String empName = sc.next();
		boolean flag = true;

		String line = null;

		while ((line = b1.readLine()) != null) {
			// System.out.println(line);
			String[] arr = line.split(",");

			if (empName.equals(arr[1])) {
				System.out.println("Employee details:");
				for (String emp : arr) {
					System.out.println(emp);
				}
				flag = false;
			}

		}

		f1.close();
		sc.close();

		if (flag) {
			try {
				throw new EmployeeNotExist("Employee not exist with that id");
			} catch (EmployeeNotExist e) {
				System.out.println(e.getMessage());
			}
		}

	}

	public static void main(String... args) throws IOException {
		employeeDetails();
	}
}