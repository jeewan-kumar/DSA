import java.util.Scanner;

public class PrintNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your starting Number : ");
        int start = sc.nextInt();
        System.out.print("Enter your Ending number : ");
        int end = sc.nextInt();
        for(int i=start; i<=end; i++){
            System.out.print(i+" ");
        }

    }
}
