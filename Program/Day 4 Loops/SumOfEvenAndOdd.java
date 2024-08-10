/*
 * WAJP that reads a set of integers, and then prints the sum of the even and odd integers.
 */

import java.util.Scanner;

public class SumOfEvenAndOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your starting of elements:");
        long start = sc.nextLong();
        System.out.println("Enter Your ending of elements: ");
        long end = sc.nextLong();
                
        long sum_even =  0;
        long sum_odd = 0;
        
        for (long i=start ; i<=end ; i++) {
            if (i % 2 ==  0)
                sum_even += i;
            else
                sum_odd += i;
        }
        
        System.out.println("Sum of Even numbers is :"+sum_even );
        System.out.println("Sum of Odd numbers is :"+sum_odd );
    }
    
 }