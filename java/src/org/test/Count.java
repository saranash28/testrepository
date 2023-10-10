package org.test;

import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		int i=n.nextInt();
		int j=0;
		while(i>0)
		{
			i=i/10;
			j=j+1;
		}
		System.out.println("Count of number is: "+j);
	}

}
