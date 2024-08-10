/*
 * * * * *
 * * * *
 * * *
 * *
 * 
 */
public class Patter3 {
    public static void main(String[] args) {
        int n = 5;
        String s = "*";
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        /* Second way */
        for (int i = n; i >= 1; i--) {
            System.out.println(s.repeat(i));
        }
        
    }
}
