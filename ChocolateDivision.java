import java.util.Scanner;

public class ChocolateDivision {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for number of chocolates and number of children
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = sc.nextInt();

        System.out.print("Enter the number of children: ");
        int numberOfChildren = sc.nextInt();

        // Validate input (division by zero not allowed)
        if (numberOfChildren == 0) {
            System.out.println("Cannot divide chocolates among zero children.");
        } else {
            // Call method to calculate chocolates per child and remainder
            int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);

            // Display results
            System.out.println("Each child will get: " + result[0] + " chocolates");
            System.out.println("Remaining chocolates: " + result[1]);
        }
    }

    // Method to calculate chocolates per child and remaining chocolates
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        int quotient = number / divisor;  // Chocolates per child
        int remainder = number % divisor; // Remaining chocolates
        return new int[]{quotient, remainder};
    }
}
