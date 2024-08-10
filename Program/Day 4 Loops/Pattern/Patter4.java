/*
 * * * * *
 *   * * *
 *     * *
 *       * 
 */
public class Patter4 {
    public static void main(String[] args) {
        String s = "*";
        int n = 5;
           for (int i = 1; i <= n; i++) {
               for (int j = 1 ; j < i; j++) {
                   System.out.print(" ");
               }
               for (int k = i; k <= n; k++) {
                   System.out.print("*");
               }
               System.out.println();
           }
           /* second way */
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int l = 1; l <= i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }
        /* 3rd way */
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            System.out.println(s.repeat(i));
        }
    }
}
