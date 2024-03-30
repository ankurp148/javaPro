package Array;

public class Array_Ascending_bubbleSort {
	public static void main(String[] args) {
		int[] a = { 10, 5, 22, 15, 13,39,74,69,65,74 };
		int temp=0;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}
			System.out.print(a[i] + ",");

		}
	}
}
