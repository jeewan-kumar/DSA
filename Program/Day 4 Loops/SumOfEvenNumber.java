import java.util.Scanner;

public class SumOfEvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your starting number : ");
        int start = sc.nextInt();
        System.out.print("Enter your ending number : ");
        int end = sc.nextInt();

        sumOfEvenNumber(start, end);
    }
    static void sumOfEvenNumber(int start, int end){
        int sum = 0;
        for(int i=start; i<=end; i++){
            if(i%2==0){
                sum+=i;
            }
        }
        System.out.println("Sum of even number : "+sum);
    }
}
