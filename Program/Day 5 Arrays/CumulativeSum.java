import java.util.Scanner;

public class CumulativeSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of list : ");
        int list = sc.nextInt();

        for(int i=1; i<=list; i++){
            System.out.print("Enter list size : ");
            int size = sc.nextInt();
            int value[] = new int[size];
            System.out.println("Enter your value : ["+(i)+"] : ");       

            for(int j = 0; j<=value.length-1;j++){
                System.out.print("Index : ["+(j+1)+"] : ");
                value[j] = sc.nextInt();
            }

            // System.out.print("The Value you are intered: ");
            // for(int k=0; k<=value.length-1;k++){
            //     System.out.print(value[k] +(k < value.length-1 ? ", " : ""));
            // }
            System.out.println();
        }
    }
    
}