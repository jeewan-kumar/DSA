package Pattern;

import java.util.Scanner;

/*
 *
 * *
 * * *
 * * * *
 */
public class Star_Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you row: ");
        int num = sc.nextInt();
        System.out.print("Enter your Symbole: ");
        String string = sc.next();
        for (int i=1; i <= num; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(string);
            }
            System.out.println();
        }
    }
}
