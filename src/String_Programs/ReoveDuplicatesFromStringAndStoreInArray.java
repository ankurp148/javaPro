package String_Programs;

import java.util.LinkedHashSet;

public class ReoveDuplicatesFromStringAndStoreInArray {
	
	public static void main(String[] args) {
		
		
		String[] str = {"welcome","to","india","to","tyss","welcome"};
		
		LinkedHashSet<String> set = new LinkedHashSet<String>();
		
		for(int i=0;i<str.length;i++)
		{
			set.add(str[i]);
		}
		
		System.out.println(set);
		
		for(String st:set)
		{
			System.out.print(st+" ");
		}
		
	}
}

