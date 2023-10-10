package org.employeedatabase;
import java.util.Scanner;
public class EmployeeDatabase {
	Scanner n=new Scanner(System.in);
	public void empId() {
		int id=n.nextInt();
		System.out.println("The Employee Id is "+id);
	}
	public void empName() {
		String name=n.next();
		System.out.println("The Employee Name is "+name);
	}
	public void empEmail() {
		String email=n.next();
		System.out.println("The Employee Email is "+email);
	}
	public void empPhonenumber() {
		long phoneno=n.nextLong();
		System.out.println("The Employee Phone Number is "+phoneno);
	}
	public void empSalary() {
		float salary=n.nextFloat();
		System.out.println("The Employee Salary is "+salary);
	}
	public void empGender() {
		String gender=n.next();
		System.out.println("The Employee Gender is "+gender);
	}
	public void empCity() {
		String city=n.next();
		System.out.println("The Employee City is "+city);
	}
	public static void main(String[] args) {
		EmployeeDatabase m=new EmployeeDatabase();
		System.out.println("What is Employee ID?");
		m.empId();
		System.out.println("What is Employee Name?");
		m.empName();
		System.out.println("What is Employee Email ID?");
		m.empEmail();
		System.out.println("What is Employee Phone Number?");
		m.empPhonenumber();
		System.out.println("What is Employee Salary?");
		m.empSalary();
		System.out.println("What is Employee Gender?");
		m.empGender();
		System.out.println("What is Employee City?");
		m.empCity();
	}

}
