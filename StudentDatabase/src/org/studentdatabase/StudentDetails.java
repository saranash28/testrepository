package org.studentdatabase;
import java.util.Scanner;
public class StudentDetails {
	Scanner b=new Scanner(System.in);
	int m1,m2,m3,m4,m5;
	int total;
	public void studentId() {
		int id=b.nextInt();
		System.out.println("Student Id is "+id);
	}
	public void studentName() {
		String name=b.next();
		System.out.println("Student Name is "+name);
	}
	public void marks() {
		m1=b.nextInt();
		m2=b.nextInt();
		m3=b.nextInt();
		m4=b.nextInt();
		m5=b.nextInt();
		System.out.println("In Maths "+m1);
		System.out.println("In Science "+m2);
		System.out.println("In Social "+m3);
		System.out.println("In Tamil "+m4);
		System.out.println("In English "+m5);
		total=m1+m2+m3+m4+m5;
		System.out.println("Total of all subjects is "+total+" out of 500");
		float avg = total/5;
		System.out.println("Averge of all Subject is "+avg);
	}
	public static void main(String[] args) {
		StudentDetails n=new StudentDetails();
		System.out.println("What is Student Id?");
		n.studentId();
		System.out.println("What is Student Name?");
		n.studentName();
		System.out.println("What is marks in all subject?");
		n.marks();
	}
}
