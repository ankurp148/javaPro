package Array;

public class Array_Descending_bubbleSort  {

	public static void main(String[] args) {
		
int[]a= {20,12,18,10,8};
		
		for(int i=0; i<a.length;i++)
		{
			for(int j=i+1; j<a.length; j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
					
			}
			System.out.print(a[i]+",");	
		}



	}

}
