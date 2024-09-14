// import java.util.Scanner;

// public class ReverseTheDigits {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your Digit : ");
//         int num = sc.nextInt();
//         int tem = num;
//         int result = 0;
//         for(; num>=1; num/=10){
//             int rem = num%10;
//             result = result*10+rem;
//         }
//         System.out.println(tem+" Reverse Value : "+result);
//     }
// }

import java.util.Scanner;

/**
 * ReverseTheDigits
 */
public class ReverseTheDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name : ");
        String name = sc.nextLine();

        String rev = "";
        for(int i = name.length()-1;i>=0;i--){
            rev+=name.charAt(i);
        }
        System.out.println(name+" reverse name : "+rev);
    }
}