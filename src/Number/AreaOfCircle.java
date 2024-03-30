package Number;
import java.util.Scanner;
public class AreaOfCircle {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER THE RADIUS");
		double r=sc.nextDouble();
		double Area;
		System.out.println("AREA OF CIRCLE IS : "+(Math.PI*r*r));	
	}

}
