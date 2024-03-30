package Number;
import java.util.Scanner;
public class LeapYear 
{

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE YEAR");
		int year=sc.nextInt();
		
		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
		{
			System.out.println("a leap year");
		}
		else
		{
			System.out.println("not a leap year");
		}
		
	}

}
