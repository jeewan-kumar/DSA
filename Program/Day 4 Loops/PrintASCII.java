import java.util.Scanner;

public class PrintASCII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number, Character, Spacel symbol : ");
        char symbol = sc.next().charAt(0);
        int i = symbol;
        System.out.println(symbol+" ASCII Valure are : "+i);
    }
}
