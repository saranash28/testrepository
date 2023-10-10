package org.test;

import java.util.Scanner;

public class AmstrongNumber {

	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		int i=n.nextInt();
		System.out.println("Enter the Number: "+i);
		int temp=i;
		int m;
		int sum=0;
		while(i>0)
		{
			m=i%10;
			i=i/10;
			sum=sum+m*m*m;
		}
		if(temp==sum)
		{
			System.out.println("Its an Amstrong number");
		}
		else
		{
			System.out.println("Its not an Amstrong Number");
		}
	}

}
