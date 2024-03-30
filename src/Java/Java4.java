package Java;

public class Java4 
{
	static int x=10;
	
	public void test()
	{
		Java4 a1=new Java4();
		
		System.out.println(x);
		System.out.println(this.x);
		System.out.println(a1.x);
		System.out.println(Java4.x);
					
	}

}
