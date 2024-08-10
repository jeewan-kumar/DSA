public class Half_Pyramid_With_NumberPattern {
    public static void main(String[] args) {
        int n = 5;
        
        for (int i = 1; i <= n; i++) {
            int k = 1;
            for (int j = 5; j >= i; j--) {
                
                System.out.print(k);
                k++;
            }
            System.out.println();
        }
    }
}
