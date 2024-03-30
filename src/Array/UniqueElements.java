package Array;

public class UniqueElements {

	public static void main(String[] args) 
	{
		int a[]= {10,20,23,20,23};
		int count=0;
		for(int i=0;i<a.length;i++) 
		{
			count=0;
			for(int j=0;j<a.length;j++) 
			{
				if(a[i]==a[j])
				{
					count++;
				}
			}
			if (count==1)
			{
			 System.out.println(a[i]);	
			}
		}
	}
}
