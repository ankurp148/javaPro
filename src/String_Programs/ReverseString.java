package String_Programs;

public class ReverseString {

	public static void main(String[] args) {
		String s1="my name is kiran";
		String[] s = s1.split(" ");
		
		for(int i=0; i<s.length; i++)
		{
			String str=s[i];
			
			for(int j=str.length()-1; j>=0; j--)
			{ 
				System.out.print(str.charAt(j));
			}
			System.out.print(" "); 
		}
	}
}
