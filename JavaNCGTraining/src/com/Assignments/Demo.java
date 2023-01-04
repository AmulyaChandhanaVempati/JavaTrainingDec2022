package com.Assignments;

public class Demo {

	public static void main(String[] args) {
		Salary sal = new Salary(234,567);
		System.out.println(sal);
		System.out.println(sal.hashCode());

	}

}
class Salary{
	private int HRA;
	private int DA;
	
	public Salary() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Salary(int hRA, int dA) {
		super();
		HRA = hRA;
		DA = dA;
	}
	public int getHRA() {
		return HRA;
	}
	public void setHRA(int hRA) {
		HRA = hRA;
	}
	public int getDA() {
		return DA;
	}
	public void setDA(int dA) {
		DA = dA;
	}
	
	
	
}