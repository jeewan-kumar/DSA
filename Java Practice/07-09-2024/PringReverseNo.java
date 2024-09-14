import java.util.Scanner;

public class PringReverseNo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your no are you try to reverse : ");
        long num = sc.nextLong();
        long rev = 0;
        for(long i = num; i!=0; i/=10){
            long rem = i % 10;
            rev = (rev*10)+rem;
        }
        System.out.println(rev);
    }
}
