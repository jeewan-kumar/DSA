import java.util.Scanner;

public class SumOfFirstNatural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Starting number : ");
        int start = sc.nextInt();
        System.out.print("Enter your Ending number : ");
        int end = sc.nextInt();
        int sum = 0;

        for(int i=start; i<=end; i++){
            sum = sum + i;
        }
        System.out.print("sum of number : "+ sum);

    }
}
