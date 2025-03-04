import java.util.Scanner;

public class IsPositiveOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Get the result from method
        int result = checkNumber(number);

        // Display output based on result
        if (result == 1) {
            System.out.println("The number is Positive.");
        } else if (result == -1) {
            System.out.println("The number is Negative.");
        } else {
            System.out.println("The number is Zero.");
        }
    }

    // Method to check if a number is positive, negative, or zero
    public static int checkNumber(int num) {
        if (num > 0) {
            return 1;
        } else if (num < 0) {
            return -1;
        } else {
            return 0;
        }
    }
}
