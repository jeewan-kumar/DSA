import java.util.Scanner;

public class ReverseAlphabets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your starting Character : ");
        char start = sc.next().charAt(0);
        System.out.print("Enter your ending Character : ");
        char end = sc.next().charAt(0);

        reverseAlphabets(start, end);
    }
    static void reverseAlphabets(char start , char end){
        for(char i = end; i>=start;i--){
            System.out.print(i+", ");
        }
    }
}
