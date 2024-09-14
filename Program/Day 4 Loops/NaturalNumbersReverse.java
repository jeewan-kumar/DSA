import java.util.Scanner;

public class NaturalNumbersReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your starting number: ");
        int start = sc.nextInt();
        System.out.print("Enter your ending number: ");
        int end = sc.nextInt();
        printNumbers(start, end);
    }

    // public static void printNumbers(int start, int end){
    //    for(int i = end; i>=start;i--){
    //     System.out.print(i+" ");
    //    }
    // }

    public static void printNumbers(int start, int end){
       if(end<start){
        return;
        }
        System.out.print(end+" ");
        printNumbers(start, end-1);
     }
}
