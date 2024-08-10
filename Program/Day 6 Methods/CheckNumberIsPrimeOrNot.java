import java.util.Scanner;

public class CheckNumberIsPrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int num = sc.nextInt();
        if (isPrime(num))
            System.out.println(num + " is a prime number.");
        else
            System.out.println(num + " is not a prime number.");
        // if (num > 1){
        //     for(int i =2;i<=num/2;i++){
        //         if(num % i ==0){
        //            System.out.println(num + " is not a prime number.");
        //            return;
        //         }
        //     }
        //    System.out.println(num + " is a prime number.");
        // }else{
        //     System.out.println(num + " is not a prime number.");
        // }
    }

    private static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        if (n == 2)
            return true;
        for (int i = 2; i < n - 1; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
