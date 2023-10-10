package org.college;

public class Student extends College{
	public void studentName()
	{
		System.out.println("Student Name is Sam");
	}
	public void studentDept()
	{
		System.out.println("Student Dept is IT");
	}
	public void studentId()
	{
		System.out.println("Student ID is 12345678978");
	}
	public static void main(String[] args) {
		Student m=new Student();
		m.collegeName();
		m.collegecode();
		m.collegeRank();
		m.studentName();
		m.studentDept();
		m.studentId();
		m.hostelName();
		m.deptName();
	}

}
