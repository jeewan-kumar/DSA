import java.util.Scanner;

public class AreaOfSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the side of the square: ");
        int num = sc.nextInt();
        int area = num * num;
        System.out.println("Area of a Square is : "+area);
    }
    
}
