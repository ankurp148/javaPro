package String_Programs;

public class Reverse_And_Print_Only_IntegerValues {

	public static void main(String[] args) {
		String s="Aabb12345dd45ee1ff44";
		String []st=s.split("[A-Z a-z]");

		for(int i=st.length-1; i>=0; i--)
		{
			System.out.print(st[i]+" ");
		}

	}

}
