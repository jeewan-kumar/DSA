public class Problem3 {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(problem3(n));
    }
    static int problem3(int n){
        if(n==0){
            return 1;
        }
        problem3(n-1);
        int fn = n* problem3(n -1);
        return fn;
    }
}
