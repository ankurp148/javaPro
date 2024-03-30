package Array;

import java.util.Scanner;

public class SortingArray {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size of array");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("enter array");
		for(int i=0;i<a.length;i++) 
		{
			a[i]=sc.nextInt();
		}
		int temp=0;
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[j];
					a[j]=a[i];
					a[i]=temp;
				}
				
			}
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]);
		}
		System.out.println(a[0]);

	}
}
