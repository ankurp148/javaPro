package Array;

import java.util.Scanner;

public class OccuranceElement {
	public static void main(String[] args) {
		int a[] = { 10, 20, 23, 20, 23 };
		Scanner sc=new Scanner(System.in);
		int element=sc.nextInt();
		int count = 0;
		for (int i = 0; i < a.length; i++) {

			if (a[i] == element) {
				count++;
			}
		}
		System.out.println(count);
	}
}
