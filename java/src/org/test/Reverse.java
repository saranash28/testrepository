package org.test;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		int i=n.nextInt();
		int temp=0;
		while(i!=0)
		{
			temp=temp*10+i%10;
			i=i/10;
		}
		System.out.println("Reverse Number is: "+temp);

	}

}
