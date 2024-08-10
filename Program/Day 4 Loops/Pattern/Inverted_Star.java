package Pattern;

import java.util.Scanner;

/*
 * * * * *
 * * * *
 * * *
 * *
 * 
 */
public class Inverted_Star {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter yor row: ");
        int num = sc.nextInt();
        System.out.print("Enter you symbole to print : ");
        String string = sc.next();
        // for (int i = 1; i <= num; i++) {
        //     for (int j = 1; j <= (num-i+1); j++) {
        //         System.out.print(string);
        //     }
        //     System.out.println();
        // }

        /*for (int i = num; i >= 1; i--) {
            System.out.println(string.repeat(i));
        }*/

        for(int i =  num; i>=1 ; i--){  
            for (int j = 1; j <= i; j++) {
                System.out.print(string + " ");
            }
            System.out.println();
        }
        
    }
}
