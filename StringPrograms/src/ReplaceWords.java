import java.util.Scanner;

public class ReplaceWords {

	public static void main(String[] args) {
		/*Scanner m=new Scanner(System.in);
		System.out.print("Input 1: ");
		String s1=m.nextLine();
		System.out.println(s1.replaceAll("java", "sql"));*/
		ReplaceWords n=new ReplaceWords();
		n.string5();		
	}
	Scanner s=new Scanner(System.in);
void string(){
	
		
		System.out.print("Input 2: ");
		String s2=s.nextLine();
		System.out.println(s2.replaceAll("IT", "Information Technology"));
	}
void string2() {
	System.out.print("Input 3: ");
	String s3=s.nextLine();
	System.out.println(s3.replaceAll(" ", "#"));
}
void string3() {
	System.out.print("Input 4: ");
	String s3=s.nextLine();
	if(s3.contains("gmail"))
	System.out.println(s3.replaceAll("gmail", "yahoo"));
	else {
		System.out.println("no gmail");
	}
}
void string5() {

System.out.print("Input 5: ");
String s3=s.nextLine();
if(s3.contains("pincode"))
System.out.println(s3.replaceAll("pincode", ""));
}
}
