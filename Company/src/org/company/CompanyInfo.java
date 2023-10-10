package org.company;

public class CompanyInfo {
	//no Arguments
	public void companyName() {
		System.out.println("Company Name is Xyz company");
		
	}
	//One Arguments
	public void companyName(String companyName) {
		System.out.println("Company Name :"+companyName);
		
	}
	//Two Arguments
	public void companyName(String companyName, String location) {
		System.out.println("Company Name :"+companyName);
		System.out.println("Location :"+location);
	}
	

	public static void main(String[] args) {
		CompanyInfo n=new CompanyInfo();
		n.companyName();
		n.companyName("XYZ Comapany");
		n.companyName("XYZ Comapany", "Chennai");

	}

}
