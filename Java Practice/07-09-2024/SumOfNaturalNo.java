import java.util.Scanner;

public class SumOfNaturalNo {
    public static void main(String[] args) {
           Scanner sc = new Scanner(System.in);
        System.out.print("Enter your starting no. : ");
        int starting = sc.nextInt();
        System.out.print("Enter your Ending no. : ");
        int ending = sc.nextInt();
        int sum = 0;

        for(int i = starting; i<= ending; i++){
            sum+=i;
        }
        System.out.print("Total sum of natural no. "+starting+" to "+ending+" = "+ sum);
    }
}
