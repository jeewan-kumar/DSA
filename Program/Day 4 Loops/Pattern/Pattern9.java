// import java.util.Scanner;

// public class Pattern9 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your row : ");
//         int row = sc.nextInt();
//         for(int i = 1; i<=row; i++){
//             for(int j=1; j<=i-1;  j++){               
//                 System.out.print(" ");                 
//             }
//             for(int k=1;k<=2*(row-i)-1;k++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int row = sc.nextInt();

        for (int i = 0; i < row; i++) {
            // Combined loop to handle both spaces and stars
            for (int j = 0; j < row + (row - i - 1); j++) {
                if (j < i) {
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}
