package org.task;

import java.util.Scanner;

public class CountOddorEven {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.print("Enter The Value: ");
		int j =n.nextInt();
		int oddCount = 0;
	    int evenCount = 0;

		for (int i = 1; i <= j; i++) {
			if (i % 2 == 0) {
				evenCount++;
			} 
			else {
				oddCount++;
			}
			
		}System.out.println("Even Count is "+evenCount);
		System.out.println("Odd Count is "+oddCount);
		n.close();
		
	

	}

}
