import java.util.Scanner;

public class AlphabetsAtoZ {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.print("Enter your starting Character : ");
        char start = sc.next().charAt(0);
        System.out.print("Enter your ending Character : ");
        char end = sc.next().charAt(0);

        alphabetsAtoZ(start, end);
    }
    static void alphabetsAtoZ(char start, char end){
        if(start > end){
            return;
        }
        System.out.print(start+ ", ");
        alphabetsAtoZ((char)(start + 1), end);
    }

    // static void alphabetsAtoZ(char start, char end){
    //     int count =0;
    //    for(char i = start; i<=end; i++){
    //     System.out.print(i+ ", ");
    //     count++;
    //    }  
    //    System.out.println("Total count : "+ count);      
        
    // }
}
