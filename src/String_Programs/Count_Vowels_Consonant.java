package String_Programs;

public class Count_Vowels_Consonant {

	public static void main(String[] args) {
		String s="My name is Ankur";
		String s1=s.toLowerCase().replace(" ","");
		String ch="";
		String ch1="";
		
		int countVowel=0;
		int countConsonant=0;
		
		for (int i = 0; i < s1.length(); i++) 
		{
			if(s1.charAt(i)=='a'||s1.charAt(i)=='e'||s1.charAt(i)=='i'||s1.charAt(i)=='o'||s1.charAt(i)=='u')
			{
				 countVowel++;
			     ch=ch+s1.charAt(i);
			}
			else
			{
				countConsonant++;
				ch1=ch1+s1.charAt(i);
			}		
		} 
		System.out.println(ch+"-->"+countVowel);
		System.out.println(ch1+"-->"+countConsonant);
	}

}
