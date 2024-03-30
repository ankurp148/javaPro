package Array;

public class MinimumArrayWithoutusingBuublesort {

	public static void main(String[] args) {
		int[] a = { 2, 5, 6, 8, 1,-9 };
		int min = a[0];

		for (int i = 0; i < a.length; i++)

		{
			if (min > a[i]) {
				min = a[i];
			}
		}
		System.out.println(min);
	}

}
