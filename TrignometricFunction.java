import java.util.Scanner;

public class TrignometricFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for the angle in degrees
        System.out.print("Enter the angle in degrees: ");
        double angle = sc.nextDouble();

        // Call method to calculate trigonometric functions
        double[] results = calculateTrigonometricFunctions(angle);

        // Display results
        System.out.printf("Sine of %.2f°: %.4f\n", angle, results[0]);
        System.out.printf("Cosine of %.2f°: %.4f\n", angle, results[1]);
        System.out.printf("Tangent of %.2f°: %.4f\n", angle, results[2]);
    }

    // Method to calculate sine, cosine, and tangent
    public static double[] calculateTrigonometricFunctions(double angle) {
        double radians = Math.toRadians(angle); // Convert degrees to radians

        double sine = Math.sin(radians);
        double cosine = Math.cos(radians);
        double tangent = Math.tan(radians);

        return new double[]{sine, cosine, tangent}; // Return results as an array
    }
}
