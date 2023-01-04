package inClassDay08_12_2022.ExceptionHandling;

public class Employee {

	private int empId;
	private String empName;
	private int Salary;
	private long empmobile;
	private String empmailId;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int empId, String empName, int salary, long empmobile, String empmailId) {
		super();
		this.empId = empId;
		this.empName = empName;
		Salary = salary;
		this.empmobile = empmobile;
		this.empmailId = empmailId;
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
	public int getSalary() {
		return Salary;
	}
	public void setSalary(int salary) {
		Salary = salary;
	}
	public long getEmpmobile() {
		return empmobile;
	}
	public void setEmpmobile(long empmobile) {
		this.empmobile = empmobile;
	}
	public String getEmpmailId() {
		return empmailId;
	}
	public void setEmpmailId(String empmailId) {
		this.empmailId = empmailId;
	}
	
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", Salary=" + Salary + ", empmobile=" + empmobile
				+ ", empmailId=" + empmailId + "]";
	}
	
	

}
