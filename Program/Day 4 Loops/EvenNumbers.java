import java.util.Scanner;

public class EvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your starting number : ");
        int start = sc.nextInt();
        System.out.print("Enter your ending number : ");
        int end = sc.nextInt();

        evenNumbers(start, end);

    }
    // static void evenNumbers(int start, int end){
    // for(int i = start;i<=end;i++){
    // if(i%2==0){
    // System.out.print(i+", ");
    // }
    // }
    // }

    static void evenNumbers(int start, int end) {
        if (start > end) {
            return;
        }

        if (start % 2 == 0) {
            System.out.print(start + ", ");
        }
        evenNumbers(start + 1, end);
    }
}
