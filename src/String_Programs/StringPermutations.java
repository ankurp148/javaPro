package String_Programs;
public class StringPermutations {

    public static void main(String[] args) {
        String s = "123";
        generatePermutations(s);
    }

    public static void generatePermutations(String s) {
        generatePermutationsHelper(s, 0, s.length() - 1);
    }

    private static void generatePermutationsHelper(String s, int left, int right) {
        if (left == right) {
            System.out.println(s);
        } else {
            for (int i = left; i <= right; i++) {
                s = swap(s, left, i);
                generatePermutationsHelper(s, left + 1, right);
                s = swap(s, left, i); // backtrack
            }
        }
    }

    private static String swap(String s, int i, int j) {
        char[] charArray = s.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return new String(charArray);
    }
}
