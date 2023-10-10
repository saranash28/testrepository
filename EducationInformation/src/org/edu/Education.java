package org.edu;
public class Education extends Arts{
	public void ug() {
		System.out.println("In UG there will be Bachelor Degree");
	}
	public void pg() {
		System.out.println("In PG there will be Master Degree");
	}
	public static void main(String[] args) {
		Education n=new Education();
		n.ug();
		n.pg();
		n.bsc();
		n.bEd();
		n.bA();
		n.bBA();
		n.bE();
		n.bTech();
		n.physiyo();
		n.dental();
		n.mbbs();
	}

}
