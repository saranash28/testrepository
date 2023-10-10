package org.add;


public class CollegeTech {
	public void deptName (int deptNumber) {
		System.out.println("Department No: "+deptNumber);
		
	}
	public void deptName (String deptName) {
		System.out.println("Department Name: "+deptName);
		
	}
	public void deptName (int deptNumber, String deptName) {
		System.out.println("Department No: "+deptNumber);
		System.out.println("Department Name: "+deptName);
	}
	public void deptName (int deptNumber, String deptName, String deptName1) {
		System.out.println("Department No: "+deptNumber);
		System.out.println("Department Name: "+deptName);
		System.out.println("Department Name: "+deptName1);
	}
	public static void main(String[] args) {
		
		CollegeTech n=new CollegeTech();
		n.deptName(12345);
		n.deptName("ECE Deparment");
		n.deptName(123456, "Mechanical Department");
		n.deptName(1234567, "CSE Department", "IT Department");

	}

}
