// import java.util.Scanner;

// public class Pattern8 {
//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         System.out.println("Enter your row : ");
//         int row = sc.nextInt();

//         for(int i=1; i<=row; i++){
//             for(int j=row-i; j>=1;j--){
//                 System.out.print(" ");
//             }
//             for(int k=1;k<=i;k++){
//                 System.out.print("*");
//             }
//             for(int l=2;l<=i;l++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

/*Second way */

import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your row : ");
        int row = sc.nextInt();
        for(int i=1; i<=row; i++){
            for(int j=1; j<=row+i-1;j++){
                if(j <= row-i){
                    System.out.print(" ");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
    
}