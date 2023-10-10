import java.util.Scanner;

public class Lowercase {
	Scanner m=new Scanner(System.in);
	void lowercase() {
	System.out.print("Input: ");
	String s1=m.nextLine();
	System.out.println(s1.toLowerCase());
	}
	void uppercase() {
		System.out.print("Input: ");
		String s2=m.nextLine();
		System.out.println(s2.toUpperCase());
	}
	void bothcase() {
		System.out.print("Input: ");
		String s3=m.nextLine();
		char[] b=s3.toCharArray();
		for(int i=0;i<b.length;i++) {
			if(Character.isLowerCase(b[i])) {
				b[i]=Character.toUpperCase(b[i]);
			}
			else if(Character.isUpperCase(b[i])) {
				b[i]=Character.toLowerCase(b[i]);
			}
			
		}System.out.println(b);
	}
	void countcase() {
		System.out.print("Input: ");
		String s4=m.nextLine();
		char[] c=s4.toCharArray();
		int count=0;
		int counts=0;
		for(int i=0;i<c.length;i++) {
			if(Character.isLowerCase(c[i])) {
				count++;
			}
			else if(Character.isUpperCase(c[i])) {
				counts++;
			}
			
		}System.out.println("Lower Case Count: "+count);
		System.out.println("Upper Case Count: "+counts);
	}
	
	
	public static void main(String[] args) {
		Lowercase n=new Lowercase();
		n.countcase();
	}

}
