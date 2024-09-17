public class Problem2 {
    public static void main(String[] args) {
        int n = 50;
        problem2(n);
    }
    public static void problem2(int n){
        if(n==1){
            System.out.print(n+" ");
            return;
        }
        problem2(n-1);
        System.out.print(n+" ");
    }
}
