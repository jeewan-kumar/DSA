public class PrintNthPrimeNo {
    public static void main(String[] args) {
        int start = 1;
        int end = 100;
        for(int a = start; a<=end; a++){
            if(isPrime(a))
            System.out.print(a+", ");
        }
    }
    static boolean isPrime(int n){
        if(n == 1)
        return false;
        if(n == 2 || n==3)
        return true;
        for(int a = 3; a<=n-1; a++){
            if(n%a==0){
                return false;
            }
        }       
        return true;
    }
}
