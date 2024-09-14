import java.util.Scanner;

public class Program3InputOutput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number of Array : ");
        int n = sc.nextInt();
        int num [] = new int[n];

        for(int i = 0; i<=num.length-1;i++){
            num[i]=sc.nextInt();
        }
        System.out.print("List of number: ");
        for(int i = 0; i<=num.length-1;i++){
            System.out.print(num[i]+", ");
        }
    }
}
