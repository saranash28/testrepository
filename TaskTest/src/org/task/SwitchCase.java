package org.task;

import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
		Scanner m = new Scanner(System.in);

		System.out.print("Enter a number (1-7): ");
		int dayNumber = m.nextInt();

		String dayName;

		switch (dayNumber) {
		case 1:
			dayName = "Sunday";
			break;
		case 2:
			dayName = "Monday";
			break;
		case 3:
			dayName = "Tuesday";
			break;
		case 4:
			dayName = "Wednesday";
			break;
		case 5:
			dayName = "Thursday";
			break;
		case 6:
			dayName = "Friday";
			break;
		case 7:
			dayName = "Saturday";
			break;
		default:
			dayName = "Invalid day";
			break;
		}

		System.out.println("The day is " + dayName);
		m.close();
	}

}
