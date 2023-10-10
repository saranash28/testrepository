package Sets;

import java.util.Set;
import java.util.TreeSet;

public class Enhanced2 {

	public static void main(String[] args) {
		//10,20,30,40,50,60,70,80,90,10,20
		Set<Integer> m=new TreeSet<>();
		m.add(10);
		m.add(20);
		m.add(30);
		m.add(40);
		m.add(50);
		m.add(60);
		m.add(70);
		m.add(80);
		m.add(90);
		m.add(10);
		m.add(20);
		for(int i:m) {
			System.out.println(i);
			
		}

	}

}
