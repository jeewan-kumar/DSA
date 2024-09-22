public class SumOfFirstNn {
    public static void main(String[] args) {
        int n = 10;
        // System.out.println(sumOfNatural(n));
        sumOfNatural(n);
        System.out.println("Sum of first " + n + " natural numbers is: " + total);
    }
    // static int sumOfNatural(int n){
    //     if(n==0){
    //         return 0;
    //     }
       
    //     return n+sumOfNatural(n-1);
        
    // }

    static int total = 0;

    static void sumOfNatural(int n) {
        if (n == 0) {
            System.out.println(total);
            return;
        }
        total += n;
        sumOfNatural(n - 1);
    }

}
