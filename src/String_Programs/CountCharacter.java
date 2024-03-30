package String_Programs;

import java.util.LinkedHashSet;

public class CountCharacter {
	public static void main(String[] args) {
		String s1 = "My Name is ankur";
		String s=s1.toLowerCase();
		LinkedHashSet<Character> a1 = new LinkedHashSet<Character>();
		int count;
		for (int i = 0; i < s.length(); i++) 
		{
			a1.add(s.charAt(i));
		}
		System.out.println(a1);
		for (Character c : a1) 
		{
			count = 0;
			for (int i = 0; i < s.length(); i++) 
			{
				if (c == s.charAt(i)) 
				{
					count++;
				}
			}
			if (count >= 1) 
			{
				System.out.println(c + ":" + count);
			}
		}
	}
}
