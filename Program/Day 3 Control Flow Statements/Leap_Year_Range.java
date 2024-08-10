/*
 * Create a program that takes a range of years as input and prints all the leap years within that range.
 */

import java.util.Scanner;

public class Leap_Year_Range {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter start year: ");
        int startYear = sc.nextInt();
        System.out.print("Enter end year: ");
        int endYear = sc.nextInt();
        System.out.println("Leap years within the range" + startYear + " to " + endYear + ":");
        int sum = 0;
        for (int i = startYear; i <= endYear; i++) {
            if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0) {

                System.out.print(i + ", ");
                sum++;
            }
            
        }
        System.out.println("\nTotal leap year are : "+sum);
    }
}
