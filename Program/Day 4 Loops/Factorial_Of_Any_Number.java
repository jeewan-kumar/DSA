/*
 * Write a program to find the factorial of any number entered by the user.
 */

import java.util.Scanner;

public class Factorial_Of_Any_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
        int num = sc.nextInt();
        System.out.println(num + " Factorial  is " + factorial(num));
    }

    public static int factorial(int num){
        int  fact=1;
        for(int i = 1; i<=num; ++i){
            fact = fact*i;
        }
        return fact;
    }
}
