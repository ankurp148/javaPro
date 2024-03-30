package Array;

import java.util.Scanner;

public class EvenIndex 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE SIZE OF AN ARRAY");
		int size=sc.nextInt();
		int a[]=new int[size];
		System.out.println("ENTER ARRAY");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=1;i<size;i=i+2)
		{
			System.out.println(a[i]);
		}

	}

}
