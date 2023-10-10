package Sets;

import java.util.HashSet;
import java.util.Set;

public class Hashset2 {
//	static int i;
//	static int j;
	public static void main(String[] args) {
//		10,20,30,90,10,10,40,50
//		30,40,50,60,80
		HashSet<Integer> n=new HashSet<>();
		HashSet<Integer> m=new HashSet<>();
		n.add(10);
		n.add(20);
		n.add(30);
		n.add(90);
		n.add(10);
		n.add(10);
		n.add(40);
		n.add(50);
		m.add(30);
		m.add(40);
		m.add(50);
		m.add(60);
		m.add(80);
		Set<Integer> w=new HashSet<>(n);
		w.retainAll(m);
		for(int i:w)
		{
			System.out.print(i+" ");
		}
		
		
	}

}
