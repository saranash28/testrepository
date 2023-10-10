package Sets;

//import java.util.HashSet;
import java.util.LinkedHashSet;

public class Linkedhashset {

	public static void main(String[] args) {
		int[] ivalue= {10,20,30,40,50,60,70,80,90,10,20};
		LinkedHashSet<Integer> h=new LinkedHashSet<Integer>();
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
