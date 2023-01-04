package EmployeeMenu;

public class Employee {
	private int empid;
	private String ename;
	private double salary;
	private long mobileNo;
	private String emailId;

	public Employee() {
	}

	public Employee(int empid, String ename, double salary, long mobileNo, String emailId) {
		this.empid = empid;
		this.ename = ename;
		this.salary = salary;
		this.mobileNo = mobileNo;
		this.emailId = emailId;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public void setMobileNo(long mobileNo) {
		this.mobileNo = mobileNo;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getEmpid() {
		return empid;
	}

	public String getEname() {
		return ename;
	}

	public double getSalary() {
		return salary;
	}

	public long getMobileNo() {
		return mobileNo;
	}

	public String getEmailId() {
		return emailId;
	}
}