import java.util.Scanner;

public class OddNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your starting Character : ");
        int start = sc.nextInt();
        System.out.print("Enter your ending Character : ");
        int end = sc.nextInt();

        oddNumber(start, end);
    }

    static void oddNumber(int start, int end) {
        System.out.print("Odd numbers are : ");
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                System.out.print(i + ", ");
            }
        }
    }
}
