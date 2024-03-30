package String_Programs;

import java.util.HashMap;
import java.util.Map.Entry;

public class RemoveDuplicatesVowel {

	public static void main(String[] args) {
		String s = "india";
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == 'a' || s.charAt(i) == 'e' || s.charAt(i) == 'i' || s.charAt(i) == 'o'
					|| s.charAt(i) == 'u') {
				if (map.containsKey(s.charAt(i))) {

					map.put(s.charAt(i), map.get(s.charAt(i)) + 1);

				} else {
					map.put(s.charAt(i), 1);
				}

			}
		}
		for (Entry<Character, Integer> m : map.entrySet()) {

			System.out.println(m.getKey());

		}

	}

}
