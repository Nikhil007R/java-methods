import java.util.Scanner;

class BMICalculator {

    // Method to calculate BMI and store in array
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double weight = data[i][0];
            double heightInMeters = data[i][1] / 100.0; // Convert cm to meters
            data[i][2] = weight / (heightInMeters * heightInMeters); // BMI formula
        }
    }

    // Method to determine BMI status
    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) {
            return "Underweight";
        } else if (bmi >= 18.5 && bmi < 24.9) {
            return "Normal weight";
        } else if (bmi >= 25 && bmi < 29.9) {
            return "Overweight";
        } else {
            return "Obese";
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] teamData = new double[10][3]; // 2D array: 10 rows (people), 3 columns (weight, height, BMI)

        // Taking input for weight and height
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight (kg) of person " + (i + 1) + ": ");
            teamData[i][0] = sc.nextDouble();

            System.out.print("Enter height (cm) of person " + (i + 1) + ": ");
            teamData[i][1] = sc.nextDouble();
        }

        // Calculate BMI for each person
        calculateBMI(teamData);

        // Display results
        System.out.println("\nBMI Report:");
        System.out.printf("%-10s %-10s %-10s %-15s%n", "Weight(kg)", "Height(cm)", "BMI", "Status");
        System.out.println("--------------------------------------------------");

        for (int i = 0; i < 10; i++) {
            double bmi = teamData[i][2];
            String status = getBMIStatus(bmi);
            System.out.printf("%-10.2f %-10.2f %-10.2f %-15s%n", teamData[i][0], teamData[i][1], bmi, status);
        }
    }
}
