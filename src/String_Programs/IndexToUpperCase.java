package String_Programs;

public class IndexToUpperCase {
	
	public static void main(String[] args) {
		
		String s="indIa is winNEr";

		char[] ch=s.toCharArray();

		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='I')
				{
				//using wrapper class of the character to get the inbuilt methods.
				System.out.print(Character.toLowerCase(ch[i]));
				}
			else
				System.out.print(Character.toLowerCase(ch[i]));
		
	}

	}
}

