package org.edu;

public class Arts extends Education {
public void bsc() {
	System.out.println("B.sc Information");	
	}
public void bEd() {
	System.out.println("B.Ed is for Teachering course ");
}
public void bA() {
	System.out.println("B.A is for pursue Humanities");
}
public void bBA() {
	System.out.println("B.B.A is for Business Management");
}
public void ug() {
	System.out.println("In UG is Bachelor egree");
}
public void pg() {
	System.out.println("In PG is Master Degree");
}
	public static void main(String[] args) {
		Arts n=new Arts();
		n.bA();
		n.bBA();
		n.bEd();
		n.bsc();
		n.ug();
		n.pg();
		
		Education m=new Education();
		m.ug();
		m.pg();
	}

}
