// public class Program4Update {
//     public static void main(String[] args) {
//         int arr[] = {45,65,85,95,99};
//         for(int i = 0; i<=arr.length-1;i++){
//             System.out.print(arr[i]+", ");
//         }

//         update(arr);

//         for(int i = 0; i<=arr.length-1;i++){
//             System.out.print(arr[i]+", ");
//         }
        
//     }

//     public static void update(int arr[]){
//         for(int i = 0; i<=arr.length-1;i++){
//             arr[i]+=1;
//         }
//     }
// }

import java.util.Scanner;

class Program4Update {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=0;
        int sum=0;

        do{
            System.out.print("Enter your num : ");
            int num = sc.nextInt();
            sum+=num;
            System.out.print("Are you continue Enter 1 else enter any key: ");
             n = sc.nextInt();
        }while(n==1);
        System.out.println("Total sum of number : "+sum);
    }
}