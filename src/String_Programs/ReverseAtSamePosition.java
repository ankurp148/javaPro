package String_Programs;

public class ReverseAtSamePosition {

	public static void main(String[] args) {
		String s="my name is roy";
		String s1=s.toLowerCase();
		String[] s2=s1.split(" ");
		
		for (int i = 0; i < s2.length; i++) {
			String s3=s2[i];
			
			for (int j = s3.length()-1;j>=0;j--) {
				System.out.print(s3.charAt(j));
			}
			System.out.print(" ");
		}
		

	}

}
