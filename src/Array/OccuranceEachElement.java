package Array;

public class OccuranceEachElement 
{
	public static void main(String[] args) 
	{
		int a[] = { 33, 17, 4, 33, 17, 3, 21, 21,21 };
		for (int i = 0; i < a.length; i++) 
		{
			int count = 0;
			for (int j = 0; j < a.length; j++) 
			{
				if (a[i] == a[j]) 
				{
					if (i > j) 
					{
					break;
					} 
					else 
					{
						count++;
					}
				}
			}
			if (count >= 1) {
				System.out.println(a[i] + " ---> " + count);
			}
		}
	}
}
