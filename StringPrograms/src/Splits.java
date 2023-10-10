import java.util.Scanner;

public class Splits {
	Scanner m=new Scanner(System.in);

	void splits() {
		System.out.print("Input 1: ");
		String s1=m.nextLine();
		String[] word=s1.split(" "); //Welcome To Java Class
		for(String i:word) {
			System.out.println(i);
		}
	}
	void splits2() {
		System.out.print("Input 1: ");
		String s1=m.nextLine();
		String[] word=s1.split("l"); //Welcome To Java Class
		for(String i:word) {
			System.out.println(i);
		}
	}
	public static void main(String[] args) {
		Splits k=new Splits();
		k.splits2();

	}

}
