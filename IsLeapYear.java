import java.util.Scanner;

public class IsLeapYear {
    
    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        if (year < 1582) {
            return false; // Year must be >= 1582 (Gregorian calendar)
        }
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object

        System.out.print("Enter a year: ");
        int year = sc.nextInt(); // Take user input

        if (year < 1582) {
            System.out.println("The Leap Year program only works for years >= 1582.");
        } else if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }

        sc.close(); // Close Scanner
    }
}
