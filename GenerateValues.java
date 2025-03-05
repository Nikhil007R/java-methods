import java.util.Random;

class GenerateValues {

    // Method to generate an array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        int[] numbers = new int[size];
        Random random = new Random(); // Using Random class

        for (int i = 0; i < size; i++) {
            numbers[i] = 1000 + random.nextInt(9000); // Generates a 4-digit number (1000 to 9999)
        }
        return numbers;
    }

    // Method to find the average, min, and max of an array
    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0], max = numbers[0];
        double sum = 0;

        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        double average = sum / numbers.length; // Compute average
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {
        int size = 5; // We need 5 random values
        int[] randomNumbers = generate4DigitRandomArray(size);

        System.out.println("Generated 4-digit Random Numbers:");
        for (int num : randomNumbers) {
            System.out.print(num + " ");
        }
        System.out.println();

        double[] results = findAverageMinMax(randomNumbers);

        System.out.println("\nResults:");
        System.out.printf("Average: %.2f%n", results[0]);
        System.out.println("Minimum: " + (int) results[1]);
        System.out.println("Maximum: " + (int) results[2]);
    }
}
