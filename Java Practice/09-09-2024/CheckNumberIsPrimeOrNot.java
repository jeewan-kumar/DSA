public class CheckNumberIsPrimeOrNot {
    public static void main(String[] args) {
        int n = 19;
        
        if(isPrime(n)){
            System.out.println(n +" is Prime number");
        } else {
            System.out.println(n + " not Prime number");
        }
    }
    static boolean isPrime(int n){
        if(n == 1)
        return false;
        if(n == 2 || n==3)
        return true;
        for(int a = 3; a<=Math.sqrt(n); a++){
            if(n%a==0){
                return false;
            }
        }
       
        return true;
    }
}
