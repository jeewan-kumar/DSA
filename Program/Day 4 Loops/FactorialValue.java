import java.util.Scanner;

public class FactorialValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int num = sc.nextInt();
        long factorialValue = 1;
        for(int i= num; i>=1; i--){
            factorialValue*=i;
        }
        System.out.println(num +" Factorial Value are : "+factorialValue);
    }
}
