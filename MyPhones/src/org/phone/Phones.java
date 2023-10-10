package org.phone;

public class Phones {
	public void phoneInfo(int phoneNumber) {
		System.out.println("Phone Number: "+phoneNumber);
		
	}
	public void phoneInfo(String phoneName) {
		System.out.println("Phone Number: "+phoneName);
		
	}
	public void phoneInfo(int phoneNumber, String phoneName) {
		System.out.println("Phone Number: "+phoneNumber);
		System.out.println("Phone Number: "+phoneName);
	}
	public static void main(String[] args) {
		Phones n=new Phones();
		n.phoneInfo(987654321);
		n.phoneInfo("Samsung");
		n.phoneInfo(123456789, "Redmi");
	}

}
