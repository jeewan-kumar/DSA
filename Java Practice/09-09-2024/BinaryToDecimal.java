public class BinaryToDecimal {
    public static void main(String[] args) {
        long a = 101;
        System.out.println(decimal(a));
    }    
    static  int decimal(long a){
        int total =0;
        int base = 1;

        for(long n = a; n>0;n/=10){
            long rem = n % 10; 
            total += rem*base;
            base*=2;

        }
        return total;
    }
}
