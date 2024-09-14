public class FloydsTriangle {
   public static void main(String[] args) {
    int start = 1;
    int end = 5;
    int count = start;
    for(int i = start ; i <=end; i++){
        for(int j = start; j<=i;j++){
            System.out.print(count+" ");
            count++;
        }
        System.out.println();
    }
   } 
}
