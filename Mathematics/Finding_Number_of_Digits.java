/*
 * Finding_Number_of_Digits in a number
*/
import java.util.Scanner;
public class Finding_Number_of_Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        long num = sc.nextLong();
        //countDigit(num);
        System.out.println("Iterative Solution: "+countDigit(num));
        System.out.println("Recursive Solution: " + recCountDigit(num));
        System.out.println("Logarithmic Solution: "+logCountDigit(num));
    }
    /*Iterative Solution */
    public static long countDigit(long n) {
        int count = 0;
        while (n != 0) {
            n = n / 10;
            count++;
        }
        return count;
    }
    /* Recursive solution */
    public static int recCountDigit(long n) {
        if (n == 0)
            return 0;
        return 1 + recCountDigit(n / 10);
    }
    
    /* logarithmic solution */
    public static long logCountDigit(long n) {
        // if (n <= 0) {
        //     return 0;
        // }
        return (long)Math.floor(Math.log10(n)) + 1;
    }   
    
}