public class BinomialCofficient {
    public static void main(String[] args) {
        int n = 5;
        int r = 2;
        int result = 0;
        result =  factorial(n)/ (factorial(r)*factorial(n - r));
        System.out.println("Binomial Coefficient C(" + n + "," + r + ") = " + result);
    }

    public static int factorial(int num) {
        for (int i = 1; i < num; i++) {
            num *= i;
        }
        return num;
    }
}
