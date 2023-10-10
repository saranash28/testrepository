package org.test;

import java.util.Scanner;

public class OddEven {

	public static void main(String[] args) {
		Scanner m=new Scanner(System.in);
		System.out.println("Find this number is Odd or Even??");
		int i=m.nextInt();
		
        String[] parity = {"Even", "Odd"};
        System.out.println(i + " is " + parity[i & 1]);
		
		m.close();
	}

}
