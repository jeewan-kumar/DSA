import java.util.Scanner;

class PrimeNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of integers to check: ");
        int n = sc.nextInt();
        primeNumber(sc,n);
    }
    static void primeNumber(Scanner sc,int n){
        for(int i = 0;i<n;i++){
            System.out.print("Enter a number: ");
            int m = sc.nextInt();
            if(isPrime(m)){
                System.out.println(m + " is a Prime Number");
            } else {
                System.out.println(m + " is Not a Prime Number");
            }
        }
    }
    static boolean isPrime (int num){
        if(num <= 1) return false;
        for(int k = 2;k<= Math.sqrt(num);k++){
            if(num%k==0){
                return false;
            }
        }
        return true;
    }
}