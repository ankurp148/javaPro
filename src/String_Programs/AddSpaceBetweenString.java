package String_Programs;

public class AddSpaceBetweenString {
	
	public static void main(String[] args) {
		
		String s="MyNameIsAnkur";
		
		for(int i=0;i<s.length();i++) 
		{
			if(s.charAt(i)>='A' && s.charAt(i)<='Z')
			{
				System.out.print(" "+s.charAt(i));
			}
			else
			{
				System.out.print(s.charAt(i));
			}
			
		
	     }

	}
}
