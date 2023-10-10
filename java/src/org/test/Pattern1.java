package org.test;

public class Pattern1 {

	public static void main(String[] args) {
		int count = 15;
		int rows = 5;

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j % 2+ " ");
			}

			System.out.println();
		}
	}
}
