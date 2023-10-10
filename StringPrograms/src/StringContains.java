import java.util.Scanner;

public class StringContains {

	public static void main(String[] args) {
		Scanner m=new Scanner(System.in);
		System.out.print("Enter the valid Email id: ");
		String s1=m.next();
		if(s1.contains("@")) {
			System.out.println("Email ID is valid");
		}
		else {
			System.out.println("Email ID is not valid, Please try again");
		}
	}

}
