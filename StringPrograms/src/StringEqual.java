import java.util.Scanner;

public class StringEqual {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("String 1: ");
		String s1=s.next();
		System.out.print("String 2: ");
		String s2=s.next();
		if(s1.equals(s2)==true||s1.equalsIgnoreCase(s2)==true)
		System.out.println("Given input is Equals");
		else {
			System.out.println("Given input is Not Equal");
		}
		

	}

}
