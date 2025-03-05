import java.util.*;

public class FactorCalculator {

    // Method to find factors of a number and store them in an array
    public static int[] findFactors(int num) {
        int count = 0;

        // First loop to count the number of factors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count]; // Initialize array with factor count
        int index = 0;

        // Second loop to store factors in the array
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[index++] = i;
            }
        }

        return factors; // Return the array of factors
    }

    // Method to calculate the sum of factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to calculate the product of factors
    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to calculate the sum of squares of factors
    public static int sumOfSquaresOfFactors(int[] factors) {
        int sumSquare = 0;
        for (int factor : factors) {
            sumSquare += Math.pow(factor, 2); // Using Math.pow() for square calculation
        }
        return sumSquare;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Scanner object to take user input
        
        System.out.print("Enter a number: ");
        int num = sc.nextInt(); // Read user input
        
        int[] factors = findFactors(num); // Get factors of the number
        
        // Display the factors
        System.out.println("Factors of " + num + " are: " + Arrays.toString(factors));
        
        // Compute and display the results
        System.out.println("Sum of factors: " + sumOfFactors(factors));
        System.out.println("Product of factors: " + productOfFactors(factors));
        System.out.println("Sum of squares of factors: " + sumOfSquaresOfFactors(factors));
    }
}
