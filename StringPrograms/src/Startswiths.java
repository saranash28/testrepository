import java.util.Scanner;

public class Startswiths {
	Scanner m=new Scanner(System.in);
	void findcase() {
	System.out.print("Input: ");
	String s1=m.nextLine();
	System.out.println(s1.startsWith("Welcome"));
	}
	void findcase2() {
		System.out.print("Input: ");
		String s2=m.nextLine();
		System.out.println(s2.endsWith("class"));
		}
	void findcase3() {
		System.out.print("Input: ");
		String s3=m.nextLine();
		System.out.println(s3.isEmpty());
		}
	public static void main(String[] args) {
		Startswiths n=new Startswiths();
		n.findcase3();

	}

}
