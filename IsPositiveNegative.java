import java.util.Scanner;

public class IsPositiveNegative {

    // Method to check if a number is positive
    public static boolean isPositive(int num) {
        return num >= 0;
    }

    // Method to check if a number is even
    public static boolean isEven(int num) {
        return num % 2 == 0;
    }

    // Method to compare two numbers
    public static int compare(int num1, int num2) {
        if (num1 > num2) {
            return 1;  // num1 is greater
        } else if (num1 < num2) {
            return -1; // num1 is smaller
        } else {
            return 0;  // both are equal
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5]; // Array to store 5 numbers

        // Taking input for 5 numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }

        // Checking positivity/negativity and even/odd for positive numbers
        System.out.println("\nAnalysis of Numbers:");
        for (int num : numbers) {
            if (isPositive(num)) {
                System.out.print(num + " is Positive");
                if (isEven(num)) {
                    System.out.println(" and Even.");
                } else {
                    System.out.println(" and Odd.");
                }
            } else {
                System.out.println(num + " is Negative.");
            }
        }

        // Comparing first and last elements of the array
        int result = compare(numbers[0], numbers[numbers.length - 1]);
        System.out.print("\nComparison of First and Last Element: ");
        if (result == 1) {
            System.out.println("First number is greater than the last number.");
        } else if (result == -1) {
            System.out.println("First number is smaller than the last number.");
        } else {
            System.out.println("First and last numbers are equal.");
        }

        sc.close(); // Close Scanner
    }
}
