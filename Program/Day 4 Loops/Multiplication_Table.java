/*
 *  Write a program to print the multiplication table of a number N, entered by the user.
*/

import java.util.Scanner;

public class Multiplication_Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you table of a nuber: ");
        int num = sc.nextInt();
        System.out.println("Table of  " + num + ":");
        table(num);
    }

    static void table(int x) {
        
        for (int i = 1; i <= 10; i++) {
            int result = x * i;
            System.out.println(x+ " * "+i+" = "+result);
        }
    }
}
