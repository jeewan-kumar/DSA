import java.util.Scanner;

public class CheckNumberIsPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Number : ");
        int num = sc.nextInt();
        boolean number = true;
        for(int i=2;i<=num/2;i++){
            if(num %i==0)
            number = false;
        }

        if (number == true) {
            System.out.println(num + " number is prime");            
        } else {
            System.out.println(num + " number is not prime");     
        }
    }
}
