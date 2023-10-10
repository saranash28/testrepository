import java.util.Scanner;

public class Countof 
{
	Scanner m=new Scanner(System.in);
	
	void countcase() {
		System.out.print("Input: ");
		String s4=m.nextLine();
		char[] c=s4.toCharArray();
		int count=0;
		int counts=0;
		int number=0;
		int a=0;
		int b=0;
		for(int i=0;i<c.length;i++) {
			if(Character.isLowerCase(c[i])) {
				count++;
			}
			else if(Character.isUpperCase(c[i])) {
				counts++;
			}
			else if(Character.isDigit(c[i])) {
				number++;
			}
			else if(Character.isSpaceChar(c[i])) {
				a++;
			}
			else {
				b++;
			}
		}System.out.println("Small "+count);
		System.out.println("Caps "+counts);
		System.out.println("Numbers "+number);
		System.out.println("Space "+a);
		System.out.println("Special Characters "+b);
		}
	public static void main(String[] args) {
		Countof n=new Countof();
		n.countcase();

	}


}
