// import java.util.Scanner;

// public class NaturalNumbers {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter your starting number : ");
//         int start = sc.nextInt();
//         System.out.print("Enter your ending number : ");
//         int end = sc.nextInt();
//         naturalNumber(start,end);
//     }

//    static void naturalNumber(int start, int end){
//         for(int i = start; i<=end ; i++){
//             System.out.print(i+ " ");
//         }
//     }
// }

import java.util.Scanner;

public class NaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your starting number: ");
        int start = sc.nextInt();
        System.out.print("Enter your ending number: ");
        int end = sc.nextInt();
        printNumbers(start, end);
    }

    static void printNumbers(int start, int end) {
        if (start > end) {
            return;
        }
        System.out.print(start + " ");
        printNumbers(start + 1, end);
    }
}
