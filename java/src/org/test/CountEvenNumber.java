package org.test;

public class CountEvenNumber {

	public static void main(String[] args) {
		int i;
		int count = 0;
		for(i=1;i<=100;i++) {
			if(i%2==0) {
				count=i/2;
				
			}
			
		}
		System.out.println(count);
		
	}

}
