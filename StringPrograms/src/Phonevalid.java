import java.util.Scanner;

public class Phonevalid {
	public static void main(String[] args) {
		Scanner m=new Scanner(System.in);
		System.out.print("Enter the Phone Number: ");
		String s1=m.nextLine();
		if(s1.matches("[0-9]+")) {
			System.out.println("Phone Number is valid");
		}
		else {
			System.out.println("Phone Number is not valid, Please try again");
		}
	}

}
