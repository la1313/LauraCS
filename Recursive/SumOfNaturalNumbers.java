public class SumOfNaturalNumbers {

    // Recursive method to calculate the sum of first n natural numbers
    public static int sum(int n) {
        if (n == 1) {
            return 1;  // Base case
        } else {
            return n + sum(n - 1);  // Recursive case
        }
    }

    public static void main(String[] args) {
        int number = 10;  // Example: Sum of first 10 natural numbers
        int result = sum(number);

        System.out.println("Sum of first " + number + " natural numbers is: " + result);
    }
}
