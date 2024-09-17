class Problem1{
    public static void main(String[] args) {
        int n = 50;
        problem1(n);
    }
    public static void problem1(int n){
        if(n < 1){
            return;
        }
        System.out.print(n);
        if(n>1){
            System.out.print(", ");
        }
        problem1(n-1);
    }
}