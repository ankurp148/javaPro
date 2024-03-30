package String_Programs;

public class Occurance_oF_Each_Character_In_String {

	public static void main(String[] args) {
		String s1="Welcome Home";
		String s = s1.toLowerCase(); 
		
		for(int i=0; i<s.length(); i++)
		{
			int count=0;
	     	for(int j=0; j<s.length(); j++)	     									
		{
			if(s.charAt(i)==s.charAt(j))
			{
				if(i>j)
				{
					break;
				}				
				else
				{
					count++;
				}
			}
		}			
			if(count==	1)
			{
				System.out.print(s.charAt(i) +"="+count +" "+"");
			}
		}
	}
}
