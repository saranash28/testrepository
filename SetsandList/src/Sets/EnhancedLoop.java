package Sets;

import java.util.LinkedHashSet;
import java.util.Set;

public class EnhancedLoop {

	public static void main(String[] args) {
		Set<Integer> m=new LinkedHashSet<>();
		m.add(105);
		m.add(205);
		m.add(305);
		m.add(405);
		m.add(505);
		m.add(605);
		m.add(705);
		m.add(805);
		for(int i:m) {
			System.out.println(i);
			
		}

	}

}
