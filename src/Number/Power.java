package Number;
import java.util.Scanner;
public class Power {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER NUMBER");
		int a=sc.nextInt();
		System.out.println("ENTER POWER");
		int power=sc.nextInt();
		int j;
		for (int i=1;i<power;i++)
		{
			j=a*power;
			System.out.println("VALUE:"+j);
		}

	}

}
