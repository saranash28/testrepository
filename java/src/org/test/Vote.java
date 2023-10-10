package org.test;

import java.util.Scanner;

public class Vote {

	public static void main(String[] args) {
		Scanner m=new Scanner(System.in);
		System.out.println("Is the person eligible for voting??");
		int i = m.nextInt();
		if(i<=18)
		{
			System.out.println("Is not Eligible");
		}
		else{
			System.out.println("Eligible for Voting");
		}
		
	}

}
