import java.util.Scanner;
import java.util.Arrays;

class NumberChecker {

    // Method to find factors of a number and return them as an array
    public static int[] findFactors(int num) {
        int count = 0;

        // First loop to count the number of factors
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        int[] factors = new int[count]; // Creating array of required size
        int index = 0;

        // Second loop to store factors in the array
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[index++] = i;
            }
        }

        return factors;
    }

    // Method to find the greatest factor of a number (excluding itself)
    public static int findGreatestFactor(int[] factors) {
        return factors[factors.length - 2]; // Second last element is the greatest proper factor
    }

    // Method to find sum of factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of factors
    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the product of cubes of factors
    public static double productOfCubesOfFactors(int[] factors) {
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    // Method to check if a number is a Perfect Number
    public static boolean isPerfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) { // Exclude the number itself
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum == num;
    }

    // Method to check if a number is an Abundant Number
    public static boolean isAbundantNumber(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) { // Exclude the number itself
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum > num;
    }

    // Method to check if a number is a Deficient Number
    public static boolean isDeficientNumber(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) { // Exclude the number itself
            if (num % i == 0) {
                sum += i;
            }
        }
        return sum < num;
    }

    // Method to check if a number is a Strong Number
    public static boolean isStrongNumber(int num) {
        int originalNum = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += factorial(digit);
            num /= 10;
        }
        return sum == originalNum;
    }

    // Helper method to calculate factorial of a digit
    private static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Method to count the digits in a number
    public static int countDigits(int num) {
        return String.valueOf(num).length();
    }

    // Method to store digits of a number in an array
    public static int[] getDigitsArray(int num) {
        String numStr = String.valueOf(num);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0';
        }
        return digits;
    }

    // Method to check if a number is Prime
    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    // Method to check if a number is a Neon Number
    public static boolean isNeonNumber(int num) {
        int square = num * num;
        int sum = sumOfDigits(square);
        return sum == num;
    }

    // Method to check if a number is a Spy Number
    public static boolean isSpyNumber(int num) {
        int sum = sumOfDigits(num);
        int product = 1;
        int[] digits = getDigitsArray(num);
        for (int digit : digits) {
            product *= digit;
        }
        return sum == product;
    }

    // Method to check if a number is an Automorphic Number
    public static boolean isAutomorphicNumber(int num) {
        int square = num * num;
        String numStr = String.valueOf(num);
        String squareStr = String.valueOf(square);
        return squareStr.endsWith(numStr);
    }

    // Method to check if a number is a Buzz Number
    public static boolean isBuzzNumber(int num) {
        return num % 7 == 0 || num % 10 == 7;
    }

    // Method to reverse the digits array
    public static int[] reverseDigitsArray(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    // Method to compare two arrays and check if they are equal
    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    // Method to check if a number is a Palindrome
    public static boolean isPalindrome(int num) {
        int[] digits = getDigitsArray(num);
        int[] reversed = reverseDigitsArray(digits);
        return areArraysEqual(digits, reversed);
    }

    // Method to check if a number is a Duck Number using digits array
    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) { // Skip first digit
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }

    // Method to check if a number is an Armstrong Number
    public static boolean isArmstrong(int num) {
        int sum = 0, originalNum = num;
        int[] digits = getDigitsArray(num);
        int power = digits.length;
        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }
        return sum == originalNum;
    }

    // Method to find the largest and second largest digits in the number
    public static void findLargestAndSecondLargest(int num) {
        int[] digits = getDigitsArray(num);
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }
        System.out.println("Largest Digit: " + largest);
        System.out.println("Second Largest Digit: " + secondLargest);
    }

    // Method to find the smallest and second smallest digits in the number
    public static void findSmallestAndSecondSmallest(int num) {
        int[] digits = getDigitsArray(num);
        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }
        System.out.println("Smallest Digit: " + smallest);
        System.out.println("Second Smallest Digit: " + secondSmallest);
    }

    // Method to find the sum of the digits of a number
    public static int sumOfDigits(int num) {
        int sum = 0;
        int[] digits = getDigitsArray(num);
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Method to find the sum of the squares of the digits of a number
    public static int sumOfSquaresOfDigits(int num) {
        int sum = 0;
        int[] digits = getDigitsArray(num);
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    // Method to check if a number is a Harshad Number
    public static boolean isHarshadNumber(int num) {
        int sum = sumOfDigits(num);
        return num % sum == 0;
    }

    // Method to find the frequency of each digit in the number
    public static int[][] digitFrequency(int num) {
        int[] digits = getDigitsArray(num);
        int[][] freq = new int[10][2];

        for (int i = 0; i < 10; i++) {
            freq[i][0] = i;
            freq[i][1] = 0;
        }

        for (int digit : digits) {
            freq[digit][1]++;
        }
        return freq;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int[] digits = getDigitsArray(num);

        System.out.println("Number of digits: " + countDigits(num));
        System.out.println("Is Duck Number? " + isDuckNumber(digits));
        System.out.println("Is Armstrong Number? " + isArmstrong(num));
        System.out.println("Is Palindrome? " + isPalindrome(num));

        findLargestAndSecondLargest(num);
        findSmallestAndSecondSmallest(num);

        System.out.println("Sum of digits: " + sumOfDigits(num));
        System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits(num));
        System.out.println("Is Harshad Number? " + isHarshadNumber(num));

        System.out.println("Is Prime Number? " + isPrime(num));
        System.out.println("Is Neon Number? " + isNeonNumber(num));
        System.out.println("Is Spy Number? " + isSpyNumber(num));
        System.out.println("Is Automorphic Number? " + isAutomorphicNumber(num));
        System.out.println("Is Buzz Number? " + isBuzzNumber(num));

        int[][] frequency = digitFrequency(num);
        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i][1] > 0) {
                System.out.println("Digit " + frequency[i][0] + ": " + frequency[i][1] + " times");
            }
        }

        int[] factors = findFactors(num);
        System.out.print("Factors of " + num + ": ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        // Find greatest factor
        System.out.println("Greatest proper factor: " + findGreatestFactor(factors));

        // Find sum and product of factors
        System.out.println("Sum of factors: " + sumOfFactors(factors));
        System.out.println("Product of factors: " + productOfFactors(factors));

        // Find product of cubes of factors
        System.out.println("Product of cubes of factors: " + productOfCubesOfFactors(factors));

        // Check different number properties
        System.out.println("Is Perfect Number? " + isPerfectNumber(num));
        System.out.println("Is Abundant Number? " + isAbundantNumber(num));
        System.out.println("Is Deficient Number? " + isDeficientNumber(num));
        System.out.println("Is Strong Number? " + isStrongNumber(num));

    }
}
