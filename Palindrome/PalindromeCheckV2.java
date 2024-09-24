import java.util.Scanner;

public class PalindromeCheckV2 {

    // Recursive method to check if a string is a palindrome
    public static boolean isPalindrome(String str, int start, int end) {
        if (start >= end) {
            return true;  // Base case: if pointers have crossed, it's a palindrome
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;  // If characters don't match, it's not a palindrome
        }
        return isPalindrome(str, start + 1, end - 1);  // Recursive case
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueInput = true;

        // Loop to repeatedly ask for string input to check for palindrome
        while (continueInput) {
            // Ask for a string to check
            System.out.print("Enter a string to check if it's a palindrome: ");
            String word = scanner.nextLine();

            // Check if the string is a palindrome
            if (isPalindrome(word, 0, word.length() - 1)) {
                System.out.println(word + " is a palindrome.");
            } else {
                System.out.println(word + " is not a palindrome.");
            }

            // Ask if the user wants to input another string
            System.out.print("Do you want to check another string? (yes/no): ");
            String response = scanner.nextLine();

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
