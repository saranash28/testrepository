package org.test;

//import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		//Scanner n=new Scanner(System.in);
		int i=0;
		int j=1;
		int count=12;
		System.out.print(i+" "+j);
		for(int m=2;m<count;m++) {
			int b=i+j;
			System.out.print(" "+b);
			i=j;
			j=b;
		}
	}

}
