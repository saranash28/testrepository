package org.test;

import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		int i=n.nextInt();
		int j=0;
		while(i>0)
		{
		int m=i%10;
		j=j+m;
		i=i/10;
		}
		System.out.println(j);

	}

}
