
public class StringIndex {

	public static void main(String[] args) {
		String s1="TamilNadu Information Technology";
		String s2="SeleniumAutomationtool";
		String s3="RajaMohan";
		String s4="j a v a p r o g r a m";
		String s5="9876543210";
		
		char c1='o';
		char c2='o';
		char c3='n';
		char c4=' ';
		char c5='8';
		
		System.out.println("Last Index of "+c1+" in "+s1+" is "+s1.lastIndexOf(c1));
		System.out.println("Index of "+c2+" in "+s1+" is "+s2.indexOf(c2));
		System.out.println("Index of "+c3+" in "+s1+" is "+s3.indexOf(c3));
		System.out.println("Last Index of Empty space in "+s4+" is "+s4.lastIndexOf(c4));
		System.out.println("Index of "+c5+" in "+s1+" is "+s5.indexOf(c5));

	}

}
