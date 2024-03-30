package Array;

import java.util.Scanner;

public class AverageElements {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE SIZE OF AN ARRAY");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("ENTER ARRAY");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		int sum=0;
		int avg;
		for(int i=0;i<size;i++)
		{
			sum=sum+a[i];
		}
		System.out.println("SUM OF AN ARRAY:"+sum);
		avg=sum/a.length;
		System.out.println("AVERAGE OF ARRAY:"+avg);
	}
}
