package org.test;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		System.out.println("Find the number is prime number or not?");
		int no=n.nextInt();
		int temp=0;
		for(int i=2;i<=no-1;i++)
		{
			if(no%i==0)
			{
				temp=temp+1;
			}
			
		}
		if(temp>0)
		{
			System.out.println("Its not Prime Number");
		}
		else
		{
			System.out.println("Its Prime Number");
		}

	}

}
