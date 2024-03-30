package Array;

public class Combination_of_Numbers {

	public static void main(String[] args) {
		int[] a = { 8, 2, 3, 7, 6, 4, 9, 5 };
		int sum = 11;
		int num = 0;

		for (int i = 0; i < a.length; i++) {
			num = sum - a[i];
			System.out.println(num + "" + "+" + a[i] + "=" + sum);

		}

	}

}
