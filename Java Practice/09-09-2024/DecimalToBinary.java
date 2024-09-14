public class DecimalToBinary {
    public static void main(String[] args) {
        int a = 12;
        System.out.println(decimal(a));
    }

    static long decimal(int a){
        long result = 0;
        int base = 1;

        for(int n = a; n>0;n/=2){
            int rem = n % 2;
            result += rem*base;
            base *=10;
        }
        return result;
    }
    
    
}
