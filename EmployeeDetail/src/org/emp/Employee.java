package org.emp;

//import java.util.Scanner;

public class Employee {
	public void empId(int id) {
		System.out.println("Employee Id is : "+id);
	}
	public void empId(String id) {
		System.out.println("Employee Id is : "+id);
	}
	public void empId(double id) {
		System.out.println("Employee Id is : "+id);
	}
	public static void main(String[] args) {
		//Scanner n=new Scanner(System.in);
		Employee m=new Employee();
		
		m.empId(5);
		m.empId(2564323);
		m.empId(2515115.165165);
	}
}

