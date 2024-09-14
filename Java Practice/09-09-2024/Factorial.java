class Factorial {
    public static void main(String[] args) {
        int a = 5;
        factorial(a);
    }
    static void factorial(long a){
        long fac = 1;
        for(int i = 1; i<=a; i++){
            fac*=i;
        }
        System.out.println(fac);
    }
}