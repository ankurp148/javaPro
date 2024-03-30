package Array;

public class WithoutDuplicates {
	public static void main(String[] args) 
	{
		int a[]= {10,20,23,20,23};
		int count;
		for(int i=0;i<a.length;i++) 
		{
			count=0;
			for(int j=i;j<a.length;j++) 
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
