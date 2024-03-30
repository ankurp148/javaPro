package String_Programs;

public class RemoveSpaceBetweenString {

	
	public static void main(String[] args) {
		
		String s="my name is chaitra";
		String s1=" ";		
		String[] s2=s.split(" ");
		
		for(int i=0;i<s2.length;i++)
		{
			s1=s1+s2[i];
		}
		System.out.println(s1);
	}
}
