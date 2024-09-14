public class InvertedHalfPyramid {
    public static void main(String[] args) {
        int start = 1;
        int end = 10;
        for(int i = start; i<= end ; i++){
            for(int j = start; j<= end-i+1;j++){
                System.out.print(j+ " ");
            }
            System.out.println();
        }
    }
}
