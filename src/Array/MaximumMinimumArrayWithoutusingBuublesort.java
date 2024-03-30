package Array;

public class MaximumMinimumArrayWithoutusingBuublesort {

	public static void main(String[] args) 
	{
		int[]a= {2,5,6,8,1,14,12};
		int max=a[0];
		int min=a[0];
		
		for(int i=0; i<a.length;i++)
		{
			if(max<a[i]) 
			{
				max=a[i];
			}
			else if(min > a[i])
			{
				min=a[i];
			}
		}
		System.out.println(max);
		System.out.println(min);
	}
}
