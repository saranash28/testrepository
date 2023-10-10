package org.task;

import java.util.Scanner;

public class AsciiValue {

	public static void main(String[] args) {
        Scanner m = new Scanner(System.in);
        char ch = m.next().charAt(0);

        int asciiValue = (int) ch;

        System.out.println("ASCII value of " + ch + " is " + asciiValue);

        m.close();
	
    }

}
