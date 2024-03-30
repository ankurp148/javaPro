package String_Programs;

public class ReverseEachCharacter {

	public static void main(String[] args) {
		String s="Ankur";
		String s1=s.toLowerCase();
		
		for (int i =s1.length()-1;i>=0; i--) {
			System.out.print(s1.charAt(i));
		}

	}

}
