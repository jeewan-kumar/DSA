import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your row\\coloum : ");
        int row = sc.nextInt();
        for(int i=1; i<=row;i++) {
            for(int j=row-i;j>=1;j--){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
