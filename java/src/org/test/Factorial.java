package org.test;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		System.out.println("Enter The Number?");
		int fact=1;
		int a=n.nextInt();
		for(int i=1;i<=a;i++) {
			fact=fact*i;
		}
		System.out.println("The Factorial of "+a+" is "+fact);
	}

}
