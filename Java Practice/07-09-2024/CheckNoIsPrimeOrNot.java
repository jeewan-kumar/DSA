import java.util.Scanner;
public class CheckNoIsPrimeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check if it is prime: ");
        long num = sc.nextLong();
        if(isPrimeOrNot(num)){
            System.out.print(num+" is a prime no");
        } else {
            System.out.print(num + " is not a prime no.");
        }
    }

    static boolean isPrimeOrNot(long num){
        if(num == 1){
            return false;
        }
        if(num == 2 || num ==3){
            return true;
        }

        for(long i =2;i<=num/2 ; i++){
            if(num%i==0){
                return false;
            }
        }
        return true;
    }
}
