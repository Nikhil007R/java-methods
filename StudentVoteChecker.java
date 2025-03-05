import java.util.Scanner;

public class StudentVoteChecker {

    // Method to check if a student can vote
    public static boolean canStudentVote(int age) {
        if (age < 0) {
            return false; // Invalid age (negative values)
        }
        return age >= 18; // Return true if age is 18 or above, otherwise false
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object
        int[] ages = new int[10]; // Array to store ages of 10 students

        // Taking input for student ages
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter the age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }

        // Checking voting eligibility and displaying results
        System.out.println("\nVoting Eligibility Results:");
        for (int i = 0; i < 10; i++) {
            if (canStudentVote(ages[i])) {
                System.out.println("Student " + (i + 1) + " (Age: " + ages[i] + ") is eligible to vote.");
            } else {
                System.out.println("Student " + (i + 1) + " (Age: " + ages[i] + ") is NOT eligible to vote.");
            }
        }

        sc.close(); // Close Scanner
    }
}

