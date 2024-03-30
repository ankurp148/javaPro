package Number;
import java.util.Scanner;

public class FirstNSquareNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user input for the value of n
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        // Display the first n square numbers
        System.out.println("The first " + n + " square numbers are:");

        for (int i = 1; i <= n; i++) {
            int square = i * i;
            System.out.println(square);
        }

        scanner.close();
    }
}
