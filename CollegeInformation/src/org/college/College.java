package org.college;

public class College extends Student {
	public void collegeName() {
		System.out.println("MRM Engineering College");
	}
public void collegeCode() {
		System.out.println("College code is 3104");
	}
public void collegeRank() {
	System.out.println("College Rank is 5th");
}

	public static void main(String[] args) {
		College c=new College();
		c.collegeName();
		c.collegeCode();
		c.collegeName();
		c.studentName();
		c.studentDept();
		c.studentId();
		c.hostelName();
		c.deptName();

	}

}
