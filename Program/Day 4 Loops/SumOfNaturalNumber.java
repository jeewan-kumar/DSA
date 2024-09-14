import java.util.Scanner;

public class SumOfNaturalNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your starting number : ");
        int start = sc.nextInt();
        System.out.print("Enter your ending number : ");
        int end = sc.nextInt();

        sumOfNaturalNumber(start, end);
    }
    static void sumOfNaturalNumber(int start, int end){
        long sum = 0;
        for(int i=start;i<=end;i++){
            sum += i; 
        }
        System.out.println("Total sum of Natural Number : "+sum);
    }
}
