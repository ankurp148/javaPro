package PatternPrograms;

public class Alphabet_A {

	public static void main(String[] args) 
	{
		for (int j = 1; j <= 5; j++) {
			for (int i = 1; i <= 5; i++) {
				if((j==3)||(i==1 && j!=1)||(i==5 && j!=1)||(j==1 && i!=1 && i!=5) )
				{
					
					System.out.print("* ");
				}
				else {
					System.out.print("   ");
				}
			}		
			System.out.println();
		}
		
	}

}
