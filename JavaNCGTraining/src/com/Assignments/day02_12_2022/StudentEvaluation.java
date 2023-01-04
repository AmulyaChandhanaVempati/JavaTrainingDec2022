package com.Assignments.day02_12_2022;

import java.util.Scanner;

public class StudentEvaluation {
	static Scanner sc = new Scanner(System.in);

	public static void main(String args[]) {
		Student student = new Student();
		// Student student = new Student(103,"Amulya",45,56,78);
		System.out.println("Enter the roll no. of the student:");
		int rollno = sc.nextInt();
		sc.nextLine();
		student.setsRollNo(rollno);
		System.out.println("Enter the name of the student:");
		String name = sc.nextLine();
		student.setsName(name);
		System.out.println("Enter the marks of 1st subject:");
		int sub1Marks = sc.nextInt();
		student.setSub1Marks(sub1Marks);
		System.out.println("Enter the marks of 2nd subject:");
		int sub2Marks = sc.nextInt();
		student.setSub2Marks(sub2Marks);
		System.out.println("Enter the marks of 3rd subject:");
		int sub3Marks = sc.nextInt();
		student.setSub3Marks(sub3Marks);
		student.displayStudentDetails();
	}
}

class Student {
	private int sRollNo;
	private String sName;
	private int sub1Marks, sub2Marks, sub3Marks;

	public Student() {
		super();
	}

	public Student(int sRollNo, String sName, int sub1Marks, int sub2Marks, int sub3Marks) {
		super();
		this.sRollNo = sRollNo;
		this.sName = sName;
		this.sub1Marks = sub1Marks;
		this.sub2Marks = sub2Marks;
		this.sub3Marks = sub3Marks;
	}

	public int getsRollNo() {
		return sRollNo;
	}

	public void setsRollNo(int sRollNo) {
		this.sRollNo = sRollNo;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public int getSub1Marks() {
		return sub1Marks;
	}

	public void setSub1Marks(int sub1Marks) {
		this.sub1Marks = sub1Marks;
	}

	public int getSub2Marks() {
		return sub2Marks;
	}

	public void setSub2Marks(int sub2Marks) {
		this.sub2Marks = sub2Marks;
	}

	public int getSub3Marks() {
		return sub3Marks;
	}

	public void setSub3Marks(int sub3Marks) {
		this.sub3Marks = sub3Marks;
	}

	public int getTotalMarks() {
		return sub1Marks + sub2Marks + sub3Marks;
	}

	public double getAverageMarks() {
		double avg = (getTotalMarks()) / 3;
		return avg;
	}

	public String getResult() {
		if (sub1Marks >= 40 && sub2Marks >= 40 && sub3Marks >= 40) {
			return "Passed";
		}
		return "Failed";
	}

	public String getDivision() {
		if (getResult() == "Failed") {
			return "Failed";
		} else if (getTotalMarks() > 349) {
			return "First Class with distiction";
		} else if (getTotalMarks() >= 250) {
			return "First Class";
		} else if (getTotalMarks() >= 140) {
			return "Third Class";
		} else {
			return "Failed";
		}
	}

	public void displayStudentDetails() {
		System.out.println("Student Roll Number: " + getsRollNo() + "\n" + "Student Name: " + getsName() + "\n"
				+ "Student's Subject 1 marks: " + getSub1Marks() + "\n" + "Student's Subject 2 marks: " + getSub2Marks()
				+ "\n" + "Student's Subject 3 marks: " + getSub3Marks() + "\n");
		System.out.println(
				"Student's Total Marks: " + getTotalMarks() + "\n" + "Student's Average Marks: " + getAverageMarks()
						+ "\n" + "Student's Result: " + getResult() + "\n" + "Student's Division: " + getDivision());
	}

}
