package org.task;

public class ControlStatements {

	public static void main(String[] args) {
		int rows = 5;
		int columns = 5;
		char count=65;
		 for (int i = 0; i < rows; i++) {
	            char currentChar = (char)(count + i);
	            for (int j = 0; j < columns; j++) {
	                System.out.print(currentChar + " ");
	                currentChar = (char)(currentChar - 5);
	            }
            System.out.println();
			 }
	
	}
}
