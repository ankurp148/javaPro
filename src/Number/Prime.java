package Number;

public class Prime {
	public static void main(String[] arg) {
		int i = 1, a, sum, num;
		while (i < 999) {
			num = i;
			sum = 0;
			while (num > 0) {
				a = num % 10;
				sum = sum + (a * a * a);
				num = num / 10;
			}
			if (sum == i)
				System.out.println(i);
			i++;
		}
	}
}
