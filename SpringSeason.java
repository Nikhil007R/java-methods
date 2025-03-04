import java.util.Scanner;

public class SpringSeason {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for month and day
        System.out.print("Enter the month (1-12): ");
        int month = sc.nextInt();

        System.out.print("Enter the day (1-31): ");
        int day = sc.nextInt();

        // Call method to check if it's Spring Season
        if (isSpringSeason(month, day)) {
            System.out.println("It's a Spring Season");
        } else {
            System.out.println("Not a Spring Season");
        }
    }

    // Method to check if the given date is in Spring Season
    public static boolean isSpringSeason(int month, int day) {
        return (month == 3 && day >= 20) || // March 20 onwards
               (month == 4) ||              // Full month of April
               (month == 5) ||              // Full month of May
               (month == 6 && day <= 20);   // Until June 20
    }
}
