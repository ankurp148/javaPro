package Number;
import java.util.Scanner;
public class Quotient_Remainder
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER FIRST NUMBER");
		int a=sc.nextInt();
		System.out.println("ENTER SECOND NUMBER");
		int b=sc.nextInt();
		if(b==0)
		{
			System.out.println("invalid");
		}
		else
		{
		System.out.println("REMAINDER IS:"+(b%a));
		System.out.println("QUOTIENT IS:"+(b/a));
		}

	}

}
