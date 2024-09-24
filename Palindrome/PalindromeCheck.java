public class PalindromeCheck {

    // Recursive method to check if a string is a palindrome
    public static boolean isPalindrome(String str, int start, int end) {
        if (start >= end) {
            return true;  // Base case
        }
        if (str.charAt(start) != str.charAt(end)) {
            return false;
        }
        return isPalindrome(str, start + 1, end - 1);  // Recursive case
    }

    public static void main(String[] args) {
        String word = "madam";

        if (isPalindrome(word, 0, word.length() - 1)) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
        }
    }
}
