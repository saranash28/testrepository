package Sets;

import java.util.HashSet;

public class Hashset {

	public static void main(String[] args) {
		int[] ivalue= {10,20,30,40,50,60,70,80,90,10,20};
		HashSet<Integer> h=new HashSet<Integer>();
		for(int i:ivalue)
		{
		h.add(i);
		System.out.print(i+" ");
		}
		System.out.println();
		for(int j:h) {
			System.out.print(j+" ");
		}

	}

}
