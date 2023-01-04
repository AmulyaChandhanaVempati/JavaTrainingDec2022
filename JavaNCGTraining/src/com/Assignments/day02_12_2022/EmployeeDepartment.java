package com.Assignments.day02_12_2022;

public class EmployeeDepartment {

	public static void main(String[] args) {
		Employee[] empArray = { new Employee(4149, "Amulya Chandhana Vempati", 49999.0, 9893936615l, "amulya@gmail.com", 2),
				new Employee(4194, "Jashwanthi Konakalla", 43000.0, 989456615l, "jashwanthi@gmail.com", 4),
				new Employee(4163, "Nikhitha Vegi", 42000.0, 9456936615l, "nikhitha@gmail.com", 8),
				new Employee(4169, "Shruthi Pachava", 54000.0, 9894567815l, "shruthi@gmail.com", 10) };
		Department department = new Department(101, "Product Development", empArray);
		department.displayDepartmentDetails();
		System.out.println("Total Salary Payed To The Department:" + department.getTotalSalaryPayedToTheDepartment());
		System.out.println("Employee Name Getting Highest Salary:" + department.getEmployeeNameGettingHighestSalary());
		department.displayAllEmployeesDetails();
		department.displayAllEmployeeSalaries();
		department.incrementEmployeeSalary();
		department.displayAllEmployeeSalaries();

	}

}

class Department {
	private int departmentNumber;
	private String departmentName;
	public Employee[] employee;

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(int departmentNumber, String departmentName, Employee[] employee) {
		super();
		this.departmentNumber = departmentNumber;
		this.departmentName = departmentName;
		this.employee = employee;
	}

	public int getDepartmentNumber() {
		return departmentNumber;
	}

	public void setDepartmentNumber(int departmentNumber) {
		this.departmentNumber = departmentNumber;
	}

	public String getDepartmentName() {
		return departmentName;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public Employee[] getEmployee() {
		return employee;
	}

	public void setEmployee(Employee[] employee) {
		this.employee = employee;
	}

	public void incrementSalary(int empId) {

	}

	public String getEmployeeNameGettingHighestSalary() {
		String employeeName = getEmployee()[0].getEmpName();
		for (int i = 0; i < getEmployee().length - 1; i++) {
			if (getEmployee()[i + 1].getSalary() > getEmployee()[i].getSalary()) {
				employeeName = getEmployee()[i + 1].getEmpName();
			}
		}
		return employeeName;
	}

	public double getTotalSalaryPayedToTheDepartment() {
		double totalSalary = 0.0;
		for (int i = 0; i < getEmployee().length; i++) {
			totalSalary += getEmployee()[i].getSalary();
		}
		return totalSalary;
	}

	public void incrementEmployeeSalary() {
		for (int i = 0; i < employee.length; i++) {
			// Employee empx = employee[0];
			// System.out.println(empx);
			employee[i].incrementSalary();
		}
		System.out.println("\nEmployees salaries are incremented! ");
		System.out.println();
	}

	public void displayAllEmployeeSalaries() {
		System.out.print("Employees and their salaries: \n");
		for (int i = 0; i < getEmployee().length; i++) {
			System.out.print("Employee " + (i + 1));
			System.out.println(" Salary: " + getEmployee()[i].getSalary());

		}
	}

	public void displayAllEmployeesDetails() {
		System.out.println("Employees and their details: \n");
		for (int i = 0; i < getEmployee().length; i++) {
			System.out.println("Employee " + (i + 1));
			System.out.println("Employee ID: " + getEmployee()[i].getEmpId());
			System.out.println("Employee Name: " + getEmployee()[i].getEmpName());
			System.out.println("Employee Salary: " + getEmployee()[i].getSalary());
			System.out.println("Employee Mobile Number: " + getEmployee()[i].getMobileNo());
			System.out.println("Employee Email ID: " + getEmployee()[i].getEmailId());
			System.out.println("Employee Seniority: " + getEmployee()[i].getSeniority());
			System.out.println("......................................");
		}
	}

	public void displayDepartmentDetails() {
		System.out.print("Department Number: " + getDepartmentNumber() + "\n" + "Department Name: "
				+ getDepartmentName() + "\n" + "Employees in the department : \n");
		for (int i = 0; i < getEmployee().length; i++) {
			System.out.println("Employee " + (i + 1) + ": " + getEmployee()[i].getEmpName());
		}
	}
}

class Employee {
	private int empId;
	private String empName;
	private double salary;
	private long mobileNo;
	private String emailId;
	private int seniority;

	public Employee() {
		super();
	}

	public Employee(int empId, String empName, double salary, long mobileNo, String emailId, int seniority) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.mobileNo = mobileNo;
		this.emailId = emailId;
		this.seniority = seniority;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getSeniority() {
		return seniority;
	}

	public void setSeniority(int seniority) {
		this.seniority = seniority;
	}

	public void incrementSalary() {
		// double newSalary = getSalary();
		if (seniority <= 2) {
			salary += (salary * (10)) / 100;
			// salary=1000;
		} else if (seniority > 2 && seniority <= 5) {
			salary += (salary * (20)) / 100;
			// salary=1000;
		} else {
			salary += (salary * (30)) / 100;
		}
		// setSalary(newSalary);
	}
}
