import java.util.Scanner;

/**
 * Print_Natural from 1 to n
 */
public class Print_Natural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your staring number: ");
        long start = sc.nextLong();
        System.out.println("Enter you end point the natural number: ");
        long end = sc.nextLong();

        if (end > start) {
            for (long i = start; i <= end; i++) {
                System.out.println(i);
            } 
        } else {
            System.out.println("Check you enter no. enter no is wrong");
        }

        
    }
}