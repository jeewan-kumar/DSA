/*
 * Reverse of a number
 */

import java.util.Scanner;

public class Reverse_No {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter you rever no: ");
        long rever = sc.nextLong();
        long fina=0;
        for (long i = rever; i!=0; i/=10) {
            long rev = i % 10;
            fina = fina*10+rev;  

        }
        System.out.println(fina);
    }
}
