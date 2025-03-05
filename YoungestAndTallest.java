import java.util.Scanner;

class YoungestAndTallest {

    // Method to find the youngest friend
    public static String findYoungest(String[] names, int[] ages) {
        int minAge = ages[0];
        String youngest = names[0];

        for (int i = 1; i < ages.length; i++) {
            if (ages[i] < minAge) {
                minAge = ages[i];
                youngest = names[i];
            }
        }
        return youngest;
    }

    // Method to find the tallest friend
    public static String findTallest(String[] names, double[] heights) {
        double maxHeight = heights[0];
        String tallest = names[0];

        for (int i = 1; i < heights.length; i++) {
            if (heights[i] > maxHeight) {
                maxHeight = heights[i];
                tallest = names[i];
            }
        }
        return tallest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create Scanner object

        String[] friends = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3]; // Array to store ages
        double[] heights = new double[3]; // Array to store heights

        // Taking input for age and height
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + friends[i] + ": ");
            ages[i] = sc.nextInt();

            System.out.print("Enter height of " + friends[i] + " (in meters): ");
            heights[i] = sc.nextDouble();
        }

        // Finding and displaying the youngest and tallest friend
        System.out.println("\nThe youngest friend is: " + findYoungest(friends, ages));
        System.out.println("The tallest friend is: " + findTallest(friends, heights));

    }
}
