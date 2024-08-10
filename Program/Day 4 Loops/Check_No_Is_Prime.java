import java.util.Scanner;

public class Check_No_Is_Prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Check the number is prine or not: ");
        long check = sc.nextLong();
        if (check == 2 || check == 3) {
            System.out.println("prime number");
        } else {
            boolean isprime = true;
            for (int i = 2; i <= Math.sqrt(check); i++) {
                if (check % i == 0) {
                    isprime = false;
                    break;
                }

            }
            if (isprime == true) {
                System.out.println("n is prime");
            } else {
                System.out.println("n is not prime");
            }
        }
        
    }
}
