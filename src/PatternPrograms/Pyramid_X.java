package PatternPrograms;

public class Pyramid_X {

	public static void main(String[] args) {
		int n = 3, k = 1;
		for (int i = 1; i <= n*2-1; i++) {
			for (int j = 1; j <= n*2-1; j++) {
				if (i == j || i + j == n*2) {
					System.out.print(k + " ");
				} else {
					System.out.print("  ");
				}
			}
			if (i < n) {
				k++;
				
				
			} else {
				k--;
			}
			System.out.println();
		}
	}
}
