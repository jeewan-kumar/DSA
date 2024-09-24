public class PrintXPowerN {
    public static void main(String[] args) {
        int x = 2;
        int n = 4;
        System.out.println(printXPowerN(x, n));
    }
    static double printXPowerN(int x, int n){
        if(n==0){
            return 1;
        }
        if (n < 0) {
            return 1.0 / printXPowerN(x, -n); // Handle negative powers
        }
        return x*printXPowerN(x, n-1);
    }

}
