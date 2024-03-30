
package String_Programs;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class RemoveDuplicateFromString 
{	
	public static void main(String[] args) 
	{		
		String s = "aannkkuurrrrr";		
		LinkedHashSet<Character> a1 = new LinkedHashSet<Character>();	
		//LinkedHashSet is used to store unique characters while preserving the order of insertion.
		for(int i=0;i<s.length();i++)
		{
			a1.add(s.charAt(i));
		}
		System.out.println(a1);
		for(Character ch:a1)
		{
			System.out.print(ch);
		}		
	}
}
