
package Number;

import java.util.Scanner;

public class Fibo
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("first num");
		int n1=sc.nextInt();
		
		System.out.println("second num");
		int n2=sc.nextInt();	
		int sum=0;
		for (int i=1;i<=20;i++)
		{
			System.out.println(n1);
			sum=n1+n2;
			n1=n2;
			n2=sum;
		}
	}

}
