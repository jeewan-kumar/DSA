/**
 * GCD
 */
public class GCD {
    public static void main(String[] args) {
        int num1 = 6;
        int num2 = 9;
        int gcd = 1; // Initialize gcd to 1, since gcd can't be zero

        // Find the smaller number between num1 and num2
        int smaller = Math.min(num1, num2);

        // Iterate from 1 to the smaller number
        for (int i = 1; i <= smaller; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i; // Update gcd whenever i divides both num1 and num2
            }
        }

        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd);
    }
}
