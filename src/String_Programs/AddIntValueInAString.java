package String_Programs;

public class AddIntValueInAString {
	
	public static void main(String[] args) {
		
		String str="123abc65@4&";
		int sum=0;
		int num=0;
		
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)>='0' && str.charAt(i)<='9')
			{
				int dig=str.charAt(i)-48;
				System.out.println(dig);
			}
		}
		
	}

}
