/*
 * 
 * *
 * * *
 * * * *
 * * * * *
 */
public class Patter1 {
    public static void main(String[] args) {
        String s = "* ";
        int n = 5; // size of pattern
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        /* second way to write  */
        for (int i = 1; i <= n; i++) {
            System.out.println(s.repeat(i));
        }
    }
}
