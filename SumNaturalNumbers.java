import java.util.Scanner;

public class SumNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a natural number: ");
        int n = sc.nextInt();

        // Validate input
        if (n < 1) {
            System.out.println("Please enter a positive natural number.");
        } else {
            // Call the method to calculate sum
            int sum = calculateSum(n);
            System.out.println("Sum of first " + n + " natural numbers is: " + sum);
        }
    }

    // Method to calculate sum using loop
    public static int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
}
