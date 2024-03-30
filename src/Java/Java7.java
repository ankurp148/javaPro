package Java;

public class Java7 
{
	int x=10;
	Java7(int x)
	{
		System.out.println(x);
		this.x=x;
		System.out.println(this.x);
		System.out.println(x);
		
	}
	public static void main(String[] args) 
	{
		Java7 a1=new Java7(100);
		System.out.println(a1.x);
	}

}
