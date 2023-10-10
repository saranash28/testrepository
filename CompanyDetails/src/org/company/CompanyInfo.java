package org.company;

public class CompanyInfo {
	
	
	public void companyName() {
		System.out.println("Company Name is ABC pvt ltd");
	}
	public void companyId() {
		System.out.println("Company ID is 12345");
	}
	public void companyAddress() {
		System.out.println("Company Address is Pallavaram");
	}

	public static void main(String[] args) {
		CompanyInfo ci=new CompanyInfo();
		ci.companyName();
		ci.companyId();
		ci.companyAddress();

	}

}
