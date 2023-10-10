package org.task;

import java.util.Scanner;

public class Scannner {
	
	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.print("What is your name: ");
		String name =n.next();
		System.out.println("My name is "+name);
		System.out.print("Give your Mobile No: ");
		long mobno=n.nextLong();
		System.out.println("Mobile.No is "+mobno);
		System.out.print("What's your Mark in Maths: ");
		float mark = n.nextFloat();
		System.out.println("Maths mark is "+mark);
		n.close();
	}

}
