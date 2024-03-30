package String_Programs;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class CountDuplicateWords {
	public static void main(String[] args) {
		String s1 = "welcome well welcome to mandya to bang";
		String[] s2 = s1.split(" ");
		LinkedHashSet<String> a1 = new LinkedHashSet<String>();
		for (int i = 0; i < s2.length; i++) {
			a1.add(s2[i]);
		}
		System.out.println(a1);
		for (String c : a1) {
			int count = 0;
			for (int i = 0; i < s2.length; i++) {
				if (c.equals(s2[i])) {
					count++;
				}
			}
			if (count > 1) {
				System.out.println(c + "=" + count);

			}
		}
	}
}