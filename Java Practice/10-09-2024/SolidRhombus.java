public class SolidRhombus {
    public static void main(String[] args) {
        int n = 5;
        for(int i = 1; i<=n; i++){
             
            for(int l = 1;l<=n-i;l++){
                System.out.print("  ");
            }   
            for(int k = 1;k<=n;k++){
                System.out.print("* ");                
            }
            System.out.println();
           
        }
    }
}
