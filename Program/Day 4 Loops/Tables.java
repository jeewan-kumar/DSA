import java.util.Scanner;

public class Tables {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your table number : ");
        int table = sc.nextInt();
        System.out.print("Enter your starting number : ");
        int start = sc.nextInt();
        System.out.print("Enter your ending number : ");
        int end = sc.nextInt();

        table(table, start, end);
    }

    // static void table (int table, int start, int end){
    //     for(int i=start; i<=end; i++){
    //         System.out.println(table+" * "+i+ " = "+(table*i));
    //     }
    // }

    static void table (int table, int start, int end){
        if(start > end)
        {
            return;            
        }
        System.out.println(table+" * "+start+ " = "+(table*start));
        table(table, start+1, end);
    }
}
