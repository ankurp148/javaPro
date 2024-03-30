package Number;

public class Count10 {

	public static void main(String[] args) {
		{
			String s="my name is ankur";
			String[] st = s.split(" ");
			
			for(int i=0; i<st.length; i++)
			{
				String str=st[i];
		//		System.out.print(str);
				for(int j=str.length()-1; j>=0; j--)
				{ 
					System.out.print(str.charAt(j));
				}
				System.out.print(" "); 
			}
		}

	}
}
