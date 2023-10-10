package org.test;

public class Oddnumber {

	public static void main(String[] args) {
			int i;
			int sum = 0;
			for(i=1;i<=100;i++) {
				if(i%2!=0) {
					sum=i+sum;		
				}
				
			}
			System.out.println(sum);
	}

}
