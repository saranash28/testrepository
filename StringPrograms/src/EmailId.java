import java.util.Scanner;

public class EmailId {
	public static void main(String[] args) {
		Scanner m=new Scanner(System.in);
		System.out.print("Enter the valid Email id: ");
		String s1=m.next();
		if(s1.contains("@")) {
			System.out.println(s1.contains("@"));
		}
		else {
			System.out.println(s1.contains("@"));
		}
	}

}
