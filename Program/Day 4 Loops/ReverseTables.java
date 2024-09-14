import java.util.Scanner;

public class ReverseTables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your table number : ");
        int table = sc.nextInt();
        System.out.print("Enter your starting number : ");
        int start = sc.nextInt();
        System.out.print("Enter your ending number : ");
        int end = sc.nextInt();

        reverseTable(table, start, end);
    }

    // static void reverseTable(int table, int start, int end){
    //     for(int i=end; i>= start; i--){
    //         System.out.println(table+" * "+i+ " = "+(table*i));
    //     }
    // } 

    static void reverseTable(int table, int start, int end){
        if(end < start){
            return;
        }
        System.out.println(table+" * "+end+ " = "+(table*end));
        reverseTable(table, start, end-1);
    }

}
