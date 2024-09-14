import java.util.Scanner;

public class ReadSetOfInt {
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int num;
      int choice;
      int even=0;
      int odd =0;
      

      do{
        System.out.print("Enter your number : ");
        num = sc.nextInt();
        if(num %2==0){
            even+=num;
        } else {
            odd+=num;
        }
        System.out.print("Are you continue then enter 1 else any button :");
        choice = sc.nextInt();
      } while(choice==1);
      System.out.println("sum of even no :"+even);
      System.out.println("sum of odd no :"+odd);
   } 
}
