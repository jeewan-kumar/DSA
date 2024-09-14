public class Series {
    public static void main(String[] args) {
        int start = 1;
        int num = 100;
        long fac = 0;

        for(int i = start ; i<=num;i++){
            
            fac +=i;
            System.out.print(fac+", ");
        }
    }
}
