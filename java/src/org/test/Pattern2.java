package org.test;

public class Pattern2 {

	public static void main(String[] args) {
		for(int i=1;i<=3;i++) 
		{
			for(int j=3;j>=i;j--) 
			{
				System.out.print(" ");
			}
			for(int m=1;m<=i;m++) {
			System.out.print("*");
			}
			for(int n=2;n<=i;n++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
