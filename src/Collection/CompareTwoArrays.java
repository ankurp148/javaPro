package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CompareTwoArrays {

	public static void main(String[] args) {
		
		ArrayList<String> a1=new ArrayList<String>();
		a1.add("A");
		a1.add("B");
		a1.add("C");
		a1.add("D");
		a1.add("E");
		a1.add("F");
		System.out.println("a1 :"+a1);
		
		ArrayList<String> a2=new ArrayList<String>(Arrays.asList("A","B","C","D"));
		System.out.println("a2 :"+a2);

		Collections.sort(a1);
		Collections.sort(a2);
		System.out.println(a1.equals(a2));
		
		
		//missing element
		a1.removeAll(a2);
		System.out.println(a1);
		
		
		//common element
		ArrayList<String> a3=new ArrayList<String>(Arrays.asList("A","B","C","D"));
		ArrayList<String> a4=new ArrayList<String>(Arrays.asList("A","B","C","z"));	
		
		a3.retainAll(a4);
		System.out.println(a3);
		
		
		
		
	}

}
