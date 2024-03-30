package String_Programs;

public class MaximumOccuranceCharacter {

	public static void main(String[] args) {
		String str = "my name is ankur prajapati";
		int length = str.length();
		int max = -1;
		char result = 0;

		int count[] = new int[256];
		for (int i = 0; i < length; i++) {
			count[str.charAt(i)]++;
		}
		for (int i = 0; i < length; i++) {
			if (max < count[str.charAt(i)]) {
				max = count[str.charAt(i)];
				result = str.charAt(i);
			}
		}
		System.out.println("The maximum occurring character is: " + result);
	}
}