import java.util.Scanner;

public class ReverseWordWithAsterisks {

    // Recursive method to reverse the word with asterisks between letters
    public static String reverseWithAsterisks(String word) {
        // Base case: if the word has only one letter, return it
        if (word.length() == 1) {
            return word;
        } else {
            // Recursive case: take the last letter, add an asterisk, and then call the method for the rest of the string
            return word.charAt(word.length() - 1) + "*" + reverseWithAsterisks(word.substring(0, word.length() - 1));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueInput = true;  // flag to control the loop

        // Loop to repeatedly ask for words to reverse
        while (continueInput) {
            // Ask for a word
            System.out.print("Enter a word to reverse with asterisks: ");
            String word = scanner.nextLine();

            // Call the recursive method to reverse the word with asterisks
            String result = reverseWithAsterisks(word);

            // Display the result
            System.out.println("Reversed word with asterisks: " + result);

            // Ask if the user wants to input another word
            System.out.print("Do you want to input another word? (yes/no): ");
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
