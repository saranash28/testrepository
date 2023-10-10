import java.util.Scanner;

public class Literalstring {
	Scanner m=new Scanner(System.in);
	void hashcode() {
		System.out.print("Input 1: ");
		String s1=m.nextLine();
		System.out.print("Input 2: ");
		String s2=m.nextLine();
		System.out.println(System.identityHashCode(s1));
		System.out.println(System.identityHashCode(s2));
	}	
	void hashcode1() {
		System.out.print("Input 1: ");
		String s1=new String(m.nextLine());
		System.out.println(System.identityHashCode(s1));
		System.out.print("Input 2: ");
		String s2=new String(m.nextLine());
		System.out.println(System.identityHashCode(s2));
	}	
	void hashcode2() {
		System.out.print("Input 1: ");
		String s1=new String(m.nextLine());
		System.out.println(System.identityHashCode(s1));
		System.out.print("Input 2: ");
		String s2=new String(m.nextLine());
		System.out.println(System.identityHashCode(s2));
		System.out.print("Input 3: ");
		String s3=new String(m.nextLine());
		System.out.println(System.identityHashCode(s3));

	}
	void hashcode3() {
		System.out.print("Input 1: ");
		String s1=m.nextLine();
		System.out.println(System.identityHashCode(s1));
		System.out.print("Input 2: ");
		String s2=m.nextLine();
		System.out.println(System.identityHashCode(s2));
		System.out.print("Input 3: ");
		String s3=m.nextLine();
		System.out.println(System.identityHashCode(s3));
		System.out.println(s3.split(" "));
	}

	public static void main(String[] args) {
		Literalstring n=new Literalstring();
		n.hashcode3();
	}
}
