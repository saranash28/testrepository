package org.company;

public class BankInfo extends AxisBank{
	void saving(){
		System.out.println("Savings 5%");
	}
	void fixed(){
		System.out.println("fixed 10%");
	}
	public static void main(String args[]) {
		BankInfo b = new BankInfo();
		b.saving();
		b.fixed();
		b.deposit();
	}
}
