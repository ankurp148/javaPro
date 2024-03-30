package String_Programs;

public class removespaces {

	
	public static void main(String[] args) {
		
		String s1="my name is ankur";
		String s2=" ";
		String[] s3=s1.split(" ");
		
		for(int i=0;i<s3.length;i++)
		{
			s2=s2+s3[i];
		}
		System.out.println(s2);
	}
}
