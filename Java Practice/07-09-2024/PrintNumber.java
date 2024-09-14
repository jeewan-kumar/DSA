import java.util.Scanner;

public class PrintNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your starting no. : ");
        int starting = sc.nextInt();
        System.out.print("Enter your Ending no. : ");
        int ending = sc.nextInt();

        for(int i = starting; i<= ending; i++){
            System.out.print(i+ ", ");
        }
    }
}