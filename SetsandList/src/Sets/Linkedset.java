package Sets;

import java.util.LinkedHashSet;
import java.util.Set;

public class Linkedset {
//	 Input : 10,20,30,90,10,10,40,50
//     Input : 10,20,60,50,40,70,80,90

	public static void main(String[] args) {
		LinkedHashSet<Integer> n=new LinkedHashSet<>();
		LinkedHashSet<Integer> m=new LinkedHashSet<>();
		n.add(10);
		n.add(20);
		n.add(30);
		n.add(90);
		n.add(10);
		n.add(10);
		n.add(40);
		n.add(50);
		m.add(10);
		m.add(20);
		m.add(60);
		m.add(50);
		m.add(40);
		m.add(70);
		m.add(80);
		m.add(90);
	
	
		Set<Integer> w=new LinkedHashSet<>(n);
		w.retainAll(m);
		for(int i:w)
		{
			System.out.print(i+" ");
		}
		

	}

}
