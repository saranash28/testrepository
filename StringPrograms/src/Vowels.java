import java.util.Scanner;

public class Vowels {
	Scanner m=new Scanner(System.in);

	void vowels() {
		System.out.print("Input 1: ");
		String s1=m.nextLine();
		String val = "";
		for(int i=0;i<s1.length();i++)
		{
			String a;
			char ch=s1.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				//System.out.print('@');
				ch='@';
				
			}
			val=val+ch;
			/*else {
				System.out.print(ch);
			}*/
	}
		System.out.print(val);
	}

	public static void main(String[] args) {
		Vowels n=new Vowels();
		n.vowels();

	}

}
