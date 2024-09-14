public class HalfPyramid {
    public static void main(String[] args) {
        int start =1;
        int end = 10;
        for(int i = start; i<= end; i++){
            for(int j = start; j<=i;j++){
                System.out.print(j+" ");
            }
            System.err.println();
        }
    }
}
