import java.util.Scanner;

public class Handshakes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for number of students
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();

        // Validate input (handshakes are only possible for n > 1)
        if (n < 2) {
            System.out.println("Handshakes are not possible with less than 2 students.");
        } else {
            // Calculate the maximum number of handshakes
            int handshakes = calculateHandshakes(n);
            System.out.println("Maximum number of handshakes: " + handshakes);
        }
    }

    // Method to calculate handshakes using the combination formula
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }
}

