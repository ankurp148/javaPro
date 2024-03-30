package String_Programs;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class countDuplicateCharacter {
	
public static void main(String[] args) {		
		String s= "my name is ankur and i am from punjab";		
		LinkedHashSet<Character> a1 = new LinkedHashSet<Character>();		
		for(int i=0;i<s.length();i++)
		{
			a1.add(s.charAt(i));
		}
		System.out.println(a1);		
		for(Character c:a1) {
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				if(c==s.charAt(i)) {
					count++;
				}			
			}
			if(count>=2) {
				System.out.println(c+"="+count);	
			}	
		}
	}
}
