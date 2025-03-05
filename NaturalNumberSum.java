import java.util.*; // Importing required package

public class NaturalNumberSum {
    
    // Recursive method to calculate the sum of n natural numbers
    public static int sumNaturalRecursive(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumNaturalRecursive(n - 1);
    }
    
    // Method to calculate the sum of n natural numbers using formula
    public static int sumNaturalFormula(int n) {
        return n * (n + 1) / 2;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creating Scanner object
        
        System.out.print("Enter a natural number: ");
        int number = sc.nextInt(); // Taking input from the user
        
        if (number <= 0) {
            System.out.println("Please enter a natural number (greater than 0).");
            return;
        }
        
        // Compute sum of natural numbers using recursion and formula
        int sumRecursive = sumNaturalRecursive(number);
        int sumFormula = sumNaturalFormula(number);
        
        // Display and compare results
        System.out.println("Sum of first " + number + " natural numbers (Recursive): " + sumRecursive);
        System.out.println("Sum of first " + number + " natural numbers (Formula): " + sumFormula);
        
        if (sumRecursive == sumFormula) {
            System.out.println("Both computations match. The formula is correct!");
        } else {
            System.out.println("Mismatch detected! There might be an issue with the calculations.");
        }
        
    }
}
