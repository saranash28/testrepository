package org.task;

import java.util.Scanner;

public class OddorEven {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		System.out.print("Enter the Value: ");
		int i = n.nextInt();
			if(i%2==0) {
				System.out.println("Entered value is Even number");		
			}
			else {
				System.out.println("Entered value is Odd number");
			}
			n.close();
		}
}
