package Sets;

import java.util.List;
import java.util.Set;
//import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashSet;

public class listset {

	public static void main(String[] args) {
		List<Integer> m=new ArrayList<>();
		m.add(10);
		m.add(20);
		m.add(30);
		m.add(90);
		m.add(10);
		m.add(10);
		m.add(40);
		m.add(50);
		System.out.print(m+" ");
		System.out.println();
		Set<Integer> n=new HashSet<>();
		n.addAll(m);
		for(int i:n) {
			System.out.print(i+" ");
		}
		
	}

}
