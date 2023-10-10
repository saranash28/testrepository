import java.util.Scanner;

public class CompareWords {

	Scanner m=new Scanner(System.in);
	void findcase() {
	System.out.print("Input 1: ");
	String s1=m.nextLine();
	System.out.print("Input 2: ");
	String s2=m.nextLine();
	System.out.println(s1.equalsIgnoreCase(s2));
	}
	

	public static void main(String[] args) {
		CompareWords n=new CompareWords();
		n.findcase();
	}


}