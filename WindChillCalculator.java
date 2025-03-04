import java.util.Scanner;

public class WindChillCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for temperature and wind speed
        System.out.print("Enter the temperature (in Fahrenheit): ");
        double temperature = sc.nextDouble();

        System.out.print("Enter the wind speed (in mph): ");
        double windSpeed = sc.nextDouble();

        // Validate input (wind chill formula is only valid if wind speed > 3 mph)
        if (temperature > 50 || windSpeed <= 3) {
            System.out.println("Wind chill calculation is not valid for temperatures above 50°F or wind speed ≤ 3 mph.");
        } else {
            // Call method to calculate wind chill
            double windChill = calculateWindChill(temperature, windSpeed);

            // Display the result
            System.out.printf("The wind chill temperature is: %.2f°F\n", windChill);
        }
    }

    // Method to calculate wind chill temperature
    public static double calculateWindChill(double temp, double windSpeed) {
        return 35.74 + (0.6215 * temp) + ((0.4275 * temp - 35.75) * Math.pow(windSpeed, 0.16));
    }
}
