public class BinomialCoefficient {
    public static void main(String[] args) {
        int n = 5;
        int r = 2;
        System.out.println("Binomial Cofficient : " +binCoff( n, r));
    }

    static int binCoff(int a , int b){
        int fac_n = factorial(a);
        int fac_r = factorial(b);
        int fac_nmr = factorial(a-b);
        System.out.println(fac_n+" "+ fac_r +" "+fac_nmr);
        int bc = fac_n/(fac_r*fac_nmr);
        return bc;
    }

    static int factorial(int a){
        int fac = 1;
        for(int n = 1; n<=a ; n++){
            fac*=n;
        }
        return fac;

    }

}
