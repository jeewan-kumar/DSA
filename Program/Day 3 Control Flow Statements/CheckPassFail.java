import java.util.Scanner;

public class CheckPassFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your markes : ");
        int markes = sc.nextInt();
        if(markes>= 100){
            System.out.println("A+");
        } else if (markes >= 75) {
            System.out.println("A");
        } else if (markes >= 60){
            System.out.println("B+");
        } else if (markes >= 50) {
            System.out.println("B");
        } else if (markes >= 40) {
            System.out.println("C+");
        }  else if (markes >= 30) {
            System.out.println("C");
        }   else  {
            System.out.println("Fail");
        }
    }
}
