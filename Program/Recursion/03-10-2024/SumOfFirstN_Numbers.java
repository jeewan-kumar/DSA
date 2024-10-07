import java.util.Scanner;

public class SumOfFirstN_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your sum of n number: ");
        int n = sc.nextInt();
        System.out.println(sumOfFirstN_Numbers(n));
    }
    static int sumOfFirstN_Numbers(int n){
        if(n==0){
            return 0;
        }    
        return n + sumOfFirstN_Numbers(n-1);
    }
}