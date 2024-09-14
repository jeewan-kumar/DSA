// import java.util.Scanner;

// public class ReverseOfaNumber {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your Number : ");
//         int num = sc.nextInt();
//         int result = 0;
//         for(; num > 0; num /= 10){
//             int rem = num % 10;
//             result = result * 10 + rem;
//         }
//         System.out.print("Reverse number : "+ result);
//     }
// }

import java.util.Scanner;

/**
 * ReverseOfaNumber
 */
public class ReverseOfaNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");       
        String num = sc.nextLine();
        String reverse = "";
        for(int i = num.length()-1;i>=0;i--){
            reverse += num.charAt(i);
        }
        System.out.print("Reverse number : "+reverse);
    }
}