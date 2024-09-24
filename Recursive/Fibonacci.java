public class Fibonacci {

    // Recursive method to find the nth Fibonacci number
    public static int fibonacci(int n) {
        if (n == 0) {
            return 0;  // Base case 1
        } else if (n == 1) {
            return 1;  // Base case 2
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);  // Recursive case
        }
    }

    public static void main(String[] args) {
        int n = 10;  // Find the 10th Fibonacci number
        int result = fibonacci(n);

        System.out.println("Fibonacci number at position " + n + " is: " + result);
    }
}
