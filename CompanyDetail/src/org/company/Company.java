package org.company;

import org.client.Client;

public class Company extends Client {
	public void companyName() {
		System.out.println("Company Name is ABC pvt Ltd");
	}
	public static void main(String[] args) {
		Company m=new Company();
		m.companyName();
		m.clientName();
	}
}
