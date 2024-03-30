package String_Programs;

public class Reverse_Split_Each_Word {

	public static void main(String[] args) {
		String s="1 2 3 4 5";
		String[] a = s.split(" ");
		
		for (int i=0; i<a.length; i++)
		{
			String temp = a[0];
			
			for(int j=1; j<a.length; j++)
			{
				a[j-1]=a[j];
				System.out.print(a[j]+" ");
			}			
			a[a.length-1]=temp;
			System.out.println(temp);
		}
	}
}
