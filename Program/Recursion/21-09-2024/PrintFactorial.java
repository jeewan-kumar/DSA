public class PrintFactorial {
    public static void main(String[] args) {
        int n = 5;
        printFactorial(n, 1);
        // System.out.println(printFactorial(n));
        printFactorial(n);
    }
    static void printFactorial(int n, int fac){
        if(n==0){
            System.out.println(fac);
            return;
        }
        printFactorial(n-1,fac*n );
        
    }

    // static int printFactorial(int n){
    //     if(n==0){
    //         return 1;
    //     }
    //     return n*printFactorial(n-1);
    // }
    static int m = 1;
    static void printFactorial(int n){

        if(n<=1){
                System.out.println(m);
            return;
        }
        m*=n;
        printFactorial(n-1);
    }
}
