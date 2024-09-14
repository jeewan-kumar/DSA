import java.util.Scanner;

public class SumOfOddNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your starting number : ");
        int start = sc.nextInt();
        System.out.print("Enter your ending number : ");
        int end = sc.nextInt();

        sumOfOddNumber(start, end);
    }
    static void sumOfOddNumber(int start, int end){
        int sum = 0;
        for(int i=start; i<=end; i++){
            if(i%2!=0){
                sum+=i;
            }
        }
        System.out.println("Sum of odd number : "+sum);
    }
}
