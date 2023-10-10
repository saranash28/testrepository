import java.util.Scanner;

public class Substrings {
	Scanner m=new Scanner(System.in);

	void substrings() {
		System.out.print("Input 1: ");
		String s1=m.nextLine();
		System.out.println(s1.substring(0, 7));
	}

	public static void main(String[] args) {
		Substrings b=new Substrings();
		b.substrings();

	}

}
