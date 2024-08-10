import java.util.Scanner;

public class CheckBodyTemperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your body temperature : ");
        double temp = sc.nextDouble();
        if(temp> 100 && temp <180){
            System.out.println("you have a fever");
        } else if(temp <= 100) {
            System.out.println(" you don't have a fever");
        } else {
            System.out.println("Temperature value seems unrealistic");
        }
    }
    
}