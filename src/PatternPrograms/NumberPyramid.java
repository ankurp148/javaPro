package PatternPrograms;

public class NumberPyramid {

	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n ; i++) {
			int k = 1;
			for (int j = 1; j <= n*2-1; j++) {
				if((i+j>=n+1) && (j-i<=n-1)) {
					System.out.print(k+" ");
					if(j>=n) {
						k--;
					}else {
						k++;
					}
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
