package Sets;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Linkset {

	public static void main(String[] args) {
		//105,205,305,405,505,605,705,805,505,605
		List<Integer> m=new ArrayList<>();
		m.add(105);
		m.add(205);
		m.add(305);
		m.add(405);
		m.add(505);
		m.add(605);
		m.add(705);
		m.add(805);
		m.add(505);
		m.add(605);
		System.out.print(m+" ");
		System.out.println();
		Set<Integer> n=new HashSet<>();
		n.addAll(m);
		for(int i:n) {
			System.out.print(i+" ");
		}
		
	}

	}

