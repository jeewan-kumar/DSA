import java.util.Scanner;

public class PrintAllPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a starting number: ");
        int startNum = sc.nextInt();
        System.out.print("Enter a Ending Range number:");
        int endNum = sc.nextInt();
        rangeOfPrime(startNum,endNum);
    }

    public static void rangeOfPrime(int a, int b) {
        System.out.println("Range of Prime number Starting point "+a+" Ending point "+b+" : ");
        for (int i = a; i <= b; i++) {
            if (prime(i)) {
                System.out.print(i + " ");
            }            
        }
    }

    public static boolean prime(int i) {
        if (i == 1)
            return false;
        if (i == 2)
            return true;
        for (int j = 2; j <= i/2; j++) {
            if (i % j == 0) {
                return false;
            }
        }
        return true;
    }
}
