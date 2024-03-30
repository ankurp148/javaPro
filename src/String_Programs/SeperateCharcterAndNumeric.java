package String_Programs;

public class SeperateCharcterAndNumeric {
	
	public static void main(String[] args)
	{
		String s="Abc12@$cdeffjnv2131#^#^#!%";
		String num=" ";
		String character=" ";
		String specialChar=" ";
	
		for(int i=0;i<s.length();i++)
		  {
		   char ch=s.charAt(i);		  
		   if((ch>='a' && ch<='z') ||(ch>='A' && ch<='Z')) {
		   character=character+ch;
		  }
		  else if(ch>='0' && ch<='9')
		  {
		   num=num+ch;
		  }
		  else
		  {
		   specialChar=specialChar+ch;
		  }
		 }
		 System.out.println("CHARACTERS ARE:"+character);
		 System.out.println("NUMBERS ARE:"+num);
		 System.out.println("SPECIAL CHARACTER ARE:"+specialChar);			
	}

}
