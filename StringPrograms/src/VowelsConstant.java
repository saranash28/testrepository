import java.util.Scanner;

public class VowelsConstant {
	Scanner m=new Scanner(System.in);

	void vowels() {
		System.out.print("Input 1: ");
		String s1=m.nextLine();
		int vowel=0;
		int constant=0;
		s1=s1.toLowerCase();
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				vowel++;
			}
			else if(Character.isLetter(ch)) {
				constant++;
			}
		}
		System.out.println("Vowels "+vowel);
		System.out.println("Constant "+constant);
	}


	public static void main(String[] args) {
		VowelsConstant n=new VowelsConstant();
		n.vowels();

	}

}
