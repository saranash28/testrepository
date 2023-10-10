package org.uni;

public class College extends University {
	public void ug() {
		System.out.println("UG is available");
	}
	public void pg() {
		System.out.println("PG is available");
	}
	public static void main(String[] args) {
		College n=new College();
		n.ug();
		n.pg();
		University m=new University();
		m.ug();
		m.pg();
	}
}
