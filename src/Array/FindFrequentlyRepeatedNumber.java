package Array;

public class FindFrequentlyRepeatedNumber {

	public static void main(String[] args) {
		int a[]= { 1, 2, 4, 2, 6, 2, 8, 10, 5 };
		int max = 0;
		int num = 0;

		for (int i = 0; i < a.length; i++) 
		{
			int count = 1;
			for (int j = i + 1; j < a.length; j++) 
			{
				if (a[i] == a[j]) 
				{
					count++;
				}
			}
			if (count > max) 
			{
				max = count;
				num = a[i];
			}
		}
		System.out.println(num + " is repeating " + max + " times");
	}
}
