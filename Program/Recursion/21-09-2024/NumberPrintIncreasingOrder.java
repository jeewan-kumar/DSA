
public class NumberPrintIncreasingOrder {
    public static void main(String[] args) {
        int n = 10;
        increasingOrder(n);
    }
    public static void increasingOrder(int n){
        if(n == 0){
           return;
        }
        System.out.print(n+" ");
       
        increasingOrder(n-1);
        
        System.out.print(n+" ");
        
    }
}