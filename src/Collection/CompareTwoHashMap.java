package Collection;

import java.util.HashMap;

public class CompareTwoHashMap {

	public static void main(String[] args) 
	{
		HashMap<String, Integer> a1=new HashMap<String, Integer>();
		a1.put("A", 1);
		a1.put("T", 5);
		a1.put("G", 7);
		a1.put("K", 6);
		a1.put("W", 11);
		
		HashMap<String, Integer> a2=new HashMap<String, Integer>();
		a2.put("A", 1);
		a2.put("T", 5);
		a2.put("R", 7);
		a2.put("K", 78);
		a2.put("W", 11);
		
		HashMap<String, Integer> a3=new HashMap<String, Integer>();
		a1.put("A", 1);
		a1.put("T", 5);
		a1.put("G", 7);
		a1.put("K", 6);
		a1.put("W", 11);
		
		System.out.println(a1.equals(a2));
		System.out.println(a1.equals(a3));
		
		System.out.println(a1.keySet().equals(a3.keySet()));
		

	}

}
