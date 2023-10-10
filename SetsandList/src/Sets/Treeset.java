package Sets;

import java.util.TreeSet;

public class Treeset {

	public static void main(String[] args) {
		int[] ivalue= {10,20,30,40,50,60,70,80,90,10,20};
		TreeSet<Integer> h=new TreeSet<Integer>();
		for(int a:ivalue)
		{
			h.add(a);
			
		}
		for(int b:h)
		{
			System.out.print(b+" ");
		}

	}

}
