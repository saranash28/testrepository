package org.test;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		int i=n.nextInt();
		int j=0;
		int temp=i;
		while(i>0)
		{
		int m=i%10;
		j=(j*10)+m;
		i=i/10;
		}
		if(temp==j) {
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}

	}

}
