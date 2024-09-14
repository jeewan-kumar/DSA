public class InvertedStar {
    public static void main(String[] args) {
        int start=1;
        int end = 5;
        for(int i = start; i<= end; i++){
            for(int j = start; j<=end-i+1;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
    }
}
