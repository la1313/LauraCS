public class GreatestCommonDivisor {

    // Recursive method to find GCD of two numbers
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;  // Base case
        } else {
            return gcd(b, a % b);  // Recursive case
        }
    }

    public static void main(String[] args) {
        int a = 56;
        int b = 98;

        int result = gcd(a, b);

        System.out.println("GCD of " + a + " and " + b + " is: " + result);
    }
}
