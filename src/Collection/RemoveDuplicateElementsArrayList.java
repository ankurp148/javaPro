package Collection;

import java.util.ArrayList;
import java.util.LinkedHashSet;

public class RemoveDuplicateElementsArrayList {

	public static void main(String[] args) {
		ArrayList a1=new ArrayList();
		a1.add(10);
		a1.add(20);
		a1.add(20);
		a1.add(20);
		a1.add(41);
		a1.add(27);
		a1.add(19);
		a1.add(8);
		System.out.println(a1);
		
		LinkedHashSet<Integer> h1=new LinkedHashSet<Integer>(a1);
		
		System.out.println(h1);
		
	}

}
