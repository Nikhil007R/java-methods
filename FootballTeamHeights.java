import java.util.Random;

class FootballTeamHeights {

    // Method to generate random heights between 150 cm and 250 cm
    public static int[] generateHeights() {
        Random rand = new Random();
        int[] heights = new int[11]; // Array for 11 players

        for (int i = 0; i < heights.length; i++) {
            heights[i] = 150 + rand.nextInt(101); // Random number between 150 and 250
        }
        return heights;
    }

    // Method to calculate the sum of all heights
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    // Method to calculate the mean height
    public static double findMean(int[] heights) {
        return (double) findSum(heights) / heights.length;
    }

    // Method to find the shortest height
    public static int findShortest(int[] heights) {
        int min = heights[0];
        for (int height : heights) {
            if (height < min) {
                min = height;
            }
        }
        return min;
    }

    // Method to find the tallest height
    public static int findTallest(int[] heights) {
        int max = heights[0];
        for (int height : heights) {
            if (height > max) {
                max = height;
            }
        }
        return max;
    }

    // Main method to test all methods
    public static void main(String[] args) {
        int[] heights = generateHeights();

        // Display all player heights
        System.out.print("Player Heights (in cm): ");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println();

        // Find and display results
        System.out.println("Shortest Player Height: " + findShortest(heights) + " cm");
        System.out.println("Tallest Player Height: " + findTallest(heights) + " cm");
        System.out.printf("Mean Height: %.2f cm\n", findMean(heights));
    }
}
