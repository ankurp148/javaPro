package String_Programs;

import java.util.LinkedHashSet;

public class RemoveDuplicateWords {
	
	public static void main(String[] args) {
		
		String s1="welcome to QSpiders welcome to india welcome to Bangalore";
		String[] s2 = s1.split(" ");
		
		LinkedHashSet<String> a1 = new LinkedHashSet<String>();
		
		for(int i=0;i<s2.length;i++)
		{
			a1.add(s2[i]);
		}
		
		System.out.println(a1);
		
		for(String s:a1)
		{
			System.out.print(s+" ");
		}
		
	}

}
