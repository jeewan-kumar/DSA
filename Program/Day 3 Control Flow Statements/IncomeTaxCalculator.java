import java.util.Scanner;

public class IncomeTaxCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your income: ");
        int income = sc.nextInt();
        double tex = 0;
         if(income<500000){
            tex = 0;
            System.out.println("Total tex : "+tex);
         } else if(income >= 500000 && income <= 1000000){
            tex = (income - 500000) * 0.2;
            System.out.println("Total tex : "+ tex);
         } else {
            tex = (income - 500000) * 0.3;
            System.out.println("Total tex : "+ tex);
            
         }
    }
}
