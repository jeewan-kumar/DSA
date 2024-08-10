import java.util.Scanner;

public class PrintThreeLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three number : ");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int num3 = sc.nextInt();

        if(num1 >= num2 && num1 >= num3){
            System.out.println("1 Largest number is : "+num1);
        } else if(num2 >= num1 && num2>= num3 ){
            System.out.println("2 Largest number is : "+num2);
        } else {
            System.out.println("3 Largest number is : "+num3);
        }
    }
}
