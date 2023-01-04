package com.Assignments.day02_12_2022;

public class Containment_Employee_Salary {
	public static void main(String args[]) {
		Employee1 emp = new Employee1(4149, "Amulya Chandhana Vempati", new Salary(23000.0, 45000.0, 54000.0),
				9493936615L, "cvempati@modeln.com");
		emp.displayEmployeeDetails();
	}
}

class Employee1 {
	private int empId;
	private String empName;
	private Salary salary;
	private long mobileNo;
	private String emailId;

	public Employee1() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee1(int empId, String empName, Salary salary, long mobileNo, String emailId) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.mobileNo = mobileNo;
		this.emailId = emailId;
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

	public Salary getSalary() {
		return salary;
	}

	public void setSalary(Salary salary) {
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

	public void displayEmployeeDetails() {
		System.out.println("Employee ID: " + getEmpId() + "\n" + "Employee Name: " + getEmpName() + "\n"
				+ "Employee Salary: \n HRA = " + getSalary().getBasic() + "\n DA = " + getSalary().getDA()
				+ "\n Basic = " + getSalary().getBasic() + "\n" + "Employee phone number: " + getMobileNo() + "\n"
				+ "Employee EmailId: " + getEmailId());
	}
}

class Salary {
	private double HRA;
	private double DA;
	private double Basic;

	public Salary() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Salary(double hRA, double dA, double basic) {
		super();
		HRA = hRA;
		DA = dA;
		Basic = basic;
	}

	public double getHRA() {
		return HRA;
	}

	public void setHRA(double hRA) {
		HRA = hRA;
	}

	public double getDA() {
		return DA;
	}

	public void setDA(double dA) {
		DA = dA;
	}

	public double getBasic() {
		return Basic;
	}

	public void setBasic(double basic) {
		Basic = basic;
	}

}
