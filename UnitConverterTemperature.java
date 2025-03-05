import java.util.Scanner;

class UnitConverterTemperature {

    // Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        double pounds2kilograms = 0.453592;
        return pounds * pounds2kilograms;
    }

    // Method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        double kilograms2pounds = 2.20462;
        return kilograms * kilograms2pounds;
    }

    // Method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        double gallons2liters = 3.78541;
        return gallons * gallons2liters;
    }

    // Method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        double liters2gallons = 0.264172;
        return liters * liters2gallons;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object

        // Fahrenheit to Celsius
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = sc.nextDouble();
        System.out.println(fahrenheit + "°F is " + convertFahrenheitToCelsius(fahrenheit) + "°C.");

        // Celsius to Fahrenheit
        System.out.print("Enter temperature in Celsius: ");
        double celsius = sc.nextDouble();
        System.out.println(celsius + "°C is " + convertCelsiusToFahrenheit(celsius) + "°F.");

        // Pounds to Kilograms
        System.out.print("Enter weight in Pounds: ");
        double pounds = sc.nextDouble();
        System.out.println(pounds + " lbs is " + convertPoundsToKilograms(pounds) + " kg.");

        // Kilograms to Pounds
        System.out.print("Enter weight in Kilograms: ");
        double kilograms = sc.nextDouble();
        System.out.println(kilograms + " kg is " + convertKilogramsToPounds(kilograms) + " lbs.");

        // Gallons to Liters
        System.out.print("Enter volume in Gallons: ");
        double gallons = sc.nextDouble();
        System.out.println(gallons + " gallons is " + convertGallonsToLiters(gallons) + " liters.");

        // Liters to Gallons
        System.out.print("Enter volume in Liters: ");
        double liters = sc.nextDouble();
        System.out.println(liters + " liters is " + convertLitersToGallons(liters) + " gallons.");

    }
}
