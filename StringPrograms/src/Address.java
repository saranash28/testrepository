import java.util.Scanner;

public class Address {

	public static void main(String[] args) {
		Scanner m=new Scanner(System.in);
		System.out.print("Enter the valid Address: ");
		String s1=m.next();
		if(s1.contains("pincode")) {
			System.out.println("Address is valid");
		}
		else {
			System.out.println("Address is invalid, Please try again");
		}
	}

	}


