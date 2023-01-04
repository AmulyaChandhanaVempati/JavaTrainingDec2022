package inClassDay05_12_2022;

public class Inheritence {

	public static void main(String[] args) {
		//Employee emp = new Employee(7889,"Amulya Chandhana",21,4149,41000.0);
		//emp.displayEmployee();

	}

}

class Person{
	private int ssn;
	private String name;
	private int age;
	public Person() {
		super();
	}
	public Person(int ssn, String name, int age) {
		super();
		this.ssn = ssn;
		this.name = name;
		this.age = age;
	}
	public int getSsn() {
		return ssn;
	}
	public void setSsn(int ssn) {
		this.ssn = ssn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void displayPerson() {
		System.out.println("Ssn :"+ssn);
		System.out.println("Name : "+name);
		System.out.println("Age :"+ age);
	}
}
class Employee extends Person{
	private int empid;
	private double salary;
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int ssn, String name, int age,int empid,double salary) {
		super(ssn, name, age);
		// TODO Auto-generated constructor stub
		this.empid = empid;
		this.salary = salary;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void displayEmployee() {
		displayPerson();
		System.out.println("Empid:" +empid);
		System.out.println("Salary: " +salary);
		
	}
}