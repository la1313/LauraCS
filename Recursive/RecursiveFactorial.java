import java.util.Scanner;

public class RecursiveFactorial {

    // Method to calculate factorial using recursion
    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;  // Base case: factorial of 0 or 1 is 1
        } else {
            return n * factorial(n - 1);  // Recursive call
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueInput = true;  // flag to control the loop

        // Loop to repeatedly ask for numbers to calculate factorial
        while (continueInput) {
            // Ask for a number to calculate factorial
            System.out.print("Enter a number to calculate its factorial: ");
            int number = scanner.nextInt();

            // Calculate the factorial of the given number
            long result = factorial(number);

            // Display the result
            System.out.println("Factorial of " + number + " is: " + result);

            // Ask if the user wants to input another number
            System.out.print("Do you want to input another number? (yes/no): ");
            String response = scanner.next();

            // If the user says no, stop the loop
            if (!response.equalsIgnoreCase("yes")) {
                continueInput = false;
            }
        }

        // Close the scanner resource
        scanner.close();
        System.out.println("Exiting the program. Goodbye!");
    }
}
